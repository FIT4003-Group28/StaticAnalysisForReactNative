package defpackage;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: lvu  reason: default package */
/* loaded from: classes3.dex */
public final class lvu implements fql, frv {
    public static final /* synthetic */ int l = 0;
    private static final int[] m = {R.attr.actionBarSize};
    private final acth A;
    public final ElevatedAppBarLayout b;
    final lvj c;
    final lud d;
    final lud e;
    public final lud f;
    public final yzm g;
    final fqn h;
    final lue i;
    public int j;
    public boolean k = true;
    private final oa n;
    private final azqb o;
    private final int p;
    private final lud q;
    private final luf r;
    private final MainScrollingViewBehavior s;
    private final MainCollapsingToolbarLayout t;
    private final fsc u;
    private final gbq v;
    private fsx w;
    private fru x;
    private View y;
    private alin z;

    public lvu(oa oaVar, AppTabsBar appTabsBar, ViewGroup viewGroup, ConstraintLayout constraintLayout, luf lufVar, azqb azqbVar, azqb azqbVar2, acth acthVar, aacz aaczVar, fsc fscVar, lvw lvwVar, lwk lwkVar, lyq lyqVar, ampq ampqVar, ElevatedAppBarLayout elevatedAppBarLayout, frw frwVar, kwa kwaVar, final aadd aaddVar, final ayor ayorVar, final nxh nxhVar, ypf ypfVar, gbq gbqVar, yzm yzmVar) {
        azqbVar.getClass();
        this.o = azqbVar;
        oaVar.getClass();
        this.n = oaVar;
        acthVar.getClass();
        this.A = acthVar;
        elevatedAppBarLayout.getClass();
        this.b = elevatedAppBarLayout;
        lufVar.getClass();
        this.r = lufVar;
        fsx c = lufVar.c();
        c.getClass();
        this.w = c;
        this.u = fscVar;
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = (MainCollapsingToolbarLayout) elevatedAppBarLayout.findViewById(R.id.toolbar_container);
        this.t = mainCollapsingToolbarLayout;
        mainCollapsingToolbarLayout.a = this;
        mainCollapsingToolbarLayout.l(false);
        this.q = lvwVar;
        lwkVar.getClass();
        this.d = lwkVar;
        lyqVar.getClass();
        this.e = lyqVar;
        lud ludVar = (lud) ampqVar.f();
        this.f = ludVar;
        Toolbar toolbar = (Toolbar) elevatedAppBarLayout.findViewById(R.id.toolbar);
        toolbar.getClass();
        oaVar.setSupportActionBar(toolbar);
        this.v = gbqVar;
        this.g = yzmVar;
        ypfVar.f(new Callable() { // from class: lvs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nxhVar.a.Z(new lvq(lvu.this));
            }
        });
        nj supportActionBar = oaVar.getSupportActionBar();
        supportActionBar.getClass();
        Resources resources = supportActionBar.b().getResources();
        fsx fsxVar = this.w;
        this.i = new lue(oaVar, this, frwVar, resources, toolbar, mainCollapsingToolbarLayout, elevatedAppBarLayout, azqbVar2, aaczVar, fsxVar.a, fsxVar.j, fsxVar.l, fsxVar.m, fsxVar.n, fsxVar.o, fsxVar.g);
        ajf ajfVar = (ajf) viewGroup.getLayoutParams();
        aqxo.y(ajfVar.a instanceof MainScrollingViewBehavior);
        MainScrollingViewBehavior mainScrollingViewBehavior = (MainScrollingViewBehavior) ajfVar.a;
        this.s = mainScrollingViewBehavior;
        TypedArray obtainStyledAttributes = oaVar.getTheme().obtainStyledAttributes(new int[]{16843857});
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.p = color;
        int integer = resources.getInteger(R.integer.anim_time_actionbar_background);
        fsx fsxVar2 = this.w;
        this.x = y(fsxVar2.j, fsxVar2.k);
        fqn fqnVar = new fqn(this.x, integer);
        this.h = fqnVar;
        elevatedAppBarLayout.setBackground(fqnVar);
        this.c = new lvj(oaVar, this, appTabsBar, constraintLayout, new lvo(elevatedAppBarLayout), mainCollapsingToolbarLayout, mainScrollingViewBehavior, azqbVar2, lufVar, aaczVar, kwaVar, aaddVar, gbqVar, ludVar);
        elevatedAppBarLayout.a = r(eog.W(aaddVar.a()));
        ypfVar.f(new Callable() { // from class: lvt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final lvu lvuVar = lvu.this;
                aadd aaddVar2 = aaddVar;
                ayoi X = aaddVar2.a.V(ktg.r).V(new ayqe() { // from class: lvr
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        return Float.valueOf(lvu.this.r(((Boolean) obj).booleanValue()));
                    }
                }).X(ayorVar);
                final ElevatedAppBarLayout elevatedAppBarLayout2 = lvuVar.b;
                return X.as(new ayqb() { // from class: lvp
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        ElevatedAppBarLayout.this.a = ((Float) obj).floatValue();
                    }
                });
            }
        });
    }

    private final void A(ajru ajruVar, Object obj) {
        if (ajruVar != null) {
            ajrs e = akel.e(ajruVar.a());
            e.a(this.A.oi());
            ajruVar.oK(e, obj);
        }
    }

    private final void B(ActionBarColor actionBarColor, boolean z) {
        ViewGroup viewGroup;
        if (!u() || (viewGroup = (ViewGroup) this.y.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.y);
        ((ajsa) this.o.get()).b(this.y);
        this.y = null;
        F(actionBarColor, z);
        E();
    }

    private final void C(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) this.y.getParent();
        if (viewGroup2 == null || viewGroup2 == viewGroup) {
            return;
        }
        viewGroup2.removeView(this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r3 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
        if (defpackage.zew.y(r0.a) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E() {
        /*
            r5 = this;
            lvj r0 = r5.c
            lvu r1 = r0.g
            boolean r1 = r1.q()
            if (r1 == 0) goto Lc1
            r1 = 0
            r0.k(r1)
            r5.n()
            lvj r0 = r5.c
            android.support.constraint.ConstraintLayout r2 = r0.d
            android.view.ViewParent r2 = r2.getParent()
            com.google.android.material.appbar.AppBarLayout r3 = r0.d()
            if (r2 != r3) goto L25
            boolean r2 = r0.j()
            if (r2 != 0) goto Lbd
        L25:
            lvu r2 = r0.g
            boolean r2 = r2.u()
            if (r2 != 0) goto Lbd
            android.content.Context r2 = r0.a
            boolean r2 = defpackage.zdg.e(r2)
            if (r2 != 0) goto Lb0
            aacz r2 = r0.k
            apyy r2 = r2.b()
            asxj r2 = r2.e
            if (r2 != 0) goto L41
            asxj r2 = defpackage.asxj.a
        L41:
            boolean r2 = r2.bk
            if (r2 != 0) goto L91
            lud r2 = r0.j
            if (r2 == 0) goto Lb0
            aadd r2 = r0.i
            ampq r2 = defpackage.eog.r(r2)
            boolean r2 = r2.h()
            if (r2 != 0) goto L56
            goto Lb0
        L56:
            aadd r2 = r0.i
            ampq r2 = defpackage.eog.r(r2)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "always"
            boolean r2 = r3.equals(r2)
            aadd r3 = r0.i
            ampq r3 = defpackage.eog.r(r3)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "chip_bar_present"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L84
            lud r3 = r0.j
            lzd r3 = (defpackage.lzd) r3
            boolean r3 = r3.j()
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            aadd r4 = r0.i
            boolean r4 = defpackage.eog.C(r4)
            if (r4 == 0) goto Lb0
            if (r2 != 0) goto L91
            if (r3 == 0) goto Lb0
        L91:
            luf r2 = r0.e
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r2 = r2.d()
            if (r2 == 0) goto Lb0
            kwa r2 = r0.h
            luf r3 = r0.e
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r3.d()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto Lb0
            android.content.Context r0 = r0.a
            boolean r0 = defpackage.zew.y(r0)
            if (r0 != 0) goto Lb0
            goto Lbd
        Lb0:
            com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout r0 = r5.t
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            alii r0 = (defpackage.alii) r0
            r0.a = r1
            r5.k = r1
            return
        Lbd:
            r5.s()
            return
        Lc1:
            alip r1 = r0.f
            boolean r1 = defpackage.lj.ak(r1)
            if (r1 != 0) goto Lcd
            r0.l()
            return
        Lcd:
            alip r1 = r0.f
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            lvi r2 = new lvi
            r2.<init>(r0, r1)
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvu.E():void");
    }

    private final void F(ActionBarColor actionBarColor, boolean z) {
        int x = x(actionBarColor) | (-16777216);
        if (t() || p()) {
            this.t.i(x);
            this.t.a(z);
            return;
        }
        this.t.h(null);
        this.t.a(false);
    }

    private final void G(fsx fsxVar) {
        this.d.h(fsxVar);
        if (fsxVar.b != null) {
            fsw a = this.w.a();
            a.a = fsxVar.b;
            this.w = a.a();
        }
    }

    private final int w(fqm fqmVar) {
        return fqmVar instanceof fru ? ((fru) fqmVar).c : this.p;
    }

    private final int x(ActionBarColor actionBarColor) {
        return actionBarColor.la(this.n);
    }

    private final fru y(ActionBarColor actionBarColor, ActionBarColor actionBarColor2) {
        int x = x(actionBarColor);
        int x2 = x(actionBarColor2);
        if (zdg.e(this.n)) {
            x |= -16777216;
        }
        fru fruVar = this.x;
        return (fruVar == null || !fruVar.b(x, x2)) ? new fru(x, x2) : this.x;
    }

    @Override // defpackage.fql
    public final void a() {
        this.u.b(fsb.BASE, w(this.x));
    }

    @Override // defpackage.fql
    public final void b(float f, fqm fqmVar, fqm fqmVar2) {
        this.u.b(fsb.BASE, ((Integer) new ArgbEvaluator().evaluate(f, Integer.valueOf(w(fqmVar)), Integer.valueOf(w(fqmVar2)))).intValue());
    }

    @Override // defpackage.frv
    public final int c() {
        TypedArray obtainStyledAttributes = this.n.getTheme().obtainStyledAttributes(m);
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return (int) dimension;
    }

    @Override // defpackage.frv
    public final int d() {
        return this.x.b;
    }

    @Override // defpackage.frv
    public final int e() {
        return this.x.c;
    }

    @Override // defpackage.frv
    public final int f() {
        return this.w.a.e;
    }

    @Override // defpackage.frv
    public final void g() {
        this.c.c.lb();
    }

    @Override // defpackage.frv
    public final void h() {
        if (!q()) {
            return;
        }
        this.b.setVisibility(8);
        E();
    }

    @Override // defpackage.frv
    public final void i() {
        fsw a = this.w.a();
        a.a = null;
        fsx a2 = a.a();
        G(a2);
        this.w = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019d  */
    @Override // defpackage.frv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvu.j():void");
    }

    @Override // defpackage.frv
    public final void k(RecyclerView recyclerView) {
        this.t.b(recyclerView);
    }

    @Override // defpackage.frv
    public final void l() {
        if (q()) {
            return;
        }
        this.b.setVisibility(0);
        E();
    }

    @Override // defpackage.frv
    public final void m(fsh fshVar) {
        fsw a = this.w.a();
        a.a = fshVar;
        G(a.a());
    }

    @Override // defpackage.frv
    public final void n() {
        if (v()) {
            return;
        }
        boolean z = false;
        if (!p() && !u()) {
            z = true;
        }
        this.b.m(true, z);
    }

    @Override // defpackage.frv
    public final void o() {
        this.j = this.v.b();
        fsw a = this.w.a();
        a.m(new ampg() { // from class: lvn
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                frz frzVar = (frz) obj;
                frzVar.c(lvu.this.j);
                return frzVar;
            }
        });
        z(a.a());
    }

    @Override // defpackage.frv
    public final boolean p() {
        return this.s.b;
    }

    @Override // defpackage.frv
    public final boolean q() {
        return this.b.getVisibility() == 0;
    }

    public final float r(boolean z) {
        return zew.i(this.n.getResources().getDisplayMetrics(), this.n.getResources().getDimensionPixelSize(true != z ? R.dimen.appbar_layout_elevation : R.dimen.appbar_layout_no_elevation));
    }

    public final void s() {
        ((alii) this.t.getLayoutParams()).a = true != t() ? 21 : 3;
        this.k = true;
    }

    public final boolean t() {
        return u() && this.y.getParent() == this.t;
    }

    public final boolean u() {
        return this.y != null;
    }

    public final boolean v() {
        if (t()) {
            MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.t;
            return mainCollapsingToolbarLayout.e != null && mainCollapsingToolbarLayout.b;
        }
        return false;
    }

    private final void D(ActionBarColor actionBarColor, boolean z, boolean z2) {
        if (!z) {
            C(this.b);
            if (this.y.getParent() == null) {
                this.b.addView(this.y, -1, -2);
                ((alii) this.y.getLayoutParams()).a = 0;
            }
        } else {
            C(this.t);
            if (this.y.getParent() == null) {
                alin alinVar = this.z;
                if (alinVar == null) {
                    alinVar = new alin((byte[]) null);
                    this.z = alinVar;
                    alinVar.a = 0;
                }
                this.t.addView(this.y, 0, alinVar);
            }
        }
        F(actionBarColor, z2);
        E();
    }

    private final fsx z(fsx fsxVar) {
        fsk fskVar = fsxVar.c;
        int i = (fskVar == null || !fskVar.a) ? this.j : 1;
        fsw a = fsxVar.a();
        a.m(new fgn(i, 4));
        fsx a2 = a.a();
        this.i.b(a2.a, a2.j, a2.l, a2.m, a2.n, a2.o, a2.g);
        fsw a3 = this.w.a();
        a3.l(a2.a);
        this.w = a3.a();
        return a2;
    }
}
