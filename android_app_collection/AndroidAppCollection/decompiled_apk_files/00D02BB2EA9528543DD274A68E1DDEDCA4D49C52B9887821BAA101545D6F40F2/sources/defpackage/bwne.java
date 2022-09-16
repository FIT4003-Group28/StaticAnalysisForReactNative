package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: bwne  reason: default package */
/* loaded from: classes4.dex */
public final class bwne implements Serializable {
    @dzsi
    private bvrt<bwns> d;
    private final ArrayDeque<bvrt<bwns>> a = new ArrayDeque<>();
    private final ArrayDeque<bvrt<bwns>> b = new ArrayDeque<>();
    private final ArrayDeque<bvrt<bwns>> c = new ArrayDeque<>();
    private boolean e = false;

    private final synchronized void m(dtkx dtkxVar, long j) {
        if (this.e) {
            this.a.addFirst(bvrt.b(s(dtkxVar, j)));
        }
    }

    private final synchronized void n(dtkx dtkxVar, long j) {
        if (this.e) {
            this.b.addFirst(bvrt.b(s(dtkxVar, j)));
        }
    }

    private final synchronized void o(dtkx dtkxVar, long j) {
        if (this.e) {
            this.c.addFirst(bvrt.b(s(dtkxVar, j)));
        }
    }

    @dzsi
    private static dtkx p(ilo iloVar, boolean z) {
        dtou bZ = dtov.o.bZ();
        String y = iloVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtov dtovVar = (dtov) bZ.b;
        y.getClass();
        dtovVar.a |= 1;
        dtovVar.b = y;
        String n = iloVar.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtov dtovVar2 = (dtov) bZ.b;
        n.getClass();
        int i = dtovVar2.a | 512;
        dtovVar2.a = i;
        dtovVar2.h = n;
        dtovVar2.a = i | 8;
        dtovVar2.e = true;
        boolean ba = iloVar.ba();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtov dtovVar3 = (dtov) bZ.b;
        dtovVar3.a |= ImageMetadata.LENS_APERTURE;
        dtovVar3.l = ba;
        boolean bb = iloVar.bb();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtov dtovVar4 = (dtov) bZ.b;
        int i2 = dtovVar4.a | ImageMetadata.SHADING_MODE;
        dtovVar4.a = i2;
        dtovVar4.m = bb;
        boolean z2 = iloVar.o;
        dtovVar4.a = i2 | 2097152;
        dtovVar4.n = z2;
        if (iloVar.aj() != null) {
            dgrn n2 = iloVar.aj().n();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtov dtovVar5 = (dtov) bZ.b;
            n2.getClass();
            dtovVar5.f = n2;
            dtovVar5.a |= 64;
        }
        int i3 = 4;
        if (iloVar.ai() != akqi.a) {
            dgrh h = iloVar.ai().h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtov dtovVar6 = (dtov) bZ.b;
            h.getClass();
            dtovVar6.d = h;
            dtovVar6.a |= 4;
        }
        dtha bZ2 = dthb.F.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dthb dthbVar = (dthb) bZ2.b;
        dtov bK = bZ.bK();
        bK.getClass();
        dthbVar.c = bK;
        dthbVar.a |= 1;
        dthb bK2 = bZ2.bK();
        if (z) {
            i3 = t(iloVar);
        }
        return oxc.a(iloVar.n(), iloVar.B(), i3, bK2);
    }

    @dzsi
    private static dtkx q(ilo iloVar, boolean z, boolean z2, int i) {
        dcdc dcdcVar;
        dpjq bZ = dpjx.n.bZ();
        String y = iloVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpjx dpjxVar = (dpjx) bZ.b;
        y.getClass();
        dpjxVar.a |= 1;
        dpjxVar.b = y;
        String q = iloVar.q();
        if (z2) {
            String valueOf = String.valueOf(q);
            String B = iloVar.B();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(B).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(B);
            q = sb.toString();
            String q2 = iloVar.q();
            String B2 = iloVar.B();
            dpce v = alcf.v(q2);
            alce y2 = alcf.y();
            y2.b(B2);
            y2.c(i);
            dcdcVar = dcdc.g(v, y2.a());
        } else {
            dcdcVar = null;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpjx dpjxVar2 = (dpjx) bZ.b;
        q.getClass();
        dpjxVar2.a |= 128;
        dpjxVar2.e = q;
        int i2 = 4;
        if (iloVar.aj() != null) {
            dnoh g = iloVar.aj().g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar3 = (dpjx) bZ.b;
            g.getClass();
            dpjxVar3.d = g;
            dpjxVar3.a |= 4;
        }
        if (iloVar.ai() != akqi.a) {
            String o = iloVar.ai().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar4 = (dpjx) bZ.b;
            o.getClass();
            dpjxVar4.a |= 2;
            dpjxVar4.c = o;
        }
        dtqv bZ2 = dtqw.h.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtqw dtqwVar = (dtqw) bZ2.b;
        dpjx bK = bZ.bK();
        bK.getClass();
        dtqwVar.b = bK;
        dtqwVar.a |= 1;
        if (dcdcVar != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtqw dtqwVar2 = (dtqw) bZ2.b;
            dsrj<dpce> dsrjVar = dtqwVar2.e;
            if (!dsrjVar.a()) {
                dtqwVar2.e = dsqw.cl(dsrjVar);
            }
            dsod.bv(dcdcVar, dtqwVar2.e);
        }
        dtha bZ3 = dthb.F.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dthb dthbVar = (dthb) bZ3.b;
        dtqw bK2 = bZ2.bK();
        bK2.getClass();
        dthbVar.r = bK2;
        dthbVar.a |= ImageMetadata.SHADING_MODE;
        dthb bK3 = bZ3.bK();
        if (z2) {
            return oxc.a(iloVar.q(), iloVar.B(), 13, bK3);
        }
        if (z) {
            i2 = t(iloVar);
        }
        return oxc.a(iloVar.n(), iloVar.B(), i2, bK3);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.dcdc<defpackage.bwns> r(java.util.Collection<defpackage.bvrt<defpackage.bwns>> r8, long r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwne.r(java.util.Collection, long):dcdc");
    }

    private static final bwns s(dtkx dtkxVar, long j) {
        bwnr bZ = bwns.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bwns bwnsVar = (bwns) bZ.b;
        dtkxVar.getClass();
        bwnsVar.b = dtkxVar;
        int i = bwnsVar.a | 1;
        bwnsVar.a = i;
        bwnsVar.a = i | 2;
        bwnsVar.c = j;
        return bZ.bK();
    }

    private static int t(ilo iloVar) {
        dndr bj = iloVar.bj();
        if (bj == null) {
            return !iloVar.bN() ? 4 : 5;
        }
        int ordinal = bj.ordinal();
        if (ordinal == 1) {
            return 7;
        }
        return ordinal != 2 ? 13 : 8;
    }

    /* renamed from: a */
    public final synchronized bwne clone() {
        bwne bwneVar;
        bwneVar = new bwne();
        bwneVar.a.addAll(this.a);
        bwneVar.b.addAll(this.b);
        bwneVar.c.addAll(this.c);
        bwneVar.d = this.d;
        bwneVar.e = this.e;
        return bwneVar;
    }

    public final synchronized void b() {
        this.e = true;
    }

    public final synchronized void c() {
        this.e = false;
        l();
    }

    public final synchronized void d(ilo iloVar, long j) {
        dtkx p = p(iloVar, true);
        if (p != null) {
            m(p, j);
        }
        dtkx q = q(iloVar, true, false, 0);
        if (q != null) {
            n(q, j);
        }
    }

    public final synchronized void e(String str, long j) {
        dtha bZ = dthb.F.bZ();
        dtou bZ2 = dtov.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtov dtovVar = (dtov) bZ2.b;
        str.getClass();
        int i = dtovVar.a | 1;
        dtovVar.a = i;
        dtovVar.b = str;
        str.getClass();
        dtovVar.a = i | 512;
        dtovVar.h = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dthb dthbVar = (dthb) bZ.b;
        dtov bK = bZ2.bK();
        bK.getClass();
        dthbVar.c = bK;
        dthbVar.a |= 1;
        dtkx a = oxc.a(str, null, 4, bZ.bK());
        if (a != null) {
            m(a, j);
        }
    }

    public final synchronized void f(ilo iloVar, long j) {
        dtkx p = p(iloVar, false);
        if (p != null) {
            o(p, j);
        }
    }

    public final synchronized void g(ilo iloVar, long j) {
        dtkx p = p(iloVar, false);
        if (p != null) {
            m(p, j);
        }
    }

    public final synchronized void h(ilo iloVar, long j, int i) {
        dtkx q = q(iloVar, false, true, i);
        this.d = q != null ? bvrt.b(s(q, j)) : null;
    }

    public final synchronized dcdc<bwns> i(long j) {
        return r(this.a, j);
    }

    public final synchronized dcdc<bwns> j(long j) {
        return r(this.b, j);
    }

    @dzsi
    public final synchronized dtkx k() {
        bvrt<bwns> bvrtVar = this.d;
        if (bvrtVar == null) {
            return null;
        }
        bwns e = bvrtVar.e((dssr) bwns.d.cu(7), bwns.d);
        if (System.currentTimeMillis() - e.c >= 300000) {
            return null;
        }
        dtkx dtkxVar = e.b;
        if (dtkxVar != null) {
            return dtkxVar;
        }
        return dtkx.e;
    }

    public final synchronized void l() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = null;
    }
}
