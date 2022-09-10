package defpackage;
/* compiled from: PG */
/* renamed from: cwsy  reason: default package */
/* loaded from: classes.dex */
public final class cwsy {
    public static final /* synthetic */ int b = 0;
    private static final cwsy c;
    private static volatile boolean d;
    private static volatile cwsy e;
    public final cwsz a;

    static {
        cwsy cwsyVar = new cwsy(new cwsw());
        c = cwsyVar;
        d = true;
        e = cwsyVar;
    }

    public cwsy(cwsz cwszVar) {
        this.a = cwszVar;
    }

    public static synchronized cwsy a(cwsx cwsxVar) {
        cwsy cwsyVar;
        synchronized (cwsy.class) {
            if (e == c) {
                czhz.a();
                e = cwsxVar.a();
            }
            cwsyVar = e;
        }
        return cwsyVar;
    }

    public static cwsy b() {
        if (e == c && d) {
            d = false;
        }
        return e;
    }

    public static String n(cwsv cwsvVar) {
        if (cwsvVar != null) {
            return cwsvVar.a;
        }
        return null;
    }

    @Deprecated
    public final synchronized void c(String str, dzze dzzeVar) {
        this.a.s(str, dzzeVar);
    }

    public final void d(cxaj cxajVar) {
        this.a.h(cxajVar);
    }

    public final void e(cwsv cwsvVar) {
        this.a.i(n(cwsvVar));
    }

    public final synchronized void f(cwsv cwsvVar, cwsv cwsvVar2, dzze dzzeVar) {
        this.a.w(n(cwsvVar), n(cwsvVar2), dzzeVar, 1);
    }

    public final void g(cwsv cwsvVar) {
        this.a.j(n(cwsvVar));
    }

    public final cxdh h() {
        return this.a.k();
    }

    public final void i(@dzsi cxdh cxdhVar, cwsv cwsvVar) {
        o(cxdhVar, cwsvVar, 1);
    }

    public final void j(cwsv cwsvVar) {
        this.a.m(n(cwsvVar));
    }

    public final void k(cwsv cwsvVar) {
        this.a.n(n(cwsvVar), true, null);
    }

    public final void l(cwsv cwsvVar) {
        this.a.o(n(cwsvVar));
    }

    public final boolean m() {
        return this.a.p();
    }

    public final void o(@dzsi cxdh cxdhVar, cwsv cwsvVar, int i) {
        this.a.y(cxdhVar, n(cwsvVar), i);
    }
}
