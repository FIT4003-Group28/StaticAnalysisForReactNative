package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: anvj  reason: default package */
/* loaded from: classes2.dex */
public class anvj implements anvb, anrs {
    public final anhg a;
    final abx b;
    public int c;
    private final anzv e;
    private final ges f;
    private final jkf g;
    private final apjv h;
    private final eapg i;
    private final int j;
    private final aobn l;
    private final bbb n;
    private final dbsg<String> o;
    private final boolean p;
    private final SparseArray<anzu> k = new SparseArray<>();
    public boolean d = true;
    private final anzp q = new anvc(this);
    private final List<anvi> m = new ArrayList();

    public anvj(cjyb cjybVar, aobn aobnVar, anzv anzvVar, fd fdVar, jkf jkfVar, anhg anhgVar, eapg eapgVar, apjv apjvVar, cjqy cjqyVar, @dzsi aouf aoufVar, dbsg<String> dbsgVar, cqhn cqhnVar, boolean z) {
        this.e = anzvVar;
        this.f = (ges) fdVar;
        this.g = jkfVar;
        this.a = anhgVar;
        this.h = apjvVar;
        this.n = apkb.d(new apjx(cjybVar), new anvg(this, cjqyVar));
        this.i = eapgVar;
        int i = eaov.c(new eapg(1970, 1, 1), eapgVar).p;
        this.j = i;
        this.c = i;
        this.l = aobnVar;
        dccx F = dcdc.F();
        F.g(apjvVar.f());
        F.g(apjvVar.e(q()));
        F.g(apjvVar.c(r()));
        jho h = apjvVar.h();
        if (h != null) {
            F.g(h);
        }
        F.g(apjvVar.j());
        F.g(apjvVar.i());
        F.g(apjvVar.b());
        aobnVar.n(F.f());
        this.b = new apkc(dcdc.t(new abx[]{new aobo(aobnVar), new anvh(aoufVar)}));
        this.o = dbsgVar;
        this.p = z;
    }

    private final void w(int i) {
        this.d = false;
        this.c = i;
        t();
        cqkx.p(this);
        this.d = true;
        if (!this.f.aD || this.g.l().L().b()) {
            return;
        }
        this.g.B(jjn.EXPANDED);
    }

    private final eapg x(int i) {
        return this.i.q(this.j - i);
    }

    @Override // defpackage.anrs
    public aogb a() {
        return aogb.f(x(this.c));
    }

    @Override // defpackage.anha
    public aogm b() {
        return m().b();
    }

    @Override // defpackage.anvb
    public Integer d() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.anvb
    public bbb e() {
        return this.n;
    }

    @Override // defpackage.bcrw
    /* renamed from: f */
    public anzu v(int i) {
        anzu anzuVar = this.k.get(i);
        if (anzuVar == null) {
            aogb f = aogb.f(x(i));
            anzv anzvVar = this.e;
            anzp anzpVar = this.q;
            abx abxVar = this.b;
            dbsg<String> dbsgVar = this.o;
            boolean z = this.p;
            anzv.a(f, 1);
            anzv.a(abxVar, 3);
            anzv.a(dbsgVar, 4);
            Activity activity = (Activity) ((dxjd) anzvVar.a).a;
            anzv.a(activity, 5);
            cqat a = anzvVar.b.a();
            anzv.a(a, 6);
            anzv.a(anzvVar.c.a(), 7);
            anys a2 = anzvVar.d.a();
            anzv.a(a2, 8);
            angv a3 = anzvVar.e.a();
            anzv.a(a3, 9);
            anum a4 = anzvVar.f.a();
            anzv.a(a4, 10);
            angy a5 = anzvVar.g.a();
            anzv.a(a5, 11);
            btpc a6 = anzvVar.h.a();
            anzv.a(a6, 12);
            anhg a7 = anzvVar.i.a();
            anzv.a(a7, 13);
            dzsj<araj> dzsjVar = anzvVar.j;
            anqx a8 = anzvVar.k.a();
            anzv.a(a8, 15);
            dzsj<jkf> dzsjVar2 = anzvVar.l;
            aovf<aogb, aoge> a9 = anzvVar.m.a();
            anzv.a(a9, 17);
            cjqy a10 = anzvVar.n.a();
            anzv.a(a10, 18);
            anzv.a(anzvVar.o.a(), 19);
            aoku a11 = anzvVar.p.a();
            anzv.a(a11, 20);
            anzu anzuVar2 = new anzu(f, anzpVar, abxVar, dbsgVar, activity, a, a2, a3, a4, a5, a6, a7, dzsjVar, a8, dzsjVar2, a9, a10, a11, z);
            this.k.put(i, anzuVar2);
            anzuVar2.u();
            return anzuVar2;
        }
        return anzuVar;
    }

    @Override // defpackage.bcrw
    /* renamed from: g */
    public void u(int i, anzq anzqVar) {
        ((anzu) anzqVar).v();
        this.k.remove(i);
    }

    @Override // defpackage.bcrw
    public int h() {
        return this.j + 1;
    }

    public void i() {
        int i = this.c;
        if (i > 0) {
            int i2 = i - 1;
            this.c = i2;
            w(i2);
        }
    }

    public void j() {
        int i = this.c;
        if (i < this.j) {
            int i2 = i + 1;
            this.c = i2;
            w(i2);
        }
    }

    public void k(aogb aogbVar) {
        w(this.j - eaov.c(aogbVar.m(), this.i).p);
    }

    @Override // defpackage.anvb
    /* renamed from: l */
    public aobn c() {
        return this.l;
    }

    public anzu m() {
        return v(this.c);
    }

    public void n(anvi anviVar) {
        List<anvi> list = this.m;
        dbsk.s(anviVar);
        list.add(anviVar);
        anviVar.a(this);
    }

    public void o(anvi anviVar) {
        this.m.remove(anviVar);
    }

    public angs<aoge> p() {
        return m().s();
    }

    public apjr q() {
        return new apjr(this) { // from class: anvd
            private final anvj a;

            {
                this.a = this;
            }

            @Override // defpackage.apjr
            public final void a() {
                anvj anvjVar = this.a;
                anhg anhgVar = anvjVar.a;
                dbpy<Object> dbpyVar = dbpy.a;
                aogb a = anvjVar.a();
                dbpy<Object> dbpyVar2 = dbpy.a;
                angs<aoge> p = anvjVar.p();
                anhgVar.k(dbpyVar, a, dbpyVar2, !p.e() ? dbpy.a : p.f().b, dbpy.a);
            }
        };
    }

    public apjs r() {
        return new apjs(this) { // from class: anve
            private final anvj a;

            {
                this.a = this;
            }

            @Override // defpackage.apjs
            public final void a() {
                this.a.m().o();
            }
        };
    }

    public apjt s() {
        return new apjt(this) { // from class: anvf
            private final anvj a;

            {
                this.a = this;
            }

            @Override // defpackage.apjt
            public final void a() {
                anvj anvjVar = this.a;
                angs<aoge> b = anvjVar.m().t().b();
                if (b.e()) {
                    anvjVar.a.i(b.f());
                }
            }
        };
    }

    public final void t() {
        this.l.m(m().t());
        for (anvi anviVar : this.m) {
            anviVar.a(this);
        }
    }
}
