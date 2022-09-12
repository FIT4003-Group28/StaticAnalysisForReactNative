package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: jdi  reason: default package */
/* loaded from: classes7.dex */
public class jdi {
    private static final dcqe f = dcqe.c("jdi");
    public final PopupWindow a;
    public final jdp b;
    @dzsi
    public final PopupWindow.OnDismissListener c;
    public int d;
    public int e;
    private final Context g;

    public jdi(Context context, jdo jdoVar, @dzsi PopupWindow.OnDismissListener onDismissListener) {
        jdp jdpVar = new jdp(context);
        jdpVar.setCalloutType(jdoVar);
        PopupWindow popupWindow = new PopupWindow(context);
        this.d = -2;
        this.e = -2;
        this.g = context;
        this.b = jdpVar;
        this.a = popupWindow;
        this.c = onDismissListener;
        popupWindow.setContentView(jdpVar);
        popupWindow.setBackgroundDrawable(new cqlu());
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(16973826);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(this) { // from class: jdh
            private final jdi a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                PopupWindow.OnDismissListener onDismissListener2 = this.a.c;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss();
                }
            }
        });
    }

    private final int g(int i, int i2) {
        if (this.b.b == jdo.TOP) {
            i2 = j(2.0f);
        } else {
            i += j(6.0f);
        }
        return i - i2;
    }

    private final int h(int i) {
        int j = j(8.0f);
        int i2 = j + j;
        int i3 = i - i2;
        int i4 = this.d;
        return i4 == -1 ? i3 : i4 == -2 ? Math.min(i3, j(408.0f)) : Math.min(i3, i4 - i2);
    }

    private final int i(int i) {
        int min = Math.min(i, j(220.0f));
        int i2 = this.e;
        if (i2 == -1) {
            return -1;
        }
        if (i2 != -2) {
            return Math.min(min, i2);
        }
        if (this.b.b == jdo.BOTTOM) {
            bvoo.h("Positioning doesn't work correctly for this case", new Object[0]);
        }
        return -2;
    }

    private final int j(float f2) {
        return jmj.b(this.g, f2);
    }

    private final int k(int i, int i2, int i3) {
        Rect rect = new Rect(j(8.0f), 0, i3 - j(8.0f), 0);
        return akn.b(i - (i2 / 2), rect.left, rect.right - i2);
    }

    public final void a(int i) {
        this.b.setBackgroundColor(i);
    }

    public final boolean b() {
        return this.a.isShowing();
    }

    public final void c(View view) {
        this.b.removeAllViews();
        this.b.addView(view, -1, -2);
    }

    public final void d(View view, int i, int i2) {
        int i3 = this.g.getResources().getDisplayMetrics().widthPixels;
        int i4 = this.g.getResources().getDisplayMetrics().heightPixels;
        int h = h(i3);
        int i5 = i(i4);
        od.s(view);
        int k = k(i, h, i3);
        int g = g(i2, i5);
        this.b.setAbsoluteCalloutPosition(i - k);
        this.a.setWidth(h);
        this.a.setHeight(i5);
        this.a.showAtLocation(view, 0, k, g);
        this.a.setFocusable(true);
    }

    public final void e(int i, int i2) {
        int i3 = this.g.getResources().getDisplayMetrics().widthPixels;
        int i4 = this.g.getResources().getDisplayMetrics().heightPixels;
        int h = h(i3);
        int i5 = i(i4);
        od.s(this.b);
        int k = k(i, h, i3);
        int g = g(i2, i5);
        this.b.setAbsoluteCalloutPosition(i - k);
        this.a.update(k, g, h, i5);
    }

    public final void f() {
        this.a.dismiss();
    }
}
