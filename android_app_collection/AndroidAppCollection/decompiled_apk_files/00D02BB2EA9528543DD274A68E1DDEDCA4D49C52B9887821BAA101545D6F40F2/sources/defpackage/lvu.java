package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: lvu  reason: default package */
/* loaded from: classes7.dex */
public final class lvu extends nor {
    static final cjsz a = new cjsz(dtxm.cv);
    static final cjsz b = new cjsz(dtxm.bv);
    public static final /* synthetic */ int j = 0;
    public final lnh c;
    public final ahvo d;
    public final cqkf<lvw> e;
    public final lvw f;
    public final lta g;
    public final Object h;
    public final boolean i;
    private final cjsz k;
    private final lwq l;
    private final lwn m;
    private final kxu n;
    private final kdg o;
    private final kxs p;
    @dzsi
    private final cqkf<ltd> q;
    @dzsi
    private final kxs r;
    private final crzm<noi> s;
    private final crzp<noi> t;
    private final Runnable u;

    public lvu(kdg kdgVar, cqkj cqkjVar, lwq lwqVar, final crzm<noi> crzmVar, dbty<atlq> dbtyVar, cjqy cjqyVar, cjqq cjqqVar, lwn lwnVar, final kxu kxuVar, lnh lnhVar, ahvo ahvoVar, lwa lwaVar, lta ltaVar, boolean z) {
        super(cjqyVar, cjqqVar);
        this.h = new Object();
        this.t = new lvs(this);
        this.u = new lvt(this);
        this.o = kdgVar;
        this.s = crzmVar;
        this.l = lwqVar;
        this.c = lnhVar;
        this.d = ahvoVar;
        this.m = lwnVar;
        this.g = ltaVar;
        cqkf<lvw> c = cqkjVar.c(new lvp(z), null);
        this.e = c;
        this.i = z;
        this.n = kxuVar;
        this.k = kdgVar.o() ? b : a;
        View findViewById = c.c().findViewById(R.id.status_panel_visible_content);
        kxn k = kxo.k();
        k.k();
        this.p = new kxs(findViewById, k, kxuVar);
        if (z) {
            cqkf<ltd> d = cqkjVar.d(new ltc(), lwnVar.c(), false);
            this.q = d;
            final kxn k2 = kxo.k();
            this.r = new kxs(d.c(), k2, new Runnable(this, kxuVar, k2) { // from class: lvq
                private final lvu a;
                private final kxu b;
                private final kxn c;

                {
                    this.a = this;
                    this.b = kxuVar;
                    this.c = k2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    lvu lvuVar = this.a;
                    this.b.k(lvuVar.h, this.c.j());
                }
            });
        } else {
            this.q = null;
            this.r = null;
        }
        atmi p = lwqVar.p();
        dbty dbtyVar2 = new dbty(crzmVar) { // from class: lvr
            private final crzm a;

            {
                this.a = crzmVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                crzm crzmVar2 = this.a;
                int i = lvu.j;
                noi noiVar = (noi) crzmVar2.l();
                dbsk.s(noiVar);
                return noiVar;
            }
        };
        lwa.a(p, 1);
        lwa.a(dbtyVar, 2);
        lwa.a(dbtyVar2, 3);
        jzp a2 = lwaVar.a.a();
        lwa.a(a2, 4);
        this.f = new lvz(p, dbtyVar, dbtyVar2, a2);
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        String valueOf = String.valueOf(this.f.a());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("isNextDestinationReached: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(this.f.k().h());
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf2).length());
        sb2.append(str);
        sb2.append("showResumeButton: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.l.p().as(this.u);
        if (this.q != null) {
            this.m.c().addView(this.q.c());
            this.q.e(this.g);
        }
        this.s.a(this.t, dege.a);
        if (this.s.k()) {
            noi l = this.s.l();
            dbsk.s(l);
            k(l);
        }
    }

    @Override // defpackage.non
    public final noq b() {
        this.g.h();
        s(this.k);
        this.l.q(lwo.LARGE);
        this.e.e(this.f);
        this.p.a();
        kxs kxsVar = this.r;
        if (kxsVar != null) {
            kxsVar.a();
        }
        if (this.i) {
            this.g.n(true);
            this.g.q(true);
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.e.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        if (this.i) {
            this.g.n(false);
            this.g.q(false);
        }
        this.p.b();
        kxs kxsVar = this.r;
        if (kxsVar != null) {
            kxsVar.b();
            this.n.l(this.h);
        }
        t();
        this.g.i();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.o.l(this, true);
        this.s.c(this.t);
        cqkf<ltd> cqkfVar = this.q;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.m.c().removeView(this.q.c());
        }
        this.l.p().at(this.u);
        this.e.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "StatusPanelOverlay";
    }

    @Override // defpackage.nor, defpackage.non
    public final boolean h() {
        return true;
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.m.b(noeVar, this.e.c());
    }

    public final void k(noi noiVar) {
        if (noiVar == noi.SMALL) {
            this.o.k(this, true);
        } else {
            this.o.l(this, true);
        }
    }
}
