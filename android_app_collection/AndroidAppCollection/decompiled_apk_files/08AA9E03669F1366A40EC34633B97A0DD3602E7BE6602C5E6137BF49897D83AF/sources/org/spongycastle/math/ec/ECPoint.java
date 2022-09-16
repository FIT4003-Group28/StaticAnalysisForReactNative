package org.spongycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.math.ec.ECFieldElement;
/* loaded from: classes.dex */
public abstract class ECPoint {
    protected static ECFieldElement[] EMPTY_ZS = new ECFieldElement[0];
    protected ECCurve curve;
    protected Hashtable preCompTable;
    protected boolean withCompression;
    protected ECFieldElement x;
    protected ECFieldElement y;
    protected ECFieldElement[] zs;

    public abstract ECPoint add(ECPoint eCPoint);

    protected abstract ECPoint detach();

    protected abstract boolean getCompressionYTilde();

    public abstract ECPoint negate();

    protected abstract boolean satisfiesCurveEquation();

    public abstract ECPoint subtract(ECPoint eCPoint);

    public abstract ECPoint twice();

    protected static ECFieldElement[] getInitialZCoords(ECCurve eCCurve) {
        int coordinateSystem = eCCurve == null ? 0 : eCCurve.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return EMPTY_ZS;
        }
        ECFieldElement fromBigInteger = eCCurve.fromBigInteger(ECConstants.ONE);
        if (coordinateSystem != 6) {
            switch (coordinateSystem) {
                case 1:
                case 2:
                    break;
                case 3:
                    return new ECFieldElement[]{fromBigInteger, fromBigInteger, fromBigInteger};
                case 4:
                    return new ECFieldElement[]{fromBigInteger, eCCurve.getA()};
                default:
                    throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new ECFieldElement[]{fromBigInteger};
    }

    protected ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, getInitialZCoords(eCCurve));
    }

    protected ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        this.preCompTable = null;
        this.curve = eCCurve;
        this.x = eCFieldElement;
        this.y = eCFieldElement2;
        this.zs = eCFieldElementArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean satisfiesCofactor() {
        BigInteger cofactor = this.curve.getCofactor();
        return cofactor == null || cofactor.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, cofactor).isInfinity();
    }

    public final ECPoint getDetachedPoint() {
        return normalize().detach();
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    protected int getCurveCoordinateSystem() {
        if (this.curve == null) {
            return 0;
        }
        return this.curve.getCoordinateSystem();
    }

    public ECFieldElement getX() {
        return normalize().getXCoord();
    }

    public ECFieldElement getY() {
        return normalize().getYCoord();
    }

    public ECFieldElement getAffineXCoord() {
        checkNormalized();
        return getXCoord();
    }

    public ECFieldElement getAffineYCoord() {
        checkNormalized();
        return getYCoord();
    }

    public ECFieldElement getXCoord() {
        return this.x;
    }

    public ECFieldElement getYCoord() {
        return this.y;
    }

    public ECFieldElement getZCoord(int i) {
        if (i < 0 || i >= this.zs.length) {
            return null;
        }
        return this.zs[i];
    }

    public ECFieldElement[] getZCoords() {
        int length = this.zs.length;
        if (length == 0) {
            return EMPTY_ZS;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[length];
        System.arraycopy(this.zs, 0, eCFieldElementArr, 0, length);
        return eCFieldElementArr;
    }

    public final ECFieldElement getRawXCoord() {
        return this.x;
    }

    public final ECFieldElement getRawYCoord() {
        return this.y;
    }

    protected final ECFieldElement[] getRawZCoords() {
        return this.zs;
    }

    protected void checkNormalized() {
        if (!isNormalized()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public boolean isNormalized() {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        return curveCoordinateSystem == 0 || curveCoordinateSystem == 5 || isInfinity() || this.zs[0].isOne();
    }

    public ECPoint normalize() {
        int curveCoordinateSystem;
        if (isInfinity() || (curveCoordinateSystem = getCurveCoordinateSystem()) == 0 || curveCoordinateSystem == 5) {
            return this;
        }
        ECFieldElement zCoord = getZCoord(0);
        return zCoord.isOne() ? this : normalize(zCoord.invert());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ECPoint normalize(ECFieldElement eCFieldElement) {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        if (curveCoordinateSystem != 6) {
            switch (curveCoordinateSystem) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    ECFieldElement square = eCFieldElement.square();
                    return createScaledPoint(square, square.multiply(eCFieldElement));
                default:
                    throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return createScaledPoint(eCFieldElement, eCFieldElement);
    }

    protected ECPoint createScaledPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord().multiply(eCFieldElement2), this.withCompression);
    }

    public boolean isInfinity() {
        return this.x == null || this.y == null || (this.zs.length > 0 && this.zs[0].isZero());
    }

    public boolean isCompressed() {
        return this.withCompression;
    }

    public boolean isValid() {
        return isInfinity() || getCurve() == null || (satisfiesCurveEquation() && satisfiesCofactor());
    }

    public ECPoint scaleX(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord(), getRawZCoords(), this.withCompression);
    }

    public ECPoint scaleY(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord(), getRawYCoord().multiply(eCFieldElement), getRawZCoords(), this.withCompression);
    }

    public boolean equals(ECPoint eCPoint) {
        ECPoint eCPoint2;
        ECPoint eCPoint3;
        if (eCPoint == null) {
            return false;
        }
        ECCurve curve = getCurve();
        ECCurve curve2 = eCPoint.getCurve();
        boolean z = curve == null;
        boolean z2 = curve2 == null;
        boolean isInfinity = isInfinity();
        boolean isInfinity2 = eCPoint.isInfinity();
        if (isInfinity || isInfinity2) {
            if (!isInfinity || !isInfinity2) {
                return false;
            }
            return z || z2 || curve.equals(curve2);
        }
        if (!z || !z2) {
            if (!z) {
                if (z2) {
                    eCPoint3 = eCPoint;
                    eCPoint2 = normalize();
                } else if (!curve.equals(curve2)) {
                    return false;
                } else {
                    ECPoint[] eCPointArr = {this, curve.importPoint(eCPoint)};
                    curve.normalizeAll(eCPointArr);
                    eCPoint2 = eCPointArr[0];
                    eCPoint3 = eCPointArr[1];
                }
                return eCPoint2.getXCoord().equals(eCPoint3.getXCoord()) && eCPoint2.getYCoord().equals(eCPoint3.getYCoord());
            }
            eCPoint = eCPoint.normalize();
        }
        eCPoint3 = eCPoint;
        eCPoint2 = this;
        if (eCPoint2.getXCoord().equals(eCPoint3.getXCoord())) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ECPoint) {
            return equals((ECPoint) obj);
        }
        return false;
    }

    public int hashCode() {
        ECCurve curve = getCurve();
        int i = curve == null ? 0 : ~curve.hashCode();
        if (!isInfinity()) {
            ECPoint normalize = normalize();
            return (i ^ (normalize.getXCoord().hashCode() * 17)) ^ (normalize.getYCoord().hashCode() * 257);
        }
        return i;
    }

    public String toString() {
        if (isInfinity()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(',');
        stringBuffer.append(getRawYCoord());
        for (int i = 0; i < this.zs.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.zs[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public byte[] getEncoded() {
        return getEncoded(this.withCompression);
    }

    public byte[] getEncoded(boolean z) {
        if (isInfinity()) {
            return new byte[1];
        }
        ECPoint normalize = normalize();
        byte[] encoded = normalize.getXCoord().getEncoded();
        if (z) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (normalize.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = normalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    public ECPoint timesPow2(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        ECPoint eCPoint = this;
        while (true) {
            i--;
            if (i < 0) {
                return eCPoint;
            }
            eCPoint = eCPoint.twice();
        }
    }

    public ECPoint twicePlus(ECPoint eCPoint) {
        return twice().add(eCPoint);
    }

    public ECPoint threeTimes() {
        return twicePlus(this);
    }

    public ECPoint multiply(BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    /* loaded from: classes.dex */
    public static abstract class AbstractFp extends ECPoint {
        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            return getAffineYCoord().testBitZero();
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            ECFieldElement eCFieldElement = this.x;
            ECFieldElement eCFieldElement2 = this.y;
            ECFieldElement a2 = this.curve.getA();
            ECFieldElement b2 = this.curve.getB();
            ECFieldElement square = eCFieldElement2.square();
            switch (getCurveCoordinateSystem()) {
                case 0:
                    break;
                case 1:
                    ECFieldElement eCFieldElement3 = this.zs[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement square2 = eCFieldElement3.square();
                        ECFieldElement multiply = eCFieldElement3.multiply(square2);
                        square = square.multiply(eCFieldElement3);
                        a2 = a2.multiply(square2);
                        b2 = b2.multiply(multiply);
                        break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    ECFieldElement eCFieldElement4 = this.zs[0];
                    if (!eCFieldElement4.isOne()) {
                        ECFieldElement square3 = eCFieldElement4.square();
                        ECFieldElement square4 = square3.square();
                        ECFieldElement multiply2 = square3.multiply(square4);
                        a2 = a2.multiply(square4);
                        b2 = b2.multiply(multiply2);
                        break;
                    }
                    break;
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
            return square.equals(eCFieldElement.square().add(a2).multiply(eCFieldElement).add(b2));
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }
    }

    /* loaded from: classes.dex */
    public static class Fp extends AbstractFp {
        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.withCompression = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected ECPoint detach() {
            return new Fp(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECFieldElement getZCoord(int i) {
            if (i == 1 && 4 == getCurveCoordinateSystem()) {
                return getJacobianModifiedW();
            }
            return super.getZCoord(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
        @Override // org.spongycastle.math.ec.ECPoint
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public org.spongycastle.math.ec.ECPoint add(org.spongycastle.math.ec.ECPoint r18) {
            /*
                Method dump skipped, instructions count: 552
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.math.ec.ECPoint.Fp.add(org.spongycastle.math.ec.ECPoint):org.spongycastle.math.ec.ECPoint");
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElement;
            ECFieldElement four;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement2 = this.y;
            if (eCFieldElement2.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement3 = this.x;
            if (coordinateSystem != 4) {
                switch (coordinateSystem) {
                    case 0:
                        ECFieldElement divide = three(eCFieldElement3.square()).add(getCurve().getA()).divide(two(eCFieldElement2));
                        ECFieldElement subtract = divide.square().subtract(two(eCFieldElement3));
                        return new Fp(curve, subtract, divide.multiply(eCFieldElement3.subtract(subtract)).subtract(eCFieldElement2), this.withCompression);
                    case 1:
                        ECFieldElement eCFieldElement4 = this.zs[0];
                        boolean isOne = eCFieldElement4.isOne();
                        ECFieldElement a2 = curve.getA();
                        if (!a2.isZero() && !isOne) {
                            a2 = a2.multiply(eCFieldElement4.square());
                        }
                        ECFieldElement add = a2.add(three(eCFieldElement3.square()));
                        ECFieldElement multiply = isOne ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElement4);
                        ECFieldElement square = isOne ? eCFieldElement2.square() : multiply.multiply(eCFieldElement2);
                        ECFieldElement four2 = four(eCFieldElement3.multiply(square));
                        ECFieldElement subtract2 = add.square().subtract(two(four2));
                        ECFieldElement two = two(multiply);
                        ECFieldElement multiply2 = subtract2.multiply(two);
                        ECFieldElement two2 = two(square);
                        return new Fp(curve, multiply2, four2.subtract(subtract2).multiply(add).subtract(two(two2.square())), new ECFieldElement[]{two(isOne ? two(two2) : two.square()).multiply(multiply)}, this.withCompression);
                    case 2:
                        ECFieldElement eCFieldElement5 = this.zs[0];
                        boolean isOne2 = eCFieldElement5.isOne();
                        ECFieldElement square2 = eCFieldElement2.square();
                        ECFieldElement square3 = square2.square();
                        ECFieldElement a3 = curve.getA();
                        ECFieldElement negate = a3.negate();
                        if (negate.toBigInteger().equals(BigInteger.valueOf(3L))) {
                            ECFieldElement square4 = isOne2 ? eCFieldElement5 : eCFieldElement5.square();
                            eCFieldElement = three(eCFieldElement3.add(square4).multiply(eCFieldElement3.subtract(square4)));
                            four = four(square2.multiply(eCFieldElement3));
                        } else {
                            ECFieldElement three = three(eCFieldElement3.square());
                            if (isOne2) {
                                eCFieldElement = three.add(a3);
                            } else if (!a3.isZero()) {
                                ECFieldElement square5 = eCFieldElement5.square().square();
                                if (negate.bitLength() < a3.bitLength()) {
                                    eCFieldElement = three.subtract(square5.multiply(negate));
                                } else {
                                    eCFieldElement = three.add(square5.multiply(a3));
                                }
                            } else {
                                eCFieldElement = three;
                            }
                            four = four(eCFieldElement3.multiply(square2));
                        }
                        ECFieldElement subtract3 = eCFieldElement.square().subtract(two(four));
                        ECFieldElement subtract4 = four.subtract(subtract3).multiply(eCFieldElement).subtract(eight(square3));
                        ECFieldElement two3 = two(eCFieldElement2);
                        if (!isOne2) {
                            two3 = two3.multiply(eCFieldElement5);
                        }
                        return new Fp(curve, subtract3, subtract4, new ECFieldElement[]{two3}, this.withCompression);
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return twiceJacobianModified(true);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twicePlus(ECPoint eCPoint) {
            if (this == eCPoint) {
                return threeTimes();
            }
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return twice();
            }
            ECFieldElement eCFieldElement = this.y;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(false).add(eCPoint);
                }
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = this.x;
            ECFieldElement eCFieldElement3 = eCPoint.x;
            ECFieldElement eCFieldElement4 = eCPoint.y;
            ECFieldElement subtract = eCFieldElement3.subtract(eCFieldElement2);
            ECFieldElement subtract2 = eCFieldElement4.subtract(eCFieldElement);
            if (subtract.isZero()) {
                return subtract2.isZero() ? threeTimes() : this;
            }
            ECFieldElement square = subtract.square();
            ECFieldElement subtract3 = square.multiply(two(eCFieldElement2).add(eCFieldElement3)).subtract(subtract2.square());
            if (subtract3.isZero()) {
                return curve.getInfinity();
            }
            ECFieldElement invert = subtract3.multiply(subtract).invert();
            ECFieldElement multiply = subtract3.multiply(invert).multiply(subtract2);
            ECFieldElement subtract4 = two(eCFieldElement).multiply(square).multiply(subtract).multiply(invert).subtract(multiply);
            ECFieldElement add = subtract4.subtract(multiply).multiply(multiply.add(subtract4)).add(eCFieldElement3);
            return new Fp(curve, add, eCFieldElement2.subtract(add).multiply(subtract4).subtract(eCFieldElement), this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint threeTimes() {
            if (isInfinity()) {
                return this;
            }
            ECFieldElement eCFieldElement = this.y;
            if (eCFieldElement.isZero()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(false).add(this);
                }
                return twice().add(this);
            }
            ECFieldElement eCFieldElement2 = this.x;
            ECFieldElement two = two(eCFieldElement);
            ECFieldElement square = two.square();
            ECFieldElement add = three(eCFieldElement2.square()).add(getCurve().getA());
            ECFieldElement subtract = three(eCFieldElement2).multiply(square).subtract(add.square());
            if (subtract.isZero()) {
                return getCurve().getInfinity();
            }
            ECFieldElement invert = subtract.multiply(two).invert();
            ECFieldElement multiply = subtract.multiply(invert).multiply(add);
            ECFieldElement subtract2 = square.square().multiply(invert).subtract(multiply);
            ECFieldElement add2 = subtract2.subtract(multiply).multiply(multiply.add(subtract2)).add(eCFieldElement2);
            return new Fp(curve, add2, eCFieldElement2.subtract(add2).multiply(subtract2).subtract(eCFieldElement), this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint timesPow2(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i == 0 || isInfinity()) {
                return this;
            }
            if (i == 1) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.y;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement a2 = curve.getA();
            ECFieldElement eCFieldElement2 = this.x;
            ECFieldElement fromBigInteger = this.zs.length < 1 ? curve.fromBigInteger(ECConstants.ONE) : this.zs[0];
            if (!fromBigInteger.isOne()) {
                if (coordinateSystem != 4) {
                    switch (coordinateSystem) {
                        case 0:
                            break;
                        case 1:
                            ECFieldElement square = fromBigInteger.square();
                            eCFieldElement2 = eCFieldElement2.multiply(fromBigInteger);
                            eCFieldElement = eCFieldElement.multiply(square);
                            a2 = calculateJacobianModifiedW(fromBigInteger, square);
                            break;
                        case 2:
                            a2 = calculateJacobianModifiedW(fromBigInteger, null);
                            break;
                        default:
                            throw new IllegalStateException("unsupported coordinate system");
                    }
                } else {
                    a2 = getJacobianModifiedW();
                }
            }
            ECFieldElement eCFieldElement3 = fromBigInteger;
            ECFieldElement eCFieldElement4 = a2;
            ECFieldElement eCFieldElement5 = eCFieldElement;
            int i2 = 0;
            while (i2 < i) {
                if (eCFieldElement5.isZero()) {
                    return curve.getInfinity();
                }
                ECFieldElement three = three(eCFieldElement2.square());
                ECFieldElement two = two(eCFieldElement5);
                ECFieldElement multiply = two.multiply(eCFieldElement5);
                ECFieldElement two2 = two(eCFieldElement2.multiply(multiply));
                ECFieldElement two3 = two(multiply.square());
                if (!eCFieldElement4.isZero()) {
                    three = three.add(eCFieldElement4);
                    eCFieldElement4 = two(two3.multiply(eCFieldElement4));
                }
                ECFieldElement subtract = three.square().subtract(two(two2));
                eCFieldElement5 = three.multiply(two2.subtract(subtract)).subtract(two3);
                eCFieldElement3 = eCFieldElement3.isOne() ? two : two.multiply(eCFieldElement3);
                i2++;
                eCFieldElement2 = subtract;
            }
            if (coordinateSystem != 4) {
                switch (coordinateSystem) {
                    case 0:
                        ECFieldElement invert = eCFieldElement3.invert();
                        ECFieldElement square2 = invert.square();
                        return new Fp(curve, eCFieldElement2.multiply(square2), eCFieldElement5.multiply(square2.multiply(invert)), this.withCompression);
                    case 1:
                        return new Fp(curve, eCFieldElement2.multiply(eCFieldElement3), eCFieldElement5, new ECFieldElement[]{eCFieldElement3.multiply(eCFieldElement3.square())}, this.withCompression);
                    case 2:
                        return new Fp(curve, eCFieldElement2, eCFieldElement5, new ECFieldElement[]{eCFieldElement3}, this.withCompression);
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return new Fp(curve, eCFieldElement2, eCFieldElement5, new ECFieldElement[]{eCFieldElement3, eCFieldElement4}, this.withCompression);
        }

        protected ECFieldElement two(ECFieldElement eCFieldElement) {
            return eCFieldElement.add(eCFieldElement);
        }

        protected ECFieldElement three(ECFieldElement eCFieldElement) {
            return two(eCFieldElement).add(eCFieldElement);
        }

        protected ECFieldElement four(ECFieldElement eCFieldElement) {
            return two(two(eCFieldElement));
        }

        protected ECFieldElement eight(ECFieldElement eCFieldElement) {
            return four(two(eCFieldElement));
        }

        protected ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
            return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint negate() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            if (curve.getCoordinateSystem() != 0) {
                return new Fp(curve, this.x, this.y.negate(), this.zs, this.withCompression);
            }
            return new Fp(curve, this.x, this.y.negate(), this.withCompression);
        }

        protected ECFieldElement calculateJacobianModifiedW(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            ECFieldElement a2 = getCurve().getA();
            if (a2.isZero() || eCFieldElement.isOne()) {
                return a2;
            }
            if (eCFieldElement2 == null) {
                eCFieldElement2 = eCFieldElement.square();
            }
            ECFieldElement square = eCFieldElement2.square();
            ECFieldElement negate = a2.negate();
            if (negate.bitLength() < a2.bitLength()) {
                return square.multiply(negate).negate();
            }
            return square.multiply(a2);
        }

        protected ECFieldElement getJacobianModifiedW() {
            ECFieldElement eCFieldElement = this.zs[1];
            if (eCFieldElement == null) {
                ECFieldElement[] eCFieldElementArr = this.zs;
                ECFieldElement calculateJacobianModifiedW = calculateJacobianModifiedW(this.zs[0], null);
                eCFieldElementArr[1] = calculateJacobianModifiedW;
                return calculateJacobianModifiedW;
            }
            return eCFieldElement;
        }

        protected Fp twiceJacobianModified(boolean z) {
            ECFieldElement eCFieldElement = this.x;
            ECFieldElement eCFieldElement2 = this.y;
            ECFieldElement eCFieldElement3 = this.zs[0];
            ECFieldElement jacobianModifiedW = getJacobianModifiedW();
            ECFieldElement add = three(eCFieldElement.square()).add(jacobianModifiedW);
            ECFieldElement two = two(eCFieldElement2);
            ECFieldElement multiply = two.multiply(eCFieldElement2);
            ECFieldElement two2 = two(eCFieldElement.multiply(multiply));
            ECFieldElement subtract = add.square().subtract(two(two2));
            ECFieldElement two3 = two(multiply.square());
            ECFieldElement subtract2 = add.multiply(two2.subtract(subtract)).subtract(two3);
            ECFieldElement two4 = z ? two(two3.multiply(jacobianModifiedW)) : null;
            if (!eCFieldElement3.isOne()) {
                two = two.multiply(eCFieldElement3);
            }
            return new Fp(getCurve(), subtract, subtract2, new ECFieldElement[]{two, two4}, this.withCompression);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AbstractF2m extends ECPoint {
        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            ECFieldElement multiplyPlusProduct;
            ECFieldElement squarePlusProduct;
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.x;
            ECFieldElement a2 = curve.getA();
            ECFieldElement b2 = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 6) {
                ECFieldElement eCFieldElement2 = this.zs[0];
                boolean isOne = eCFieldElement2.isOne();
                if (eCFieldElement.isZero()) {
                    ECFieldElement square = this.y.square();
                    if (!isOne) {
                        b2 = b2.multiply(eCFieldElement2.square());
                    }
                    return square.equals(b2);
                }
                ECFieldElement eCFieldElement3 = this.y;
                ECFieldElement square2 = eCFieldElement.square();
                if (isOne) {
                    multiplyPlusProduct = eCFieldElement3.square().add(eCFieldElement3).add(a2);
                    squarePlusProduct = square2.square().add(b2);
                } else {
                    ECFieldElement square3 = eCFieldElement2.square();
                    ECFieldElement square4 = square3.square();
                    multiplyPlusProduct = eCFieldElement3.add(eCFieldElement2).multiplyPlusProduct(eCFieldElement3, a2, square3);
                    squarePlusProduct = square2.squarePlusProduct(b2, square4);
                }
                return multiplyPlusProduct.multiply(square2).equals(squarePlusProduct);
            }
            ECFieldElement eCFieldElement4 = this.y;
            ECFieldElement multiply = eCFieldElement4.add(eCFieldElement).multiply(eCFieldElement4);
            switch (coordinateSystem) {
                case 0:
                    break;
                default:
                    throw new IllegalStateException("unsupported coordinate system");
                case 1:
                    ECFieldElement eCFieldElement5 = this.zs[0];
                    if (!eCFieldElement5.isOne()) {
                        ECFieldElement multiply2 = eCFieldElement5.multiply(eCFieldElement5.square());
                        multiply = multiply.multiply(eCFieldElement5);
                        a2 = a2.multiply(eCFieldElement5);
                        b2 = b2.multiply(multiply2);
                        break;
                    }
                    break;
            }
            return multiply.equals(eCFieldElement.add(a2).multiply(eCFieldElement.square()).add(b2));
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint scaleX(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            switch (getCurveCoordinateSystem()) {
                case 5:
                    ECFieldElement rawXCoord = getRawXCoord();
                    return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).divide(eCFieldElement).add(rawXCoord.multiply(eCFieldElement)), getRawZCoords(), this.withCompression);
                case 6:
                    ECFieldElement rawXCoord2 = getRawXCoord();
                    ECFieldElement rawYCoord = getRawYCoord();
                    ECFieldElement eCFieldElement2 = getRawZCoords()[0];
                    ECFieldElement multiply = rawXCoord2.multiply(eCFieldElement.square());
                    return getCurve().createRawPoint(multiply, rawYCoord.add(rawXCoord2).add(multiply), new ECFieldElement[]{eCFieldElement2.multiply(eCFieldElement)}, this.withCompression);
                default:
                    return super.scaleX(eCFieldElement);
            }
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint scaleY(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            switch (getCurveCoordinateSystem()) {
                case 5:
                case 6:
                    ECFieldElement rawXCoord = getRawXCoord();
                    return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).multiply(eCFieldElement).add(rawXCoord), getRawZCoords(), this.withCompression);
                default:
                    return super.scaleY(eCFieldElement);
            }
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractF2m tau() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.x;
            switch (coordinateSystem) {
                case 0:
                case 5:
                    return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.y.square(), this.withCompression);
                case 1:
                case 6:
                    return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.y.square(), new ECFieldElement[]{this.zs[0].square()}, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public AbstractF2m tauPow(int i) {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.x;
            switch (coordinateSystem) {
                case 0:
                case 5:
                    return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i), this.y.squarePow(i), this.withCompression);
                case 1:
                case 6:
                    return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i), this.y.squarePow(i), new ECFieldElement[]{this.zs[0].squarePow(i)}, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class F2m extends AbstractF2m {
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (eCFieldElement != null) {
                ECFieldElement.F2m.checkFieldElements(this.x, this.y);
                if (eCCurve != null) {
                    ECFieldElement.F2m.checkFieldElements(this.x, this.curve.getA());
                }
            }
            this.withCompression = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected ECPoint detach() {
            return new F2m(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECFieldElement getYCoord() {
            int curveCoordinateSystem = getCurveCoordinateSystem();
            switch (curveCoordinateSystem) {
                case 5:
                case 6:
                    ECFieldElement eCFieldElement = this.x;
                    ECFieldElement eCFieldElement2 = this.y;
                    if (isInfinity() || eCFieldElement.isZero()) {
                        return eCFieldElement2;
                    }
                    ECFieldElement multiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
                    if (6 != curveCoordinateSystem) {
                        return multiply;
                    }
                    ECFieldElement eCFieldElement3 = this.zs[0];
                    return !eCFieldElement3.isOne() ? multiply.divide(eCFieldElement3) : multiply;
                default:
                    return this.y;
            }
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            ECFieldElement rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            ECFieldElement rawYCoord = getRawYCoord();
            switch (getCurveCoordinateSystem()) {
                case 5:
                case 6:
                    return rawYCoord.testBitZero() != rawXCoord.testBitZero();
                default:
                    return rawYCoord.divide(rawXCoord).testBitZero();
            }
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
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement6 = this.x;
            ECFieldElement eCFieldElement7 = eCPoint.x;
            if (coordinateSystem != 6) {
                switch (coordinateSystem) {
                    case 0:
                        ECFieldElement eCFieldElement8 = this.y;
                        ECFieldElement eCFieldElement9 = eCPoint.y;
                        ECFieldElement add = eCFieldElement6.add(eCFieldElement7);
                        ECFieldElement add2 = eCFieldElement8.add(eCFieldElement9);
                        if (add.isZero()) {
                            if (add2.isZero()) {
                                return twice();
                            }
                            return curve.getInfinity();
                        }
                        ECFieldElement divide = add2.divide(add);
                        ECFieldElement add3 = divide.square().add(divide).add(add).add(curve.getA());
                        return new F2m(curve, add3, divide.multiply(eCFieldElement6.add(add3)).add(add3).add(eCFieldElement8), this.withCompression);
                    case 1:
                        ECFieldElement eCFieldElement10 = this.y;
                        ECFieldElement eCFieldElement11 = this.zs[0];
                        ECFieldElement eCFieldElement12 = eCPoint.y;
                        ECFieldElement eCFieldElement13 = eCPoint.zs[0];
                        boolean isOne = eCFieldElement13.isOne();
                        ECFieldElement add4 = eCFieldElement11.multiply(eCFieldElement12).add(isOne ? eCFieldElement10 : eCFieldElement10.multiply(eCFieldElement13));
                        ECFieldElement add5 = eCFieldElement11.multiply(eCFieldElement7).add(isOne ? eCFieldElement6 : eCFieldElement6.multiply(eCFieldElement13));
                        if (add5.isZero()) {
                            if (add4.isZero()) {
                                return twice();
                            }
                            return curve.getInfinity();
                        }
                        ECFieldElement square = add5.square();
                        ECFieldElement multiply2 = square.multiply(add5);
                        if (!isOne) {
                            eCFieldElement11 = eCFieldElement11.multiply(eCFieldElement13);
                        }
                        ECFieldElement add6 = add4.add(add5);
                        ECFieldElement add7 = add6.multiplyPlusProduct(add4, square, curve.getA()).multiply(eCFieldElement11).add(multiply2);
                        ECFieldElement multiply3 = add5.multiply(add7);
                        if (!isOne) {
                            square = square.multiply(eCFieldElement13);
                        }
                        return new F2m(curve, multiply3, add4.multiplyPlusProduct(eCFieldElement6, add5, eCFieldElement10).multiplyPlusProduct(square, add6, add7), new ECFieldElement[]{multiply2.multiply(eCFieldElement11)}, this.withCompression);
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            } else if (eCFieldElement6.isZero()) {
                if (eCFieldElement7.isZero()) {
                    return curve.getInfinity();
                }
                return eCPoint.add(this);
            } else {
                ECFieldElement eCFieldElement14 = this.y;
                ECFieldElement eCFieldElement15 = this.zs[0];
                ECFieldElement eCFieldElement16 = eCPoint.y;
                ECFieldElement eCFieldElement17 = eCPoint.zs[0];
                boolean isOne2 = eCFieldElement15.isOne();
                if (!isOne2) {
                    eCFieldElement = eCFieldElement7.multiply(eCFieldElement15);
                    eCFieldElement2 = eCFieldElement16.multiply(eCFieldElement15);
                } else {
                    eCFieldElement = eCFieldElement7;
                    eCFieldElement2 = eCFieldElement16;
                }
                boolean isOne3 = eCFieldElement17.isOne();
                if (!isOne3) {
                    eCFieldElement6 = eCFieldElement6.multiply(eCFieldElement17);
                    eCFieldElement3 = eCFieldElement14.multiply(eCFieldElement17);
                } else {
                    eCFieldElement3 = eCFieldElement14;
                }
                ECFieldElement add8 = eCFieldElement3.add(eCFieldElement2);
                ECFieldElement add9 = eCFieldElement6.add(eCFieldElement);
                if (add9.isZero()) {
                    if (add8.isZero()) {
                        return twice();
                    }
                    return curve.getInfinity();
                }
                if (eCFieldElement7.isZero()) {
                    ECPoint normalize = normalize();
                    ECFieldElement xCoord = normalize.getXCoord();
                    ECFieldElement yCoord = normalize.getYCoord();
                    ECFieldElement divide2 = yCoord.add(eCFieldElement16).divide(xCoord);
                    eCFieldElement5 = divide2.square().add(divide2).add(xCoord).add(curve.getA());
                    if (eCFieldElement5.isZero()) {
                        return new F2m(curve, eCFieldElement5, curve.getB().sqrt(), this.withCompression);
                    }
                    eCFieldElement4 = divide2.multiply(xCoord.add(eCFieldElement5)).add(eCFieldElement5).add(yCoord).divide(eCFieldElement5).add(eCFieldElement5);
                    multiply = curve.fromBigInteger(ECConstants.ONE);
                } else {
                    ECFieldElement square2 = add9.square();
                    ECFieldElement multiply4 = add8.multiply(eCFieldElement6);
                    ECFieldElement multiply5 = add8.multiply(eCFieldElement);
                    ECFieldElement multiply6 = multiply4.multiply(multiply5);
                    if (multiply6.isZero()) {
                        return new F2m(curve, multiply6, curve.getB().sqrt(), this.withCompression);
                    }
                    ECFieldElement multiply7 = add8.multiply(square2);
                    multiply = !isOne3 ? multiply7.multiply(eCFieldElement17) : multiply7;
                    ECFieldElement squarePlusProduct = multiply5.add(square2).squarePlusProduct(multiply, eCFieldElement14.add(eCFieldElement15));
                    if (!isOne2) {
                        multiply = multiply.multiply(eCFieldElement15);
                    }
                    eCFieldElement4 = squarePlusProduct;
                    eCFieldElement5 = multiply6;
                }
                return new F2m(curve, eCFieldElement5, eCFieldElement4, new ECFieldElement[]{multiply}, this.withCompression);
            }
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement add;
            ECFieldElement squarePlusProduct;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.x;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                switch (coordinateSystem) {
                    case 0:
                        ECFieldElement add2 = this.y.divide(eCFieldElement).add(eCFieldElement);
                        ECFieldElement add3 = add2.square().add(add2).add(curve.getA());
                        return new F2m(curve, add3, eCFieldElement.squarePlusProduct(add3, add2.addOne()), this.withCompression);
                    case 1:
                        ECFieldElement eCFieldElement2 = this.y;
                        ECFieldElement eCFieldElement3 = this.zs[0];
                        boolean isOne = eCFieldElement3.isOne();
                        ECFieldElement multiply = isOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                        if (!isOne) {
                            eCFieldElement2 = eCFieldElement2.multiply(eCFieldElement3);
                        }
                        ECFieldElement square = eCFieldElement.square();
                        ECFieldElement add4 = square.add(eCFieldElement2);
                        ECFieldElement square2 = multiply.square();
                        ECFieldElement add5 = add4.add(multiply);
                        ECFieldElement multiplyPlusProduct = add5.multiplyPlusProduct(add4, square2, curve.getA());
                        return new F2m(curve, multiply.multiply(multiplyPlusProduct), square.square().multiplyPlusProduct(multiply, multiplyPlusProduct, add5), new ECFieldElement[]{multiply.multiply(square2)}, this.withCompression);
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
            ECFieldElement eCFieldElement4 = this.y;
            ECFieldElement eCFieldElement5 = this.zs[0];
            boolean isOne2 = eCFieldElement5.isOne();
            ECFieldElement multiply2 = isOne2 ? eCFieldElement4 : eCFieldElement4.multiply(eCFieldElement5);
            ECFieldElement square3 = isOne2 ? eCFieldElement5 : eCFieldElement5.square();
            ECFieldElement a2 = curve.getA();
            ECFieldElement multiply3 = isOne2 ? a2 : a2.multiply(square3);
            ECFieldElement add6 = eCFieldElement4.square().add(multiply2).add(multiply3);
            if (add6.isZero()) {
                return new F2m(curve, add6, curve.getB().sqrt(), this.withCompression);
            }
            ECFieldElement square4 = add6.square();
            ECFieldElement multiply4 = isOne2 ? add6 : add6.multiply(square3);
            ECFieldElement b2 = curve.getB();
            if (b2.bitLength() < (curve.getFieldSize() >> 1)) {
                ECFieldElement square5 = eCFieldElement4.add(eCFieldElement).square();
                if (b2.isOne()) {
                    squarePlusProduct = multiply3.add(square3).square();
                } else {
                    squarePlusProduct = multiply3.squarePlusProduct(b2, square3.square());
                }
                add = square5.add(add6).add(square3).multiply(square5).add(squarePlusProduct).add(square4);
                if (a2.isZero()) {
                    add = add.add(multiply4);
                } else if (!a2.isOne()) {
                    add = add.add(a2.addOne().multiply(multiply4));
                }
            } else {
                if (!isOne2) {
                    eCFieldElement = eCFieldElement.multiply(eCFieldElement5);
                }
                add = eCFieldElement.squarePlusProduct(add6, multiply2).add(square4).add(multiply4);
            }
            return new F2m(curve, square4, add, new ECFieldElement[]{multiply4}, this.withCompression);
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
            if (curve.getCoordinateSystem() == 6) {
                ECFieldElement eCFieldElement2 = eCPoint.x;
                ECFieldElement eCFieldElement3 = eCPoint.zs[0];
                if (eCFieldElement2.isZero() || !eCFieldElement3.isOne()) {
                    return twice().add(eCPoint);
                }
                ECFieldElement eCFieldElement4 = this.y;
                ECFieldElement eCFieldElement5 = this.zs[0];
                ECFieldElement eCFieldElement6 = eCPoint.y;
                ECFieldElement square = eCFieldElement.square();
                ECFieldElement square2 = eCFieldElement4.square();
                ECFieldElement square3 = eCFieldElement5.square();
                ECFieldElement add = curve.getA().multiply(square3).add(square2).add(eCFieldElement4.multiply(eCFieldElement5));
                ECFieldElement addOne = eCFieldElement6.addOne();
                ECFieldElement multiplyPlusProduct = curve.getA().add(addOne).multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
                ECFieldElement multiply = eCFieldElement2.multiply(square3);
                ECFieldElement square4 = multiply.add(add).square();
                if (square4.isZero()) {
                    if (multiplyPlusProduct.isZero()) {
                        return eCPoint.twice();
                    }
                    return curve.getInfinity();
                } else if (multiplyPlusProduct.isZero()) {
                    return new F2m(curve, multiplyPlusProduct, curve.getB().sqrt(), this.withCompression);
                } else {
                    ECFieldElement multiply2 = multiplyPlusProduct.square().multiply(multiply);
                    ECFieldElement multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
                    return new F2m(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new ECFieldElement[]{multiply3}, this.withCompression);
                }
            }
            return twice().add(eCPoint);
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
            switch (getCurveCoordinateSystem()) {
                case 0:
                    return new F2m(this.curve, eCFieldElement, this.y.add(eCFieldElement), this.withCompression);
                case 1:
                    return new F2m(this.curve, eCFieldElement, this.y.add(eCFieldElement), new ECFieldElement[]{this.zs[0]}, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
                case 5:
                    return new F2m(this.curve, eCFieldElement, this.y.addOne(), this.withCompression);
                case 6:
                    ECFieldElement eCFieldElement2 = this.y;
                    ECFieldElement eCFieldElement3 = this.zs[0];
                    return new F2m(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
            }
        }
    }
}
