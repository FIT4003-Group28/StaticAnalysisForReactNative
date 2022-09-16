package defpackage;
/* compiled from: PG */
/* renamed from: axnb  reason: default package */
/* loaded from: classes2.dex */
public final class axnb extends aodt {
    public final long aG() {
        int b = b(12);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aH() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
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
    public final String m() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }
}
