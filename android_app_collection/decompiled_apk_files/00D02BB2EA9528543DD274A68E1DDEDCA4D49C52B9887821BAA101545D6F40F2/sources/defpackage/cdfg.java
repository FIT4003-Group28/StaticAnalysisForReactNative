package defpackage;

import android.app.Application;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdfg  reason: default package */
/* loaded from: classes4.dex */
class cdfg implements cdfb, cdag, cdao, cdfk {
    public static final /* synthetic */ int a = 0;
    private static final dcqe b = dcqe.c("cdfg");
    private static final cqsv c = cqsv.f(120.0d, 120.0d, 180.0d, 180.0d);
    private static final cqrp d = cqrp.d(6.0d);
    private final int e;
    private final cdbb f;
    private final cdbf g;
    private final int h;
    private final gga i;
    private final bmdv j;
    private dcdc<cdfj> k;
    private final cdan l;
    private final cdff m;
    private final gdc n;
    private final cpv o;
    private final String p;

    public cdfg(int i, cdbf cdbfVar, cdff cdffVar, cdbb cdbbVar, gga ggaVar, bmdv bmdvVar, cdfm cdfmVar, gdc gdcVar, cpv cpvVar) {
        this.e = i;
        this.g = cdbfVar;
        this.m = cdffVar;
        this.f = cdbbVar;
        this.i = ggaVar;
        this.j = bmdvVar;
        this.n = gdcVar;
        this.o = cpvVar;
        this.p = cdbfVar.a(i);
        int i2 = 2;
        cdaq.a(cdbfVar, 2);
        cdaq.a(this, 3);
        int i3 = 4;
        cdaq.a(ggaVar, 4);
        this.l = new cdap(i, cdbfVar, this, ggaVar);
        dccx F = dcdc.F();
        int i4 = 0;
        for (dwfl dwflVar : cdbfVar.e(i)) {
            cdfm.a(this, 1);
            cdfm.a(cdbfVar, i2);
            cdfm.a(dwflVar, i3);
            Application a2 = cdfmVar.a.a();
            cdfm.a(a2, 7);
            cqhn a3 = cdfmVar.b.a();
            cdfm.a(a3, 8);
            bbut a4 = cdfmVar.c.a();
            cdfm.a(a4, 9);
            dccx dccxVar = F;
            dccxVar.g(new cdfl(this, cdbfVar, cdbbVar, dwflVar, i, i4, a2, a3, a4));
            i4++;
            F = dccxVar;
            i3 = 4;
            i2 = 2;
        }
        this.k = F.f();
        int r = r();
        this.h = r + r;
    }

    private final dcdc<cdfj> D(dcdc<cdfj> dcdcVar) {
        HashSet hashSet = new HashSet();
        for (dwfl dwflVar : this.g.e(this.e)) {
            hashSet.add(dwflVar.d);
        }
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cdfj cdfjVar = dcdcVar.get(i);
            if (hashSet.contains(cdfjVar.b().d)) {
                dccxVar.g(cdfjVar);
            }
        }
        return dccxVar.f();
    }

    private static int E(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0] + (view.getWidth() / 2);
    }

    private static int F(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1] + (view.getHeight() / 2);
    }

    public final void A() {
        this.g.k(this.e, 2);
        View view = this.f.P;
        if (view != null) {
            this.o.f(view, this.i.getString(R.string.TODO_PHOTO_PLACE_CARD_SKIP_ACCESSIBILITY, new Object[]{this.g.d(this.e).n()}));
        }
        cqkx.p(this);
        this.m.A(this.e);
    }

    public dcdc<dwfl> B() {
        dccx dccxVar = new dccx();
        dcdc<cdfj> dcdcVar = this.k;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cdfj cdfjVar = dcdcVar.get(i);
            if (cdfjVar.c().booleanValue()) {
                dccxVar.g(cdfjVar.b());
            }
        }
        return dccxVar.f();
    }

    @Override // defpackage.cdfk
    public void C(String str) {
        cqkx.p(this);
    }

    @Override // defpackage.cdag
    public void a() {
        cdbf cdbfVar = this.g;
        int i = this.e;
        ArrayList<cdfa> arrayList = cdbfVar.b;
        cdez h = cdbfVar.b.get(i).h();
        h.b(true);
        arrayList.set(i, h.a());
        cqkx.p(this);
        this.m.x(this);
    }

    @Override // defpackage.cdao
    public void b(cjqm cjqmVar, dcep<String> dcepVar) {
        cdbf cdbfVar = this.g;
        int i = this.e;
        dcepVar.isEmpty();
        cdbfVar.k(i, 3);
        cdbfVar.d.M(Integer.valueOf(i), dcepVar);
        cqkx.p(this);
        this.m.y(cjqmVar, dcepVar, this.e);
    }

    @Override // defpackage.cdfb
    public boolean c() {
        return !this.g.e(this.e).isEmpty() && this.g.l(this.e) == 1;
    }

    @Override // defpackage.cdfb
    public String d() {
        return this.g.d(this.e).n();
    }

    @Override // defpackage.cdfb
    public String e() {
        eaol a2;
        List<dwfl> e = this.g.e(this.e);
        return (!e.isEmpty() && (a2 = cdfi.a(e.get(0))) != null) ? this.j.d(a2.a, "", true) : "";
    }

    @Override // defpackage.cdfb
    public jic f() {
        String v = this.g.d(this.e).v();
        if (true == dbsj.d(v)) {
            v = "https://maps.gstatic.com/mapsactivities/icons/poi_icons/mobile/0/xxhdpi/generic_visited.png";
        }
        return new jic(v, ckqc.FULLY_QUALIFIED, cqrt.c(R.color.qu_grey_500), 0);
    }

    @Override // defpackage.cdfb
    public Boolean g() {
        return Boolean.valueOf(this.g.b.get(this.e).j() == 3);
    }

    @Override // defpackage.cdfb
    public cqkl h() {
        akqq aj = this.g.d(this.e).aj();
        if (aj == null) {
            bvoo.h("place must have a lat lng but did not: %s", this.g.d(this.e).n());
            return cqkl.a;
        }
        cdbb cdbbVar = this.f;
        int i = this.e;
        if (cdbbVar.bg()) {
            gga ggaVar = cdbbVar.aE;
            dbuh.d(ggaVar);
            if (ggaVar != null) {
                if (cdbbVar.ak.a("android.permission.ACCESS_FINE_LOCATION")) {
                    cdbbVar.g(false, i, aj);
                } else {
                    cdbbVar.aj.b("android.permission.ACCESS_FINE_LOCATION", new cdba(cdbbVar, i, aj));
                }
            }
        }
        return cqkl.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.g, this.f});
    }

    @Override // defpackage.cdfb
    public Boolean i() {
        cdbf cdbfVar = this.g;
        return Boolean.valueOf(cdbfVar.b.get(this.e).c());
    }

    @Override // defpackage.cdfb
    public cjtd j() {
        cjta b2 = cjtd.b();
        b2.d = dtxy.oU;
        b2.g(this.p);
        b2.b = this.g.a;
        return b2.a();
    }

    @Override // defpackage.cdfb
    public cjtd k() {
        cjta b2 = cjtd.b();
        b2.d = dtxy.oO;
        b2.g(this.p);
        b2.b = this.g.a;
        return b2.a();
    }

    @Override // defpackage.cdfb
    public boolean l() {
        cdbf cdbfVar = this.g;
        if (cdbfVar.b.get(this.e).e() || D(this.k).size() <= this.h) {
            return false;
        }
        dcdc<cdfj> D = D(this.k);
        dcdc<cdfj> subList = D.subList(this.h - 1, D.size());
        int size = subList.size();
        int i = 0;
        while (i < size) {
            i++;
            if (this.g.f(subList.get(i).b().d).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cdfb
    public List<cdfj> m() {
        if (l()) {
            return D(this.k).subList(0, this.h - 1);
        }
        return D(this.k);
    }

    @Override // defpackage.cdfb
    public cdaf n() {
        return new cdah(this, D(this.k).get(this.h - 1), this.i, z().size() - (this.h - 1), this.g.a);
    }

    @Override // defpackage.cdfb
    public cdan o() {
        return this.l;
    }

    @Override // defpackage.cdfb
    @Deprecated
    public void p(cdhl cdhlVar) {
        if (cdhlVar.a().equals(akqi.a)) {
            gga ggaVar = this.i;
            Toast.makeText(ggaVar, ggaVar.getString(R.string.UGC_PLACE_PICKER_SELECT_POI), 1).show();
            return;
        }
        this.g.b(this.e, cdhlVar);
        cqkx.p(this);
    }

    @Override // defpackage.cdfb
    public void q(aeuf aeufVar) {
        this.g.b(this.e, cdhl.e(aeufVar));
        cqkx.p(this);
    }

    @Override // defpackage.cdfb
    public int r() {
        return this.i.getResources().getDisplayMetrics().widthPixels / (c.NR(this.i) + d.NR(this.i));
    }

    @Override // defpackage.cdfb
    public int s() {
        return d.NR(this.i);
    }

    @Override // defpackage.cdfb
    public Boolean t() {
        return Boolean.valueOf(this.g.l(this.e) == 2);
    }

    @Override // defpackage.cdfb
    public Boolean u() {
        return Boolean.valueOf(this.g.l(this.e) == 3);
    }

    @Override // defpackage.cdfb
    public cqkl v() {
        bvrj.UI_THREAD.c();
        if (B().isEmpty()) {
            A();
            return cqkl.a;
        }
        gcz a2 = this.n.a();
        a2.j();
        a2.i(R.string.TODO_PHOTO_SKIP_DIALOGUE_TITLE);
        a2.d(R.string.TODO_PHOTO_SKIP_DIALOGUE_MAIN_TEXT);
        a2.i = cjtd.a(dtxy.oW);
        a2.e(R.string.NO_BUTTON, cjtd.a(dtxy.oX), cdfc.a);
        a2.h(R.string.YES_BUTTON, cjtd.a(dtxy.oY), new gdd(this) { // from class: cdfd
            private final cdfg a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.A();
            }
        });
        a2.b();
        return cqkl.a;
    }

    @Override // defpackage.cdfb
    public void w() {
        this.m.x(this);
    }

    @Override // defpackage.cdfb
    public void x(final View view) {
        cdbb cdbbVar = this.f;
        if (cdbbVar == null) {
            w();
            return;
        }
        View view2 = cdbbVar.P;
        if (view2 == null) {
            w();
            return;
        }
        View a2 = cqhu.a(view2, cdeg.e);
        if (a2 == null || view == null) {
            w();
            return;
        }
        final float x = view.getX();
        final float y = view.getY();
        ViewPropertyAnimator animate = view.animate();
        if (a2.getVisibility() == 0) {
            animate = animate.xBy(E(a2) - E(view)).yBy(F(a2) - F(view));
        }
        animate.setInterpolator(irf.a).setDuration(600L).scaleX(0.0f).scaleY(0.0f).withEndAction(new Runnable(this, view, x, y) { // from class: cdfe
            private final cdfg a;
            private final View b;
            private final float c;
            private final float d;

            {
                this.a = this;
                this.b = view;
                this.c = x;
                this.d = y;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cdfg cdfgVar = this.a;
                View view3 = this.b;
                float f = this.c;
                float f2 = this.d;
                view3.setVisibility(4);
                view3.setX(f);
                view3.setY(f2);
                view3.setScaleX(1.0f);
                view3.setScaleY(1.0f);
                cdfgVar.w();
            }
        }).start();
    }

    @Override // defpackage.cdfb
    public String y() {
        return this.f == null ? "" : this.i.getString(R.string.TODO_PHOTO_ACCESSIBILITY_PLACE_CARD_SKIP_FOR_PLACE, new Object[]{this.g.d(this.e).n()});
    }

    public List<cdfj> z() {
        dcdc<cdfj> D = D(this.k);
        this.k = D;
        return D;
    }
}
