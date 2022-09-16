package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vr  reason: default package */
/* loaded from: classes7.dex */
public class vr {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final vf e;
    private final boolean f;
    private final int g;
    private boolean h;
    private vs i;
    private vp j;
    private final PopupWindow.OnDismissListener k;

    public vr(Context context, vf vfVar, View view, boolean z) {
        this(context, vfVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final void a(boolean z) {
        this.h = z;
        vp vpVar = this.j;
        if (vpVar != null) {
            vpVar.c(z);
        }
    }

    public final vp b() {
        vp waVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                waVar = new uz(this.d, this.a, this.g, this.f);
            } else {
                waVar = new wa(this.d, this.e, this.a, this.g, this.f);
            }
            waVar.l(this.e);
            waVar.p(this.k);
            waVar.o(this.a);
            waVar.b(this.i);
            waVar.c(this.h);
            waVar.n(this.b);
            this.j = waVar;
        }
        return this.j;
    }

    public final boolean c() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        d(0, 0, false, false);
        return true;
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        vp b = b();
        b.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, od.s(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            b.r(i);
            b.s(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        b.MY();
    }

    public final void e() {
        if (g()) {
            this.j.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean g() {
        vp vpVar = this.j;
        return vpVar != null && vpVar.m();
    }

    public final void h(vs vsVar) {
        this.i = vsVar;
        vp vpVar = this.j;
        if (vpVar != null) {
            vpVar.b(vsVar);
        }
    }

    public vr(Context context, vf vfVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new vq(this);
        this.d = context;
        this.e = vfVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
