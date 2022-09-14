package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: acnl  reason: default package */
/* loaded from: classes2.dex */
final class acnl {
    public final Rect a = new Rect();
    public final List<View> b = new ArrayList();
    public int c;
    private int d;
    private int e;

    public final void a(int i, int i2, int i3, int i4, int i5) {
        this.a.set(i3, i2, i3, i2);
        this.b.clear();
        this.d = i4;
        this.e = i5;
        this.c = i;
    }

    public final boolean b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int i2 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int width = this.e - this.a.width();
        if (i <= width) {
            this.a.right += i;
            if (this.a.height() < i2) {
                Rect rect = this.a;
                rect.bottom = rect.top + i2;
            }
            this.b.add(view);
            return true;
        } else if (!this.b.isEmpty()) {
            return false;
        } else {
            this.a.right += width;
            Rect rect2 = this.a;
            rect2.bottom = rect2.top + i2;
            this.b.add(view);
            return true;
        }
    }

    public final int c(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            i = ((LinearLayout.LayoutParams) layoutParams).gravity;
        } else {
            i = layoutParams instanceof FrameLayout.LayoutParams ? ((FrameLayout.LayoutParams) layoutParams).gravity : 0;
        }
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if ((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i |= 48;
        }
        return (i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | Gravity.getAbsoluteGravity(i, this.c);
    }

    public final int d() {
        return Math.min(Math.max(this.a.width(), this.d), this.e);
    }
}
