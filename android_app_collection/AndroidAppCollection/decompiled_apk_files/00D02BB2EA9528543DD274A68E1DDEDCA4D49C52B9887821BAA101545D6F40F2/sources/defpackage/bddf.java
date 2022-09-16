package defpackage;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.widget.Toast;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bddf  reason: default package */
/* loaded from: classes3.dex */
public class bddf extends bdbb implements bdap {
    private final View.OnClickListener f;
    private final dzjs<bdam> g;
    private final ckcw h;
    private final bdfe i;
    private final bdcm j;
    private final bdcj k;
    private final ckmm l;
    private final cjqq m;
    private final bddz n;
    private final bcrt o;
    private final bddb p;
    private final bdcp q;
    private final bdai r;
    private final bdag s;
    private final dbsg<bcrr> t;
    private dcdc<bczw> u;

    public bddf(final dcdc<bczw> dcdcVar, int i, bcrt bcrtVar, final gfw gfwVar, Activity activity, btvo btvoVar, ckcw ckcwVar, cjqy cjqyVar, cjqq cjqqVar, bdfe bdfeVar, bdcm bdcmVar, bdcj bdcjVar, ckmm ckmmVar, bddz bddzVar, cqhn cqhnVar, bddb bddbVar, bdcp bdcpVar, bdai bdaiVar, bdag bdagVar, final bcrp bcrpVar, dbsg<bcrr> dbsgVar) {
        super(i, cqhnVar, cjqyVar, new jco(gfwVar, dcdcVar, bcrpVar) { // from class: bddc
            private final gfw a;
            private final dcdc b;
            private final bcrp c;

            {
                this.a = gfwVar;
                this.b = dcdcVar;
                this.c = bcrpVar;
            }

            @Override // defpackage.jco
            public final void a(int i2, boolean z) {
                gfw gfwVar2 = this.a;
                dcdc dcdcVar2 = this.b;
                bcrp bcrpVar2 = this.c;
                if (z) {
                    gfwVar2.Qn(new bbsd(i2));
                }
                if (i2 >= dcdcVar2.size() - 2) {
                    bcrpVar2.a();
                }
            }

            @Override // defpackage.jco
            public final void b(int i2) {
            }
        }, btvoVar, activity);
        this.f = bddd.a;
        this.g = new dzjs<>();
        this.h = ckcwVar;
        this.i = bdfeVar;
        this.j = bdcmVar;
        this.k = bdcjVar;
        this.l = ckmmVar;
        this.m = cjqqVar;
        this.n = bddzVar;
        this.u = dcdcVar;
        this.o = bcrtVar;
        this.p = bddbVar;
        this.q = bdcpVar;
        this.r = bdaiVar;
        this.s = bdagVar;
        this.t = dbsgVar;
    }

    private final bczw p(int i) {
        if (i < this.u.size()) {
            return this.u.get(i);
        }
        return bczw.c(dwfl.w, "");
    }

    @Override // defpackage.bdap
    public bdak a() {
        bdcp bdcpVar = this.q;
        bczw p = p(e().intValue());
        bdcpVar.b = p;
        bdbm bdbmVar = bdcpVar.d;
        dccx F = dcdc.F();
        dcdc<bdal> dcdcVar = bdbmVar.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            jho a = dcdcVar.get(i).a(p);
            if (a != null) {
                F.g(a);
            }
        }
        bdcpVar.c = F.f();
        return this.q;
    }

    @Override // defpackage.bdap
    @dzsi
    public bdae b() {
        if (!this.a.getLensParameters().e) {
            return null;
        }
        return this.k.a();
    }

    public void c(dcdc<bczw> dcdcVar) {
        this.u = dcdcVar;
        this.g.clear();
        cqkx.p(this);
    }

    @Override // defpackage.bdau
    public String f() {
        return "";
    }

    @Override // defpackage.bdbb
    @dzsi
    public bdar g(int i) {
        bdam v = v(i);
        if (v != null) {
            return v.a();
        }
        return null;
    }

    @Override // defpackage.bcrw
    public int h() {
        if (!this.t.a() || this.u.isEmpty()) {
            return this.u.size();
        }
        return this.u.size() + 1;
    }

    @Override // defpackage.bdbb
    public Boolean k() {
        return true;
    }

    @Override // defpackage.bcrw
    /* renamed from: n */
    public bdam v(int i) {
        bdcr bdcrVar;
        bdam i2 = this.g.i(i);
        if (i2 == null) {
            if (i != this.u.size() || !this.t.a() || this.u.isEmpty()) {
                bczw p = p(i);
                dwfl a = p.a();
                jbt a2 = this.s.a(p);
                bdcm bdcmVar = this.j;
                bcrt bcrtVar = this.o;
                dcdc<jbt> a3 = this.r.a(p);
                View.OnClickListener onClickListener = a2 == null ? null : this.f;
                String b = this.s.b(p);
                bdcm.a(bcrtVar, 1);
                bdcm.a(a, 2);
                cjxe a4 = bdcmVar.a.a();
                bdcm.a(a4, 4);
                bdcm.a(a3, 5);
                bdcm.a(b, 7);
                final bdcl bdclVar = new bdcl(bcrtVar, a, i, a4, a3, onClickListener, b);
                if (cknv.j(a)) {
                    appj a5 = this.p.a(a);
                    bdfd a6 = this.i.a(a5, a, i, null);
                    bdclVar.f(a5);
                    i2 = new bdcr(a6, bdclVar, a2);
                } else {
                    if (cknv.f(a)) {
                        bddz bddzVar = this.n;
                        Toast toast = this.e;
                        ckcw a7 = bddzVar.a.a();
                        bddz.a(a7, 1);
                        cjqq a8 = bddzVar.b.a();
                        bddz.a(a8, 2);
                        ckmm a9 = bddzVar.c.a();
                        bddz.a(a9, 3);
                        Application a10 = bddzVar.d.a();
                        bddz.a(a10, 4);
                        bwsh a11 = bddzVar.e.a();
                        bddz.a(a11, 5);
                        bddz.a(a, 6);
                        bddz.a(toast, 8);
                        bdcrVar = new bdcr(new bddy(a7, a8, a9, a10, a11, a, i, toast, null), bdclVar, a2);
                    } else {
                        Callable callable = new Callable(bdclVar) { // from class: bdde
                            private final bdcl a;

                            {
                                this.a = bdclVar;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                this.a.g();
                                return true;
                            }
                        };
                        ckqc b2 = jfv.b(a);
                        Toast toast2 = this.e;
                        ckcw ckcwVar = this.h;
                        cjqq cjqqVar = this.m;
                        ckmm ckmmVar = this.l;
                        int i3 = bden.j;
                        bdcrVar = new bdcr(new bden(a, b2, i, toast2, null, ckcwVar, cjqqVar, ckmmVar, new bdem(callable)), bdclVar, a2);
                    }
                    i2 = bdcrVar;
                }
            } else {
                i2 = new bddx(new bdaz(this.t.b()));
            }
            this.g.a(i, i2);
        }
        return i2;
    }

    @Override // defpackage.bcrw
    /* renamed from: o */
    public void u(int i, bdam bdamVar) {
        this.g.b(i);
    }
}
