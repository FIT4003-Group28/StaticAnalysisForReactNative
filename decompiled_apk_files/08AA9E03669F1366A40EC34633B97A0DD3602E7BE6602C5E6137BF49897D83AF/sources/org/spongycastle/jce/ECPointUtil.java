package org.spongycastle.jce;

import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.spongycastle.math.ec.ECCurve;
/* loaded from: classes.dex */
public class ECPointUtil {
    public static ECPoint decodePoint(EllipticCurve ellipticCurve, byte[] bArr) {
        ECCurve f2m;
        if (ellipticCurve.getField() instanceof ECFieldFp) {
            f2m = new ECCurve.Fp(((ECFieldFp) ellipticCurve.getField()).getP(), ellipticCurve.getA(), ellipticCurve.getB());
        } else {
            int[] midTermsOfReductionPolynomial = ((ECFieldF2m) ellipticCurve.getField()).getMidTermsOfReductionPolynomial();
            if (midTermsOfReductionPolynomial.length == 3) {
                f2m = new ECCurve.F2m(((ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[2], midTermsOfReductionPolynomial[1], midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB());
            } else {
                f2m = new ECCurve.F2m(((ECFieldF2m) ellipticCurve.getField()).getM(), midTermsOfReductionPolynomial[0], ellipticCurve.getA(), ellipticCurve.getB());
            }
        }
        org.spongycastle.math.ec.ECPoint decodePoint = f2m.decodePoint(bArr);
        return new ECPoint(decodePoint.getAffineXCoord().toBigInteger(), decodePoint.getAffineYCoord().toBigInteger());
    }
}
