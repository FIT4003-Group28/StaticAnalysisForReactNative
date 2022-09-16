package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: hyx  reason: default package */
/* loaded from: classes6.dex */
public final class hyx extends View {
    public hyx(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        if (r8.getTag(com.google.android.apps.maps.R.id.circular_chip) != null) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L80
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            int r2 = r0.indexOfChild(r6)
            r3 = -1
            if (r2 != r3) goto L19
            super.onMeasure(r7, r8)
            return
        L19:
            int r7 = r2 + (-1)
            r8 = 0
            r3 = r8
        L1d:
            if (r7 < 0) goto L2f
            if (r3 != 0) goto L2f
            android.view.View r4 = r0.getChildAt(r7)
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L2c
            r3 = r4
        L2c:
            int r7 = r7 + (-1)
            goto L1d
        L2f:
            int r2 = r2 + 1
            if (r2 >= r1) goto L45
            if (r8 != 0) goto L45
            android.view.View r7 = r0.getChildAt(r2)
            boolean r4 = r7 instanceof defpackage.hyx
            if (r4 != 0) goto L2f
            int r4 = r7.getVisibility()
            if (r4 != 0) goto L2f
            r8 = r7
            goto L2f
        L45:
            r7 = 2
            r0 = 0
            if (r3 == 0) goto L6f
            if (r8 == 0) goto L6f
            boolean r1 = r3 instanceof defpackage.hyx
            if (r1 == 0) goto L50
            goto L6f
        L50:
            r1 = 2131427609(0x7f0b0119, float:1.847684E38)
            java.lang.Object r2 = r3.getTag(r1)
            if (r2 != 0) goto L62
            java.lang.Object r2 = r8.getTag(r1)
            if (r2 != 0) goto L62
            r7 = 8
            goto L70
        L62:
            java.lang.Object r2 = r3.getTag(r1)
            if (r2 == 0) goto L70
            java.lang.Object r8 = r8.getTag(r1)
            if (r8 != 0) goto L6f
            goto L70
        L6f:
            r7 = 0
        L70:
            android.content.Context r8 = r6.getContext()
            int r7 = defpackage.jmj.a(r8, r7)
            int r8 = r6.getSuggestedMinimumHeight()
            r6.setMeasuredDimension(r7, r8)
            return
        L80:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyx.onMeasure(int, int):void");
    }

    public hyx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public hyx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
