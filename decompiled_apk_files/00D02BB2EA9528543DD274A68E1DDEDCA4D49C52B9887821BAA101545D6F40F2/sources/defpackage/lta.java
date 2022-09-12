package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lta  reason: default package */
/* loaded from: classes7.dex */
public class lta implements ltd {
    private final kdg a;
    private final boolean b;
    private final View.OnFocusChangeListener c;
    private final dcdc<lsv> d;
    private final lsv e;
    private final lsv f;
    private final lsv g;
    private final lsv h;
    private final lsw i;
    private final lsw j;
    private final lsw k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    private lta(kdg kdgVar, boolean z, lsw lswVar, lsw lswVar2, lsw lswVar3, lsw lswVar4, lsw lswVar5, lsw lswVar6, lsw lswVar7) {
        this.a = kdgVar;
        this.b = z;
        this.e = lswVar;
        this.f = lswVar2;
        this.g = lswVar3;
        this.h = lswVar4;
        this.i = lswVar5;
        this.j = lswVar6;
        this.k = lswVar7;
        this.c = new lsy(kdgVar);
        this.d = dcdc.l(lswVar, lswVar2, lswVar3, lswVar4, lswVar5, lswVar6, lswVar7);
    }

    public static lta a(Context context, cqhn cqhnVar, kdg kdgVar, boolean z, noo nooVar, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, Runnable runnable6, final lsz lszVar, boolean z2) {
        final lsw lswVar = new lsw(cqhnVar, context.getString(R.string.CAR_MENU_START_JOURNEY_SHARING), nqu.R(), runnable5, context.getString(R.string.GET_STARTED_BLURB), dtxm.bS);
        final lsw lswVar2 = new lsw(cqhnVar, context.getString(R.string.CAR_MENU_STOP_JOURNEY_SHARING), nqu.S(), runnable6, null, nooVar, dtxm.bT);
        lsw lswVar3 = new lsw(cqhnVar, context.getString(R.string.CAR_SETTINGS_TITLE), nqu.aH(R.raw.car_only_ic_settings_36dp, nql.bp), runnable, null, dtxm.bW);
        lsw lswVar4 = new lsw(cqhnVar, context.getString(R.string.MENU_ALTERNATES), nqu.N(), runnable2, null, dtxm.bQ);
        lsw lswVar5 = new lsw(cqhnVar, context.getString(R.string.MENU_SEARCH), nqu.Q(), runnable3, null, dtxm.bV);
        lsw lswVar6 = new lsw(cqhnVar, context.getString(R.string.MENU_DESTINATION_LIST), nqu.O(), runnable4, null, dtxm.bR);
        lswVar3.e(true);
        lswVar3.f(false);
        lswVar4.e(true);
        lswVar4.f(false);
        lswVar5.e(true);
        lswVar5.f(false);
        lswVar6.e(true);
        lswVar6.f(false);
        return new lta(kdgVar, z, lswVar3, lswVar4, lswVar5, lswVar6, new lsw(cqhnVar, context.getString(R.string.CAR_NAVIGATION_OPTIONS), nqu.aG(R.raw.car_only_ic_more_horiz_36dp), new Runnable(lswVar, lswVar2, lszVar) { // from class: lsx
            private final lsw a;
            private final lsw b;
            private final lsz c;

            {
                this.a = lswVar;
                this.b = lswVar2;
                this.c = lszVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dcdc dcdcVar;
                lju ljuVar;
                jty jtyVar;
                int i;
                lsw lswVar7 = this.a;
                lsw lswVar8 = this.b;
                lsz lszVar2 = this.c;
                dccx dccxVar = new dccx();
                if (lswVar7.i()) {
                    dccxVar.g(lswVar7);
                }
                if (lswVar8.i()) {
                    dccxVar.g(lswVar8);
                }
                dcdc f = dccxVar.f();
                lju ljuVar2 = ((ljf) lszVar2).a;
                ljt ljtVar = ljuVar2.f;
                new Runnable(ljuVar2) { // from class: ljk
                    private final lju a;

                    {
                        this.a = ljuVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k();
                    }
                };
                not notVar = ljuVar2.q;
                jvg jvgVar = (jvg) ljtVar;
                dbsk.l(jvgVar.e.aa);
                jvh jvhVar = jvgVar.e;
                lri lriVar = jvhVar.aE;
                cqkj cqkjVar = jvhVar.v;
                kxu kxuVar = jvhVar.C;
                lxh t = jvgVar.a.t();
                jvh jvhVar2 = jvgVar.e;
                kdg kdgVar2 = jvhVar2.u;
                noo nooVar2 = jvhVar2.y;
                jty jtyVar2 = jvhVar2.bc;
                nfg nfgVar = lriVar.a;
                Runnable runnable7 = new Runnable(nooVar2) { // from class: lrg
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                };
                Runnable runnable8 = new Runnable(nooVar2) { // from class: lrh
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                };
                String string = cqkjVar.d.getString(R.string.CAR_NAVIGATION_OPTIONS);
                dccx F = dcdc.F();
                int size = f.size();
                int i2 = 0;
                while (i2 < size) {
                    lsw lswVar9 = (lsw) f.get(i2);
                    if (lswVar9.i()) {
                        dcdcVar = f;
                        cjtd d = lswVar9.d();
                        i = size;
                        ljuVar = ljuVar2;
                        String g = lswVar9.g();
                        lswVar9.getClass();
                        jtyVar = jtyVar2;
                        F.g(new nfz(3, new ngt(g, new Runnable(lswVar9) { // from class: lqy
                            private final lsw a;

                            {
                                this.a = lswVar9;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.b();
                            }
                        }, lswVar9.h(), lswVar9.a(), d == null ? null : d.g)));
                    } else {
                        dcdcVar = f;
                        ljuVar = ljuVar2;
                        jtyVar = jtyVar2;
                        i = size;
                    }
                    i2++;
                    f = dcdcVar;
                    size = i;
                    ljuVar2 = ljuVar;
                    jtyVar2 = jtyVar;
                }
                lju ljuVar3 = ljuVar2;
                ljuVar3.p.k(nfgVar.a(cqkjVar, notVar, kxuVar, t, kdgVar2, runnable7, runnable8, string, false, F.f(), jtyVar2, new cjsz(dtxm.cd), cjtd.a(dtxm.cg), null));
                ljuVar3.l();
                ljuVar3.D = lut.a;
            }
        }, null, dtxm.bZ), lswVar, lswVar2);
    }

    private final void t() {
        boolean z = false;
        if (this.o) {
            this.i.e(true);
            this.j.f(this.o && !this.p);
            lsw lswVar = this.k;
            if (this.o && this.p) {
                z = true;
            }
            lswVar.f(z);
            cqkx.p(this);
            return;
        }
        this.i.e(false);
    }

    @Override // defpackage.ltd
    public lsv b() {
        return this.e;
    }

    @Override // defpackage.ltd
    public lsv c() {
        return this.f;
    }

    @Override // defpackage.ltd
    public lsv d() {
        return this.g;
    }

    @Override // defpackage.ltd
    public lsv e() {
        return this.h;
    }

    @Override // defpackage.ltd
    public lsv f() {
        return this.i;
    }

    @Override // defpackage.ltd
    public lsv g() {
        return this.p ? this.k : this.j;
    }

    public void h() {
    }

    public void i() {
        this.a.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
    }

    @Override // defpackage.ltd
    public dcdc<lsv> j() {
        return this.d;
    }

    @Override // defpackage.ltd
    public View.OnFocusChangeListener k() {
        return this.c;
    }

    @Override // defpackage.ltd
    public Boolean l() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.ltd
    public Boolean m() {
        return Boolean.valueOf(this.n);
    }

    public void n(boolean z) {
        if (this.m == z) {
            return;
        }
        if (z) {
            this.l = true;
        }
        this.m = z;
        cqkx.p(this);
    }

    @Override // defpackage.ltd
    public Boolean o() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.ltd
    public Boolean p() {
        return Boolean.valueOf(this.b);
    }

    public void q(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        cqkx.p(this);
    }

    public void r(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        t();
    }

    public void s(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        t();
    }
}
