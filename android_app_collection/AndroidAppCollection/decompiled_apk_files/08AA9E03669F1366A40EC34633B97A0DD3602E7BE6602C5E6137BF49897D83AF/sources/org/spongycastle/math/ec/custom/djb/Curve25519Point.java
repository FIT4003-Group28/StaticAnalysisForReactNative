package org.spongycastle.math.ec.custom.djb;

import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.raw.Nat256;
/* loaded from: classes.dex */
public class Curve25519Point extends ECPoint.AbstractFp {
    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }

    @Override // org.spongycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new Curve25519Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECFieldElement getZCoord(int i) {
        if (i == 1) {
            return getJacobianModifiedW();
        }
        return super.getZCoord(i);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        Curve25519FieldElement curve25519FieldElement = (Curve25519FieldElement) this.x;
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) this.y;
        Curve25519FieldElement curve25519FieldElement3 = (Curve25519FieldElement) this.zs[0];
        Curve25519FieldElement curve25519FieldElement4 = (Curve25519FieldElement) eCPoint.getXCoord();
        Curve25519FieldElement curve25519FieldElement5 = (Curve25519FieldElement) eCPoint.getYCoord();
        Curve25519FieldElement curve25519FieldElement6 = (Curve25519FieldElement) eCPoint.getZCoord(0);
        int[] createExt = Nat256.createExt();
        int[] create = Nat256.create();
        int[] create2 = Nat256.create();
        int[] create3 = Nat256.create();
        boolean isOne = curve25519FieldElement3.isOne();
        if (isOne) {
            iArr = curve25519FieldElement4.x;
            iArr2 = curve25519FieldElement5.x;
        } else {
            Curve25519Field.square(curve25519FieldElement3.x, create2);
            Curve25519Field.multiply(create2, curve25519FieldElement4.x, create);
            Curve25519Field.multiply(create2, curve25519FieldElement3.x, create2);
            Curve25519Field.multiply(create2, curve25519FieldElement5.x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = curve25519FieldElement6.isOne();
        if (isOne2) {
            iArr3 = curve25519FieldElement.x;
            iArr4 = curve25519FieldElement2.x;
        } else {
            Curve25519Field.square(curve25519FieldElement6.x, create3);
            Curve25519Field.multiply(create3, curve25519FieldElement.x, createExt);
            Curve25519Field.multiply(create3, curve25519FieldElement6.x, create3);
            Curve25519Field.multiply(create3, curve25519FieldElement2.x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = Nat256.create();
        Curve25519Field.subtract(iArr3, iArr, create4);
        Curve25519Field.subtract(iArr4, iArr2, create);
        if (Nat256.isZero(create4)) {
            if (Nat256.isZero(create)) {
                return twice();
            }
            return curve.getInfinity();
        }
        int[] create5 = Nat256.create();
        Curve25519Field.square(create4, create5);
        int[] create6 = Nat256.create();
        Curve25519Field.multiply(create5, create4, create6);
        Curve25519Field.multiply(create5, iArr3, create2);
        Curve25519Field.negate(create6, create6);
        Nat256.mul(iArr4, create6, createExt);
        Curve25519Field.reduce27(Nat256.addBothTo(create2, create2, create6), create6);
        Curve25519FieldElement curve25519FieldElement7 = new Curve25519FieldElement(create3);
        Curve25519Field.square(create, curve25519FieldElement7.x);
        Curve25519Field.subtract(curve25519FieldElement7.x, create6, curve25519FieldElement7.x);
        Curve25519FieldElement curve25519FieldElement8 = new Curve25519FieldElement(create6);
        Curve25519Field.subtract(create2, curve25519FieldElement7.x, curve25519FieldElement8.x);
        Curve25519Field.multiplyAddToExt(curve25519FieldElement8.x, create, createExt);
        Curve25519Field.reduce(createExt, curve25519FieldElement8.x);
        Curve25519FieldElement curve25519FieldElement9 = new Curve25519FieldElement(create4);
        if (!isOne) {
            Curve25519Field.multiply(curve25519FieldElement9.x, curve25519FieldElement3.x, curve25519FieldElement9.x);
        }
        if (!isOne2) {
            Curve25519Field.multiply(curve25519FieldElement9.x, curve25519FieldElement6.x, curve25519FieldElement9.x);
        }
        if (!isOne || !isOne2) {
            create5 = null;
        }
        return new Curve25519Point(curve, curve25519FieldElement7, curve25519FieldElement8, new ECFieldElement[]{curve25519FieldElement9, calculateJacobianModifiedW(curve25519FieldElement9, create5)}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        if (this.y.isZero()) {
            return curve.getInfinity();
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
        return this.y.isZero() ? eCPoint : twiceJacobianModified(false).add(eCPoint);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (!isInfinity() && !this.y.isZero()) ? twiceJacobianModified(false).add(this) : this;
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new Curve25519Point(getCurve(), this.x, this.y.negate(), this.zs, this.withCompression);
    }

    protected Curve25519FieldElement calculateJacobianModifiedW(Curve25519FieldElement curve25519FieldElement, int[] iArr) {
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) getCurve().getA();
        if (curve25519FieldElement.isOne()) {
            return curve25519FieldElement2;
        }
        Curve25519FieldElement curve25519FieldElement3 = new Curve25519FieldElement();
        if (iArr == null) {
            iArr = curve25519FieldElement3.x;
            Curve25519Field.square(curve25519FieldElement.x, iArr);
        }
        Curve25519Field.square(iArr, curve25519FieldElement3.x);
        Curve25519Field.multiply(curve25519FieldElement3.x, curve25519FieldElement2.x, curve25519FieldElement3.x);
        return curve25519FieldElement3;
    }

    protected Curve25519FieldElement getJacobianModifiedW() {
        Curve25519FieldElement curve25519FieldElement = (Curve25519FieldElement) this.zs[1];
        if (curve25519FieldElement == null) {
            ECFieldElement[] eCFieldElementArr = this.zs;
            Curve25519FieldElement calculateJacobianModifiedW = calculateJacobianModifiedW((Curve25519FieldElement) this.zs[0], null);
            eCFieldElementArr[1] = calculateJacobianModifiedW;
            return calculateJacobianModifiedW;
        }
        return curve25519FieldElement;
    }

    protected Curve25519Point twiceJacobianModified(boolean z) {
        Curve25519FieldElement curve25519FieldElement = (Curve25519FieldElement) this.x;
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) this.y;
        Curve25519FieldElement curve25519FieldElement3 = (Curve25519FieldElement) this.zs[0];
        Curve25519FieldElement jacobianModifiedW = getJacobianModifiedW();
        int[] create = Nat256.create();
        Curve25519Field.square(curve25519FieldElement.x, create);
        Curve25519Field.reduce27(Nat256.addBothTo(create, create, create) + Nat256.addTo(jacobianModifiedW.x, create), create);
        int[] create2 = Nat256.create();
        Curve25519Field.twice(curve25519FieldElement2.x, create2);
        int[] create3 = Nat256.create();
        Curve25519Field.multiply(create2, curve25519FieldElement2.x, create3);
        int[] create4 = Nat256.create();
        Curve25519Field.multiply(create3, curve25519FieldElement.x, create4);
        Curve25519Field.twice(create4, create4);
        int[] create5 = Nat256.create();
        Curve25519Field.square(create3, create5);
        Curve25519Field.twice(create5, create5);
        Curve25519FieldElement curve25519FieldElement4 = new Curve25519FieldElement(create3);
        Curve25519Field.square(create, curve25519FieldElement4.x);
        Curve25519Field.subtract(curve25519FieldElement4.x, create4, curve25519FieldElement4.x);
        Curve25519Field.subtract(curve25519FieldElement4.x, create4, curve25519FieldElement4.x);
        Curve25519FieldElement curve25519FieldElement5 = new Curve25519FieldElement(create4);
        Curve25519Field.subtract(create4, curve25519FieldElement4.x, curve25519FieldElement5.x);
        Curve25519Field.multiply(curve25519FieldElement5.x, create, curve25519FieldElement5.x);
        Curve25519Field.subtract(curve25519FieldElement5.x, create5, curve25519FieldElement5.x);
        Curve25519FieldElement curve25519FieldElement6 = new Curve25519FieldElement(create2);
        if (!Nat256.isOne(curve25519FieldElement3.x)) {
            Curve25519Field.multiply(curve25519FieldElement6.x, curve25519FieldElement3.x, curve25519FieldElement6.x);
        }
        Curve25519FieldElement curve25519FieldElement7 = null;
        if (z) {
            curve25519FieldElement7 = new Curve25519FieldElement(create5);
            Curve25519Field.multiply(curve25519FieldElement7.x, jacobianModifiedW.x, curve25519FieldElement7.x);
            Curve25519Field.twice(curve25519FieldElement7.x, curve25519FieldElement7.x);
        }
        return new Curve25519Point(getCurve(), curve25519FieldElement4, curve25519FieldElement5, new ECFieldElement[]{curve25519FieldElement6, curve25519FieldElement7}, this.withCompression);
    }
}
