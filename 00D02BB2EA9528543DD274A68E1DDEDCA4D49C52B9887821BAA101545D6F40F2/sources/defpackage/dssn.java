package defpackage;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssn  reason: default package */
/* loaded from: classes6.dex */
public final class dssn<T> implements dstc<T> {
    private final dssj a;
    private final dstx<?, ?> b;
    private final boolean c;
    private final dsqb<?> d;

    private dssn(dstx<?, ?> dstxVar, dsqb<?> dsqbVar, dssj dssjVar) {
        this.b = dstxVar;
        this.c = dsqbVar.a(dssjVar);
        this.d = dsqbVar;
        this.a = dssjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dssn<T> g(dstx<?, ?> dstxVar, dsqb<?> dsqbVar, dssj dssjVar) {
        return new dssn<>(dstxVar, dsqbVar, dssjVar);
    }

    @Override // defpackage.dstc
    public final T a() {
        return (T) this.a.NH().bJ();
    }

    @Override // defpackage.dstc
    public final boolean b(T t, T t2) {
        if (!this.b.i(t).equals(this.b.i(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        return this.d.b(t).equals(this.d.b(t2));
    }

    @Override // defpackage.dstc
    public final int c(T t) {
        int hashCode = this.b.i(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(t).hashCode() : hashCode;
    }

    @Override // defpackage.dstc
    public final void d(T t, T t2) {
        dstd.s(this.b, t, t2);
        if (this.c) {
            dstd.r(this.d, t, t2);
        }
    }

    @Override // defpackage.dstc
    public final int e(T t) {
        dstx<?, ?> dstxVar = this.b;
        int o = dstxVar.o(dstxVar.i(t));
        if (this.c) {
            dsqh<?> b = this.d.b(t);
            int i = 0;
            for (int i2 = 0; i2 < b.a.b(); i2++) {
                i += b.h(b.a.c(i2));
            }
            for (Map.Entry<?, Object> entry : b.a.d()) {
                i += b.h(entry);
            }
            return o + i;
        }
        return o;
    }

    @Override // defpackage.dstc
    public final void f(T t, dssw dsswVar, dsqa dsqaVar) {
        boolean c;
        dstx<?, ?> dstxVar = this.b;
        dsqb<?> dsqbVar = this.d;
        Object j = dstxVar.j(t);
        dsqh<?> c2 = dsqbVar.c(t);
        while (dsswVar.a() != Integer.MAX_VALUE) {
            try {
                int b = dsswVar.b();
                if (b != dsut.a) {
                    if (dsut.a(b) == 2) {
                        Object g = dsqbVar.g(dsqaVar, this.a, dsut.b(b));
                        if (g != null) {
                            dsqbVar.h(dsswVar, g, dsqaVar, c2);
                        } else {
                            c = dstxVar.m(j, dsswVar);
                        }
                    } else {
                        c = dsswVar.c();
                    }
                    if (!c) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj = null;
                    dspd dspdVar = null;
                    while (dsswVar.a() != Integer.MAX_VALUE) {
                        int b2 = dsswVar.b();
                        if (b2 == dsut.c) {
                            i = dsswVar.t();
                            obj = dsqbVar.g(dsqaVar, this.a, i);
                        } else if (b2 == dsut.d) {
                            if (obj != null) {
                                dsqbVar.h(dsswVar, obj, dsqaVar, c2);
                            } else {
                                dspdVar = dsswVar.s();
                            }
                        } else if (!dsswVar.c()) {
                            break;
                        }
                    }
                    if (dsswVar.b() != dsut.b) {
                        throw dsrm.e();
                    } else if (dspdVar != null) {
                        if (obj != null) {
                            dsqbVar.i(dspdVar, obj, dsqaVar, c2);
                        } else {
                            dstxVar.d(j, i, dspdVar);
                        }
                    }
                }
            } finally {
                dstxVar.k(t, j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0 A[EDGE_INSN: B:58:0x00c0->B:33:0x00c0 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.dstc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(T r11, byte[] r12, int r13, int r14, defpackage.dsol r15) {
        /*
            r10 = this;
            r0 = r11
            dsqw r0 = (defpackage.dsqw) r0
            dsty r1 = r0.bD
            dsty r2 = defpackage.dsty.a
            if (r1 != r2) goto Lf
            dsty r1 = defpackage.dsty.a()
            r0.bD = r1
        Lf:
            dsqs r11 = (defpackage.dsqs) r11
            dsqh r11 = r11.e()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lcc
            int r4 = defpackage.dsom.a(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.dsut.a
            r5 = 2
            if (r13 == r3) goto L65
            int r3 = defpackage.dsut.a(r13)
            if (r3 != r5) goto L60
            dsqb<?> r2 = r10.d
            dsqa r3 = r15.d
            dssj r5 = r10.a
            int r6 = defpackage.dsut.b(r13)
            java.lang.Object r2 = r2.g(r3, r5, r6)
            r8 = r2
            dsqv r8 = (defpackage.dsqv) r8
            if (r8 == 0) goto L55
            dsst r13 = defpackage.dsst.a
            dssj r2 = r8.c
            java.lang.Class r2 = r2.getClass()
            dstc r13 = r13.a(r2)
            int r13 = defpackage.dsom.k(r13, r12, r4, r14, r15)
            dsqu r2 = r8.d
            java.lang.Object r3 = r15.c
            r11.m(r2, r3)
            goto L5e
        L55:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.dsom.x(r2, r3, r4, r5, r6, r7)
        L5e:
            r2 = r8
            goto L17
        L60:
            int r13 = defpackage.dsom.y(r13, r12, r4, r14, r15)
            goto L17
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lc0
            int r4 = defpackage.dsom.a(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.dsut.a(r6)
            int r8 = defpackage.dsut.b(r6)
            if (r8 == r5) goto La2
            r9 = 3
            if (r8 == r9) goto L7d
            goto Lb7
        L7d:
            if (r2 == 0) goto L97
            dsst r6 = defpackage.dsst.a
            dssj r7 = r2.c
            java.lang.Class r7 = r7.getClass()
            dstc r6 = r6.a(r7)
            int r4 = defpackage.dsom.k(r6, r12, r4, r14, r15)
            dsqu r6 = r2.d
            java.lang.Object r7 = r15.c
            r11.m(r6, r7)
            goto L67
        L97:
            if (r7 != r5) goto Lb7
            int r4 = defpackage.dsom.j(r12, r4, r15)
            java.lang.Object r3 = r15.c
            dspd r3 = (defpackage.dspd) r3
            goto L67
        La2:
            if (r7 != 0) goto Lb7
            int r4 = defpackage.dsom.a(r12, r4, r15)
            int r13 = r15.a
            dsqb<?> r2 = r10.d
            dsqa r6 = r15.d
            dssj r7 = r10.a
            java.lang.Object r2 = r2.g(r6, r7, r13)
            dsqv r2 = (defpackage.dsqv) r2
            goto L67
        Lb7:
            int r7 = defpackage.dsut.b
            if (r6 == r7) goto Lc0
            int r4 = defpackage.dsom.y(r6, r12, r4, r14, r15)
            goto L67
        Lc0:
            if (r3 == 0) goto Lc9
            int r13 = defpackage.dsut.c(r13, r5)
            r1.e(r13, r3)
        Lc9:
            r13 = r4
            goto L17
        Lcc:
            if (r13 != r14) goto Lcf
            return
        Lcf:
            dsrm r11 = defpackage.dsrm.i()
            goto Ld5
        Ld4:
            throw r11
        Ld5:
            goto Ld4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssn.i(java.lang.Object, byte[], int, int, dsol):void");
    }

    @Override // defpackage.dstc
    public final void j(T t) {
        this.b.l(t);
        this.d.d(t);
    }

    @Override // defpackage.dstc
    public final boolean k(T t) {
        return this.d.b(t).e();
    }

    @Override // defpackage.dstc
    public final void n(T t, dspq dspqVar) {
        Iterator<Map.Entry<?, Object>> d = this.d.b(t).d();
        while (d.hasNext()) {
            Map.Entry<?, Object> next = d.next();
            dsqu dsquVar = (dsqu) next.getKey();
            if (dsquVar.a() == dsus.MESSAGE && !dsquVar.d && !dsquVar.e) {
                if (!(next instanceof dsro)) {
                    dspqVar.s(dsquVar.b, next.getValue());
                } else {
                    dspqVar.s(dsquVar.b, ((dsro) next).a.getValue().b());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        dstx<?, ?> dstxVar = this.b;
        dstxVar.s(dstxVar.i(t), dspqVar);
    }
}
