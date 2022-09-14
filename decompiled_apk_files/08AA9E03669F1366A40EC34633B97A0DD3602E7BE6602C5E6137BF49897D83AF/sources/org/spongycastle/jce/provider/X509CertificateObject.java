package org.spongycastle.jce.provider;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OutputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.misc.MiscObjectIdentifiers;
import org.spongycastle.asn1.misc.NetscapeCertType;
import org.spongycastle.asn1.misc.NetscapeRevocationURL;
import org.spongycastle.asn1.misc.VerisignCzagExtension;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.style.RFC4519Style;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;
/* loaded from: classes.dex */
public class X509CertificateObject extends X509Certificate implements PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private BasicConstraints basicConstraints;

    /* renamed from: c  reason: collision with root package name */
    private Certificate f5675c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(Certificate certificate) {
        this.f5675c = certificate;
        try {
            byte[] extensionBytes = getExtensionBytes("2.5.29.19");
            if (extensionBytes != null) {
                this.basicConstraints = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes("2.5.29.15");
                if (extensionBytes2 != null) {
                    DERBitString dERBitString = DERBitString.getInstance(ASN1Primitive.fromByteArray(extensionBytes2));
                    byte[] bytes = dERBitString.getBytes();
                    int length = (bytes.length * 8) - dERBitString.getPadBits();
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    this.keyUsage = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        this.keyUsage[i2] = (bytes[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                    }
                    return;
                }
                this.keyUsage = null;
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f5675c.getEndDate().getTime());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f5675c.getStartDate().getTime());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f5675c.getVersionNumber();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f5675c.getSerialNumber().getValue();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            return new X509Principal(X500Name.getInstance(this.f5675c.getIssuer().getEncoded()));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f5675c.getIssuer());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new X509Principal(X500Name.getInstance(this.f5675c.getSubject().toASN1Primitive()));
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f5675c.getSubject());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f5675c.getStartDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f5675c.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        try {
            return this.f5675c.getTBSCertificate().getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f5675c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            String property2 = provider2.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f5675c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f5675c.getSignatureAlgorithm().getParameters() != null) {
            try {
                return this.f5675c.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(ASN1Encoding.DER);
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        DERBitString issuerUniqueId = this.f5675c.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId != null) {
            byte[] bytes = issuerUniqueId.getBytes();
            boolean[] zArr = new boolean[(bytes.length * 8) - issuerUniqueId.getPadBits()];
            for (int i = 0; i != zArr.length; i++) {
                zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        DERBitString subjectUniqueId = this.f5675c.getTBSCertificate().getSubjectUniqueId();
        if (subjectUniqueId != null) {
            byte[] bytes = subjectUniqueId.getBytes();
            boolean[] zArr = new boolean[(bytes.length * 8) - subjectUniqueId.getPadBits()];
            for (int i = 0; i != zArr.length; i++) {
                zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        byte[] extensionBytes = getExtensionBytes("2.5.29.37");
        if (extensionBytes != null) {
            try {
                ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(extensionBytes).readObject();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i != aSN1Sequence.size(); i++) {
                    arrayList.add(((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i)).getId());
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception unused) {
                throw new CertificateParsingException("error processing extended key usage extension");
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        if (this.basicConstraints == null || !this.basicConstraints.isCA()) {
            return -1;
        }
        return this.basicConstraints.getPathLenConstraint() == null ? Api.BaseClientBuilder.API_PRIORITY_OTHER : this.basicConstraints.getPathLenConstraint().intValue();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(Extension.subjectAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(Extension.issuerAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            Extensions extensions = this.f5675c.getTBSCertificate().getExtensions();
            if (extensions == null) {
                return null;
            }
            Enumeration oids = extensions.oids();
            while (oids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
                if (extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                    hashSet.add(aSN1ObjectIdentifier.getId());
                }
            }
            return hashSet;
        }
        return null;
    }

    private byte[] getExtensionBytes(String str) {
        Extension extension;
        Extensions extensions = this.f5675c.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue().getOctets();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f5675c.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            Extensions extensions = this.f5675c.getTBSCertificate().getExtensions();
            if (extensions == null) {
                return null;
            }
            Enumeration oids = extensions.oids();
            while (oids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
                if (!extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                    hashSet.add(aSN1ObjectIdentifier.getId());
                }
            }
            return hashSet;
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.f5675c.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            String id = aSN1ObjectIdentifier.getId();
            if (!id.equals(RFC3280CertPathUtilities.KEY_USAGE) && !id.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) && !id.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) && !id.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) && !id.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) && !id.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) && !id.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) && !id.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) && !id.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) && !id.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) && !id.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f5675c.getSubjectPublicKeyInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        try {
            return this.f5675c.getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.cert.Certificate)) {
            return false;
        }
        try {
            return Arrays.areEqual(getEncoded(), ((java.security.cert.Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = calculateHashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(lineSeparator);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(lineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(Hex.encode(signature, 0, 20)));
        stringBuffer.append(lineSeparator);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(Hex.encode(signature, i, 20)));
                stringBuffer.append(lineSeparator);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(Hex.encode(signature, i, signature.length - i)));
                stringBuffer.append(lineSeparator);
            }
        }
        Extensions extensions = this.f5675c.getTBSCertificate().getExtensions();
        if (extensions != null) {
            Enumeration oids = extensions.oids();
            if (oids.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (oids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
                Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(extension.isCritical());
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals(Extension.basicConstraints)) {
                            stringBuffer.append(BasicConstraints.getInstance(aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.keyUsage)) {
                            stringBuffer.append(KeyUsage.getInstance(aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeCertType)) {
                            stringBuffer.append(new NetscapeCertType((DERBitString) aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeRevocationURL)) {
                            stringBuffer.append(new NetscapeRevocationURL((DERIA5String) aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.verisignCzagExtension)) {
                            stringBuffer.append(new VerisignCzagExtension((DERIA5String) aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                            stringBuffer.append(lineSeparator);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(lineSeparator);
                    }
                } else {
                    stringBuffer.append(lineSeparator);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f5675c.getSignatureAlgorithm());
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f5675c.getSignatureAlgorithm());
        if (str != null) {
            signature = Signature.getInstance(signatureName, str);
        } else {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) {
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f5675c.getSignatureAlgorithm());
        if (provider != null) {
            signature = Signature.getInstance(signatureName, provider);
        } else {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    private void checkSignature(PublicKey publicKey, Signature signature) {
        if (!isAlgIdEqual(this.f5675c.getSignatureAlgorithm(), this.f5675c.getTBSCertificate().getSignature())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, this.f5675c.getSignatureAlgorithm().getParameters());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (signature.verify(getSignature())) {
            return;
        }
        throw new SignatureException("certificate does not verify with supplied key");
    }

    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (!algorithmIdentifier.getAlgorithm().equals(algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        if (algorithmIdentifier.getParameters() == null) {
            return algorithmIdentifier2.getParameters() == null || algorithmIdentifier2.getParameters().equals(DERNull.INSTANCE);
        } else if (algorithmIdentifier2.getParameters() != null) {
            return algorithmIdentifier.getParameters().equals(algorithmIdentifier2.getParameters());
        } else {
            return algorithmIdentifier.getParameters() == null || algorithmIdentifier.getParameters().equals(DERNull.INSTANCE);
        }
    }

    private static Collection getAlternativeNames(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = ASN1Sequence.getInstance(bArr).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(generalName.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((ASN1String) generalName.getName()).getString());
                        break;
                    case 4:
                        arrayList2.add(X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString());
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(DEROctetString.getInstance(generalName.getName()).getOctets()).getHostAddress());
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.getInstance(generalName.getName()).getId());
                        break;
                    default:
                        throw new IOException("Bad tag number: " + generalName.getTagNo());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() != 0) {
                return Collections.unmodifiableCollection(arrayList);
            }
            return null;
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }
}
