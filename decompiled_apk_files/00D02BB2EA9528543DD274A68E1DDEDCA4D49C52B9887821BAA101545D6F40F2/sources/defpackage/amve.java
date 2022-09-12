package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amve  reason: default package */
/* loaded from: classes2.dex */
public class amve {
    public final dpie a;
    public final amtr[] b;
    public final boolean c;

    public amve(dpie dpieVar) {
        this(dpieVar, false);
    }

    public final boolean A(int i) {
        for (dpik dpikVar : y()) {
            int a = dpii.a(dpikVar.a);
            if (a != 0 && a == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(int i, int i2) {
        int a;
        for (dpik dpikVar : y()) {
            int a2 = dpii.a(dpikVar.a);
            if (a2 != 0 && a2 == 2 && (a = dpig.a(dpikVar.b)) != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        String[] strArr = new String[this.b.length];
        int i = 0;
        while (true) {
            amtr[] amtrVarArr = this.b;
            if (i < amtrVarArr.length) {
                amtr amtrVar = amtrVarArr[i];
                dbsb b = dbsc.b(amtrVar);
                b.f("#stepGroups", amtrVar.e());
                int i2 = 0;
                for (int i3 = 0; i3 < amtrVar.a.c.size(); i3++) {
                    i2 += amtrVar.a.c.get(i3).d.size();
                }
                b.f("#steps", i2);
                strArr[i] = b.toString();
                i++;
            } else {
                dbsb b2 = dbsc.b(this);
                b2.h("isOfflineRoute", this.c);
                b2.b("paths", strArr);
                return b2.toString();
            }
        }
    }

    public final dpec b() {
        dpec dpecVar = this.a.d;
        return dpecVar == null ? dpec.o : dpecVar;
    }

    public final boolean c() {
        return (this.a.a & 8) != 0;
    }

    public final amtr d(int i) {
        return this.b[i];
    }

    public final int e() {
        return this.b.length;
    }

    public final dpeq f() {
        dpeq dpeqVar = this.a.f;
        return dpeqVar == null ? dpeq.m : dpeqVar;
    }

    public final int g() {
        return this.a.l.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h() {
        return this.a.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return (this.a.a & 128) != 0;
    }

    public final boolean j() {
        return (this.a.a & 1) != 0;
    }

    public final String k() {
        return this.a.b;
    }

    public final boolean l() {
        return (this.a.a & 2) != 0;
    }

    public final String m() {
        return this.a.c;
    }

    public final dgas n() {
        dgas dgasVar = this.a.j;
        return dgasVar == null ? dgas.e : dgasVar;
    }

    public final dpht o() {
        dpht b = dpht.b(this.a.m);
        return b == null ? dpht.AVAILABLE : b;
    }

    public final boolean p() {
        return (this.a.a & 4096) != 0;
    }

    public final dozz q() {
        dozz dozzVar = this.a.o;
        return dozzVar == null ? dozz.y : dozzVar;
    }

    public final boolean r() {
        return (this.a.a & 16384) != 0;
    }

    public final doxf s() {
        doxf doxfVar = this.a.p;
        return doxfVar == null ? doxf.k : doxfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r8.b > r5.intValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r8.b < r4.intValue()) goto L32;
     */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amtf t() {
        /*
            r10 = this;
            r0 = 1
            amve[] r0 = new defpackage.amve[r0]
            r1 = 0
            r0[r1] = r10
            r2 = 0
            r4 = r2
            r5 = r4
            r3 = 0
        La:
            if (r1 > 0) goto L77
            r6 = r0[r1]
            boolean r7 = r6.r()
            if (r7 == 0) goto L74
            doxf r7 = r6.s()
            boolean r7 = defpackage.amtg.a(r7)
            if (r7 == 0) goto L74
            doxf r7 = r6.s()
            if (r5 == 0) goto L32
            dowb r8 = r7.e
            if (r8 != 0) goto L2a
            dowb r8 = defpackage.dowb.d
        L2a:
            int r8 = r8.b
            int r9 = r5.intValue()
            if (r8 <= r9) goto L3e
        L32:
            dowb r5 = r7.e
            if (r5 != 0) goto L38
            dowb r5 = defpackage.dowb.d
        L38:
            int r5 = r5.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L3e:
            if (r4 == 0) goto L4e
            dowb r8 = r7.d
            if (r8 != 0) goto L46
            dowb r8 = defpackage.dowb.d
        L46:
            int r8 = r8.b
            int r9 = r4.intValue()
            if (r8 >= r9) goto L5a
        L4e:
            dowb r4 = r7.d
            if (r4 != 0) goto L54
            dowb r4 = defpackage.dowb.d
        L54:
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L5a:
            dpec r7 = r6.b()
            dowb r7 = r7.d
            if (r7 != 0) goto L64
            dowb r7 = defpackage.dowb.d
        L64:
            int r7 = r7.b
            if (r7 <= r3) goto L74
            dpec r3 = r6.b()
            dowb r3 = r3.d
            if (r3 != 0) goto L72
            dowb r3 = defpackage.dowb.d
        L72:
            int r3 = r3.b
        L74:
            int r1 = r1 + 1
            goto La
        L77:
            if (r4 == 0) goto L89
            if (r5 == 0) goto L89
            amtf r0 = new amtf
            int r1 = r4.intValue()
            int r2 = r5.intValue()
            r0.<init>(r1, r2, r3)
            return r0
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amve.t():amtf");
    }

    public final doxl u() {
        doxl doxlVar = this.a.B;
        return doxlVar == null ? doxl.b : doxlVar;
    }

    public final boolean v() {
        return (this.a.a & 8388608) != 0;
    }

    public final dpid w() {
        dpid dpidVar = this.a.w;
        return dpidVar == null ? dpid.h : dpidVar;
    }

    public final dspd x() {
        return this.a.u;
    }

    public final List<dpik> y() {
        return this.a.y;
    }

    @dzsi
    public final String z() {
        dpie dpieVar = this.a;
        if ((dpieVar.a & 134217728) != 0) {
            return dpieVar.A;
        }
        return null;
    }

    public amve(dpie dpieVar, boolean z) {
        this.a = dpieVar;
        this.c = z;
        this.b = new amtr[dpieVar.e.size()];
        int i = 0;
        while (true) {
            amtr[] amtrVarArr = this.b;
            if (i < amtrVarArr.length) {
                amtrVarArr[i] = new amtr(dpieVar.e.get(i));
                i++;
            } else {
                return;
            }
        }
    }
}
