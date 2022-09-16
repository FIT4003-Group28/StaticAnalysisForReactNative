package com.teslamotors.plugins.ble;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.google.android.gms.common.util.AndroidUtilsLight;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyAgreement;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.ECPointUtil;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.x509.X509V3CertificateGenerator;
/* compiled from: BLECrypto.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5253a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static String f5254b = "keys.store";

    /* renamed from: c  reason: collision with root package name */
    private KeyStore f5255c;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public d() {
        try {
            this.f5255c = KeyStore.getInstance("AndroidKeyStore");
            this.f5255c.load(null);
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Could not create key store", e));
        }
    }

    public static FileInputStream a(Context context) {
        try {
            return context.openFileInput(f5254b);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static FileOutputStream b(Context context) {
        try {
            return context.openFileOutput(f5254b, 0);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static void c(Context context) {
        try {
            context.deleteFile(f5254b);
        } catch (Exception unused) {
        }
    }

    public static KeyPair a() {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("prime256v1");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(eCGenParameterSpec, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }

    public boolean a(KeyPair keyPair, String str, Context context) {
        FileOutputStream fileOutputStream;
        String a2 = a(str);
        FileInputStream fileInputStream = null;
        try {
            X509Certificate a3 = a(keyPair);
            if (a3 == null) {
                a((Closeable) null);
                a((Closeable) null);
                return false;
            }
            char[] charArray = d(context).toCharArray();
            KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            FileInputStream a4 = a(context);
            try {
                keyStore.load(a4, charArray);
                keyStore.setKeyEntry(a2, keyPair.getPrivate(), charArray, new Certificate[]{a3});
                fileOutputStream = b(context);
                try {
                    keyStore.store(fileOutputStream, charArray);
                    a(a4);
                    a(fileOutputStream);
                    return true;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = a4;
                    try {
                        com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to store keystore", e));
                        a(fileInputStream);
                        a(fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        a(fileInputStream);
                        a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = a4;
                    a(fileInputStream);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public KeyPair a(String str, Context context) {
        FileInputStream fileInputStream;
        String a2 = a(str);
        System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
        char[] charArray = d(context).toCharArray();
        try {
            fileInputStream = a(context);
            try {
                try {
                    keyStore.load(fileInputStream, charArray);
                    Key key = keyStore.getKey(a2, charArray);
                    if (key == null) {
                        a(fileInputStream);
                        return null;
                    }
                    KeyPair keyPair = new KeyPair(keyStore.getCertificate(a2).getPublicKey(), (PrivateKey) key);
                    a(fileInputStream);
                    return keyPair;
                } catch (Exception e) {
                    e = e;
                    com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to get local keypair - deleting", e));
                    c(context);
                    a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                a(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            a(fileInputStream);
            throw th;
        }
    }

    public PublicKey a(byte[] bArr) {
        try {
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
            KeyFactory keyFactory = KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
            ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec("prime256v1", parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN());
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(ECPointUtil.decodePoint(eCNamedCurveSpec.getCurve(), bArr), eCNamedCurveSpec));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            byte[] encoded = keyAgreement.generateSecret("AES").getEncoded();
            if (encoded == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(encoded);
            return Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to do key exchange / generate shared secret", e));
            return null;
        }
    }

    public static byte[] a(PublicKey publicKey) {
        try {
            return Arrays.copyOf(MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(b(publicKey)), 4);
        } catch (NoSuchAlgorithmException e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to compute SHA1 hash of public key", e));
            return null;
        }
    }

    public static byte[] b(PublicKey publicKey) {
        byte[] encoded = publicKey.getEncoded();
        return Arrays.copyOfRange(encoded, 26, encoded.length);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, long j) {
        System.currentTimeMillis();
        try {
            AEADParameters aEADParameters = new AEADParameters(new KeyParameter(bArr2), 128, new byte[]{(byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)});
            GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(new AESEngine());
            gCMBlockCipher.init(true, aEADParameters);
            byte[] bArr3 = new byte[gCMBlockCipher.getOutputSize(bArr.length)];
            gCMBlockCipher.doFinal(bArr3, gCMBlockCipher.processBytes(bArr, 0, bArr.length, bArr3, 0));
            return bArr3;
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to encrypt message", e));
            return null;
        }
    }

    private static X509Certificate a(KeyPair keyPair) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(1, 30);
        X509V3CertificateGenerator x509V3CertificateGenerator = new X509V3CertificateGenerator();
        x509V3CertificateGenerator.setSerialNumber(BigInteger.valueOf(1L));
        x509V3CertificateGenerator.setSubjectDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setIssuerDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setPublicKey(keyPair.getPublic());
        x509V3CertificateGenerator.setNotBefore(new Date());
        x509V3CertificateGenerator.setNotAfter(calendar.getTime());
        x509V3CertificateGenerator.setSignatureAlgorithm("ECDSAWITHSHA1");
        try {
            return x509V3CertificateGenerator.generate(keyPair.getPrivate(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to generate certificate for key", e));
            return null;
        }
    }

    private String a(String str) {
        return String.format("PHONE_AUTH_%s_KEY_PAIR", str).toLowerCase(Locale.US);
    }

    private String d(Context context) {
        e(context);
        String z = com.teslamotors.plugins.client.e.a(context).z();
        if (z == null) {
            String bigInteger = new BigInteger(130, new SecureRandom()).toString();
            com.teslamotors.plugins.client.e.a(context).e(b(bigInteger));
            return bigInteger;
        }
        return c(z);
    }

    private void e(Context context) {
        if (!this.f5255c.containsAlias("KeyStorePassKey")) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias("KeyStorePassKey").setSubject(new X500Principal("CN=localhost")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setKeySize(2048).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        }
    }

    private String b(String str) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, (RSAPublicKey) ((KeyStore.PrivateKeyEntry) this.f5255c.getEntry("KeyStorePassKey", null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
            cipherOutputStream.write(str.getBytes("UTF-8"));
            cipherOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to encrypt text", e));
            return null;
        }
    }

    private String c(String str) {
        try {
            PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) this.f5255c.getEntry("KeyStorePassKey", null)).getPrivateKey();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKey);
            CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str, 2)), cipher);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int read = cipherInputStream.read();
                if (read == -1) {
                    break;
                }
                arrayList.add(Byte.valueOf((byte) read));
            }
            byte[] bArr = new byte[arrayList.size()];
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = ((Byte) arrayList.get(i)).byteValue();
            }
            return new String(bArr, 0, bArr.length, "UTF-8");
        } catch (Exception e) {
            com.teslamotors.plugins.crashlytics.b.a(new Throwable("Failed to decrypt text", e));
            return null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }
}
