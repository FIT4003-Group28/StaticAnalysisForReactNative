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
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: tq  reason: default package */
/* loaded from: classes4.dex */
public final class tq extends rs {
    public tn g;
    public Drawable h;
    public boolean i;
    public int j;
    to k;
    public tk l;
    tl m;
    final tp n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private rr u;

    public tq(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.n = new tp(this);
    }

    @Override // defpackage.rs
    public final View a(si siVar, View view, ViewGroup viewGroup) {
        su suVar;
        View actionView = siVar.getActionView();
        int i = 0;
        if (actionView == null || siVar.m()) {
            if (!(view instanceof su)) {
                suVar = (su) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            } else {
                suVar = (su) view;
            }
            suVar.f(siVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) suVar;
            actionMenuItemView.c = (ActionMenuView) this.f;
            if (this.u == null) {
                this.u = new rr(this);
            }
            actionMenuItemView.d = this.u;
            actionView = (View) suVar;
        }
        if (true == siVar.p) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof tt)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.rs, defpackage.st
    public final void b(Context context, sf sfVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = sfVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.j = ld.d(context);
        int i = this.q;
        if (this.o) {
            if (this.g == null) {
                tn tnVar = new tn(this, this.a);
                this.g = tnVar;
                if (this.i) {
                    tnVar.setImageDrawable(this.h);
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
        this.r = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.rs, defpackage.st
    public final void c(sf sfVar, boolean z) {
        n();
        ss ssVar = this.e;
        if (ssVar != null) {
            ssVar.a(sfVar, z);
        }
    }

    @Override // defpackage.rs, defpackage.st
    public final boolean e() {
        ArrayList arrayList;
        int i;
        boolean z;
        sf sfVar = this.c;
        View view = null;
        if (sfVar != null) {
            arrayList = sfVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.j;
        int i3 = this.r;
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
            si siVar = (si) arrayList.get(i4);
            if (siVar.r()) {
                i5++;
            } else if (siVar.q()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.s && siVar.p) {
                i2 = 0;
            }
            i4++;
        }
        if (this.o && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            si siVar2 = (si) arrayList.get(i8);
            if (siVar2.r()) {
                View a = a(siVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = siVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                siVar2.k(z);
            } else if (siVar2.q()) {
                int i11 = siVar2.b;
                boolean z3 = sparseBooleanArray.get(i11);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View a2 = a(siVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
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
                        si siVar3 = (si) arrayList.get(i12);
                        if (siVar3.b == i11) {
                            if (siVar3.o()) {
                                i7++;
                            }
                            siVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                siVar2.k(z5);
            } else {
                siVar2.k(false);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [sf] */
    @Override // defpackage.rs, defpackage.st
    public final boolean f(tb tbVar) {
        boolean z = false;
        if (tbVar.hasVisibleItems()) {
            tb tbVar2 = tbVar;
            while (true) {
                sf sfVar = tbVar2.j;
                if (sfVar == this.c) {
                    break;
                }
                tbVar2 = (tb) sfVar;
            }
            si siVar = tbVar2.k;
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
                    if ((childAt instanceof su) && ((su) childAt).a() == siVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view == null) {
                return false;
            }
            si siVar2 = tbVar.k;
            int size = tbVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = tbVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            tk tkVar = new tk(this, this.b, tbVar, view);
            this.l = tkVar;
            tkVar.d(z);
            this.l.f();
            ss ssVar = this.e;
            tb tbVar3 = tbVar;
            if (ssVar != null) {
                if (tbVar == null) {
                    tbVar3 = this.c;
                }
                ssVar.b(tbVar3);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.rs, defpackage.st
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            sf sfVar = this.c;
            if (sfVar != null) {
                sfVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    si siVar = (si) f.get(i2);
                    if (siVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        si a = childAt instanceof su ? ((su) childAt).a() : null;
                        View a2 = a(siVar, childAt, viewGroup);
                        if (siVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f).addView(a2, i);
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
        sf sfVar2 = this.c;
        if (sfVar2 != null) {
            sfVar2.k();
            ArrayList arrayList2 = sfVar2.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                jp jpVar = ((si) arrayList2.get(i3)).o;
            }
        }
        sf sfVar3 = this.c;
        if (sfVar3 != null) {
            arrayList = sfVar3.e();
        }
        if (this.o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((si) arrayList.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new tn(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    tn tnVar = this.g;
                    tt j = ActionMenuView.j();
                    j.a = true;
                    ((ActionMenuView) this.f).addView(tnVar, j);
                }
                ((ActionMenuView) this.f).b = this.o;
            }
        }
        tn tnVar2 = this.g;
        if (tnVar2 != null) {
            ViewParent parent = tnVar2.getParent();
            sv svVar = this.f;
            if (parent == svVar) {
                ((ViewGroup) svVar).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).b = this.o;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean l() {
        to toVar = this.k;
        return toVar != null && toVar.h();
    }

    public final boolean m() {
        sf sfVar;
        if (!this.o || l() || (sfVar = this.c) == null || this.f == null || this.m != null || sfVar.e().isEmpty()) {
            return false;
        }
        this.m = new tl(this, new to(this, this.b, this.c, this.g));
        ((View) this.f).post(this.m);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.s = true;
    }

    public final void p() {
        this.o = true;
        this.p = true;
    }

    public final void q() {
        tk tkVar = this.l;
        if (tkVar != null) {
            tkVar.b();
        }
    }

    public final boolean k() {
        sv svVar;
        tl tlVar = this.m;
        if (tlVar != null && (svVar = this.f) != null) {
            ((View) svVar).removeCallbacks(tlVar);
            this.m = null;
            return true;
        }
        to toVar = this.k;
        if (toVar == null) {
            return false;
        }
        toVar.b();
        return true;
    }
}
