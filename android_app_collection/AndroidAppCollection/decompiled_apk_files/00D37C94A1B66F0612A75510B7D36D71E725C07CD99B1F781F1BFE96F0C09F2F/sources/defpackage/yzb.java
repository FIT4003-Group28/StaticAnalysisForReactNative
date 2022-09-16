package defpackage;

import android.app.ActionBar;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: yzb  reason: default package */
/* loaded from: classes4.dex */
public class yzb implements yzm {
    public final Set d;
    protected final Window e;
    protected final yzn f;
    public int g;
    public boolean h;
    protected yza i;
    final yyz j;
    public yzs k;
    private yza n;
    private View o;
    private int p;
    private final azpb l = azpa.as(zaw.a(yzr.a(new Rect(), yzg.f(), new Rect(), new Rect()))).ax();
    private final kj m = new kj() { // from class: yyy
        @Override // defpackage.kj
        public final mb a(View view, mb mbVar) {
            Rect rect;
            Rect rect2;
            yzb yzbVar = yzb.this;
            yzbVar.a.set(mbVar.d(), mbVar.f(), mbVar.e(), mbVar.c());
            Rect rect3 = yzbVar.b;
            if (Build.VERSION.SDK_INT >= 29) {
                rect = yzb.a(view.getRootWindowInsets().getMandatorySystemGestureInsets());
            } else {
                rect = new Rect();
            }
            rect3.set(rect);
            Rect rect4 = yzbVar.c;
            if (Build.VERSION.SDK_INT >= 29) {
                rect2 = yzb.a(view.getRootWindowInsets().getStableInsets());
            } else {
                rect2 = new Rect();
            }
            rect4.set(rect2);
            yzbVar.f();
            return (yzbVar.g & 1) == 1 ? mbVar.n() : mbVar;
        }
    };
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();

    public yzb(Window window) {
        yyz yyzVar = new yyz(this);
        this.j = yyzVar;
        this.n = yza.DEFAULT;
        window.getClass();
        this.e = window;
        this.f = new yzn(window, yyzVar);
        this.d = Collections.newSetFromMap(new WeakHashMap());
        p(this.n);
    }

    public static Rect a(Insets insets) {
        return new Rect(insets.left, insets.top, insets.right, insets.bottom);
    }

    private final void p(yza yzaVar) {
        this.i = yzaVar;
        yzn yznVar = this.f;
        int i = yzaVar.h;
        if (yznVar.c != i) {
            yznVar.c = i;
            yznVar.a();
        }
        yzn yznVar2 = this.f;
        boolean z = yzaVar.i;
        if (yznVar2.e != z) {
            yznVar2.e = z;
            yznVar2.a();
        }
        this.f.b(yzaVar.j);
        q();
    }

    private final void q() {
        yzn yznVar = this.f;
        boolean z = false;
        if (m() && this.h) {
            z = true;
        }
        if (yznVar.g != z) {
            yznVar.g = z;
            yznVar.a();
        }
    }

    @Override // defpackage.yzy
    public final void b(boolean z) {
        if (!z) {
            return;
        }
        p(this.i);
    }

    public final yzg c() {
        if (Build.VERSION.SDK_INT >= 28) {
            View view = this.o;
            if (view == null || view.getRootWindowInsets() == null || this.o.getRootWindowInsets().getDisplayCutout() == null) {
                return yzg.f();
            }
            return yzg.e(new Rect(this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetLeft(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetTop(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetRight(), this.o.getRootWindowInsets().getDisplayCutout().getSafeInsetBottom()), this.o.getRootWindowInsets().getDisplayCutout().getBoundingRects());
        }
        return yzg.f();
    }

    @Override // defpackage.yzm
    public final aynx d() {
        return this.l;
    }

    @Override // defpackage.yzm
    public final void e(yzx yzxVar) {
        yzxVar.getClass();
        this.d.add(yzxVar);
    }

    public final void f() {
        Rect rect = new Rect(this.a);
        yzs yzsVar = this.k;
        if (yzsVar != null) {
            Rect rect2 = new Rect(this.a);
            yzt yztVar = yzsVar.a;
            if (yztVar.f.f) {
                boolean hasFeature = yztVar.e.hasFeature(9);
                ActionBar actionBar = yztVar.l;
                boolean z = false;
                if (actionBar != null && !actionBar.isShowing()) {
                    z = true;
                }
                if (hasFeature && z) {
                    rect2.top -= yztVar.m;
                }
            }
            Rect rect3 = new Rect();
            if (yztVar.m()) {
                rect3.set(rect2);
            }
            rect.set(rect3);
        }
        this.l.c(zaw.a(yzr.a(rect, c(), this.b, this.c)));
    }

    @Override // defpackage.yzm
    public final void g() {
        this.p = 0;
        p(this.n);
    }

    @Override // defpackage.yzm
    public final void h(View view, int i) {
        yza yzaVar;
        View view2 = this.o;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            lj.X(view2, null);
        }
        view.getClass();
        this.o = view;
        this.g = i;
        yzn yznVar = this.f;
        boolean z = (i & 4) == 4;
        View view3 = yznVar.a;
        if (view3 != view) {
            if (view3 != null) {
                view3.setOnSystemUiVisibilityChangeListener(null);
            }
            view.getClass();
            yznVar.a = view;
            yznVar.d = z;
            yznVar.a.setOnSystemUiVisibilityChangeListener(yznVar);
            yznVar.b = yznVar.a.getSystemUiVisibility();
        }
        lj.X(this.o, this.m);
        if ((i & 2) == 2) {
            yzaVar = yza.LAYOUT_FULLSCREEN;
        } else {
            yzaVar = yza.DEFAULT;
        }
        this.n = yzaVar;
        this.p = 0;
        p(yzaVar);
    }

    @Override // defpackage.yzm
    public final void i() {
        yzn yznVar = this.f;
        yznVar.removeMessages(0);
        yznVar.h = true;
    }

    @Override // defpackage.yzm
    public final void j(boolean z) {
        this.h = z;
        q();
    }

    @Override // defpackage.yzm
    public final void k(int i) {
        if (this.i == yza.IMMERSIVE || this.i == yza.VR) {
            return;
        }
        this.f.b(i);
    }

    @Override // defpackage.yzm
    public final boolean l() {
        return this.i.h == 2;
    }

    @Override // defpackage.yzm
    public final boolean m() {
        yza yzaVar = this.i;
        return yzaVar.h == 2 && !yzaVar.i && this.p != 4;
    }

    @Override // defpackage.yzm
    public final int n() {
        return this.p;
    }

    @Override // defpackage.yzm
    public final void o(int i) {
        yza yzaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            yzaVar = yza.IMMERSIVE;
        } else if (i2 == 1) {
            yzaVar = yza.IMMERSIVE_FLEX;
        } else if (i2 == 2) {
            yzaVar = yza.VR;
        } else if (i2 != 3) {
            yzaVar = yza.IMMERSIVE_SHOW_UI;
        } else {
            yzaVar = yza.NON_STICKY_FULLSCREEN;
        }
        this.p = i;
        p(yzaVar);
    }
}
