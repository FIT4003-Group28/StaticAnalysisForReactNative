package defpackage;

import android.content.Context;
import android.content.res.Configuration;
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
import java.util.UUID;
/* compiled from: PG */
/* renamed from: sai  reason: default package */
/* loaded from: classes4.dex */
public abstract class sai extends sbr implements sbn {
    public final sbo A;
    public final dkr B;
    private saq a;
    private boolean b;
    private Integer[] c;
    private saf d;
    public int e;
    public boolean f;
    public final Map g;
    public final Set h;
    public Set i;
    public sej j;
    public final ScaleGestureDetector k;
    public final GestureDetector l;
    public final sca m;
    public boolean n;
    public final List o;
    public final boolean p;
    public final sav q;
    public final sah r;
    public final Map s;
    public final List t;
    public List u;
    Map v;
    public boolean w;
    public sfa x;
    public boolean y;
    public final Map z;

    public sai(Context context) {
        super(context);
        this.A = new sbo(this);
        int i = saa.a;
        this.e = 300;
        this.f = true;
        this.g = shp.j();
        this.h = shp.f();
        this.i = shp.f();
        this.n = false;
        this.o = sbv.d();
        this.b = false;
        this.B = new dkr();
        this.p = true;
        this.q = new sav(this);
        this.r = new sah(this);
        this.s = shp.h();
        this.t = sbv.d();
        this.u = Collections.emptyList();
        this.v = shp.h();
        this.c = new Integer[0];
        this.w = false;
        this.z = shp.h();
        int i2 = sgo.b;
        this.x = new sey();
        sca scaVar = new sca(this);
        this.m = scaVar;
        this.l = new GestureDetector(context, scaVar);
        this.k = new ScaleGestureDetector(getContext(), scaVar);
        setOnTouchListener(new sac(this));
        setChildrenDrawingOrderEnabled(true);
        scf.b(context, 1.0f);
        scf.c(context, 1.0f);
    }

    private final void a() {
        saq saqVar = this.a;
        if (saqVar != null) {
            if (saqVar.e.isEnabled()) {
                saqVar.c();
            }
            saqVar.e.removeAccessibilityStateChangeListener(saqVar.f);
            this.a = null;
            super.setAccessibilityDelegate(null);
        }
    }

    public static final Map x(Map map) {
        LinkedHashMap j = shp.j();
        for (Map.Entry entry : map.entrySet()) {
            j.put((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue()));
        }
        return Collections.unmodifiableMap(j);
    }

    public final void A(shp shpVar) {
        this.m.b.add(shpVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof sbw) {
            if (view.getParent() != null) {
                return;
            }
            super.addView(view, i, layoutParams);
            u((sbw) view, null);
            return;
        }
        if (view instanceof scd) {
            scd scdVar = (scd) view;
            if (view != this.g.get(scdVar.e())) {
                p(scdVar.e(), scdVar);
            }
            if (scdVar.e() != null) {
                this.h.add(scdVar.e());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(List list) {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (i != this.c.length) {
            q();
        }
        return this.c[i2].intValue();
    }

    public final scd h() {
        return i("__DEFAULT__");
    }

    public final scd i(String str) {
        Map map = this.g;
        if (str == null) {
            str = "__DEFAULT__";
        }
        return (scd) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public sej j() {
        return sfc.d();
    }

    public abstract sgq k();

    public final List l() {
        return Collections.unmodifiableList(this.u);
    }

    public final void m(View view) {
        if (view.getParent() == this) {
            return;
        }
        super.addView(view, -1, view.getLayoutParams() == null ? generateDefaultLayoutParams() : view.getLayoutParams());
    }

    public final void n(sgt sgtVar) {
        ArrayList f = sbv.f(4);
        f.add(sgtVar);
        w(f);
    }

    public final void o(sez sezVar) {
        this.o.remove(sezVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        if (!this.b) {
            int i = sau.a;
            saq saqVar = new saq(this);
            this.a = saqVar;
            super.setAccessibilityDelegate(saqVar);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        this.w = true;
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        a();
        for (sbs sbsVar : this.t) {
            sbsVar.c();
        }
        super.onDetachedFromWindow();
    }

    public final void p(String str, scd scdVar) {
        if (scdVar != null) {
            scdVar.f(str);
        }
        if (this.g.containsKey(str) && this.g.get(str) != scdVar && this.h.contains(str)) {
            removeView((View) this.g.get(str));
            this.h.remove(str);
        }
        if (scdVar != null) {
            this.g.put(str, scdVar);
        } else {
            this.g.remove(str);
        }
    }

    public final void q() {
        HashMap h = shp.h();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            h.put(getChildAt(i2), Integer.valueOf(i2));
        }
        ArrayList e = sbv.e(h.keySet());
        Collections.sort(e, new sad(h));
        this.c = new Integer[h.size()];
        int size = e.size();
        int i3 = 0;
        while (i < size) {
            this.c[i3] = (Integer) h.get((View) e.get(i));
            i++;
            i3++;
        }
    }

    public final saf r() {
        if (this.d == null) {
            this.d = new saf(this);
        }
        return this.d;
    }

    public final Object s(sha shaVar) {
        return this.z.get(shaVar);
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        a();
        this.b = true;
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    @Override // defpackage.sbn
    public void setAnimationPercent(float f) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof sbn) {
                ((sbn) childAt).setAnimationPercent(f);
            }
        }
        if (f >= 1.0f) {
            for (sbs sbsVar : this.t) {
                sbsVar.a();
            }
            for (String str : this.i) {
                removeView((View) this.g.get(str));
                this.h.remove(str);
            }
            this.i.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(sbw sbwVar) {
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("AutoGenerated: ");
        sb.append(valueOf);
        u(sbwVar, sb.toString());
    }

    public final void u(sbw sbwVar, String str) {
        sbw sbwVar2;
        String str2;
        if (str != null && (sbwVar2 = (sbw) this.s.remove(str)) != null) {
            sbwVar2.c(this);
            Iterator it = this.s.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == sbwVar2) {
                    str2 = (String) entry.getKey();
                    break;
                }
            }
            if (str2 != null) {
                this.s.remove(str2);
            }
            saq saqVar = this.a;
            if (saqVar != null && ((sbwVar2 instanceof sbc) || (sbwVar2 instanceof saw))) {
                saqVar.b();
            }
        }
        sbwVar.b(this);
        if (str != null) {
            this.s.put(str, sbwVar);
        }
    }

    public final void v(sez sezVar) {
        this.o.add(sezVar);
    }

    public final void w(List list) {
        this.f = true;
        ArrayList f = sbv.f(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sgt sgtVar = (sgt) it.next();
            sgt sgtVar2 = new sgt(sgtVar.b, sgtVar.a);
            shd shdVar = sgtVar.c;
            shd shdVar2 = new shd();
            shdVar2.a.putAll(shdVar.a);
            sgtVar2.c = shdVar2;
            sgz sgzVar = sgtVar.d;
            sgz sgzVar2 = new sgz();
            sgzVar2.a.putAll(sgzVar.a);
            sgtVar2.d = sgzVar2;
            f.add(sgtVar2);
        }
        for (sbs sbsVar : this.t) {
            sbsVar.d(f);
        }
        sgo.b(this);
        g(f);
    }

    public final void y(sbs sbsVar) {
        this.t.add(sbsVar);
    }

    public final void z(sbs sbsVar) {
        this.t.remove(sbsVar);
    }
}
