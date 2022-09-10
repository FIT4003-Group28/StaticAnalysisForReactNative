package defpackage;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: amaw  reason: default package */
/* loaded from: classes.dex */
public class amaw implements amco {
    public static final dcqe a = dcqe.c("amaw");
    private static final long x = TimeUnit.MINUTES.toMillis(10);
    private static final dcza y = dczq.a;
    private volatile int B;
    private final dzsj<akwu> C;
    private final Runnable D;
    private long E;
    private final boolean F;
    public final akrz c;
    public final alzn d;
    public final amcc e;
    public final cqat f;
    public final akry h;
    public final akrw i;
    public final alyl j;
    @dzsi
    public final ambu m;
    @dzsi
    public final amad n;
    public volatile int o;
    public final amck p;
    @dzsi
    public final amcj q;
    public final ckcw s;
    public final Executor t;
    public final Executor u;
    public final amby v;
    public final aluh w;
    public final ReentrantLock b = new ReentrantLock();
    private volatile boolean z = false;
    public final amac g = new amac();
    private final amcm A = new amah(this);
    public final amaq k = new amaq();
    public final amar l = new amar();
    public volatile long r = 0;

    public amaw(akrw akrwVar, alyl alylVar, amby ambyVar, ambu ambuVar, amad amadVar, amck amckVar, amcj amcjVar, alzn alznVar, akrz akrzVar, ckcw ckcwVar, dzsj dzsjVar, Runnable runnable, cqat cqatVar, Executor executor, Executor executor2, int i, aluh aluhVar, amcc amccVar) {
        boolean z = false;
        this.o = -1;
        akry akryVar = akrwVar.b;
        this.h = akryVar;
        this.i = akrwVar;
        this.j = alylVar;
        this.s = ckcwVar;
        this.C = dzsjVar;
        this.D = runnable;
        this.f = cqatVar;
        this.t = executor;
        this.u = executor2;
        this.v = ambyVar;
        this.c = akrzVar;
        this.e = amccVar;
        this.m = ambuVar;
        this.n = amadVar;
        this.p = amckVar;
        this.q = amcjVar;
        this.d = alznVar;
        this.o = i;
        this.w = aluhVar;
        this.B = M(akryVar, ((akwu) dzsjVar.a()).e());
        this.F = ambuVar != null ? true : z;
    }

    private final void I(ambv ambvVar) {
        H(this.t, new amai(this, ambvVar));
    }

    @dzsi
    private final ambv J(alyg alygVar, ambv ambvVar) {
        amad amadVar;
        if (!ambvVar.e() || !x() || alygVar.b() == akry.ROAD_GRAPH) {
            return null;
        }
        boolean z = this.m != null && ambvVar.a().equals(ambu.b);
        int i = -1;
        if (z && (alygVar.c().a & 16) != 0) {
            i = alygVar.c().f;
        }
        boolean z2 = alygVar.c().n;
        if (this.o == 0 || this.o == alygVar.c().j) {
            if (!alygVar.c().n) {
                if (ambvVar.m()) {
                    return null;
                }
                if (z || !alym.c(alygVar.c(), this.f)) {
                    if (!z || (!i(alygVar.c()) && ((amadVar = this.n) == null || !amadVar.b(ambvVar.b(), alym.f(alygVar.c(), this.h, this.c))))) {
                        boolean z3 = alygVar.c().n;
                        if (alygVar.c().d == this.B) {
                            return null;
                        }
                        if (z && (alygVar.c().a & 16) == 0) {
                            return null;
                        }
                        z(ckgh.bd, ambvVar);
                        return K(ambvVar, alygVar.c().k, i, false);
                    }
                    z(ckgh.ba, ambvVar);
                    return K(ambvVar, alygVar.c().k, i, true);
                }
                z(ckgh.ba, ambvVar);
                return K(ambvVar, alygVar.c().k, i, true);
            }
            z(ckgh.bc, ambvVar);
            return K(ambvVar, "", i, true);
        }
        z(ckgh.bb, ambvVar);
        return K(ambvVar, alygVar.c().k, i, true);
    }

    private final ambv K(ambv ambvVar, String str, int i, boolean z) {
        return ambv.o(ambvVar.a(), ambvVar.b(), this.A, 1, true, true, true, str, i, z);
    }

    private final boolean L(alyg alygVar) {
        return (alygVar instanceof alvx) && !this.v.b.q(alygVar);
    }

    private static int M(akry akryVar, dmxf dmxfVar) {
        dmxp dmxpVar = dmxfVar.b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        dsrf dsrfVar = null;
        for (dmxj dmxjVar : dmxpVar.b) {
            dmxl b = dmxl.b(dmxjVar.b);
            if (b == null) {
                b = dmxl.UNKNOWN;
            }
            if (b == akryVar.H) {
                dmxh dmxhVar = dmxjVar.c;
                if (dmxhVar == null) {
                    dmxhVar = dmxh.j;
                }
                dsrfVar = dmxhVar.h;
            }
        }
        if (dsrfVar != null) {
            return v(dsrfVar);
        }
        return 0;
    }

    private final void N(ambv ambvVar, int i) {
        if (ambvVar.a() == akry.BASE) {
            ((ckco) this.s.a(ckgh.bI)).a(i - 1);
        }
    }

    public static boolean i(amze amzeVar) {
        return ((amzeVar.a & 16) == 0 || amzeVar.e == amzeVar.f) ? false : true;
    }

    public static byte[] p(ambv ambvVar, alzt alztVar) {
        if (ambvVar.a() == akry.SATELLITE || ambvVar.a() == akry.TERRAIN || ambvVar.a() == akry.TERRAIN_DARK) {
            return alztVar.a(ambvVar.a());
        }
        return alztVar.a.c.G();
    }

    public static int v(List<Integer> list) {
        if (!list.isEmpty()) {
            int[] l = decl.l(list);
            Arrays.sort(l);
            dczb f = y.f();
            for (int i : l) {
                f.h(i);
            }
            return f.p().c();
        }
        return 0;
    }

    public final void A(ckha ckhaVar, ambv ambvVar, long j) {
        ((ckcp) this.s.a(ckhaVar)).b(ambvVar.a().I.Z, j);
    }

    @Override // defpackage.amco
    public final long B() {
        dbsk.a(true);
        return Math.max(0L, 400 - (this.f.e() - this.r));
    }

    @Override // defpackage.amco
    public final void C(List<alyh> list) {
        amci amciVar = this.v.c;
        if (amciVar != null) {
            if (!amciVar.i()) {
                return;
            }
            for (alyh alyhVar : list) {
                amciVar.k(alyhVar);
            }
            return;
        }
        throw new IOException("No disk cache available to pin tiles with");
    }

    @Override // defpackage.amco
    @dzsi
    public final alyg D(alyh alyhVar) {
        ambv l = ambv.l(this.h, alyhVar, null);
        amaq amaqVar = new amaq();
        this.b.lock();
        try {
            l(l, false, amaqVar);
            this.b.unlock();
            int i = amaqVar.d;
            if (i != 0) {
                this.b.lock();
                try {
                    G(l, i, amaqVar.b, null);
                } finally {
                }
            }
            ambv ambvVar = amaqVar.c;
            if (ambvVar != null) {
                I(ambvVar);
            }
            int i2 = amaqVar.d;
            if (i2 != 0 && i2 == 1) {
                return amaqVar.b;
            }
            return null;
        } finally {
        }
    }

    @Override // defpackage.amco
    public final void E() {
        amci amciVar = this.v.c;
        if (amciVar != null) {
            if (!amciVar.i()) {
                return;
            }
            amciVar.l();
            return;
        }
        throw new IOException("No disk cache available to unpin tiles with");
    }

    @Override // defpackage.amco
    public void F(alyh alyhVar, @dzsi amcm amcmVar, int i) {
        I(ambv.o(this.h, alyhVar, amcmVar, i, true, true, false, "", -1, true));
    }

    public final void G(final ambv ambvVar, final int i, @dzsi final alyg alygVar, @dzsi final alyg alygVar2) {
        if (ambvVar.c() == null) {
            return;
        }
        this.t.execute(new Runnable(ambvVar, i, alygVar, alygVar2) { // from class: amae
            private final ambv a;
            private final alyg b;
            private final alyg c;
            private final int d;

            {
                this.a = ambvVar;
                this.d = i;
                this.b = alygVar;
                this.c = alygVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ambv ambvVar2 = this.a;
                int i2 = this.d;
                alyg alygVar3 = this.b;
                alyg alygVar4 = this.c;
                dcqe dcqeVar = amaw.a;
                amcm c = ambvVar2.c();
                if (c != null) {
                    c.a(ambvVar2.b(), i2, alygVar3, alygVar4);
                }
            }
        });
    }

    public final void H(Executor executor, Runnable runnable) {
        executor.execute(new amau(this, runnable));
    }

    @Override // defpackage.amco
    public void a(alyh alyhVar, amcm amcmVar) {
        I(ambv.l(this.h, alyhVar, amcmVar));
    }

    @Override // defpackage.btni
    public int b(float f) {
        this.v.b.r();
        return 0;
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        return null;
    }

    @Override // defpackage.amco
    public final void d(alyh alyhVar, amcm amcmVar, boolean z) {
        I(new amab(this.h, alyhVar, amcmVar, 1, false, z, false, "", -1, true));
    }

    public final boolean e(alyg alygVar) {
        return alym.d(alygVar.c().i, this.C.a().c().d());
    }

    @Override // defpackage.amco
    public final void f(aksj aksjVar, @dzsi List<alyh> list) {
        if (this.F && aksjVar.d() > 0 && aksjVar.e() > 0) {
            ArrayList g = dchl.g(list.size());
            g.addAll(list);
            H(this.u, new amaj(this, aksjVar, g));
        }
    }

    @Override // defpackage.amco
    public final void g() {
        H(this.u, new amal(this));
    }

    @Override // defpackage.amco
    public final void h(amcn amcnVar) {
        amac amacVar = this.g;
        synchronized (amacVar.a) {
            amacVar.a.add(new WeakReference<>(amcnVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(ambv ambvVar) {
        x();
        final alzc alzcVar = new alzc(ambvVar.a(), ambvVar.b(), ambvVar.h(), ambvVar.j(), new amap(this, ambvVar));
        final alzn alznVar = this.d;
        alznVar.b.execute(new Runnable(alznVar, alzcVar) { // from class: alzk
            private final alzn a;
            private final alzr b;

            {
                this.a = alznVar;
                this.b = alzcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        });
    }

    @Override // defpackage.amco
    public boolean k(alyh alyhVar) {
        alyg y2;
        if (this.h.equals(akry.PERSONALIZED_SMARTMAPS) && (y2 = y(this.v.b, alyhVar)) != null) {
            this.b.lock();
            try {
                amad amadVar = this.n;
                if (amadVar != null) {
                    return amadVar.b(alyhVar, alym.f(y2.c(), this.h, this.c));
                }
            } finally {
                this.b.unlock();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0224 A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x009f, B:34:0x00a7, B:38:0x00b1, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00ce, B:49:0x00dc, B:53:0x00e7, B:55:0x00eb, B:57:0x00f3, B:59:0x00fe, B:61:0x0104, B:63:0x010e, B:70:0x0124, B:74:0x013f, B:65:0x0112, B:67:0x011b, B:82:0x0160, B:84:0x0170, B:87:0x0178, B:97:0x0194, B:101:0x01a1, B:103:0x01ca, B:105:0x01d6, B:113:0x020d, B:115:0x0224, B:117:0x0230, B:116:0x022d, B:108:0x01e6, B:110:0x01fa, B:111:0x01ff, B:89:0x0182, B:91:0x0188, B:78:0x0152, B:80:0x0158, B:46:0x00cc, B:48:0x00d7), top: B:138:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022d A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x009f, B:34:0x00a7, B:38:0x00b1, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00ce, B:49:0x00dc, B:53:0x00e7, B:55:0x00eb, B:57:0x00f3, B:59:0x00fe, B:61:0x0104, B:63:0x010e, B:70:0x0124, B:74:0x013f, B:65:0x0112, B:67:0x011b, B:82:0x0160, B:84:0x0170, B:87:0x0178, B:97:0x0194, B:101:0x01a1, B:103:0x01ca, B:105:0x01d6, B:113:0x020d, B:115:0x0224, B:117:0x0230, B:116:0x022d, B:108:0x01e6, B:110:0x01fa, B:111:0x01ff, B:89:0x0182, B:91:0x0188, B:78:0x0152, B:80:0x0158, B:46:0x00cc, B:48:0x00d7), top: B:138:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170 A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x009f, B:34:0x00a7, B:38:0x00b1, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00ce, B:49:0x00dc, B:53:0x00e7, B:55:0x00eb, B:57:0x00f3, B:59:0x00fe, B:61:0x0104, B:63:0x010e, B:70:0x0124, B:74:0x013f, B:65:0x0112, B:67:0x011b, B:82:0x0160, B:84:0x0170, B:87:0x0178, B:97:0x0194, B:101:0x01a1, B:103:0x01ca, B:105:0x01d6, B:113:0x020d, B:115:0x0224, B:117:0x0230, B:116:0x022d, B:108:0x01e6, B:110:0x01fa, B:111:0x01ff, B:89:0x0182, B:91:0x0188, B:78:0x0152, B:80:0x0158, B:46:0x00cc, B:48:0x00d7), top: B:138:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178 A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x009f, B:34:0x00a7, B:38:0x00b1, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00ce, B:49:0x00dc, B:53:0x00e7, B:55:0x00eb, B:57:0x00f3, B:59:0x00fe, B:61:0x0104, B:63:0x010e, B:70:0x0124, B:74:0x013f, B:65:0x0112, B:67:0x011b, B:82:0x0160, B:84:0x0170, B:87:0x0178, B:97:0x0194, B:101:0x01a1, B:103:0x01ca, B:105:0x01d6, B:113:0x020d, B:115:0x0224, B:117:0x0230, B:116:0x022d, B:108:0x01e6, B:110:0x01fa, B:111:0x01ff, B:89:0x0182, B:91:0x0188, B:78:0x0152, B:80:0x0158, B:46:0x00cc, B:48:0x00d7), top: B:138:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x009f, B:34:0x00a7, B:38:0x00b1, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00ce, B:49:0x00dc, B:53:0x00e7, B:55:0x00eb, B:57:0x00f3, B:59:0x00fe, B:61:0x0104, B:63:0x010e, B:70:0x0124, B:74:0x013f, B:65:0x0112, B:67:0x011b, B:82:0x0160, B:84:0x0170, B:87:0x0178, B:97:0x0194, B:101:0x01a1, B:103:0x01ca, B:105:0x01d6, B:113:0x020d, B:115:0x0224, B:117:0x0230, B:116:0x022d, B:108:0x01e6, B:110:0x01fa, B:111:0x01ff, B:89:0x0182, B:91:0x0188, B:78:0x0152, B:80:0x0158, B:46:0x00cc, B:48:0x00d7), top: B:138:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ambv r23, boolean r24, defpackage.amaq r25) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amaw.l(ambv, boolean, amaq):void");
    }

    @Override // defpackage.amco
    public final akry m() {
        return this.h;
    }

    @Override // defpackage.amco
    public final alyl n() {
        return this.j;
    }

    @Override // defpackage.amco
    public final boolean o(alyh alyhVar) {
        amci amciVar = this.v.c;
        return amciVar != null && amciVar.m(alyhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public alyg q(ambv ambvVar, alzt alztVar, bvnv bvnvVar) {
        byte[] a2;
        if ((alztVar.a.a & 8) != 0) {
            int v = v(alztVar.d);
            amzd bZ = amze.o.bZ();
            r(bZ, ambvVar.b(), ambvVar, alztVar, bvnvVar, v);
            amze bK = bZ.bK();
            if (ambvVar.a() == akry.SATELLITE || ambvVar.a() == akry.TERRAIN || ambvVar.a() == akry.TERRAIN_DARK) {
                a2 = alztVar.a(ambvVar.a());
            } else {
                a2 = alztVar.a.c.G();
            }
            alyo a3 = this.p.a(bK, this.h, ambvVar.b(), a2, ambvVar.g() ? akrx.UPDATED_FROM_NETWORK : akrx.NETWORK);
            if (a3.a() == alyn.IO_ERROR) {
                throw new IOException(String.format("Error unpacking network tile result for tile type %s and coords %s", this.h, ambvVar.b()));
            }
            if (a3.a() != alyn.SUCCESS) {
                throw new amas(String.format("Error unpacking network tile result for tile type %s and coords %s: %s", this.h, ambvVar.b(), a3.a()));
            }
            alyg f = a3.b().f();
            if (!ambvVar.m() && f != null) {
                this.v.b.o(ambvVar.b(), f);
            }
            N(ambvVar, true != ambvVar.g() ? 5 : 6);
            if (f != null) {
                int i = f.c().i;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                amze amzeVar = (amze) bZ.b;
                amzeVar.a |= 128;
                amzeVar.i = i;
                if ((bK.a & 8) == 0 || bK.e == -1) {
                    int i2 = f.c().e;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    amze amzeVar2 = (amze) bZ.b;
                    amzeVar2.a |= 8;
                    amzeVar2.e = i2;
                }
                bK = bZ.bK();
            }
            amby ambyVar = this.v;
            amci amciVar = ambyVar.c;
            amci amciVar2 = ambyVar.d;
            if (amciVar != null && amciVar.j()) {
                amciVar.b(bK, a2, bvnvVar);
            } else if (amciVar2 != null && amciVar2.j()) {
                amciVar2.b(bK, a2, bvnvVar);
            }
            s(f);
            if (!ambvVar.m()) {
                return f;
            }
            return null;
        }
        return null;
    }

    public final void r(amzd amzdVar, alyh alyhVar, ambv ambvVar, alzt alztVar, bvnv bvnvVar, int i) {
        amza a2 = alym.a(this.i, this.j, this.h.J, alyhVar, alztVar.b, alztVar.c);
        if (amzdVar.c) {
            amzdVar.bF();
            amzdVar.c = false;
        }
        amze amzeVar = (amze) amzdVar.b;
        amze amzeVar2 = amze.o;
        a2.getClass();
        amzeVar.b = a2;
        int i2 = amzeVar.a | 1;
        amzeVar.a = i2;
        int i3 = alztVar.a.d;
        if (i3 != 0) {
            amzeVar.a = i2 | 256;
            amzeVar.j = i3;
        } else {
            amzeVar.a = i2 & (-257);
            amzeVar.j = 0;
        }
        long a3 = this.c.a(this.h, bvnvVar);
        if (a3 != -1) {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar3 = (amze) amzdVar.b;
            amzeVar3.a |= 64;
            amzeVar3.h = a3;
        } else {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar4 = (amze) amzdVar.b;
            amzeVar4.a &= -65;
            amzeVar4.h = 0L;
        }
        long e = this.c.e(this.h, bvnvVar);
        if (e != -1) {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar5 = (amze) amzdVar.b;
            amzeVar5.a |= 32;
            amzeVar5.g = e;
        } else {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar6 = (amze) amzdVar.b;
            amzeVar6.a &= -33;
            amzeVar6.g = 0L;
        }
        dmxt dmxtVar = alztVar.a;
        if ((dmxtVar.a & 128) == 0) {
            amze amzeVar7 = (amze) amzdVar.b;
            amzeVar7.a &= -513;
            amzeVar7.k = amze.o.k;
        } else {
            String str = dmxtVar.f;
            amze amzeVar8 = (amze) amzdVar.b;
            str.getClass();
            amzeVar8.a |= 512;
            amzeVar8.k = str;
        }
        if (i != 0) {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar9 = (amze) amzdVar.b;
            amzeVar9.a |= 4;
            amzeVar9.d = i;
        } else {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar10 = (amze) amzdVar.b;
            amzeVar10.a &= -5;
            amzeVar10.d = 0;
        }
        if (ambvVar.i() != -1) {
            int i4 = ambvVar.i();
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar11 = (amze) amzdVar.b;
            amzeVar11.a |= 8;
            amzeVar11.e = i4;
            int i5 = ambvVar.i();
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar12 = (amze) amzdVar.b;
            amzeVar12.a |= 16;
            amzeVar12.f = i5;
        } else {
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar13 = (amze) amzdVar.b;
            int i6 = amzeVar13.a & (-9);
            amzeVar13.a = i6;
            amzeVar13.e = 0;
            amzeVar13.a = i6 & (-17);
            amzeVar13.f = 0;
        }
        dmxt dmxtVar2 = alztVar.a;
        if ((dmxtVar2.a & 64) != 0) {
            dspd dspdVar = dmxtVar2.e;
            amze amzeVar14 = (amze) amzdVar.b;
            dspdVar.getClass();
            amzeVar14.a |= 2048;
            amzeVar14.m = dspdVar;
        }
    }

    public final void s(@dzsi alyg alygVar) {
        if (alygVar == null || !alygVar.b().equals(akry.PERSONALIZED_SMARTMAPS)) {
            return;
        }
        amad amadVar = this.n;
        dbsk.s(amadVar);
        amadVar.a(alygVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(ambv ambvVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.o)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.E <= x) {
                return;
            }
            this.E = currentTimeMillis;
            this.D.run();
            return;
        }
        this.v.b.p(ambvVar.b());
        if (btzyVar.equals(btzy.h) || btzyVar.equals(btzy.m)) {
            this.e.b(ambvVar.b());
        } else {
            this.e.a(ambvVar.b());
        }
        G(ambvVar, 3, null, null);
        if (btzyVar.equals(btzy.m)) {
            z(ckgh.br, ambvVar);
        } else if (btzyVar.equals(btzy.h)) {
            z(ckgh.bs, ambvVar);
        } else if (!btzyVar.equals(btzy.j)) {
        } else {
            z(ckgh.bt, ambvVar);
        }
    }

    public final void u(ambv ambvVar, amze amzeVar) {
        this.v.b.o(ambvVar.b(), new alvx(amzeVar, ambvVar.a(), ambvVar.b(), akrx.UNKNOWN));
    }

    public final synchronized boolean w() {
        boolean z;
        int M = M(this.h, this.C.a().e());
        if (M != this.B) {
            this.B = M;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final boolean x() {
        return this.o > 0 || !this.h.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public alyg y(amcl amclVar, alyh alyhVar) {
        alyg n = amclVar.n(alyhVar);
        if (n == null) {
            return null;
        }
        if (amclVar.q(n)) {
            return n;
        }
        amza amzaVar = n.c().b;
        if (amzaVar == null) {
            amzaVar = amza.k;
        }
        if (!amzaVar.g.isEmpty()) {
            amza amzaVar2 = n.c().b;
            if (amzaVar2 == null) {
                amzaVar2 = amza.k;
            }
            if (!amzaVar2.c.isEmpty()) {
                amza amzaVar3 = n.c().b;
                if (amzaVar3 == null) {
                    amzaVar3 = amza.k;
                }
                if (amzaVar3.g.equals(this.w.a())) {
                    amza amzaVar4 = n.c().b;
                    if (amzaVar4 == null) {
                        amzaVar4 = amza.k;
                    }
                    if (amzaVar4.c.equals(bvom.a(Locale.getDefault()))) {
                        return n;
                    }
                }
                return null;
            }
        }
        return n;
    }

    public final void z(ckgz ckgzVar, ambv ambvVar) {
        ((ckco) this.s.a(ckgzVar)).a(ambvVar.a().I.Z);
    }
}
