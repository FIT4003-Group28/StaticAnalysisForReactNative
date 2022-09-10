package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jdx  reason: default package */
/* loaded from: classes7.dex */
public class jdx extends FrameLayout implements AbsListView.OnScrollListener, View.OnTouchListener, qa {
    int b;
    protected final View c;
    protected final View d;
    protected boolean e;
    @dzsi
    private abx g;
    private static final dcqe f = dcqe.c("jdx");
    public static final cqkv a = new jdy();

    public jdx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.base_scrollableviewdivider_internal, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cpj.e);
        this.b = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        this.c = findViewById(R.id.shadow);
        this.d = findViewById(R.id.divider);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jdx.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(Integer num) {
        return cqjv.i(iug.TARGET, num, a);
    }

    @dzsi
    private final View f(int i) {
        ViewParent parent = getParent();
        if (!(parent instanceof View) || i == -1) {
            return null;
        }
        return ((View) parent).findViewById(i);
    }

    @Override // defpackage.qa
    public final void a(NestedScrollView nestedScrollView, int i) {
        e(i == 0);
    }

    public final void d() {
        View f2 = f(this.b);
        if (f2 instanceof AbsListView) {
            ((AbsListView) f2).setOnScrollListener(this);
        } else if (f2 instanceof RecyclerView) {
            jdw jdwVar = new jdw(this);
            this.g = jdwVar;
            ((RecyclerView) f2).i(jdwVar);
        } else if (f2 instanceof ScrollView) {
            ((ScrollView) f2).setOnTouchListener(this);
        } else if (f2 instanceof NestedScrollView) {
            ((NestedScrollView) f2).setOnScrollChangeListener(this);
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = f2 == null ? "null" : f2.getClass().getName();
            bvoo.h("Target view not supported. Expected instance of AbsListView or ScrollView or RecyclerView or NestedScrollView, got object of class: %s", objArr);
        }
        e(true);
    }

    public void e(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int i = 0;
        this.c.setVisibility(true != z ? 0 : 4);
        View view = this.d;
        if (true != z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        abx abxVar;
        View f2 = f(this.b);
        if (f2 instanceof AbsListView) {
            ((AbsListView) f2).setOnScrollListener(null);
        } else if (!(f2 instanceof RecyclerView) || (abxVar = this.g) == null) {
            if (f2 instanceof ScrollView) {
                ((ScrollView) f2).setOnTouchListener(null);
            } else if (f2 instanceof NestedScrollView) {
                ((NestedScrollView) f2).setOnScrollChangeListener((qa) null);
            }
        } else {
            ((RecyclerView) f2).j(abxVar);
            this.g = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = false;
        View childAt = absListView.getChildAt(0);
        if (childAt != null) {
            if (i == 0 && childAt.getTop() >= 0) {
                z = true;
            }
            e(z);
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        e(i2 == 0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (view instanceof ScrollView) {
            e(((ScrollView) view).getScrollY() <= 0);
        }
        if (view instanceof NestedScrollView) {
            if (((NestedScrollView) view).getScrollY() > 0) {
                z = false;
            }
            e(z);
        }
        return false;
    }
}
