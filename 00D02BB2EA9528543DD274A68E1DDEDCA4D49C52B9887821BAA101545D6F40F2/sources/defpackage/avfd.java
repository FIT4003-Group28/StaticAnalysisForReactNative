package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avfd  reason: default package */
/* loaded from: classes2.dex */
public final class avfd implements avki {
    public final bvjj a;
    public final dxio<btvo> b;
    public final dxio<aver> c;
    public final dehn<avgx> d;
    @dzsi
    public final avzh e;
    public final avpt<dlrl> f;
    public final awmf g;
    public final Executor h;
    public final Executor i;
    public final avrw j;
    public final away k;
    public avfa m;
    @dzsi
    public crzp<awme> o;
    private final dxio<ahjq> q;
    private final avzo r;
    private final crzm<avkr> s;
    private final avll t;
    private final avkp u;
    private final cqat v;
    private final dxio<avaz> w;
    public final Object l = new Object();
    public final Object n = new Object();
    @dzsi
    public aveu p = null;

    public avfd(bvjj bvjjVar, dxio<btvo> dxioVar, dxio<aver> dxioVar2, dehn<avgx> dehnVar, @dzsi avzh avzhVar, avpt<dlrl> avptVar, awmf awmfVar, Executor executor, Executor executor2, avzg avzgVar, dxio<ahjq> dxioVar3, avzo avzoVar, crzm<avkr> crzmVar, avll avllVar, avkp avkpVar, cqat cqatVar, avrw avrwVar, dxio<avaz> dxioVar4, away awayVar) {
        this.a = bvjjVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dehnVar;
        this.e = avzhVar;
        this.f = avptVar;
        this.g = awmfVar;
        this.h = executor;
        this.i = executor2;
        this.q = dxioVar3;
        this.r = avzoVar;
        this.s = crzmVar;
        this.t = avllVar;
        this.u = avkpVar;
        this.v = cqatVar;
        this.j = avrwVar;
        this.w = dxioVar4;
        this.k = awayVar;
        this.m = avfa.e(new avfb(this, avzgVar), avzgVar);
    }

    public static void L(avfa avfaVar) {
        final avel c = avfaVar.c();
        final dlsw d = avfaVar.d();
        if (c.k()) {
            return;
        }
        c.g.Pk(new Runnable(c, d) { // from class: avdr
            private final avel a;
            private final dlsw b;

            {
                this.a = c;
                this.b = d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
                r3.a.y();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avdr.run():void");
            }
        }, c.i);
    }

    private static void S(avfa avfaVar, List<akqq> list, final dlpa dlpaVar) {
        final avel c = avfaVar.c();
        final dlsw d = avfaVar.d();
        if (c.k()) {
            return;
        }
        dlrm bZ = dlrn.b.bZ();
        for (akqq akqqVar : list) {
            bZ.a(akqqVar.r());
        }
        final dlrn bK = bZ.bK();
        c.g.Pk(new Runnable(c, d, bK, dlpaVar) { // from class: avdq
            private final avel a;
            private final dlsw b;
            private final dlrn c;
            private final dlpa d;

            {
                this.a = c;
                this.b = d;
                this.c = bK;
                this.d = dlpaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                avelVar.f.h(this.b, this.c, this.d);
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void A() {
        this.g.b();
    }

    @Override // defpackage.avij
    public final void B() {
        this.g.d();
    }

    @Override // defpackage.avij
    public final crzm<avkr> C() {
        return this.s;
    }

    @Override // defpackage.avij
    public final crzm<avlj> D() {
        return this.t.a();
    }

    @Override // defpackage.avij
    public final crzm<avko> E() {
        return this.u.a.a;
    }

    @Override // defpackage.avij
    public final void F(avlm avlmVar, Executor executor) {
        this.t.b.a(avlmVar, executor);
    }

    @Override // defpackage.avij
    public final void G(avlm avlmVar) {
        this.t.b.c(avlmVar);
    }

    @Override // defpackage.avjl
    public final void H(dluy dluyVar) {
        M().c().d(dluyVar);
    }

    @Override // defpackage.avki
    public final void I(final dlsw dlswVar, final boolean z, dbsg<avid> dbsgVar, final avii aviiVar) {
        final avel c = M().c();
        if (c.l(dlswVar)) {
            aviiVar.c();
            return;
        }
        final avpy d = c.o.d(dltz.MANUAL);
        if (dbsgVar.a()) {
            d.b(avel.m(dbsgVar.b()), c.i);
        }
        c.g.Pk(new Runnable(c, dlswVar, z, d, aviiVar) { // from class: avde
            private final avel a;
            private final dlsw b;
            private final boolean c;
            private final avii d;
            private final avpy e;

            {
                this.a = c;
                this.b = dlswVar;
                this.c = z;
                this.e = d;
                this.d = aviiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                dlsw dlswVar2 = this.b;
                boolean z2 = this.c;
                avpy avpyVar = this.e;
                avii aviiVar2 = this.d;
                dbsg i = dbsg.i(avpyVar);
                avelVar.e.a().e(z2 ? 3 : 1, avkh.a, avqt.c((avpy) ((dbsu) i).a, aviiVar2), dlswVar2, 0);
            }
        }, c.i);
    }

    @Override // defpackage.avki
    public final void J(final avii aviiVar) {
        avfa M = M();
        final avel c = M.c();
        final dlsw d = M.d();
        if (c.k()) {
            aviiVar.c();
        } else {
            c.g.Pk(new Runnable(c, aviiVar, d) { // from class: avdk
                private final avel a;
                private final avii b;
                private final dlsw c;

                {
                    this.a = c;
                    this.b = aviiVar;
                    this.c = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    avel avelVar = this.a;
                    avii aviiVar2 = this.b;
                    dlsw dlswVar = this.c;
                    avelVar.f.d();
                    avelVar.e.a().a(aviiVar2, dlswVar);
                }
            }, c.i);
        }
    }

    @Override // defpackage.avki
    public final void K() {
        L(M());
    }

    public final avfa M() {
        avfa avfaVar;
        synchronized (this.l) {
            avfaVar = this.m;
        }
        return avfaVar;
    }

    @Override // defpackage.avki
    public final void N(final awjr awjrVar) {
        final avel c = M().c();
        if (c.k()) {
            awjv awjvVar = awjrVar.a.d;
            avzg l = awjvVar.o.l();
            if (l == null || l.a().a() == null || !l.a().d() || l.a().c()) {
                ((ckcn) awjvVar.f.a(ckia.m)).a();
            } else {
                ((ckcn) awjvVar.f.a(ckia.n)).a();
            }
            awjrVar.a.d.b(avjg.NOT_LOGGED_IN);
            return;
        }
        c.g.Pk(new Runnable(c, awjrVar) { // from class: avdm
            private final avel a;
            private final awjr b;

            {
                this.a = c;
                this.b = awjrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                dkrv dkrvVar;
                awid awidVar;
                dehn<Boolean> a;
                avel avelVar = this.a;
                awjr awjrVar2 = this.b;
                avek avekVar = new avek(avelVar);
                awju awjuVar = awjrVar2.a;
                avkc l2 = awjuVar.d.l.l();
                dbsk.s(l2);
                if (awjuVar.a.c) {
                    z = l2.a();
                } else {
                    z = l2.d() == 1;
                }
                boolean z2 = awjuVar.d.h.b() >= 30 || awjuVar.d.h.a();
                boolean m = awjuVar.d.e.m(bvjk.ew, false);
                dksh offlineMapsParameters = awjuVar.d.g.getOfflineMapsParameters();
                if (offlineMapsParameters == null) {
                    dkrvVar = null;
                } else {
                    dkrvVar = offlineMapsParameters.t;
                    if (dkrvVar == null) {
                        dkrvVar = dkrv.f;
                    }
                }
                boolean z3 = dkrvVar != null && dkrvVar.a;
                if (m && z2 && z && z3) {
                    awjuVar.d.k.C();
                    awjuVar.d.e.S(bvjk.ew, false);
                }
                awic awicVar = awjuVar.d.m;
                avjq b = avjq.b(awjuVar.a.e);
                if (b == null) {
                    b = avjq.UNKNOWN_BATTERY_CHECK;
                }
                int ordinal = b.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    awidVar = awicVar.b;
                } else {
                    awidVar = ordinal != 2 ? awicVar.b : awicVar.a;
                }
                if (awjuVar.a.d) {
                    a = awidVar.a();
                } else {
                    a = deha.a(true);
                }
                bvqd.a(a, awjuVar.d.c);
                deha.q(a, new awjt(awjuVar, z, avekVar), awjuVar.d.c);
            }
        }, c.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202 A[SYNTHETIC] */
    @Override // defpackage.btph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NX(java.lang.String r13, java.io.PrintWriter r14) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avfd.NX(java.lang.String, java.io.PrintWriter):void");
    }

    @Override // defpackage.avki
    public final void O(final awhy awhyVar) {
        avfa M = M();
        final avel c = M.c();
        final dlsw d = M.d();
        c.g.Pk(new Runnable(c, d, awhyVar) { // from class: avdn
            private final avel a;
            private final dlsw b;
            private final awhy c;

            {
                this.a = c;
                this.b = d;
                this.c = awhyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                dlsw dlswVar = this.b;
                awhy awhyVar2 = this.c;
                long j = Long.MAX_VALUE;
                for (dltm dltmVar : avelVar.g(dlswVar)) {
                    if (avelVar.k.a(dltmVar)) {
                        j = Math.min(j, dltmVar.h);
                    }
                }
                long b = avelVar.a.b();
                deig deigVar = awhyVar2.a;
                btoy btoyVar = awhyVar2.b;
                int i = j - b > awhz.a ? 75 : 50;
                boolean z = false;
                double intExtra = btoyVar.a.getIntExtra("level", 0);
                double intExtra2 = btoyVar.a.getIntExtra("scale", 0);
                Double.isNaN(intExtra);
                Double.isNaN(intExtra2);
                if ((intExtra / intExtra2) * 100.0d >= i) {
                    z = true;
                }
                deigVar.j(Boolean.valueOf(z));
            }
        }, c.i);
    }

    @Override // defpackage.avki
    public final void P(final dlsw dlswVar, final dlog dlogVar, final int i, final avkh avkhVar, final avii aviiVar) {
        final avel c = M().c();
        if (c.l(dlswVar)) {
            aviiVar.c();
        } else {
            c.g.Pk(new Runnable(c, dlswVar, dlogVar, avkhVar, aviiVar, i) { // from class: avdf
                private final avel a;
                private final dlsw b;
                private final dlog c;
                private final avkh d;
                private final avii e;
                private final int f;

                {
                    this.a = c;
                    this.b = dlswVar;
                    this.c = dlogVar;
                    this.d = avkhVar;
                    this.e = aviiVar;
                    this.f = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    avel avelVar = this.a;
                    dlsw dlswVar2 = this.b;
                    dlog dlogVar2 = this.c;
                    avkh avkhVar2 = this.d;
                    avii aviiVar2 = this.e;
                    int i2 = this.f;
                    avol avolVar = avelVar.f;
                    try {
                        avolVar.c.u(avolVar.b, dlswVar2.bS(), dlogVar2.bS());
                    } catch (Exception e) {
                        avolVar.a("markUpdateDynamic", e);
                    }
                    avelVar.e.a().e(1, avkhVar2, avqt.c(avelVar.o.d(dltz.DYNAMIC), aviiVar2), dlswVar2, i2);
                }
            }, c.i);
        }
    }

    @Override // defpackage.avki
    public final dehn<Void> Q(final dspd dspdVar, final dlug dlugVar, final String str, final dlsw dlswVar) {
        final avel c = M().c();
        return deew.g(deew.h(degp.q(c.g), new dbrn(c, dlswVar, dspdVar, dlugVar, str) { // from class: avec
            private final avel a;
            private final dlsw b;
            private final dspd c;
            private final dlug d;
            private final String e;

            {
                this.a = c;
                this.b = dlswVar;
                this.c = dspdVar;
                this.d = dlugVar;
                this.e = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avel avelVar = this.a;
                dlsw dlswVar2 = this.b;
                dspd dspdVar2 = this.c;
                dlug dlugVar2 = this.d;
                String str2 = this.e;
                avrx avrxVar = (avrx) obj;
                if (avelVar.l(dlswVar2)) {
                    dloo bZ = dlor.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dlor dlorVar = (dlor) bZ.b;
                    dlorVar.b = 0;
                    dlorVar.a |= 1;
                    return bZ.bK();
                }
                avol avolVar = avelVar.f;
                dlom bZ2 = dlon.g.bZ();
                dbsk.s(str2);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dlon dlonVar = (dlon) bZ2.b;
                str2.getClass();
                int i = dlonVar.a | 2;
                dlonVar.a = i;
                dlonVar.c = str2;
                dspdVar2.getClass();
                int i2 = i | 1;
                dlonVar.a = i2;
                dlonVar.b = dspdVar2;
                dlugVar2.getClass();
                dlonVar.e = dlugVar2;
                int i3 = i2 | 8;
                dlonVar.a = i3;
                dlswVar2.getClass();
                dlonVar.d = dlswVar2;
                int i4 = i3 | 4;
                dlonVar.a = i4;
                dlonVar.a = i4 | 16;
                dlonVar.f = true;
                try {
                    return (dlor) dsqw.cq(dlor.c, avolVar.c.s(avolVar.b, bZ2.bK().bS()));
                } catch (Exception e) {
                    avolVar.a("addRegion", e);
                    dloo bZ3 = dlor.c.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dlor dlorVar2 = (dlor) bZ3.b;
                    dlorVar2.b = 0;
                    dlorVar2.a |= 1;
                    return bZ3.bK();
                }
            }
        }, c.i), avev.a, this.i);
    }

    @Override // defpackage.avij
    public final dehn<Void> R(dspd dspdVar, dlug dlugVar, String str) {
        dehn<Void> Q = Q(dspdVar, dlugVar, str, M().d());
        deha.q(Q, new avey(this), this.i);
        return Q;
    }

    public final void a(avfa avfaVar, final awme awmeVar) {
        if (awmeVar.b() > 0) {
            final avel c = avfaVar.c();
            final dlsw d = avfaVar.d();
            if (!c.k()) {
                c.g.Pk(new Runnable(c, d, awmeVar) { // from class: avdh
                    private final avel a;
                    private final dlsw b;
                    private final awme c;

                    {
                        this.a = c;
                        this.b = d;
                        this.c = awmeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        avel avelVar = this.a;
                        dlsw dlswVar = this.b;
                        awme awmeVar2 = this.c;
                        avar a = avelVar.j.a();
                        dlua dluaVar = (dlua) dcft.d(avelVar.e(dlswVar).a, dlua.h);
                        dbsk.s(dluaVar);
                        int a2 = dlpv.a(dluaVar.e);
                        boolean z = false;
                        if (a2 != 0 && a2 == 3) {
                            z = true;
                        }
                        int a3 = dltx.a(dluaVar.b);
                        if (a3 == 0 || a3 != 2) {
                            a.d.a(null, null);
                            return;
                        }
                        dltz b = dltz.b(dluaVar.c);
                        if (b == null) {
                            b = dltz.AUTOMATIC;
                        }
                        if (b != dltz.MANUAL || !eaow.e(a.b.b() - dluaVar.g).p(avar.a)) {
                            if (awmeVar2.a() > 0) {
                                a.d.a(null, null);
                                return;
                            } else {
                                a.c.b(z);
                                return;
                            }
                        }
                        a.d.b();
                    }
                }, c.i);
            }
            GmmLocation a = this.q.a() != null ? this.q.a().a() : null;
            if (a == null) {
                return;
            }
            dcdc f = dcdc.f(new akqq(a.getLatitude(), a.getLongitude()));
            dloy bZ = dlpa.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlpa dlpaVar = (dlpa) bZ.b;
            dlpaVar.b = 1;
            dlpaVar.a = 1 | dlpaVar.a;
            S(avfaVar, f, bZ.bK());
        }
    }

    @Override // defpackage.avij
    public final void b(dspd dspdVar, dlug dlugVar, String str, final boolean z, final avid avidVar) {
        final dlsw d = M().d();
        final avaz a = this.w.a();
        bvqj.c(deee.g(deew.h(degp.q(a.a.Q(dspdVar, dlugVar, str, d)), new dbrn(a, d, z, avidVar) { // from class: avat
            private final avaz a;
            private final dlsw b;
            private final boolean c;
            private final avid d;

            {
                this.a = a;
                this.b = d;
                this.c = z;
                this.d = avidVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avaz avazVar = this.a;
                dlsw dlswVar = this.b;
                Void r5 = (Void) obj;
                avazVar.b.a(dlswVar.b, this.c, this.d);
                EnumSet<cvhz> enumSet = awmj.a;
                return null;
            }
        }, a.f), avlo.class, new dbrn(a, avidVar) { // from class: avau
            private final avaz a;
            private final avid b;

            {
                this.a = a;
                this.b = avidVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avaz avazVar = this.a;
                avid avidVar2 = this.b;
                int i = ((avlo) obj).a.e;
                avazVar.c.h();
                avidVar2.b(true);
                EnumSet<cvhz> enumSet = awmj.a;
                return null;
            }
        }, a.f), avav.a, a.f);
    }

    @Override // defpackage.avij
    public final void d(dspd dspdVar, final boolean z) {
        final avaz a = this.w.a();
        final dlsw d = M().d();
        bvqj.c(a.a.j(dcdc.f(dspdVar)), new bvqg(a, d, z) { // from class: avaw
            private final avaz a;
            private final dlsw b;
            private final boolean c;

            {
                this.a = a;
                this.b = d;
                this.c = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                avaz avazVar = this.a;
                dlsw dlswVar = this.b;
                Void r4 = (Void) obj;
                avazVar.b.a(dlswVar.b, this.c, null);
            }
        }, a.f);
    }

    @Override // defpackage.avij
    public final void e(final boolean z) {
        final avaz a = this.w.a();
        final dlsw d = M().d();
        bvqj.c(a.a.o(), new bvqg(a, d, z) { // from class: avax
            private final avaz a;
            private final dlsw b;
            private final boolean c;

            {
                this.a = a;
                this.b = d;
                this.c = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final avaz avazVar = this.a;
                final dlsw dlswVar = this.b;
                final boolean z2 = this.c;
                ArrayList arrayList = new ArrayList();
                for (dltm dltmVar : (List) obj) {
                    dlsw dlswVar2 = dltmVar.s;
                    if (dlswVar2 == null) {
                        dlswVar2 = dlsw.d;
                    }
                    if (dlswVar2.equals(dlswVar) && avzo.c(dltmVar, avazVar.e.b())) {
                        arrayList.add(dltmVar.b);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bvqj.c(avazVar.a.j(arrayList), new bvqg(avazVar, dlswVar, z2) { // from class: avay
                        private final avaz a;
                        private final dlsw b;
                        private final boolean c;

                        {
                            this.a = avazVar;
                            this.b = dlswVar;
                            this.c = z2;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            avaz avazVar2 = this.a;
                            dlsw dlswVar3 = this.b;
                            Void r4 = (Void) obj2;
                            avazVar2.b.a(dlswVar3.b, this.c, null);
                        }
                    }, avazVar.f);
                }
            }
        }, a.f);
    }

    @Override // defpackage.avki
    public final dehn<dlqi> f(final dlsw dlswVar, final akqq akqqVar) {
        final avel c = M().c();
        if (c.l(dlswVar)) {
            return deha.a(dlqi.c);
        }
        return deew.h(c.g, new dbrn(c, dlswVar, akqqVar) { // from class: avdg
            private final avel a;
            private final dlsw b;
            private final akqq c;

            {
                this.a = c;
                this.b = dlswVar;
                this.c = akqqVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avel avelVar = this.a;
                dlsw dlswVar2 = this.b;
                akqq akqqVar2 = this.c;
                avrx avrxVar = (avrx) obj;
                avol avolVar = avelVar.f;
                try {
                    return (dlqi) dsqw.cq(dlqi.c, avolVar.c.l(avolVar.b, dlswVar2.bS(), akqqVar2.a, akqqVar2.b));
                } catch (Exception e) {
                    avolVar.a("dynamicPaddingLocationStatus", e);
                    return dlqi.c;
                }
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void g() {
    }

    @Override // defpackage.avij
    public final void h() {
        avfa M = M();
        final avel c = M.c();
        final dlsw d = M.d();
        if (c.k()) {
            return;
        }
        c.g.Pk(new Runnable(c, d) { // from class: avee
            private final avel a;
            private final dlsw b;

            {
                this.a = c;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                dlsw dlswVar = this.b;
                awkw a = avelVar.d.a();
                String str = dlswVar.b;
                try {
                    bbo bboVar = new bbo();
                    bboVar.a.put("downloadQueued", true);
                    bboVar.e("accountId", str);
                    bbk bbkVar = new bbk();
                    bbkVar.c = a.a.f() ? 3 : 2;
                    a.b.a(bboVar, bbkVar).get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void i(dspd dspdVar) {
        M().c().b(dcdc.f(dspdVar));
    }

    @Override // defpackage.avki
    public final dehn<Void> j(final Iterable<dspd> iterable) {
        final avel c = M().c();
        return deew.h(degp.q(c.g), new dbrn(c, iterable) { // from class: aved
            private final avel a;
            private final Iterable b;

            {
                this.a = c;
                this.b = iterable;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avel avelVar = this.a;
                avrx avrxVar = (avrx) obj;
                for (dspd dspdVar : this.b) {
                    avelVar.f.g(dspdVar);
                }
                return null;
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void k() {
        M().c().c();
    }

    @Override // defpackage.avij
    public final void l(final dspd dspdVar, final String str) {
        final avel c = M().c();
        if (c.k()) {
            return;
        }
        c.g.Pk(new Runnable(c, dspdVar, str) { // from class: avcu
            private final avel a;
            private final dspd b;
            private final String c;

            {
                this.a = c;
                this.b = dspdVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                dspd dspdVar2 = this.b;
                String str2 = this.c;
                avol avolVar = avelVar.f;
                try {
                    avolVar.c.w(avolVar.b, dspdVar2.G(), str2);
                } catch (Exception e) {
                    avolVar.a("renameRegion", e);
                }
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void m(final List<GmmLocation> list, final avig avigVar) {
        avfa M = M();
        final avel c = M.c();
        final dlsw d = M.d();
        if (c.k()) {
            return;
        }
        c.g.Pk(new Runnable(c, avigVar, d, list) { // from class: avcw
            private final avel a;
            private final avig b;
            private final dlsw c;
            private final List d;

            {
                this.a = c;
                this.b = avigVar;
                this.c = d;
                this.d = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final avel avelVar = this.a;
                avig avigVar2 = this.b;
                dlsw dlswVar = this.c;
                final List list2 = this.d;
                avigVar2.a((dltm) dcft.l(avelVar.g(dlswVar), new dbsl(avelVar, list2) { // from class: avea
                    private final avel a;
                    private final List b;

                    {
                        this.a = avelVar;
                        this.b = list2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        final avel avelVar2 = this.a;
                        List list3 = this.b;
                        final dltm dltmVar = (dltm) obj;
                        if (dltmVar == null || dltmVar.r) {
                            return false;
                        }
                        return dcft.k(list3, new dbsl(avelVar2, dltmVar) { // from class: aveb
                            private final avel a;
                            private final dltm b;

                            {
                                this.a = avelVar2;
                                this.b = dltmVar;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj2) {
                                avel avelVar3 = this.a;
                                dltm dltmVar2 = this.b;
                                GmmLocation gmmLocation = (GmmLocation) obj2;
                                if (gmmLocation != null) {
                                    avzm avzmVar = avelVar3.m;
                                    dlug dlugVar = dltmVar2.c;
                                    if (dlugVar == null) {
                                        dlugVar = dlug.c;
                                    }
                                    return avzmVar.a(dlugVar).a(gmmLocation.B());
                                }
                                return false;
                            }
                        });
                    }
                }, null));
            }
        }, c.i);
    }

    @Override // defpackage.avij
    public final void n(final dspd dspdVar, final avif avifVar) {
        final avel c = M().c();
        if (c.k()) {
            return;
        }
        c.g.Pk(new Runnable(c, dspdVar, avifVar) { // from class: avcx
            private final avel a;
            private final dspd b;
            private final avif c;

            {
                this.a = c;
                this.b = dspdVar;
                this.c = avifVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                dspd dspdVar2 = this.b;
                avif avifVar2 = this.c;
                avelVar.f.g(dspdVar2);
                avifVar2.a();
            }
        }, c.i);
    }

    @Override // defpackage.avki
    public final dehn<List<dltm>> o() {
        final avel c = M().c();
        return deew.h(c.g, new dbrn(c) { // from class: avcy
            private final avel a;

            {
                this.a = c;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avrx avrxVar = (avrx) obj;
                return this.a.f();
            }
        }, c.h);
    }

    @Override // defpackage.avki
    public final dehn<dlrj> p(dlsw dlswVar) {
        return M().c().h(dlswVar);
    }

    @Override // defpackage.avij
    public final boolean q() {
        return !M().c().f.k();
    }

    @Override // defpackage.avij
    public final degp<Boolean> r() {
        avel c = M().c();
        if (c.a().equals(avze.h())) {
            return degp.q(deha.a(false));
        }
        final avpn avpnVar = c.c;
        final avze a = c.a();
        final degp q = degp.q(avpnVar.g.c(new Callable(avpnVar, a) { // from class: avpk
            private final avpn a;
            private final avze b;

            {
                this.a = avpnVar;
                this.b = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                avpn avpnVar2 = this.a;
                avze avzeVar = this.b;
                if (avzeVar.f()) {
                    return Long.valueOf(bvog.d(avpnVar2.f));
                }
                return Long.valueOf(avzeVar.e() ? bvog.l(avpnVar2.f) : 0L);
            }
        }));
        final avpn avpnVar2 = c.c;
        final avze a2 = c.a();
        final degp q2 = degp.q(avpnVar2.g.c(new Callable(avpnVar2, a2) { // from class: avpj
            private final avpn a;
            private final avze b;

            {
                this.a = avpnVar2;
                this.b = a2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                avpn avpnVar3 = this.a;
                avze avzeVar = this.b;
                if (!avzeVar.e() || bvog.h(avpnVar3.f) == null) {
                    return Long.valueOf(avzeVar.f() ? bvog.d(avpnVar3.f) : 0L);
                }
                return Long.valueOf(bvog.l(avpnVar3.f));
            }
        }));
        final avpn avpnVar3 = c.c;
        final avze a3 = c.a();
        final degp q3 = degp.q(avpnVar3.g.c(new Callable(avpnVar3, a3) { // from class: avpl
            private final avpn a;
            private final avze b;

            {
                this.a = avpnVar3;
                this.b = a3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(!dbsd.a(this.b, avze.a) ? bvog.d(this.a.f) : 0L);
            }
        }));
        return degp.q(deha.m(q, q2, q3).b(new Callable(q2, q, q3) { // from class: avdc
            private final degp a;
            private final degp b;
            private final degp c;

            {
                this.a = q2;
                this.b = q;
                this.c = q3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                degp degpVar = this.a;
                degp degpVar2 = this.b;
                degp degpVar3 = this.c;
                eaow eaowVar = avel.q;
                long longValue = ((Long) degpVar.get()).longValue();
                boolean z = false;
                if (longValue >= 209715200 && ((Long) degpVar2.get()).longValue() >= 209715200 && ((Long) degpVar3.get()).longValue() >= 10485760) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, c.h));
    }

    @Override // defpackage.avij
    public final long s() {
        return this.a.w(bvjk.er, 0L);
    }

    @Override // defpackage.avij
    public final void t(final avie avieVar) {
        avfa M = M();
        final avel c = M.c();
        final dlsw d = M.d();
        c.g.Pk(new Runnable(c, avieVar, d) { // from class: avdd
            private final avel a;
            private final avie b;
            private final dlsw c;

            {
                this.a = c;
                this.b = avieVar;
                this.c = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(dcft.a(dcft.i(this.a.g(this.c), avdz.a)) >= 25);
            }
        }, c.h);
    }

    @Override // defpackage.avij
    public final void u(List<akqq> list, dlpa dlpaVar) {
        S(M(), list, dlpaVar);
    }

    @Override // defpackage.avij
    public final dehn<Void> v() {
        avfa M = M();
        try {
            avel c = M.c();
            if (!c.l(M.d())) {
                awhl awhlVar = c.n;
                c.a();
            }
            this.v.d();
            return deha.a(null);
        } catch (IOException e) {
            e.toString();
            return deha.b(new avlo(drtc.NOT_FOUND, e));
        }
    }

    @Override // defpackage.avij
    public final degp<Boolean> w() {
        final avel c = M().c();
        final deig d = deig.d();
        c.g.Pk(new Runnable(c, d) { // from class: avds
            private final avel a;
            private final deig b;

            {
                this.a = c;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avel avelVar = this.a;
                deig deigVar = this.b;
                for (dltm dltmVar : avelVar.f()) {
                    if (avelVar.k.a(dltmVar)) {
                        deigVar.j(true);
                        return;
                    }
                }
                deigVar.j(false);
            }
        }, dege.a);
        return degp.q(d);
    }

    @Override // defpackage.avij
    public final degp<dloe> x() {
        final avel c = M().c();
        if (c.k()) {
            return degp.q(deha.a(dloe.a));
        }
        final deig d = deig.d();
        c.g.Pk(new Runnable(c, d) { // from class: avdt
            private final avel a;
            private final deig b;

            {
                this.a = c;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dloe dloeVar;
                avel avelVar = this.a;
                deig deigVar = this.b;
                avol avolVar = avelVar.f;
                try {
                    dloeVar = (dloe) dsqw.cq(dloe.a, avolVar.c.D(avolVar.b, dlqu.a.bS()));
                } catch (Exception e) {
                    avolVar.a("getClientCapabilities", e);
                    dloeVar = dloe.a;
                }
                deigVar.j(dloeVar);
            }
        }, c.i);
        return degp.q(d);
    }

    @Override // defpackage.avij
    public final void y() {
        this.g.a();
    }

    @Override // defpackage.avij
    public final void z() {
        this.g.c();
    }
}
