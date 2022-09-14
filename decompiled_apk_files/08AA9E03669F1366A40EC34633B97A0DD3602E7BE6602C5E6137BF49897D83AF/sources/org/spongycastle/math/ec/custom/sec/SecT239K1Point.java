package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
/* loaded from: classes2.dex */
public class SecT239K1Point extends ECPoint.AbstractF2m {
    public SecT239K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecT239K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SecT239K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }

    @Override // org.spongycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new SecT239K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECFieldElement getYCoord() {
        ECFieldElement eCFieldElement = this.x;
        ECFieldElement eCFieldElement2 = this.y;
        if (isInfinity() || eCFieldElement.isZero()) {
            return eCFieldElement2;
        }
        ECFieldElement multiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
        ECFieldElement eCFieldElement3 = this.zs[0];
        return !eCFieldElement3.isOne() ? multiply.divide(eCFieldElement3) : multiply;
    }

    @Override // org.spongycastle.math.ec.ECPoint
    protected boolean getCompressionYTilde() {
        ECFieldElement rawXCoord = getRawXCoord();
        return !rawXCoord.isZero() && getRawYCoord().testBitZero() != rawXCoord.testBitZero();
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        ECFieldElement eCFieldElement;
        ECFieldElement eCFieldElement2;
        ECFieldElement eCFieldElement3;
        ECFieldElement multiply;
        ECFieldElement eCFieldElement4;
        ECFieldElement eCFieldElement5;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement6 = this.x;
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        if (eCFieldElement6.isZero()) {
            if (rawXCoord.isZero()) {
                return curve.getInfinity();
            }
            return eCPoint.add(this);
        }
        ECFieldElement eCFieldElement7 = this.y;
        ECFieldElement eCFieldElement8 = this.zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        boolean isOne = eCFieldElement8.isOne();
        if (!isOne) {
            eCFieldElement = rawXCoord.multiply(eCFieldElement8);
            eCFieldElement2 = rawYCoord.multiply(eCFieldElement8);
        } else {
            eCFieldElement = rawXCoord;
            eCFieldElement2 = rawYCoord;
        }
        boolean isOne2 = zCoord.isOne();
        if (!isOne2) {
            eCFieldElement6 = eCFieldElement6.multiply(zCoord);
            eCFieldElement3 = eCFieldElement7.multiply(zCoord);
        } else {
            eCFieldElement3 = eCFieldElement7;
        }
        ECFieldElement add = eCFieldElement3.add(eCFieldElement2);
        ECFieldElement add2 = eCFieldElement6.add(eCFieldElement);
        if (add2.isZero()) {
            if (add.isZero()) {
                return twice();
            }
            return curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            ECPoint normalize = normalize();
            ECFieldElement xCoord = normalize.getXCoord();
            ECFieldElement yCoord = normalize.getYCoord();
            ECFieldElement divide = yCoord.add(rawYCoord).divide(xCoord);
            eCFieldElement4 = divide.square().add(divide).add(xCoord);
            if (eCFieldElement4.isZero()) {
                return new SecT239K1Point(curve, eCFieldElement4, curve.getB(), this.withCompression);
            }
            eCFieldElement5 = divide.multiply(xCoord.add(eCFieldElement4)).add(eCFieldElement4).add(yCoord).divide(eCFieldElement4).add(eCFieldElement4);
            multiply = curve.fromBigInteger(ECConstants.ONE);
        } else {
            ECFieldElement square = add2.square();
            ECFieldElement multiply2 = add.multiply(eCFieldElement6);
            ECFieldElement multiply3 = add.multiply(eCFieldElement);
            ECFieldElement multiply4 = multiply2.multiply(multiply3);
            if (multiply4.isZero()) {
                return new SecT239K1Point(curve, multiply4, curve.getB(), this.withCompression);
            }
            ECFieldElement multiply5 = add.multiply(square);
            multiply = !isOne2 ? multiply5.multiply(zCoord) : multiply5;
            ECFieldElement squarePlusProduct = multiply3.add(square).squarePlusProduct(multiply, eCFieldElement7.add(eCFieldElement8));
            if (!isOne) {
                multiply = multiply.multiply(eCFieldElement8);
            }
            eCFieldElement4 = multiply4;
            eCFieldElement5 = squarePlusProduct;
        }
        return new SecT239K1Point(curve, eCFieldElement4, eCFieldElement5, new ECFieldElement[]{multiply}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twice() {
        ECFieldElement multiply;
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement = this.x;
        if (eCFieldElement.isZero()) {
            return curve.getInfinity();
        }
        ECFieldElement eCFieldElement2 = this.y;
        ECFieldElement eCFieldElement3 = this.zs[0];
        boolean isOne = eCFieldElement3.isOne();
        ECFieldElement square = isOne ? eCFieldElement3 : eCFieldElement3.square();
        if (isOne) {
            multiply = eCFieldElement2.square().add(eCFieldElement2);
        } else {
            multiply = eCFieldElement2.add(eCFieldElement3).multiply(eCFieldElement2);
        }
        if (multiply.isZero()) {
            return new SecT239K1Point(curve, multiply, curve.getB(), this.withCompression);
        }
        ECFieldElement square2 = multiply.square();
        ECFieldElement multiply2 = isOne ? multiply : multiply.multiply(square);
        ECFieldElement square3 = eCFieldElement2.add(eCFieldElement).square();
        if (!isOne) {
            eCFieldElement3 = square.square();
        }
        return new SecT239K1Point(curve, square2, square3.add(multiply).add(square).multiply(square3).add(eCFieldElement3).add(square2).add(multiply2), new ECFieldElement[]{multiply2}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement = this.x;
        if (eCFieldElement.isZero()) {
            return eCPoint;
        }
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(eCPoint);
        }
        ECFieldElement eCFieldElement2 = this.y;
        ECFieldElement eCFieldElement3 = this.zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement square = eCFieldElement.square();
        ECFieldElement square2 = eCFieldElement2.square();
        ECFieldElement square3 = eCFieldElement3.square();
        ECFieldElement add = square2.add(eCFieldElement2.multiply(eCFieldElement3));
        ECFieldElement addOne = rawYCoord.addOne();
        ECFieldElement multiplyPlusProduct = addOne.multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
        ECFieldElement multiply = rawXCoord.multiply(square3);
        ECFieldElement square4 = multiply.add(add).square();
        if (square4.isZero()) {
            if (multiplyPlusProduct.isZero()) {
                return eCPoint.twice();
            }
            return curve.getInfinity();
        } else if (multiplyPlusProduct.isZero()) {
            return new SecT239K1Point(curve, multiplyPlusProduct, curve.getB(), this.withCompression);
        } else {
            ECFieldElement multiply2 = multiplyPlusProduct.square().multiply(multiply);
            ECFieldElement multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
            return new SecT239K1Point(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new ECFieldElement[]{multiply3}, this.withCompression);
        }
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint negate() {
        if (isInfinity()) {
            return this;
        }
        ECFieldElement eCFieldElement = this.x;
        if (eCFieldElement.isZero()) {
            return this;
        }
        ECFieldElement eCFieldElement2 = this.y;
        ECFieldElement eCFieldElement3 = this.zs[0];
        return new SecT239K1Point(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
    }
}
