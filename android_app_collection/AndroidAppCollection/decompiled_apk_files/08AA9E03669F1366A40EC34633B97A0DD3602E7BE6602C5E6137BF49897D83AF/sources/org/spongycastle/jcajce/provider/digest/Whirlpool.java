package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.WhirlpoolDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
/* loaded from: classes.dex */
public class Whirlpool {
    private Whirlpool() {
    }

    /* loaded from: classes.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new WhirlpoolDigest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new WhirlpoolDigest((WhirlpoolDigest) this.digest);
            return digest;
        }
    }

    /* loaded from: classes.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new WhirlpoolDigest()));
        }
    }

    /* loaded from: classes.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACWHIRLPOOL", 512, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Whirlpool.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("MessageDigest.WHIRLPOOL", PREFIX + "$Digest");
            addHMACAlgorithm(configurableProvider, "WHIRLPOOL", PREFIX + "$HashMac", PREFIX + "$KeyGenerator");
        }
    }
}
