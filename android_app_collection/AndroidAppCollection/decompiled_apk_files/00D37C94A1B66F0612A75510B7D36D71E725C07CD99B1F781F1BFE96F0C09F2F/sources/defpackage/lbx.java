package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lbx  reason: default package */
/* loaded from: classes3.dex */
public final class lbx {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public Runnable e;
    public Runnable f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    public AnimatorSet k;
    public ViewGroup l;
    public SlimStatusBar m;
    public LayoutTransition n;
    public int o;
    private Animator p;

    public lbx(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.b = resources.getColor(R.color.slim_status_bar_inactive_background_color);
        this.c = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.d = resources.getInteger(17694722);
    }

    public static boolean g(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }

    private final void h() {
        this.l.removeCallbacks(this.e);
        this.l.removeCallbacks(this.f);
        this.l.removeCallbacks(this.h);
        this.l.removeCallbacks(this.g);
        this.l.removeCallbacks(this.i);
        this.l.removeCallbacks(this.j);
    }

    public final Runnable a(final boolean z, final boolean z2) {
        return new Runnable() { // from class: lbu
            @Override // java.lang.Runnable
            public final void run() {
                lbx lbxVar = lbx.this;
                boolean z3 = z;
                boolean z4 = z2;
                if (!lbx.g(lbxVar.l, lbxVar.m)) {
                    if (lbxVar.m.getParent() != null) {
                        lbxVar.l.endViewTransition(lbxVar.m);
                    }
                    lbxVar.e();
                    lbxVar.l.addView(lbxVar.m);
                }
                if (!z3) {
                    lbxVar.o = 2;
                    SlimStatusBar slimStatusBar = lbxVar.m;
                    slimStatusBar.announceForAccessibility(slimStatusBar.getContext().getString(R.string.offline_bottom_status_bar_connection_lost));
                } else if (z4) {
                    lbxVar.o = 5;
                    SlimStatusBar slimStatusBar2 = lbxVar.m;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.bottom_status_bar_incognito_mode));
                } else {
                    lbxVar.o = 4;
                    SlimStatusBar slimStatusBar3 = lbxVar.m;
                    slimStatusBar3.announceForAccessibility(slimStatusBar3.getContext().getString(R.string.offline_bottom_status_bar_connection_regained));
                }
            }
        };
    }

    public final void b() {
        Animator animator = this.p;
        if (animator != null) {
            animator.cancel();
            this.p = null;
        }
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.k = null;
        }
    }

    public final void c() {
        h();
        b();
        this.m.a(R.string.offline_bottom_status_bar_connection_lost);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.f);
    }

    public final void d() {
        h();
        this.m.a(R.string.bottom_status_bar_incognito_mode);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.h);
    }

    public final void e() {
        LayoutTransition layoutTransition = this.n;
        SlimStatusBar slimStatusBar = this.m;
        layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, PropertyValuesHolder.ofInt("top", slimStatusBar.getTop(), slimStatusBar.getBottom())));
    }

    public final void f(boolean z, boolean z2) {
        this.l.setLayoutTransition(this.n);
        int i = this.o;
        if (i == 0) {
            h();
            if (!z) {
                this.o = 1;
                this.l.postDelayed(this.g, 3000L);
            } else if (!z2) {
            } else {
                d();
            }
        } else if (i == 1) {
            if (!z) {
                return;
            }
            h();
            this.o = 0;
            if (!z2) {
                return;
            }
            d();
        } else if (i == 2) {
            h();
            if (z) {
                h();
                b();
                this.o = 3;
                this.m.a(R.string.offline_bottom_status_bar_connection_regained);
                Animator d = lmr.d(this.m, this.b, this.a, 250L);
                this.p = d;
                d.addListener(new lbv(this));
                this.p.start();
                this.l.post(this.e);
                if (z2) {
                    this.l.postDelayed(this.i, 2000L);
                    return;
                } else {
                    this.l.postDelayed(this.j, 2000L);
                    return;
                }
            }
            c();
        } else if (i == 3 || i == 4) {
            if (!z) {
                h();
                c();
            } else if (!z2) {
            } else {
                d();
            }
        } else if (!z) {
            h();
            c();
        } else if (!z2) {
            h();
            this.l.post(this.j);
        } else {
            d();
        }
    }
}
