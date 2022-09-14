package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.style.BCStyle;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.NameConstraints;
import org.spongycastle.asn1.x509.PolicyInformation;
import org.spongycastle.jcajce.PKIXCRLStoreSelector;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        GeneralName[] generalNameArr;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint == null) {
                return;
            }
            if (issuingDistributionPoint.getDistributionPoint() != null) {
                DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                if (distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        arrayList.add(generalName);
                    }
                }
                if (distributionPoint2.getType() == 1) {
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    try {
                        Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                        while (objects.hasMoreElements()) {
                            aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                        }
                        aSN1EncodableVector.add(distributionPoint2.getName());
                        arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                    } catch (Exception e) {
                        throw new AnnotatedException("Could not read CRL issuer.", e);
                    }
                }
                if (distributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] generalNameArr2 = null;
                    if (distributionPoint3.getType() == 0) {
                        generalNameArr2 = GeneralNames.getInstance(distributionPoint3.getName()).getNames();
                    }
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            generalNameArr = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            generalNameArr = new GeneralName[1];
                            try {
                                generalNameArr[0] = new GeneralName(X500Name.getInstance(PrincipalUtils.getEncodedIssuerPrincipal(obj).getEncoded()));
                            } catch (Exception e2) {
                                throw new AnnotatedException("Could not read certificate issuer.", e2);
                            }
                        }
                        generalNameArr2 = generalNameArr;
                        for (int i = 0; i < generalNameArr2.length; i++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(generalNameArr2[i].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            generalNameArr2[i] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (generalNameArr2 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= generalNameArr2.length) {
                                break;
                            } else if (arrayList.contains(generalNameArr2[i2])) {
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!z) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                } else if (distributionPoint.getCRLIssuer() == null) {
                    throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                } else {
                    GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= names.length) {
                            break;
                        } else if (arrayList.contains(names[i3])) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (!z) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                }
            }
            try {
                BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                if (obj instanceof X509Certificate) {
                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                        throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                    }
                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                        throw new AnnotatedException("End CRL only contains CA certificates.");
                    }
                }
                if (!issuingDistributionPoint.onlyContainsAttributeCerts()) {
                    return;
                }
                throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
            } catch (Exception e3) {
                throw new AnnotatedException("Basic constraints extension could not be decoded.", e3);
            }
        } catch (Exception e4) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        boolean z;
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z2 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                z = false;
                for (int i = 0; i < names.length; i++) {
                    if (names[i].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z = true;
                            }
                        } catch (IOException e) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                        }
                    }
                }
                if (z && !z2) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (!z) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
            } else {
                z = PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            }
            if (z) {
                return;
            }
            throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
        } catch (IOException e2) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) {
        int i;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            try {
                Collection findCertificates = CertPathValidatorUtilities.findCertificates(build, pKIXExtendedParameters.getCertificateStores());
                findCertificates.addAll(CertPathValidatorUtilities.findCertificates(build, pKIXExtendedParameters.getCertStores()));
                findCertificates.add(x509Certificate);
                Iterator it = findCertificates.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            PKIXCertPathBuilderSpi pKIXCertPathBuilderSpi = new PKIXCertPathBuilderSpi();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage != null && (keyUsage.length < 7 || !keyUsage[6])) {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    } else {
                        hashSet.add(arrayList2.get(i));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (hashSet.isEmpty() && annotatedException != null) {
                    throw annotatedException;
                }
                return hashSet;
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PublicKey processCRLG(X509CRL x509crl, Set set) {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static X509CRL processCRLH(Set set, PublicKey publicKey) {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw new AnnotatedException("Cannot verify delta CRL.", e);
        }
        return null;
    }

    protected static Set processCRLA1i(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) {
        HashSet hashSet = new HashSet();
        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
            try {
                CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, FRESHEST_CRL));
                if (cRLDistPoint == null) {
                    try {
                        cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, FRESHEST_CRL));
                    } catch (AnnotatedException e) {
                        throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", e);
                    }
                }
                if (cRLDistPoint != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(pKIXExtendedParameters.getCRLStores());
                    try {
                        arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()));
                        try {
                            hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), arrayList));
                        } catch (AnnotatedException e2) {
                            throw new AnnotatedException("Exception obtaining delta CRLs.", e2);
                        }
                    } catch (AnnotatedException e3) {
                        throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", e3);
                    }
                }
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", e4);
            }
        }
        return hashSet;
    }

    protected static Set[] processCRLA1ii(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) {
        HashSet hashSet = new HashSet();
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(x509Certificate);
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCRLStoreSelector<? extends CRL> build = new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build();
            if (pKIXExtendedParameters.getDate() != null) {
                date = pKIXExtendedParameters.getDate();
            }
            Set findCRLs = CRL_UTIL.findCRLs(build, date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                try {
                    hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()));
                } catch (AnnotatedException e) {
                    throw new AnnotatedException("Exception obtaining delta CRLs.", e);
                }
            }
            return new Set[]{findCRLs, hashSet};
        } catch (IOException e2) {
            throw new AnnotatedException("Cannot extract issuer from CRL." + e2, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) {
        if (x509crl == null) {
            return;
        }
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, ISSUING_DISTRIBUTION_POINT));
            if (!pKIXExtendedParameters.isUseDeltasEnabled()) {
                return;
            }
            if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
            }
            try {
                IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
                boolean z = true;
                if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                    z = false;
                }
                if (!z) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                }
                try {
                    ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, AUTHORITY_KEY_IDENTIFIER);
                    try {
                        ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, AUTHORITY_KEY_IDENTIFIER);
                        if (extensionValue == null) {
                            throw new AnnotatedException("CRL authority key identifier is null.");
                        }
                        if (extensionValue2 == null) {
                            throw new AnnotatedException("Delta CRL authority key identifier is null.");
                        }
                        if (extensionValue.equals(extensionValue2)) {
                            return;
                        }
                        throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                    } catch (AnnotatedException e) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e);
                    }
                } catch (AnnotatedException e2) {
                    throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e2);
                }
            } catch (Exception e3) {
                throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e3);
            }
        } catch (Exception e4) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r9 = ((org.spongycastle.asn1.ASN1Sequence) org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r6, org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r9.hasMoreElements() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
        r10 = org.spongycastle.asn1.x509.PolicyInformation.getInstance(r9.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
        if (org.spongycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r10.getPolicyIdentifier().getId()) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
        r17 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
        throw new org.spongycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
        if (r6.getCriticalExtensionOIDs() == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
        r19 = r6.getCriticalExtensionOIDs().contains(org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
        r13 = (org.spongycastle.jce.provider.PKIXPolicyNode) r8.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
        if (org.spongycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r13.getValidPolicy()) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0140, code lost:
        r21 = r6;
        r20 = r12;
        r23 = r15;
        r10 = new org.spongycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r5, (java.util.Set) r15.get(r11), r13, r17, r11, r19);
        r13.addChild(r10);
        r26[r5].add(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.spongycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r24, int r25, java.util.List[] r26, org.spongycastle.jce.provider.PKIXPolicyNode r27, int r28) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.spongycastle.jce.provider.PKIXPolicyNode, int):org.spongycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertA(CertPath certPath, int i) {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_MAPPINGS));
            if (dERSequence == null) {
                return;
            }
            for (int i2 = 0; i2 < dERSequence.size(); i2++) {
                try {
                    ASN1Sequence dERSequence2 = DERSequence.getInstance(dERSequence.getObjectAt(i2));
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(dERSequence2.getObjectAt(0));
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(dERSequence2.getObjectAt(1));
                    if (ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                        throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                    }
                    if (ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                        throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certPath, i);
                    }
                } catch (Exception e) {
                    throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                }
            }
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertF(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode, int i2) {
        if (i2 > 0 || pKIXPolicyNode != null) {
            return;
        }
        throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode processCertE(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode) {
        try {
            if (DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), CERTIFICATE_POLICIES)) != null) {
                return pKIXPolicyNode;
            }
            return null;
        } catch (AnnotatedException e) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertBC(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i2 >= size) {
            try {
                ASN1Sequence dERSequence = DERSequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate).getEncoded());
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(dERSequence);
                    pKIXNameConstraintValidator.checkExcludedDN(dERSequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(dERSequence).getRDNs(BCStyle.EmailAddress);
                        for (int i3 = 0; i3 != rDNs.length; i3++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i3].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (generalNames == null) {
                            return;
                        }
                        try {
                            GeneralName[] names = generalNames.getNames();
                            for (int i4 = 0; i4 < names.length; i4++) {
                                try {
                                    pKIXNameConstraintValidator.checkPermitted(names[i4]);
                                    pKIXNameConstraintValidator.checkExcluded(names[i4]);
                                } catch (PKIXNameConstraintValidatorException e2) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                }
                            }
                        } catch (Exception e3) {
                            throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (PKIXNameConstraintValidatorException e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode processCertD(CertPath certPath, int i, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i2) {
        String str;
        Set set2;
        Iterator it;
        PKIXPolicyNode pKIXPolicyNode2;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i3 = size - i;
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (dERSequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = dERSequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!ANY_POLICY.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i3, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i3, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e, certPath, i);
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i2 > 0 || (i3 < size && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = dERSequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i3 - 1];
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i4);
                            Iterator it2 = pKIXPolicyNode3.getExpectedPolicies().iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof String) {
                                    str = (String) next;
                                } else if (next instanceof ASN1ObjectIdentifier) {
                                    str = ((ASN1ObjectIdentifier) next).getId();
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode3.getChildren();
                                boolean z = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    Set set3 = qualifierSet2;
                                    it = it2;
                                    set2 = qualifierSet2;
                                    pKIXPolicyNode2 = pKIXPolicyNode3;
                                    PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i3, hashSet3, pKIXPolicyNode3, set3, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode4);
                                    listArr[i3].add(pKIXPolicyNode4);
                                } else {
                                    set2 = qualifierSet2;
                                    it = it2;
                                    pKIXPolicyNode2 = pKIXPolicyNode3;
                                }
                                pKIXPolicyNode3 = pKIXPolicyNode2;
                                it2 = it;
                                qualifierSet2 = set2;
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode;
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                List list2 = listArr[i5];
                PKIXPolicyNode pKIXPolicyNode6 = pKIXPolicyNode5;
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list2.get(i6);
                    if (pKIXPolicyNode7.hasChildren() || (pKIXPolicyNode6 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode6, listArr, pKIXPolicyNode7)) != null) {
                    }
                }
                pKIXPolicyNode5 = pKIXPolicyNode6;
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i3];
                for (int i7 = 0; i7 < list3.size(); i7++) {
                    ((PKIXPolicyNode) list3.get(i7)).setCritical(contains);
                }
            }
            return pKIXPolicyNode5;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, int i, PublicKey publicKey, boolean z, X500Name x500Name, X509Certificate x509Certificate, JcaJceHelper jcaJceHelper) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i);
        if (!z) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e, certPath, i);
            }
        }
        try {
            x509Certificate2.checkValidity(CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i));
            if (pKIXExtendedParameters.isRevocationEnabled()) {
                try {
                    checkCRLs(pKIXExtendedParameters, x509Certificate2, CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i), x509Certificate, publicKey, certificates, jcaJceHelper);
                } catch (AnnotatedException e2) {
                    throw new ExtCertPathValidatorException(e2.getMessage(), e2.getCause() != null ? e2.getCause() : e2, certPath, i);
                }
            }
            if (PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2).equals(x500Name)) {
                return;
            }
            throw new ExtCertPathValidatorException("IssuerName(" + PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2) + ") does not match SubjectName(" + x500Name + ") of signing certificate.", null, certPath, i);
        } catch (CertificateExpiredException e3) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e3.getMessage(), e3, certPath, i);
        } catch (CertificateNotYetValidException e4) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e4.getMessage(), e4, certPath, i);
        } catch (AnnotatedException e5) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e5, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r0 >= r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.DERSequence.getInstance(r0)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L47
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3e
            org.spongycastle.asn1.ASN1TaggedObject r1 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3e
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r2 != 0) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3e
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            int r0 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r0 >= r5) goto L47
            return r0
        L3e:
            r5 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L47:
            return r5
        L48:
            r5 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 >= r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.DERSequence.getInstance(r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L48
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3f
            org.spongycastle.asn1.ASN1TaggedObject r1 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3f
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3f
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3f
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            int r0 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            if (r0 >= r6) goto L48
            return r0
        L3f:
            r6 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L48:
            return r6
        L49:
            r6 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertG(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = dERSequence != null ? NameConstraints.getInstance(dERSequence) : null;
            if (nameConstraints == null) {
                return;
            }
            GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
            if (permittedSubtrees != null) {
                try {
                    pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                } catch (Exception e) {
                    throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                }
            }
            GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
            if (excludedSubtrees == null) {
                return;
            }
            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                try {
                    pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                } catch (Exception e2) {
                    throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                }
            }
        } catch (Exception e3) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
        throw r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void checkCRL(org.spongycastle.asn1.x509.DistributionPoint r22, org.spongycastle.jcajce.PKIXExtendedParameters r23, java.security.cert.X509Certificate r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.PublicKey r27, org.spongycastle.jce.provider.CertStatus r28, org.spongycastle.jce.provider.ReasonsMask r29, java.util.List r30, org.spongycastle.jcajce.util.JcaJceHelper r31) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.checkCRL(org.spongycastle.asn1.x509.DistributionPoint, org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, org.spongycastle.jce.provider.CertStatus, org.spongycastle.jce.provider.ReasonsMask, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static void checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters r23, java.security.cert.X509Certificate r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.PublicKey r27, java.util.List r28, org.spongycastle.jcajce.util.JcaJceHelper r29) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertJ(CertPath certPath, int i, int i2) {
        int intValue;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (intValue = aSN1Integer.getValue().intValue()) >= i2) ? i2 : intValue;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertK(CertPath certPath, int i) {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            if (basicConstraints != null) {
                if (basicConstraints.isCA()) {
                    return;
                }
                throw new CertPathValidatorException("Not a CA certificate");
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertL(CertPath certPath, int i, int i2) {
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i))) {
            if (i2 > 0) {
                return i2 - 1;
            }
            throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertM(CertPath certPath, int i, int i2) {
        BigInteger pathLenConstraint;
        int intValue;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            return (basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (intValue = pathLenConstraint.intValue()) >= i2) ? i2 : intValue;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertN(CertPath certPath, int i) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage == null || keyUsage[5]) {
            return;
        }
        throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertO(CertPath certPath, int i, Set set, List list) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH1(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH2(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH3(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int wrapupCertA(int i, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i == 0) ? i : i - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int wrapupCertB(CertPath certPath, int i, int i2) {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (dERSequence != null) {
                Enumeration objects = dERSequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).getValue().intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void wrapupCertF(CertPath certPath, int i, List list, Set set) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", e, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return null;
            }
            throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
        }
        if (CertPathValidatorUtilities.isAnyPolicy(set)) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                if (set2.isEmpty()) {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
                }
                HashSet<PKIXPolicyNode> hashSet = new HashSet();
                for (List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i2);
                        if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                            Iterator children = pKIXPolicyNode2.getChildren();
                            while (children.hasNext()) {
                                hashSet.add(children.next());
                            }
                        }
                    }
                }
                for (PKIXPolicyNode pKIXPolicyNode3 : hashSet) {
                    set2.contains(pKIXPolicyNode3.getValidPolicy());
                }
                if (pKIXPolicyNode != null) {
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        List list2 = listArr[i3];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list2.get(i4);
                            if (!pKIXPolicyNode4.hasChildren()) {
                                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                            }
                        }
                    }
                }
            }
        } else {
            HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
            for (List list3 : listArr) {
                for (int i5 = 0; i5 < list3.size(); i5++) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list3.get(i5);
                    if (ANY_POLICY.equals(pKIXPolicyNode5.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode5.getChildren();
                        while (children2.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) children2.next();
                            if (!ANY_POLICY.equals(pKIXPolicyNode6.getValidPolicy())) {
                                hashSet2.add(pKIXPolicyNode6);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode7 : hashSet2) {
                if (!set.contains(pKIXPolicyNode7.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    List list4 = listArr[i6];
                    for (int i7 = 0; i7 < list4.size(); i7++) {
                        PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) list4.get(i7);
                        if (!pKIXPolicyNode8.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode8);
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
