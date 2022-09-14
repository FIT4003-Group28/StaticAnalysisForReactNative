package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.ExtendedPKIXParameters;
/* loaded from: classes.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        X500Name ca;
        PublicKey cAPublicKey;
        PublicKey publicKey;
        HashSet hashSet;
        TrustAnchor trustAnchor;
        boolean z;
        int i;
        List list;
        ArrayList[] arrayListArr;
        PKIXCertPathValidatorSpi pKIXCertPathValidatorSpi;
        HashSet hashSet2;
        PKIXCertPathValidatorSpi pKIXCertPathValidatorSpi2 = this;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else if (certPathParameters instanceof PKIXExtendedParameters) {
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            }
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            int i2 = size + 1;
            ArrayList[] arrayListArr2 = new ArrayList[i2];
            for (int i3 = 0; i3 < arrayListArr2.length; i3++) {
                arrayListArr2[i3] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
            arrayListArr2[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i4 = build.isExplicitPolicyRequired() ? 0 : i2;
            int i5 = build.isAnyPolicyInhibited() ? 0 : i2;
            if (build.isPolicyMappingInhibited()) {
                i2 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                PublicKey publicKey2 = cAPublicKey;
                int i6 = i2;
                try {
                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey2);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    if (build.getTargetConstraints() != null) {
                        publicKey = publicKey2;
                        if (!build.getTargetConstraints().match((Certificate) ((X509Certificate) certificates.get(0)))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                    } else {
                        publicKey = publicKey2;
                    }
                    List certPathCheckers = build.getCertPathCheckers();
                    for (Iterator it = certPathCheckers.iterator(); it.hasNext(); it = it) {
                        ((PKIXCertPathChecker) it.next()).init(false);
                        certPathCheckers = certPathCheckers;
                    }
                    List list2 = certPathCheckers;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i7 = size;
                    int i8 = i6;
                    int i9 = i4;
                    X509Certificate x509Certificate = null;
                    int size2 = certificates.size() - 1;
                    int i10 = i5;
                    X509Certificate x509Certificate2 = trustedCert;
                    while (size2 >= 0) {
                        int i11 = size - size2;
                        int i12 = i8;
                        X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                        if (size2 == certificates.size() - 1) {
                            trustAnchor = findTrustAnchor;
                            z = true;
                        } else {
                            trustAnchor = findTrustAnchor;
                            z = false;
                        }
                        int i13 = i10;
                        List<? extends Certificate> list3 = certificates;
                        List list4 = list2;
                        HashSet hashSet5 = hashSet4;
                        int i14 = i9;
                        ArrayList[] arrayListArr3 = arrayListArr2;
                        PKIXExtendedParameters pKIXExtendedParameters2 = build;
                        TrustAnchor trustAnchor2 = trustAnchor;
                        RFC3280CertPathUtilities.processCertA(certPath, build, size2, publicKey, z, ca, x509Certificate2, pKIXCertPathValidatorSpi2.helper);
                        RFC3280CertPathUtilities.processCertBC(certPath, size2, pKIXNameConstraintValidator);
                        PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, size2, RFC3280CertPathUtilities.processCertD(certPath, size2, hashSet5, pKIXPolicyNode2, arrayListArr3, i13));
                        RFC3280CertPathUtilities.processCertF(certPath, size2, processCertE, i14);
                        if (i11 == size) {
                            i = i12;
                            list = list4;
                            arrayListArr = arrayListArr3;
                            pKIXCertPathValidatorSpi = this;
                            pKIXPolicyNode2 = processCertE;
                            i10 = i13;
                            i9 = i14;
                        } else if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, size2);
                        } else {
                            RFC3280CertPathUtilities.prepareNextCertA(certPath, size2);
                            arrayListArr = arrayListArr3;
                            PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, size2, arrayListArr, processCertE, i12);
                            RFC3280CertPathUtilities.prepareNextCertG(certPath, size2, pKIXNameConstraintValidator);
                            int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, size2, i14);
                            int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, size2, i12);
                            int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, size2, i13);
                            int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, size2, prepareNextCertH1);
                            i = RFC3280CertPathUtilities.prepareNextCertI2(certPath, size2, prepareNextCertH2);
                            int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, size2, prepareNextCertH3);
                            RFC3280CertPathUtilities.prepareNextCertK(certPath, size2);
                            int prepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, size2, RFC3280CertPathUtilities.prepareNextCertL(certPath, size2, i7));
                            RFC3280CertPathUtilities.prepareNextCertN(certPath, size2);
                            Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                hashSet2 = new HashSet(criticalExtensionOIDs);
                                hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            } else {
                                hashSet2 = new HashSet();
                            }
                            list = list4;
                            RFC3280CertPathUtilities.prepareNextCertO(certPath, size2, hashSet2, list);
                            ca = PrincipalUtils.getSubjectPrincipal(x509Certificate3);
                            try {
                                pKIXCertPathValidatorSpi = this;
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), size2, pKIXCertPathValidatorSpi.helper);
                                    AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier2.getAlgorithm();
                                    algorithmIdentifier2.getParameters();
                                    pKIXPolicyNode2 = prepareCertB;
                                    i10 = prepareNextCertJ;
                                    i7 = prepareNextCertM;
                                    publicKey = nextWorkingKey;
                                    x509Certificate2 = x509Certificate3;
                                    i9 = prepareNextCertI1;
                                } catch (CertPathValidatorException e) {
                                    e = e;
                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath, size2);
                                }
                            } catch (CertPathValidatorException e2) {
                                e = e2;
                            }
                        }
                        size2--;
                        list2 = list;
                        hashSet4 = hashSet5;
                        build = pKIXExtendedParameters2;
                        certificates = list3;
                        arrayListArr2 = arrayListArr;
                        pKIXCertPathValidatorSpi2 = pKIXCertPathValidatorSpi;
                        findTrustAnchor = trustAnchor2;
                        i8 = i;
                        x509Certificate = x509Certificate3;
                    }
                    HashSet hashSet6 = hashSet4;
                    PKIXExtendedParameters pKIXExtendedParameters3 = build;
                    TrustAnchor trustAnchor3 = findTrustAnchor;
                    ArrayList[] arrayListArr4 = arrayListArr2;
                    List list5 = list2;
                    int i15 = size2 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i15, RFC3280CertPathUtilities.wrapupCertA(i9, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i15, list5, hashSet);
                    X509Certificate x509Certificate4 = x509Certificate;
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters3, initialPolicies, i15, arrayListArr4, pKIXPolicyNode2, hashSet6);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor3, wrapupCertG, x509Certificate4.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, size2);
                } catch (CertPathValidatorException e3) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e3, certPath, -1);
                }
            } catch (IllegalArgumentException e4) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e4, certPath, -1);
            }
        } catch (AnnotatedException e5) {
            throw new CertPathValidatorException(e5.getMessage(), e5, certPath, certificates.size() - 1);
        }
    }
}
