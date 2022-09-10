package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: PG */
/* renamed from: czvp  reason: default package */
/* loaded from: classes5.dex */
public final class czvp extends amx {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public czvp(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.amx
    public final void a(int i) {
        dafa dafaVar = this.a.f;
        if (dafaVar != null) {
            if (i != 0) {
                dafn.a().e(dafaVar.a.m);
            } else {
                dafn.a().f(dafaVar.a.m);
            }
        }
    }

    @Override // defpackage.amx
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (java.lang.Math.abs(r6.getLeft() - r5.b) >= java.lang.Math.round(r6.getWidth() * r5.a.c)) goto L29;
     */
    @Override // defpackage.amx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r8 = -1
            r5.c = r8
            int r8 = r6.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 == 0) goto L33
            int r2 = defpackage.od.s(r6)
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            int r3 = r3.b
            r4 = 2
            if (r3 != r4) goto L19
            goto L4f
        L19:
            if (r3 != 0) goto L27
            if (r2 != r0) goto L22
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L4f
            goto L5b
        L22:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L5b
            goto L4f
        L27:
            if (r2 != r0) goto L2e
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L5b
            goto L4f
        L2e:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L5b
            goto L4f
        L33:
            int r7 = r6.getLeft()
            int r1 = r5.b
            int r2 = r6.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            float r3 = r3.c
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r2) goto L5b
        L4f:
            int r7 = r6.getLeft()
            int r1 = r5.b
            if (r7 >= r1) goto L59
            int r1 = r1 - r8
            goto L5e
        L59:
            int r1 = r1 + r8
            goto L5e
        L5b:
            int r1 = r5.b
            r0 = 0
        L5e:
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            amy r7 = r7.a
            int r8 = r6.getTop()
            boolean r7 = r7.e(r1, r8)
            if (r7 == 0) goto L77
            czvr r7 = new czvr
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r5.a
            r7.<init>(r8, r6, r0)
            defpackage.od.j(r6, r7)
            return
        L77:
            if (r0 == 0) goto L82
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            dafa r7 = r7.f
            if (r7 == 0) goto L82
            r7.a(r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czvp.c(android.view.View, float, float):void");
    }

    @Override // defpackage.amx
    public final int e(View view) {
        return view.getWidth();
    }

    @Override // defpackage.amx
    public final boolean f(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.s(view);
    }

    @Override // defpackage.amx
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        int s = od.s(view);
        int i2 = this.a.b;
        if (i2 == 0) {
            if (s == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (s == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.amx
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.amx
    public final void l(View view, int i, int i2) {
        float width = this.b + (view.getWidth() * this.a.d);
        float width2 = this.b + (view.getWidth() * this.a.e);
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.t(1.0f - ((f - width) / (width2 - width))));
        }
    }
}
