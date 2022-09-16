package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.spongycastle.jcajce.PKIXCertStore;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jce.exception.ExtCertPathBuilderException;
import org.spongycastle.x509.ExtendedPKIXBuilderParameters;
import org.spongycastle.x509.ExtendedPKIXParameters;
/* loaded from: classes.dex */
public class PKIXCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        PKIXExtendedBuilderParameters.Builder builder;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            PKIXExtendedParameters.Builder builder2 = new PKIXExtendedParameters.Builder(pKIXBuilderParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                for (PKIXCertStore pKIXCertStore : extendedPKIXBuilderParameters.getAdditionalStores()) {
                    builder2.addCertificateStore(pKIXCertStore);
                }
                PKIXExtendedBuilderParameters.Builder builder3 = new PKIXExtendedBuilderParameters.Builder(builder2.build());
                builder3.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder3.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
                builder = builder3;
            } else {
                builder = new PKIXExtendedBuilderParameters.Builder(pKIXBuilderParameters);
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedBuilderParameters = (PKIXExtendedBuilderParameters) certPathParameters;
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + PKIXExtendedBuilderParameters.class.getName() + ".");
        }
        ArrayList arrayList = new ArrayList();
        PKIXCertStoreSelector targetConstraints = pKIXExtendedBuilderParameters.getBaseParameters().getTargetConstraints();
        try {
            Collection findCertificates = CertPathValidatorUtilities.findCertificates(targetConstraints, pKIXExtendedBuilderParameters.getBaseParameters().getCertificateStores());
            findCertificates.addAll(CertPathValidatorUtilities.findCertificates(targetConstraints, pKIXExtendedBuilderParameters.getBaseParameters().getCertStores()));
            if (findCertificates.isEmpty()) {
                throw new CertPathBuilderException("No certificate found matching targetContraints.");
            }
            CertPathBuilderResult certPathBuilderResult = null;
            Iterator it = findCertificates.iterator();
            while (it.hasNext() && certPathBuilderResult == null) {
                certPathBuilderResult = build((X509Certificate) it.next(), pKIXExtendedBuilderParameters, arrayList);
            }
            if (certPathBuilderResult == null && this.certPathException != null) {
                if (this.certPathException instanceof AnnotatedException) {
                    throw new CertPathBuilderException(this.certPathException.getMessage(), this.certPathException.getCause());
                }
                throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
            } else if (certPathBuilderResult != null || this.certPathException != null) {
                return certPathBuilderResult;
            } else {
                throw new CertPathBuilderException("Unable to find certificate chain.");
            }
        } catch (AnnotatedException e) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.security.cert.CertPathBuilderResult build(java.security.cert.X509Certificate r6, org.spongycastle.jcajce.PKIXExtendedBuilderParameters r7, java.util.List r8) {
        /*
            r5 = this;
            boolean r0 = r8.contains(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r7.getExcludedCerts()
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r7.getMaxPathLength()
            r2 = -1
            if (r0 == r2) goto L27
            int r0 = r8.size()
            int r0 = r0 + (-1)
            int r2 = r7.getMaxPathLength()
            if (r0 <= r2) goto L27
            return r1
        L27:
            r8.add(r6)
            org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory r0 = new org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory     // Catch: java.lang.Exception -> Lf6
            r0.<init>()     // Catch: java.lang.Exception -> Lf6
            org.spongycastle.jce.provider.PKIXCertPathValidatorSpi r2 = new org.spongycastle.jce.provider.PKIXCertPathValidatorSpi     // Catch: java.lang.Exception -> Lf6
            r2.<init>()     // Catch: java.lang.Exception -> Lf6
            org.spongycastle.jcajce.PKIXExtendedParameters r3 = r7.getBaseParameters()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.util.Set r3 = r3.getTrustAnchors()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            org.spongycastle.jcajce.PKIXExtendedParameters r4 = r7.getBaseParameters()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r4 = r4.getSigProvider()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.cert.TrustAnchor r3 = org.spongycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(r6, r3, r4)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            if (r3 == 0) goto L78
            java.security.cert.CertPath r0 = r0.engineGenerateCertPath(r8)     // Catch: java.lang.Exception -> L6f
            java.security.cert.CertPathValidatorResult r7 = r2.engineValidate(r0, r7)     // Catch: java.lang.Exception -> L66
            java.security.cert.PKIXCertPathValidatorResult r7 = (java.security.cert.PKIXCertPathValidatorResult) r7     // Catch: java.lang.Exception -> L66
            java.security.cert.PKIXCertPathBuilderResult r2 = new java.security.cert.PKIXCertPathBuilderResult     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.cert.TrustAnchor r3 = r7.getTrustAnchor()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.cert.PolicyNode r4 = r7.getPolicyTree()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.PublicKey r7 = r7.getPublicKey()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            r2.<init>(r0, r3, r4, r7)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            return r2
        L66:
            r7 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r2 = "Certification path could not be validated."
            r0.<init>(r2, r7)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            throw r0     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        L6f:
            r7 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r2 = "Certification path could not be constructed from certificate list."
            r0.<init>(r2, r7)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            throw r0     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        L78:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            r0.<init>()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            org.spongycastle.jcajce.PKIXExtendedParameters r2 = r7.getBaseParameters()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.util.List r2 = r2.getCertificateStores()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            r0.addAll(r2)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            org.spongycastle.asn1.ASN1ObjectIdentifier r2 = org.spongycastle.asn1.x509.Extension.issuerAlternativeName     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r2 = r2.getId()     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            byte[] r2 = r6.getExtensionValue(r2)     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            org.spongycastle.jcajce.PKIXExtendedParameters r3 = r7.getBaseParameters()     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            java.util.Map r3 = r3.getNamedCertificateStoreMap()     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            java.util.List r2 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getAdditionalStoresFromAltNames(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            r0.addAll(r2)     // Catch: java.security.cert.CertificateParsingException -> Le4 org.spongycastle.jce.provider.AnnotatedException -> Led
            java.util.HashSet r2 = new java.util.HashSet     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            r2.<init>()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            org.spongycastle.jcajce.PKIXExtendedParameters r3 = r7.getBaseParameters()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Ldb
            java.util.List r3 = r3.getCertStores()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Ldb
            java.util.Collection r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.findIssuerCerts(r6, r3, r0)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Ldb
            r2.addAll(r0)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Ldb
            boolean r0 = r2.isEmpty()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            if (r0 == 0) goto Lc3
            org.spongycastle.jce.provider.AnnotatedException r7 = new org.spongycastle.jce.provider.AnnotatedException     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r0 = "No issuer certificate for certificate in certification path found."
            r7.<init>(r0)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            throw r7     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        Lc3:
            java.util.Iterator r0 = r2.iterator()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        Lc7:
            boolean r2 = r0.hasNext()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            if (r2 == 0) goto Lf0
            if (r1 != 0) goto Lf0
            java.lang.Object r2 = r0.next()     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.security.cert.CertPathBuilderResult r2 = r5.build(r2, r7, r8)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            r1 = r2
            goto Lc7
        Ldb:
            r7 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r2 = "Cannot find issuer certificate for certificate in certification path."
            r0.<init>(r2, r7)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            throw r0     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        Le4:
            r7 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            java.lang.String r2 = "No additional X.509 stores can be added from certificate locations."
            r0.<init>(r2, r7)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
            throw r0     // Catch: org.spongycastle.jce.provider.AnnotatedException -> Led
        Led:
            r7 = move-exception
            r5.certPathException = r7
        Lf0:
            if (r1 != 0) goto Lf5
            r8.remove(r6)
        Lf5:
            return r1
        Lf6:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Exception creating support classes."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.PKIXCertPathBuilderSpi.build(java.security.cert.X509Certificate, org.spongycastle.jcajce.PKIXExtendedBuilderParameters, java.util.List):java.security.cert.CertPathBuilderResult");
    }
}
