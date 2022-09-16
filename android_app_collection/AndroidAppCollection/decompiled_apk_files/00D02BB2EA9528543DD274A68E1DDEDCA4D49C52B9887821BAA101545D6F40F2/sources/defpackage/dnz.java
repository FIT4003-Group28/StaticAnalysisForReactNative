package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dnz  reason: default package */
/* loaded from: classes6.dex */
public abstract class dnz implements czz {
    public static final /* synthetic */ int f = 0;
    private static final dcdn<czh, ddda> g;
    private static final dcdn<czh, ddda> h;
    private static final dcdn<czh, ddho> i;
    private static final dcdn<czh, ddho> j;
    private final dke A;
    private final dob B;
    private final doh C;
    @dzsi
    private final deq D;
    private final View.OnLayoutChangeListener E;
    public final ConstraintLayout a;
    public final czh b;
    public final ViewGroup c;
    @dzsi
    public final czj d;
    private final ViewGroup k;
    private final gga l;
    private final ViewGroup m;
    private final ViewGroup n;
    private final cjqy o;
    private final dkh p;
    private final dkn q;
    private final dol r;
    private final View s;
    private final ViewGroup t;
    private final ViewGroup u;
    private final ViewGroup v;
    private final ViewGroup w;
    private final ViewGroup x;
    private final View y;
    private final djr z;
    public boolean e = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;

    static {
        dbrz.e("\n");
        g = dcdn.m(czh.LIGHTHOUSE, ddda.Y, czh.CALIBRATOR, ddda.Q, czh.WALKING_NAVIGATION, ddda.ae);
        h = dcdn.m(czh.LIGHTHOUSE, ddda.Z, czh.CALIBRATOR, ddda.R, czh.WALKING_NAVIGATION, ddda.af);
        i = dcdn.m(czh.LIGHTHOUSE, dtxj.bG, czh.CALIBRATOR, dtxj.bl, czh.WALKING_NAVIGATION, dtxj.bS);
        j = dcdn.l(czh.LIGHTHOUSE, dtxj.bN, czh.WALKING_NAVIGATION, dtxj.bU);
    }

    public dnz(cjqy cjqyVar, dkh dkhVar, dkn dknVar, dol dolVar, der derVar, djs djsVar, gga ggaVar, boolean z, boolean z2, @dzsi czj czjVar, boolean z3, czh czhVar, boolean z4) {
        ViewGroup viewGroup;
        this.l = ggaVar;
        this.o = cjqyVar;
        this.p = dkhVar;
        this.q = dknVar;
        this.b = czhVar;
        this.r = dolVar;
        this.d = czjVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ggaVar.getLayoutInflater().inflate(R.layout.ar_view_layout, (ViewGroup) null);
        this.a = constraintLayout;
        ViewGroup viewGroup2 = (ViewGroup) constraintLayout.findViewById(R.id.ar_scene_container);
        this.m = viewGroup2;
        this.n = (ViewGroup) viewGroup2.findViewById(R.id.ar_view_holder);
        ViewGroup viewGroup3 = (ViewGroup) constraintLayout.findViewById(R.id.map_overlay_holder);
        this.k = viewGroup3;
        View findViewById = constraintLayout.findViewById(R.id.scrim);
        View findViewById2 = viewGroup2.findViewById(R.id.minimized_scrim);
        this.y = findViewById2;
        ViewGroup viewGroup4 = (ViewGroup) constraintLayout.findViewById(R.id.localization_status_holder);
        this.t = viewGroup4;
        ViewGroup viewGroup5 = (ViewGroup) constraintLayout.findViewById(R.id.localization_overlay_holder);
        this.u = viewGroup5;
        ViewGroup viewGroup6 = (ViewGroup) constraintLayout.findViewById(R.id.awareness_overlay_holder);
        this.v = viewGroup6;
        ViewGroup viewGroup7 = (ViewGroup) constraintLayout.findViewById(R.id.offscreen_indicator_holder);
        this.c = viewGroup7;
        ViewGroup viewGroup8 = (ViewGroup) constraintLayout.findViewById(R.id.title_holder);
        this.x = viewGroup8;
        ViewGroup viewGroup9 = (ViewGroup) constraintLayout.findViewById(R.id.card_holder);
        this.w = viewGroup9;
        TextView textView = (TextView) constraintLayout.findViewById(R.id.debug_text);
        View findViewById3 = constraintLayout.findViewById(R.id.back_button);
        this.s = findViewById3;
        View findViewById4 = constraintLayout.findViewById(R.id.feedback_button);
        ds dsVar = new ds();
        dsVar.c(constraintLayout);
        dsVar.n(R.id.status_bar_guideline).e = (int) ird.b().a(ggaVar);
        dsVar.n(R.id.status_bar_guideline).f = -1;
        dsVar.n(R.id.status_bar_guideline).g = -1.0f;
        if (z4) {
            viewGroup = viewGroup3;
            dsVar.g(R.id.localization_status_holder, 4, R.id.hula_map_top_guideline, 3);
            dsVar.g(R.id.offscreen_indicator_holder, 4, R.id.hula_map_top_guideline, 3);
        } else {
            viewGroup = viewGroup3;
        }
        dsVar.d(constraintLayout);
        dknVar.a(findViewById3, G(i.get(czhVar)));
        dknVar.a(findViewById4, G(j.get(czhVar)));
        if (z3) {
            findViewById4.setVisibility(0);
            dknVar.b(findViewById4, new View.OnClickListener(this) { // from class: dnu
                private final dnz a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dehn<Bitmap> dehnVar;
                    dnz dnzVar = this.a;
                    czj czjVar2 = dnzVar.d;
                    dbsk.s(czjVar2);
                    czh czhVar2 = dnzVar.b;
                    View y = dnzVar.y();
                    if (y == null) {
                        dehnVar = deha.b(new IllegalStateException("No ArView set up"));
                    } else if (!(y instanceof SurfaceView)) {
                        dehnVar = deha.b(new IllegalStateException("Cannot get screenshot from the ArView"));
                    } else {
                        SurfaceView surfaceView = (SurfaceView) y;
                        if (Build.VERSION.SDK_INT >= 24) {
                            deig d = deig.d();
                            surfaceView.post(new Runnable(surfaceView, d, Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888)) { // from class: bvoy
                                private final SurfaceView a;
                                private final deig b;
                                private final Bitmap c;

                                {
                                    this.a = surfaceView;
                                    this.b = d;
                                    this.c = r3;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SurfaceView surfaceView2 = this.a;
                                    final deig deigVar = this.b;
                                    final Bitmap bitmap = this.c;
                                    SurfaceHolder holder = surfaceView2.getHolder();
                                    if (holder == null || holder.getSurface() == null) {
                                        deigVar.k(new RuntimeException("Error getting screenshot, no surface found for surface view"));
                                    } else if (!holder.getSurface().isValid()) {
                                        deigVar.k(new RuntimeException("Error getting screenshot, surface is not valid"));
                                    } else {
                                        PixelCopy.request(surfaceView2, bitmap, new PixelCopy.OnPixelCopyFinishedListener(deigVar, bitmap) { // from class: bvoz
                                            private final deig a;
                                            private final Bitmap b;

                                            {
                                                this.a = deigVar;
                                                this.b = bitmap;
                                            }

                                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                            public final void onPixelCopyFinished(int i2) {
                                                deig deigVar2 = this.a;
                                                Bitmap bitmap2 = this.b;
                                                if (i2 == 0) {
                                                    deigVar2.j(bitmap2);
                                                } else {
                                                    deigVar2.j(null);
                                                }
                                            }
                                        }, surfaceView2.getHandler());
                                    }
                                }
                            });
                            dehnVar = d;
                        } else {
                            dehnVar = deha.a(null);
                        }
                    }
                    czjVar2.a(czhVar2, dehnVar, dnzVar.B(), dnzVar.A(), dny.a);
                }
            });
        }
        if (z) {
            cjqq a = derVar.a.a();
            der.a(a, 1);
            der.a(this, 2);
            der.a(ggaVar, 3);
            der.a(czhVar, 4);
            this.D = new deq(a, this, ggaVar, czhVar);
        } else {
            this.D = null;
        }
        dehq a2 = djsVar.a.a();
        djs.a(a2, 1);
        btvo a3 = djsVar.b.a();
        djs.a(a3, 2);
        cjqq a4 = djsVar.c.a();
        djs.a(a4, 3);
        dju a5 = djsVar.d.a();
        djs.a(a5, 4);
        djs.a(this, 5);
        djs.a(ggaVar, 6);
        djs.a(czhVar, 7);
        this.z = new djr(a2, a3, a4, a5, this, ggaVar, czhVar, z2);
        this.A = new dke(ggaVar, czhVar, B(), new dnv(this));
        doh dohVar = new doh(viewGroup8);
        this.C = dohVar;
        this.B = new dob(findViewById, viewGroup4, viewGroup5, viewGroup6, viewGroup9, viewGroup7, findViewById2, viewGroup, dohVar);
        this.E = new View.OnLayoutChangeListener(this) { // from class: dnw
            private final dnz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.a.H(false);
            }
        };
    }

    private static void D(ViewGroup viewGroup, @dzsi View view) {
        if (viewGroup.getChildCount() <= 0 || viewGroup.getChildAt(0) != view) {
            viewGroup.removeAllViews();
            if (view == null) {
                return;
            }
            viewGroup.addView(view);
        }
    }

    private final void E() {
        doa doaVar = doa.DEFAULT;
        if (this.F) {
            doaVar = doa.MINIMIZED;
        } else if (this.u.getChildCount() > 0) {
            doaVar = doa.LOCALIZATION_OVERLAY;
        } else if (this.t.getChildCount() > 0) {
            doaVar = doa.LOCALIZATION_STATUS;
        } else if (this.v.getChildCount() > 0) {
            doaVar = this.H ? doa.SITUATIONAL_AWARENESS_OVERLAY_WITH_SCRIM : doa.SITUATIONAL_AWARENESS_OVERLAY_NO_SCRIM;
        }
        dob dobVar = this.B;
        boolean z = this.e;
        if (dobVar.b == doaVar) {
            return;
        }
        dobVar.b = doaVar;
        dobVar.a(z);
    }

    private final void F(ddda dddaVar) {
        String A;
        if (!this.G && (A = A()) != null) {
            cjqy cjqyVar = this.o;
            cjsx i2 = cjsy.i();
            i2.b(dddaVar);
            ddje bZ = ddjf.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjf ddjfVar = (ddjf) bZ.b;
            A.getClass();
            ddjfVar.a |= 1;
            ddjfVar.b = A;
            boolean B = B();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjf ddjfVar2 = (ddjf) bZ.b;
            ddjfVar2.a |= 2;
            ddjfVar2.c = B;
            boolean a = this.p.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjf ddjfVar3 = (ddjf) bZ.b;
            ddjfVar3.a |= 4;
            ddjfVar3.d = a;
            ((cjrt) i2).b = bZ.bK();
            cjqyVar.k(i2.a());
        }
    }

    @dzsi
    private static cjtd G(@dzsi ddho ddhoVar) {
        if (ddhoVar == null) {
            return null;
        }
        return cjtd.a(ddhoVar);
    }

    @dzsi
    public abstract String A();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean B();

    public final void H(boolean z) {
        bvrj.UI_THREAD.c();
        int l = this.F ? l() - this.a.getHeight() : 0;
        if (z) {
            this.m.animate().translationY(l).setInterpolator(new AccelerateInterpolator()).setDuration(150L).start();
            return;
        }
        this.m.animate().cancel();
        this.m.setTranslationY(l);
    }

    @Override // defpackage.czz
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.czz
    @dzsi
    public final egq b() {
        this.a.setAlpha(0.0f);
        return new egq(this) { // from class: dnx
            private final dnz a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                ObjectAnimator.ofFloat(this.a.a, View.ALPHA, 0.0f, 1.0f).setDuration(500L).start();
            }
        };
    }

    @Override // defpackage.czz
    public final ViewGroup c() {
        return this.c;
    }

    @Override // defpackage.czz
    public void d() {
        bvrj.UI_THREAD.c();
        if (this.G || this.e) {
            return;
        }
        this.e = true;
        View y = y();
        dbsk.s(y);
        if (y.getParent() == null) {
            this.n.removeAllViews();
            this.n.addView(y);
        }
        if (y instanceof GLSurfaceView) {
            ((GLSurfaceView) y).onResume();
        }
        dfeo z = z();
        deq deqVar = this.D;
        if (deqVar != null) {
            deqVar.b.m().a().a(deqVar.h);
        }
        djr djrVar = this.z;
        z.e(djrVar);
        z.e(djrVar.a);
        dke dkeVar = this.A;
        z.e(dkeVar);
        dkeVar.a = z;
        this.B.a(false);
        ddda dddaVar = g.get(this.b);
        if (dddaVar == null) {
            return;
        }
        F(dddaVar);
    }

    @Override // defpackage.czz
    public void e() {
        bvrj.UI_THREAD.c();
        if (this.G || !this.e) {
            return;
        }
        this.e = false;
        View y = y();
        if (y instanceof GLSurfaceView) {
            ((GLSurfaceView) y).onPause();
        }
        dol dolVar = this.r;
        synchronized (dolVar.a) {
            dolVar.b.clear();
        }
        dfeo z = z();
        deq deqVar = this.D;
        if (deqVar != null) {
            deqVar.b.m().a().b(deqVar.h);
        }
        djr djrVar = this.z;
        z.f(djrVar);
        z.f(djrVar.a);
        djrVar.b();
        dke dkeVar = this.A;
        z.f(dkeVar);
        dkeVar.a = null;
        dkeVar.b();
        this.B.a.a();
        ddda dddaVar = h.get(this.b);
        if (dddaVar == null) {
            return;
        }
        F(dddaVar);
    }

    @Override // defpackage.czz
    public void f() {
    }

    @Override // defpackage.czz
    public void g() {
        bvrj.UI_THREAD.c();
        if (this.G) {
            return;
        }
        if (this.e) {
            e();
        }
        if (this.F) {
            i();
        }
        this.G = true;
        this.n.removeAllViews();
    }

    @Override // defpackage.czz
    public final void h() {
        bvrj.UI_THREAD.c();
        if (this.G || this.F) {
            return;
        }
        this.F = true;
        E();
        m().a().f();
        z().c();
        H(this.e);
        this.a.addOnLayoutChangeListener(this.E);
    }

    @Override // defpackage.czz
    public final void i() {
        bvrj.UI_THREAD.c();
        if (this.G || !this.F) {
            return;
        }
        this.F = false;
        E();
        m().a().g();
        z().d();
        H(this.e);
        this.a.removeOnLayoutChangeListener(this.E);
    }

    @Override // defpackage.czz
    public final boolean j() {
        return this.F;
    }

    @Override // defpackage.czz
    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.czz
    public final int l() {
        return this.l.getResources().getDimensionPixelSize(R.dimen.ar_title_height) + this.l.getResources().getDimensionPixelSize(R.dimen.ar_action_bar_height) + ((int) ird.b().a(this.l));
    }

    @Override // defpackage.czz
    public final void n(@dzsi View.OnClickListener onClickListener) {
        this.q.b(this.s, onClickListener);
    }

    @Override // defpackage.czz
    public final void o(View view) {
        D(this.v, view);
        this.H = false;
        E();
    }

    @Override // defpackage.czz
    public final void p(View view) {
        D(this.v, view);
        this.H = true;
        E();
    }

    @Override // defpackage.czz
    public final void q() {
        D(this.v, null);
        this.H = false;
        E();
    }

    @Override // defpackage.czz
    public final void r(View view) {
        D(this.u, view);
        E();
    }

    @Override // defpackage.czz
    public final void s() {
        D(this.u, null);
        E();
    }

    @Override // defpackage.czz
    public final void t(View view) {
        D(this.t, view);
        E();
    }

    @Override // defpackage.czz
    public final void u() {
        D(this.t, null);
        E();
    }

    @Override // defpackage.czz
    public final void v(@dzsi View view) {
        D(this.w, view);
    }

    @Override // defpackage.czz
    public final void w(@dzsi View view) {
        D(this.k, view);
    }

    @Override // defpackage.czz
    public final void x(@dzsi String str, @dzsi String str2) {
        doh dohVar = this.C;
        if (!doh.b(str, dohVar.d) || !doh.b(str2, dohVar.e)) {
            dohVar.b.setText(str);
            dohVar.c.setText(str2);
            dohVar.d = str;
            dohVar.e = str2;
            dohVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract View y();

    protected abstract dfeo z();
}
