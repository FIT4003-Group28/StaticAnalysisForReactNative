package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awtn  reason: default package */
/* loaded from: classes3.dex */
public abstract class awtn {
    public static awtm l(akqq akqqVar, long j) {
        awtk awtkVar = new awtk();
        awtkVar.h(akqqVar);
        awtkVar.i(TimeUnit.MILLISECONDS.toMicros(j));
        awtkVar.b(j);
        awtkVar.c(j);
        awtkVar.g(dcdc.e());
        awtkVar.j(2);
        awtkVar.d(false);
        return awtkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.awtm m(defpackage.awtr r6) {
        /*
            awtk r0 = new awtk
            r0.<init>()
            dpum r1 = r6.b
            if (r1 != 0) goto Lb
            dpum r1 = defpackage.dpum.d
        Lb:
            akqq r1 = defpackage.akqq.f(r1)
            r0.h(r1)
            long r1 = r6.e
            r0.b(r1)
            long r1 = r6.f
            r0.c(r1)
            boolean r1 = r6.k
            r0.d(r1)
            int r1 = r6.a
            r2 = r1 & 32
            if (r2 == 0) goto L2b
            java.lang.String r2 = r6.g
            r0.a = r2
        L2b:
            r1 = r1 & 64
            if (r1 == 0) goto L33
            java.lang.String r1 = r6.h
            r0.b = r1
        L33:
            dccx r1 = defpackage.dcdc.F()
            dsrj<awtq> r2 = r6.i
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            awtq r3 = (defpackage.awtq) r3
            java.lang.String r3 = r3.b
            r1.g(r3)
            goto L3d
        L4f:
            dcdc r1 = r1.f()
            r0.g(r1)
            int r1 = r6.j
            int r1 = defpackage.dpzl.a(r1)
            if (r1 != 0) goto L5f
            goto L70
        L5f:
            r2 = 1
            if (r1 == r2) goto L70
            int r1 = r6.j
            int r1 = defpackage.dpzl.a(r1)
            if (r1 != 0) goto L6b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            r0.j(r2)
            goto L74
        L70:
            r1 = 2
            r0.j(r1)
        L74:
            long r1 = r6.d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L88
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r6.c
            long r1 = r1.toMicros(r2)
            r0.i(r1)
            goto L8b
        L88:
            r0.i(r1)
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awtn.m(awtr):awtm");
    }

    public abstract long a();

    public abstract long b();

    public abstract akqq c();

    public abstract long d();

    @dzsi
    public abstract String e();

    @dzsi
    public abstract String f();

    public abstract dcdc<String> g();

    public abstract boolean h();

    public abstract awtm i();

    public abstract int j();

    public final long k() {
        return TimeUnit.MICROSECONDS.toMillis(a());
    }

    public final awtr n() {
        awto bZ = awtr.l.bZ();
        dpum h = c().h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar = (awtr) bZ.b;
        h.getClass();
        awtrVar.b = h;
        awtrVar.a |= 1;
        long k = k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar2 = (awtr) bZ.b;
        awtrVar2.a |= 2;
        awtrVar2.c = k;
        long a = a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar3 = (awtr) bZ.b;
        awtrVar3.a |= 4;
        awtrVar3.d = a;
        long d = d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar4 = (awtr) bZ.b;
        awtrVar4.a |= 8;
        awtrVar4.e = d;
        long b = b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar5 = (awtr) bZ.b;
        awtrVar5.a |= 16;
        awtrVar5.f = b;
        int j = j();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awtr awtrVar6 = (awtr) bZ.b;
        int i = j - 1;
        if (j != 0) {
            awtrVar6.j = i;
            awtrVar6.a |= 128;
            boolean h2 = h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            awtr awtrVar7 = (awtr) bZ.b;
            awtrVar7.a |= 256;
            awtrVar7.k = h2;
            if (!dbsj.d(e())) {
                String e = e();
                dbsk.s(e);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                awtr awtrVar8 = (awtr) bZ.b;
                e.getClass();
                awtrVar8.a |= 32;
                awtrVar8.g = e;
            }
            if (!dbsj.d(f())) {
                String f = f();
                dbsk.s(f);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                awtr awtrVar9 = (awtr) bZ.b;
                f.getClass();
                awtrVar9.a |= 64;
                awtrVar9.h = f;
            }
            dcdc<String> g = g();
            int size = g.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = g.get(i2);
                awtp bZ2 = awtq.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                awtq awtqVar = (awtq) bZ2.b;
                str.getClass();
                awtqVar.a |= 1;
                awtqVar.b = str;
                awtq bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                awtr awtrVar10 = (awtr) bZ.b;
                bK.getClass();
                dsrj<awtq> dsrjVar = awtrVar10.i;
                if (!dsrjVar.a()) {
                    awtrVar10.i = dsqw.cl(dsrjVar);
                }
                awtrVar10.i.add(bK);
            }
            return bZ.bK();
        }
        throw null;
    }

    public final boolean o() {
        return b() > k();
    }

    public final boolean p() {
        return j() == 5 || j() == 6 || j() == 7;
    }

    public final String q() {
        akqq c = c();
        return String.format(Locale.US, "%.6f,%.6f", Double.valueOf(c.a), Double.valueOf(c.b));
    }
}
