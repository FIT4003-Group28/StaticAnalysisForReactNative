package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jfq  reason: default package */
/* loaded from: classes3.dex */
public final class jfq {
    private Animator A;
    private final sdb B;
    public final int a;
    public final int b;
    public final int c;
    public ViewGroup d;
    public ViewGroup e;
    public SlimStatusBar f;
    public SlimStatusBar g;
    public int h;
    public AnimatorSet i;
    public Runnable j;
    public Runnable k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public Runnable o;
    public Runnable p;
    public Runnable q;
    public Runnable r;
    public Runnable s;
    public Runnable t;
    public Runnable u;
    public LayoutTransition v;
    public LayoutTransition w;
    private final acth x;
    private final long y;
    private int z;

    public jfq(Context context, sdb sdbVar, acth acthVar, byte[] bArr) {
        this.B = sdbVar;
        this.x = acthVar;
        Resources resources = context.getResources();
        this.a = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.b = resources.getColor(R.color.slim_status_bar_inactive_background_color);
        this.c = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.y = resources.getInteger(17694722);
    }

    public static boolean r(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }

    private static Animator s(SlimStatusBar slimStatusBar) {
        return ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, PropertyValuesHolder.ofInt("top", slimStatusBar.getTop(), slimStatusBar.getBottom()));
    }

    private final void t(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if (z) {
            j();
        } else {
            i();
        }
        h();
        ViewGroup b = b(z);
        SlimStatusBar c = c(z);
        this.h = 3;
        c.a(R.string.offline_bottom_status_bar_connection_regained);
        if (!z) {
            Animator c2 = jfw.c(c, this.b, this.a, 250L);
            this.A = c2;
            c2.addListener(new jfn(this, c));
            this.A.start();
        } else {
            c.setBackgroundColor(this.a);
        }
        if (z) {
            runnable = this.n;
        } else {
            runnable = this.j;
        }
        b.post(runnable);
        if (!z2 || z) {
            if (!z) {
                runnable2 = this.l;
            } else {
                runnable2 = this.p;
            }
            b.postDelayed(runnable2, 2000L);
        } else {
            b.postDelayed(this.t, 2000L);
        }
        this.B.c(false);
    }

    public final LayoutTransition a(boolean z) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(this.y);
        if (z) {
            layoutTransition.addTransitionListener(new lbw(1));
        }
        return layoutTransition;
    }

    public final ViewGroup b(boolean z) {
        return z ? this.e : this.d;
    }

    public final SlimStatusBar c(boolean z) {
        return z ? this.g : this.f;
    }

    public final Runnable d(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar, final boolean z, final boolean z2) {
        return new Runnable() { // from class: jfk
            @Override // java.lang.Runnable
            public final void run() {
                jfq jfqVar = jfq.this;
                final ViewGroup viewGroup2 = viewGroup;
                final SlimStatusBar slimStatusBar2 = slimStatusBar;
                boolean z3 = z;
                boolean z4 = z2;
                if (!jfq.r(viewGroup2, slimStatusBar2)) {
                    if (slimStatusBar2.getParent() != null) {
                        viewGroup2.endViewTransition(slimStatusBar2);
                    }
                    jfqVar.p(viewGroup2, slimStatusBar2);
                    viewGroup2.addView(slimStatusBar2);
                    slimStatusBar2.post(new Runnable() { // from class: jfi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewGroup viewGroup3 = viewGroup2;
                            SlimStatusBar slimStatusBar3 = slimStatusBar2;
                            int indexOfChild = viewGroup3.indexOfChild(slimStatusBar3) - 1;
                            if (indexOfChild < 0) {
                                return;
                            }
                            View childAt = viewGroup3.getChildAt(indexOfChild);
                            Rect rect = new Rect();
                            childAt.getHitRect(rect);
                            rect.bottom += slimStatusBar3.getHeight();
                            viewGroup3.setTouchDelegate(new jfp(rect, childAt));
                        }
                    });
                }
                if (!z3) {
                    jfqVar.h = 2;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.offline_bottom_status_bar_connection_lost));
                    jfqVar.l(actj.OFFLINE_CONNECTIVITY_DISCONNECTED_BAR);
                } else if (z4) {
                    jfqVar.h = 5;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.bottom_status_bar_incognito_mode));
                } else {
                    jfqVar.h = 4;
                    slimStatusBar2.announceForAccessibility(slimStatusBar2.getContext().getString(R.string.offline_bottom_status_bar_connection_regained));
                    jfqVar.l(actj.OFFLINE_CONNECTIVITY_RECONNECTED_BAR);
                }
            }
        };
    }

    public final Runnable e(boolean z) {
        return new jfm(this, z, 1);
    }

    public final Runnable f(boolean z) {
        return new jfm(this, z);
    }

    public final Runnable g(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        return new Runnable() { // from class: jfj
            @Override // java.lang.Runnable
            public final void run() {
                jfq jfqVar = jfq.this;
                ViewGroup viewGroup2 = viewGroup;
                SlimStatusBar slimStatusBar2 = slimStatusBar;
                jfqVar.p(viewGroup2, slimStatusBar2);
                viewGroup2.removeView(slimStatusBar2);
                viewGroup2.setTouchDelegate(null);
                jfqVar.h = 0;
            }
        };
    }

    public final void h() {
        Animator animator = this.A;
        if (animator != null) {
            animator.cancel();
            this.A = null;
        }
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.i = null;
        }
    }

    public final void i() {
        this.d.removeCallbacks(this.k);
        this.d.removeCallbacks(this.j);
        this.d.removeCallbacks(this.l);
        this.d.removeCallbacks(this.m);
        this.d.removeCallbacks(this.r);
        this.d.removeCallbacks(this.t);
    }

    public final void j() {
        this.e.removeCallbacks(this.o);
        this.e.removeCallbacks(this.n);
        this.e.removeCallbacks(this.p);
        this.e.removeCallbacks(this.q);
        this.e.removeCallbacks(this.u);
    }

    public final void k(boolean z) {
        if (z) {
            j();
        } else {
            i();
        }
    }

    public final void l(actj actjVar) {
        this.z++;
        acti oi = this.x.oi();
        oi.n(acun.a(oi.i(Integer.valueOf(this.z), actjVar, this.z)));
    }

    public final void m(boolean z, long j) {
        this.h = 1;
        b(z).postDelayed(z ? this.q : this.m, j);
    }

    public final void n(boolean z, boolean z2) {
        if (z2) {
            j();
        } else {
            i();
        }
        h();
        ViewGroup b = b(z2);
        SlimStatusBar c = c(z2);
        c.a(R.string.offline_bottom_status_bar_connection_lost);
        c.setBackgroundColor(this.b);
        b.post(z2 ? this.o : this.k);
        if (z2) {
            this.h = 4;
            b.postDelayed(this.p, 5000L);
        }
        if (z) {
            this.B.c(true);
        }
    }

    public final void o(boolean z) {
        if (z) {
            j();
        } else {
            i();
        }
        ViewGroup b = b(z);
        SlimStatusBar c = c(z);
        c.a(R.string.bottom_status_bar_incognito_mode);
        c.setBackgroundColor(this.b);
        b.post(!z ? this.r : this.s);
        if (z) {
            this.h = 4;
            b.postDelayed(this.p, 5000L);
        }
    }

    public final void p(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        if (viewGroup == this.d) {
            this.v.setAnimator(3, s(slimStatusBar));
        } else {
            this.w.setAnimator(3, s(slimStatusBar));
        }
    }

    public final void q(boolean z, boolean z2, boolean z3) {
        this.d.setLayoutTransition(this.v);
        this.e.setLayoutTransition(this.w);
        int i = this.h;
        if (i == 0) {
            k(z);
            if (!z2) {
                if (z) {
                    n(true, true);
                    return;
                } else {
                    m(false, 3000L);
                    return;
                }
            }
            if (z3) {
                o(z);
            } else if (z) {
                t(true, false);
            }
            this.B.c(false);
        } else if (i == 1) {
            if (!z2) {
                return;
            }
            k(z);
            this.h = 0;
            if (!z3) {
                return;
            }
            o(z);
        } else if (i == 2) {
            k(z);
            if (z2) {
                t(z, z3);
            } else {
                n(true, z);
            }
        } else if (i == 3) {
            if (!z2) {
                k(z);
                n(true, z);
            } else if (!z3) {
            } else {
                o(z);
            }
        } else if (i == 4) {
            if (!z2) {
                k(z);
                n(true, z);
            } else if (!z3) {
            } else {
                o(z);
            }
        } else if (!z2) {
            k(z);
            n(true, z);
        } else if (!z3) {
            i();
            b(false).post(this.l);
        } else {
            o(z);
        }
    }
}
