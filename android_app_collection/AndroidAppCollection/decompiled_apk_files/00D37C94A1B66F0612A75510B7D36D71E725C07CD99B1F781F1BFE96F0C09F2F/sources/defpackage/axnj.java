package defpackage;
/* compiled from: PG */
/* renamed from: axnj  reason: default package */
/* loaded from: classes2.dex */
public final class axnj extends aodt {
    public static int aK(aodq aodqVar, long j, long j2, int i, float f, long j3, int i2, int i3, float f2, long j4, int i4, boolean z, int i5, int i6, int i7, long j5, float f3) {
        aodqVar.p(16);
        aodqVar.s(15, f3);
        aodqVar.t(14, (int) j5);
        aodqVar.u(13, i7);
        aodqVar.t(12, i6);
        aodqVar.t(11, i5);
        aodqVar.t(9, i4);
        aodqVar.t(8, (int) j4);
        aodqVar.s(7, f2);
        aodqVar.u(6, i3);
        aodqVar.t(5, i2);
        aodqVar.t(4, (int) j3);
        aodqVar.s(3, f);
        aodqVar.u(2, i);
        aodqVar.t(1, (int) j2);
        aodqVar.t(0, (int) j);
        aodqVar.g(10, z, false);
        return aodqVar.c();
    }

    public final float aG() {
        int b = b(34);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float aH() {
        int b = b(10);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float aI() {
        int b = b(18);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final int aJ() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aL() {
        int b = b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aM() {
        int b = b(14);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aN() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final long aO() {
        int b = b(32);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aP() {
        int b = b(12);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aQ() {
        int b = b(20);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final String aR() {
        int b = b(30);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String aS() {
        int b = b(8);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aT() {
        int b = b(24);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final aodt aU() {
        aodt aodtVar = new aodt();
        int b = b(16);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    @Override // defpackage.aodt
    public final long p() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // defpackage.aodt
    public final long q() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }
}
