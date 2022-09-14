package org.spongycastle.crypto.params;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* renamed from: d  reason: collision with root package name */
    BigInteger f5663d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f5663d = bigInteger;
    }

    public BigInteger getD() {
        return this.f5663d;
    }
}
