package defpackage;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beog  reason: default package */
/* loaded from: classes3.dex */
public class beog implements benv {
    final apnm a;
    final beib c;
    final bwrs<bvrt<benb>> d;
    final bwrs<ilo> e;
    final cjsy f;
    final cjsy g;
    final boolean[] h;
    public final ff j;
    public final bgyj k;
    public final cqkp l;
    public final cjqy m;
    @dzsi
    public final String n;
    public boolean o;
    @dzsi
    public benz q;
    private final Executor s;
    @dzsi
    private final beov t;
    private boolean w;
    final beny i = new beoc(this);
    private final crzp<apsi<dbsg<List<dfzs>>>> u = new beod(this);
    private final View.OnAttachStateChangeListener v = new beoe();
    public boolean p = true;
    final List<benu> b = new ArrayList();
    private final Map<String, benz> r = new HashMap();

    public beog(ff ffVar, apnm apnmVar, bgyj bgyjVar, beib beibVar, @dzsi beov beovVar, cjqy cjqyVar, Executor executor, @dzsi String str, bwrs<bvrt<benb>> bwrsVar, cqkp cqkpVar, bwrs<ilo> bwrsVar2, ddhn ddhnVar, ddhn ddhnVar2) {
        this.j = ffVar;
        this.a = apnmVar;
        this.n = str;
        this.k = bgyjVar;
        this.c = beibVar;
        this.t = beovVar;
        this.d = bwrsVar;
        this.e = bwrsVar2;
        this.m = cjqyVar;
        this.s = executor;
        cjsx i = cjsy.i();
        i.b(ddhnVar);
        this.f = i.a();
        cjsx i2 = cjsy.i();
        i2.b(ddhnVar2);
        this.g = i2.a();
        this.h = new boolean[]{true};
        this.l = cqkpVar;
    }

    @Override // defpackage.benv
    public Boolean a() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.benv
    @dzsi
    public cjtd b() {
        return null;
    }

    @Override // defpackage.benv
    @dzsi
    public cjtd c() {
        return null;
    }

    @Override // defpackage.benv
    public Boolean d() {
        return false;
    }

    @Override // defpackage.benv
    public Boolean e() {
        return Boolean.valueOf(this.h[0]);
    }

    @Override // defpackage.benv
    @dzsi
    public cqfc f() {
        if (!this.p) {
            return null;
        }
        return new beof(this);
    }

    public void g(dccx<cqix<?>> dccxVar) {
        bent m;
        if (this.p) {
            dccxVar.g(cqgr.fT(new bemy(), this));
            return;
        }
        if (i().booleanValue()) {
            dccxVar.g(cqgr.fT(new belu(), this));
        }
        if (d().booleanValue() && (m = m()) != null) {
            dccxVar.g(cqgr.fT(new bell(), m));
        }
        for (benu benuVar : this.b) {
            dccxVar.g(cqgr.fT(new bemt(), benuVar));
        }
        if (this.c.c()) {
            dccxVar.g(cqgr.fT(new bemu(), this));
        }
        if (!n().booleanValue()) {
            return;
        }
        dccxVar.g(cqgr.fT(new belp(), this));
    }

    public Boolean h() {
        return Boolean.valueOf(this.c.d());
    }

    public Boolean i() {
        return false;
    }

    public void j(RecyclerView recyclerView, int i, int i2) {
        ilo c;
        boolean e = this.c.e();
        if (this.h[0] && (!this.b.isEmpty() || e)) {
            this.h[0] = false;
        }
        abs absVar = recyclerView.l;
        if (absVar instanceof aag) {
            aag aagVar = (aag) absVar;
            if (e || aagVar == null || aagVar.af() < aagVar.aN() - 3 || i2 <= 0 || (c = this.e.c()) == null) {
                return;
            }
            this.c.b(this.n, c);
            this.m.k(this.f);
        }
    }

    public awz k() {
        return new awz(this) { // from class: beoa
            private final beog a;

            {
                this.a = this;
            }

            @Override // defpackage.awz
            public final void a() {
                beog beogVar = this.a;
                ilo c = beogVar.e.c();
                if (c != null) {
                    beogVar.c.f();
                    beogVar.o = true;
                    beogVar.c.b(beogVar.n, c);
                    beogVar.m.k(beogVar.g);
                }
            }
        };
    }

    public View.OnAttachStateChangeListener l() {
        return this.v;
    }

    @dzsi
    public bent m() {
        return null;
    }

    public Boolean n() {
        return false;
    }

    public void o() {
        this.c.a().a(this.u, this.s);
        ilo c = this.e.c();
        if (this.w || c == null) {
            return;
        }
        this.c.b(this.n, c);
        this.w = true;
    }

    public void p() {
        this.c.a().c(this.u);
    }

    public void q(apsi<dbsg<List<dfzs>>> apsiVar) {
        if (!apsiVar.a().a()) {
            return;
        }
        r(apsiVar.a().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(List<dfzs> list) {
        benz benzVar;
        if (this.o) {
            this.b.clear();
            this.o = false;
        }
        for (dfzs dfzsVar : list) {
            int size = this.b.size();
            String str = dfzsVar.b;
            if (this.r.containsKey(str)) {
                benzVar = this.r.get(str);
                benzVar.q(size);
            } else {
                benzVar = s(dfzsVar, size);
                if (benzVar != null) {
                    this.r.put(str, benzVar);
                }
            }
            this.b.add(benzVar);
        }
    }

    @dzsi
    public benz s(dfzs dfzsVar, int i) {
        beov beovVar = this.t;
        if (beovVar == null) {
            return null;
        }
        apnm apnmVar = this.a;
        beny benyVar = this.i;
        bwrs<bvrt<benb>> bwrsVar = this.d;
        bwrs<ilo> bwrsVar2 = this.e;
        boolean[] zArr = this.h;
        Application a = beovVar.a.a();
        beov.a(a, 1);
        apny a2 = beovVar.b.a();
        beov.a(a2, 2);
        dxio a3 = ((dxjh) beovVar.c).a();
        beov.a(a3, 3);
        benm a4 = beovVar.d.a();
        beov.a(a4, 4);
        bgyg a5 = beovVar.e.a();
        beov.a(a5, 5);
        cqhn a6 = beovVar.f.a();
        beov.a(a6, 6);
        beov.a(apnmVar, 7);
        beov.a(dfzsVar, 8);
        beov.a(benyVar, 10);
        beov.a(bwrsVar, 11);
        beov.a(bwrsVar2, 12);
        return new beou(a, a2, a3, a4, a5, a6, apnmVar, dfzsVar, i, benyVar, bwrsVar, bwrsVar2, (boolean[]) beov.a(zArr, 13));
    }

    public final void t() {
        View o;
        if (!this.p || (o = cqkx.o(this)) == null) {
            return;
        }
        this.k.b(o, bemy.a, new bgyi(this) { // from class: beob
            private final beog a;

            {
                this.a = this;
            }

            @Override // defpackage.bgyi
            public final void a() {
                beog beogVar = this.a;
                beogVar.p = false;
                cqkx.p(beogVar.l);
            }
        });
    }
}
