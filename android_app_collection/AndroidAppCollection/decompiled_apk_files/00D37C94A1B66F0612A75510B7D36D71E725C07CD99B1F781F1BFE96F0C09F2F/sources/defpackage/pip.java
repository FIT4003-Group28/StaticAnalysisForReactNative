package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: pip  reason: default package */
/* loaded from: classes4.dex */
public final class pip implements Handler.Callback, ppx, pvm, pjo, phn, pka {
    private boolean A;
    private boolean B;
    private int C;
    private boolean E;
    private boolean F;
    private int G;
    private pio H;
    private long I;

    /* renamed from: J  reason: collision with root package name */
    private int f256J;
    private boolean K;
    private phr L;
    private final phu M;
    private final phl N;
    public final pwa a;
    public final Looper b;
    public boolean c;
    public boolean d;
    private final pkd[] e;
    private final pke[] f;
    private final pvn g;
    private final pvo h;
    private final piv i;
    private final awx j;
    private final HandlerThread k;
    private final pks l;
    private final pkr m;
    private final long n;
    private final boolean o;
    private final pho p;
    private final ArrayList q;
    private final pvq r;
    private final pji s;
    private final pjp t;
    private final long u;
    private pkh v;
    private pjs w;
    private pin x;
    private boolean z;
    private boolean D = false;
    private boolean y = false;

    public pip(pkd[] pkdVarArr, pvn pvnVar, pvo pvoVar, piv pivVar, awx awxVar, int i, auy auyVar, pkh pkhVar, phl phlVar, long j, Looper looper, pvq pvqVar, phu phuVar) {
        this.M = phuVar;
        this.e = pkdVarArr;
        this.g = pvnVar;
        this.h = pvoVar;
        this.i = pivVar;
        this.j = awxVar;
        this.C = i;
        this.v = pkhVar;
        this.N = phlVar;
        this.u = j;
        this.r = pvqVar;
        this.n = pivVar.a();
        this.o = pivVar.h();
        this.w = pjs.g(pvoVar);
        this.x = new pin(this.w);
        this.f = new pke[pkdVarArr.length];
        for (int i2 = 0; i2 < pkdVarArr.length; i2++) {
            pkdVarArr[i2].al(i2);
            this.f[i2] = pkdVarArr[i2].Y();
        }
        this.p = new pho(this);
        this.q = new ArrayList();
        this.l = new pks();
        this.m = new pkr();
        pvnVar.c = this;
        pvnVar.d = awxVar;
        this.K = true;
        Handler handler = new Handler(looper);
        this.s = new pji(auyVar, handler);
        this.t = new pjp(this, auyVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.k = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.b = looper2;
        this.a = pvqVar.a(looper2, this);
    }

    private final void A(long j, long j2) {
        this.a.f();
        ((pxe) this.a).b.sendEmptyMessageAtTime(2, j + j2);
    }

    private final void B(boolean z) {
        ppz ppzVar = this.s.d.f.i;
        long S = S(ppzVar, this.w.q, true, false);
        if (S != this.w.q) {
            pjs pjsVar = this.w;
            this.w = T(ppzVar, S, pjsVar.b, pjsVar.c, z, 5);
        }
    }

    private final void C(boolean z, int i, boolean z2, int i2) {
        pvf[] pvfVarArr;
        this.x.a(z2 ? 1 : 0);
        pin pinVar = this.x;
        pinVar.a = true;
        pinVar.f = true;
        pinVar.g = i2;
        this.w = this.w.b(z, i);
        this.A = false;
        for (pjf pjfVar = this.s.d; pjfVar != null; pjfVar = pjfVar.h) {
            for (pvf pvfVar : pjfVar.j.c) {
            }
        }
        if (!P()) {
            G();
            J();
            return;
        }
        int i3 = this.w.d;
        if (i3 == 3) {
            E();
            this.a.g(2);
        } else if (i3 == 2) {
            this.a.g(2);
        }
    }

    private final void D(int i) {
        pjs pjsVar = this.w;
        if (pjsVar.d != i) {
            this.w = pjsVar.e(i);
        }
    }

    private final void E() {
        pkd[] pkdVarArr;
        this.A = false;
        pho phoVar = this.p;
        phoVar.f = true;
        phoVar.a.e();
        for (pkd pkdVar : this.e) {
            if (M(pkdVar)) {
                pkdVar.am();
            }
        }
    }

    private final void F(boolean z, boolean z2) {
        w(z || !this.E, false, true, false);
        this.x.a(z2 ? 1 : 0);
        this.i.f();
        D(1);
    }

    private final void G() {
        pkd[] pkdVarArr;
        this.p.d();
        for (pkd pkdVar : this.e) {
            if (M(pkdVar)) {
                W(pkdVar);
            }
        }
    }

    private final void H() {
        pjf pjfVar = this.s.f;
        boolean z = this.B || (pjfVar != null && pjfVar.a.p());
        pjs pjsVar = this.w;
        if (z != pjsVar.f) {
            this.w = new pjs(pjsVar.a, pjsVar.s, pjsVar.b, pjsVar.c, pjsVar.d, pjsVar.e, z, pjsVar.g, pjsVar.h, pjsVar.i, pjsVar.t, pjsVar.j, pjsVar.k, pjsVar.l, pjsVar.o, pjsVar.p, pjsVar.q, pjsVar.m, pjsVar.n);
        }
    }

    private final void I(TrackGroupArray trackGroupArray, pvo pvoVar) {
        this.i.g(this.e, trackGroupArray, pvoVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126 A[LOOP:1: B:51:0x0118->B:58:0x0126, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0117 -> B:51:0x0118). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J() {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.J():void");
    }

    private final synchronized void K(amqo amqoVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) amqoVar.get()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean L() {
        pjf pjfVar = this.s.f;
        return (pjfVar == null || pjfVar.c() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean M(pkd pkdVar) {
        return pkdVar.Q() != 0;
    }

    private final boolean N() {
        pjf pjfVar = this.s.d;
        long j = pjfVar.f.d;
        if (pjfVar.d) {
            return j == -9223372036854775807L || this.w.q < j || !P();
        }
        return false;
    }

    private static boolean O(pjs pjsVar, pkr pkrVar) {
        ppz ppzVar = pjsVar.s;
        pkt pktVar = pjsVar.a;
        return pktVar.z() || pktVar.f(ppzVar.a, pkrVar).f;
    }

    private final boolean P() {
        pjs pjsVar = this.w;
        return pjsVar.j && pjsVar.k == 0;
    }

    private static Format[] Q(pvf pvfVar) {
        int m = pvfVar != null ? pvfVar.m() : 0;
        Format[] formatArr = new Format[m];
        for (int i = 0; i < m; i++) {
            formatArr[i] = pvfVar.n(i);
        }
        return formatArr;
    }

    private final long R(ppz ppzVar, long j, boolean z) {
        pji pjiVar = this.s;
        return S(ppzVar, j, pjiVar.d != pjiVar.e, z);
    }

    private final long S(ppz ppzVar, long j, boolean z, boolean z2) {
        pji pjiVar;
        G();
        this.A = false;
        if (z2 || this.w.d == 3) {
            D(2);
        }
        pjf pjfVar = this.s.d;
        pjf pjfVar2 = pjfVar;
        while (pjfVar2 != null && !ppzVar.equals(pjfVar2.f.i)) {
            pjfVar2 = pjfVar2.h;
        }
        if (z || pjfVar != pjfVar2 || (pjfVar2 != null && pjfVar2.f(j) < 0)) {
            for (pkd pkdVar : this.e) {
                l(pkdVar);
            }
            if (pjfVar2 != null) {
                while (true) {
                    pjiVar = this.s;
                    if (pjiVar.d == pjfVar2) {
                        break;
                    }
                    pjiVar.a();
                }
                pjiVar.h(pjfVar2);
                pjfVar2.k = 0L;
                n();
            }
        }
        if (pjfVar2 != null) {
            this.s.h(pjfVar2);
            if (!pjfVar2.d) {
                pjfVar2.f = pjfVar2.f.b(j);
            } else {
                long j2 = pjfVar2.f.d;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (pjfVar2.e) {
                    long g = pjfVar2.a.g(j);
                    pjfVar2.a.j(g - this.n, this.o);
                    j = g;
                }
            }
            y(j);
            u();
        } else {
            this.s.d();
            y(j);
        }
        q(false);
        this.a.g(2);
        return j;
    }

    private final pjs T(ppz ppzVar, long j, long j2, long j3, boolean z, int i) {
        TrackGroupArray trackGroupArray;
        pvo pvoVar;
        amuk amukVar;
        TrackGroupArray trackGroupArray2;
        pvo pvoVar2;
        boolean z2 = false;
        this.K = this.K || j != this.w.q || !ppzVar.equals(this.w.s);
        x();
        pjs pjsVar = this.w;
        TrackGroupArray trackGroupArray3 = pjsVar.g;
        pvo pvoVar3 = pjsVar.h;
        List list = pjsVar.i;
        if (this.t.i) {
            pjf pjfVar = this.s.d;
            if (pjfVar == null) {
                trackGroupArray2 = TrackGroupArray.a;
            } else {
                trackGroupArray2 = pjfVar.i;
            }
            if (pjfVar == null) {
                pvoVar2 = this.h;
            } else {
                pvoVar2 = pjfVar.j;
            }
            pvf[] pvfVarArr = pvoVar2.c;
            amuf amufVar = new amuf();
            boolean z3 = false;
            for (pvf pvfVar : pvfVarArr) {
                if (pvfVar != null) {
                    Metadata metadata = pvfVar.n(0).j;
                    if (metadata == null) {
                        amufVar.h(new Metadata(new Metadata.Entry[0]));
                    } else {
                        amufVar.h(metadata);
                        z3 = true;
                    }
                }
            }
            amuk g = z3 ? amufVar.g() : amuk.q();
            if (pjfVar != null) {
                pjg pjgVar = pjfVar.f;
                if (pjgVar.b != j2) {
                    pjfVar.f = pjgVar.a(j2);
                }
            }
            amukVar = g;
            trackGroupArray = trackGroupArray2;
            pvoVar = pvoVar2;
        } else if (!ppzVar.equals(pjsVar.s)) {
            trackGroupArray = TrackGroupArray.a;
            pvoVar = this.h;
            amukVar = amuk.q();
        } else {
            trackGroupArray = trackGroupArray3;
            pvoVar = pvoVar3;
            amukVar = list;
        }
        if (z) {
            pin pinVar = this.x;
            if (pinVar.d && pinVar.e != 5) {
                if (i == 5) {
                    z2 = true;
                }
                ptx.c(z2);
            } else {
                pinVar.a = true;
                pinVar.d = true;
                pinVar.e = i;
            }
        }
        return this.w.i(ppzVar, j, j2, j3, h(), trackGroupArray, pvoVar, amukVar);
    }

    private final void U(pkt pktVar, ppz ppzVar, pkt pktVar2, ppz ppzVar2, long j) {
        if (pktVar.z() || !V(pktVar, ppzVar)) {
            float f = this.p.jG().b;
            pjt pjtVar = this.w.l;
            if (f == pjtVar.b) {
                return;
            }
            this.p.jH(pjtVar);
            return;
        }
        pktVar.y(pktVar.f(ppzVar.a, this.m).c, this.l);
        phl phlVar = this.N;
        pja pjaVar = this.l.k;
        int i = pxi.a;
        long j2 = pjaVar.a;
        phlVar.c = phk.c(-9223372036854775807L);
        long j3 = pjaVar.b;
        phlVar.e = phk.c(-9223372036854775807L);
        long j4 = pjaVar.c;
        phlVar.f = phk.c(-9223372036854775807L);
        float f2 = pjaVar.d;
        phlVar.i = 0.97f;
        float f3 = pjaVar.e;
        phlVar.h = 1.03f;
        phlVar.a();
        if (j != -9223372036854775807L) {
            this.N.b(g(pktVar, ppzVar.a, j));
            return;
        }
        if (pxi.M(!pktVar2.z() ? pktVar2.y(pktVar2.f(ppzVar2.a, this.m).c, this.l).b : null, this.l.b)) {
            return;
        }
        this.N.b(-9223372036854775807L);
    }

    private final boolean V(pkt pktVar, ppz ppzVar) {
        if (!ppzVar.a() && !pktVar.z()) {
            pktVar.y(pktVar.f(ppzVar.a, this.m).c, this.l);
            if (this.l.d()) {
                pks pksVar = this.l;
                if (pksVar.i && pksVar.f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void W(pkd pkdVar) {
        if (pkdVar.Q() == 2) {
            pkdVar.an();
        }
    }

    private static final void X(pkd pkdVar, long j) {
        pkdVar.ak();
        if (pkdVar instanceof psq) {
            psq psqVar = (psq) pkdVar;
            ptx.e(psqVar.p);
            psqVar.a = j;
        }
    }

    static Object a(pks pksVar, pkr pkrVar, int i, boolean z, Object obj, pkt pktVar, pkt pktVar2) {
        int b = pktVar.b(obj);
        int p = pktVar.p();
        int i2 = 0;
        int i3 = b;
        int i4 = -1;
        while (true) {
            if (i2 >= p || i4 != -1) {
                break;
            }
            i3 = pktVar.u(i3, pkrVar, pksVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = pktVar2.b(pktVar.j(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return pktVar2.j(i4);
    }

    public static final void f(pkc pkcVar) {
        pkcVar.c();
        try {
            pkcVar.a.ad(pkcVar.b, pkcVar.c);
        } finally {
            pkcVar.a(true);
        }
    }

    private final long g(pkt pktVar, Object obj, long j) {
        pktVar.y(pktVar.f(obj, this.m).c, this.l);
        pks pksVar = this.l;
        if (pksVar.f != -9223372036854775807L && pksVar.d()) {
            pks pksVar2 = this.l;
            if (pksVar2.i) {
                return phk.c(pxi.l(pksVar2.g) - this.l.f) - (j + this.m.e);
            }
        }
        return -9223372036854775807L;
    }

    private final long h() {
        return i(this.w.o);
    }

    private final long i(long j) {
        pjf pjfVar = this.s.f;
        if (pjfVar == null) {
            return 0L;
        }
        return Math.max(0L, j - pjfVar.e(this.I));
    }

    private final Pair j(pkt pktVar) {
        long j = 0;
        if (pktVar.z()) {
            return Pair.create(pjs.r, 0L);
        }
        Pair v = pktVar.v(this.l, this.m, pktVar.a(this.D), -9223372036854775807L);
        ppz k = this.s.k(pktVar, v.first, 0L);
        long longValue = ((Long) v.second).longValue();
        if (k.a()) {
            pktVar.f(k.a, this.m);
            if (k.c == this.m.c(k.b)) {
                this.m.f();
            }
        } else {
            j = longValue;
        }
        return Pair.create(k, Long.valueOf(j));
    }

    private static Pair k(pkt pktVar, pio pioVar, boolean z, int i, boolean z2, pks pksVar, pkr pkrVar) {
        Pair v;
        pkt pktVar2 = pioVar.a;
        if (pktVar.z()) {
            return null;
        }
        pkt pktVar3 = true == pktVar2.z() ? pktVar : pktVar2;
        try {
            v = pktVar3.v(pksVar, pkrVar, pioVar.b, pioVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (pktVar.equals(pktVar3)) {
            return v;
        }
        if (pktVar.b(v.first) != -1) {
            return (!pktVar3.f(v.first, pkrVar).f || pktVar3.y(pkrVar.c, pksVar).o != pktVar3.b(v.first)) ? v : pktVar.v(pksVar, pkrVar, pktVar.f(v.first, pkrVar).c, pioVar.c);
        }
        Object a = a(pksVar, pkrVar, i, z2, v.first, pktVar3, pktVar);
        if (a != null) {
            return pktVar.v(pksVar, pkrVar, pktVar.f(a, pkrVar).c, -9223372036854775807L);
        }
        return null;
    }

    private final void l(pkd pkdVar) {
        if (!M(pkdVar)) {
            return;
        }
        pho phoVar = this.p;
        if (pkdVar == phoVar.c) {
            phoVar.d = null;
            phoVar.c = null;
            phoVar.e = true;
        }
        W(pkdVar);
        pkdVar.ab();
        this.G--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x03c0, code lost:
        if (N() != false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x042a, code lost:
        if (r42.i.c(h(), r42.p.jG().b, r42.A, r32) == false) goto L330;
     */
    /* JADX WARN: Removed duplicated region for block: B:282:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x052c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.m():void");
    }

    private final void n() {
        o(new boolean[this.e.length]);
    }

    private final void o(boolean[] zArr) {
        pwj pwjVar;
        pjf pjfVar = this.s.e;
        pvo pvoVar = pjfVar.j;
        for (int i = 0; i < this.e.length; i++) {
            if (!pvoVar.b(i)) {
                this.e[i].ai();
            }
        }
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (pvoVar.b(i2)) {
                boolean z = zArr[i2];
                pkd pkdVar = this.e[i2];
                if (!M(pkdVar)) {
                    pji pjiVar = this.s;
                    pjf pjfVar2 = pjiVar.e;
                    boolean z2 = pjfVar2 == pjiVar.d;
                    pvo pvoVar2 = pjfVar2.j;
                    pkf pkfVar = pvoVar2.b[i2];
                    Format[] Q = Q(pvoVar2.c[i2]);
                    boolean z3 = P() && this.w.d == 3;
                    boolean z4 = !z && z3;
                    this.G++;
                    pkdVar.ac(pkfVar, Q, pjfVar2.c[i2], this.I, z4, z2, pjfVar2.d(), pjfVar2.k);
                    pkdVar.ad(11, new pij(this));
                    pho phoVar = this.p;
                    pwj P = pkdVar.P();
                    if (P != null && P != (pwjVar = phoVar.d)) {
                        if (pwjVar == null) {
                            phoVar.d = P;
                            phoVar.c = pkdVar;
                            phoVar.d.jH(phoVar.a.a);
                        } else {
                            throw phr.b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z3) {
                        pkdVar.am();
                    }
                } else {
                    continue;
                }
            }
        }
        pjfVar.g = true;
    }

    private final void p(IOException iOException, int i) {
        phr phrVar = new phr(0, iOException, i);
        pjf pjfVar = this.s.d;
        if (pjfVar != null) {
            phrVar = phrVar.a(pjfVar.f.i);
        }
        pns.e("ExoPlayerImplInternal", "Playback error", phrVar);
        F(false, false);
        this.w = this.w.c(phrVar);
    }

    private final void q(boolean z) {
        long b;
        pjf pjfVar = this.s.f;
        ppz ppzVar = pjfVar == null ? this.w.s : pjfVar.f.i;
        boolean z2 = !this.w.t.equals(ppzVar);
        if (z2) {
            this.w = this.w.h(ppzVar);
        }
        pjs pjsVar = this.w;
        if (pjfVar == null) {
            b = pjsVar.q;
        } else {
            b = pjfVar.b();
        }
        pjsVar.o = b;
        this.w.p = h();
        if ((z2 || z) && pjfVar != null && pjfVar.d) {
            I(pjfVar.i, pjfVar.j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0302, code lost:
        if (r0.h(r5) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0304, code lost:
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0307, code lost:
        B(false);
     */
    /* JADX WARN: Not initialized variable reg: 30, insn: 0x03c7: MOVE  (r9 I:??[long, double]) = (r30 I:??[long, double]), block:B:221:0x03c7 */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.pkt r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.r(pkt, boolean):void");
    }

    private final void s(pjt pjtVar, boolean z) {
        t(pjtVar, pjtVar.b, true, z);
    }

    private final void t(pjt pjtVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.x.a(1);
            }
            this.w = this.w.d(pjtVar);
        }
        float f2 = pjtVar.b;
        pjf pjfVar = this.s.d;
        while (true) {
            i = 0;
            if (pjfVar == null) {
                break;
            }
            pvf[] pvfVarArr = pjfVar.j.c;
            int length = pvfVarArr.length;
            while (i < length) {
                pvf pvfVar = pvfVarArr[i];
                if (pvfVar != null) {
                    pvfVar.h(f2);
                }
                i++;
            }
            pjfVar = pjfVar.h;
        }
        pkd[] pkdVarArr = this.e;
        int length2 = pkdVarArr.length;
        while (i < length2) {
            pkd pkdVar = pkdVarArr[i];
            if (pkdVar != null) {
                pkdVar.D(f, pjtVar.b);
            }
            i++;
        }
    }

    private final void u() {
        long e;
        boolean b;
        if (!L()) {
            b = false;
        } else {
            pjf pjfVar = this.s.f;
            long i = i(pjfVar.c());
            if (pjfVar == this.s.d) {
                e = pjfVar.e(this.I);
            } else {
                e = pjfVar.e(this.I) - pjfVar.f.a;
            }
            b = this.i.b(e, i, this.p.jG().b);
        }
        this.B = b;
        if (b) {
            pjf pjfVar2 = this.s.f;
            long j = this.I;
            ptx.e(pjfVar2.l());
            pjfVar2.a.o(pjfVar2.e(j));
        }
        H();
    }

    private final void v() {
        pin pinVar = this.x;
        pjs pjsVar = this.w;
        boolean z = pinVar.a | (pinVar.b != pjsVar);
        pinVar.a = z;
        pinVar.b = pjsVar;
        if (z) {
            this.M.a(pinVar);
            this.x = new pin(this.w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.w(boolean, boolean, boolean, boolean):void");
    }

    private final void x() {
        pjf pjfVar = this.s.d;
        boolean z = false;
        if (pjfVar != null && pjfVar.f.g && this.y) {
            z = true;
        }
        this.z = z;
    }

    private final void z(pkt pktVar, pkt pktVar2) {
        if (!pktVar.z() || !pktVar2.z()) {
            int size = this.q.size() - 1;
            if (size >= 0) {
                pim pimVar = (pim) this.q.get(size);
                Object obj = pimVar.b;
                pkc pkcVar = pimVar.a;
                throw null;
            }
            Collections.sort(this.q);
        }
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        this.a.b(9, (ppy) prkVar).b();
    }

    @Override // defpackage.ppx
    public final void c(ppy ppyVar) {
        this.a.b(8, ppyVar).b();
    }

    @Override // defpackage.pka
    public final synchronized void d(pkc pkcVar) {
        if (!this.c && this.k.isAlive()) {
            this.a.b(14, pkcVar).b();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        pkcVar.a(false);
    }

    public final synchronized boolean e() {
        if (!this.c && this.k.isAlive()) {
            this.a.g(7);
            K(new amqo() { // from class: pih
                @Override // defpackage.amqo
                public final Object get() {
                    return Boolean.valueOf(pip.this.c);
                }
            }, this.u);
            return this.c;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v28, types: [awx, atk] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        boolean z;
        pjf pjfVar;
        long longValue;
        ppz ppzVar;
        boolean z2;
        long j;
        Throwable th;
        boolean z3;
        long j2;
        long R;
        pjs pjsVar;
        int i2;
        pjs T;
        int i3;
        pkd[] pkdVarArr;
        try {
            switch (message.what) {
                case 0:
                    this.x.a(1);
                    w(false, false, false, true);
                    this.i.d();
                    D(true != this.w.a.z() ? 2 : 4);
                    pjp pjpVar = this.t;
                    ?? r2 = this.j;
                    ptx.e(!pjpVar.i);
                    pjpVar.j = r2;
                    for (int i4 = 0; i4 < pjpVar.a.size(); i4++) {
                        pjn pjnVar = (pjn) pjpVar.a.get(i4);
                        pjpVar.d(pjnVar);
                        pjpVar.h.add(pjnVar);
                    }
                    pjpVar.i = true;
                    this.a.g(2);
                    break;
                case 1:
                    C(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m();
                    break;
                case 3:
                    pio pioVar = (pio) message.obj;
                    this.x.a(1);
                    Pair k = k(this.w.a, pioVar, true, this.C, this.D, this.l, this.m);
                    if (k == null) {
                        Pair j3 = j(this.w.a);
                        longValue = ((Long) j3.second).longValue();
                        z2 = !this.w.a.z();
                        j = -9223372036854775807L;
                        ppzVar = (ppz) j3.first;
                    } else {
                        Object obj = k.first;
                        longValue = ((Long) k.second).longValue();
                        long j4 = pioVar.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                        ppz k2 = this.s.k(this.w.a, obj, longValue);
                        if (k2.a()) {
                            this.w.a.f(k2.a, this.m);
                            if (this.m.c(k2.b) == k2.c) {
                                this.m.f();
                            }
                            ppzVar = k2;
                            j = j4;
                            z2 = true;
                            longValue = 0;
                        } else {
                            ppzVar = k2;
                            z2 = pioVar.c == -9223372036854775807L;
                            j = j4;
                        }
                    }
                    try {
                        if (this.w.a.z()) {
                            this.H = pioVar;
                        } else if (k == null) {
                            if (this.w.d != 1) {
                                D(4);
                            }
                            w(false, true, false, true);
                        } else {
                            try {
                                if (ppzVar.equals(this.w.s)) {
                                    pjf pjfVar2 = this.s.d;
                                    j2 = (pjfVar2 == null || !pjfVar2.d || longValue == 0) ? longValue : pjfVar2.a.a(longValue, this.v);
                                    if (phk.d(j2) == phk.d(this.w.q) && ((i2 = (pjsVar = this.w).d) == 2 || i2 == 3)) {
                                        long j5 = pjsVar.q;
                                        T = T(ppzVar, j5, j, j5, z2, 2);
                                        this.w = T;
                                        break;
                                    }
                                } else {
                                    j2 = longValue;
                                }
                                pjs pjsVar2 = this.w;
                                pkt pktVar = pjsVar2.a;
                                U(pktVar, ppzVar, pktVar, pjsVar2.s, j);
                                longValue = R;
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = z2;
                                longValue = R;
                                Throwable th3 = th;
                                this.w = T(ppzVar, longValue, j, longValue, z3, 2);
                                throw th3;
                            }
                            R = R(ppzVar, j2, this.w.d == 4);
                            z2 |= longValue != R;
                        }
                        T = T(ppzVar, longValue, j, longValue, z2, 2);
                        this.w = T;
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = z2;
                    }
                    break;
                case 4:
                    this.p.jH((pjt) message.obj);
                    s(this.p.jG(), true);
                    break;
                case 5:
                    this.v = (pkh) message.obj;
                    break;
                case 6:
                    F(false, true);
                    break;
                case 7:
                    w(true, false, true, false);
                    this.i.e();
                    D(1);
                    this.k.quit();
                    synchronized (this) {
                        this.c = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.s.g((ppy) message.obj)) {
                        pjf pjfVar3 = this.s.f;
                        float f = this.p.jG().b;
                        pkt pktVar2 = this.w.a;
                        pjfVar3.d = true;
                        pjfVar3.i = pjfVar3.a.i();
                        pvo g = pjfVar3.g(f, pktVar2);
                        pjg pjgVar = pjfVar3.f;
                        long j6 = pjgVar.a;
                        long j7 = pjgVar.d;
                        if (j7 != -9223372036854775807L && j6 >= j7) {
                            j6 = Math.max(0L, j7 - 1);
                        }
                        long m = pjfVar3.m(g, j6);
                        long j8 = pjfVar3.k;
                        pjg pjgVar2 = pjfVar3.f;
                        pjfVar3.k = j8 + (pjgVar2.a - m);
                        pjfVar3.f = pjgVar2.b(m);
                        I(pjfVar3.i, pjfVar3.j);
                        if (pjfVar3 == this.s.d) {
                            y(pjfVar3.f.a);
                            n();
                            pjs pjsVar3 = this.w;
                            ppz ppzVar2 = pjsVar3.s;
                            long j9 = pjfVar3.f.a;
                            this.w = T(ppzVar2, j9, pjsVar3.b, j9, false, 5);
                        }
                        u();
                        break;
                    }
                    break;
                case 9:
                    if (this.s.g((ppy) message.obj)) {
                        this.s.f(this.I);
                        u();
                        break;
                    }
                    break;
                case 10:
                    float f2 = this.p.jG().b;
                    pji pjiVar = this.s;
                    pjf pjfVar4 = pjiVar.d;
                    pjf pjfVar5 = pjiVar.e;
                    boolean z4 = true;
                    while (pjfVar4 != null && pjfVar4.d) {
                        pvo g2 = pjfVar4.g(f2, this.w.a);
                        pvo pvoVar = pjfVar4.j;
                        if (pvoVar != null && pvoVar.c.length == g2.c.length) {
                            for (int i5 = 0; i5 < g2.c.length; i5++) {
                                if (g2.a(pvoVar, i5)) {
                                }
                            }
                            z4 &= pjfVar4 != pjfVar5;
                            pjfVar4 = pjfVar4.h;
                        }
                        if (z4) {
                            pji pjiVar2 = this.s;
                            pjf pjfVar6 = pjiVar2.d;
                            boolean h = pjiVar2.h(pjfVar6);
                            boolean[] zArr = new boolean[this.e.length];
                            long a = pjfVar6.a(g2, this.w.q, h, zArr);
                            pjs pjsVar4 = this.w;
                            boolean z5 = (pjsVar4.d == 4 || a == pjsVar4.q) ? false : true;
                            pjs pjsVar5 = this.w;
                            i3 = 2;
                            this.w = T(pjsVar5.s, a, pjsVar5.b, pjsVar5.c, z5, 5);
                            if (z5) {
                                y(a);
                            }
                            boolean[] zArr2 = new boolean[this.e.length];
                            int i6 = 0;
                            while (true) {
                                pkd[] pkdVarArr2 = this.e;
                                if (i6 < pkdVarArr2.length) {
                                    pkd pkdVar = pkdVarArr2[i6];
                                    boolean M = M(pkdVar);
                                    zArr2[i6] = M;
                                    pri priVar = pjfVar6.c[i6];
                                    if (M) {
                                        if (priVar != pkdVar.aa()) {
                                            l(pkdVar);
                                        } else if (zArr[i6]) {
                                            pkdVar.aj(this.I);
                                        }
                                    }
                                    i6++;
                                } else {
                                    o(zArr2);
                                }
                            }
                        } else {
                            i3 = 2;
                            this.s.h(pjfVar4);
                            if (pjfVar4.d) {
                                pjfVar4.m(g2, Math.max(pjfVar4.f.a, pjfVar4.e(this.I)));
                            }
                        }
                        q(true);
                        if (this.w.d != 4) {
                            u();
                            J();
                            this.a.g(i3);
                            break;
                        }
                    }
                    break;
                case 11:
                    int i7 = message.arg1;
                    this.C = i7;
                    pji pjiVar3 = this.s;
                    pkt pktVar3 = this.w.a;
                    pjiVar3.b = i7;
                    if (!pjiVar3.i(pktVar3)) {
                        B(true);
                    }
                    q(false);
                    break;
                case 12:
                    boolean z6 = message.arg1 != 0;
                    this.D = z6;
                    pji pjiVar4 = this.s;
                    pkt pktVar4 = this.w.a;
                    pjiVar4.c = z6;
                    if (!pjiVar4.i(pktVar4)) {
                        B(true);
                    }
                    q(false);
                    break;
                case 13:
                    boolean z7 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.E != z7) {
                        this.E = z7;
                        if (!z7) {
                            for (pkd pkdVar2 : this.e) {
                                if (!M(pkdVar2)) {
                                    pkdVar2.ai();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    pkc pkcVar = (pkc) message.obj;
                    long j10 = pkcVar.e;
                    if (pkcVar.d == this.b) {
                        f(pkcVar);
                        int i8 = this.w.d;
                        if (i8 == 3 || i8 == 2) {
                            this.a.g(2);
                            break;
                        }
                    } else {
                        this.a.b(15, pkcVar).b();
                        break;
                    }
                case 15:
                    final pkc pkcVar2 = (pkc) message.obj;
                    Looper looper = pkcVar2.d;
                    if (!looper.getThread().isAlive()) {
                        Log.w("TAG", "Trying to send message on a dead thread.");
                        pkcVar2.a(false);
                        break;
                    } else {
                        this.r.a(looper, null).e(new Runnable() { // from class: pii
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    pip.f(pkc.this);
                                } catch (phr e) {
                                    pns.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                        break;
                    }
                case 16:
                    s((pjt) message.obj, false);
                    break;
                case 17:
                    pik pikVar = (pik) message.obj;
                    this.x.a(1);
                    if (pikVar.b != -1) {
                        this.H = new pio(new phc(pikVar.a, pikVar.d), pikVar.b, pikVar.c);
                    }
                    pjp pjpVar2 = this.t;
                    List list = pikVar.a;
                    prl prlVar = pikVar.d;
                    pjpVar2.f(0, pjpVar2.a.size());
                    r(pjpVar2.g(pjpVar2.a.size(), list, prlVar), false);
                    break;
                case 18:
                    pik pikVar2 = (pik) message.obj;
                    int i9 = message.arg1;
                    this.x.a(1);
                    pjp pjpVar3 = this.t;
                    if (i9 == -1) {
                        i9 = pjpVar3.a();
                    }
                    r(pjpVar3.g(i9, pikVar2.a, pikVar2.d), false);
                    break;
                case 19:
                    pil pilVar = (pil) message.obj;
                    this.x.a(1);
                    pjp pjpVar4 = this.t;
                    int i10 = pilVar.a;
                    int i11 = pilVar.b;
                    int i12 = pilVar.c;
                    prl prlVar2 = pilVar.d;
                    ptx.c(pjpVar4.a() >= 0);
                    pjpVar4.k = null;
                    r(pjpVar4.b(), false);
                    break;
                case 20:
                    int i13 = message.arg1;
                    int i14 = message.arg2;
                    prl prlVar3 = (prl) message.obj;
                    this.x.a(1);
                    pjp pjpVar5 = this.t;
                    ptx.c(i13 >= 0 && i13 <= i14 && i14 <= pjpVar5.a());
                    pjpVar5.k = prlVar3;
                    pjpVar5.f(i13, i14);
                    r(pjpVar5.b(), false);
                    break;
                case 21:
                    prl prlVar4 = (prl) message.obj;
                    this.x.a(1);
                    pjp pjpVar6 = this.t;
                    int a2 = pjpVar6.a();
                    if (prlVar4.a() != a2) {
                        prlVar4 = new prl(new Random(prlVar4.a.nextLong())).b(a2);
                    }
                    pjpVar6.k = prlVar4;
                    r(pjpVar6.b(), false);
                    break;
                case 22:
                    r(this.t.b(), true);
                    break;
                case 23:
                    this.y = message.arg1 != 0;
                    x();
                    if (this.z) {
                        pji pjiVar5 = this.s;
                        if (pjiVar5.e != pjiVar5.d) {
                            B(true);
                            q(false);
                            break;
                        }
                    }
                    break;
                case 24:
                    boolean z8 = message.arg1 == 1;
                    if (z8 != this.F) {
                        this.F = z8;
                        pjs pjsVar6 = this.w;
                        int i15 = pjsVar6.d;
                        if (!z8 && i15 != 4 && i15 != 1) {
                            this.a.g(2);
                            break;
                        }
                        this.w = pjsVar6.a(z8);
                    }
                    break;
                case 25:
                    B(true);
                    break;
                default:
                    return false;
            }
        } catch (asw e) {
            p(e, e.a);
        } catch (IOException e2) {
            p(e2, 2000);
        } catch (RuntimeException e3) {
            phr b = phr.b(e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? 1004 : 1000);
            pns.e("ExoPlayerImplInternal", "Playback error", b);
            F(true, false);
            this.w = this.w.c(b);
        } catch (phr e4) {
            phr phrVar = e4;
            if (phrVar.a == 1 && (pjfVar = this.s.e) != null) {
                phrVar = phrVar.a(pjfVar.f.i);
            }
            if (!phrVar.g || this.L != null) {
                phr phrVar2 = this.L;
                if (phrVar2 != null) {
                    phrVar = phrVar2;
                }
                pns.e("ExoPlayerImplInternal", "Playback error", phrVar);
                z = true;
                F(true, false);
                this.w = this.w.c(phrVar);
            } else {
                pns.f("ExoPlayerImplInternal", "Recoverable renderer error", phrVar);
                this.L = phrVar;
                pwa pwaVar = this.a;
                pwaVar.h(pwaVar.b(25, phrVar));
            }
        } catch (pjq e5) {
            int i16 = e5.b;
            if (i16 == 1) {
                i = true != e5.a ? 3003 : 3001;
            } else if (i16 == 4) {
                i = true != e5.a ? 3004 : 3002;
            } else {
                i = 1000;
            }
            p(e5, i);
        } catch (pnd e6) {
            p(e6, e6.a);
        } catch (ppb e7) {
            p(e7, 1002);
        }
        z = true;
        v();
        return z;
    }

    private final void y(long j) {
        pkd[] pkdVarArr;
        pvf[] pvfVarArr;
        pjf pjfVar = this.s.d;
        if (pjfVar != null) {
            j = pjfVar.f(j);
        }
        this.I = j;
        this.p.a.d(j);
        for (pkd pkdVar : this.e) {
            if (M(pkdVar)) {
                pkdVar.aj(this.I);
            }
        }
        for (pjf pjfVar2 = this.s.d; pjfVar2 != null; pjfVar2 = pjfVar2.h) {
            for (pvf pvfVar : pjfVar2.j.c) {
            }
        }
    }
}
