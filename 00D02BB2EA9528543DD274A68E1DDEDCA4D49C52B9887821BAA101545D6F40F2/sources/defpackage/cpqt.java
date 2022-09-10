package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cpqt  reason: default package */
/* loaded from: classes5.dex */
public class cpqt<T, D> implements cpqu<T, D> {
    private int a;
    private List<T> b;
    private List<D> c;
    private float[] d;
    private cpso<D> e;
    private List<Double> f;
    private float[] g;
    private List<Double> h;
    private float[] i;
    private cpso<Double> j;
    private int[] k;
    private final Map<D, Integer> l = cpwj.a();
    private int m = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public final cpqv<T, D> F() {
        if (this.e == null) {
            return null;
        }
        List<T> list = this.b;
        int i = this.a;
        return new cpqv<>(list, i, new cprd(this.c, this.d, i), this.e.o(), new cprd(this.f, this.g, this.a), new cprd(this.h, this.i, this.a), this.j.o());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(cpqv<T, D> cpqvVar) {
        if (cpqvVar == null) {
            return;
        }
        this.a = cpqvVar.b;
        this.b = cpqvVar.a;
        cprd<D> cprdVar = cpqvVar.c;
        this.c = cprdVar.a;
        this.d = cprdVar.b;
        this.e = cpqvVar.d;
        cprd<Double> cprdVar2 = cpqvVar.e;
        this.f = cprdVar2.a;
        this.g = cprdVar2.b;
        cprd<Double> cprdVar3 = cpqvVar.f;
        this.h = cprdVar3.a;
        this.i = cprdVar3.b;
        this.j = cpqvVar.g;
    }

    @Override // defpackage.cpqu
    public final void h(float f) {
    }

    @Override // defpackage.cpqu
    public final int i() {
        return this.a;
    }

    @Override // defpackage.cpqu
    public final T j(int i) {
        cpwl.g(i, this.a);
        return this.b.get(i);
    }

    @Override // defpackage.cpqu
    public final D k(int i) {
        cpwl.g(i, this.a);
        return this.c.get(i);
    }

    @Override // defpackage.cpqu
    public final float l(int i) {
        cpwl.g(i, this.a);
        return this.d[i];
    }

    @Override // defpackage.cpqu
    public final Double m(int i) {
        cpwl.g(i, this.a);
        return this.f.get(i);
    }

    @Override // defpackage.cpqu
    public final float n(int i) {
        cpwl.g(i, this.a);
        return this.g[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cpqx o() {
        return new cpqx(this.k, this.a);
    }

    @Override // defpackage.cpqu
    public final float p(int i) {
        cpwl.g(i, this.a);
        return this.i[i];
    }

    @Override // defpackage.cpqu
    public final int q(int i) {
        cpwl.g(i, this.a);
        return this.k[i];
    }

    @Override // defpackage.cpqu
    public final void r(int i) {
        this.m = i;
    }

    @Override // defpackage.cpqu
    public final int s() {
        return this.m;
    }

    @Override // defpackage.cpqu
    public final int t(D d) {
        return this.l.get(d).intValue();
    }

    @Override // defpackage.cpqu
    public final Set<D> u(cpsf<Float> cpsfVar) {
        HashSet b = cpwm.b(this.a);
        for (int i = 0; i < this.a; i++) {
            if (cpsfVar.a.floatValue() <= this.d[i] && cpsfVar.b.floatValue() >= this.d[i]) {
                b.add(this.c.get(i));
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(cpqx cpqxVar) {
        this.k = cpqxVar.a;
    }

    @Override // defpackage.cpqu
    public final void z(cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpve<T, D> cpveVar, cpvi<T, D> cpviVar) {
        int c = cpviVar.c();
        float[] fArr = this.d;
        if (fArr == null || c > fArr.length) {
            this.b = cpwi.b(c);
            this.c = cpwi.b(c);
            this.d = new float[c];
            this.f = cpwi.b(c);
            this.g = new float[c];
            this.h = cpwi.b(c);
            this.i = new float[c];
            this.k = new int[c];
        } else {
            this.b.clear();
            this.c.clear();
            this.f.clear();
            this.h.clear();
            this.l.clear();
        }
        this.e = cpsoVar;
        this.j = cpsoVar2;
        cpve<T, R> d = cpviVar.d(cpvf.a);
        cpve<T, R> e = cpviVar.e(cpvf.b, Double.valueOf((double) dcyn.a));
        cpve<T, R> e2 = cpviVar.e(cpvf.e, -16777216);
        this.a = 0;
        for (T t : cpviVar.e) {
            this.b.add(t);
            D a = cpveVar.a(t, this.a, cpviVar);
            this.c.add(a);
            this.d[this.a] = cpsoVar.s(a);
            this.l.put(a, Integer.valueOf(this.a));
            Double d2 = (Double) d.a(t, this.a, cpviVar);
            Double d3 = (Double) e.a(t, this.a, cpviVar);
            this.f.add(d2);
            this.g[this.a] = cpsoVar2.r(d2, d3);
            this.h.add(d3);
            this.i[this.a] = cpsoVar2.s(d3);
            int[] iArr = this.k;
            int i = this.a;
            iArr[i] = ((Integer) e2.a(t, i, cpviVar)).intValue();
            this.a++;
        }
    }
}
