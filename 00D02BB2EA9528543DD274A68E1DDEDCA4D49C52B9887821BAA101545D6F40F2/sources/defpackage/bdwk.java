package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: bdwk  reason: default package */
/* loaded from: classes3.dex */
public final class bdwk implements View.OnAttachStateChangeListener, jkh, begc {
    public final ViewGroup a;
    final ModAppBar b;
    public boolean c = true;
    public boolean d = false;
    ValueAnimator e;
    private final cqkf<jbk> f;
    private final int g;
    private final gdk h;
    private final jkf i;
    private final dzsj<glj> j;
    private boolean k;
    private boolean l;

    public bdwk(Activity activity, cqkj cqkjVar, jkf jkfVar, dzsj<glj> dzsjVar, cqss cqssVar) {
        this.i = jkfVar;
        this.j = dzsjVar;
        cqkf<jbk> c = cqkjVar.c(new hxj(), null);
        this.f = c;
        ModAppBar modAppBar = (ModAppBar) c.c();
        this.b = modAppBar;
        modAppBar.b();
        modAppBar.setOnToolbarPropertiesUpdatedListener(new bdwj(this));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.addView(modAppBar, -1, -2);
        gdk gdkVar = new gdk(activity, cqssVar, ise.b.e(activity), jmj.a(activity, 10));
        this.h = gdkVar;
        frameLayout.addOnAttachStateChangeListener(this);
        frameLayout.setBackground(gdkVar);
        this.g = jmj.a(activity, 10);
    }

    private static int f(jkj jkjVar, float f) {
        return Math.round((jkjVar.C(jjn.FULLY_EXPANDED) - jkjVar.C(jjn.EXPANDED)) * (1.0f - f)) + jkjVar.getTop();
    }

    private final void g() {
        this.a.animate().cancel();
        jjn L = this.i.l().L();
        boolean b = L.b();
        this.l = b;
        boolean z = true;
        this.a.setAlpha(true != b ? 0.0f : 1.0f);
        this.a.setVisibility(true != this.l ? 4 : 0);
        if (L != jjn.FULLY_EXPANDED) {
            z = false;
        }
        e(z, false);
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r8.b() != false) goto L6;
     */
    @Override // defpackage.jkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.jkj r7, defpackage.jjn r8, float r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdwk.P(jkj, jjn, float):void");
    }

    @Override // defpackage.begc
    public final void a() {
        this.f.e(null);
    }

    @Override // defpackage.begc
    public final View b() {
        return this.a;
    }

    @Override // defpackage.begc
    public final void c(jbk jbkVar) {
        this.f.e(jbkVar);
        g();
    }

    @Override // defpackage.begc
    public final void d(boolean z) {
        this.k = z;
    }

    final void e(boolean z, boolean z2) {
        this.d = true;
        if (z != this.c) {
            this.c = z;
            float f = true != z ? 0.0f : 1.0f;
            long j = true != z2 ? 0L : 300L;
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.b.getAlpha(), f);
            this.e = ofFloat;
            ofFloat.setDuration(j);
            this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bdwg
                private final bdwk a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.a.b.setTitleAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            this.e.start();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.j.a().e(this);
        g();
        if (this.l) {
            this.a.invalidate();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.a().j(this);
        e(true, false);
        this.d = false;
    }
}
