package defpackage;
/* compiled from: PG */
/* renamed from: axmy  reason: default package */
/* loaded from: classes2.dex */
public final class axmy extends aodt {
    public final int aG() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aH() {
        int b = b(20);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final long aI() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final axmn aJ() {
        axmn axmnVar = new axmn();
        int b = b(6);
        if (b != 0) {
            axmnVar.f(a(b + this.a), this.b);
            return axmnVar;
        }
        return null;
    }

    public final boolean aK() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }
}
