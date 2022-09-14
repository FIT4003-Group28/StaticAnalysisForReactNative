package org.spongycastle.pqc.jcajce.provider.newhope;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.spongycastle.pqc.crypto.ExchangePair;
import org.spongycastle.pqc.crypto.newhope.NHAgreement;
import org.spongycastle.pqc.crypto.newhope.NHExchangePairGenerator;
import org.spongycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private NHAgreement agreement;
    private NHExchangePairGenerator exchangePairGenerator;
    private BCNHPublicKey otherPartyKey;
    private byte[] shared;

    public KeyAgreementSpi() {
        super("NH", null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        if (key != null) {
            this.agreement = new NHAgreement();
            this.agreement.init(((BCNHPrivateKey) key).getKeyParams());
            return;
        }
        this.exchangePairGenerator = new NHExchangePairGenerator(secureRandom);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("NewHope does not require parameters");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) {
        if (!z) {
            throw new IllegalStateException("NewHope can only be between two parties.");
        }
        this.otherPartyKey = (BCNHPublicKey) key;
        if (this.exchangePairGenerator != null) {
            ExchangePair GenerateExchange = this.exchangePairGenerator.GenerateExchange((AsymmetricKeyParameter) this.otherPartyKey.getKeyParams());
            this.shared = GenerateExchange.getSharedValue();
            return new BCNHPublicKey((NHPublicKeyParameters) GenerateExchange.getPublicKey());
        }
        this.shared = this.agreement.calculateAgreement(this.otherPartyKey.getKeyParams());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        byte[] clone = Arrays.clone(this.shared);
        Arrays.fill(this.shared, (byte) 0);
        return clone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) {
        System.arraycopy(this.shared, 0, bArr, i, this.shared.length);
        Arrays.fill(this.shared, (byte) 0);
        return this.shared.length;
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return engineGenerateSecret();
    }
}
