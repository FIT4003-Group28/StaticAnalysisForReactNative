package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.filament.R;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acnk  reason: default package */
/* loaded from: classes2.dex */
public final class acnk {
    public int b;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    public final Rect a = new Rect();
    private final acnl c = new acnl();

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.d = i;
        this.e = i3;
        this.b = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = z;
        this.a.setEmpty();
        this.a.bottom = i2;
        this.c.a(i7, this.a.bottom, i, (i5 - i) - i3, (i6 - i) - i3);
    }

    public final void b(View view) {
        if (!this.c.b(view)) {
            c();
            dbsk.m(this.c.b(view), "Failed to add child to empty row");
        }
        Rect rect = this.a;
        rect.right = Math.max(rect.right, this.c.d() + this.d + this.e);
    }

    public final void c() {
        int i;
        List<View> list;
        int height;
        int i2;
        int i3;
        int i4;
        int height2;
        int i5;
        if (this.i) {
            acnl acnlVar = this.c;
            int i6 = acnlVar.a.left;
            int d = acnlVar.a.left + acnlVar.d();
            Iterator<View> it = acnlVar.b.iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                View next = it.next();
                if (i6 > d) {
                    bvoo.f(new IllegalStateException("Shouldn't be able to draw children over the top of each other"));
                }
                int c = acnlVar.c(next);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) next.getLayoutParams();
                int measuredWidth = next.getMeasuredWidth();
                int measuredHeight = next.getMeasuredHeight();
                int i7 = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                int i8 = c & 7;
                if (i8 != 1) {
                    if (i8 == 5) {
                        int i9 = d - marginLayoutParams.rightMargin;
                        int i10 = i9 - measuredWidth;
                        d -= i7;
                        i3 = i9;
                        i4 = i10;
                    } else {
                        i4 = marginLayoutParams.leftMargin + i6;
                        i3 = measuredWidth + i4;
                        i6 += i7;
                    }
                    int i11 = acnlVar.a.top + marginLayoutParams.topMargin;
                    int i12 = c & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i12 == 16) {
                        height2 = (acnlVar.a.height() - measuredHeight) / 2;
                    } else if (i12 == 80) {
                        height2 = acnlVar.a.height() - measuredHeight;
                    } else {
                        if (i12 == 112) {
                            i5 = acnlVar.a.bottom - marginLayoutParams.bottomMargin;
                            next.layout(i4, i11, i3, i5);
                        }
                        i5 = measuredHeight + i11;
                        next.layout(i4, i11, i3, i5);
                    }
                    i11 += height2;
                    i5 = measuredHeight + i11;
                    next.layout(i4, i11, i3, i5);
                }
            }
            int i13 = 0;
            for (View view : acnlVar.b) {
                if ((acnlVar.c(view) & 7) == 1) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    i13 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            int i14 = i6 + (((d - i6) - i13) / 2);
            if (acnlVar.c == 1) {
                list = dchl.l(acnlVar.b);
            } else {
                list = acnlVar.b;
            }
            for (View view2 : list) {
                int c2 = acnlVar.c(view2);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                if ((c2 & 7) == i) {
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    int i15 = marginLayoutParams3.leftMargin;
                    int i16 = marginLayoutParams3.rightMargin;
                    int i17 = marginLayoutParams3.leftMargin + i14;
                    int i18 = i17 + measuredWidth2;
                    i14 += measuredWidth2 + i15 + i16;
                    int i19 = acnlVar.a.top + marginLayoutParams3.topMargin;
                    int i20 = c2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i20 == 16) {
                        height = (acnlVar.a.height() - measuredHeight2) / 2;
                    } else if (i20 == 80) {
                        height = acnlVar.a.height() - measuredHeight2;
                    } else {
                        if (i20 == 112) {
                            i2 = acnlVar.a.bottom - marginLayoutParams3.bottomMargin;
                            view2.layout(i17, i19, i18, i2);
                            i = 1;
                        }
                        i2 = measuredHeight2 + i19;
                        view2.layout(i17, i19, i18, i2);
                        i = 1;
                    }
                    i19 += height;
                    i2 = measuredHeight2 + i19;
                    view2.layout(i17, i19, i18, i2);
                    i = 1;
                }
            }
        }
        this.a.bottom += this.c.a.height();
        acnl acnlVar2 = this.c;
        int i21 = this.h;
        int i22 = this.a.bottom;
        int i23 = this.d;
        int i24 = this.f;
        int i25 = this.e;
        acnlVar2.a(i21, i22, i23, (i24 - i23) - i25, (this.g - i23) - i25);
    }
}
