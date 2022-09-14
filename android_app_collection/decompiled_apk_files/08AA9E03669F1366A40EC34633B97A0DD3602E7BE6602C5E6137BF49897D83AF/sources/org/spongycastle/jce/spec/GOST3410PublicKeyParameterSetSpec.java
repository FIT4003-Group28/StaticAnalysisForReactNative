package org.spongycastle.jce.spec;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f5678a;
    private BigInteger p;
    private BigInteger q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.p = bigInteger;
        this.q = bigInteger2;
        this.f5678a = bigInteger3;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.q;
    }

    public BigInteger getA() {
        return this.f5678a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            return this.f5678a.equals(gOST3410PublicKeyParameterSetSpec.f5678a) && this.p.equals(gOST3410PublicKeyParameterSetSpec.p) && this.q.equals(gOST3410PublicKeyParameterSetSpec.q);
        }
        return false;
    }

    public int hashCode() {
        return (this.f5678a.hashCode() ^ this.p.hashCode()) ^ this.q.hashCode();
    }
}
