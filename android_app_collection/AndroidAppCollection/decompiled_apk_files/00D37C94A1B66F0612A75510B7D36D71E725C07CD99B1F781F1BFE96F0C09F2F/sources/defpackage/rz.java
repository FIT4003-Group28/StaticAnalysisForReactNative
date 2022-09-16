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
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rz  reason: default package */
/* loaded from: classes4.dex */
public final class rz extends sp implements View.OnKeyListener, PopupWindow.OnDismissListener, st {
    public final Handler a;
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
    private ss y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new ru(this);
    private final View.OnAttachStateChangeListener m = new rv(this);
    private final wx n = new rx(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public rz(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return lj.e(this.q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.sf r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.z(sf):void");
    }

    @Override // defpackage.st
    public final void c(sf sfVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (sfVar == ((ry) this.b.get(i)).b) {
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
            ((ry) this.b.get(i2)).b.i(false);
        }
        ry ryVar = (ry) this.b.remove(i);
        ryVar.b.m(this);
        if (this.f) {
            wz wzVar = ryVar.a;
            if (Build.VERSION.SDK_INT >= 23) {
                wzVar.p.setExitTransition(null);
            }
            ryVar.a.p.setAnimationStyle(0);
        }
        ryVar.a.k();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((ry) this.b.get(size2 - 1)).c;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (!z) {
                return;
            }
            ((ry) this.b.get(0)).b.i(false);
            return;
        }
        k();
        ss ssVar = this.y;
        if (ssVar != null) {
            ssVar.a(sfVar, true);
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

    @Override // defpackage.st
    public final void d(ss ssVar) {
        this.y = ssVar;
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st
    public final boolean f(tb tbVar) {
        for (ry ryVar : this.b) {
            if (tbVar == ryVar.b) {
                ryVar.a().requestFocus();
                return true;
            }
        }
        if (tbVar.hasVisibleItems()) {
            j(tbVar);
            ss ssVar = this.y;
            if (ssVar != null) {
                ssVar.b(tbVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.st
    public final void i() {
        for (ry ryVar : this.b) {
            v(ryVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.sp
    public final void j(sf sfVar) {
        sfVar.h(this, this.h);
        if (u()) {
            z(sfVar);
        } else {
            this.l.add(sfVar);
        }
    }

    @Override // defpackage.sx
    public final ListView jA() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((ry) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.sx
    public final void k() {
        int size = this.b.size();
        if (size > 0) {
            ry[] ryVarArr = (ry[]) this.b.toArray(new ry[size]);
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ry ryVar = ryVarArr[size];
                if (ryVar.a.u()) {
                    ryVar.a.k();
                }
            }
        }
    }

    @Override // defpackage.sp
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, lj.e(view));
        }
    }

    @Override // defpackage.sp
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.sp
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, lj.e(this.q));
        }
    }

    @Override // defpackage.sp
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ry ryVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ryVar = null;
                break;
            }
            ryVar = (ry) this.b.get(i);
            if (!ryVar.a.u()) {
                break;
            }
            i++;
        }
        if (ryVar != null) {
            ryVar.b.i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.sp
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.sp
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.sx
    public final void s() {
        if (u()) {
            return;
        }
        for (sf sfVar : this.l) {
            z(sfVar);
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

    @Override // defpackage.sp
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.sx
    public final boolean u() {
        return this.b.size() > 0 && ((ry) this.b.get(0)).a.u();
    }
}
