package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jfo  reason: default package */
/* loaded from: classes7.dex */
public abstract class jfo {
    public static final jfo d;
    public static final jfo e;
    public static final jfo f;
    public static final jfo g;

    static {
        jfn m = m();
        m.h(cqrp.f(12.0d));
        m.d(R.raw.star_full);
        m.e(R.raw.star_empty);
        m.f(R.raw.star_half);
        jfo a = m.a();
        d = a;
        jfn h = a.h();
        h.h(cqrp.f(14.0d));
        e = h.a();
        jfn m2 = m();
        m2.c(true);
        m2.g(true);
        m2.h(cqrp.d(34.0d));
        ((jeu) m2).a = cqrp.d(26.0d);
        m2.d(R.raw.star_interactive_full);
        m2.e(R.raw.star_interactive_empty);
        m2.f(R.raw.star_interactive_empty);
        f = m2.a();
        jfn m3 = m();
        m3.c(true);
        m3.g(true);
        m3.h(cqrp.d(32.0d));
        ((jeu) m3).a = cqrp.d(12.0d);
        m3.d(R.raw.star_interactive_full);
        m3.e(R.raw.star_interactive_empty);
        m3.f(R.raw.star_interactive_empty);
        g = m3.a();
    }

    public static jfn m() {
        jeu jeuVar = new jeu();
        jeuVar.c(false);
        jeuVar.g(false);
        jeuVar.a = cqrp.d(2.0d);
        return jeuVar;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract dbsg<cqtv> f();

    public abstract cqtv g();

    public abstract jfn h();

    public cqtd i() {
        throw null;
    }

    public cqtd j() {
        throw null;
    }

    public cqtd k() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cqtd l(int i) {
        if (f().a()) {
            cqtv b = f().b();
            return iup.f(i, b, b);
        }
        return cqrt.f(i);
    }
}
