package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: pig  reason: default package */
/* loaded from: classes4.dex */
public final class pig extends phi implements pht {
    private final phu A;
    private prl B;
    final pvo b;
    final pju c;
    public final pwa d;
    public final pip e;
    public final pwh f;
    public final pkr g;
    public final List h;
    public final auy i;
    public final Looper j;
    public final awx k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public pkh q;
    public boolean r;
    public pju s;
    public pje t;
    public pjs u;
    public int v;
    public long w;
    private final pvn x;
    private final CopyOnWriteArraySet y;
    private final boolean z;

    public pig(pkd[] pkdVarArr, pvn pvnVar, piv pivVar, awx awxVar, final auy auyVar, pkh pkhVar, phl phlVar, long j, pvq pvqVar, Looper looper, pjz pjzVar, pju pjuVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = pxi.e;
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        int length = pkdVarArr.length;
        boolean z = true;
        ptx.e(length > 0);
        pkd[] pkdVarArr2 = (pkd[]) ptx.a(pkdVarArr);
        ptx.a(pvnVar);
        this.x = pvnVar;
        this.k = awxVar;
        this.i = auyVar;
        this.z = true;
        this.q = pkhVar;
        this.r = false;
        this.j = looper;
        this.l = 0;
        this.f = new pwh(looper, pvqVar, new phz());
        this.y = new CopyOnWriteArraySet();
        this.h = new ArrayList();
        this.B = new prl();
        pvo pvoVar = new pvo(new pkf[length], new pvf[length], null);
        this.b = pvoVar;
        this.g = new pkr();
        pvy pvyVar = new pvy();
        pku.f(new int[]{1, 2, 12, 13, 14, 15, 16, 17, 18, 19}, pvyVar);
        pku.e(pjuVar, pvyVar);
        pju d = pku.d(pvyVar);
        this.c = d;
        pvy pvyVar2 = new pvy();
        pku.e(d, pvyVar2);
        pvyVar2.b(3);
        pvyVar2.b(9);
        this.s = pku.d(pvyVar2);
        this.t = pje.a;
        this.v = -1;
        this.d = pvqVar.a(looper, null);
        phu phuVar = new phu(this);
        this.A = phuVar;
        this.u = pjs.g(pvoVar);
        if (auyVar != null) {
            if (auyVar.e != null && !auyVar.b.b.isEmpty()) {
                z = false;
            }
            ptx.e(z);
            auyVar.e = pjzVar;
            auyVar.f = auyVar.a.a(looper, null);
            pwh pwhVar = auyVar.d;
            auyVar.d = new pwh(pwhVar.d, looper, pwhVar.a, new pwf() { // from class: auv
                @Override // defpackage.pwf
                public final void a(Object obj, pvz pvzVar) {
                    ava avaVar = (ava) obj;
                    SparseArray sparseArray = auy.this.c;
                    SparseArray sparseArray2 = new SparseArray(pvzVar.b());
                    for (int i = 0; i < pvzVar.b(); i++) {
                        int a = pvzVar.a(i);
                        auz auzVar = (auz) sparseArray.get(a);
                        ptx.a(auzVar);
                        sparseArray2.append(a, auzVar);
                    }
                    avaVar.O();
                }
            });
            u(auyVar);
            ((axh) awxVar).h.a(new Handler(looper), auyVar);
        }
        this.e = new pip(pkdVarArr, pvnVar, pvoVar, pivVar, awxVar, this.l, auyVar, pkhVar, phlVar, j, looper, pvqVar, phuVar);
    }

    public static boolean E(pjs pjsVar) {
        return pjsVar.d == 3 && pjsVar.j && pjsVar.k == 0;
    }

    private final int K() {
        if (this.u.a.z()) {
            return this.v;
        }
        pjs pjsVar = this.u;
        return pjsVar.a.f(pjsVar.s.a, this.g).c;
    }

    private final long L(pjs pjsVar) {
        if (pjsVar.a.z()) {
            return phk.c(this.w);
        }
        if (pjsVar.s.a()) {
            return pjsVar.q;
        }
        return G(pjsVar.a, pjsVar.s, pjsVar.q);
    }

    private static long M(pjs pjsVar) {
        pks pksVar = new pks();
        pkr pkrVar = new pkr();
        pjsVar.a.f(pjsVar.s.a, pkrVar);
        long j = pjsVar.b;
        return j == -9223372036854775807L ? pjsVar.a.y(pkrVar.c, pksVar).m : pkrVar.e + j;
    }

    private final Pair N(pkt pktVar, int i, long j) {
        if (pktVar.z()) {
            this.v = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.w = j;
            return null;
        }
        if (i == -1 || i >= pktVar.q()) {
            i = pktVar.a(false);
            j = pktVar.y(i, this.a).a();
        }
        return pktVar.v(this.a, this.g, i, phk.c(j));
    }

    private final pjs O(pjs pjsVar, pkt pktVar, Pair pair) {
        ppz ppzVar;
        pvo pvoVar;
        pjs i;
        ptx.c(pktVar.z() || pair != null);
        pkt pktVar2 = pjsVar.a;
        pjs f = pjsVar.f(pktVar);
        if (pktVar.z()) {
            ppz ppzVar2 = pjs.r;
            long c = phk.c(this.w);
            pjs h = f.i(ppzVar2, c, c, c, 0L, TrackGroupArray.a, this.b, amuk.q()).h(ppzVar2);
            h.o = h.q;
            return h;
        }
        Object obj = f.s.a;
        int i2 = pxi.a;
        boolean z = !obj.equals(pair.first);
        ppz ppzVar3 = z ? new ppz(pair.first) : f.s;
        long longValue = ((Long) pair.second).longValue();
        long c2 = phk.c(p());
        if (!pktVar2.z()) {
            c2 -= pktVar2.f(obj, this.g).e;
        }
        if (z || longValue < c2) {
            ptx.e(!ppzVar3.a());
            TrackGroupArray trackGroupArray = z ? TrackGroupArray.a : f.g;
            if (z) {
                ppzVar = ppzVar3;
                pvoVar = this.b;
            } else {
                ppzVar = ppzVar3;
                pvoVar = f.h;
            }
            pjs h2 = f.i(ppzVar, longValue, longValue, longValue, 0L, trackGroupArray, pvoVar, z ? amuk.q() : f.i).h(ppzVar);
            h2.o = longValue;
            return h2;
        }
        if (longValue == c2) {
            int b = pktVar.b(f.t.a);
            if (b != -1 && pktVar.x(b, this.g).c == pktVar.f(ppzVar3.a, this.g).c) {
                return f;
            }
            pktVar.f(ppzVar3.a, this.g);
            long d = ppzVar3.a() ? this.g.d(ppzVar3.b, ppzVar3.c) : this.g.d;
            i = f.i(ppzVar3, f.q, f.q, f.c, d - f.q, f.g, f.h, f.i).h(ppzVar3);
            i.o = d;
        } else {
            ptx.e(!ppzVar3.a());
            long max = Math.max(0L, f.p - (longValue - c2));
            long j = f.o;
            if (f.t.equals(f.s)) {
                j = longValue + max;
            }
            i = f.i(ppzVar3, longValue, longValue, longValue, max, f.g, f.h, f.i);
            i.o = j;
        }
        return i;
    }

    @Override // defpackage.pjz
    public final void A(pjt pjtVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r1.y(l(), r7.a).i != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pig.B():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(final defpackage.pjs r38, int r39, int r40, boolean r41, boolean r42, final int r43, long r44, int r46) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pig.C(pjs, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // defpackage.pjz
    public final boolean D() {
        return this.u.j;
    }

    @Override // defpackage.pjz
    public final boolean F() {
        return this.u.s.a();
    }

    public final long G(pkt pktVar, ppz ppzVar, long j) {
        pktVar.f(ppzVar.a, this.g);
        return j + this.g.e;
    }

    @Override // defpackage.pjz
    public final void H() {
    }

    @Override // defpackage.pjz
    public final void I() {
        throw null;
    }

    public final void J(phr phrVar) {
        pjs pjsVar = this.u;
        pjs h = pjsVar.h(pjsVar.s);
        h.o = h.q;
        h.p = 0L;
        pjs e = h.e(1);
        if (phrVar != null) {
            e = e.c(phrVar);
        }
        pjs pjsVar2 = e;
        this.m++;
        this.e.a.a(6).b();
        C(pjsVar2, 0, 1, false, pjsVar2.a.z() && !this.u.a.z(), 4, L(pjsVar2), -1);
    }

    @Override // defpackage.pht
    public final Looper c() {
        throw null;
    }

    @Override // defpackage.pht
    public final pkc d(pkb pkbVar) {
        pip pipVar = this.e;
        pkt pktVar = this.u.a;
        l();
        return new pkc(pipVar, pkbVar, this.e.b);
    }

    @Override // defpackage.pht
    public final void e(boolean z) {
        throw null;
    }

    @Override // defpackage.pht
    public final void f(pqb pqbVar) {
        throw null;
    }

    @Override // defpackage.pht
    public final void h(boolean z) {
        throw null;
    }

    @Override // defpackage.pht
    public final void i(pkh pkhVar) {
        throw null;
    }

    @Override // defpackage.pjz
    public final int j() {
        throw null;
    }

    @Override // defpackage.pjz
    public final int k() {
        throw null;
    }

    @Override // defpackage.pjz
    public final int l() {
        int K = K();
        if (K == -1) {
            return 0;
        }
        return K;
    }

    @Override // defpackage.pjz
    public final int m() {
        return this.u.d;
    }

    @Override // defpackage.pjz
    public final int n() {
        return this.u.k;
    }

    @Override // defpackage.pjz
    public final int o() {
        return this.l;
    }

    public final long p() {
        if (F()) {
            pjs pjsVar = this.u;
            pjsVar.a.f(pjsVar.s.a, this.g);
            pjs pjsVar2 = this.u;
            if (pjsVar2.b == -9223372036854775807L) {
                return pjsVar2.a.y(l(), this.a).a();
            }
            return phk.d(this.g.e) + phk.d(this.u.b);
        }
        return q();
    }

    @Override // defpackage.pjz
    public final long q() {
        return phk.d(L(this.u));
    }

    public final long r() {
        if (!F()) {
            pkt s = s();
            if (!s.z()) {
                return s.y(l(), this.a).b();
            }
            return -9223372036854775807L;
        }
        pjs pjsVar = this.u;
        ppz ppzVar = pjsVar.s;
        pjsVar.a.f(ppzVar.a, this.g);
        return phk.d(this.g.d(ppzVar.b, ppzVar.c));
    }

    @Override // defpackage.pjz
    public final pkt s() {
        return this.u.a;
    }

    public final void t(phs phsVar) {
        this.y.add(phsVar);
    }

    public final void u(pjv pjvVar) {
        this.f.a(pjvVar);
    }

    @Override // defpackage.pjz
    public final void v() {
        throw null;
    }

    @Override // defpackage.pjz
    public final void w() {
        throw null;
    }

    @Override // defpackage.pjz
    public final void x(int i, long j) {
        pkt pktVar = this.u.a;
        if (i >= 0 && (pktVar.z() || i < pktVar.q())) {
            int i2 = 1;
            this.m++;
            if (F()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                pin pinVar = new pin(this.u);
                pinVar.a(1);
                this.A.a(pinVar);
                return;
            }
            if (m() != 1) {
                i2 = 2;
            }
            int l = l();
            pjs O = O(this.u.e(i2), pktVar, N(pktVar, i, j));
            this.e.a.b(3, new pio(pktVar, i, phk.c(j))).b();
            C(O, 0, 1, true, true, 1, L(O), l);
            return;
        }
        throw new piu();
    }

    public final void y(List list, int i, long j, boolean z) {
        long j2;
        int i2 = i;
        int K = K();
        long q = q();
        boolean z2 = true;
        this.m++;
        if (!this.h.isEmpty()) {
            int size = this.h.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                this.h.remove(i3);
            }
            prl prlVar = this.B;
            int[] iArr = new int[prlVar.b.length - size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = prlVar.b;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i4];
                if (i6 < 0 || i6 >= size) {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= size;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
            this.B = new prl(iArr, new Random(prlVar.a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            pjn pjnVar = new pjn((pqb) list.get(i8), this.z);
            arrayList.add(pjnVar);
            this.h.add(i8, new pif(pjnVar.b, pjnVar.a.d));
        }
        this.B = this.B.b(arrayList.size());
        phc phcVar = new phc(this.h, this.B);
        if (phcVar.z() || i2 < phcVar.a) {
            if (z) {
                i2 = phcVar.a(false);
                j2 = -9223372036854775807L;
            } else if (i2 == -1) {
                i2 = K;
                j2 = q;
            } else {
                j2 = j;
            }
            pjs O = O(this.u, phcVar, N(phcVar, i2, j2));
            int i9 = O.d;
            if (i2 != -1 && i9 != 1) {
                i9 = (phcVar.z() || i2 >= phcVar.a) ? 4 : 2;
            }
            pjs e = O.e(i9);
            this.e.a.b(17, new pik(arrayList, this.B, i2, phk.c(j2))).b();
            if (this.u.s.a.equals(e.s.a) || this.u.a.z()) {
                z2 = false;
            }
            C(e, 0, 1, false, z2, 4, L(e), -1);
            return;
        }
        throw new piu();
    }

    @Override // defpackage.pjz
    public final void z(boolean z) {
        throw null;
    }
}
