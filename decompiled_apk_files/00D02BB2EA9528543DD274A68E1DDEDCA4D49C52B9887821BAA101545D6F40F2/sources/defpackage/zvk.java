package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: zvk  reason: default package */
/* loaded from: classes7.dex */
public final class zvk extends FrameLayout {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    @dzsi
    View c;
    @dzsi
    View d;
    @dzsi
    View e;
    private final abx f;
    private final qa g;
    private final View.OnLayoutChangeListener h;
    private final ViewTreeObserver.OnScrollChangedListener i;

    public zvk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new zvj(this);
        this.g = new qa(this) { // from class: zvg
            private final zvk a;

            {
                this.a = this;
            }

            @Override // defpackage.qa
            public final void a(NestedScrollView nestedScrollView, int i) {
                this.a.d();
            }
        };
        this.h = new View.OnLayoutChangeListener(this) { // from class: zvh
            private final zvk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.d();
            }
        };
        this.i = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: zvi
            private final zvk a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.d();
            }
        };
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(zvk.class, cqmjVar, iue.i(cqgr.aT(b)));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(zvk.class, cqmjVar, iue.h(cqgr.aT(a), cqgr.bw(80), cqgr.aJ(80)));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(zvk.class, cqmjVar, iue.i(cqgr.aT(b)), iue.h(cqgr.aT(a), cqgr.bw(80), cqgr.aJ(80)));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    private final void e(@dzsi View view) {
        if (this.d != view) {
            this.d = view;
            d();
        }
    }

    private final void f(@dzsi View view) {
        if (this.e != view) {
            this.e = view;
            d();
        }
    }

    private final void g(@dzsi View view) {
        View view2 = this.c;
        if (view2 != view) {
            if (view2 instanceof RecyclerView) {
                ((RecyclerView) view2).j(this.f);
            } else if (view2 instanceof NestedScrollView) {
                view2.removeOnLayoutChangeListener(this.h);
                ((NestedScrollView) this.c).setOnScrollChangeListener((qa) null);
            } else if (view2 instanceof ScrollView) {
                view2.removeOnLayoutChangeListener(this.h);
                this.c.getViewTreeObserver().removeOnScrollChangedListener(this.i);
            }
            this.c = view;
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).i(this.f);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).setOnScrollChangeListener(this.g);
                View view3 = this.c;
                dbsk.s(view3);
                view3.addOnLayoutChangeListener(this.h);
            } else if (view instanceof ScrollView) {
                view.addOnLayoutChangeListener(this.h);
                this.c.getViewTreeObserver().addOnScrollChangedListener(this.i);
            }
            d();
        }
    }

    public final void d() {
        boolean z;
        boolean z2;
        View view = this.c;
        int i = 0;
        if (view != null) {
            z = view.canScrollVertically(-1);
            z2 = this.c.canScrollVertically(1);
        } else {
            z = false;
            z2 = false;
        }
        int i2 = true != z ? 4 : 0;
        View view2 = this.d;
        if (view2 != null) {
            view2.setVisibility(i2);
        }
        if (true != z2) {
            i = 4;
        }
        View view3 = this.e;
        if (view3 != null) {
            view3.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (this.c != null || (!(childAt instanceof RecyclerView) && !(childAt instanceof NestedScrollView) && !(childAt instanceof ScrollView))) {
                if (this.d == null && cqkx.e(childAt, b, View.class) != null) {
                    e(childAt);
                }
                if (this.e == null && cqkx.e(childAt, a, View.class) != null) {
                    f(childAt);
                }
            } else {
                g(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g(null);
        e(null);
        f(null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d();
    }
}
