package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: xyx  reason: default package */
/* loaded from: classes4.dex */
public final class xyx {
    public int b;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    public final Rect a = new Rect();
    private final xyy c = new xyy();

    public final void a(View view) {
        if (!this.c.b(view)) {
            b();
            aqxo.z(this.c.b(view), "Failed to add child to empty row");
        }
        Rect rect = this.a;
        rect.right = Math.max(rect.right, this.c.a() + this.d + this.e);
    }

    public final void b() {
        int i;
        int height;
        int i2;
        if (this.h) {
            xyy xyyVar = this.c;
            int a = xyyVar.a.left + ((xyyVar.c - xyyVar.a()) / 2);
            for (View view : xyyVar.b) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    i = ((LinearLayout.LayoutParams) layoutParams).gravity;
                } else {
                    i = layoutParams instanceof FrameLayout.LayoutParams ? ((FrameLayout.LayoutParams) layoutParams).gravity : 0;
                }
                if ((8388615 & i) == 0) {
                    i |= 8388611;
                }
                if ((i & 112) == 0) {
                    i |= 48;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i, xyyVar.d);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i3 = marginLayoutParams.leftMargin;
                int i4 = marginLayoutParams.rightMargin;
                int i5 = marginLayoutParams.leftMargin + a;
                int i6 = i5 + measuredWidth;
                a += measuredWidth + i3 + i4;
                int i7 = xyyVar.a.top + marginLayoutParams.topMargin;
                int i8 = ((i & 112) | absoluteGravity) & 112;
                if (i8 == 16) {
                    height = (xyyVar.a.height() - measuredHeight) / 2;
                } else if (i8 == 80) {
                    height = xyyVar.a.height() - measuredHeight;
                } else {
                    if (i8 == 112) {
                        i2 = xyyVar.a.bottom - marginLayoutParams.bottomMargin;
                        view.layout(i5, i7, i6, i2);
                    }
                    i2 = measuredHeight + i7;
                    view.layout(i5, i7, i6, i2);
                }
                i7 += height;
                i2 = measuredHeight + i7;
                view.layout(i5, i7, i6, i2);
            }
        }
        this.a.bottom += this.c.a.height();
        xyy xyyVar2 = this.c;
        int i9 = this.g;
        int i10 = this.a.bottom;
        int i11 = this.d;
        xyyVar2.c(i9, i10, i11, (this.f - i11) - this.e);
    }

    public final void c(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.d = i;
        this.e = i3;
        this.b = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.a.setEmpty();
        this.a.bottom = i2;
        this.c.c(i6, this.a.bottom, i, (i5 - i) - i3);
    }
}
