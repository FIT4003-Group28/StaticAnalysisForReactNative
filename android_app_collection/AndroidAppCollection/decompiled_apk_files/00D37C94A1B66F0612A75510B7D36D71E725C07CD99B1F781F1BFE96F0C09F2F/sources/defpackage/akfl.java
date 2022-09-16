package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
@Deprecated
/* renamed from: akfl  reason: default package */
/* loaded from: classes.dex */
public final class akfl {
    public final akfk a;

    public akfl(View view, int i, View view2, int i2) {
        view.getClass();
        view2.getClass();
        akfk akfkVar = new akfk(view2.getContext());
        this.a = akfkVar;
        akfkVar.c = view;
        akfkVar.a = new PopupWindow(akfkVar);
        akfkVar.addView(view);
        if (g(i)) {
            if (g(i)) {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int i3 = i(akfkVar);
                int i4 = view2.getResources().getDisplayMetrics().heightPixels;
                int i5 = i(view2);
                if (i != 1 ? i3 >= (i4 - i5) - iArr[1] : i3 >= iArr[1]) {
                    i = i == 1 ? 2 : 1;
                }
            }
        } else if (!g(i)) {
            int a = a(i, view2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int j = j(akfkVar);
            int i6 = view2.getResources().getDisplayMetrics().widthPixels;
            int j2 = j(view2);
            if (a != 5 ? j >= (i6 - j2) - iArr2[0] : j >= iArr2[0]) {
                i = i == 3 ? 4 : 3;
            }
        }
        akfkVar.e = view2;
        akfkVar.b();
        akfkVar.d = i;
        akfkVar.f = i2;
    }

    public static int a(int i, View view) {
        int e = lj.e(view);
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return e != 1 ? 5 : 6;
            } else if (i != 4) {
                throw new IllegalArgumentException();
            } else {
                return e != 1 ? 6 : 5;
            }
        }
        return 1;
    }

    public static boolean g(int i) {
        return i == 1 || i == 2;
    }

    private static int i(View view) {
        int height = view.getHeight();
        if (height == 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            return view.getMeasuredHeight();
        }
        return height;
    }

    private static int j(View view) {
        int width = view.getWidth();
        if (width == 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            return view.getMeasuredWidth();
        }
        return width;
    }

    public final void b() {
        PopupWindow popupWindow = this.a.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void c(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void d() {
        akfk akfkVar = this.a;
        akfkVar.a.setClippingEnabled(false);
        akfkVar.a.setAnimationStyle(16973826);
        akfkVar.a.setBackgroundDrawable(new BitmapDrawable(akfkVar.e.getResources(), ""));
        akfkVar.a.setOutsideTouchable(akfkVar.b);
        akfkVar.a.showAtLocation(akfkVar.e, 0, 0, 0);
    }

    public final void e() {
        this.a.b();
        this.a.requestLayout();
    }

    public final boolean f() {
        return this.a.isShown();
    }

    public final void h() {
        this.a.b = true;
    }

    public akfl(View view, int i, View view2, int i2, int i3) {
        this(view, i, view2, i2);
        this.a.a(i3);
    }
}
