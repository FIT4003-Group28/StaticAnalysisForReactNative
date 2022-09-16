package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cpoj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpoj<T, D> extends cppp implements cppl {
    private static cpof C = new cpoa();
    private boolean B;
    private Integer[] D;
    private Map<cpqa<?>, Object> E;
    private cpoe F;
    private boolean a;
    private cpor<T, D> b;
    public int c;
    public boolean d;
    public Map<String, cpqf<T, D>> e;
    public Set<String> f;
    public Set<String> g;
    public cpse h;
    public ScaleGestureDetector i;
    public GestureDetector j;
    public cpqb<T, D> k;
    public List<cpta<T, D>> l;
    public cpoi<T, D> m;
    public boolean n;
    public cpov<T, D> o;
    public cpoh p;
    public Map<String, cppu<T, D>> q;
    public List<cppq> r;
    public List<cpot> s;
    Map<String, List<cpot<T, D>>> t;
    public boolean u;
    public cptb<T, D> v;
    public boolean w;
    public boolean x;
    public boolean y;
    public cppm z;

    public cpoj(Context context) {
        super(context);
        this.z = cpql.a(this);
        this.c = cpnx.a;
        this.d = true;
        this.e = cpwj.c();
        this.f = cpwm.d();
        this.g = cpwm.d();
        this.a = false;
        this.l = cpwi.a();
        this.B = false;
        this.m = new cpoz();
        this.n = true;
        this.o = new cpov<>(this);
        this.p = new cpoh(this);
        this.q = cpwj.a();
        this.r = cpwi.a();
        this.s = Collections.emptyList();
        this.t = cpwj.a();
        this.D = new Integer[0];
        this.u = false;
        this.x = false;
        this.y = false;
        this.E = cpwj.a();
        cpuz cpuzVar = cpvb.a;
        this.v = new cpsu();
        b(context);
    }

    private final cpoe A() {
        if (this.F == null) {
            this.F = new cpoe(this);
        }
        return this.F;
    }

    private final void b(Context context) {
        this.k = new cpqb<>(this);
        this.j = new GestureDetector(context, this.k);
        this.i = new ScaleGestureDetector(getContext(), this.k);
        setOnTouchListener(C.a(this));
        setChildrenDrawingOrderEnabled(true);
        cpqk.a(context, 1.0f);
        cpqk.b(context, 1.0f);
    }

    private final void c() {
        cpor<T, D> cporVar = this.b;
        if (cporVar != null) {
            if (cporVar.f.isEnabled()) {
                cporVar.b();
            }
            cporVar.f.removeAccessibilityStateChangeListener(cporVar.g);
            this.b = null;
            super.setAccessibilityDelegate(null);
        }
    }

    private final void d(cptb<T, D> cptbVar) {
        cptb<T, D> cptbVar2 = this.v;
        if (cptbVar2 != null) {
            cptbVar2.e(A());
        }
        this.v = cptbVar;
        cptbVar.d(A());
        if (this.a) {
            return;
        }
        this.a = true;
        p(new cpod(this));
    }

    public static final <T, F extends T> Map<String, List<T>> s(Map<String, List<F>> map) {
        LinkedHashMap c = cpwj.c();
        for (Map.Entry<String, List<F>> entry : map.entrySet()) {
            c.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(c);
    }

    public static void setOnTouchListenerFactory(cpof cpofVar) {
        C = cpofVar;
    }

    public abstract cpvf<D> a();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof cppu) {
            if (view.getParent() != null) {
                return;
            }
            super.addView(view, i, layoutParams);
            o((cppu) view, null);
            return;
        }
        if (view instanceof cpqf) {
            cpqf<T, D> cpqfVar = (cpqf) view;
            if (view != this.e.get(cpqfVar.j())) {
                setRenderer(cpqfVar.j(), cpqfVar);
            }
            if (cpqfVar.j() != null) {
                this.f.add(cpqfVar.j());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        throw null;
    }

    public void g(List<cpvi<T, D>> list) {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (i != this.D.length) {
            n();
        }
        return this.D[i2].intValue();
    }

    public final void h(View view) {
        if (view.getParent() == this) {
            return;
        }
        super.addView(view, -1, view.getLayoutParams() == null ? generateDefaultLayoutParams() : view.getLayoutParams());
    }

    public final cpqf<T, D> i(String str) {
        Map<String, cpqf<T, D>> map = this.e;
        if (str == null) {
            str = "__DEFAULT__";
        }
        return map.get(str);
    }

    public final void j(cpta<T, D> cptaVar) {
        this.l.remove(cptaVar);
    }

    public final <X> X k(cpqa<X> cpqaVar) {
        return (X) this.E.get(cpqaVar);
    }

    public final List<cpot> l() {
        return Collections.unmodifiableList(this.s);
    }

    public final void m(boolean z) {
        v(z);
    }

    public final void n() {
        HashMap a = cpwj.a();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            a.put(getChildAt(i2), Integer.valueOf(i2));
        }
        ArrayList c = cpwi.c(a.keySet());
        Collections.sort(c, new cpoc(a));
        this.D = new Integer[a.size()];
        int size = c.size();
        int i3 = 0;
        while (i < size) {
            this.D[i3] = (Integer) a.get((View) c.get(i));
            i++;
            i3++;
        }
    }

    public final <B extends cppu<T, D>> void o(B b, String str) {
        if (str != null) {
            r(str);
        }
        b.a(this);
        if (str != null) {
            this.q.put(str, b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        if (!this.B) {
            int i = cpou.a;
            cpor<T, D> cporVar = new cpor<>(this);
            this.b = cporVar;
            super.setAccessibilityDelegate(cporVar);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        this.u = true;
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        c();
        for (cppq cppqVar : this.r) {
            cppqVar.d();
        }
        super.onDetachedFromWindow();
    }

    public final <L extends cppy> void p(L l) {
        this.k.b.add(l);
    }

    public final <L extends cpta<T, D>> void q(L l) {
        this.l.add(l);
    }

    public final void r(String str) {
        String str2;
        cppu<T, D> remove = this.q.remove(str);
        if (remove != null) {
            remove.b(this);
            Iterator<Map.Entry<String, cppu<T, D>>> it = this.q.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                Map.Entry<String, cppu<T, D>> next = it.next();
                if (next.getValue() == remove) {
                    str2 = next.getKey();
                    break;
                }
            }
            if (str2 == null) {
                return;
            }
            this.q.remove(str2);
        }
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        c();
        this.B = true;
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    @Override // defpackage.cppl
    public void setAnimationPercent(float f) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof cppl) {
                ((cppl) childAt).setAnimationPercent(f);
            }
        }
        if (f >= 1.0f) {
            for (cppq cppqVar : this.r) {
                cppqVar.b();
            }
            for (String str : this.g) {
                removeView((View) this.e.get(str));
                this.f.remove(str);
            }
            this.g.clear();
        }
    }

    public void setColorScale(cpse cpseVar) {
        this.h = cpseVar;
    }

    public void setDefaultDescribablesDisabled() {
        this.n = false;
    }

    public void setDefaultDescribablesEnabled() {
        this.n = true;
    }

    public void setDefaultRenderer(cpqf<T, D> cpqfVar) {
        setRenderer("__DEFAULT__", cpqfVar);
    }

    public <X> void setExternalData(cpqa<X> cpqaVar, X x) {
        this.E.put(cpqaVar, x);
    }

    public void setManuallyAnimate(boolean z) {
        this.y = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(onTouchListener);
    }

    public void setRenderer(String str, cpqf<T, D> cpqfVar) {
        if (cpqfVar != null) {
            cpqfVar.setRendererId(str);
        }
        if (this.e.containsKey(str) && this.e.get(str) != cpqfVar && this.f.contains(str)) {
            removeView((View) this.e.get(str));
            this.f.remove(str);
        }
        if (cpqfVar != null) {
            this.e.put(str, cpqfVar);
        } else {
            this.e.remove(str);
        }
    }

    public void setSelectionModel(cptb<T, D> cptbVar, boolean z) {
        setSelectionModel(cptbVar, z, false);
    }

    public void setSeriesListDescriptionStrategy(cpoi<T, D> cpoiVar) {
        this.m = cpoiVar;
    }

    public void setTransitionMs(int i) {
        this.c = i;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final <L extends cppq> void t(L l) {
        this.r.add(l);
    }

    public final void u(cppq cppqVar) {
        this.r.remove(cppqVar);
    }

    public final void v(boolean z) {
        this.d = z;
        List<cpvi<T, D>> d = cpwi.d(this.s, new cpob());
        cpvb.b(this);
        g(d);
    }

    public void setSelectionModel(cptb<T, D> cptbVar, boolean z, boolean z2) {
        this.w = z;
        this.x = z2;
        d(cptbVar);
    }

    public cpoj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpoj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = cpql.a(this);
        this.c = cpnx.a;
        boolean z = true;
        this.d = true;
        this.e = cpwj.c();
        this.f = cpwm.d();
        this.g = cpwm.d();
        this.a = false;
        this.l = cpwi.a();
        this.B = false;
        this.m = new cpoz();
        this.n = true;
        this.o = new cpov<>(this);
        this.p = new cpoh(this);
        this.q = cpwj.a();
        this.r = cpwi.a();
        this.s = Collections.emptyList();
        this.t = cpwj.a();
        this.D = new Integer[0];
        this.u = false;
        this.x = false;
        this.y = false;
        this.E = cpwj.a();
        cpuz cpuzVar = cpvb.a;
        b(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.b, i, 0);
        this.w = obtainStyledAttributes.getBoolean(9, false);
        int i2 = obtainStyledAttributes.getInt(10, 0);
        if (i2 != 1) {
            if (i2 == 2) {
                z = false;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    this.v = new cpsu();
                    obtainStyledAttributes.recycle();
                }
            }
            d(new cptc(z));
            obtainStyledAttributes.recycle();
        }
        z = false;
        d(new cpst(z));
        obtainStyledAttributes.recycle();
    }
}
