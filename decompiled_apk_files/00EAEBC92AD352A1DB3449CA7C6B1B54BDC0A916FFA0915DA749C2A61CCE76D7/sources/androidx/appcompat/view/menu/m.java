package androidx.appcompat.view.menu;

import a.g.m.v;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
/* loaded from: classes.dex */
public class m implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1082a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1083b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1084c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1085d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1086e;

    /* renamed from: f  reason: collision with root package name */
    private View f1087f;

    /* renamed from: g  reason: collision with root package name */
    private int f1088g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1089h;
    private n.a i;
    private l j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.d();
        }
    }

    public m(Context context, g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public m(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.f1088g = 8388611;
        this.l = new a();
        this.f1082a = context;
        this.f1083b = gVar;
        this.f1087f = view;
        this.f1084c = z;
        this.f1085d = i;
        this.f1086e = i2;
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        l b2 = b();
        b2.c(z2);
        if (z) {
            if ((a.g.m.d.a(this.f1088g, v.p(this.f1087f)) & 7) == 5) {
                i -= this.f1087f.getWidth();
            }
            b2.b(i);
            b2.c(i2);
            int i3 = (int) ((this.f1082a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b2.c();
    }

    private l g() {
        Display defaultDisplay = ((WindowManager) this.f1082a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        l dVar = Math.min(point.x, point.y) >= this.f1082a.getResources().getDimensionPixelSize(a.a.d.abc_cascading_menus_min_smallest_width) ? new d(this.f1082a, this.f1087f, this.f1085d, this.f1086e, this.f1084c) : new r(this.f1082a, this.f1083b, this.f1087f, this.f1085d, this.f1086e, this.f1084c);
        dVar.a(this.f1083b);
        dVar.a(this.l);
        dVar.a(this.f1087f);
        dVar.a(this.i);
        dVar.b(this.f1089h);
        dVar.a(this.f1088g);
        return dVar;
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public void a(int i) {
        this.f1088g = i;
    }

    public void a(View view) {
        this.f1087f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(n.a aVar) {
        this.i = aVar;
        l lVar = this.j;
        if (lVar != null) {
            lVar.a(aVar);
        }
    }

    public void a(boolean z) {
        this.f1089h = z;
        l lVar = this.j;
        if (lVar != null) {
            lVar.b(z);
        }
    }

    public boolean a(int i, int i2) {
        if (c()) {
            return true;
        }
        if (this.f1087f == null) {
            return false;
        }
        a(i, i2, true, true);
        return true;
    }

    public l b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        l lVar = this.j;
        return lVar != null && lVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (f()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f1087f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
