package org.spongycastle.jcajce.util;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
/* loaded from: classes.dex */
public class DefaultJcaJceHelper implements JcaJceHelper {
    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) {
        return Cipher.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) {
        return Mac.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) {
        return KeyAgreement.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) {
        return AlgorithmParameterGenerator.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) {
        return KeyGenerator.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) {
        return KeyPairGenerator.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) {
        return Signature.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public SecureRandom createSecureRandom(String str) {
        return SecureRandom.getInstance(str);
    }
}
