package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: pt  reason: default package */
/* loaded from: classes7.dex */
public abstract class pt implements View.OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    final pr a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator f;
    private Runnable g;
    private final float[] h;
    private final float[] i;
    private final int j;
    private final int k;
    private final float[] l;
    private final float[] m;
    private final float[] n;
    private boolean o;
    private boolean p;

    public pt(View view) {
        pr prVar = new pr();
        this.a = prVar;
        this.f = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr5;
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float f3 = ((int) ((f * 1575.0f) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = q;
        prVar.a = 500;
        prVar.b = 500;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private final void g() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        pr prVar = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - prVar.e);
        int i3 = prVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        prVar.i = i;
        prVar.h = prVar.a(currentAnimationTimeMillis);
        prVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float h(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.h
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.i
            r1 = r1[r4]
            r2 = 0
            float r0 = c(r0, r2, r1)
            float r1 = r3.i(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.i(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = c(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r6 = r3.l
            r6 = r6[r4]
            float[] r0 = r3.m
            r0 = r0[r4]
            float[] r1 = r3.n
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L58
            float r5 = r5 * r6
            float r4 = c(r5, r0, r4)
            return r4
        L58:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = c(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt.h(int, float, float, float):float");
    }

    private final float i(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        pr prVar = this.a;
        float f = prVar.d;
        int abs = (int) (f / Math.abs(f));
        float f2 = prVar.c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs == 0 || !b(abs)) {
            return abs2 != 0 && d();
        }
        return true;
    }

    public abstract boolean b(int i);

    public abstract boolean d();

    public abstract void e(int i);

    public final void f(boolean z) {
        if (this.p && !z) {
            g();
        }
        this.p = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7d
        L16:
            r5.g()
            goto L7d
        L1a:
            r5.d = r2
            r5.o = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            android.view.View r4 = r5.b
            int r4 = r4.getWidth()
            float r3 = (float) r3
            float r4 = (float) r4
            float r0 = r5.h(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            android.view.View r3 = r5.b
            int r3 = r3.getHeight()
            float r6 = (float) r6
            float r3 = (float) r3
            float r6 = r5.h(r2, r7, r6, r3)
            pr r7 = r5.a
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.e
            if (r6 != 0) goto L7d
            boolean r6 = r5.a()
            if (r6 == 0) goto L7d
            java.lang.Runnable r6 = r5.g
            if (r6 != 0) goto L61
            ps r6 = new ps
            r6.<init>(r5)
            r5.g = r6
        L61:
            r5.e = r2
            r5.c = r2
            boolean r6 = r5.o
            if (r6 != 0) goto L76
            int r6 = r5.k
            if (r6 <= 0) goto L76
            android.view.View r7 = r5.b
            java.lang.Runnable r0 = r5.g
            long r3 = (long) r6
            defpackage.od.k(r7, r0, r3)
            goto L7b
        L76:
            java.lang.Runnable r6 = r5.g
            r6.run()
        L7b:
            r5.o = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
