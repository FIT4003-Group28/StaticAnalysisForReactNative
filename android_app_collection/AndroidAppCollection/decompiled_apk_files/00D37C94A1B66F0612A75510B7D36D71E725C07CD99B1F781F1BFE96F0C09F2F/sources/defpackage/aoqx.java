package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoqx  reason: default package */
/* loaded from: classes.dex */
public final class aoqx implements aorm {
    private final aoqu a;
    private final boolean b;
    private final apfu c;

    private aoqx(apfu apfuVar, aoqu aoquVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = apfuVar;
        this.b = aoquVar instanceof aopd;
        this.a = aoquVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoqx c(apfu apfuVar, aoyt aoytVar, aoqu aoquVar) {
        return new aoqx(apfuVar, aoquVar, null, null, null);
    }

    @Override // defpackage.aorm
    public final int a(Object obj) {
        aory q = apfu.q(obj);
        int i = q.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < q.b; i2++) {
                int i3 = q.c[i2];
                int ac = aool.ac(1);
                i += ac + ac + aool.ad(2, aosl.a(i3)) + aool.I(3, (aoob) q.d[i2]);
            }
            q.e = i;
        }
        if (this.b) {
            aoov f = aoyt.f(obj);
            int i4 = 0;
            for (int i5 = 0; i5 < f.b.a(); i5++) {
                i4 += f.c(f.b.f(i5));
            }
            for (Map.Entry entry : f.b.c()) {
                i4 += f.c(entry);
            }
            return i + i4;
        }
        return i;
    }

    @Override // defpackage.aorm
    public final int b(Object obj) {
        int hashCode = apfu.q(obj).hashCode();
        return this.b ? (hashCode * 53) + aoyt.f(obj).hashCode() : hashCode;
    }

    @Override // defpackage.aorm
    public final Object e() {
        return this.a.mo51newBuilderForType().mo48buildPartial();
    }

    @Override // defpackage.aorm
    public final void f(Object obj) {
        apfu.t(obj);
        aoyt.j(obj);
    }

    @Override // defpackage.aorm
    public final void g(Object obj, Object obj2) {
        aorn.V(obj, obj2);
        if (this.b) {
            aorn.T(obj, obj2);
        }
    }

    @Override // defpackage.aorm
    public final void h(Object obj, aorh aorhVar, aoos aoosVar) {
        boolean U;
        apfu apfuVar = this.c;
        Object s = apfu.s(obj);
        aoov g = aoyt.g(obj);
        while (aorhVar.c() != Integer.MAX_VALUE) {
            try {
                int d = aorhVar.d();
                if (d != aosl.a) {
                    if (aosl.b(d) == 2) {
                        aopg d2 = aoosVar.d(this.a, aosl.a(d));
                        if (d2 != null) {
                            aoyt.h(aorhVar, d2, aoosVar, g);
                        } else {
                            U = apfuVar.n(s, aorhVar);
                        }
                    } else {
                        U = aorhVar.U();
                    }
                    if (!U) {
                        break;
                    }
                } else {
                    int i = 0;
                    aopg aopgVar = null;
                    aoob aoobVar = null;
                    while (aorhVar.c() != Integer.MAX_VALUE) {
                        int d3 = aorhVar.d();
                        if (d3 == aosl.c) {
                            i = aorhVar.j();
                            aopgVar = aoosVar.d(this.a, i);
                        } else if (d3 == aosl.d) {
                            if (aopgVar != null) {
                                aoyt.h(aorhVar, aopgVar, aoosVar, g);
                            } else {
                                aoobVar = aorhVar.q();
                            }
                        } else if (!aorhVar.U()) {
                            break;
                        }
                    }
                    if (aorhVar.d() != aosl.b) {
                        throw aopx.b();
                    }
                    if (aoobVar == null) {
                        continue;
                    } else if (aopgVar != null) {
                        aoqu mo48buildPartial = aopgVar.c.mo51newBuilderForType().mo48buildPartial();
                        ByteBuffer wrap = ByteBuffer.wrap(aoobVar.I());
                        if (wrap.hasArray()) {
                            aonq aonqVar = new aonq(wrap);
                            aore.a.b(mo48buildPartial).h(mo48buildPartial, aonqVar, aoosVar);
                            g.n(aopgVar.d, mo48buildPartial);
                            if (aonqVar.c() != Integer.MAX_VALUE) {
                                throw aopx.b();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        apfu.o(s, i, aoobVar);
                    }
                }
            } finally {
                apfu.r(obj, (aory) s);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[EDGE_INSN: B:56:0x00b7->B:33:0x00b7 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.aorm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.aonp r15) {
        /*
            r10 = this;
            r0 = r11
            aopi r0 = (defpackage.aopi) r0
            aory r1 = r0.unknownFields
            aory r2 = defpackage.aory.a
            if (r1 != r2) goto Lf
            aory r1 = defpackage.aory.c()
            r0.unknownFields = r1
        Lf:
            aopd r11 = (defpackage.aopd) r11
            aoov r11 = r11.d()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc3
            int r4 = defpackage.aoyt.E(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.aosl.a
            r5 = 2
            if (r13 == r3) goto L60
            int r3 = defpackage.aosl.b(r13)
            if (r3 != r5) goto L5b
            aoos r2 = r15.d
            aoqu r3 = r10.a
            int r5 = defpackage.aosl.a(r13)
            aopg r8 = r2.d(r3, r5)
            if (r8 == 0) goto L50
            aore r13 = defpackage.aore.a
            aoqu r2 = r8.c
            java.lang.Class r2 = r2.getClass()
            aorm r13 = r13.a(r2)
            int r13 = defpackage.aoyt.q(r13, r12, r4, r14, r15)
            aopf r2 = r8.d
            java.lang.Object r3 = r15.c
            r11.n(r2, r3)
            goto L59
        L50:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.aoyt.D(r2, r3, r4, r5, r6, r7)
        L59:
            r2 = r8
            goto L17
        L5b:
            int r13 = defpackage.aoyt.I(r13, r12, r4, r14, r15)
            goto L17
        L60:
            r13 = 0
            r3 = r0
        L62:
            if (r4 >= r14) goto Lb7
            int r4 = defpackage.aoyt.E(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.aosl.b(r6)
            int r8 = defpackage.aosl.a(r6)
            if (r8 == r5) goto L9d
            r9 = 3
            if (r8 == r9) goto L78
            goto Lae
        L78:
            if (r2 == 0) goto L92
            aore r6 = defpackage.aore.a
            aoqu r7 = r2.c
            java.lang.Class r7 = r7.getClass()
            aorm r6 = r6.a(r7)
            int r4 = defpackage.aoyt.q(r6, r12, r4, r14, r15)
            aopf r6 = r2.d
            java.lang.Object r7 = r15.c
            r11.n(r6, r7)
            goto L62
        L92:
            if (r7 != r5) goto Lae
            int r4 = defpackage.aoyt.n(r12, r4, r15)
            java.lang.Object r3 = r15.c
            aoob r3 = (defpackage.aoob) r3
            goto L62
        L9d:
            if (r7 != 0) goto Lae
            int r4 = defpackage.aoyt.E(r12, r4, r15)
            int r13 = r15.a
            aoos r2 = r15.d
            aoqu r6 = r10.a
            aopg r2 = r2.d(r6, r13)
            goto L62
        Lae:
            int r7 = defpackage.aosl.b
            if (r6 == r7) goto Lb7
            int r4 = defpackage.aoyt.I(r6, r12, r4, r14, r15)
            goto L62
        Lb7:
            if (r3 == 0) goto Lc0
            int r13 = defpackage.aosl.c(r13, r5)
            r1.f(r13, r3)
        Lc0:
            r13 = r4
            goto L17
        Lc3:
            if (r13 != r14) goto Lc6
            return
        Lc6:
            aopx r11 = defpackage.aopx.g()
            goto Lcc
        Lcb:
            throw r11
        Lcc:
            goto Lcb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqx.i(java.lang.Object, byte[], int, int, aonp):void");
    }

    @Override // defpackage.aorm
    public final boolean j(Object obj, Object obj2) {
        if (!apfu.q(obj).equals(apfu.q(obj2))) {
            return false;
        }
        if (!this.b) {
            return true;
        }
        return aoyt.f(obj).equals(aoyt.f(obj2));
    }

    @Override // defpackage.aorm
    public final boolean k(Object obj) {
        return aoyt.f(obj).j();
    }

    @Override // defpackage.aorm
    public final void l(Object obj, aoom aoomVar) {
        Iterator e = aoyt.f(obj).e();
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            aopf aopfVar = (aopf) entry.getKey();
            if (aopfVar.a() == aosk.MESSAGE && !aopfVar.d && !aopfVar.e) {
                if (!(entry instanceof aoqa)) {
                    aoomVar.l(aopfVar.b, entry.getValue());
                } else {
                    aoomVar.l(aopfVar.b, ((aoqc) ((aoqa) entry).a.getValue()).a());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        aory q = apfu.q(obj);
        for (int i = 0; i < q.b; i++) {
            aoomVar.l(aosl.a(q.c[i]), q.d[i]);
        }
    }
}
