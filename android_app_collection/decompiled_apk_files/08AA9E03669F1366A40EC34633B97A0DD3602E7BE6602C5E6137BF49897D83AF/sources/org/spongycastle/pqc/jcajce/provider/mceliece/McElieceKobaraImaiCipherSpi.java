package org.spongycastle.pqc.jcajce.provider.mceliece;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters;
import org.spongycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;
import org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;
/* loaded from: classes2.dex */
public class McElieceKobaraImaiCipherSpi extends AsymmetricHybridCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private ByteArrayOutputStream buf;
    private McElieceKobaraImaiCipher cipher;
    private Digest digest;

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    protected int decryptOutputSize(int i) {
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    protected int encryptOutputSize(int i) {
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McElieceKobaraImaiCipher";
    }

    public McElieceKobaraImaiCipherSpi() {
        this.buf = new ByteArrayOutputStream();
        this.buf = new ByteArrayOutputStream();
    }

    protected McElieceKobaraImaiCipherSpi(Digest digest, McElieceKobaraImaiCipher mcElieceKobaraImaiCipher) {
        this.buf = new ByteArrayOutputStream();
        this.digest = digest;
        this.cipher = mcElieceKobaraImaiCipher;
        this.buf = new ByteArrayOutputStream();
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i, int i2) {
        this.buf.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i, int i2) {
        update(bArr, i, i2);
        if (this.opMode == 1) {
            try {
                return this.cipher.messageEncrypt(pad());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else if (this.opMode != 2) {
            return null;
        } else {
            byte[] byteArray = this.buf.toByteArray();
            this.buf.reset();
            try {
                return unpad(this.cipher.messageDecrypt(byteArray));
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    protected void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        this.buf.reset();
        ParametersWithRandom parametersWithRandom = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom);
        this.digest.reset();
        this.cipher.init(true, parametersWithRandom);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    protected void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.buf.reset();
        AsymmetricKeyParameter generatePrivateKeyParameter = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        this.digest.reset();
        this.cipher.init(false, generatePrivateKeyParameter);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) {
        if (key instanceof PublicKey) {
            return this.cipher.getKeySize((McElieceCCA2KeyParameters) McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key));
        } else if (key instanceof PrivateKey) {
            return this.cipher.getKeySize((McElieceCCA2KeyParameters) McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key));
        } else {
            throw new InvalidKeyException();
        }
    }

    private byte[] pad() {
        this.buf.write(1);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        return byteArray;
    }

    private byte[] unpad(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != 1) {
            throw new BadPaddingException("invalid ciphertext");
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public byte[] messageEncrypt() {
        try {
            return this.cipher.messageEncrypt(pad());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] messageDecrypt() {
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        try {
            return unpad(this.cipher.messageDecrypt(byteArray));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class McElieceKobaraImai extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai() {
            super(DigestFactory.createSHA1(), new McElieceKobaraImaiCipher());
        }
    }

    /* loaded from: classes2.dex */
    public static class McElieceKobaraImai224 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai224() {
            super(DigestFactory.createSHA224(), new McElieceKobaraImaiCipher());
        }
    }

    /* loaded from: classes2.dex */
    public static class McElieceKobaraImai256 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai256() {
            super(DigestFactory.createSHA256(), new McElieceKobaraImaiCipher());
        }
    }

    /* loaded from: classes2.dex */
    public static class McElieceKobaraImai384 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai384() {
            super(DigestFactory.createSHA384(), new McElieceKobaraImaiCipher());
        }
    }

    /* loaded from: classes2.dex */
    public static class McElieceKobaraImai512 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai512() {
            super(DigestFactory.createSHA512(), new McElieceKobaraImaiCipher());
        }
    }
}
