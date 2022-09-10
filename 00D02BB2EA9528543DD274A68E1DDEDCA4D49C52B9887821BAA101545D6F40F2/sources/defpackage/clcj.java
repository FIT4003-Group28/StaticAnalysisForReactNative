package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: clcj  reason: default package */
/* loaded from: classes5.dex */
public final class clcj extends clbe {
    public static final /* synthetic */ int k = 0;
    protected final float a;
    public boolean f;
    public float h;
    public float i;
    public final /* synthetic */ clcl j;
    private final int l;
    private final int m;
    public boolean b = true;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public final Queue<PointF> g = new LinkedList();

    /* JADX INFO: Access modifiers changed from: protected */
    public clcj(clcl clclVar, clbn clbnVar) {
        this.j = clclVar;
        this.l = clbnVar.a(70);
        this.m = clbnVar.a(30);
        this.a = 2.0f / Math.max(clbnVar.a.getDisplayMetrics().heightPixels, clbnVar.a.getDisplayMetrics().widthPixels);
    }

    private final float a() {
        return Math.abs(this.i) + Math.abs(this.h);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int max;
        int i;
        int max2;
        int i2;
        float f3 = f2 / f > 1.5f ? 0.0f : f;
        clcl clclVar = this.j;
        if (clclVar.w) {
            float f4 = clclVar.f();
            int scrollX = this.j.getScrollX();
            int scrollY = this.j.getScrollY();
            int scaledMaximumFlingVelocity = ViewConfiguration.get(this.j.getContext()).getScaledMaximumFlingVelocity();
            clcl clclVar2 = this.j;
            float e = this.j.e((((f2 / scaledMaximumFlingVelocity) * (clclVar2.n - clclVar2.c())) / 4.0f) + f4);
            int g = scrollX + clcl.g(f4, e, motionEvent.getX(), scrollX);
            int g2 = scrollY + clcl.g(f4, e, motionEvent.getY(), scrollY);
            this.j.p(g + clcl.l(e, g, this.j.g.width(), this.j.e.width()), g2 + clcl.l(e, g2, this.j.g.height(), this.j.e.height()), e, new DecelerateInterpolator());
            return true;
        }
        int scrollX2 = clclVar.getScrollX();
        int scrollY2 = this.j.getScrollY();
        clcl clclVar3 = this.j;
        Rect rect = new Rect((int) clclVar3.j(0.0f), (int) clclVar3.k(0.0f), (int) clclVar3.j(clclVar3.f.getWidth()), (int) clclVar3.k(clclVar3.f.getHeight()));
        if (this.j.e.contains(rect)) {
            return true;
        }
        if (rect.width() < this.j.e.width()) {
            i = (rect.width() - this.j.e.width()) / 2;
            max = i;
        } else {
            max = Math.max(0, rect.width() - this.j.e.width());
            i = 0;
        }
        if (rect.height() < this.j.e.height()) {
            i2 = (rect.height() - this.j.e.height()) / 2;
            max2 = i2;
        } else {
            max2 = Math.max(0, rect.height() - this.j.e.height());
            i2 = 0;
        }
        clcl clclVar4 = this.j;
        clclVar4.i = true;
        clclVar4.c.fling(scrollX2, scrollY2, (int) (-f3), (int) (-f2), i, max, i2, max2);
        this.j.invalidate();
        return true;
    }

    @Override // defpackage.clbe, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.j.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r9 > 25) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        if (r8 > 25) goto L28;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            int r6 = java.lang.Math.round(r8)
            int r7 = java.lang.Math.round(r9)
            boolean r0 = r5.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6a
            java.util.Queue<android.graphics.PointF> r0 = r5.g
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r8, r9)
            r0.offer(r3)
            float r0 = r5.h
            float r0 = r0 + r8
            r5.h = r0
            float r0 = r5.i
            float r0 = r0 + r9
            r5.i = r0
        L22:
            float r0 = r5.a()
            int r3 = r5.l
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4c
            java.util.Queue<android.graphics.PointF> r0 = r5.g
            int r0 = r0.size()
            if (r0 <= r1) goto L4c
            java.util.Queue<android.graphics.PointF> r0 = r5.g
            java.lang.Object r0 = r0.poll()
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r3 = r5.i
            float r4 = r0.y
            float r3 = r3 - r4
            r5.i = r3
            float r3 = r5.h
            float r0 = r0.x
            float r3 = r3 - r0
            r5.h = r3
            goto L22
        L4c:
            float r0 = r5.a()
            int r3 = r5.m
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L69
            float r0 = r5.i
            float r3 = r5.h
            float r0 = r0 / r3
            float r0 = java.lang.Math.abs(r0)
            r3 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L69
            r5.f = r2
            goto L6a
        L69:
            r6 = 0
        L6a:
            clcl r0 = r5.j
            r0.scrollBy(r6, r7)
            clcl r6 = r5.j
            r6.n()
            clcl r6 = r5.j
            r6.o(r2)
            clcl r6 = r5.j
            clbf r6 = r6.a
            clbd[] r7 = new defpackage.clbd[r1]
            clbd r0 = defpackage.clbd.ZOOM
            r7[r2] = r0
            boolean r6 = r6.c(r7)
            if (r6 != 0) goto Lc8
            float r6 = java.lang.Math.abs(r8)
            float r7 = java.lang.Math.abs(r9)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L97
            r6 = 0
            goto L98
        L97:
            r6 = 1
        L98:
            clcl r7 = r5.j
            int r8 = r7.j
            int r9 = r7.k
            r0 = 25
            if (r6 == 0) goto Lb0
            boolean r6 = r5.d
            if (r6 == 0) goto La9
            int r6 = -r9
            if (r6 > r0) goto Lb8
        La9:
            boolean r6 = r5.e
            if (r6 == 0) goto Lc1
            if (r9 <= r0) goto Lc8
            goto Lb8
        Lb0:
            boolean r6 = r5.b
            if (r6 == 0) goto Lba
            int r6 = -r8
            if (r6 > r0) goto Lb8
            goto Lba
        Lb8:
            r6 = 1
            goto Lc2
        Lba:
            boolean r6 = r5.c
            if (r6 == 0) goto Lc1
            if (r8 <= r0) goto Lc8
            goto Lb8
        Lc1:
            r6 = 0
        Lc2:
            if (r6 == 0) goto Lc8
            r7.a()
            return r2
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcj.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        clcl clclVar = this.j;
        if (!clclVar.h || clclVar.m == clclVar.n) {
            clclVar.a();
            return false;
        }
        float d = clclVar.d();
        if (d == 0.0f || Float.isInfinite(d) || Float.isNaN(d)) {
            return false;
        }
        float f = this.j.f();
        int scrollX = this.j.getScrollX();
        int scrollY = this.j.getScrollY();
        float e = this.j.e(d);
        if (clbh.a(e, f, 0.25f)) {
            e = this.j.e(e + e);
        }
        if (clbh.a(e, f, 0.25f)) {
            e = this.j.e(1.0f);
        }
        int g = scrollX + clcl.g(f, e, motionEvent.getX(), scrollX);
        int g2 = scrollY + clcl.g(f, e, motionEvent.getY(), scrollY);
        int width = this.j.g.width();
        int width2 = this.j.e.width();
        int height = this.j.g.height();
        int height2 = this.j.e.height();
        this.j.p(g + clcl.l(e, g, width, width2), g2 + clcl.l(e, g2, height, height2), e, new AccelerateInterpolator());
        return true;
    }

    @Override // defpackage.clbe, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        clcl clclVar = this.j;
        if (clclVar.m != clclVar.n || clclVar.u) {
            clclVar.w = true;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float abs = Math.abs(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan()) * this.a;
            float f = scaleFactor >= 1.0f ? abs + 1.0f : 1.0f - abs;
            float f2 = this.j.f();
            float e = this.j.e(f * f2);
            if (e != f2) {
                this.j.setZoom(e, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                this.j.n();
                this.j.o(false);
            }
            return true;
        }
        clclVar.a();
        return false;
    }
}
