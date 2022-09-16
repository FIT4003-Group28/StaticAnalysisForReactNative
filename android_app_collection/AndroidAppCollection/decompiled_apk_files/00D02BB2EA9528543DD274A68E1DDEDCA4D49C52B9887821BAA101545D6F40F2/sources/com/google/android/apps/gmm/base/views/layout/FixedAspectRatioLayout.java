package com.google.android.apps.gmm.base.views.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FixedAspectRatioLayout extends FrameLayout {
    private float a;

    public FixedAspectRatioLayout(Context context) {
        super(context);
        this.a = 1.0f;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(FixedAspectRatioLayout.class, cqmpVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r8 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r4 <= r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r5 <= r2) goto L27;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r2 = android.view.View.MeasureSpec.getSize(r11)
            int r3 = android.view.View.MeasureSpec.getMode(r11)
            float r4 = r9.a
            float r5 = (float) r0
            float r5 = r5 / r4
            int r5 = (int) r5
            float r6 = (float) r2
            float r6 = r6 * r4
            int r4 = (int) r6
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 != r6) goto L22
            if (r3 != r6) goto L20
            goto L5f
        L20:
            r1 = 1073741824(0x40000000, float:2.0)
        L22:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L38
            if (r3 != r7) goto L38
            if (r4 <= r0) goto L2b
            r2 = r5
        L2b:
            if (r4 <= r0) goto L2e
            goto L2f
        L2e:
            r0 = r4
        L2f:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            goto L5f
        L38:
            if (r1 != r6) goto L3f
            if (r3 == 0) goto L52
            r8 = 1073741824(0x40000000, float:2.0)
            goto L40
        L3f:
            r8 = r1
        L40:
            if (r3 != r6) goto L45
            if (r8 != 0) goto L45
            goto L52
        L45:
            if (r3 != r6) goto L4b
            if (r1 != r7) goto L4b
            if (r4 <= r0) goto L52
        L4b:
            if (r1 != r6) goto L5f
            if (r3 != r7) goto L5f
            if (r5 <= r2) goto L52
            goto L5f
        L52:
            if (r1 != r6) goto L5a
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r2 = r5
            goto L5f
        L5a:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r0 = r4
        L5f:
            r9.setMeasuredDimension(r0, r2)
            r9.measureChildren(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (f > 0.0f) {
            this.a = f;
            requestLayout();
        }
    }

    public FixedAspectRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = 1.0f;
    }
}
