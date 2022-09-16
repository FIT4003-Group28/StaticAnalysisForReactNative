package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aczd  reason: default package */
/* loaded from: classes.dex */
public class aczd implements jbn {
    @dzsi
    public View a;
    private final bvjj b;
    private final acyr c;
    private final dbty<Boolean> d;
    private final dbty<Integer> e;
    private final dcdc<awvv<?>> f;
    private final aczi g;
    private final aczg h;
    private final aczj i;
    private final aefg j;
    private List<jbm> k = dcdc.e();
    @dzsi
    private jbm l;

    public aczd(bvjj bvjjVar, final acyr acyrVar, cqhn cqhnVar, aefg aefgVar, aczi acziVar, aczg aczgVar, aczj aczjVar) {
        this.b = bvjjVar;
        this.j = aefgVar;
        this.c = acyrVar;
        this.g = acziVar;
        this.h = aczgVar;
        this.i = aczjVar;
        acyrVar.getClass();
        this.d = dbud.a(new dbty(acyrVar) { // from class: acyz
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.e());
            }
        });
        acyrVar.getClass();
        this.e = dbud.a(new dbty(acyrVar) { // from class: acza
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                int i;
                adza adzaVar = (adza) this.a;
                if (adzaVar.d()) {
                    dktd dktdVar = adzaVar.a.a().an;
                    if (dktdVar == null) {
                        dktdVar = dktd.c;
                    }
                    i = dktdVar.b;
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
        });
        this.f = dcdc.f(awvv.c);
        aefgVar.b(new aefe(this) { // from class: aczb
            private final aczd a;

            {
                this.a = this;
            }

            @Override // defpackage.aefe
            public final void a(aegc aegcVar, boolean z) {
                cqkx.p(this.a);
            }
        });
    }

    private final List<dqfo> j() {
        dccx F = dcdc.F();
        for (dkum dkumVar : this.c.a().ah) {
            if ((dkumVar.a & 1) != 0) {
                dqfo dqfoVar = dkumVar.b;
                if (dqfoVar == null) {
                    dqfoVar = dqfo.j;
                }
                F.g(dqfoVar);
            }
        }
        return F.f();
    }

    @Override // defpackage.jbn
    public List<jbm> a() {
        jbm jbmVar;
        dccx F = dcdc.F();
        if (this.d.a().booleanValue() && (jbmVar = this.l) != null) {
            F.g(jbmVar);
        }
        F.i(this.k);
        return F.f();
    }

    @Override // defpackage.jbn
    public Boolean b() {
        boolean z = false;
        if (this.k.isEmpty() && this.l == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbn
    public Integer c() {
        int i = 1;
        if (this.j.e() != null) {
            aegc e = this.j.e();
            dbsk.s(e);
            if (e.k()) {
                i = 4;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.jbn
    public Boolean d() {
        return false;
    }

    public List<awvv<?>> e() {
        return this.f;
    }

    public void f(View view) {
        this.a = view;
    }

    public void g(dndr dndrVar, amvh amvhVar, String str) {
        if (!this.d.a().booleanValue()) {
            return;
        }
        aczi acziVar = this.g;
        Activity activity = (Activity) ((dxjd) acziVar.a).a;
        aczi.a(activity, 1);
        dxio a = ((dxjh) acziVar.b).a();
        aczi.a(a, 2);
        aczi.a(dndrVar, 3);
        aczi.a(amvhVar, 4);
        aczi.a(str, 5);
        this.l = new aczh(activity, a, dndrVar, amvhVar, str);
    }

    public void h(awwb awwbVar) {
        List<dqfo> j;
        if (!awwbVar.a(awvv.c).a()) {
            return;
        }
        dsrj<dqfq> dsrjVar = ((dvho) awwbVar.a(awvv.c).b()).d;
        if (dsrjVar.isEmpty() || dsrjVar.get(0).f.isEmpty()) {
            if (!this.k.isEmpty() || j().isEmpty()) {
                return;
            }
            j = j();
        } else {
            j = dsrjVar.get(0).f;
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(j.size(), this.e.a().intValue());
        for (int i = 0; i < min; i++) {
            aczg aczgVar = this.h;
            dqfo dqfoVar = j.get(i);
            akpm a = aczgVar.a.a();
            aczg.a(a, 1);
            abfl a2 = aczgVar.b.a();
            aczg.a(a2, 2);
            gga a3 = aczgVar.c.a();
            aczg.a(a3, 3);
            efg a4 = aczgVar.d.a();
            aczg.a(a4, 4);
            acwt a5 = aczgVar.e.a();
            aczg.a(a5, 5);
            cklq a6 = aczgVar.f.a();
            aczg.a(a6, 6);
            aczg.a(dqfoVar, 7);
            arrayList.add(new aczf(a, a2, a3, a4, a5, a6, dqfoVar, i));
        }
        arrayList.add(this.i);
        this.k = arrayList;
    }

    public void i() {
        this.b.W(bvjk.kx, a().size());
        cqkx.p(this);
        View view = this.a;
        if (!(view instanceof HorizontalScrollView) || !bvox.a(view)) {
            return;
        }
        this.a.postDelayed(new Runnable(this) { // from class: aczc
            private final aczd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view2 = this.a.a;
                if (view2 != null) {
                    ((HorizontalScrollView) view2).fullScroll(66);
                }
            }
        }, 100L);
    }
}
