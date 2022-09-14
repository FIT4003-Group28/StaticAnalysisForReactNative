package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.math.ec.ECPoint;
/* loaded from: classes.dex */
public class DualECPoints {
    private final int cofactor;
    private final ECPoint p;
    private final ECPoint q;
    private final int securityStrength;

    private static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i != 0) {
                i2++;
            } else {
                return i2;
            }
        }
    }

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i;
        this.p = eCPoint;
        this.q = eCPoint2;
        this.cofactor = i2;
    }

    public int getSeedLen() {
        return this.p.getCurve().getFieldSize();
    }

    public int getMaxOutlen() {
        return ((this.p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.p;
    }

    public ECPoint getQ() {
        return this.q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getCofactor() {
        return this.cofactor;
    }
}
