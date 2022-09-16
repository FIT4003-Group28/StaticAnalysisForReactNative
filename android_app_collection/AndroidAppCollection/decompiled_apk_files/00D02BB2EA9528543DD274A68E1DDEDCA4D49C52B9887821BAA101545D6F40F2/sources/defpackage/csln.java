package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.featurehighlight.ViewFinder;
/* compiled from: PG */
/* renamed from: csln  reason: default package */
/* loaded from: classes5.dex */
public final class csln extends fd {
    public ViewFinder a;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private float aG;
    private int aH;
    private int aI;
    private int aJ;
    private boolean aK;
    private boolean aL;
    private boolean aM;
    private int aN;
    private csmk aO;
    private cslo aP;
    private int aQ;
    private boolean aR;
    private int ah;
    private int ai;
    private CharSequence aj;
    private int ak;
    private int al;
    private ColorStateList am;
    private int an;
    private CharSequence ao;
    private int ap;
    private int aq;
    private ColorStateList ar;
    private int as;
    private CharSequence at;
    private int au;
    private ColorStateList av;
    private ColorStateList aw;
    private ColorStateList ax;
    private int ay;
    private int az;
    public String b;
    public boolean c;
    public long d;
    CharSequence e;
    cslf f;
    public csme g;
    private int aA = 0;
    private int aB = 0;
    public int ad = 0;
    public final Runnable ae = new Runnable(this) { // from class: cslh
        private final csln a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.e();
        }
    };
    public boolean af = false;
    public boolean ag = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static csln p(ff ffVar) {
        czhx.d(ffVar);
        View findViewById = ffVar.findViewById(R.id.featurehighlight_view);
        if (findViewById instanceof csme) {
            return (csln) findViewById.getTag(R.id.featurehighlight_view_tag_fragment);
        }
        return null;
    }

    @Override // defpackage.fd
    public final void Qd() {
        super.Qd();
        i();
        this.f = null;
    }

    @Override // defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        fd fdVar = this.D;
        if (fdVar instanceof cslf) {
            this.f = (cslf) fdVar;
        } else if (!(activity instanceof cslf)) {
        } else {
            this.f = (cslf) activity;
        }
    }

    @Override // defpackage.fd
    public final void aj(Bundle bundle) {
        Drawable drawable;
        super.aj(bundle);
        boolean z = bundle != null;
        this.af = z;
        if (!z || this.ad != 0) {
            csme csmeVar = new csme(this.aQ == 0 ? H() : new ContextThemeWrapper(H(), this.aQ), this.aP);
            this.g = csmeVar;
            csmeVar.setPinToClosestVerticalEdge(this.aK);
            this.g.setSwipeToDismissEnabled(this.aL);
            this.g.setTapToDismissEnabled(this.aM);
            this.g.setTextVerticalGravityHint(this.aN);
            int i = this.az;
            if (i != 0) {
                this.g.setOuterColor(i);
            }
            int i2 = this.aA;
            if (i2 != 0) {
                int i3 = this.aB;
                if (i3 != 0) {
                    this.g.setPulseColor(i2, i3);
                } else {
                    this.g.setPulseColor(i2);
                }
            }
            int i4 = this.aC;
            if (i4 != 0) {
                this.g.setScrimColor(i4);
            }
            int i5 = this.aD;
            if (i5 != 0) {
                this.g.setTargetTextColor(i5);
            }
            if (this.aE != 0 && (drawable = Rn().getDrawable(this.aE, J().getTheme())) != null) {
                if (this.aF != 0) {
                    drawable.mutate();
                    drawable = ks.b(drawable);
                    drawable.setTint(this.aF);
                }
                this.g.setTargetDrawable(drawable);
            }
            this.g.setTargetScale(this.aG);
            this.g.setTargetShadowEnabled(this.aR);
            if (this.ak != 0) {
                this.g.setHeaderTextSize(Rn().getDimension(this.ak) / Rn().getDisplayMetrics().density);
            }
            int i6 = this.al;
            if (i6 != 0) {
                this.g.setHeaderTextAppearance(i6);
            }
            ColorStateList colorStateList = this.am;
            if (colorStateList != null) {
                this.g.setHeaderTextColor(colorStateList);
            }
            this.g.setHeaderTextAlignment(this.an);
            if (this.ap != 0) {
                this.g.setBodyTextSize(Rn().getDimension(this.ap) / Rn().getDisplayMetrics().density);
            }
            int i7 = this.aq;
            if (i7 != 0) {
                this.g.setBodyTextAppearance(i7);
            }
            ColorStateList colorStateList2 = this.ar;
            if (colorStateList2 != null) {
                this.g.setBodyTextColor(colorStateList2);
            }
            this.g.setBodyTextAlignment(this.as);
            int i8 = this.au;
            if (i8 != 0) {
                this.g.setDismissActionTextAppearance(i8);
            }
            ColorStateList colorStateList3 = this.av;
            if (colorStateList3 != null) {
                this.g.setDismissActionTextColor(colorStateList3);
            }
            ColorStateList colorStateList4 = this.aw;
            if (colorStateList4 != null) {
                this.g.setDismissActionRippleColor(colorStateList4);
            }
            ColorStateList colorStateList5 = this.ax;
            if (colorStateList5 != null) {
                this.g.setDismissActionStrokeColor(colorStateList5);
            }
            this.g.setDismissActionTextAlignment(this.ay);
            if (this.aH != 0 && this.aI != 0) {
                this.g.setOffsets(Rn().getDimensionPixelOffset(this.aH), Rn().getDimensionPixelOffset(this.aI));
            }
            if (this.aJ != 0) {
                this.g.setCenterThreshold(Rn().getDimensionPixelOffset(this.aJ));
            }
            int i9 = this.ah;
            if (i9 != 0) {
                this.g.setTargetViewTintColor(i9);
            }
            this.g.setText(this.aj, this.ao, this.at);
            this.g.setContentDescription(this.e);
            this.g.setPulseAnimationType(this.aO);
            this.g.setTag(R.id.featurehighlight_view_tag_fragment, this);
            ((ViewGroup) J().findViewById(16908290)).addView(this.g);
            return;
        }
        h();
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        csme csmeVar = this.g;
        if (csmeVar != null) {
            long j = this.d;
            if (j > 0) {
                csmeVar.postDelayed(this.ae, j);
            }
            if (this.ag) {
                return;
            }
            od.j(this.g, new Runnable(this) { // from class: csli
                private final csln a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final csln cslnVar = this.a;
                    csme csmeVar2 = cslnVar.g;
                    if (csmeVar2 != null) {
                        csmeVar2.bringToFront();
                        if (cslnVar.ag) {
                            return;
                        }
                        cslnVar.ag = true;
                        cslnVar.i();
                        ff J = cslnVar.J();
                        View a = J == null ? null : cslnVar.a.a(J, cslnVar.f());
                        if (a == null) {
                            cslnVar.h();
                            return;
                        }
                        cslnVar.g.setConfiningView(cslnVar.f());
                        cslnVar.g.setCallback(new cslm(cslnVar));
                        if (cslnVar.ad != 1) {
                            return;
                        }
                        if (cslnVar.af) {
                            csme csmeVar3 = cslnVar.g;
                            csmeVar3.a(a);
                            csmeVar3.addOnLayoutChangeListener(new cslv(csmeVar3));
                            csmeVar3.requestLayout();
                            return;
                        }
                        csme csmeVar4 = cslnVar.g;
                        Runnable runnable = new Runnable(cslnVar) { // from class: cslj
                            private final csln a;

                            {
                                this.a = cslnVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                csle i = this.a.i();
                                if (i != null) {
                                    i.h();
                                }
                            }
                        };
                        csmeVar4.a(a);
                        csmeVar4.addOnLayoutChangeListener(new cslu(csmeVar4, runnable));
                        csmeVar4.requestLayout();
                    }
                }
            });
        }
    }

    @Override // defpackage.fd
    public final void al() {
        super.al();
        this.g.removeCallbacks(this.ae);
    }

    @Override // defpackage.fd
    public final void am() {
        csme csmeVar = this.g;
        if (csmeVar != null) {
            csmeVar.setTag(R.id.featurehighlight_view_tag_fragment, null);
            ((ViewGroup) J().findViewById(16908290)).removeView(this.g);
            this.g = null;
        }
        super.am();
    }

    public final void d(ff ffVar, gn gnVar) {
        if (S()) {
            return;
        }
        this.ad = 1;
        gz b = gnVar.b();
        csln p = p(ffVar);
        gn gnVar2 = p == null ? null : p.A;
        if (p != null && gnVar2 != null) {
            if (gnVar2 == gnVar) {
                b.u(p);
            } else {
                gz b2 = gnVar2.b();
                b2.u(p);
                b2.f();
                gnVar2.aq();
            }
        }
        b.y(this, "com.google.android.libraries.material.featurehighlight.FeatureHighlightFragment");
        b.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.ad != 1 || this.g == null) {
            return;
        }
        csle i = i();
        if (i != null) {
            i.g();
        }
        g();
        this.g.c(new Runnable(this) { // from class: cslk
            private final csln a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }

    public final View f() {
        ff J;
        if (this.ai == -1 || (J = J()) == null) {
            return null;
        }
        return J.findViewById(this.ai);
    }

    public final void g() {
        this.ad = 0;
        i();
    }

    public final void h() {
        gn gnVar;
        if (J() == null || J().isFinishing() || !S() || this.u || (gnVar = this.A) == null) {
            return;
        }
        gz b = gnVar.b();
        b.u(this);
        b.r();
    }

    public final csle i() {
        cslf cslfVar = this.f;
        if (cslfVar != null) {
            return cslfVar.i();
        }
        return null;
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            return;
        }
        this.a = (ViewFinder) bundle2.getParcelable("fh_view_finder");
        this.ah = bundle2.getInt("fh_target_view_tint_color");
        this.ai = bundle2.getInt("fh_confining_view_id");
        this.aj = bundle2.getCharSequence("fh_header_text");
        this.ak = bundle2.getInt("fh_header_text_size_res");
        this.al = bundle2.getInt("fh_header_text_appearance");
        this.am = (ColorStateList) bundle2.getParcelable("fh_header_text_color");
        this.an = bundle2.getInt("fh_header_text_alignment");
        this.ao = bundle2.getCharSequence("fh_body_text");
        this.ap = bundle2.getInt("fh_body_text_size_res");
        this.aq = bundle2.getInt("fh_body_text_appearance");
        this.ar = (ColorStateList) bundle2.getParcelable("fh_body_text_color");
        this.as = bundle2.getInt("fh_body_text_alignment");
        this.at = bundle2.getCharSequence("fh_dismiss_action_text");
        this.au = bundle2.getInt("fh_dismiss_action_text_appearance");
        this.av = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_text_color");
        this.aw = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_ripple_color");
        this.ax = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_stroke_color");
        this.ay = bundle2.getInt("fh_dismiss_action_text_alignment");
        this.az = bundle2.getInt("fh_outer_color");
        this.aA = bundle2.getInt("fh_pulse_inner_color");
        this.aB = bundle2.getInt("fh_pulse_outer_color");
        this.aC = bundle2.getInt("fh_scrim_color");
        this.aD = bundle2.getInt("fh_target_text_color");
        this.aE = bundle2.getInt("fh_target_drawable");
        this.aF = bundle2.getInt("fh_target_drawable_color");
        this.aG = bundle2.getFloat("fh_target_scale");
        this.aR = bundle2.getBoolean("fh_target_shadow_enabled");
        bundle2.getString("fh_callback_id");
        this.b = bundle2.getString("fh_task_tag");
        this.aH = bundle2.getInt("fh_vertical_offset_res");
        this.aI = bundle2.getInt("fh_horizontal_offset_res");
        this.aJ = bundle2.getInt("fh_center_threshold_res");
        this.c = bundle2.getBoolean("fh_task_complete_on_tap");
        this.d = bundle2.getLong("fh_duration");
        this.aK = bundle2.getBoolean("fh_pin_to_closest_vertical_edge");
        this.aL = bundle2.getBoolean("fh_swipe_to_dismiss_enabled");
        this.aM = bundle2.getBoolean("fh_tap_to_dismiss_enabled");
        this.aN = bundle2.getInt("fh_text_vertical_gravity_hint");
        this.e = bundle2.getCharSequence("fh_content_description");
        this.aO = (csmk) bundle2.getSerializable("fh_pulse_animation_type");
        this.aP = (cslo) bundle2.getSerializable("fh_feature_highlight_style");
        this.aQ = bundle2.getInt("fh_theme_overlay");
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("showState");
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Unrecognised show state.");
        }
        this.ad = i;
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("showState", this.ad);
    }
}
