package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: uz  reason: default package */
/* loaded from: classes7.dex */
final class uz extends vp implements View.OnKeyListener, PopupWindow.OnDismissListener, vt {
    final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private vs y;
    private PopupWindow.OnDismissListener z;
    private final List<vf> l = new ArrayList();
    final List<uy> b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new uu(this);
    private final View.OnAttachStateChangeListener m = new uv(this);
    private final aar n = new ux(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public uz(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return od.s(this.q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.vf r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz.z(vf):void");
    }

    @Override // defpackage.vx
    public final void MY() {
        if (m()) {
            return;
        }
        for (vf vfVar : this.l) {
            z(vfVar);
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.e;
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        this.e = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.c);
        }
        this.d.addOnAttachStateChangeListener(this.m);
    }

    @Override // defpackage.vt
    public final void b(vs vsVar) {
        this.y = vsVar;
    }

    @Override // defpackage.vp
    public final void c(boolean z) {
        this.w = z;
    }

    @Override // defpackage.vt
    public final void d(vf vfVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vfVar == this.b.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            this.b.get(i2).b.q(false);
        }
        uy remove = this.b.remove(i);
        remove.b.c(this);
        if (this.f) {
            aat aatVar = remove.a;
            if (Build.VERSION.SDK_INT >= 23) {
                aatVar.q.setExitTransition(null);
            }
            remove.a.q.setAnimationStyle(0);
        }
        remove.a.k();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = this.b.get(size2 - 1).c;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (!z) {
                return;
            }
            this.b.get(0).b.q(false);
            return;
        }
        k();
        vs vsVar = this.y;
        if (vsVar != null) {
            vsVar.b(vfVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.vt
    public final boolean e(wb wbVar) {
        for (uy uyVar : this.b) {
            if (wbVar == uyVar.b) {
                uyVar.a().requestFocus();
                return true;
            }
        }
        if (wbVar.hasVisibleItems()) {
            l(wbVar);
            vs vsVar = this.y;
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
        for (uy uyVar : this.b) {
            v(uyVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.vx
    public final void k() {
        int size = this.b.size();
        if (size > 0) {
            uy[] uyVarArr = (uy[]) this.b.toArray(new uy[size]);
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                uy uyVar = uyVarArr[size];
                if (uyVar.a.m()) {
                    uyVar.a.k();
                }
            }
        }
    }

    @Override // defpackage.vp
    public final void l(vf vfVar) {
        vfVar.b(this, this.h);
        if (m()) {
            z(vfVar);
        } else {
            this.l.add(vfVar);
        }
    }

    @Override // defpackage.vx
    public final boolean m() {
        return this.b.size() > 0 && this.b.get(0).a.m();
    }

    @Override // defpackage.vp
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, od.s(this.q));
        }
    }

    @Override // defpackage.vp
    public final void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, od.s(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        uy uyVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                uyVar = null;
                break;
            }
            uyVar = this.b.get(i);
            if (!uyVar.a.m()) {
                break;
            }
            i++;
        }
        if (uyVar != null) {
            uyVar.b.q(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.vx
    public final ListView q() {
        if (this.b.isEmpty()) {
            return null;
        }
        List<uy> list = this.b;
        return list.get(list.size() - 1).a();
    }

    @Override // defpackage.vp
    public final void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.vp
    public final void s(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.vp
    public final void t(boolean z) {
        this.x = z;
    }

    @Override // defpackage.vp
    protected final boolean u() {
        return false;
    }
}
