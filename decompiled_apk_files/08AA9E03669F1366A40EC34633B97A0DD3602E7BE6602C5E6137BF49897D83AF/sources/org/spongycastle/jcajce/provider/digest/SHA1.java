package org.spongycastle.jcajce.provider.digest;

import com.google.android.gms.common.util.AndroidUtilsLight;
import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
/* loaded from: classes.dex */
public class SHA1 {
    private SHA1() {
    }

    /* loaded from: classes.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    /* loaded from: classes.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    /* loaded from: classes.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes.dex */
    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    /* loaded from: classes.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", null, false, 2, 1, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA1.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("MessageDigest.SHA-1", PREFIX + "$Digest");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", McElieceCCA2KeyGenParameterSpec.SHA1);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", McElieceCCA2KeyGenParameterSpec.SHA1);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + OIWObjectIdentifiers.idSHA1, McElieceCCA2KeyGenParameterSpec.SHA1);
            addHMACAlgorithm(configurableProvider, AndroidUtilsLight.DIGEST_ALGORITHM_SHA1, PREFIX + "$HashMac", PREFIX + "$KeyGenerator");
            addHMACAlias(configurableProvider, AndroidUtilsLight.DIGEST_ALGORITHM_SHA1, PKCSObjectIdentifiers.id_hmacWithSHA1);
            addHMACAlias(configurableProvider, AndroidUtilsLight.DIGEST_ALGORITHM_SHA1, IANAObjectIdentifiers.hmacSHA1);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA", PREFIX + "$SHA1Mac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA1", PREFIX + "$SHA1Mac");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + OIWObjectIdentifiers.idSHA1, "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + OIWObjectIdentifiers.idSHA1, "PBEWITHHMACSHA");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", PREFIX + "$PBEWithMacKeyFactory");
        }
    }
}
