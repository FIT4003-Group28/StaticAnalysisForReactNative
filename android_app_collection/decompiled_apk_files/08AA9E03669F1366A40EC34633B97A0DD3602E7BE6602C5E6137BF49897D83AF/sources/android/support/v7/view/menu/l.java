package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.view.menu.m;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f785a;

    /* renamed from: b  reason: collision with root package name */
    private final g f786b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f787c;

    /* renamed from: d  reason: collision with root package name */
    private final int f788d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public l(Context context, g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new PopupWindow.OnDismissListener() { // from class: android.support.v7.view.menu.l.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                l.this.e();
            }
        };
        this.f785a = context;
        this.f786b = gVar;
        this.f = view;
        this.f787c = z;
        this.f788d = i;
        this.e = i2;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(boolean z) {
        this.h = z;
        if (this.j != null) {
            this.j.a(z);
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a() {
        if (!c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public k b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public boolean a(int i, int i2) {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i, i2, true, true);
        return true;
    }

    private k g() {
        k rVar;
        Display defaultDisplay = ((WindowManager) this.f785a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f785a.getResources().getDimensionPixelSize(a.d.abc_cascading_menus_min_smallest_width)) {
            rVar = new e(this.f785a, this.f, this.f788d, this.e, this.f787c);
        } else {
            rVar = new r(this.f785a, this.f786b, this.f, this.f788d, this.e, this.f787c);
        }
        rVar.a(this.f786b);
        rVar.a(this.l);
        rVar.a(this.f);
        rVar.a(this.i);
        rVar.a(this.h);
        rVar.a(this.g);
        return rVar;
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        k b2 = b();
        b2.c(z2);
        if (z) {
            if ((android.support.v4.j.e.a(this.g, android.support.v4.j.s.c(this.f)) & 7) == 5) {
                i += this.f.getWidth();
            }
            b2.b(i);
            b2.c(i2);
            int i3 = (int) ((this.f785a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b2.a();
    }

    public void d() {
        if (f()) {
            this.j.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.j = null;
        if (this.k != null) {
            this.k.onDismiss();
        }
    }

    public boolean f() {
        return this.j != null && this.j.d();
    }

    public void a(m.a aVar) {
        this.i = aVar;
        if (this.j != null) {
            this.j.a(aVar);
        }
    }
}
