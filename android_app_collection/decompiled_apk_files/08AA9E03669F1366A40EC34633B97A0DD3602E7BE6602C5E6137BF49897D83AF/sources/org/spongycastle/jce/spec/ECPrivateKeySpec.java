package org.spongycastle.jce.spec;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f5676d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f5676d = bigInteger;
    }

    public BigInteger getD() {
        return this.f5676d;
    }
}
