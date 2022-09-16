package androidx.appcompat.widget;

import a.g.m.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    private b A;
    final f B;
    int C;
    d j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final SparseBooleanArray w;
    e x;
    a y;
    RunnableC0044c z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false, a.a.a.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).h()) {
                View view2 = c.this.j;
                a(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).i : view2);
            }
            a(c.this.B);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void d() {
            c cVar = c.this;
            cVar.y = null;
            cVar.C = 0;
            super.d();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = c.this.y;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0044c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f1222b;

        public RunnableC0044c(e eVar) {
            this.f1222b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f1011d != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1011d.a();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).i;
            if (view != null && view.getWindowToken() != null && this.f1222b.f()) {
                c.this.x = this.f1222b;
            }
            c.this.z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends o implements ActionMenuView.a {

        /* loaded from: classes.dex */
        class a extends h0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.h0
            public androidx.appcompat.view.menu.q a() {
                e eVar = c.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean b() {
                c.this.i();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean c() {
                c cVar = c.this;
                if (cVar.z != null) {
                    return false;
                }
                cVar.e();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            z0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.i();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(c.this.B);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void d() {
            if (((androidx.appcompat.view.menu.b) c.this).f1011d != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1011d.close();
            }
            c.this.x = null;
            super.d();
        }
    }

    /* loaded from: classes.dex */
    private class f implements n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof androidx.appcompat.view.menu.s) {
                gVar.m().a(false);
            }
            n.a b2 = c.this.b();
            if (b2 != null) {
                b2.a(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.C = ((androidx.appcompat.view.menu.s) gVar).getItem().getItemId();
            n.a b2 = c.this.b();
            if (b2 == null) {
                return false;
            }
            return b2.a(gVar);
        }
    }

    public c(Context context) {
        super(context, a.a.g.abc_action_menu_layout, a.a.g.abc_action_menu_item_layout);
        this.w = new SparseBooleanArray();
        this.B = new f();
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.b
    public View a(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.f()) {
            actionView = super.a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo47generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void a(Context context, androidx.appcompat.view.menu.g gVar) {
        super.a(context, gVar);
        Resources resources = context.getResources();
        a.a.o.a a2 = a.a.o.a.a(context);
        if (!this.n) {
            this.m = a2.g();
        }
        if (!this.t) {
            this.o = a2.b();
        }
        if (!this.r) {
            this.q = a2.c();
        }
        int i = this.o;
        if (this.m) {
            if (this.j == null) {
                this.j = new d(this.f1009b);
                if (this.l) {
                    this.j.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void a(Configuration configuration) {
        if (!this.r) {
            this.q = a.a.o.a.a(this.f1010c).c();
        }
        androidx.appcompat.view.menu.g gVar = this.f1011d;
        if (gVar != null) {
            gVar.b(true);
        }
    }

    public void a(Drawable drawable) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.l = true;
        this.k = drawable;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        c();
        super.a(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.b
    public void a(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    public void a(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.f1011d);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void a(boolean z) {
        super.a(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f1011d;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> c2 = gVar.c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                a.g.m.b a2 = c2.get(i).a();
                if (a2 != null) {
                    a2.a(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f1011d;
        ArrayList<androidx.appcompat.view.menu.j> j = gVar2 != null ? gVar2.j() : null;
        if (this.m && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.j;
        if (z2) {
            if (dVar == null) {
                this.j = new d(this.f1009b);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.j, actionMenuView.e());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.o oVar = this.i;
            if (parent == oVar) {
                ((ViewGroup) oVar).removeView(this.j);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f1011d;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.q;
        int i7 = cVar.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.i;
        int i8 = i6;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            androidx.appcompat.view.menu.j jVar = arrayList.get(i11);
            if (jVar.k()) {
                i9++;
            } else if (jVar.j()) {
                i10++;
            } else {
                z = true;
            }
            if (cVar.u && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (cVar.m && (z || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.w;
        sparseBooleanArray.clear();
        if (cVar.s) {
            int i13 = cVar.v;
            i3 = i7 / i13;
            i2 = i13 + ((i7 % i13) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i15);
            if (jVar2.k()) {
                View a2 = cVar.a(jVar2, view, viewGroup);
                if (cVar.s) {
                    i3 -= ActionMenuView.a(a2, i2, i3, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.d(true);
                i16 = measuredWidth;
                i4 = i;
            } else if (jVar2.j()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i14 > 0 && (!cVar.s || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a3 = cVar.a(jVar2, null, viewGroup);
                    if (cVar.s) {
                        int a4 = ActionMenuView.a(a3, i2, i3, makeMeasureSpec, 0);
                        i3 -= a4;
                        z4 = a4 == 0 ? false : z4;
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z3 = z4 & (!cVar.s ? i14 + i16 > 0 : i14 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.h()) {
                                i12++;
                            }
                            jVar3.d(false);
                        }
                    }
                }
                if (z3) {
                    i12--;
                }
                jVar2.d(z3);
            } else {
                i4 = i;
                jVar2.d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                cVar = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(int i, androidx.appcompat.view.menu.j jVar) {
        return jVar.h();
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.j) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean a(androidx.appcompat.view.menu.s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.s sVar2 = sVar;
        while (sVar2.t() != this.f1011d) {
            sVar2 = (androidx.appcompat.view.menu.s) sVar2.t();
        }
        View a2 = a(sVar2.getItem());
        if (a2 == null) {
            return false;
        }
        sVar.getItem().getItemId();
        int size = sVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.y = new a(this.f1010c, sVar, a2);
        this.y.a(z);
        this.y.e();
        super.a(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.o b(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.i;
        androidx.appcompat.view.menu.o b2 = super.b(viewGroup);
        if (oVar != b2) {
            ((ActionMenuView) b2).setPresenter(this);
        }
        return b2;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public void c(boolean z) {
        this.m = z;
        this.n = true;
    }

    public boolean c() {
        return e() | f();
    }

    public Drawable d() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (!this.l) {
            return null;
        }
        return this.k;
    }

    public boolean e() {
        androidx.appcompat.view.menu.o oVar;
        RunnableC0044c runnableC0044c = this.z;
        if (runnableC0044c != null && (oVar = this.i) != null) {
            ((View) oVar).removeCallbacks(runnableC0044c);
            this.z = null;
            return true;
        }
        e eVar = this.x;
        if (eVar == null) {
            return false;
        }
        eVar.a();
        return true;
    }

    public boolean f() {
        a aVar = this.y;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.z != null || h();
    }

    public boolean h() {
        e eVar = this.x;
        return eVar != null && eVar.c();
    }

    public boolean i() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.m || h() || (gVar = this.f1011d) == null || this.i == null || this.z != null || gVar.j().isEmpty()) {
            return false;
        }
        this.z = new RunnableC0044c(new e(this.f1010c, this.f1011d, this.j, true));
        ((View) this.i).post(this.z);
        super.a((androidx.appcompat.view.menu.s) null);
        return true;
    }
}
