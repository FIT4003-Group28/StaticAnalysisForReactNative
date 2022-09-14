package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: bdwe  reason: default package */
/* loaded from: classes3.dex */
public final class bdwe implements View.OnAttachStateChangeListener, jkh, begc {
    public final ViewGroup a;
    private final cqkf<jbk> b;
    private final View c;
    private final View d;
    private final int e;
    private final gdk f;
    private final jkf g;
    private final dzsj<glj> h;
    private final boolean i;
    private boolean j;

    public bdwe(Activity activity, cqkj cqkjVar, jkf jkfVar, dzsj<glj> dzsjVar, cqss cqssVar, boolean z) {
        this.i = z;
        this.g = jkfVar;
        this.h = dzsjVar;
        cqkf<jbk> c = cqkjVar.c(z ? new icw() : new gst(), null);
        this.b = c;
        View c2 = c.c();
        this.c = c2;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.addView(c2, -1, -2);
        gdk gdkVar = new gdk(activity, cqssVar, ise.b.e(activity), jmj.a(activity, 10));
        this.f = gdkVar;
        frameLayout.addOnAttachStateChangeListener(this);
        frameLayout.setBackground(gdkVar);
        this.d = cqkx.d(c2, ise.a);
        this.e = jmj.a(activity, 10);
    }

    private static int e(jkj jkjVar, float f) {
        return Math.round((jkjVar.C(jjn.FULLY_EXPANDED) - jkjVar.C(jjn.EXPANDED)) * (1.0f - f)) + jkjVar.getTop();
    }

    private final void f() {
        this.a.animate().cancel();
        jjn L = this.g.l().L();
        boolean b = L.b();
        this.j = b;
        float f = 0.0f;
        boolean z = true;
        this.a.setAlpha(true != b ? 0.0f : 1.0f);
        this.a.setVisibility(true != this.j ? 4 : 0);
        jjn jjnVar = jjn.FULLY_EXPANDED;
        if (L != jjnVar) {
            z = false;
        }
        if (this.i) {
            ((idc) this.c).c(z, false);
        } else {
            ((jlg) this.c).c(z, false);
        }
        View view = this.d;
        if (L == jjnVar) {
            f = 1.0f;
        }
        view.setAlpha(f);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    @Override // defpackage.jkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.jkj r7, defpackage.jjn r8, float r9) {
        /*
            r6 = this;
            android.view.ViewGroup r0 = r6.a
            int r0 = r0.getHeight()
            jjn r1 = defpackage.jjn.FULLY_EXPANDED
            r2 = 1
            r3 = 0
            if (r8 != r1) goto Le
        Lc:
            r1 = 0
            goto L24
        Le:
            jjn r1 = defpackage.jjn.EXPANDED
            if (r8 != r1) goto L22
            int r1 = e(r7, r9)
            int r1 = r0 - r1
            int r1 = java.lang.Math.max(r1, r3)
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            goto L24
        L22:
            r0 = 0
            goto Lc
        L24:
            gdk r4 = r6.f
            r4.a(r0, r1)
            boolean r0 = r8.b()
            r1 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L70
            boolean r0 = r6.j
            if (r0 != 0) goto L70
            android.view.ViewGroup r0 = r6.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.ViewGroup r0 = r6.a
            r0.setVisibility(r3)
            android.view.ViewGroup r0 = r6.a
            int r5 = r6.e
            int r5 = -r5
            float r5 = (float) r5
            r0.setTranslationY(r5)
            android.view.ViewGroup r0 = r6.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r4)
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.animation.Interpolator r5 = defpackage.irf.a
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r5)
            bdwc r5 = new bdwc
            r5.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r5)
            r0.start()
            r6.j = r2
            goto La1
        L70:
            boolean r0 = r8.b()
            if (r0 != 0) goto La1
            boolean r0 = r6.j
            if (r0 == 0) goto La1
            android.view.ViewGroup r0 = r6.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.ViewGroup r0 = r6.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.animation.Interpolator r5 = defpackage.irf.a
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r5)
            bdwd r5 = new bdwd
            r5.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r5)
            r0.start()
            r6.j = r3
        La1:
            jjn r0 = defpackage.jjn.FULLY_EXPANDED
            if (r8 != r0) goto Lb3
            android.view.View r0 = r6.d
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r4)
            r0.start()
            goto Lc2
        Lb3:
            android.view.View r0 = r6.d
            float r0 = r0.getAlpha()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc2
            android.view.View r0 = r6.d
            r0.setAlpha(r1)
        Lc2:
            jjn r0 = defpackage.jjn.FULLY_EXPANDED
            if (r8 == r0) goto Ld0
            jjn r0 = defpackage.jjn.EXPANDED
            if (r8 != r0) goto Ld1
            int r7 = e(r7, r9)
            if (r7 > 0) goto Ld1
        Ld0:
            r3 = 1
        Ld1:
            boolean r7 = r6.i
            if (r7 == 0) goto Ldd
            android.view.View r7 = r6.c
            idc r7 = (defpackage.idc) r7
            r7.c(r3, r2)
            return
        Ldd:
            android.view.View r7 = r6.c
            jlg r7 = (defpackage.jlg) r7
            r7.c(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdwe.P(jkj, jjn, float):void");
    }

    @Override // defpackage.begc
    public final void a() {
        this.b.e(null);
    }

    @Override // defpackage.begc
    public final View b() {
        return this.a;
    }

    @Override // defpackage.begc
    public final void c(jbk jbkVar) {
        this.b.e(jbkVar);
        f();
    }

    @Override // defpackage.begc
    public final void d(boolean z) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.h.a().e(this);
        f();
        if (this.j) {
            this.a.invalidate();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h.a().j(this);
        if (this.i) {
            idc idcVar = (idc) this.c;
            idcVar.c(true, false);
            idcVar.f = false;
        } else {
            jlg jlgVar = (jlg) this.c;
            jlgVar.c(true, false);
            jlgVar.c = false;
        }
        this.d.setAlpha(1.0f);
    }
}
