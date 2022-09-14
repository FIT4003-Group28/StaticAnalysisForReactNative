package defpackage;
/* compiled from: PG */
/* renamed from: gfq  reason: default package */
/* loaded from: classes.dex */
public class gfq {
    public final gn a;

    public gfq(ff ffVar) {
        this.a = ffVar.g();
    }

    public static boolean a(ggg gggVar) {
        gggVar.Ny();
        gn gnVar = ((fd) gggVar).A;
        return gnVar != null && !gnVar.J();
    }

    public static final String j(ggg gggVar) {
        return gfu.b(gggVar.Ny().getClass(), gggVar.Nx(), (gfs[]) gggVar.aO().toArray(new gfs[0]));
    }

    public static final void k(ggg gggVar) {
        gggVar.Ny();
        gn gnVar = ((fd) gggVar).A;
        if (!n(gggVar) || gnVar == null) {
            return;
        }
        gnVar.g(j(gggVar), 0);
    }

    public static final void l(ggg gggVar) {
        gn gnVar = gggVar.Ny().A;
        if (!n(gggVar) || gnVar == null) {
            return;
        }
        gnVar.g(j(gggVar), 1);
    }

    public static final void m(ggg gggVar) {
        gggVar.Ny();
        gn gnVar = ((fd) gggVar).A;
        if (!a(gggVar) || gnVar == null) {
            return;
        }
        gnVar.h(j(gggVar), 1);
    }

    private static boolean n(ggg gggVar) {
        gn gnVar = gggVar.Ny().A;
        return gnVar != null && !gnVar.J();
    }

    @dzsi
    public final fd b(gfu gfuVar) {
        return this.a.H(gfuVar.c);
    }

    public final void c() {
        this.a.h(null, 1);
    }

    @dzsi
    public final fd d() {
        String h = h(0);
        if (h.endsWith(gfu.ACTIVITY_FRAGMENT.c)) {
            return b(gfu.ACTIVITY_FRAGMENT);
        }
        if (!h.endsWith(gfu.DIALOG_FRAGMENT.c)) {
            return null;
        }
        return b(gfu.DIALOG_FRAGMENT);
    }

    public final boolean e(Class<?> cls) {
        return f(cls) >= 0;
    }

    public final int f(Class<?> cls) {
        int j = this.a.j();
        for (int i = 0; i < j; i++) {
            if (h(i).startsWith(cls.getName())) {
                return i;
            }
        }
        return -1;
    }

    public final int g(gfs gfsVar) {
        int j = this.a.j();
        for (int i = 0; i < j; i++) {
            if (h(i).contains(gfsVar.a())) {
                return i;
            }
        }
        return -1;
    }

    public final String h(int i) {
        gf i2 = i(i);
        if (i2 == null || i2.p() == null) {
            return "";
        }
        String p = i2.p();
        dbsk.s(p);
        return p;
    }

    @dzsi
    public final gf i(int i) {
        int j = this.a.j();
        if (j > i) {
            return this.a.k((j - 1) - i);
        }
        return null;
    }
}
