package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amml  reason: default package */
/* loaded from: classes.dex */
public class amml extends amlq implements amos, akts, amkq, btph {
    protected final bvkx A;
    public final bnsn B;
    public final ammf C;
    public final Executor D;
    protected final amoh E;
    public final amco F;
    @dzsi
    public final dzsj<akwx> G;
    protected final akrz H;
    protected final akzh I;
    protected final amyj J;
    private final boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    @dzsi
    private akpr S;
    private final Object T;
    private final akra U;
    private final float[] V;
    @dzsi
    private alad W;
    private boolean X;
    private volatile boolean Y;
    private boolean Z;
    private final int a;
    private volatile boolean aa;
    @dzsi
    private List<alyh> ab;
    private final Set<alyh> ac;
    @dzsi
    private volatile amii ad;
    @dzsi
    private final ammq ae;
    private final ammf af;
    @dzsi
    private final alxa ag;
    private final boolean ah;
    private volatile boolean ai;
    private boolean aj;
    @dzsi
    private final ckcw ak;
    private final Set<amqn> al;
    private Set<alyh> am;
    private Set<alyh> an;
    private final boolean b;
    protected final int c;
    public final akry d;
    public final akrw e;
    public final alyl f;
    protected final anbe g;
    public final amox h;
    public final amcn i;
    protected final int k;
    public alvb l;
    public volatile boolean m;
    @dzsi
    public volatile ammk n;
    public long o;
    protected final boolean p;
    protected volatile boolean q;
    public volatile boolean r;
    protected final alvd s;
    public boolean t;
    public boolean u;
    final Runnable v;
    public final List<alyh> w;
    public final crzo<Boolean> x;
    public volatile boolean y;
    protected final ammc z;
    public final List<amqn> j = dchl.a();
    private final List<amqn> K = dchl.a();

    public amml(bnsn bnsnVar, akzh akzhVar, akrw akrwVar, alyl alylVar, anbe anbeVar, amox amoxVar, alvd alvdVar, ammq ammqVar, int i, boolean z, int i2, int i3, boolean z2, boolean z3, ammc ammcVar, bvkx bvkxVar, amoh amohVar, amco amcoVar, Executor executor, akpr akprVar, alxa alxaVar, amyj amyjVar, dzsj dzsjVar, ckcw ckcwVar, akrz akrzVar) {
        int i4 = cqaz.a;
        this.T = new Object();
        this.U = new akra();
        this.V = new float[3];
        this.o = 0L;
        boolean z4 = false;
        this.X = false;
        this.q = false;
        this.r = false;
        this.Y = false;
        this.t = false;
        this.Z = false;
        this.u = true;
        this.aa = false;
        this.w = dchl.a();
        this.x = new crzo<>(false);
        this.ac = dcnm.c();
        this.y = true;
        this.al = new HashSet();
        this.am = new HashSet();
        this.an = new HashSet();
        akry akryVar = akrwVar.b;
        this.d = akryVar;
        this.e = akrwVar;
        this.f = alylVar;
        this.g = anbeVar;
        this.h = amoxVar;
        this.s = alvdVar;
        this.ae = ammqVar;
        this.c = i2;
        this.a = i3;
        this.b = z2;
        this.p = z3;
        dbsk.s(bnsnVar);
        this.B = bnsnVar;
        this.k = i;
        this.z = ammcVar;
        this.A = bvkxVar;
        this.E = amohVar;
        this.F = amcoVar;
        this.D = executor;
        this.S = akprVar;
        this.ag = alxaVar;
        this.J = amyjVar;
        this.G = dzsjVar;
        this.ak = ckcwVar;
        this.H = akrzVar;
        this.I = akzhVar;
        this.v = new Runnable(this) { // from class: ammg
            private final amml a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.D();
            }
        };
        this.L = z;
        this.M = 0;
        new ammm();
        alwn alwnVar = amoxVar.g;
        this.C = new ammf(alwnVar);
        this.af = new ammf(alwnVar);
        this.ah = akryVar == akry.API_TILE_OVERLAY;
        ammj ammjVar = new ammj(this, amoxVar);
        this.i = ammjVar;
        String valueOf = String.valueOf(akryVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("TileOverlay.updateCamera() - ");
        sb.append(valueOf);
        sb.append(" overlay");
        sb.toString();
        dbsk.l(amoxVar.o == null ? true : z4);
        amoxVar.o = this;
        amcoVar.h(ammjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.amml H(defpackage.bnsn r41, defpackage.dxio<defpackage.amom> r42, defpackage.akzh r43, defpackage.akrw r44, defpackage.alyl r45, android.content.res.Resources r46, defpackage.amxf r47, defpackage.alwn r48, defpackage.alsq r49, defpackage.ammc r50, defpackage.bvkx r51, defpackage.amoh r52, defpackage.amco r53, defpackage.cqat r54, defpackage.btvt r55, java.util.concurrent.Executor r56, java.util.concurrent.Executor r57, @defpackage.dzsi defpackage.akpr r58, defpackage.alyx r59, defpackage.cjvm r60, defpackage.ckcw r61, defpackage.amyj r62, @defpackage.dzsi defpackage.dzsj<defpackage.akwx> r63, defpackage.akrz r64) {
        /*
            r14 = r54
            r15 = r44
            akry r13 = r15.b
            int r0 = defpackage.aluv.b(r46)
            int r0 = r0 + r0
            akry r1 = defpackage.akry.BASE
            boolean r1 = r13.equals(r1)
            r12 = 1
            r2 = 0
            if (r1 == 0) goto L1d
            amxf r1 = defpackage.amxf.SATELLITE_LEGEND
            r11 = r47
            if (r11 == r1) goto L1f
            r1 = 1
            goto L20
        L1d:
            r11 = r47
        L1f:
            r1 = 0
        L20:
            amoj r3 = new amoj
            r4 = 8
            r3.<init>(r4, r0, r1, r2)
            akry r0 = defpackage.akry.BUILDING_3D
            if (r13 != r0) goto L2e
            r28 = 1
            goto L30
        L2e:
            r28 = 0
        L30:
            amox r21 = new amox
            r10 = 0
            r0 = r21
            r1 = r44
            r2 = r45
            r4 = r49
            r5 = r52
            r6 = r53
            r7 = r54
            r8 = r57
            r9 = r42
            r11 = r64
            r12 = r47
            r15 = r13
            r13 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            akry r0 = defpackage.akry.BASE
            if (r15 != r0) goto L62
            ammq r0 = new ammq
            r1 = r60
            r2 = r61
            r0.<init>(r14, r2, r1)
            r1 = 1
            r0.k = r1
            r0.l = r1
            goto L65
        L62:
            r2 = r61
            r0 = 0
        L65:
            r23 = r0
            amml r0 = new amml
            r15 = r0
            anbe r1 = new anbe
            r20 = r1
            r3 = r55
            r1.<init>(r3, r14)
            aluz r1 = new aluz
            r22 = r1
            r3 = r59
            r1.<init>(r3)
            r24 = 8
            r25 = 0
            r26 = 256(0x100, float:3.59E-43)
            r27 = 256(0x100, float:3.59E-43)
            r29 = 1
            r36 = 0
            r16 = r41
            r17 = r43
            r18 = r44
            r19 = r45
            r30 = r50
            r31 = r51
            r32 = r52
            r33 = r53
            r34 = r56
            r35 = r58
            r37 = r62
            r38 = r63
            r39 = r61
            r40 = r64
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amml.H(bnsn, dxio, akzh, akrw, alyl, android.content.res.Resources, amxf, alwn, alsq, ammc, bvkx, amoh, amco, cqat, btvt, java.util.concurrent.Executor, java.util.concurrent.Executor, akpr, alyx, cjvm, ckcw, amyj, dzsj, akrz):amml");
    }

    public static amml I(dxio<amom> dxioVar, bnsn bnsnVar, akzh akzhVar, Resources resources, akry akryVar, alyl alylVar, ammc ammcVar, bvkx bvkxVar, amoh amohVar, amco amcoVar, cqat cqatVar, btvt btvtVar, Executor executor, Executor executor2, alvc alvcVar, amyj amyjVar, akrz akrzVar, boolean z) {
        akrw a = akrw.a(akryVar);
        int a2 = aluv.a(resources);
        return new amml(bnsnVar, akzhVar, a, alylVar, new anbe(btvtVar, cqatVar), new amox(a, alylVar, new amoj(4, a2 + a2, false, false), null, amohVar, amcoVar, cqatVar, executor2, dxioVar, false, akrzVar, z), alvcVar, null, 2, true, 256, 256, false, false, ammcVar, bvkxVar, amohVar, amcoVar, executor, null, null, amyjVar, null, null, akrzVar);
    }

    private static synchronized boolean J(akzh akzhVar) {
        boolean z;
        synchronized (amml.class) {
            z = (akzhVar.a & 2) != 0;
        }
        return z;
    }

    private final synchronized void K(akzh akzhVar, boolean z) {
        alvb alvbVar;
        this.ac.clear();
        q(this.ac);
        if (!this.u || (alvbVar = this.l) == null) {
            return;
        }
        int i = this.Z ? true != z ? 8 : 4 : 0;
        amox amoxVar = this.h;
        akra g = akzhVar.g();
        List<alyh> list = this.w;
        Set<alyh> set = this.ac;
        akrp akrpVar = akzhVar.r().c.a;
        amoxVar.f(alvbVar, g, list, set, aksj.c(new akrp(akra.s(akrpVar.a), akra.s(akrpVar.b))), i, false, false);
        P();
        akry akryVar = akry.BASE;
    }

    private final synchronized void L(akzh akzhVar, alaj alajVar) {
        alvb alvbVar;
        this.X = true;
        akzh akzhVar2 = new akzh(alajVar.a, akzhVar.y(), akzhVar.z(), akzhVar.B());
        ArrayList a = dchl.a();
        if (this.l != null) {
            dzsj<akwx> dzsjVar = this.G;
            akwx a2 = dzsjVar != null ? dzsjVar.a() : null;
            alvb alvbVar2 = this.l;
            if ((alvbVar2 instanceof alva) && a2 != null) {
                ((alva) alvbVar2).e(akzhVar2, a, a2.a());
            } else if (alvbVar2 != null) {
                alvbVar2.d(akzhVar2, a);
            }
        }
        if (this.u && (alvbVar = this.l) != null) {
            this.h.f(alvbVar, akzhVar2.g(), a, null, akzhVar2.r().c, true != this.Z ? 0 : 8, true, false);
        }
        this.ab = a;
        this.W = alajVar.a;
    }

    private final synchronized boolean M(akzh akzhVar, Set<amqn> set) {
        boolean z;
        boolean p;
        dbsk.l(set.isEmpty());
        akzhVar.h(this.U);
        akra akraVar = this.U;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        amox amoxVar = this.h;
        amog amogVar = amoxVar.e;
        if (amogVar != null) {
            amoxVar.c.k(amogVar, elapsedRealtime);
        }
        List<alyh> list = this.ab;
        boolean z2 = true;
        if (list == null || list.isEmpty() || this.w.isEmpty() || this.w.get(0).a < list.get(0).a - 2) {
            z = false;
        } else {
            p(list, 0, akraVar, elapsedRealtime, set);
            N(this.M == list.size());
            z = true;
        }
        p = p(this.w, this.k, akraVar, elapsedRealtime, set);
        if (!z) {
            if (this.M != this.w.size()) {
                z2 = false;
            }
            N(z2);
        }
        if (this.q) {
            P();
            akry akryVar = akry.BASE;
        }
        return p;
    }

    private final void N(boolean z) {
        this.q = z;
        this.x.b(Boolean.valueOf(z()));
    }

    private final synchronized boolean O(akzh akzhVar, int i, int i2) {
        akzhVar.d(this.V);
        float[] fArr = this.V;
        float f = fArr[0];
        float f2 = fArr[1];
        if (((f * f) / (i * i)) + ((f2 * f2) / (i2 * i2)) < 9.0d) {
            if (Math.abs(fArr[2]) < 4.0d) {
                return true;
            }
        }
        return false;
    }

    private final void P() {
        if (this.d != akry.BASE) {
            return;
        }
        synchronized (this.T) {
            if (this.N && !this.O && !this.q) {
                this.O = true;
                this.R = true;
                this.z.h();
            }
        }
    }

    private final void Q(amqn amqnVar) {
        this.al.add(amqnVar);
        if (!this.j.contains(amqnVar)) {
            amqnVar.H();
        }
        amps ampsVar = (amps) amqnVar;
        akry akryVar = ampsVar.c;
        if (akryVar == akry.BASE || akryVar == akry.SATELLITE || akryVar == akry.TERRAIN || akryVar == akry.TERRAIN_DARK || akryVar == akry.LABELS_ONLY || akryVar == akry.PERSONALIZED_SMARTMAPS) {
            boolean z = ampsVar.g;
        }
    }

    @dzsi
    public final amog A() {
        return this.h.e;
    }

    public final void B(alwn alwnVar) {
        this.C.a(alwnVar);
        u();
    }

    public final void C() {
        amii amiiVar = this.ad;
        if (amiiVar != null) {
            amiiVar.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
        r6 = r3;
        r0 = r17;
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
        r2.a(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:9:0x0020, B:63:0x0168, B:73:0x017f, B:74:0x0182, B:84:0x01e2, B:86:0x01e6, B:87:0x01e9, B:76:0x01a5, B:79:0x01b8, B:81:0x01bd, B:67:0x0174, B:15:0x003c, B:59:0x0151, B:61:0x0162, B:18:0x0048, B:21:0x0055, B:22:0x0067, B:26:0x007d, B:27:0x008c, B:29:0x0092, B:31:0x00a2, B:39:0x00ca, B:49:0x0101, B:42:0x00d6, B:44:0x00e9, B:46:0x00ee, B:48:0x00f6, B:52:0x011d, B:53:0x0127, B:55:0x012c, B:58:0x014a), top: B:249:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void D() {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amml.D():void");
    }

    public void E() {
    }

    public void F() {
    }

    public final synchronized void G() {
        amco amcoVar = this.F;
        if (amcoVar == null || !(amcoVar instanceof amaw) || !((amaw) amcoVar).w()) {
            return;
        }
        t();
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.akts
    public final void Py() {
        akpr akprVar;
        synchronized (this.T) {
            akprVar = null;
            if (this.P && !this.Q) {
                if (this.O && this.d == akry.BASE && !this.R) {
                    this.z.g();
                }
                akpr akprVar2 = this.S;
                if (akprVar2 != null) {
                    this.S = null;
                    akprVar = akprVar2;
                }
                this.Q = true;
            }
            if (this.Y && this.d == akry.BASE) {
                this.z.o();
            }
        }
        if (akprVar != null) {
            akprVar.a();
        }
    }

    @Override // defpackage.amos
    public final void b(amqn amqnVar) {
        if (amqnVar != null && this.aa) {
            if (!this.r) {
                synchronized (this.K) {
                    this.K.add(amqnVar);
                }
                C();
            }
            this.B.q();
        }
    }

    @Override // defpackage.amkq
    public final void d(Collection<akvw> collection) {
        if (!this.p) {
            return;
        }
        synchronized (this.K) {
            for (amqn amqnVar : this.K) {
                if (amqnVar != null && (amqnVar.c() || !this.r)) {
                    if (amqnVar instanceof amkq) {
                        ((amkq) amqnVar).d(collection);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0054 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:17:0x0021, B:19:0x0025, B:20:0x0028, B:25:0x0039, B:34:0x004e, B:36:0x0054, B:37:0x0057, B:28:0x003e, B:30:0x0042), top: B:46:0x0021 }] */
    @Override // defpackage.amlq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(defpackage.amxf r6, boolean r7, defpackage.alwn r8) {
        /*
            r5 = this;
            amxf r7 = r5.x()
            if (r7 != r6) goto Le
            amox r7 = r5.h
            alwn r7 = r7.g
            if (r7 == r8) goto Ld
            goto Le
        Ld:
            return
        Le:
            amox r7 = r5.h
            amxf r0 = r7.f
            if (r0 != r6) goto L19
            alwn r0 = r7.g
            if (r0 != r8) goto L19
            goto L58
        L19:
            boolean r0 = r7.r
            if (r0 != 0) goto L20
            r7.g()
        L20:
            monitor-enter(r7)
            boolean r0 = r7.r     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L28
            r7.p()     // Catch: java.lang.Throwable -> L67
        L28:
            amxf r0 = r7.f     // Catch: java.lang.Throwable -> L67
            alwn r1 = r7.g     // Catch: java.lang.Throwable -> L67
            boolean r2 = r7.j()     // Catch: java.lang.Throwable -> L67
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            if (r0 != r6) goto L39
            if (r1 != r8) goto L39
            goto L4d
        L39:
            boolean r1 = r7.r     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L3e
            goto L4e
        L3e:
            amog r1 = r7.e     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L4e
            amzz r0 = r0.r     // Catch: java.lang.Throwable -> L67
            amzz r1 = r6.r     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            r7.f = r6     // Catch: java.lang.Throwable -> L67
            r7.g = r8     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L57
            r7.k()     // Catch: java.lang.Throwable -> L67
        L57:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L67
        L58:
            boolean r6 = r5.r
            if (r6 != 0) goto L61
            amox r6 = r5.h
            r6.l()
        L61:
            bnsn r6 = r5.B
            r6.q()
            return
        L67:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L67
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amml.e(amxf, boolean, alwn):void");
    }

    @Override // defpackage.amlq
    public void f() {
        this.aa = true;
        if (this.l == null) {
            n(this.s.a(this.d, this.a, this.b));
        }
        E();
        this.ai = false;
        bnsn bnsnVar = this.B;
        bnsnVar.c.add(this.v);
        this.B.q();
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void g(amjl amjlVar) {
        if (!this.p) {
            return;
        }
        synchronized (this.K) {
            for (amqn amqnVar : this.K) {
                if (amqnVar != null && (amqnVar.c() || !this.r)) {
                    if (amqnVar instanceof amjm) {
                        ((amjm) amqnVar).g(amjlVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void h(amii amiiVar) {
        this.ad = amiiVar;
        amiiVar.s(this);
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void i(amii amiiVar) {
        amiiVar.t(this);
    }

    @Override // defpackage.amlq
    public void j() {
        this.aa = false;
        this.h.g();
        amox amoxVar = this.h;
        amog amogVar = amoxVar.e;
        if (amogVar != null) {
            amoxVar.c.d(amogVar);
            amoxVar.l();
        }
        F();
        this.ai = true;
        v();
    }

    @Override // defpackage.amlq
    public final void l() {
        this.h.h(this.B.m);
    }

    public amml m(alyl alylVar, amco amcoVar) {
        return new amml(this.B, this.I, this.e, alylVar, this.g, this.h.a(alylVar, amcoVar), this.s, this.ae, this.k, this.L, this.c, this.a, this.b, this.p, this.z, this.A, this.E, amcoVar, this.D, this.S, this.ag, this.J, this.G, this.ak, this.H);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(alvb alvbVar) {
        dbsk.s(alvbVar);
        this.l = alvbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public amqn o(alyh alyhVar, long j) {
        amox amoxVar = this.h;
        return amoxVar.b(alyhVar, j, amoxVar.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Collection<alyh> collection, int i, akra akraVar, long j, Set<amqn> set) {
        boolean z;
        alyh a;
        this.M = 0;
        this.am.clear();
        this.an.clear();
        synchronized (this.E) {
            Set<alyh> set2 = collection;
            int i2 = 0;
            z = true;
            while (i2 <= i) {
                try {
                    for (alyh alyhVar : set2) {
                        amqn o = o(alyhVar, j);
                        if (o == null || !o.l()) {
                            alvb alvbVar = this.l;
                            if (alvbVar != null) {
                                List<alyh> b = alvbVar.b(alyhVar, akraVar);
                                int size = b.size();
                                ArrayList<amqn> a2 = dchl.a();
                                if (size == 4) {
                                    for (alyh alyhVar2 : b) {
                                        amqn o2 = o(alyhVar2, j);
                                        if (o2 != null && o2.l()) {
                                            a2.add(o2);
                                        }
                                    }
                                    for (amqn amqnVar : a2) {
                                        Q(amqnVar);
                                    }
                                }
                                if (i2 != i && (a = this.l.a(alyhVar, akraVar)) != null) {
                                    this.am.add(a);
                                }
                            }
                            z = false;
                        } else {
                            Q(o);
                            if (i2 == 0) {
                                this.M++;
                            }
                        }
                    }
                    if (i2 == i || this.am.isEmpty()) {
                        break;
                    }
                    Set<alyh> set3 = this.am;
                    Set<alyh> set4 = this.an;
                    this.am = set4;
                    this.an = set3;
                    set4.clear();
                    i2++;
                    set2 = set3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.L && this.l != null && i > 0) {
            TreeSet treeSet = new TreeSet();
            for (amqn amqnVar2 : set) {
                treeSet.add(amqnVar2.n());
            }
            Iterator<amqn> it = set.iterator();
            while (it.hasNext()) {
                alyh a3 = this.l.a(it.next().n(), akraVar);
                int i3 = 0;
                while (true) {
                    if (i3 < i && a3 != null) {
                        if (!treeSet.contains(a3)) {
                            a3 = this.l.a(a3, akraVar);
                            i3++;
                        } else {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        if (this.ak != null && this.d.equals(akry.BASE)) {
            ckhe ckheVar = (ckhe) this.ak.a(ckgh.aK);
            Iterator<amqn> it2 = set.iterator();
            int i4 = Integer.MAX_VALUE;
            while (true) {
                if (it2.hasNext()) {
                    int E = it2.next().E();
                    if (i4 == Integer.MAX_VALUE) {
                        i4 = E;
                    } else if (i4 != E) {
                        if (!ckheVar.b()) {
                            ckheVar.a();
                        }
                    }
                } else if (ckheVar.b()) {
                    ckheVar.c();
                }
            }
        }
        return z;
    }

    protected void q(Set<alyh> set) {
    }

    public final synchronized void r() {
        this.Z = true;
        this.m = true;
    }

    public final void s(amml ammlVar) {
        this.h.h(this.B.m);
        amog A = ammlVar.A();
        amog A2 = A();
        if (A == null || A2 == null) {
            return;
        }
        for (alyh alyhVar : this.E.g(A, A2, ammlVar.w)) {
            amqn h = this.E.h(A2, alyhVar, false);
            if (h != null) {
                h.t();
            }
        }
    }

    public final synchronized void t() {
        this.h.r();
        v();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("tileType", this.d);
        b.b("drawMode", x());
        b.b("fetcher", this.h);
        b.h("allowMultiZoom", this.b);
        b.f("tileSize", this.c);
        b.h("isContributingLabels", this.p);
        b.f("maxTileSize", this.a);
        return b.toString();
    }

    public final void u() {
        if (this.aa) {
            this.B.q();
        }
    }

    public final void v() {
        this.m = true;
        this.q = false;
        this.x.b(Boolean.valueOf(z()));
        this.B.q();
    }

    public final void w(boolean z) {
        this.h.q = z;
        if (z) {
            v();
        }
    }

    public final amxf x() {
        return this.h.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void y(akzh akzhVar, Set<amqn> set) {
        long d;
        dbsk.l(set.isEmpty());
        dbsk.s(this.l);
        this.r = true;
        dzsj<akwx> dzsjVar = this.G;
        akwx a = dzsjVar != null ? dzsjVar.a() : null;
        alvb alvbVar = this.l;
        if (!(alvbVar instanceof alva) || a == null) {
            d = alvbVar.d(akzhVar, this.w);
        } else {
            d = ((alva) alvbVar).e(akzhVar, this.w, a.a());
        }
        boolean z = this.o != d && !this.w.isEmpty();
        if (akry.BASE.equals(this.d)) {
            this.z.n(d);
        }
        boolean l = this.h.l();
        if (J(akzhVar)) {
            alaj alajVar = akzhVar.f;
            boolean z2 = alajVar != null;
            if (this.X && !z2) {
                this.X = false;
                this.ab = null;
            }
            if (!l || !z2) {
                if (z2 && !alajVar.a.equals(this.W) && alajVar.b - AnimationUtils.currentAnimationTimeMillis() >= 1000) {
                    L(akzhVar, alajVar);
                } else if ((!l && !this.m) || z2) {
                    if (!this.X && this.y && z && O(akzhVar, akzhVar.y(), akzhVar.z())) {
                        K(akzhVar, true);
                        this.o = d;
                    } else if (this.X) {
                        amox amoxVar = this.h;
                        bnuq.c();
                        amoxVar.j.c();
                    }
                } else {
                    K(akzhVar, true);
                    this.o = d;
                }
            } else {
                L(akzhVar, alajVar);
            }
        } else {
            if (z || this.m || l) {
                K(akzhVar, false);
                this.o = d;
            }
            this.X = false;
            this.ab = null;
        }
        this.m = false;
        this.Y = M(akzhVar, set);
    }

    public final boolean z() {
        return this.q && this.aj;
    }
}
