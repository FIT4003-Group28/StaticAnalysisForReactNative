package defpackage;

import android.os.Handler;
import android.util.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pji  reason: default package */
/* loaded from: classes4.dex */
public final class pji {
    public final auy a;
    public int b;
    public boolean c;
    public pjf d;
    public pjf e;
    public pjf f;
    public int g;
    public Object h;
    private final pkr i = new pkr();
    private final pks j = new pks();
    private final Handler k;
    private long l;
    private long m;

    public pji(auy auyVar, Handler handler) {
        this.a = auyVar;
        this.k = handler;
    }

    private final pjg l(pkt pktVar, Object obj, int i, int i2, long j, long j2) {
        ppz ppzVar = new ppz(obj, i, i2, j2);
        long d = pktVar.f(ppzVar.a, this.i).d(ppzVar.b, ppzVar.c);
        if (i2 == this.i.c(i)) {
            this.i.f();
        }
        this.i.g(ppzVar.b);
        long j3 = 0;
        if (d != -9223372036854775807L && d <= 0) {
            j3 = Math.max(0L, (-1) + d);
        }
        return new pjg(ppzVar, j3, j, -9223372036854775807L, d, false, false, false);
    }

    private final pjg m(pkt pktVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5 = j;
        pktVar.f(obj, this.i);
        int b = this.i.b(j5);
        ppz ppzVar = new ppz(obj, j3, b);
        boolean q = q(ppzVar);
        boolean p = p(pktVar, ppzVar);
        boolean o = o(pktVar, ppzVar, q);
        if (b != -1) {
            this.i.g(b);
        }
        if (b != -1) {
            this.i.e(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = j4 != -9223372036854775807L ? j4 : this.i.d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, (-1) + j6);
        }
        return new pjg(ppzVar, j5, j2, j4, j6, q, p, o);
    }

    private static ppz n(pkt pktVar, Object obj, long j, long j2, pkr pkrVar) {
        pktVar.f(obj, pkrVar);
        asm asmVar = pkrVar.g;
        return new ppz(obj, j2, pkrVar.b(j));
    }

    private final boolean o(pkt pktVar, ppz ppzVar, boolean z) {
        int b = pktVar.b(ppzVar.a);
        return !pktVar.y(pktVar.x(b, this.i).c, this.j).i && pktVar.u(b, this.i, this.j, this.b, this.c) == -1 && z;
    }

    private final boolean p(pkt pktVar, ppz ppzVar) {
        if (!q(ppzVar)) {
            return false;
        }
        return pktVar.y(pktVar.f(ppzVar.a, this.i).c, this.j).p == pktVar.b(ppzVar.a);
    }

    private static final boolean q(ppz ppzVar) {
        return !ppzVar.a() && ppzVar.e == -1;
    }

    private final void r(pkt pktVar, Object obj, int i) {
        pktVar.f(obj, this.i);
        this.i.e(i);
        long j = this.i.g.a(i).f;
    }

    public final pjf a() {
        pjf pjfVar = this.d;
        if (pjfVar == null) {
            return null;
        }
        if (pjfVar == this.e) {
            this.e = pjfVar.h;
        }
        pjfVar.h();
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            this.f = null;
            pjf pjfVar2 = this.d;
            this.h = pjfVar2.b;
            this.m = pjfVar2.f.i.d;
        }
        this.d = this.d.h;
        e();
        return this.d;
    }

    public final pjg b(pkt pktVar, pjf pjfVar, long j) {
        long j2;
        pjg pjgVar = pjfVar.f;
        long j3 = (pjfVar.k + pjgVar.d) - j;
        if (pjgVar.f) {
            long j4 = 0;
            int u = pktVar.u(pktVar.b(pjgVar.i.a), this.i, this.j, this.b, this.c);
            if (u == -1) {
                return null;
            }
            int i = pktVar.e(u, this.i, true).c;
            Object obj = this.i.b;
            long j5 = pjgVar.i.d;
            if (pktVar.y(i, this.j).o == u) {
                Pair w = pktVar.w(this.j, this.i, i, -9223372036854775807L, Math.max(0L, j3));
                if (w == null) {
                    return null;
                }
                obj = w.first;
                long longValue = ((Long) w.second).longValue();
                pjf pjfVar2 = pjfVar.h;
                if (pjfVar2 != null && pjfVar2.b.equals(obj)) {
                    j5 = pjfVar2.f.i.d;
                } else {
                    j5 = this.l;
                    this.l = 1 + j5;
                }
                j2 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return j(pktVar, n(pktVar, obj, j2, j5, this.i), j4, j2);
        }
        ppz ppzVar = pjgVar.i;
        pktVar.f(ppzVar.a, this.i);
        if (ppzVar.a()) {
            int i2 = ppzVar.b;
            if (this.i.a(i2) == -1) {
                return null;
            }
            int b = this.i.g.a(i2).b(ppzVar.c);
            if (b < 0) {
                return l(pktVar, ppzVar.a, i2, b, pjgVar.b, ppzVar.d);
            }
            long j6 = pjgVar.b;
            if (j6 == -9223372036854775807L) {
                pks pksVar = this.j;
                pkr pkrVar = this.i;
                Pair w2 = pktVar.w(pksVar, pkrVar, pkrVar.c, -9223372036854775807L, Math.max(0L, j3));
                if (w2 == null) {
                    return null;
                }
                j6 = ((Long) w2.second).longValue();
            }
            r(pktVar, ppzVar.a, ppzVar.b);
            return m(pktVar, ppzVar.a, Math.max(0L, j6), pjgVar.b, ppzVar.d);
        }
        int c = this.i.c(ppzVar.e);
        if (c == this.i.a(ppzVar.e)) {
            r(pktVar, ppzVar.a, ppzVar.e);
            return m(pktVar, ppzVar.a, 0L, pjgVar.d, ppzVar.d);
        }
        return l(pktVar, ppzVar.a, ppzVar.e, c, pjgVar.d, ppzVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pjg c(defpackage.pkt r14, defpackage.pjg r15) {
        /*
            r13 = this;
            ppz r1 = r15.i
            boolean r10 = q(r1)
            boolean r11 = r13.p(r14, r1)
            boolean r12 = r13.o(r14, r1, r10)
            ppz r0 = r15.i
            java.lang.Object r0 = r0.a
            pkr r2 = r13.i
            r14.f(r0, r2)
            boolean r14 = r1.a()
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L31
            int r14 = r1.e
            if (r14 != r0) goto L28
            goto L31
        L28:
            pkr r4 = r13.i
            r4.e(r14)
            r4 = 0
            r6 = r4
            goto L32
        L31:
            r6 = r2
        L32:
            boolean r14 = r1.a()
            if (r14 == 0) goto L44
            pkr r14 = r13.i
            int r2 = r1.b
            int r3 = r1.c
            long r2 = r14.d(r2, r3)
        L42:
            r8 = r2
            goto L4f
        L44:
            int r14 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r14 == 0) goto L4a
            r8 = r6
            goto L4f
        L4a:
            pkr r14 = r13.i
            long r2 = r14.d
            goto L42
        L4f:
            boolean r14 = r1.a()
            if (r14 == 0) goto L5d
            pkr r14 = r13.i
            int r0 = r1.b
            r14.g(r0)
            goto L66
        L5d:
            int r14 = r1.e
            if (r14 == r0) goto L66
            pkr r0 = r13.i
            r0.g(r14)
        L66:
            pjg r14 = new pjg
            long r2 = r15.a
            long r4 = r15.b
            r0 = r14
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pji.c(pkt, pjg):pjg");
    }

    public final void d() {
        if (this.g == 0) {
            return;
        }
        pjf pjfVar = this.d;
        ptx.b(pjfVar);
        this.h = pjfVar.b;
        this.m = pjfVar.f.i.d;
        while (pjfVar != null) {
            pjfVar.h();
            pjfVar = pjfVar.h;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
        e();
    }

    public final void e() {
        if (this.a != null) {
            final amuf f = amuk.f();
            for (pjf pjfVar = this.d; pjfVar != null; pjfVar = pjfVar.h) {
                f.h(pjfVar.f.i);
            }
            pjf pjfVar2 = this.e;
            final ppz ppzVar = pjfVar2 == null ? null : pjfVar2.f.i;
            this.k.post(new Runnable() { // from class: pjh
                @Override // java.lang.Runnable
                public final void run() {
                    pji pjiVar = pji.this;
                    amuf amufVar = f;
                    ppz ppzVar2 = ppzVar;
                    auy auyVar = pjiVar.a;
                    amuk g = amufVar.g();
                    aux auxVar = auyVar.b;
                    pjz pjzVar = auyVar.e;
                    ptx.a(pjzVar);
                    auxVar.b = amuk.o(g);
                    if (!g.isEmpty()) {
                        auxVar.d = (ppz) g.get(0);
                        ptx.a(ppzVar2);
                        auxVar.e = ppzVar2;
                    }
                    if (auxVar.c == null) {
                        auxVar.c = aux.c(pjzVar, auxVar.b, auxVar.d, auxVar.a);
                    }
                    auxVar.a(pjzVar.s());
                }
            });
        }
    }

    public final void f(long j) {
        pjf pjfVar = this.f;
        if (pjfVar != null) {
            ptx.e(pjfVar.l());
            if (!pjfVar.d) {
                return;
            }
            pjfVar.a.m(pjfVar.e(j));
        }
    }

    public final boolean g(ppy ppyVar) {
        pjf pjfVar = this.f;
        return pjfVar != null && pjfVar.a == ppyVar;
    }

    public final boolean h(pjf pjfVar) {
        boolean z = false;
        ptx.e(pjfVar != null);
        if (pjfVar.equals(this.f)) {
            return false;
        }
        this.f = pjfVar;
        while (true) {
            pjfVar = pjfVar.h;
            if (pjfVar != null) {
                if (pjfVar == this.e) {
                    this.e = this.d;
                    z = true;
                }
                pjfVar.h();
                this.g--;
            } else {
                this.f.i(null);
                e();
                return z;
            }
        }
    }

    public final boolean i(pkt pktVar) {
        pjf pjfVar;
        pjf pjfVar2 = this.d;
        if (pjfVar2 == null) {
            return true;
        }
        int b = pktVar.b(pjfVar2.b);
        while (true) {
            b = pktVar.u(b, this.i, this.j, this.b, this.c);
            while (true) {
                pjfVar = pjfVar2.h;
                if (pjfVar == null || pjfVar2.f.f) {
                    break;
                }
                pjfVar2 = pjfVar;
            }
            if (b == -1 || pjfVar == null || pktVar.b(pjfVar.b) != b) {
                break;
            }
            pjfVar2 = pjfVar;
        }
        boolean h = h(pjfVar2);
        pjfVar2.f = c(pktVar, pjfVar2.f);
        return !h;
    }

    public final pjg j(pkt pktVar, ppz ppzVar, long j, long j2) {
        pktVar.f(ppzVar.a, this.i);
        if (ppzVar.a()) {
            return l(pktVar, ppzVar.a, ppzVar.b, ppzVar.c, j, ppzVar.d);
        }
        return m(pktVar, ppzVar.a, j2, j, ppzVar.d);
    }

    public final ppz k(pkt pktVar, Object obj, long j) {
        long j2;
        int b;
        int i = pktVar.f(obj, this.i).c;
        Object obj2 = this.h;
        if (obj2 == null || (b = pktVar.b(obj2)) == -1 || pktVar.x(b, this.i).c != i) {
            pjf pjfVar = this.d;
            while (true) {
                if (pjfVar == null) {
                    pjf pjfVar2 = this.d;
                    while (true) {
                        if (pjfVar2 != null) {
                            int b2 = pktVar.b(pjfVar2.b);
                            if (b2 != -1 && pktVar.x(b2, this.i).c == i) {
                                j2 = pjfVar2.f.i.d;
                                break;
                            }
                            pjfVar2 = pjfVar2.h;
                        } else {
                            j2 = this.l;
                            this.l = 1 + j2;
                            if (this.d == null) {
                                this.h = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else if (pjfVar.b.equals(obj)) {
                    j2 = pjfVar.f.i.d;
                    break;
                } else {
                    pjfVar = pjfVar.h;
                }
            }
        } else {
            j2 = this.m;
        }
        return n(pktVar, obj, j, j2, this.i);
    }
}
