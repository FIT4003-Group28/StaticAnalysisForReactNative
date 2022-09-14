package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cshd  reason: default package */
/* loaded from: classes5.dex */
public final class cshd implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, csht {
    public static final /* synthetic */ int e = 0;
    public final View a;
    public final cshu<csgt> b;
    private final csgt f;
    private csgt g;
    private ViewGroup k;
    private boolean h = false;
    public boolean c = false;
    private boolean i = false;
    private ddhj j = ddhj.VISIBILITY_HIDDEN;
    public csgt d = null;

    public cshd(View view, csgt csgtVar) {
        this.a = view;
        this.f = csgtVar;
        this.b = csgtVar.b;
    }

    @dzsi
    public static csgt a(View view) {
        return (csgt) view.getTag(R.id.ve_tag);
    }

    public static boolean b(View view) {
        return view.getId() == 16908290;
    }

    private final void k() {
        dbsk.l(this.h);
        if (this.i) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(16908290);
            dbsk.s(viewGroup);
            this.k = viewGroup;
        } else {
            this.k = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.k;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        } else {
            this.a.addOnLayoutChangeListener(this);
        }
    }

    private final void l() {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.k = null;
            return;
        }
        this.a.removeOnLayoutChangeListener(this);
    }

    private static void m(View view, cshs<csgt> cshsVar) {
        csgt a = a(view);
        if (a != null) {
            csht<csgt> cshtVar = a.c;
            if (cshtVar instanceof cshd) {
                cshd cshdVar = (cshd) cshtVar;
                csgt csgtVar = cshdVar.g;
                if (cshdVar.i) {
                    return;
                }
            }
            cshsVar.a(a);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m(viewGroup.getChildAt(i), cshsVar);
            }
        }
    }

    @Override // defpackage.csht
    public final boolean c() {
        return b(this.a) || this.i;
    }

    @Override // defpackage.csht
    public final void d(cshs<csgt> cshsVar) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m(viewGroup.getChildAt(i), cshsVar);
            }
        }
    }

    @Override // defpackage.csht
    public final void e() {
        this.a.setTag(R.id.ve_tag, this.f);
        if (this.b.a()) {
            this.a.addOnAttachStateChangeListener(this);
            if (!od.ak(this.a)) {
                return;
            }
            onViewAttachedToWindow(this.a);
        }
    }

    @Override // defpackage.csht
    public final void f() {
        if (!this.h || this.c) {
            return;
        }
        this.c = true;
        this.j = h();
        this.b.b(this.f);
    }

    @Override // defpackage.csht
    public final void g() {
        if (this.c) {
            this.c = false;
            this.b.c(this.f);
            this.d = null;
        }
    }

    public final ddhj h() {
        if (this.i) {
            if (this.a.isShown()) {
                return ddhj.VISIBILITY_VISIBLE;
            }
        } else if (this.a.getVisibility() == 0) {
            return ddhj.VISIBILITY_VISIBLE;
        }
        return ddhj.VISIBILITY_HIDDEN;
    }

    @Override // defpackage.csht
    @dzsi
    public final /* bridge */ /* synthetic */ Object i() {
        if (c() || this.i) {
            return null;
        }
        csgt csgtVar = this.d;
        if (csgtVar != null) {
            return csgtVar;
        }
        for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
            View view = (View) parent;
            csgt a = a(view);
            if (a != null) {
                if (!this.h) {
                    return a;
                }
                this.d = a;
                return a;
            } else if (b(view)) {
                return null;
            }
        }
        return null;
    }

    public final void j(boolean z) {
        if (this.i == z) {
            return;
        }
        boolean z2 = true;
        dbsk.l(true);
        if (z && b(this.a)) {
            z2 = false;
        }
        dbsk.a(z2);
        if (this.h) {
            l();
        }
        this.i = z;
        if (!this.h) {
            return;
        }
        k();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == this.a) {
            dbsk.l(this.k == null);
            ViewGroup viewGroup = (ViewGroup) this.a.getParent();
            this.k = viewGroup;
            viewGroup.addOnLayoutChangeListener(this);
            this.a.removeOnLayoutChangeListener(this);
        }
        ddhj h = h();
        if (h != this.j) {
            this.j = h;
            cshu<csgt> cshuVar = this.b;
            csgt csgtVar = this.f;
            if (cshuVar.a.isEmpty()) {
                return;
            }
            for (cshr<csgt> cshrVar : cshuVar.a) {
                cshrVar.e(csgtVar, h);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dbsk.l(!this.h);
        this.h = true;
        k();
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dbsk.l(this.h);
        this.h = false;
        l();
        g();
    }
}
