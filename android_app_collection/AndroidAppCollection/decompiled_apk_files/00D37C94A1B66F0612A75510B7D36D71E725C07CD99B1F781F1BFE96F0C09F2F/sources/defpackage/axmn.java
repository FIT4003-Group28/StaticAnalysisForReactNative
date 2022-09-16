package defpackage;
/* compiled from: PG */
/* renamed from: axmn  reason: default package */
/* loaded from: classes2.dex */
public final class axmn extends aodt {
    public static int aJ(aodq aodqVar, int[] iArr) {
        int length = iArr.length;
        aodqVar.q(4, length, 4);
        while (true) {
            length--;
            if (length >= 0) {
                aodqVar.i(iArr[length]);
            } else {
                return aodqVar.d();
            }
        }
    }

    public static int aK(aodq aodqVar, int i, float f, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8) {
        aodqVar.p(12);
        aodqVar.u(11, i8);
        aodqVar.t(10, i7);
        aodqVar.u(8, i6);
        aodqVar.u(5, i5);
        aodqVar.u(4, i4);
        aodqVar.t(3, i3);
        aodqVar.t(2, i2);
        aodqVar.s(1, f);
        aodqVar.u(0, i);
        aodqVar.g(9, z, true);
        return aodqVar.c();
    }

    public static int aL(aodq aodqVar, int[] iArr) {
        int length = iArr.length;
        aodqVar.q(4, length, 4);
        while (true) {
            length--;
            if (length >= 0) {
                aodqVar.i(iArr[length]);
            } else {
                return aodqVar.d();
            }
        }
    }

    public static int aM(aodq aodqVar, int[] iArr) {
        int length = iArr.length;
        aodqVar.q(4, length, 4);
        while (true) {
            length--;
            if (length >= 0) {
                aodqVar.i(iArr[length]);
            } else {
                return aodqVar.d();
            }
        }
    }

    public final float aG() {
        int b = b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final int aH() {
        int b = b(20);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aI() {
        int b = b(12);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aN() {
        int b = b(26);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aO() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aP() {
        int b = b(14);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aQ() {
        int b = b(24);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final axmu aR(int i) {
        axmu axmuVar = new axmu();
        int b = b(12);
        if (b != 0) {
            axmuVar.f(a(c(b) + (i * 4)), this.b);
            return axmuVar;
        }
        return null;
    }

    public final axnj aS(int i) {
        return aT(new axnj(), i);
    }

    public final axnj aT(axnj axnjVar, int i) {
        int b = b(14);
        if (b != 0) {
            axnjVar.f(a(c(b) + (i * 4)), this.b);
            return axnjVar;
        }
        return null;
    }

    public final String aU() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aV() {
        int b = b(22);
        return b == 0 || this.b.get(b + this.a) != 0;
    }

    public final aodt aW(int i) {
        aodt aodtVar = new aodt();
        int b = b(20);
        if (b != 0) {
            aodtVar.f(a(c(b) + (i * 4)), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aX(int i) {
        aodt aodtVar = new aodt();
        int b = b(26);
        if (b != 0) {
            aodtVar.f(a(c(b) + (i * 4)), this.b);
            return aodtVar;
        }
        return null;
    }

    @Override // defpackage.aodt
    public final int n() {
        int b = b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
