package defpackage;

import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bafx  reason: default package */
/* loaded from: classes3.dex */
public class bafx implements baen, bazv {
    public static final axwu a = new baft();
    public final bayv b;
    public final bayy c;
    public final bazx d;
    public final Executor e;
    public final Executor f;
    public final gga g;
    public final dxio<axwy> h;
    public final axwq i;
    @dzsi
    public final GmmLocation j;
    public final bafw k;
    public boolean l;
    private final btrm o;
    public dcdc<bayj> m = dcdc.e();
    public Boolean n = false;
    private final cqqw p = new bafu(this);

    public bafx(bayv bayvVar, bayy bayyVar, bazx bazxVar, Executor executor, Executor executor2, btrm btrmVar, gga ggaVar, ahjq ahjqVar, dxio<axwy> dxioVar, axwq axwqVar) {
        this.b = bayvVar;
        this.c = bayyVar;
        this.d = bazxVar;
        this.e = executor;
        this.f = executor2;
        this.o = btrmVar;
        this.g = ggaVar;
        this.h = dxioVar;
        this.i = axwqVar;
        GmmLocation a2 = ahjqVar.a();
        this.j = a2;
        this.k = new bafw(a2 == null ? bayj.b : new bayi(a2));
    }

    public static boolean i(List<azva> list, dndr dndrVar) {
        for (azva azvaVar : list) {
            if (azvaVar.a == dndrVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.baen
    public Boolean a() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.baen
    public jib b() {
        jhz a2 = jhz.a();
        a2.a = this.g.getString(R.string.LABELLED_LEAF_PAGE_TITLE);
        a2.f(new View.OnClickListener(this) { // from class: bafo
            private final bafx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g.onBackPressed();
            }
        });
        a2.x = this.n.booleanValue();
        return a2.b();
    }

    @Override // defpackage.baen
    public cqqw c() {
        return this.p;
    }

    @Override // defpackage.baen
    public List<bayj> d() {
        return this.m;
    }

    @Override // defpackage.baen
    public jar e() {
        gga ggaVar = this.g;
        ivu ivuVar = ivu.FIXED;
        jaq jaqVar = jaq.MOD_DAY_NIGHT_WHITE_ON_BLUE;
        cqtd f = cqrt.f(2131231580);
        String string = this.g.getString(R.string.ACCESSIBILITY_ADD_PLACES_TO_LIST);
        cjta b = cjtd.b();
        b.d = dtxu.a;
        return new bafv(this, ggaVar, ivuVar, jaqVar, f, string, b.a());
    }

    public void f() {
        h();
        btrm btrmVar = this.o;
        dceq a2 = dcet.a();
        a2.b(azrh.class, new bafz(azrh.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
    }

    public void g() {
        this.o.a(this);
    }

    public final void h() {
        this.l = true;
        bvqj.d(this.i.e(), new bvqg(this) { // from class: bafn
            private final bafx a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final bafx bafxVar = this.a;
                Boolean bool = (Boolean) obj;
                bvqj.d(bafxVar.i.m(), new bvqg(bafxVar) { // from class: bafr
                    private final bafx a;

                    {
                        this.a = bafxVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj2) {
                        final bafx bafxVar2 = this.a;
                        dcdc dcdcVar = (dcdc) obj2;
                        List<azvo> a2 = bafxVar2.i.x().a();
                        final dccx F = dcdc.F();
                        if (!bafx.i(dcdcVar, dndr.HOME)) {
                            F.g(bafxVar2.c.a(dndr.HOME));
                        }
                        if (!bafx.i(dcdcVar, dndr.WORK)) {
                            F.g(bafxVar2.c.a(dndr.WORK));
                        }
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            azva azvaVar = (azva) dcdcVar.get(i);
                            akqq akqqVar = azvaVar.e;
                            F.g(bafxVar2.b.a(azvaVar.a, azvaVar.b, azvaVar.c, azvaVar.d, akqqVar, azvaVar.f, azvaVar.g, batx.a(bafxVar2.j, akqqVar), bafx.a));
                        }
                        for (azvo azvoVar : a2) {
                            F.g(bafxVar2.d.a(azvoVar, bafxVar2, batx.a(bafxVar2.j, azvoVar.d())));
                        }
                        bafxVar2.f.execute(new Runnable(bafxVar2, F) { // from class: bafs
                            private final bafx a;
                            private final dccx b;

                            {
                                this.a = bafxVar2;
                                this.b = F;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                bafx bafxVar3 = this.a;
                                bafxVar3.m = dcdc.w(bafxVar3.k, this.b.f());
                                bafxVar3.l = false;
                                cqkx.p(bafxVar3);
                            }
                        });
                    }
                }, bafxVar.e);
            }
        }, this.e);
    }

    @Override // defpackage.bazv
    public void j(final bayj bayjVar) {
        this.m = dcbg.b(this.m).o(new dbsl(bayjVar) { // from class: bafp
            private final bayj a;

            {
                this.a = bayjVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !((bayj) obj).equals(this.a);
            }
        }).A(this.k);
        cqkx.p(this);
    }

    @Override // defpackage.bazv
    public void k(final long j) {
        this.m = dcbg.b(this.m).o(new dbsl(j) { // from class: bafq
            private final long a;

            {
                this.a = j;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bayj bayjVar = (bayj) obj;
                return !(bayjVar instanceof bazw) || ((bazw) bayjVar).i() == this.a;
            }
        }).A(this.k);
        cqkx.p(this);
    }

    @Override // defpackage.bazv
    public void l() {
        h();
    }
}
