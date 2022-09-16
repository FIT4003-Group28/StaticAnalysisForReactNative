package org.spongycastle.jcajce.provider.drbg;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.crypto.prng.EntropySourceProvider;
import org.spongycastle.crypto.prng.SP800SecureRandomBuilder;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;
/* loaded from: classes.dex */
public class DRBG {
    private static final String PREFIX = "org.spongycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static final Object[] initialEntropySourceAndSpi = findSource();

    private static final Object[] findSource() {
        for (int i = 0; i < initialEntropySourceNames.length; i++) {
            String[] strArr = initialEntropySourceNames[i];
            try {
                return new Object[]{Class.forName(strArr[0]).newInstance(), Class.forName(strArr[1]).newInstance()};
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom() {
            super((SecureRandomSpi) DRBG.initialEntropySourceAndSpi[1], (Provider) DRBG.initialEntropySourceAndSpi[0]);
        }
    }

    private static SecureRandom createInitialEntropySource() {
        if (initialEntropySourceAndSpi != null) {
            return new CoreSecureRandom();
        }
        return new SecureRandom();
    }

    private static EntropySourceProvider createEntropySource() {
        final String property = System.getProperty("org.spongycastle.drbg.entropysource");
        return (EntropySourceProvider) AccessController.doPrivileged(new PrivilegedAction<EntropySourceProvider>() { // from class: org.spongycastle.jcajce.provider.drbg.DRBG.1
            @Override // java.security.PrivilegedAction
            public EntropySourceProvider run() {
                try {
                    return (EntropySourceProvider) DRBG.class.getClassLoader().loadClass(property).newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("entropy source " + property + " not created: " + e.getMessage(), e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z) {
        if (System.getProperty("org.spongycastle.drbg.entropysource") != null) {
            EntropySourceProvider createEntropySource = createEntropySource();
            EntropySource entropySource = createEntropySource.get(128);
            return new SP800SecureRandomBuilder(createEntropySource).setPersonalizationString(generateDefaultPersonalizationString(entropySource.getEntropy())).buildHash(new SHA512Digest(), Arrays.concatenate(entropySource.getEntropy(), entropySource.getEntropy()), z);
        }
        SecureRandom createInitialEntropySource = createInitialEntropySource();
        return new SP800SecureRandomBuilder(createInitialEntropySource, true).setPersonalizationString(generateDefaultPersonalizationString(createInitialEntropySource.generateSeed(16))).buildHash(new SHA512Digest(), createInitialEntropySource.generateSeed(32), z);
    }

    /* loaded from: classes.dex */
    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }
    }

    /* loaded from: classes.dex */
    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }
    }

    /* loaded from: classes.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Default"), bArr, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Nonce"), bArr, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
    }
}
