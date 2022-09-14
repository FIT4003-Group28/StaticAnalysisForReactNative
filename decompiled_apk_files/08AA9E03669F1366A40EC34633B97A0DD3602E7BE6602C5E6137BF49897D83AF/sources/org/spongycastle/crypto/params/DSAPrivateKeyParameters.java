package org.spongycastle.crypto.params;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {
    private BigInteger x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.x = bigInteger;
    }

    public BigInteger getX() {
        return this.x;
    }
}
