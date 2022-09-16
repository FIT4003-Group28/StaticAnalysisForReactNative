package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;
/* loaded from: classes.dex */
public class SRP6Client {
    protected BigInteger A;
    protected BigInteger B;
    protected BigInteger Key;
    protected BigInteger M1;
    protected BigInteger M2;
    protected BigInteger N;
    protected BigInteger S;

    /* renamed from: a  reason: collision with root package name */
    protected BigInteger f5649a;
    protected Digest digest;
    protected BigInteger g;
    protected SecureRandom random;
    protected BigInteger u;
    protected BigInteger x;

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.N = bigInteger;
        this.g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.x = SRP6Util.calculateX(this.digest, this.N, bArr, bArr2, bArr3);
        this.f5649a = selectPrivateValue();
        this.A = this.g.modPow(this.f5649a, this.N);
        return this.A;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        this.B = SRP6Util.validatePublicValue(this.N, bigInteger);
        this.u = SRP6Util.calculateU(this.digest, this.N, this.A, this.B);
        this.S = calculateS();
        return this.S;
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.N, this.g, this.random);
    }

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.N, this.g);
        return this.B.subtract(this.g.modPow(this.x, this.N).multiply(calculateK).mod(this.N)).mod(this.N).modPow(this.u.multiply(this.x).add(this.f5649a), this.N);
    }

    public BigInteger calculateClientEvidenceMessage() {
        if (this.A == null || this.B == null || this.S == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        this.M1 = SRP6Util.calculateM1(this.digest, this.N, this.A, this.B, this.S);
        return this.M1;
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) {
        if (this.A == null || this.M1 == null || this.S == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.N, this.A, this.M1, this.S).equals(bigInteger)) {
            return false;
        }
        this.M2 = bigInteger;
        return true;
    }

    public BigInteger calculateSessionKey() {
        if (this.S == null || this.M1 == null || this.M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        this.Key = SRP6Util.calculateKey(this.digest, this.N, this.S);
        return this.Key;
    }
}
