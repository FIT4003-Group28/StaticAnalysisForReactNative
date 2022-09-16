package org.spongycastle.math.ec;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class MontgomeryLadderMultiplier extends AbstractECMultiplier {
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint[] eCPointArr = new ECPoint[2];
        eCPointArr[0] = eCPoint.getCurve().getInfinity();
        eCPointArr[1] = eCPoint;
        int bitLength = bigInteger.bitLength();
        while (true) {
            bitLength--;
            if (bitLength >= 0) {
                ?? testBit = bigInteger.testBit(bitLength);
                int i = 1 - (testBit == true ? 1 : 0);
                eCPointArr[i] = eCPointArr[i].add(eCPointArr[testBit == true ? 1 : 0]);
                eCPointArr[testBit] = eCPointArr[testBit].twice();
            } else {
                return eCPointArr[0];
            }
        }
    }
}
