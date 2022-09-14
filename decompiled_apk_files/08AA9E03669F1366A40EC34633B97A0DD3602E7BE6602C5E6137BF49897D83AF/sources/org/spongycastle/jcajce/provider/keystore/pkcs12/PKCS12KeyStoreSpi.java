package org.spongycastle.jcajce.provider.keystore.pkcs12;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERBMPString;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.GOST28147Parameters;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.AuthenticatedSafe;
import org.spongycastle.asn1.pkcs.CertBag;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.EncryptedData;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PBES2Parameters;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12StoreParameter;
import org.spongycastle.jcajce.spec.GOST28147ParameterSpec;
import org.spongycastle.jcajce.spec.PBKDF2KeySpec;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.JDKPKCS12StoreParameter;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;
/* loaded from: classes.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private ASN1ObjectIdentifier keyAlgorithm;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private IgnoresCaseHashtable keys = new IgnoresCaseHashtable();
    private Hashtable localIds = new Hashtable();
    private IgnoresCaseHashtable certs = new IgnoresCaseHashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = new SecureRandom();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class CertId {
        byte[] id;

        CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).getKeyIdentifier();
        }

        CertId(byte[] bArr) {
            this.id = bArr;
        }

        public int hashCode() {
            return Arrays.hashCode(this.id);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.id, ((CertId) obj).id);
            }
            return false;
        }
    }

    public PKCS12KeyStoreSpi(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.keyAlgorithm = aSN1ObjectIdentifier;
        this.certAlgorithm = aSN1ObjectIdentifier2;
        try {
            if (provider != null) {
                this.certFact = CertificateFactory.getInstance("X.509", provider);
            } else {
                this.certFact = CertificateFactory.getInstance("X.509");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("can't create cert factory - " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        try {
            return new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        Digest createSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[createSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        createSHA1.update(bytes, 0, bytes.length);
        createSHA1.doFinal(bArr, 0);
        return bArr;
    }

    @Override // org.spongycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate == null) {
                return;
            }
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        if (str2 != null) {
            return (Certificate) this.keyCerts.get(str2);
        }
        return (Certificate) this.keyCerts.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys = this.certs.keys();
        while (elements.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys2 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            String str2 = (String) keys2.nextElement();
            if (((Certificate) elements2.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[SYNTHETIC] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 != 0) goto La
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null alias passed to getCertificateChain."
            r9.<init>(r0)
            throw r9
        La:
            boolean r0 = r8.engineIsKeyEntry(r9)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            java.security.cert.Certificate r9 = r8.engineGetCertificate(r9)
            if (r9 == 0) goto Lcf
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
        L1d:
            if (r9 == 0) goto Lb9
            r2 = r9
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            org.spongycastle.asn1.ASN1ObjectIdentifier r3 = org.spongycastle.asn1.x509.Extension.authorityKeyIdentifier
            java.lang.String r3 = r3.getId()
            byte[] r3 = r2.getExtensionValue(r3)
            if (r3 == 0) goto L6d
            org.spongycastle.asn1.ASN1InputStream r4 = new org.spongycastle.asn1.ASN1InputStream     // Catch: java.io.IOException -> L62
            r4.<init>(r3)     // Catch: java.io.IOException -> L62
            org.spongycastle.asn1.ASN1Primitive r3 = r4.readObject()     // Catch: java.io.IOException -> L62
            org.spongycastle.asn1.ASN1OctetString r3 = (org.spongycastle.asn1.ASN1OctetString) r3     // Catch: java.io.IOException -> L62
            byte[] r3 = r3.getOctets()     // Catch: java.io.IOException -> L62
            org.spongycastle.asn1.ASN1InputStream r4 = new org.spongycastle.asn1.ASN1InputStream     // Catch: java.io.IOException -> L62
            r4.<init>(r3)     // Catch: java.io.IOException -> L62
            org.spongycastle.asn1.ASN1Primitive r3 = r4.readObject()     // Catch: java.io.IOException -> L62
            org.spongycastle.asn1.x509.AuthorityKeyIdentifier r3 = org.spongycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(r3)     // Catch: java.io.IOException -> L62
            byte[] r4 = r3.getKeyIdentifier()     // Catch: java.io.IOException -> L62
            if (r4 == 0) goto L6d
            java.util.Hashtable r4 = r8.chainCerts     // Catch: java.io.IOException -> L62
            org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r5 = new org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId     // Catch: java.io.IOException -> L62
            byte[] r3 = r3.getKeyIdentifier()     // Catch: java.io.IOException -> L62
            r5.<init>(r3)     // Catch: java.io.IOException -> L62
            java.lang.Object r3 = r4.get(r5)     // Catch: java.io.IOException -> L62
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3     // Catch: java.io.IOException -> L62
            goto L6e
        L62:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L6d:
            r3 = r1
        L6e:
            if (r3 != 0) goto La8
            java.security.Principal r4 = r2.getIssuerDN()
            java.security.Principal r5 = r2.getSubjectDN()
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto La8
            java.util.Hashtable r5 = r8.chainCerts
            java.util.Enumeration r5 = r5.keys()
        L84:
            boolean r6 = r5.hasMoreElements()
            if (r6 == 0) goto La8
            java.util.Hashtable r6 = r8.chainCerts
            java.lang.Object r7 = r5.nextElement()
            java.lang.Object r6 = r6.get(r7)
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r6.getSubjectDN()
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L84
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.lang.Exception -> L84
            r2.verify(r7)     // Catch: java.lang.Exception -> L84
            r3 = r6
        La8:
            boolean r2 = r0.contains(r9)
            if (r2 == 0) goto Lb1
        Lae:
            r9 = r1
            goto L1d
        Lb1:
            r0.addElement(r9)
            if (r3 == r9) goto Lae
            r9 = r3
            goto L1d
        Lb9:
            int r9 = r0.size()
            java.security.cert.Certificate[] r9 = new java.security.cert.Certificate[r9]
            r1 = 0
        Lc0:
            int r2 = r9.length
            if (r1 == r2) goto Lce
            java.lang.Object r2 = r0.elementAt(r1)
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            r9[r1] = r2
            int r1 = r1 + 1
            goto Lc0
        Lce:
            return r9
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.keys.get(str) != null || this.certs.get(str) != null) {
            return new Date();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getKey.");
        }
        return (Key) this.keys.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        if (this.keys.get(str) != null) {
            throw new KeyStoreException("There is a key entry with the name " + str + ".");
        }
        this.certs.put(str, certificate);
        this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        boolean z = key instanceof PrivateKey;
        if (!z) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (z && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr == null) {
            return;
        }
        this.certs.put(str, certificateArr[0]);
        for (int i = 0; i != certificateArr.length; i++) {
            this.chainCerts.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    protected PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                Cipher createCipher = this.helper.createCipher(algorithm.getId());
                createCipher.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
                return (PrivateKey) createCipher.unwrap(bArr, "", 2);
            } else if (algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                return (PrivateKey) createCipher(4, cArr, algorithmIdentifier).unwrap(bArr, "", 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + algorithm);
            }
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher createCipher = this.helper.createCipher(str);
            createCipher.init(3, createSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return createCipher.wrap(key);
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    protected byte[] cryptData(boolean z, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z2, byte[] bArr) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i = z ? 1 : 2;
        if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            new PBEKeySpec(cArr);
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
                Cipher createCipher = this.helper.createCipher(algorithm.getId());
                createCipher.init(i, pKCS12Key, pBEParameterSpec);
                return createCipher.doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        } else if (algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
            try {
                return createCipher(i, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (Exception e2) {
                throw new IOException("exception decrypting data - " + e2.toString());
            }
        } else {
            throw new IOException("unknown PBE algorithm: " + algorithm);
        }
    }

    private Cipher createCipher(int i, char[] cArr, AlgorithmIdentifier algorithmIdentifier) {
        SecretKey generateSecret;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        if (pBKDF2Params.isDefaultPrf()) {
            generateSecret = createSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2)));
        } else {
            generateSecret = createSecretKeyFactory.generateSecret(new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        }
        Cipher cipher = Cipher.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            cipher.init(i, generateSecret, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
        } else {
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            cipher.init(i, generateSecret, new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
        }
        return cipher;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        ASN1OctetString aSN1OctetString;
        ASN1Sequence aSN1Sequence;
        ASN1Primitive aSN1Primitive;
        ASN1OctetString aSN1OctetString2;
        ASN1OctetString aSN1OctetString3;
        ASN1Primitive aSN1Primitive2;
        boolean z3;
        if (inputStream == null) {
            return;
        }
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        if (bufferedInputStream.read() != 48) {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        bufferedInputStream.reset();
        Pfx pfx = Pfx.getInstance((ASN1Sequence) new ASN1InputStream(bufferedInputStream).readObject());
        ContentInfo authSafe = pfx.getAuthSafe();
        Vector vector = new Vector();
        int i = 1;
        int i2 = 0;
        if (pfx.getMacData() != null) {
            MacData macData = pfx.getMacData();
            DigestInfo mac = macData.getMac();
            AlgorithmIdentifier algorithmId = mac.getAlgorithmId();
            byte[] salt = macData.getSalt();
            int intValue = macData.getIterationCount().intValue();
            byte[] octets = ((ASN1OctetString) authSafe.getContent()).getOctets();
            try {
                byte[] calculatePbeMac = calculatePbeMac(algorithmId.getAlgorithm(), salt, intValue, cArr, false, octets);
                byte[] digest = mac.getDigest();
                if (Arrays.constantTimeAreEqual(calculatePbeMac, digest)) {
                    z3 = false;
                } else if (cArr.length > 0) {
                    throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                } else {
                    if (!Arrays.constantTimeAreEqual(calculatePbeMac(algorithmId.getAlgorithm(), salt, intValue, cArr, true, octets), digest)) {
                        throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                    }
                    z3 = true;
                }
                z = z3;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("error constructing MAC: " + e2.toString());
            }
        } else {
            z = false;
        }
        ASN1OctetString aSN1OctetString4 = null;
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new Hashtable();
        if (authSafe.getContentType().equals(data)) {
            ContentInfo[] contentInfo = AuthenticatedSafe.getInstance(new ASN1InputStream(((ASN1OctetString) authSafe.getContent()).getOctets()).readObject()).getContentInfo();
            int i3 = 0;
            z2 = false;
            while (i3 != contentInfo.length) {
                if (contentInfo[i3].getContentType().equals(data)) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) new ASN1InputStream(((ASN1OctetString) contentInfo[i3].getContent()).getOctets()).readObject();
                    int i4 = 0;
                    while (i4 != aSN1Sequence2.size()) {
                        SafeBag safeBag = SafeBag.getInstance(aSN1Sequence2.getObjectAt(i4));
                        if (safeBag.getBagId().equals(pkcs8ShroudedKeyBag)) {
                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag.getBagValue());
                            PrivateKey unwrapKey = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z);
                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) unwrapKey;
                            if (safeBag.getBagAttributes() != null) {
                                Enumeration objects = safeBag.getBagAttributes().getObjects();
                                aSN1OctetString3 = aSN1OctetString4;
                                String str2 = aSN1OctetString3;
                                while (objects.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) objects.nextElement();
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(i2);
                                    ASN1Set aSN1Set = (ASN1Set) aSN1Sequence3.getObjectAt(i);
                                    if (aSN1Set.size() > 0) {
                                        aSN1Primitive2 = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                        ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                        if (bagAttribute != null) {
                                            if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive2)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                        } else {
                                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive2);
                                        }
                                    } else {
                                        aSN1Primitive2 = null;
                                    }
                                    if (aSN1ObjectIdentifier.equals(pkcs_9_at_friendlyName)) {
                                        String string = ((DERBMPString) aSN1Primitive2).getString();
                                        this.keys.put(string, unwrapKey);
                                        str2 = string;
                                    } else if (aSN1ObjectIdentifier.equals(pkcs_9_at_localKeyId)) {
                                        aSN1OctetString3 = (ASN1OctetString) aSN1Primitive2;
                                    }
                                    i = 1;
                                    i2 = 0;
                                }
                                aSN1OctetString2 = str2;
                            } else {
                                aSN1OctetString2 = null;
                                aSN1OctetString3 = null;
                            }
                            if (aSN1OctetString3 != null) {
                                String str3 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                if (aSN1OctetString2 == null) {
                                    this.keys.put(str3, unwrapKey);
                                } else {
                                    this.localIds.put(aSN1OctetString2, str3);
                                }
                            } else {
                                this.keys.put("unmarked", unwrapKey);
                                z2 = true;
                            }
                        } else if (safeBag.getBagId().equals(certBag)) {
                            vector.addElement(safeBag);
                        } else {
                            System.out.println("extra in data " + safeBag.getBagId());
                            System.out.println(ASN1Dump.dumpAsString(safeBag));
                        }
                        i4++;
                        i = 1;
                        i2 = 0;
                        aSN1OctetString4 = null;
                    }
                    continue;
                } else if (contentInfo[i3].getContentType().equals(encryptedData)) {
                    EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i3].getContent());
                    ASN1Sequence aSN1Sequence4 = (ASN1Sequence) ASN1Primitive.fromByteArray(cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr, z, encryptedData.getContent().getOctets()));
                    int i5 = 0;
                    while (i5 != aSN1Sequence4.size()) {
                        SafeBag safeBag2 = SafeBag.getInstance(aSN1Sequence4.getObjectAt(i5));
                        if (safeBag2.getBagId().equals(certBag)) {
                            vector.addElement(safeBag2);
                            aSN1Sequence = aSN1Sequence4;
                        } else if (safeBag2.getBagId().equals(pkcs8ShroudedKeyBag)) {
                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                            PrivateKey unwrapKey2 = unwrapKey(encryptedPrivateKeyInfo2.getEncryptionAlgorithm(), encryptedPrivateKeyInfo2.getEncryptedData(), cArr, z);
                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) unwrapKey2;
                            Enumeration objects2 = safeBag2.getBagAttributes().getObjects();
                            ASN1OctetString aSN1OctetString5 = null;
                            String str4 = null;
                            while (objects2.hasMoreElements()) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) objects2.nextElement();
                                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                ASN1Sequence aSN1Sequence6 = aSN1Sequence4;
                                ASN1Set aSN1Set2 = (ASN1Set) aSN1Sequence5.getObjectAt(1);
                                if (aSN1Set2.size() > 0) {
                                    aSN1Primitive = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                    ASN1Encodable bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                    if (bagAttribute2 != null) {
                                        if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive);
                                    }
                                } else {
                                    aSN1Primitive = null;
                                }
                                if (aSN1ObjectIdentifier2.equals(pkcs_9_at_friendlyName)) {
                                    String string2 = ((DERBMPString) aSN1Primitive).getString();
                                    this.keys.put(string2, unwrapKey2);
                                    str4 = string2;
                                } else if (aSN1ObjectIdentifier2.equals(pkcs_9_at_localKeyId)) {
                                    aSN1OctetString5 = (ASN1OctetString) aSN1Primitive;
                                }
                                aSN1Sequence4 = aSN1Sequence6;
                            }
                            aSN1Sequence = aSN1Sequence4;
                            String str5 = new String(Hex.encode(aSN1OctetString5.getOctets()));
                            if (str4 == null) {
                                this.keys.put(str5, unwrapKey2);
                            } else {
                                this.localIds.put(str4, str5);
                            }
                        } else {
                            aSN1Sequence = aSN1Sequence4;
                            if (safeBag2.getBagId().equals(keyBag)) {
                                PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) privateKey;
                                Enumeration objects3 = safeBag2.getBagAttributes().getObjects();
                                ASN1OctetString aSN1OctetString6 = null;
                                String str6 = null;
                                while (objects3.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence7 = ASN1Sequence.getInstance(objects3.nextElement());
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = ASN1ObjectIdentifier.getInstance(aSN1Sequence7.getObjectAt(0));
                                    ASN1Set aSN1Set3 = ASN1Set.getInstance(aSN1Sequence7.getObjectAt(1));
                                    if (aSN1Set3.size() > 0) {
                                        ASN1Primitive aSN1Primitive3 = (ASN1Primitive) aSN1Set3.getObjectAt(0);
                                        ASN1Encodable bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                        if (bagAttribute3 != null) {
                                            if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                        } else {
                                            pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                        }
                                        if (aSN1ObjectIdentifier3.equals(pkcs_9_at_friendlyName)) {
                                            str6 = ((DERBMPString) aSN1Primitive3).getString();
                                            this.keys.put(str6, privateKey);
                                        } else if (aSN1ObjectIdentifier3.equals(pkcs_9_at_localKeyId)) {
                                            aSN1OctetString6 = (ASN1OctetString) aSN1Primitive3;
                                        }
                                    }
                                }
                                String str7 = new String(Hex.encode(aSN1OctetString6.getOctets()));
                                if (str6 == null) {
                                    this.keys.put(str7, privateKey);
                                } else {
                                    this.localIds.put(str6, str7);
                                }
                            } else {
                                System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag2));
                            }
                        }
                        i5++;
                        aSN1Sequence4 = aSN1Sequence;
                    }
                    continue;
                } else {
                    System.out.println("extra " + contentInfo[i3].getContentType().getId());
                    System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i3].getContent()));
                }
                i3++;
                i = 1;
                i2 = 0;
                aSN1OctetString4 = null;
            }
        } else {
            z2 = false;
        }
        this.certs = new IgnoresCaseHashtable();
        this.chainCerts = new Hashtable();
        this.keyCerts = new Hashtable();
        for (int i6 = 0; i6 != vector.size(); i6++) {
            SafeBag safeBag3 = (SafeBag) vector.elementAt(i6);
            CertBag certBag = CertBag.getInstance(safeBag3.getBagValue());
            if (!certBag.getCertId().equals(x509Certificate)) {
                throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
            }
            try {
                Certificate generateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                if (safeBag3.getBagAttributes() != null) {
                    Enumeration objects4 = safeBag3.getBagAttributes().getObjects();
                    str = null;
                    aSN1OctetString = null;
                    while (objects4.hasMoreElements()) {
                        ASN1Sequence aSN1Sequence8 = ASN1Sequence.getInstance(objects4.nextElement());
                        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = ASN1ObjectIdentifier.getInstance(aSN1Sequence8.getObjectAt(0));
                        ASN1Set aSN1Set4 = ASN1Set.getInstance(aSN1Sequence8.getObjectAt(1));
                        if (aSN1Set4.size() > 0) {
                            ASN1Primitive aSN1Primitive4 = (ASN1Primitive) aSN1Set4.getObjectAt(0);
                            if (generateCertificate instanceof PKCS12BagAttributeCarrier) {
                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) generateCertificate;
                                ASN1Encodable bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                if (bagAttribute4 != null) {
                                    if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                        throw new IOException("attempt to add existing attribute with different value");
                                    }
                                } else {
                                    pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                }
                            }
                            if (aSN1ObjectIdentifier4.equals(pkcs_9_at_friendlyName)) {
                                str = ((DERBMPString) aSN1Primitive4).getString();
                            } else if (aSN1ObjectIdentifier4.equals(pkcs_9_at_localKeyId)) {
                                aSN1OctetString = (ASN1OctetString) aSN1Primitive4;
                            }
                        }
                    }
                } else {
                    str = null;
                    aSN1OctetString = null;
                }
                this.chainCerts.put(new CertId(generateCertificate.getPublicKey()), generateCertificate);
                if (!z2) {
                    if (aSN1OctetString != null) {
                        this.keyCerts.put(new String(Hex.encode(aSN1OctetString.getOctets())), generateCertificate);
                    }
                    if (str != null) {
                        this.certs.put(str, generateCertificate);
                    }
                } else if (this.keyCerts.isEmpty()) {
                    String str8 = new String(Hex.encode(createSubjectKeyId(generateCertificate.getPublicKey()).getKeyIdentifier()));
                    this.keyCerts.put(str8, generateCertificate);
                    this.keys.put(str8, this.keys.remove("unmarked"));
                }
            } catch (Exception e3) {
                throw new RuntimeException(e3.toString());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        if (z) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        } else {
            throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
        }
        doStore(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        doStore(outputStream, cArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b4 A[Catch: CertificateEncodingException -> 0x025a, TryCatch #1 {CertificateEncodingException -> 0x025a, blocks: (B:30:0x0164, B:32:0x0187, B:34:0x0194, B:39:0x01ac, B:41:0x01b4, B:42:0x01c1, B:43:0x01c6, B:45:0x01cc, B:48:0x01fa, B:49:0x023b, B:38:0x01a1), top: B:123:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cc A[Catch: CertificateEncodingException -> 0x025a, LOOP:3: B:43:0x01c6->B:45:0x01cc, LOOP_END, TryCatch #1 {CertificateEncodingException -> 0x025a, blocks: (B:30:0x0164, B:32:0x0187, B:34:0x0194, B:39:0x01ac, B:41:0x01b4, B:42:0x01c1, B:43:0x01c6, B:45:0x01cc, B:48:0x01fa, B:49:0x023b, B:38:0x01a1), top: B:123:0x0164 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doStore(java.io.OutputStream r22, char[] r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.doStore(java.io.OutputStream, char[], boolean):void");
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys = this.keys.keys();
        while (keys.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys2.nextElement()));
        }
        return hashSet;
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac createMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        createMac.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        createMac.update(bArr2);
        return createMac.doFinal();
    }

    /* loaded from: classes.dex */
    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BouncyCastleProvider(), pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    /* loaded from: classes.dex */
    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            super(new BouncyCastleProvider(), pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    /* loaded from: classes.dex */
    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    /* loaded from: classes.dex */
    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration elements() {
            return this.orig.elements();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new ASN1ObjectIdentifier("1.2.840.113533.7.66.10"), Integers.valueOf(128));
            hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            hashMap.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            hashMap.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            hashMap.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            hashMap.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            hashMap.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            hashMap.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            hashMap.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }
}
