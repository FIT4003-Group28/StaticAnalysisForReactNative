package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.j.c;
import android.support.v7.a.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.n;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
class d extends android.support.v7.view.menu.b implements c.a {
    private b A;
    C0023d g;
    e h;
    a i;
    c j;
    final f k;
    int l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y;
    private View z;

    public d(Context context) {
        super(context, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout);
        this.y = new SparseBooleanArray();
        this.k = new f();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.m
    public void a(Context context, android.support.v7.view.menu.g gVar) {
        super.a(context, gVar);
        Resources resources = context.getResources();
        android.support.v7.view.a a2 = android.support.v7.view.a.a(context);
        if (!this.p) {
            this.o = a2.b();
        }
        if (!this.v) {
            this.q = a2.c();
        }
        if (!this.t) {
            this.s = a2.a();
        }
        int i = this.q;
        if (this.o) {
            if (this.g == null) {
                this.g = new C0023d(this.f741a);
                if (this.n) {
                    this.g.setImageDrawable(this.m);
                    this.m = null;
                    this.n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.r = i;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.z = null;
    }

    public void a(Configuration configuration) {
        if (!this.t) {
            this.s = android.support.v7.view.a.a(this.f742b).a();
        }
        if (this.f743c != null) {
            this.f743c.b(true);
        }
    }

    public void c(boolean z) {
        this.o = z;
        this.p = true;
    }

    public void d(boolean z) {
        this.w = z;
    }

    public void a(Drawable drawable) {
        if (this.g != null) {
            this.g.setImageDrawable(drawable);
            return;
        }
        this.n = true;
        this.m = drawable;
    }

    public Drawable c() {
        if (this.g != null) {
            return this.g.getDrawable();
        }
        if (!this.n) {
            return null;
        }
        return this.m;
    }

    @Override // android.support.v7.view.menu.b
    public View a(android.support.v7.view.menu.h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.n()) {
            actionView = super.a(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.b
    public void a(android.support.v7.view.menu.h hVar, n.a aVar) {
        aVar.a(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int i, android.support.v7.view.menu.h hVar) {
        return hVar.j();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.m
    public void b(boolean z) {
        super.b(z);
        ((View) this.f).requestLayout();
        boolean z2 = false;
        if (this.f743c != null) {
            ArrayList<android.support.v7.view.menu.h> j = this.f743c.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.j.c a2 = j.get(i).a();
                if (a2 != null) {
                    a2.a(this);
                }
            }
        }
        ArrayList<android.support.v7.view.menu.h> k = this.f743c != null ? this.f743c.k() : null;
        if (this.o && k != null) {
            int size2 = k.size();
            if (size2 == 1) {
                z2 = !k.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.g == null) {
                this.g = new C0023d(this.f741a);
            }
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.g, actionMenuView.b());
            }
        } else if (this.g != null && this.g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.g);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.o);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.g) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.m
    public boolean a(android.support.v7.view.menu.s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        android.support.v7.view.menu.s sVar2 = sVar;
        while (sVar2.p() != this.f743c) {
            sVar2 = (android.support.v7.view.menu.s) sVar2.p();
        }
        View a2 = a(sVar2.getItem());
        if (a2 == null) {
            return false;
        }
        this.l = sVar.getItem().getItemId();
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
        this.i = new a(this.f742b, sVar, a2);
        this.i.a(z);
        this.i.a();
        super.a(sVar);
        return true;
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean d() {
        if (!this.o || h() || this.f743c == null || this.f == null || this.j != null || this.f743c.k().isEmpty()) {
            return false;
        }
        this.j = new c(new e(this.f742b, this.f743c, this.g, true));
        ((View) this.f).post(this.j);
        super.a((android.support.v7.view.menu.s) null);
        return true;
    }

    public boolean e() {
        if (this.j != null && this.f != null) {
            ((View) this.f).removeCallbacks(this.j);
            this.j = null;
            return true;
        }
        e eVar = this.h;
        if (eVar == null) {
            return false;
        }
        eVar.d();
        return true;
    }

    public boolean f() {
        return e() | g();
    }

    public boolean g() {
        if (this.i != null) {
            this.i.d();
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.h != null && this.h.f();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.m
    public boolean b() {
        ArrayList<android.support.v7.view.menu.h> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        d dVar = this;
        int i5 = 0;
        if (dVar.f743c != null) {
            arrayList = dVar.f743c.h();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = dVar.s;
        int i7 = dVar.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dVar.f;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            android.support.v7.view.menu.h hVar = arrayList.get(i11);
            if (hVar.l()) {
                i9++;
            } else if (hVar.k()) {
                i10++;
            } else {
                z2 = true;
            }
            if (dVar.w && hVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (dVar.o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = dVar.y;
        sparseBooleanArray.clear();
        if (dVar.u) {
            i2 = i7 / dVar.x;
            i3 = ((i7 % dVar.x) / i2) + dVar.x;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            android.support.v7.view.menu.h hVar2 = arrayList.get(i14);
            if (hVar2.l()) {
                View a2 = dVar.a(hVar2, dVar.z, viewGroup);
                if (dVar.z == null) {
                    dVar.z = a2;
                }
                if (dVar.u) {
                    i2 -= ActionMenuView.a(a2, i3, i2, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                hVar2.d(z);
                i4 = i;
            } else if (hVar2.k()) {
                int groupId2 = hVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!dVar.u || i2 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a3 = dVar.a(hVar2, dVar.z, viewGroup);
                    i4 = i;
                    if (dVar.z == null) {
                        dVar.z = a3;
                    }
                    if (dVar.u) {
                        int a4 = ActionMenuView.a(a3, i3, i2, makeMeasureSpec, 0);
                        i2 -= a4;
                        if (a4 == 0) {
                            z5 = false;
                        }
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = dVar.u ? z5 & (i13 >= 0) : z5 & (i13 + i15 > 0);
                } else {
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        android.support.v7.view.menu.h hVar3 = arrayList.get(i16);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.j()) {
                                i12++;
                            }
                            hVar3.d(false);
                        }
                    }
                }
                if (z4) {
                    i12--;
                }
                hVar2.d(z4);
            } else {
                i4 = i;
                hVar2.d(false);
                i14++;
                i = i4;
                dVar = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            dVar = this;
            i5 = 0;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.m
    public void a(android.support.v7.view.menu.g gVar, boolean z) {
        f();
        super.a(gVar, z);
    }

    @Override // android.support.v4.j.c.a
    public void a(boolean z) {
        if (z) {
            super.a((android.support.v7.view.menu.s) null);
        } else if (this.f743c == null) {
        } else {
            this.f743c.a(false);
        }
    }

    public void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a(this.f743c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: android.support.v7.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0023d extends m implements ActionMenuView.a {

        /* renamed from: b  reason: collision with root package name */
        private final float[] f948b;

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean d() {
            return false;
        }

        public C0023d(Context context) {
            super(context, null, a.C0020a.actionOverflowButtonStyle);
            this.f948b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ao.a(this, getContentDescription());
            setOnTouchListener(new x(this) { // from class: android.support.v7.widget.d.d.1
                @Override // android.support.v7.widget.x
                public android.support.v7.view.menu.q a() {
                    if (d.this.h == null) {
                        return null;
                    }
                    return d.this.h.b();
                }

                @Override // android.support.v7.widget.x
                public boolean b() {
                    d.this.d();
                    return true;
                }

                @Override // android.support.v7.widget.x
                public boolean c() {
                    if (d.this.j != null) {
                        return false;
                    }
                    d.this.e();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            d.this.d();
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
                android.support.v4.b.a.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends android.support.v7.view.menu.l {
        public e(Context context, android.support.v7.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.C0020a.actionOverflowMenuStyle);
            a(8388613);
            a(d.this.k);
        }

        @Override // android.support.v7.view.menu.l
        protected void e() {
            if (d.this.f743c != null) {
                d.this.f743c.close();
            }
            d.this.h = null;
            super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends android.support.v7.view.menu.l {
        public a(Context context, android.support.v7.view.menu.s sVar, View view) {
            super(context, sVar, view, false, a.C0020a.actionOverflowMenuStyle);
            if (!((android.support.v7.view.menu.h) sVar.getItem()).j()) {
                a(d.this.g == null ? (View) d.this.f : d.this.g);
            }
            a(d.this.k);
        }

        @Override // android.support.v7.view.menu.l
        protected void e() {
            d.this.i = null;
            d.this.l = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class f implements m.a {
        f() {
        }

        @Override // android.support.v7.view.menu.m.a
        public boolean a(android.support.v7.view.menu.g gVar) {
            if (gVar == null) {
                return false;
            }
            d.this.l = ((android.support.v7.view.menu.s) gVar).getItem().getItemId();
            m.a a2 = d.this.a();
            if (a2 == null) {
                return false;
            }
            return a2.a(gVar);
        }

        @Override // android.support.v7.view.menu.m.a
        public void a(android.support.v7.view.menu.g gVar, boolean z) {
            if (gVar instanceof android.support.v7.view.menu.s) {
                gVar.m().a(false);
            }
            m.a a2 = d.this.a();
            if (a2 != null) {
                a2.a(gVar, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f946b;

        public c(e eVar) {
            this.f946b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f743c != null) {
                d.this.f743c.e();
            }
            View view = (View) d.this.f;
            if (view != null && view.getWindowToken() != null && this.f946b.c()) {
                d.this.h = this.f946b;
            }
            d.this.j = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public android.support.v7.view.menu.q a() {
            if (d.this.i != null) {
                return d.this.i.b();
            }
            return null;
        }
    }
}
