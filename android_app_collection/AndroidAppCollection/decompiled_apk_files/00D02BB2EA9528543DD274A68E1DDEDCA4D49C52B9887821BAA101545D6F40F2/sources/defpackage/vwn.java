package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: vwn  reason: default package */
/* loaded from: classes7.dex */
public abstract class vwn implements Serializable {
    public static final vwn n;

    static {
        vwl o = o();
        o.q(null);
        o.f(true);
        n = o.a();
        vwl o2 = o();
        o2.q(null);
        o2.f(false);
        o2.a();
    }

    private final boolean A(int i) {
        amte p = p();
        return p != null && i >= 0 && i < p.a.n();
    }

    public static vwl o() {
        vwj vwjVar = new vwj();
        vwjVar.f(false);
        vwjVar.a = bvrt.b(vwi.b);
        vwjVar.q(null);
        vwjVar.p(null);
        vwjVar.b(0);
        return vwjVar;
    }

    public abstract boolean a();

    public abstract bwrs<amte> b();

    public abstract bwrs<amte> c();

    @dzsi
    public abstract bttq d();

    public abstract int e();

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vwn) {
            vwn vwnVar = (vwn) obj;
            if (a() == vwnVar.a() && e() == vwnVar.e() && dbsd.a(h(), vwnVar.h()) && dbsd.a(i(), vwnVar.i()) && dbsd.a(j(), vwnVar.j()) && dbsd.a(k(), vwnVar.k()) && dbsd.a(l(), vwnVar.l()) && dbsd.a(m(), vwnVar.m()) && dbsd.a(p(), vwnVar.p()) && dbsd.a(q(), vwnVar.q()) && dbsd.a(f(), vwnVar.f()) && dbsd.a(g(), vwnVar.g()) && dbsd.a(d(), vwnVar.d())) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public abstract Integer f();

    @dzsi
    public abstract Integer g();

    @dzsi
    public abstract String h();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(a()), Integer.valueOf(e()), h(), i(), j(), k(), l(), m(), p(), q(), f(), g(), d()});
    }

    @dzsi
    public abstract String i();

    @dzsi
    public abstract String j();

    @dzsi
    public abstract vwm k();

    @dzsi
    public abstract dcdn<Integer, String> l();

    public abstract bvrt<vwi> m();

    public abstract vwl n();

    @dzsi
    public final amte p() {
        return b().c();
    }

    @dzsi
    public final amte q() {
        return c().c();
    }

    @dzsi
    public final String r(int i) {
        dcdn<Integer, String> l = l();
        if (l == null) {
            return null;
        }
        return l.get(Integer.valueOf(i));
    }

    public final vwi s() {
        return m().e((dssr) vwi.b.cu(7), vwi.b);
    }

    public final boolean t() {
        return p() != null;
    }

    public final boolean u() {
        return !a() && p() == null;
    }

    public final boolean v() {
        amte p = p();
        if (p != null) {
            amsy amsyVar = p.a;
            if (amsyVar.t() && amsyVar.n() > 0) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public final amub w(Context context) {
        amte p = p();
        if (p == null) {
            return null;
        }
        return p.b(e(), context);
    }

    public final vwn x(int i) {
        if (!A(i)) {
            return this;
        }
        vwl n2 = n();
        n2.b(i);
        n2.j(null);
        n2.k(null);
        return n2.a();
    }

    public final vwn y(@dzsi String str, @dzsi String str2, @dzsi vwm vwmVar) {
        vwl n2 = n();
        n2.h(str);
        n2.d(str2);
        n2.c(vwmVar);
        n2.n(null);
        return n2.a();
    }

    public final vwn z(@dzsi Integer num, @dzsi Integer num2) {
        boolean z = true;
        if ((num == null || num2 == null) && (num2 != null || num != null)) {
            z = false;
        }
        dbsk.a(z);
        if (num == null || num2 == null) {
            if (f() == null && g() == null) {
                return this;
            }
            vwl n2 = n();
            n2.j(num);
            n2.k(num2);
            return n2.a();
        }
        amte p = p();
        int e = e();
        if (A(e) && p != null) {
            amve m = p.a.m(e);
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue < 0 || intValue >= m.a.e.size()) {
                bvoo.i(new IndexOutOfBoundsException());
            } else {
                dpbp dpbpVar = m.a.e.get(intValue);
                if (intValue2 < 0 || intValue2 >= dpbpVar.c.size()) {
                    bvoo.i(new IndexOutOfBoundsException());
                } else {
                    vwl n3 = n();
                    n3.j(num);
                    n3.k(num2);
                    return n3.a();
                }
            }
        }
        return this;
    }
}
