package defpackage;
/* compiled from: PG */
/* renamed from: axmu  reason: default package */
/* loaded from: classes2.dex */
public final class axmu extends aodt {
    public static int aG(aodq aodqVar, long j, long j2, int i, int i2) {
        aodqVar.p(4);
        aodqVar.u(3, i2);
        aodqVar.u(2, i);
        aodqVar.t(1, (int) j2);
        aodqVar.t(0, (int) j);
        return aodqVar.c();
    }

    public final aodt aH() {
        aodt aodtVar = new aodt();
        int b = b(10);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aI() {
        aodt aodtVar = new aodt();
        int b = b(8);
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
