package defpackage;

import defpackage.cpqr;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: cpqs  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpqs<T, D, U extends cpqr<T, D>> implements cpqu<T, D> {
    private boolean[] d;
    private cpqm<T> b = new cpqm<>(0);
    public cpso<D> a = null;
    private cprc<D> c = new cprc<>(0);
    private cpso<Double> e = null;
    private cpqm<Double> f = new cpqm<>(0);
    private cpqm<Double> g = new cpqm<>(0);
    private cpqw h = new cpqw(0);
    private int i = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public final cpqr<T, D> A(cpvi<T, D> cpviVar) {
        return new cpqr<>(this.c.d + cpviVar.c());
    }

    protected void B(T t, D d, cpso<D> cpsoVar, cpso<Double> cpsoVar2, TreeMap<Comparable<D>, Integer> treeMap, U u) {
        for (int i = 0; i < this.c.d; i++) {
            if (!this.d[i]) {
                u.a.b(j(i), 0.0f, 0.0f, 0);
                float s = cpsoVar2.s(Double.valueOf((double) dcyn.a));
                D k = k(i);
                u.b.b(k, l(i), cpsoVar.q(k) ? cpsoVar.s(k) : l(i), 0);
                Double m = m(i);
                float n = n(i);
                Double o = o(i);
                float p = p(i);
                u.c.b(m, n, s, 0);
                u.d.b(o, p, s, 0);
                u.e.b(q(i), q(i), 0);
            }
        }
    }

    protected void C(D d, cpso<D> cpsoVar, cpso<Double> cpsoVar2, TreeMap<Comparable<D>, Integer> treeMap, U u) {
    }

    protected void D(T t, D d, Double d2, Double d3, int i, cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpso<D> cpsoVar3, cpso<Double> cpsoVar4, TreeMap<Comparable<D>, Integer> treeMap, U u) {
        float s;
        u.a.b(t, 0.0f, 0.0f, 1);
        float s2 = cpsoVar4.s(Double.valueOf((double) dcyn.a));
        if (cpsoVar3.q(d)) {
            s = cpsoVar3.s(d);
        } else {
            s = cpsoVar.s(d);
        }
        u.b.b(d, s, cpsoVar.s(d), 1);
        u.c.b(d2, s2, cpsoVar2.r(d2, d3), 1);
        u.d.b(d3, s2, cpsoVar2.s(d3), 1);
        u.e.b(i, i, 1);
    }

    protected boolean E(int i, T t, int i2, cpvi<T, D> cpviVar, D d, Double d2, Double d3, int i3, cpso<D> cpsoVar, cpso<Double> cpsoVar2, U u) {
        u.a.b(t, 0.0f, 0.0f, 2);
        u.b.b(d, l(i), cpsoVar.s(d), 2);
        u.c.b(d2, n(i), cpsoVar2.r(d2, d3), 2);
        u.d.b(d3, p(i), cpsoVar2.s(d3), 2);
        u.e.b(q(i), i3, 2);
        return true;
    }

    protected abstract U g(cpvi<T, D> cpviVar);

    @Override // defpackage.cpqu
    public synchronized void h(float f) {
        this.f.d(f);
        this.g.d(f);
        this.c.d(f);
        this.b.d(f);
        cpqw cpqwVar = this.h;
        if (cpqwVar.c != null) {
            int i = 0;
            if (f < 1.0f) {
                int i2 = cpqwVar.a;
                if (i2 == 0) {
                    while (true) {
                        int[] iArr = cpqwVar.b;
                        if (i >= iArr.length) {
                            break;
                        }
                        int[] iArr2 = cpqwVar.c;
                        int i3 = cpqwVar.d[i];
                        int i4 = iArr[i];
                        int i5 = i3 & 16711680;
                        int i6 = i3 & 65280;
                        int i7 = i3 & 255;
                        int i8 = (i3 >> 24) & 255;
                        iArr2[i] = ((((int) (((((i4 >> 24) & 255) - i8) * f) + i8)) << 24) & (-16777216)) | (16711680 & ((int) ((((i4 & 16711680) - i5) * f) + i5))) | (((int) ((((i4 & 65280) - i6) * f) + i6)) & 65280) | (((int) ((((i4 & 255) - i7) * f) + i7)) & 255);
                        i++;
                    }
                } else if (i2 != 1 && i2 != 2) {
                    throw new AssertionError("Bad animation mode");
                }
            } else {
                cpqwVar.c = null;
                cpqwVar.d = null;
                cpqwVar.h = false;
                int i9 = cpqwVar.f;
                int i10 = cpqwVar.g;
                if (i9 != i10) {
                    int[] iArr3 = new int[i10];
                    int i11 = 0;
                    while (i < cpqwVar.f) {
                        if (cpqwVar.e[i] != 0) {
                            iArr3[i11] = cpqwVar.b[i];
                            i11++;
                        }
                        i++;
                    }
                    cpqwVar.f = cpqwVar.g;
                    cpqwVar.b = iArr3;
                    cpqwVar.e = null;
                }
            }
        }
    }

    @Override // defpackage.cpqu
    public final int i() {
        return this.c.d;
    }

    @Override // defpackage.cpqu
    public final T j(int i) {
        return this.b.f(i);
    }

    @Override // defpackage.cpqu
    public final D k(int i) {
        return this.c.f(i);
    }

    @Override // defpackage.cpqu
    public final float l(int i) {
        return this.c.g(i);
    }

    @Override // defpackage.cpqu
    public final Double m(int i) {
        return this.f.f(i);
    }

    @Override // defpackage.cpqu
    public final float n(int i) {
        return this.f.g(i);
    }

    public final Double o(int i) {
        return this.g.f(i);
    }

    @Override // defpackage.cpqu
    public final float p(int i) {
        return this.g.g(i);
    }

    @Override // defpackage.cpqu
    public final int q(int i) {
        cpqw cpqwVar = this.h;
        cpwl.g(i, cpqwVar.f);
        int[] iArr = cpqwVar.c;
        if (iArr != null) {
            return iArr[i];
        }
        return cpqwVar.b[i];
    }

    @Override // defpackage.cpqu
    public final void r(int i) {
        this.i = i;
        this.h.a(i);
    }

    @Override // defpackage.cpqu
    public final int s() {
        return this.i;
    }

    @Override // defpackage.cpqu
    public final int t(D d) {
        Integer num = this.c.e.get(d);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r10 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r10 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r11 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r10 > r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r11 > r9) goto L10;
     */
    @Override // defpackage.cpqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<D> u(defpackage.cpsf<java.lang.Float> r14) {
        /*
            r13 = this;
            cprc<D> r0 = r13.c
            int r1 = r0.d
            java.util.HashSet r1 = defpackage.cpwm.b(r1)
            float[] r2 = r0.c
            float[] r3 = r0.b
            java.util.List<D> r4 = r0.a
            r5 = 0
            r6 = 0
        L10:
            int r7 = r0.d
            if (r6 >= r7) goto L74
            r7 = 1
            if (r2 != 0) goto L34
            D r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            D r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L32
            int r8 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r8 > 0) goto L32
            goto L68
        L32:
            r7 = 0
            goto L68
        L34:
            D r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            D r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            r11 = r2[r6]
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L50
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L50:
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 > 0) goto L58
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L58:
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 >= 0) goto L60
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 > 0) goto L68
        L60:
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L32
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L32
        L68:
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.get(r6)
            r1.add(r7)
        L71:
            int r6 = r6 + 1
            goto L10
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpqs.u(cpsf):java.util.Set");
    }

    public final synchronized void v(cpqv<T, D> cpqvVar) {
        this.b = new cpqm<>(new cprd(cpqvVar.a, cpqvVar.c.b, cpqvVar.b));
        this.c = new cprc<>(cpqvVar.c);
        this.a = cpqvVar.d;
        this.f = new cpqm<>(cpqvVar.e);
        this.g = new cpqm<>(cpqvVar.f);
        this.e = cpqvVar.g;
    }

    public final synchronized cpqv<T, D> w() {
        cprd<T> a;
        a = this.b.a();
        return new cpqv<>(a.a, a.c, this.c.a(), this.a, this.f.a(), this.g.a(), this.e);
    }

    public final synchronized void x(cpqx cpqxVar) {
        cpqw cpqwVar = new cpqw(cpqxVar);
        this.h = cpqwVar;
        cpqwVar.a(this.i);
    }

    public final synchronized cpqx y() {
        cpqw cpqwVar;
        int[] iArr;
        cpqwVar = this.h;
        iArr = cpqwVar.c;
        if (iArr == null) {
            iArr = cpqwVar.b;
        }
        return new cpqx(iArr, cpqwVar.f);
    }

    @Override // defpackage.cpqu
    public final synchronized void z(cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpve<T, D> cpveVar, cpvi<T, D> cpviVar) {
        cpso<D> cpsoVar3;
        int i;
        T t;
        cpve cpveVar2;
        cpve cpveVar3;
        cpve cpveVar4;
        U u;
        TreeMap<Comparable<D>, Integer> treeMap;
        cpso<D> cpsoVar4 = cpsoVar;
        cpso<Double> cpsoVar5 = cpsoVar2;
        synchronized (this) {
            cprc<D> cprcVar = this.c;
            this.d = new boolean[cprcVar.d];
            TreeMap<Comparable<D>, Integer> treeMap2 = new TreeMap<>();
            int i2 = cprcVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                treeMap2.put((Comparable) cprcVar.f(i3), Integer.valueOf(i3));
            }
            U g = g(cpviVar);
            g.e.a(this.i);
            if (this.e == null) {
                this.e = cpsoVar5;
            }
            if (this.a == null) {
                this.a = cpsoVar4;
            }
            if (cpsoVar5 == null) {
                cpsoVar5 = this.e;
            }
            cpso<Double> cpsoVar6 = cpsoVar5;
            if (cpsoVar4 == null) {
                cpsoVar4 = this.a;
            }
            cpve d = cpviVar.d(cpvf.a);
            cpve e = cpviVar.e(cpvf.b, Double.valueOf((double) dcyn.a));
            cpve d2 = cpviVar.d(cpvf.e);
            int i4 = -1;
            T t2 = null;
            D d3 = null;
            for (T t3 : cpviVar.e) {
                int i5 = i4 + 1;
                D a = cpveVar.a(t3, i5, cpviVar);
                Double d4 = (Double) d.a(t3, i5, cpviVar);
                Double d5 = (Double) e.a(t3, i5, cpviVar);
                int intValue = ((Integer) d2.a(t3, i5, cpviVar)).intValue();
                if (t2 == null) {
                    cpsoVar3 = cpsoVar4;
                    i = i5;
                    C(a, cpsoVar4, cpsoVar6, treeMap2, g);
                } else {
                    cpsoVar3 = cpsoVar4;
                    i = i5;
                }
                Integer num = treeMap2.get(cpveVar.a(t3, i, cpviVar));
                if (num != null) {
                    t = t3;
                    cpveVar2 = d2;
                    cpveVar3 = e;
                    cpveVar4 = d;
                    u = g;
                    treeMap = treeMap2;
                    this.d[num.intValue()] = E(num.intValue(), t3, i, cpviVar, a, d4, d5, intValue, cpsoVar3, cpsoVar6, u);
                } else {
                    t = t3;
                    cpveVar2 = d2;
                    cpveVar3 = e;
                    cpveVar4 = d;
                    u = g;
                    treeMap = treeMap2;
                    D(t, a, d4, d5, intValue, cpsoVar3, cpsoVar6, this.a, this.e, treeMap, u);
                }
                g = u;
                i4 = i;
                d3 = a;
                t2 = t;
                d2 = cpveVar2;
                e = cpveVar3;
                d = cpveVar4;
                treeMap2 = treeMap;
                cpsoVar4 = cpsoVar3;
            }
            cpso<D> cpsoVar7 = cpsoVar4;
            U u2 = g;
            B(t2, d3, cpsoVar7, cpsoVar6, treeMap2, u2);
            this.b = u2.a;
            this.c = u2.b;
            this.f = u2.c;
            this.g = u2.d;
            this.h = u2.e;
            this.a = cpsoVar7.o();
            this.e = cpsoVar6.o();
        }
    }
}
