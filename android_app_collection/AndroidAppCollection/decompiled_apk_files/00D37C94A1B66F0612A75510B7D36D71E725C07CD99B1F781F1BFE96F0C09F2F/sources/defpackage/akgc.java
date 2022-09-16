package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: akgc  reason: default package */
/* loaded from: classes.dex */
public final class akgc {
    public final akgb a;
    public final Rect b;
    private final View c;
    private final int d;
    private final int e;
    private final int f;

    public akgc(View view, View view2, int i, int i2) {
        this(view, view2, i, i2, 0);
    }

    public static int a(int i, View view) {
        int e = lj.e(view);
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException();
                    }
                    return e != 1 ? 4 : 3;
                } else if (e != 1) {
                    return 3;
                }
            }
            return i2;
        }
        return 1;
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

    private static boolean k(int i) {
        return i == 1 || i == 2;
    }

    public final void b(int i) {
        this.a.a(i);
    }

    public final void c(Rect rect, int i, int i2) {
        this.a.b(this.c, rect, i, i2, this.f);
    }

    public final void d(boolean z) {
        this.a.e = z;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void f(akfz akfzVar) {
        this.a.d = akfzVar;
    }

    public final void g(Rect rect) {
        int i;
        int i2 = this.d;
        int i3 = this.e;
        c(rect, i2, i3);
        boolean z = true;
        if (k(i2)) {
            if (!h(i2, rect)) {
                i = i2 == 1 ? 2 : 1;
            }
            i = i2;
        } else {
            View view = this.c;
            if (!k(i2)) {
                int a = a(i2, view);
                int j = j(this.a);
                int width = this.b.width();
                if (a != 3 ? j >= (width - rect.width()) - rect.left : j >= rect.left - this.b.left) {
                    i = i2 == 3 ? 4 : 3;
                }
            }
            i = i2;
        }
        if (i != this.d) {
            this.a.b(this.c, rect, i, i3, this.f);
            j(this.a);
        }
        final akgb akgbVar = this.a;
        akgbVar.c.setClippingEnabled(false);
        akgbVar.c.setAnimationStyle(16973826);
        if (akgbVar.f || akgbVar.j == 1) {
            if (akgbVar.j != 1) {
                z = false;
            }
            akgbVar.b = new akfn(akgbVar.a, akgbVar, akgbVar.h, akgbVar.e);
            if (akgbVar.h.getRootView() instanceof ViewGroup) {
                ((ViewGroup) akgbVar.h.getRootView()).addView(akgbVar.b);
            }
            akgbVar.c.setOutsideTouchable(false);
            akgbVar.b.e = z;
        } else {
            akgbVar.c.setBackgroundDrawable(new BitmapDrawable(akgbVar.a.getResources(), ""));
            akgbVar.c.setOutsideTouchable(akgbVar.e);
            akgbVar.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: akga
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    akgb.this.a(0);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 29) {
            akgbVar.e();
        }
        akgbVar.c.showAtLocation(akgbVar.h, 0, akgbVar.l, akgbVar.m);
    }

    public final boolean h(int i, Rect rect) {
        if (!k(i)) {
            return true;
        }
        akgb akgbVar = this.a;
        int height = akgbVar.getHeight();
        if (height == 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            akgbVar.measure(makeMeasureSpec, makeMeasureSpec);
            height = akgbVar.getMeasuredHeight();
        }
        return i == 1 ? height < rect.top - this.b.top : height < (this.b.height() - rect.height()) - rect.top;
    }

    public final boolean i() {
        return this.a.isShown();
    }

    public akgc(View view, View view2, int i, int i2, int i3) {
        this(view, view2, i, i2, i3, 0);
    }

    public akgc(View view, View view2, int i, int i2, int i3, int i4) {
        view.getClass();
        view2.getClass();
        this.c = view2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        akgb akgbVar = new akgb(view.getContext(), i4);
        this.a = akgbVar;
        akgbVar.g = view;
        akgbVar.c = new PopupWindow(akgbVar);
        akgbVar.addView(view);
        Rect rect = new Rect();
        this.b = rect;
        rect.right = akgbVar.getResources().getDisplayMetrics().widthPixels;
        rect.bottom = akgbVar.getResources().getDisplayMetrics().heightPixels;
    }
}
