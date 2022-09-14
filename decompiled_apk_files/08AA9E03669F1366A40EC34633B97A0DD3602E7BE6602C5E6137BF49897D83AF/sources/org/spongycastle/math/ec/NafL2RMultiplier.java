package org.spongycastle.math.ec;

import java.math.BigInteger;
/* loaded from: classes.dex */
public class NafL2RMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] generateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint normalize = eCPoint.normalize();
        ECPoint negate = normalize.negate();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = generateCompactNaf.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i = generateCompactNaf[length];
                infinity = infinity.twicePlus((i >> 16) < 0 ? negate : normalize).timesPow2(i & 65535);
            } else {
                return infinity;
            }
        }
    }
}
