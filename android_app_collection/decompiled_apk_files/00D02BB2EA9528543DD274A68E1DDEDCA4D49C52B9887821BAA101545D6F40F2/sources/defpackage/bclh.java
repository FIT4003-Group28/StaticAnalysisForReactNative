package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bclh  reason: default package */
/* loaded from: classes3.dex */
public final class bclh implements abw {
    private static final Rect b = new Rect();
    private static final RectF c = new RectF();
    final int a;
    private final cjqy d;
    private aljd e;
    private float f;
    private float g;
    private boolean h;

    public bclh(Context context, cjqy cjqyVar) {
        this.d = cjqyVar;
        this.a = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    private final void a() {
        this.h = false;
        this.e = null;
    }

    private final boolean b() {
        return this.e != null;
    }

    private static bxbx c(ViewGroup viewGroup, float f, float f2) {
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            Rect rect = b;
            childAt.getHitRect(rect);
            RectF rectF = c;
            rectF.set(rect);
            if (rectF.contains(f, f2)) {
                if (!(childAt instanceof bxbx)) {
                    if (childAt instanceof ViewGroup) {
                        return c((ViewGroup) childAt, f - childAt.getLeft(), f2 - childAt.getTop());
                    }
                } else {
                    return (bxbx) childAt;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // defpackage.abw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.support.v7.widget.RecyclerView r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            int r0 = r9.getPointerCount()
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L9
            return r1
        L9:
            int r0 = r9.getActionMasked()
            if (r0 == 0) goto L82
            if (r0 == r2) goto L78
            r8 = 2
            if (r0 == r8) goto L19
            r8 = 3
            if (r0 == r8) goto L78
            goto Ld3
        L19:
            boolean r8 = r7.b()
            if (r8 == 0) goto Ld3
            boolean r8 = r7.h
            if (r8 != 0) goto Ld3
            int r8 = r9.getHistorySize()
            r0 = 0
        L28:
            int r3 = r8 + 1
            if (r0 >= r3) goto Ld3
            if (r0 >= r8) goto L37
            float r3 = r9.getHistoricalX(r0)
            float r4 = r9.getHistoricalY(r0)
            goto L3f
        L37:
            float r3 = r9.getX()
            float r4 = r9.getY()
        L3f:
            float r5 = r7.f
            float r6 = r7.g
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            int r5 = r7.a
            float r5 = (float) r5
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L62
            r6 = 1067030938(0x3f99999a, float:1.2)
            float r6 = r6 * r3
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L5e
            goto L62
        L5e:
            r7.a()
            return r1
        L62:
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L75
            r7.h = r2
            float r8 = r9.getX()
            r7.f = r8
            float r8 = r9.getY()
            r7.g = r8
            return r2
        L75:
            int r0 = r0 + 1
            goto L28
        L78:
            boolean r8 = r7.b()
            if (r8 == 0) goto Ld3
            r7.a()
            goto Ld3
        L82:
            boolean r0 = r7.b()
            if (r0 != 0) goto Ld3
            r7.h = r1
            float r0 = r9.getX()
            r7.f = r0
            float r0 = r9.getY()
            r7.g = r0
            float r1 = r7.f
            bxbx r0 = c(r8, r1, r0)
            r1 = 0
            if (r0 == 0) goto La9
            r3 = 2131428631(0x7f0b0517, float:1.8478912E38)
            java.lang.Object r3 = r0.getTag(r3)
            bcln r3 = (defpackage.bcln) r3
            goto Laa
        La9:
            r3 = r1
        Laa:
            if (r0 == 0) goto Ld1
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Ld1
            if (r3 == 0) goto Ld1
            aljd r0 = new aljd
            android.content.Context r1 = r8.getContext()
            bclg r4 = new bclg
            cjqy r5 = r7.d
            r4.<init>(r3, r5)
            r0.<init>(r1, r4)
            r7.e = r0
            r0.e(r9)
            android.view.ViewParent r8 = r8.getParent()
            r8.requestDisallowInterceptTouchEvent(r2)
            goto Ld3
        Ld1:
            r7.e = r1
        Ld3:
            boolean r8 = r7.h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclh.f(android.support.v7.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.abw
    public final void h(boolean z) {
    }

    @Override // defpackage.abw
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.h) {
            throw new IllegalStateException("We should only be here if we intercepted the touch due to swipe.");
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            if (b()) {
                this.e.e(motionEvent);
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                a();
                return;
            }
            a();
        } else if ((actionMasked != 2 && actionMasked != 4) || !b()) {
        } else {
            this.e.e(motionEvent);
        }
    }
}
