package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cye  reason: default package */
/* loaded from: classes5.dex */
public final class cye extends ViewGroup {
    private static final String a = "cye";
    private View b;
    private View c;
    private int d;
    private int e;

    public cye(Context context) {
        this(context, null);
    }

    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(cye.class, cqmpVarArr);
    }

    private static int b(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.b;
        if (view == null || this.c == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = this.b.getMeasuredWidth();
        if (od.s(this) == 1) {
            this.b.layout((i3 - measuredWidth) - i, 0, i3, measuredHeight);
        } else {
            this.b.layout(0, 0, measuredWidth, measuredHeight);
        }
        if (this.c.getVisibility() == 8) {
            return;
        }
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredHeight2 = this.c.getMeasuredHeight();
        int i5 = this.e + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
        if (od.s(this) == 1) {
            View view2 = this.c;
            int i6 = i3 - this.d;
            view2.layout((i6 - measuredWidth2) - i, i5, i6, measuredHeight2 + i5);
            return;
        }
        View view3 = this.c;
        int i7 = this.d;
        view3.layout(i7, i5, measuredWidth2 + i7, measuredHeight2 + i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
        if (r5 == 8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cye.onMeasure(int, int):void");
    }

    public cye(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
    }
}
