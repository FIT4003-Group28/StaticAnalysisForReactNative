package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wt  reason: default package */
/* loaded from: classes7.dex */
public final class wt extends us {
    public wq g;
    public Drawable h;
    public boolean i;
    public int j;
    public boolean k;
    wr l;
    wm m;
    wo n;
    final ws o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private final SparseBooleanArray t;
    private wn u;

    public wt(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.o = new ws(this);
    }

    @Override // defpackage.us, defpackage.vt
    public final void a(Context context, vf vfVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = vfVar;
        Resources resources = context.getResources();
        ub a = ub.a(context);
        if (!this.q) {
            this.p = true;
        }
        this.r = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.j = a.b();
        int i = this.r;
        if (this.p) {
            if (this.g == null) {
                wq wqVar = new wq(this, this.a);
                this.g = wqVar;
                if (this.i) {
                    wqVar.setImageDrawable(this.h);
                    this.h = null;
                    this.i = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.s = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.us
    public final View c(vi viVar, View view, ViewGroup viewGroup) {
        vu vuVar;
        View actionView = viVar.getActionView();
        int i = 0;
        if (actionView == null || viVar.s()) {
            if (!(view instanceof vu)) {
                vuVar = (vu) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            } else {
                vuVar = (vu) view;
            }
            vuVar.f(viVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) vuVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
            if (this.u == null) {
                this.u = new wn(this);
            }
            actionMenuItemView.setPopupCallback(this.u);
            actionView = (View) vuVar;
        }
        if (true == viVar.p) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof ww)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.us, defpackage.vt
    public final void d(vf vfVar, boolean z) {
        n();
        vs vsVar = this.e;
        if (vsVar != null) {
            vsVar.b(vfVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [vf] */
    @Override // defpackage.us, defpackage.vt
    public final boolean e(wb wbVar) {
        boolean z = false;
        if (wbVar.hasVisibleItems()) {
            wb wbVar2 = wbVar;
            while (true) {
                vf vfVar = wbVar2.j;
                if (vfVar == this.c) {
                    break;
                }
                wbVar2 = (wb) vfVar;
            }
            vi viVar = wbVar2.k;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof vu) && ((vu) childAt).a() == viVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view == null) {
                return false;
            }
            vi viVar2 = wbVar.k;
            int size = wbVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = wbVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            wm wmVar = new wm(this, this.b, wbVar, view);
            this.m = wmVar;
            wmVar.a(z);
            if (!this.m.c()) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            vs vsVar = this.e;
            wb wbVar3 = wbVar;
            if (vsVar != null) {
                if (wbVar == null) {
                    wbVar3 = this.c;
                }
                vsVar.a(wbVar3);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.us, defpackage.vt
    public final boolean f() {
        ArrayList<vi> arrayList;
        int i;
        boolean z;
        vf vfVar = this.c;
        View view = null;
        if (vfVar != null) {
            arrayList = vfVar.u();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.j;
        int i3 = this.s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            vi viVar = arrayList.get(i4);
            if (viVar.q()) {
                i5++;
            } else if (viVar.p()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.k && viVar.p) {
                i2 = 0;
            }
            i4++;
        }
        if (this.p && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            vi viVar2 = arrayList.get(i8);
            if (viVar2.q()) {
                View c = c(viVar2, view, viewGroup);
                c.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = viVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                viVar2.r(z);
            } else if (viVar2.p()) {
                int i11 = viVar2.b;
                boolean z3 = sparseBooleanArray.get(i11);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View c2 = c(viVar2, view, viewGroup);
                    c2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z4 = i3 + i9 > 0;
                }
                boolean z5 = z4;
                if (z5 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z3) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        vi viVar3 = arrayList.get(i12);
                        if (viVar3.b == i11) {
                            if (viVar3.o()) {
                                i7++;
                            }
                            viVar3.r(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                viVar2.r(z5);
            } else {
                viVar2.r(false);
                i8++;
                view = null;
                z = true;
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    @Override // defpackage.us, defpackage.vt
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList<vi> arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            vf vfVar = this.c;
            if (vfVar != null) {
                vfVar.v();
                ArrayList<vi> u = this.c.u();
                int size = u.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vi viVar = u.get(i2);
                    if (viVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        vi a = childAt instanceof vu ? ((vu) childAt).a() : null;
                        View c = c(viVar, childAt, viewGroup);
                        if (viVar != a) {
                            c.setPressed(false);
                            c.jumpDrawablesToCurrentState();
                        }
                        if (c != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) c.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(c);
                            }
                            ((ViewGroup) this.f).addView(c, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        vf vfVar2 = this.c;
        if (vfVar2 != null) {
            vfVar2.v();
            ArrayList<vi> arrayList2 = vfVar2.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                nf nfVar = arrayList2.get(i3).o;
            }
        }
        vf vfVar3 = this.c;
        if (vfVar3 != null) {
            arrayList = vfVar3.w();
        }
        if (this.p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !arrayList.get(0).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new wq(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    wq wqVar = this.g;
                    ww j = ActionMenuView.j();
                    j.a = true;
                    ((ActionMenuView) this.f).addView(wqVar, j);
                }
                ((ActionMenuView) this.f).setOverflowReserved(this.p);
            }
        }
        wq wqVar2 = this.g;
        if (wqVar2 != null) {
            ViewParent parent = wqVar2.getParent();
            vv vvVar = this.f;
            if (parent == vvVar) {
                ((ViewGroup) vvVar).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.p);
    }

    public final boolean j() {
        vf vfVar;
        if (!this.p || l() || (vfVar = this.c) == null || this.f == null || this.n != null || vfVar.w().isEmpty()) {
            return false;
        }
        this.n = new wo(this, new wr(this, this.b, this.c, this.g));
        ((View) this.f).post(this.n);
        return true;
    }

    public final boolean l() {
        wr wrVar = this.l;
        return wrVar != null && wrVar.g();
    }

    public final void m(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final void n() {
        k();
        p();
    }

    public final void o() {
        this.p = true;
        this.q = true;
    }

    public final void p() {
        wm wmVar = this.m;
        if (wmVar != null) {
            wmVar.e();
        }
    }

    public final boolean k() {
        vv vvVar;
        wo woVar = this.n;
        if (woVar != null && (vvVar = this.f) != null) {
            ((View) vvVar).removeCallbacks(woVar);
            this.n = null;
            return true;
        }
        wr wrVar = this.l;
        if (wrVar == null) {
            return false;
        }
        wrVar.e();
        return true;
    }
}
