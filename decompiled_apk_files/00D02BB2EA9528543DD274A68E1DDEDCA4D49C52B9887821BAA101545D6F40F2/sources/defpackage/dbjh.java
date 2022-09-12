package defpackage;
/* compiled from: PG */
/* renamed from: dbjh  reason: default package */
/* loaded from: classes5.dex */
public final class dbjh extends devu {
    public final int a() {
        int g = g(6);
        if (g != 0) {
            return j(g);
        }
        return 0;
    }

    public final int b() {
        int g = g(8);
        if (g != 0) {
            return j(g);
        }
        return 0;
    }

    public final dbjl c(int i) {
        dbjl dbjlVar = new dbjl();
        int g = g(14);
        if (g != 0) {
            dbjlVar.d(k(g) + (i * 8), this.b);
            return dbjlVar;
        }
        return null;
    }

    public final int d() {
        int g = g(14);
        if (g != 0) {
            return j(g);
        }
        return 0;
    }

    public final int e(int i) {
        int g = g(20);
        if (g != 0) {
            return this.b.get(k(g) + i) & 255;
        }
        return 0;
    }

    public final int f() {
        int g = g(20);
        if (g != 0) {
            return j(g);
        }
        return 0;
    }
}
