package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: sr  reason: default package */
/* loaded from: classes4.dex */
public class sr {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final sf e;
    private final boolean f;
    private final int g;
    private boolean h;
    private ss i;
    private sp j;
    private final PopupWindow.OnDismissListener k;

    public sr(Context context, sf sfVar, View view, boolean z) {
        this(context, sfVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final sp a() {
        sp taVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                taVar = new rz(this.d, this.a, this.g, this.f);
            } else {
                taVar = new ta(this.d, this.e, this.a, this.g, this.f);
            }
            taVar.j(this.e);
            taVar.p(this.k);
            taVar.l(this.a);
            taVar.d(this.i);
            taVar.m(this.h);
            taVar.n(this.b);
            this.j = taVar;
        }
        return this.j;
    }

    public final void b() {
        if (h()) {
            this.j.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        sp spVar = this.j;
        if (spVar != null) {
            spVar.m(z);
        }
    }

    public final void e(ss ssVar) {
        this.i = ssVar;
        sp spVar = this.j;
        if (spVar != null) {
            spVar.d(ssVar);
        }
    }

    public final void f() {
        if (i()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        sp a = a();
        a.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, lj.e(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.o(i);
            a.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.s();
    }

    public final boolean h() {
        sp spVar = this.j;
        return spVar != null && spVar.u();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }

    public sr(Context context, sf sfVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new sq(this);
        this.d = context;
        this.e = sfVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
