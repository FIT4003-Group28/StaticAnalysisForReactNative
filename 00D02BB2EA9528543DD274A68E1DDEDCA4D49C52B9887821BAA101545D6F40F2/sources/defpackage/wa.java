package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wa  reason: default package */
/* loaded from: classes7.dex */
final class wa extends vp implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, vt {
    final aat a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final vf f;
    private final vc h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private vs o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new vy(this);
    private final View.OnAttachStateChangeListener l = new vz(this);
    private int s = 0;

    public wa(Context context, vf vfVar, View view, int i, boolean z) {
        this.e = context;
        this.f = vfVar;
        this.i = z;
        this.h = new vc(vfVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new aat(context, i);
        vfVar.b(this, context);
    }

    @Override // defpackage.vx
    public final void MY() {
        View view;
        if (m()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.s(this);
        aat aatVar = this.a;
        aatVar.m = this;
        aatVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        aat aatVar2 = this.a;
        aatVar2.l = view2;
        aatVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.x();
        this.a.p(this.g);
        this.a.MY();
        zh zhVar = this.a.e;
        zhVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) zhVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            zhVar.addHeaderView(frameLayout, null, false);
        }
        this.a.MZ(this.h);
        this.a.MY();
    }

    @Override // defpackage.vt
    public final void b(vs vsVar) {
        this.o = vsVar;
    }

    @Override // defpackage.vp
    public final void c(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.vt
    public final void d(vf vfVar, boolean z) {
        if (vfVar != this.f) {
            return;
        }
        k();
        vs vsVar = this.o;
        if (vsVar == null) {
            return;
        }
        vsVar.b(vfVar, z);
    }

    @Override // defpackage.vt
    public final boolean e(wb wbVar) {
        if (wbVar.hasVisibleItems()) {
            vr vrVar = new vr(this.e, wbVar, this.c, this.i, this.k);
            vrVar.h(this.o);
            vrVar.a(vp.w(wbVar));
            vrVar.c = this.m;
            this.m = null;
            this.f.q(false);
            aat aatVar = this.a;
            int i = aatVar.g;
            int i2 = aatVar.i();
            if ((Gravity.getAbsoluteGravity(this.s, od.s(this.n)) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!vrVar.g()) {
                if (vrVar.a != null) {
                    vrVar.d(i, i2, true, true);
                }
            }
            vs vsVar = this.o;
            if (vsVar != null) {
                vsVar.a(wbVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vt
    public final boolean f() {
        return false;
    }

    @Override // defpackage.vt
    public final void i() {
        this.q = false;
        vc vcVar = this.h;
        if (vcVar != null) {
            vcVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.vx
    public final void k() {
        if (m()) {
            this.a.k();
        }
    }

    @Override // defpackage.vp
    public final void l(vf vfVar) {
    }

    @Override // defpackage.vx
    public final boolean m() {
        return !this.p && this.a.m();
    }

    @Override // defpackage.vp
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.vp
    public final void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            k();
            return true;
        }
        return false;
    }

    @Override // defpackage.vp
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.vx
    public final ListView q() {
        return this.a.e;
    }

    @Override // defpackage.vp
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.vp
    public final void s(int i) {
        this.a.f(i);
    }

    @Override // defpackage.vp
    public final void t(boolean z) {
        this.t = z;
    }
}
