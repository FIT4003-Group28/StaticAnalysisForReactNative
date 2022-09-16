package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjpx  reason: default package */
/* loaded from: classes4.dex */
public class cjpx extends ibd implements cjps {
    private static final dcqe j = dcqe.c("cjpx");
    public final dxio<afzv> g;
    public final dxio<bsvm> h;
    public final dxio<apyz> i;
    private final gga k;
    private final agwa l;
    private final dxio<afzs> m;
    private final dxio<apyv> n;
    private final dcdc<? extends jbs> o;
    private final List<cjpr> p;
    private final cjpn q;
    private final acyp r;
    private final cpv s;
    @dzsi
    private final btlu t;
    private final boolean u;
    private boolean v;

    public cjpx(gga ggaVar, cqhn cqhnVar, agwa agwaVar, dxio<afzs> dxioVar, dxio<afzv> dxioVar2, dxio<bsvm> dxioVar3, dxio<apyz> dxioVar4, dxio<apyv> dxioVar5, bvsx bvsxVar, cjqy cjqyVar, acyp acypVar, cpv cpvVar, @dzsi btlu btluVar, @dzsi jbt jbtVar, @dzsi jbt jbtVar2, @dzsi jbt jbtVar3, jbt jbtVar4, hzz hzzVar, @dzsi cjpq cjpqVar) {
        super(cqhnVar, cjqyVar);
        this.v = true;
        this.k = ggaVar;
        this.l = agwaVar;
        this.m = dxioVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.i = dxioVar4;
        this.n = dxioVar5;
        this.t = btluVar;
        this.r = acypVar;
        this.s = cpvVar;
        boolean z = jbtVar3 != null;
        this.u = z;
        if (cjpqVar == null) {
            this.q = cjpq.c.bZ();
        } else {
            dsqp dsqpVar = (dsqp) cjpqVar.cu(5);
            dsqpVar.bC(cjpqVar);
            this.q = (cjpn) dsqpVar;
        }
        dccx F = dcdc.F();
        if (jbtVar != null) {
            F.g(new iyr(jbtVar));
        }
        dxioVar.a();
        if (jbtVar3 != null) {
            F.g(new iyr(jbtVar3));
        }
        F.g(new iyr(jbtVar4));
        this.o = F.f();
        dccx F2 = dcdc.F();
        if (jbtVar != null) {
            F2.g(new cjpw(ggaVar, cqhnVar, ggaVar.getString(R.string.LOCALSTREAM_PAGE_TITLE_FOR_YOU), cjpp.FOR_YOU, cjtd.a(dtxr.bd), cjtd.a(dtxr.bc)));
        }
        dxioVar.a();
        if (z) {
            F2.g(new cjpw(ggaVar, cqhnVar, ggaVar.getString(R.string.INBOX_TAB_BUTTON), cjpp.INBOX, cjtd.a(dtxr.bg), cjtd.a(dtxr.bf)));
        }
        F2.g(new cjpw(ggaVar, cqhnVar, ggaVar.getString(R.string.MESSAGES), cjpp.MESSAGES, cjtd.a(dtxr.bj), cjtd.a(dtxr.bi)));
        this.p = F2.f();
        this.d.add(hzzVar);
        if (cjpqVar == null || (cjpqVar.a & 1) == 0) {
            return;
        }
        for (int i = 0; i < this.p.size(); i++) {
            cjpp g = this.p.get(i).g();
            cjpp b = cjpp.b(cjpqVar.b);
            if (g == (b == null ? cjpp.UNKNOWN_UPDATES_SUB_TAB_TYPE : b)) {
                this.e = new iba(i, true);
                return;
            }
        }
    }

    private final int r(cjpp cjppVar) {
        for (int i = 0; i < g().size(); i++) {
            if (g().get(i).g() == cjppVar) {
                return i;
            }
        }
        bvoo.h("The specified tab type is not found.", new Object[0]);
        return 0;
    }

    @Override // defpackage.cjps
    public Boolean d() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.cjps
    public jib e() {
        dkly dklyVar = this.r.e().d;
        if (dklyVar == null) {
            dklyVar = dkly.d;
        }
        int a = dklx.a(dklyVar.b);
        int i = R.string.UPDATES_TAB_BUTTON;
        if (a != 0 && a == 3) {
            i = R.string.LATEST_TAB_BUTTON;
        }
        dkly dklyVar2 = this.r.e().d;
        if (dklyVar2 == null) {
            dklyVar2 = dkly.d;
        }
        int a2 = dklx.a(dklyVar2.b);
        int i2 = R.string.UPDATES_PAGE_TITLE_CONTENT_DESCRIPTION;
        if (a2 != 0 && a2 == 3) {
            i2 = R.string.LATEST_PAGE_TITLE_CONTENT_DESCRIPTION;
        }
        jhz a3 = jhz.a();
        a3.a = this.k.getString(i);
        a3.n = this.k.getString(i2);
        a3.l = this.k.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        a3.p = cjtd.a(dtxr.bn);
        a3.i = null;
        a3.j = null;
        a3.f(null);
        a3.x = false;
        if (btlu.i(this.t) == btlt.GOOGLE) {
            if (this.m.a().a() && this.l.f(this.t)) {
                jhm a4 = jhm.a();
                a4.a = this.k.getString(R.string.UPDATES_FOR_YOU_SETTINGS_ENTRYPOINT);
                a4.d(new View.OnClickListener(this) { // from class: cjpt
                    private final cjpx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.g.a().k();
                    }
                });
                a4.f = cjtd.a(dtxu.bq);
                a3.c(a4.c());
            }
            if (this.u) {
                jhm a5 = jhm.a();
                a5.a = this.k.getString(R.string.UPDATES_NOTIFICATIONS_SETTINGS_ENTRYPOINT);
                a5.d(new View.OnClickListener(this) { // from class: cjpv
                    private final cjpx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.h.a().n();
                    }
                });
                a5.f = cjtd.a(dtxr.bo);
                a3.c(a5.c());
            }
            if (this.n.a().a() && this.i.a().D()) {
                jhm a6 = jhm.a();
                a6.a = this.k.getString(R.string.UPDATES_MESSAGING_SETTINGS_ENTRYPOINT);
                a6.d(new View.OnClickListener(this) { // from class: cjpu
                    private final cjpx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.i.a().E();
                    }
                });
                a6.f = cjtd.a(dtxk.K);
                a3.c(a6.c());
            }
        }
        return a3.b();
    }

    @Override // defpackage.cjps
    public List<? extends jbs> f() {
        return this.o;
    }

    @Override // defpackage.cjps
    public List<cjpr> g() {
        return this.p;
    }

    @Override // defpackage.cjps
    public Boolean h() {
        return Boolean.valueOf(!this.s.e(this.k));
    }

    @Override // defpackage.cjps
    public Boolean i() {
        return Boolean.valueOf(!this.r.f());
    }

    @dzsi
    public btlu j() {
        return this.t;
    }

    public void k(boolean z) {
        if (this.v != z) {
            this.v = z;
            cqkx.p(this);
        }
    }

    public void l(cjpp cjppVar) {
        NP(r(cjppVar));
    }

    public void m(cjpp cjppVar, boolean z) {
        g().get(r(cjppVar)).h(z);
    }

    public void n(cjpp cjppVar, @dzsi Integer num) {
        g().get(r(cjppVar)).i(num);
    }

    public cjpp o() {
        return p(b().intValue());
    }

    public cjpp p(int i) {
        return g().get(i).g();
    }

    public cjpq q() {
        cjpn cjpnVar = this.q;
        cjpp o = o();
        if (cjpnVar.c) {
            cjpnVar.bF();
            cjpnVar.c = false;
        }
        cjpq cjpqVar = (cjpq) cjpnVar.b;
        cjpq cjpqVar2 = cjpq.c;
        cjpqVar.b = o.f;
        cjpqVar.a |= 1;
        return cjpnVar.bK();
    }
}
