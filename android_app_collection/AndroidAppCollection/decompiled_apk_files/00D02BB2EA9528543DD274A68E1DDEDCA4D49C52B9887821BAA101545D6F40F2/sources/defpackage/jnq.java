package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: jnq  reason: default package */
/* loaded from: classes7.dex */
public class jnq extends ViewPager implements ecs {
    public static final cqkv o = new jnr();
    private int IX;
    public boolean p;
    boolean q;
    boolean r;
    @dzsi
    jnn s;
    boolean t;
    @dzsi
    public jnp u;
    final bbb v;
    @dzsi
    public bas w;
    @dzsi
    public bbb x;
    public final ArrayList<bbb> y;
    @dzsi
    public aclm z;

    public jnq(Context context) {
        this(context, null);
    }

    public static <T extends cqkp> cqnf<T> A(Boolean bool) {
        return cqjv.i(iug.SMOOTH_SCROLL, bool, o);
    }

    public static <T extends cqkp> cqnf<T> B(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.SMOOTH_SCROLL, cqlcVar, o);
    }

    public static <T extends cqkp> cqnf<T> C(Boolean bool) {
        return cqjv.i(iug.SWIPEABLE, bool, o);
    }

    public static <T extends cqkp> cqnf<T> D(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.SWIPEABLE, cqlcVar, o);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> y(cqmp<T>... cqmpVarArr) {
        return new cqmh(jnq.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> z(cqlc<T, jco> cqlcVar) {
        return cqjv.g(iug.GMM_ON_PAGE_CHANGE_LISTENER, cqlcVar, o);
    }

    public final void E(int i) {
        View childAt;
        if (i != this.IX) {
            this.IX = i;
            bbb bbbVar = this.x;
            if (bbbVar != null) {
                bbbVar.b(i);
            }
            ArrayList<bbb> arrayList = this.y;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).b(i);
            }
            if (!this.t || (childAt = getChildAt(i)) == null) {
                return;
            }
            cpv.a.c(childAt, 8);
        }
    }

    public final int F(int i) {
        jnp jnpVar = this.u;
        return jnpVar != null ? jnpVar.a(i) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(@dzsi jco jcoVar) {
        jnn jnnVar = jcoVar != null ? new jnn(this, jcoVar) : null;
        this.s = jnnVar;
        setOnPageChangeListener(jnnVar);
    }

    public void Qf() {
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final bas c() {
        return this.w;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!isShown() || !this.p) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final int e() {
        return F(this.c);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void h(bbb bbbVar) {
        this.y.add(bbbVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void i(bbb bbbVar) {
        this.y.remove(bbbVar);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean d = cjxu.d(this);
        if (d != this.r) {
            this.r = d;
            jnp jnpVar = this.u;
            if (jnpVar == null) {
                return;
            }
            this.t = false;
            jnpVar.i(1);
            this.t = true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(bas basVar) {
        jnp jnpVar = this.u;
        if (jnpVar != null) {
            jnpVar.b.o(jnpVar.c);
            jnpVar.a = null;
            jnpVar.c = null;
            this.u = null;
        }
        this.w = basVar;
        if (basVar != null) {
            this.u = new jnp(this, basVar);
        }
        super.setAdapter(this.u);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        this.t = false;
        if (this.q) {
            super.setCurrentItem(F(i));
        } else {
            super.setCurrentItem(F(i), false);
        }
        this.t = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(@dzsi bbb bbbVar) {
        this.x = bbbVar;
    }

    public jnq(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = true;
        this.q = true;
        this.r = false;
        this.t = true;
        this.y = new ArrayList<>(1);
        jnm jnmVar = new jnm(this);
        this.v = jnmVar;
        super.h(jnmVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        this.t = false;
        super.setCurrentItem(F(i), z);
        this.t = true;
    }
}
