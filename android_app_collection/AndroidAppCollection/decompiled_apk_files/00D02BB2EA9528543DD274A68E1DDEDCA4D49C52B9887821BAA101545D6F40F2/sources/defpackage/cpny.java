package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.cprf;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpny  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpny<T, D, A extends cprf<D, ?>> extends cpoj<T, D> {
    private final Map<String, cprl> B;
    private final Map<String, A> C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    public boolean a;
    protected final cpud b;

    public cpny(Context context) {
        super(context);
        this.B = cpwj.a();
        this.C = cpwj.a();
        this.a = true;
        this.b = new cpud(context);
        C(null);
    }

    private final cprl A(String str) {
        cprl cprlVar = this.B.get(str);
        cpwl.d(cprlVar != null, "No measure axis was set with name \"%s\"", str);
        return cprlVar;
    }

    private final void B(cprf<?, ?> cprfVar, boolean z) {
        int i = cprfVar.h;
        cppw cppwVar = (cppw) cprfVar.getLayoutParams();
        byte b = cppwVar.a;
        int i2 = 3;
        if (z) {
            if (i == 2) {
                b = 1;
            }
            if (i == 2) {
                i = 4;
            }
            if (i == 1) {
                b = 16;
            }
            i2 = i;
        } else {
            if (i == 4) {
                b = 4;
            }
            if (i == 4) {
                i = 2;
            }
            if (i == 3) {
                b = 8;
                i2 = 1;
            }
            i2 = i;
        }
        int i3 = cprfVar.h;
        cprfVar.h = i2;
        cppwVar.a = b;
        if (i3 != i2) {
            forceLayout();
        }
    }

    private final void C(AttributeSet attributeSet) {
        Map<String, cprl> map = this.B;
        Context context = getContext();
        boolean z = this.a;
        boolean z2 = !z;
        cprl cprlVar = new cprl(context, attributeSet);
        cprm cprmVar = new cprm();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.c, 0, 0);
        cprmVar.a(Integer.valueOf(obtainStyledAttributes.getInt(7, true != z ? 0 : 4)));
        cprmVar.a = obtainStyledAttributes.getBoolean(8, true);
        obtainStyledAttributes.recycle();
        cprlVar.e = cprmVar;
        cprlVar.b = false;
        cprlVar.i(new cpsa());
        if (!z2) {
            cptd.d(cprlVar);
        } else {
            cptd.c(cprlVar);
        }
        map.put("DEFAULT", cprlVar);
        this.C.put("DEFAULT", b(attributeSet));
        setRenderer("__DEFAULT__", new cpuc(getContext(), this.b));
    }

    protected abstract A b(AttributeSet attributeSet);

    public final cprl c() {
        return A("DEFAULT");
    }

    public final A d(String str) {
        return this.C.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpoj
    public final void e() {
        Map<String, List<cpot<T, D>>> map;
        Iterator<String> it;
        Double d;
        List<cpot> emptyList;
        cpny<T, D, A> cpnyVar = this;
        Map<String, List<cpot<T, D>>> map2 = cpnyVar.t;
        for (String str : map2.keySet()) {
            if (cpnyVar.i(str).k()) {
                for (cpot<T, D> cpotVar : map2.get(str)) {
                    cpvi<T, D> cpviVar = cpotVar.a;
                    cprl A = cpnyVar.A((String) cpviVar.h(cpvj.a, "DEFAULT"));
                    cpotVar.d = A.a;
                    cprr cprrVar = A.g;
                    A d2 = cpnyVar.d((String) cpviVar.h(cpvj.b, "DEFAULT"));
                    cpotVar.e = d2.a;
                    cpotVar.f = d2.g;
                }
            }
        }
        Map<String, List<cpot>> s = cpoj.s(cpnyVar.t);
        for (String str2 : ((cpoj) cpnyVar).f) {
            if (s.containsKey(str2)) {
                emptyList = s.get(str2);
            } else {
                emptyList = Collections.emptyList();
            }
            ((cpoj) cpnyVar).e.get(str2).f(cpnyVar, emptyList, cpnyVar.v);
        }
        for (cppq cppqVar : cpnyVar.r) {
            cppqVar.c(s, cpnyVar.v);
        }
        for (cprl cprlVar : cpnyVar.B.values()) {
            cprlVar.b();
        }
        for (A a : cpnyVar.C.values()) {
            a.b();
        }
        Iterator<String> it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (cpnyVar.i(next).k()) {
                for (cpot<T, D> cpotVar2 : map2.get(next)) {
                    cpvi cpviVar2 = (cpvi<T, D>) cpotVar2.a;
                    String str3 = (String) cpviVar2.h(cpvj.a, "DEFAULT");
                    cpve d3 = cpviVar2.d(cpvf.a);
                    cpve e = cpviVar2.e(cpvf.b, Double.valueOf((double) dcyn.a));
                    cpve<T, D> a2 = cpotVar2.a();
                    A d4 = cpnyVar.d((String) cpviVar2.h(cpvj.b, "DEFAULT"));
                    int i = -1;
                    for (T t : cpviVar2.e) {
                        int i2 = i + 1;
                        d4.a(a2.a(t, i2, cpviVar2));
                        i = i2;
                    }
                    for (D d5 : cpotVar2.h) {
                        d4.a.m(d5);
                    }
                    cprl A2 = cpnyVar.A(str3);
                    Iterator<T> it3 = cpviVar2.e.iterator();
                    boolean z = false;
                    Double d6 = null;
                    int i3 = -1;
                    while (true) {
                        if (!it3.hasNext()) {
                            map = map2;
                            it = it2;
                            d = null;
                            break;
                        }
                        T next2 = it3.next();
                        i3++;
                        map = map2;
                        D a3 = a2.a(next2, i3, cpviVar2);
                        Double d7 = (Double) d3.a(next2, i3, cpviVar2);
                        Double d8 = (Double) e.a(next2, i3, cpviVar2);
                        if (d7 != null) {
                            d = Double.valueOf(d8.doubleValue() != dcyn.a ? d7.doubleValue() + d8.doubleValue() : d7.doubleValue());
                            it = it2;
                            int p = d4.a.p(a3);
                            if (p < 0) {
                                d6 = d;
                            } else if (p > 0) {
                                break;
                            } else {
                                A2.a(d);
                                z = true;
                            }
                        } else {
                            it = it2;
                        }
                        map2 = map;
                        it2 = it;
                    }
                    for (Double d9 : cpotVar2.g) {
                        A2.a.m(d9);
                    }
                    if (!z) {
                        if (d6 != null) {
                            A2.a(d6);
                        }
                        if (d != null) {
                            A2.a(d);
                        }
                    }
                    cpnyVar = this;
                    map2 = map;
                    it2 = it;
                }
            }
            cpnyVar = this;
        }
    }

    @Override // defpackage.cppp
    protected final void f() {
        List<cpot> emptyList;
        String str = this.E;
        if (str != null) {
            A(str).g();
        }
        String str2 = this.H;
        if (str2 != null) {
            A(str2).g();
        }
        String str3 = this.F;
        if (str3 != null) {
            d(str3).g();
        }
        String str4 = this.E;
        if (str4 == null) {
            str4 = this.H;
        }
        if (str4 != null) {
            cpsf<Integer> f = A(str4).a.f();
            for (String str5 : this.B.keySet()) {
                if (!str5.equals(this.E) && !str5.equals(this.H)) {
                    cprl cprlVar = this.B.get(str5);
                    cprlVar.setRange(f);
                    cprlVar.g();
                }
            }
        }
        if (this.F == null || this.E == null || !this.u) {
            return;
        }
        boolean z = false;
        this.u = false;
        Map<String, List<cpot>> s = cpoj.s(this.t);
        for (String str6 : ((cpoj) this).f) {
            if (s.containsKey(str6)) {
                emptyList = s.get(str6);
            } else {
                emptyList = Collections.emptyList();
            }
            ((cpoj) this).e.get(str6).g(emptyList, this.v);
        }
        for (cppq cppqVar : this.r) {
            cppqVar.a(s, this.v);
        }
        cppm cppmVar = this.z;
        if (cppmVar != null) {
            cppmVar.b.cancel();
        }
        this.z.b.setDuration(((cpoj) this).d ? ((cpoj) this).c : 0L);
        if (!this.y) {
            cppm cppmVar2 = this.z;
            if (cppmVar2.b.getDuration() > 0) {
                cppmVar2.b.start();
            } else {
                cppmVar2.a.setAnimationPercent(1.0f);
            }
        }
        if (((cpoj) this).c > 0) {
            z = true;
        }
        ((cpoj) this).d = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r1 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpoj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List<defpackage.cpvi<T, D>> r11) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpny.g(java.util.List):void");
    }

    public void setDefaultDomainAxis(A a) {
        setDomainAxis("DEFAULT", a);
    }

    public void setDefaultMeasureAxis(cprl cprlVar) {
        setMeasureAxis("DEFAULT", cprlVar);
    }

    public void setDomainAxis(String str, A a) {
        if (str.equals(this.F)) {
            String str2 = this.F;
            if (str2 != null) {
                removeView(d(str2));
            }
            this.F = null;
        }
        this.C.put(str, a);
    }

    public void setMeasureAxis(String str, cprl cprlVar) {
        if (str.equals(this.E)) {
            removeView(A(this.E));
            this.E = null;
        }
        if (str.equals(this.H)) {
            removeView(A(this.H));
            this.H = null;
        }
        this.B.put(str, cprlVar);
    }

    public void setPrimarySeriesName(String str) {
        this.D = str;
    }

    public void setRendersMeasuresVertically(boolean z) {
        this.a = z;
    }

    public void setSecondarySeriesName(String str) {
        this.G = str;
    }

    public cpny(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpny(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = cpwj.a();
        this.C = cpwj.a();
        this.a = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.c, i, 0);
        this.a = obtainStyledAttributes.getBoolean(9, true);
        obtainStyledAttributes.recycle();
        this.b = cpud.a(context, attributeSet, i);
        C(attributeSet);
    }
}
