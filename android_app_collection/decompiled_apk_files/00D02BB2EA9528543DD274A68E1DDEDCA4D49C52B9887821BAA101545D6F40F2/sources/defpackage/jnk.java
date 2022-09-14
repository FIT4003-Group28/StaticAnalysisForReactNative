package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
/* compiled from: PG */
/* renamed from: jnk  reason: default package */
/* loaded from: classes7.dex */
public class jnk extends FrameLayout {
    public static final cqkv a = new jnl();
    final bbb b;
    ViewPager c;
    public bas d;
    @dzsi
    public View e;
    @dzsi
    public View f;
    @dzsi
    public jnj g;
    @dzsi
    public jnj h;
    boolean i;
    @dzsi
    public jng j;
    @dzsi
    public jnh k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public jni p;
    private final ViewGroup.OnHierarchyChangeListener q;
    private final View.OnClickListener r;

    public jnk(Context context) {
        super(context);
        this.b = new jna(this);
        this.n = 0;
        this.q = new jnc(this);
        this.r = new jnd(this);
        p();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jnf.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jne.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(@dzsi jng jngVar) {
        return cqjv.i(iug.ON_PAGE_SELECTED_LISTENER, jngVar, a);
    }

    public static <T extends cqkp, V extends cqkp> cqnf<T> d(cqiw<V> cqiwVar) {
        return cqjv.i(iug.ARROW_PAGER_ADAPTER, cqiwVar, a);
    }

    public static <T extends cqkp, V extends cqkp> cqnf<T> e(cqlc<T, V> cqlcVar) {
        return cqjv.g(iug.ARROW_PAGER_CURRENT_ITEM, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(List<? extends cqkp> list) {
        return cqjv.i(iug.ARROW_PAGER_ITEMS, list, a);
    }

    public static <T extends cqkp> cqnf<T> g(Boolean bool) {
        return cqjv.i(iug.ARROWS_VISIBLE, bool, a);
    }

    public static <T extends cqkp> cqnf<T> h(Boolean bool) {
        return cqjv.i(iug.VIEW_PAGER_FOCUSABLE, bool, a);
    }

    @dzsi
    public static cjql n(View view) {
        cjtd k = cjqg.k(view);
        cjql e = cjqg.e(view);
        if (k == null || e == null) {
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() <= 0) {
                return null;
            }
            return n(viewGroup.getChildAt(0));
        }
        return e;
    }

    private final void p() {
        jnq jnqVar = new jnq(getContext());
        this.c = jnqVar;
        addView(jnqVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.c.h(new jnb(this));
        this.p = jni.PROGRAMMATIC;
        o(true);
        setOnHierarchyChangeListener(this.q);
        this.c.h(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() != 0 || jmw.a(this, motionEvent.getX(), motionEvent.getY())) {
            jnj jnjVar = this.g;
            boolean z2 = jnjVar != null && jnjVar.a(motionEvent);
            jnj jnjVar2 = this.h;
            if (jnjVar2 != null && jnjVar2.a(motionEvent)) {
                z = true;
            }
            if (z2) {
                j();
            } else if (z) {
                k();
            } else {
                if (motionEvent.getAction() == 1) {
                    this.p = jni.USER_SWIPE;
                }
                boolean dispatchTouchEvent = this.c.dispatchTouchEvent(motionEvent);
                this.p = jni.PROGRAMMATIC;
                return dispatchTouchEvent;
            }
            motionEvent.setAction(3);
            boolean dispatchTouchEvent2 = this.c.dispatchTouchEvent(motionEvent);
            this.p = jni.PROGRAMMATIC;
            return dispatchTouchEvent2;
        }
        return false;
    }

    public final int i() {
        return this.c.e();
    }

    public final void j() {
        this.p = jni.USER_ARROW_CLICK_PREVIOUS;
        ViewPager viewPager = this.c;
        viewPager.setCurrentItem(viewPager.e() - 1);
    }

    public final void k() {
        this.p = jni.USER_ARROW_CLICK_NEXT;
        ViewPager viewPager = this.c;
        viewPager.setCurrentItem(viewPager.e() + 1);
    }

    public final void l(int i) {
        bas basVar = this.d;
        int i2 = 0;
        int OV = basVar == null ? 0 : basVar.OV();
        boolean z = this.i;
        boolean z2 = z && i > 0;
        boolean z3 = z && (i < OV + (-1) || OV == 0);
        View view = this.e;
        if (view != null) {
            view.setVisibility(true != z2 ? 4 : 0);
        }
        View view2 = this.f;
        if (view2 != null) {
            if (true != z3) {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
    }

    public final void m(View view) {
        view.setOnClickListener(this.r);
        bringChildToFront(view);
    }

    public final void o(Boolean bool) {
        this.i = bool.booleanValue();
        l(this.c.e());
    }

    public void setAdapter(bas basVar) {
        this.d = basVar;
        this.c.setAdapter(basVar);
        l(this.c.e());
    }

    public void setCurrentItem(int i) {
        this.c.setCurrentItem(i);
        l(i);
    }

    public void setViewPagerFocusable(Boolean bool) {
        this.c.setFocusable(bool.booleanValue());
    }

    public jnk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new jna(this);
        this.n = 0;
        this.q = new jnc(this);
        this.r = new jnd(this);
        p();
    }

    public jnk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new jna(this);
        this.n = 0;
        this.q = new jnc(this);
        this.r = new jnd(this);
        p();
    }
}
