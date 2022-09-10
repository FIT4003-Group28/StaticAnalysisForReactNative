package defpackage;

import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: cpqz  reason: default package */
/* loaded from: classes5.dex */
public final class cpqz<T, D> extends cpqs<T, D, cpqr<T, D>> implements cpqy<T, D> {
    private float b;
    private float c;
    private float d;

    @Override // defpackage.cpqs
    protected final void B(T t, D d, cpso<D> cpsoVar, cpso<Double> cpsoVar2, TreeMap<Comparable<D>, Integer> treeMap, cpqr<T, D> cpqrVar) {
        int i;
        float l;
        if (t != null) {
            Map.Entry<Comparable<D>, Integer> higherEntry = treeMap.higherEntry((Comparable) d);
            if (higherEntry == null) {
                return;
            }
            i = higherEntry.getValue().intValue();
        } else {
            i = 0;
        }
        int i2 = i();
        while (i < i2) {
            D k = k(i);
            Double m = m(i);
            Double o = o(i);
            int q = q(i);
            if (cpsoVar.q(k)) {
                l = cpsoVar.s(k);
            } else {
                l = l(i) + cpsoVar.k();
            }
            Double d2 = null;
            if (m != null && t != null) {
                d2 = m;
            }
            cpqrVar.a.b(j(i), 0.0f, 0.0f, 0);
            cpqrVar.b.b(k(i), l(i), l, 0);
            cpqrVar.c.b(m, n(i), cpsoVar2.r(d2, o), 0);
            cpqrVar.d.b(o, p(i), cpsoVar2.s(o), 0);
            cpqrVar.e.b(q, q, 0);
            i++;
        }
    }

    @Override // defpackage.cpqs
    protected final void C(D d, cpso<D> cpsoVar, cpso<Double> cpsoVar2, TreeMap<Comparable<D>, Integer> treeMap, cpqr<T, D> cpqrVar) {
        float l;
        Map.Entry<Comparable<D>, Integer> lowerEntry = treeMap.lowerEntry((Comparable) d);
        if (lowerEntry != null) {
            for (int i = 0; i <= lowerEntry.getValue().intValue(); i++) {
                D k = k(i);
                Double m = m(i);
                Double o = o(i);
                int q = q(i);
                if (cpsoVar.q(k)) {
                    l = cpsoVar.s(k);
                } else {
                    l = l(i) - cpsoVar.k();
                }
                cpqrVar.a.b(j(i), 0.0f, 0.0f, 0);
                cpqrVar.b.b(k(i), l(i), l, 0);
                cpqrVar.c.b(m, n(i), cpsoVar2.r(m, o), 0);
                cpqrVar.d.b(o, p(i), cpsoVar2.s(o), 0);
                cpqrVar.e.b(q, q, 0);
            }
        }
    }

    @Override // defpackage.cpqs
    protected final void D(T t, D d, Double d2, Double d3, int i, cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpso<D> cpsoVar3, cpso<Double> cpsoVar4, TreeMap<Comparable<D>, Integer> treeMap, cpqr<T, D> cpqrVar) {
        float s;
        float f;
        float s2;
        Comparable<D> comparable = (Comparable) d;
        boolean q = this.a.q(d);
        float s3 = this.a.s(d);
        Map.Entry<Comparable<D>, Integer> lowerEntry = treeMap.lowerEntry(comparable);
        if (lowerEntry == null) {
            lowerEntry = treeMap.higherEntry(comparable);
        }
        if (lowerEntry != null) {
            if (!q) {
                s3 = l(lowerEntry.getValue().intValue());
            }
            f = n(lowerEntry.getValue().intValue());
            s = p(lowerEntry.getValue().intValue());
        } else {
            if (!q) {
                s3 = cpsoVar.s(d);
            }
            Double valueOf = Double.valueOf((double) dcyn.a);
            float s4 = cpsoVar2.s(valueOf);
            s = cpsoVar2.s(valueOf);
            f = s4;
        }
        cpqrVar.a.b(t, 0.0f, 0.0f, 1);
        cpqrVar.b.b(d, s3, cpsoVar.s(d), 1);
        cpqm<Double> cpqmVar = cpqrVar.c;
        if (d2 != null) {
            s2 = cpsoVar2.r(d2, d3);
        } else {
            s2 = cpsoVar2.s(d3);
        }
        cpqmVar.b(d2, f, s2, 1);
        cpqrVar.d.b(d3, s, cpsoVar2.s(d3), 1);
        cpqrVar.e.b(i, i, 1);
    }

    @Override // defpackage.cpqy
    public final void a(float f) {
        this.b = this.c;
        this.d = f;
    }

    @Override // defpackage.cpqy
    public final float b() {
        return this.c;
    }

    @Override // defpackage.cpqy
    public final cpra<T, D> c() {
        if (this.a == null) {
            return null;
        }
        return new cpra<>(w(), y(), this.c);
    }

    @Override // defpackage.cpqy
    public final void d(cpra<T, D> cpraVar) {
        if (cpraVar == null) {
            return;
        }
        v(cpraVar.a);
        x(cpraVar.b);
        this.b = this.c;
        float f = cpraVar.c;
        this.c = f;
        this.d = f;
    }

    @Override // defpackage.cpqs
    protected final cpqr<T, D> g(cpvi<T, D> cpviVar) {
        return A(cpviVar);
    }

    @Override // defpackage.cpqs, defpackage.cpqu
    public final synchronized void h(float f) {
        super.h(f);
        this.c = cpqk.e(this.b, this.d, f);
    }
}
