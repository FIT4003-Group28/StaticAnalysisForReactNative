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
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ta  reason: default package */
/* loaded from: classes4.dex */
final class ta extends sp implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, st {
    final wz a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final sf f;
    private final sc h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private ss o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new sy(this);
    private final View.OnAttachStateChangeListener l = new sz(this);
    private int s = 0;

    public ta(Context context, sf sfVar, View view, int i, boolean z) {
        this.e = context;
        this.f = sfVar;
        this.i = z;
        this.h = new sc(sfVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new wz(context, i);
        sfVar.h(this, context);
    }

    @Override // defpackage.st
    public final void c(sf sfVar, boolean z) {
        if (sfVar != this.f) {
            return;
        }
        k();
        ss ssVar = this.o;
        if (ssVar == null) {
            return;
        }
        ssVar.a(sfVar, z);
    }

    @Override // defpackage.st
    public final void d(ss ssVar) {
        this.o = ssVar;
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st
    public final boolean f(tb tbVar) {
        if (tbVar.hasVisibleItems()) {
            sr srVar = new sr(this.e, tbVar, this.c, this.i, this.k);
            srVar.e(this.o);
            srVar.d(sp.w(tbVar));
            srVar.c = this.m;
            this.m = null;
            this.f.i(false);
            wz wzVar = this.a;
            int i = wzVar.g;
            int b = wzVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, lj.e(this.n)) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!srVar.h()) {
                if (srVar.a != null) {
                    srVar.g(i, b, true, true);
                }
            }
            ss ssVar = this.o;
            if (ssVar != null) {
                ssVar.b(tbVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.st
    public final void i() {
        this.q = false;
        sc scVar = this.h;
        if (scVar != null) {
            scVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.sp
    public final void j(sf sfVar) {
    }

    @Override // defpackage.sx
    public final ListView jA() {
        return this.a.e;
    }

    @Override // defpackage.sx
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.sp
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.sp
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.sp
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.sp
    public final void o(int i) {
        this.a.g = i;
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

    @Override // defpackage.sp
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.sp
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.sp
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.sx
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.v(this);
        wz wzVar = this.a;
        wzVar.m = this;
        wzVar.z();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        wz wzVar2 = this.a;
        wzVar2.l = view2;
        wzVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.y();
        this.a.t(this.g);
        this.a.s();
        vv vvVar = this.a.e;
        vvVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) vvVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            vvVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.s();
    }

    @Override // defpackage.sx
    public final boolean u() {
        return !this.p && this.a.u();
    }
}
