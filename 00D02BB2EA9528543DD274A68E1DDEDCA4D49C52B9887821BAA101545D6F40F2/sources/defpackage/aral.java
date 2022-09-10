package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.featurehighlight.IdViewFinder;
/* compiled from: PG */
/* renamed from: aral  reason: default package */
/* loaded from: classes.dex */
public final class aral implements bzml, bzmn {
    public final gga a;
    public final dxio<bzmi> b;
    public final bvjj c;
    public final dxio<aesb> d;
    public final cjqy e;
    private final dxio<bzmm> h;
    private final btvo i;
    private final cpv j;
    @dzsi
    private csld l;
    @dzsi
    private View.OnTouchListener m;
    public boolean f = true;
    public boolean g = false;
    private boolean k = false;

    public aral(gga ggaVar, dxio<bzmm> dxioVar, dxio<bzmi> dxioVar2, btvo btvoVar, bvjj bvjjVar, dxio<aesb> dxioVar3, cjqy cjqyVar, cpv cpvVar) {
        this.a = ggaVar;
        this.h = dxioVar;
        this.b = dxioVar2;
        this.i = btvoVar;
        this.c = bvjjVar;
        this.d = dxioVar3;
        this.e = cjqyVar;
        this.j = cpvVar;
    }

    @Override // defpackage.bzmn
    public final void PJ() {
        h();
        this.b.a().a();
    }

    @Override // defpackage.bzmn
    public final void PK() {
    }

    @Override // defpackage.bzmn
    public final void PL() {
    }

    @Override // defpackage.bzmn
    public final void PM() {
    }

    @Override // defpackage.bzmn
    public final void PN(int i) {
    }

    @Override // defpackage.bzmn
    public final void PO() {
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.BLUE_DOT;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.f && this.i.getEnableFeatureParameters().w && this.g && !this.b.a().b() && !this.j.e(this.a);
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return (this.h.a().b(dqkc.BLUE_DOT) == bzmk.VISIBLE || g() < 4) ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        bvrj.UI_THREAD.c();
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        this.k = false;
        this.b.a().c(new ardr());
        if (this.l == null) {
            cslc cslcVar = new cslc(new IdViewFinder());
            cslcVar.b = this.a.getResources().getString(R.string.BLUE_DOT_TUTORIAL_TITLE);
            cslcVar.e = this.a.getResources().getString(R.string.BLUE_DOT_TUTORIAL_TEXT);
            cslcVar.f = R.style.BlueDotTutorialBodyText;
            cslcVar.d = 1;
            cslcVar.h = 1;
            cslcVar.k = this.a.getResources().getColor(R.color.blue_dot_tutorial_outer_circle_blue_fill);
            czhx.a(true);
            cslcVar.p = R.dimen.blue_dot_tutorial_outer_circle_vertical_offset;
            cslcVar.q = R.dimen.blue_dot_tutorial_outer_circle_horizontal_offset;
            cslcVar.s = false;
            cslcVar.t = 80;
            this.l = cslcVar.a();
        }
        csld csldVar = this.l;
        gga ggaVar = this.a;
        if (!ggaVar.isFinishing()) {
            csldVar.c().d(ggaVar, ggaVar.g());
        }
        this.a.g().aq();
        View findViewById = this.a.findViewById(R.id.featurehighlight_view);
        dbsk.s(findViewById);
        if (this.m == null) {
            this.m = new arak(this);
        }
        findViewById.setOnTouchListener(this.m);
        return true;
    }

    public final int g() {
        return this.c.s(bvjk.dt, 0);
    }

    public final void h() {
        if (!this.k) {
            this.k = true;
            this.h.a().f(dqkc.BLUE_DOT);
        }
    }
}
