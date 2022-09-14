package org.spongycastle.crypto.params;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f5661c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f5662d;
    private BigInteger h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f5661c = bigInteger;
        this.f5662d = bigInteger2;
        this.h = bigInteger3;
    }

    public BigInteger getC() {
        return this.f5661c;
    }

    public BigInteger getD() {
        return this.f5662d;
    }

    public BigInteger getH() {
        return this.h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f5661c.hashCode() ^ this.f5662d.hashCode()) ^ this.h.hashCode()) ^ super.hashCode();
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f5661c) && cramerShoupPublicKeyParameters.getD().equals(this.f5662d) && cramerShoupPublicKeyParameters.getH().equals(this.h) && super.equals(obj);
    }
}
