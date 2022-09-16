package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sos  reason: default package */
/* loaded from: classes7.dex */
public class sos implements snc {
    static final cqiw<cqkp> b;
    static final cqix<?> c;
    private final wgh A;
    private final spk B;
    private final dxio<qbt> C;
    private final sqn D;
    private final spz E;
    private final ivf F;
    private final ahjq G;
    private final btvo H;
    private final ckco I;
    private final spb J;
    private dcdc<spi> O;
    private dcdc<cqix<?>> S;
    private int U;
    private boolean V;
    private boolean W;
    public final awwq d;
    public final awwn e;
    public final six f;
    public final bzmm g;
    public final Context h;
    public final cpv i;
    public sqw k;
    public final Handler l;
    public final siv m;
    private final bxtv o;
    private final btrm p;
    private final akfa q;
    private final ania r;
    private final Executor s;
    private final btpc t;
    private final bvjj u;
    private final acwt v;
    private final dxio<bxsd> w;
    private final snu x;
    private final wdt y;
    private final spt z;
    private static final spv n = spv.c(true, dnus.d);
    public static final long a = TimeUnit.SECONDS.toMillis(2);
    private dehn<dcdc<dpte>> K = deha.a(dcdc.e());
    private dehn<dcdc<dpte>> L = deha.a(dcdc.e());
    private dehn<dcdc<wdp>> M = deha.a(dcdc.e());
    private dehn<Boolean> N = deha.a(false);
    private dcdc<spi> P = dcdc.e();
    private boolean Q = false;
    @dzsi
    public spv j = null;
    @dzsi
    private snt R = null;

    static {
        int i = sjb.a;
        cqiw<cqkp> p = ict.p(false, cqgr.bq(cqrp.d(8.0d)), cqgr.z(ibm.g()));
        b = p;
        c = cqgr.fT(p, cqkp.T);
    }

    public sos(bxtv bxtvVar, akfa akfaVar, ania aniaVar, Executor executor, btpc btpcVar, bvjj bvjjVar, acwt acwtVar, final bxse bxseVar, snu snuVar, spt sptVar, wdt wdtVar, wgh wghVar, spk spkVar, dxio dxioVar, awwq awwqVar, sqn sqnVar, spz spzVar, ivg ivgVar, ahjq ahjqVar, btvo btvoVar, btrm btrmVar, six sixVar, bzmm bzmmVar, Context context, cpv cpvVar, ckcw ckcwVar, spb spbVar, siv sivVar) {
        snm snmVar = new snm();
        snmVar.a = null;
        snmVar.b = null;
        snmVar.c(-1L);
        this.k = snmVar.a();
        this.S = dcdc.e();
        this.U = 0;
        this.V = true;
        this.W = false;
        this.l = new Handler();
        this.E = spzVar;
        this.F = ivgVar.a(this);
        this.G = ahjqVar;
        this.o = bxtvVar;
        this.p = btrmVar;
        this.q = akfaVar;
        this.r = aniaVar;
        this.s = executor;
        this.t = btpcVar;
        this.u = bvjjVar;
        this.v = acwtVar;
        this.H = btvoVar;
        this.y = wdtVar;
        this.z = sptVar;
        this.A = wghVar;
        this.B = spkVar;
        this.C = dxioVar;
        this.d = awwqVar;
        this.D = sqnVar;
        this.f = sixVar;
        this.g = bzmmVar;
        this.h = context;
        this.i = cpvVar;
        this.I = (ckco) ckcwVar.a(ckjs.a);
        this.J = spbVar;
        this.m = sivVar;
        this.e = new son(this);
        this.w = btsp.b(new dbty(bxseVar) { // from class: snv
            private final bxse a;

            {
                this.a = bxseVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(dtyc.fK);
            }
        });
        this.x = snuVar;
    }

    private final boolean A() {
        return (this.A.b() || this.A.a()) && !B() && !C();
    }

    private final boolean B() {
        return btlu.i(this.q.j()) == btlt.SIGNED_OUT;
    }

    private final boolean C() {
        return !this.r.a();
    }

    public static amvh s(dnui dnuiVar) {
        akqq akqqVar;
        dpjx dpjxVar = dnuiVar.d;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        amvg P = amvh.P();
        if ((dpjxVar.a & 4) != 0) {
            dnoh dnohVar = dpjxVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            akqqVar = akqq.e(dnohVar);
        } else {
            akqqVar = null;
        }
        P.d = akqqVar;
        P.c = akqi.f(dpjxVar.c);
        return P.a();
    }

    public static boolean v(dpte dpteVar) {
        int a2 = dptd.a(dpteVar.b);
        boolean z = true;
        if (a2 != 1) {
            z = false;
        }
        if (a2 != 0) {
            return z;
        }
        throw null;
    }

    private final void w() {
        if (B()) {
            k(sns.SIGNED_OUT);
        } else if (!this.t.i()) {
            k(sns.OFFLINE);
        } else if (!this.G.s()) {
            k(sns.LOCATION_DISABLED);
        } else {
            this.R = null;
        }
    }

    private final void x(boolean z) {
        dcdc<spi> z2;
        dcdc<spi> dcdcVar = this.O;
        if (dcdcVar == null) {
            z2 = dcdc.e();
        } else {
            ArrayList arrayList = new ArrayList();
            snt sntVar = this.R;
            if (sntVar == null || sntVar.p() != sns.LOCATION_DISABLED) {
                dcdc z3 = dcbg.b(dcdcVar).o(new dbsl(this) { // from class: soi
                    private final sos a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return !this.a.m(((spi) obj).a());
                    }
                }).o(new dbsl(this) { // from class: soj
                    private final sos a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return !this.a.o(((spi) obj).a());
                    }
                }).z();
                int size = z3.size();
                for (int i = 0; i < size; i++) {
                    spi spiVar = (spi) z3.get(i);
                    arrayList.add(spi.c(spiVar.a(), dcbg.b(spiVar.b()).o(new dbsl(this) { // from class: sok
                        private final sos a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            sos sosVar = this.a;
                            sph sphVar = (sph) obj;
                            if (sphVar.a().b().c() != dqvj.DRIVE) {
                                amvh a2 = sphVar.a().b().a();
                                dbsk.s(a2);
                                return sosVar.m(a2);
                            }
                            return true;
                        }
                    }).z()));
                }
            } else {
                arrayList.addAll(dcdcVar);
            }
            z2 = dcbg.b(arrayList).o(sol.a).z();
        }
        this.P = z2;
        if (!z2.isEmpty()) {
            siv sivVar = this.m;
            sivVar.a(sivVar.d);
            spz spzVar = this.E;
            dcdc<spi> dcdcVar2 = this.P;
            final dbsz dbszVar = new dbsz(this) { // from class: soh
                private final sos a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    sos sosVar = this.a;
                    sosVar.j = (spv) obj;
                    siv sivVar2 = sosVar.m;
                    sivVar2.a(sivVar2.f);
                    sosVar.t();
                }
            };
            dbsk.l(!dcdcVar2.isEmpty());
            GmmLocation a2 = spzVar.b.a();
            awvw f = awvx.f();
            awws u = awwt.u();
            dccx F = dcdc.F();
            for (spi spiVar2 : dcdcVar2) {
                dbsk.l(!spiVar2.b().isEmpty());
                dnts bZ = dntv.d.bZ();
                dpjx I = spiVar2.a().I();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dntv dntvVar = (dntv) bZ.b;
                I.getClass();
                dntvVar.b = I;
                dntvVar.a |= 1;
                dcdc z4 = dcbg.b(spiVar2.b()).s(spx.a).z();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dntv dntvVar2 = (dntv) bZ.b;
                dsrj<dntu> dsrjVar = dntvVar2.c;
                if (!dsrjVar.a()) {
                    dntvVar2.c = dsqw.cl(dsrjVar);
                }
                dsod.bv(z4, dntvVar2.c);
                F.g(bZ.bK());
            }
            u.f(F.f());
            u.e(awvv.C);
            u.t(dcdc.f("go_tab"));
            f.e(u.a());
            if (a2 != null) {
                f.d(a2);
            }
            awvx a3 = f.a();
            if (z) {
                spzVar.a.c(a3, bvpj.b(new dbsz(dbszVar) { // from class: spw
                    private final dbsz a;

                    {
                        this.a = dbszVar;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        spz.b((awwb) obj, this.a);
                    }
                }), bvrj.UI_THREAD);
                t();
                return;
            }
            deha.q(spzVar.a.a(a3), new spy(dbszVar), spzVar.c);
            return;
        }
        this.j = n;
        t();
    }

    private final dbsg<Integer> y(amvh amvhVar) {
        akqq akqqVar = amvhVar.e;
        GmmLocation a2 = this.G.a();
        if (akqqVar == null || a2 == null) {
            return dbpy.a;
        }
        return dbsg.i(Integer.valueOf((int) a2.F(akqqVar)));
    }

    private static void z(ArrayList<cqix<?>> arrayList) {
        if (!arrayList.isEmpty()) {
            arrayList.add(c);
        }
    }

    @Override // defpackage.snb
    public dcdc<cqix<?>> a() {
        return this.S;
    }

    @Override // defpackage.izy
    public cqkl b() {
        w();
        x(false);
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.F.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.F.c();
    }

    @Override // defpackage.izy
    public long e() {
        return this.H.getSavedTripsParameters().g;
    }

    @Override // defpackage.snb
    public Integer f() {
        return Integer.valueOf(this.U);
    }

    @Override // defpackage.snc
    public void g(int i) {
        this.U = i;
        cqkx.p(this);
    }

    @Override // defpackage.snc
    public void h() {
        btrm btrmVar = this.p;
        dceq a2 = dcet.a();
        a2.b(azrh.class, new sot(azrh.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.v.b();
        j();
        c();
    }

    @Override // defpackage.snc
    public void i() {
        if (!this.M.isDone()) {
            this.M.cancel(true);
        }
        if (!this.K.isDone()) {
            this.K.cancel(true);
        }
        if (!this.L.isDone()) {
            this.L.cancel(true);
        }
        if (!this.N.isDone()) {
            this.N.cancel(true);
        }
        this.d.i(this.e);
        this.p.a(this);
        d();
    }

    public final void j() {
        dehn<Boolean> a2;
        if (A() && !this.u.o(bvjk.jM, this.q.j(), false)) {
            this.Q = true;
            this.u.T(bvjk.jM, this.q.j(), true);
        }
        w();
        if (A()) {
            this.M = this.y.c();
            this.y.f();
            deha.q(this.M, new soo(this), this.s);
        }
        snt sntVar = this.R;
        if (sntVar == null || sntVar.p() != sns.LOCATION_DISABLED) {
            spk spkVar = this.B;
            btlu j = spkVar.b.a().j();
            dklu dkluVar = spkVar.a.getHomeScreenParameters().f;
            if (dkluVar == null) {
                dkluVar = dklu.c;
            }
            if (!dkluVar.b) {
                a2 = deha.a(false);
            } else if (j == null || j.f != btlt.GOOGLE) {
                a2 = deha.a(false);
            } else if (!spkVar.d.b(j)) {
                a2 = deha.a(false);
            } else {
                srb srbVar = spkVar.c;
                final deig d = deig.d();
                srbVar.b.hasFeatures(j.s(), srb.a, new AccountManagerCallback(d) { // from class: sra
                    private final deig a;

                    {
                        this.a = d;
                    }

                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) {
                        deig deigVar = this.a;
                        String[] strArr = srb.a;
                        try {
                            deigVar.j((Boolean) accountManagerFuture.getResult());
                        } catch (Exception e) {
                            deigVar.k(e);
                        }
                    }
                }, srbVar.c);
                a2 = deew.h(d, spj.a, dege.a);
            }
            this.N = a2;
            deha.q(a2, new sop(this), this.s);
            dehn<dcdc<dpte>> a3 = this.o.a(this.V);
            this.K = a3;
            this.V = false;
            deha.q(a3, new soq(this), this.s);
            if (!B() && !C()) {
                dehn<dcdc<dpte>> b2 = this.o.b();
                this.L = b2;
                deha.q(b2, new sor(this), this.s);
            }
        }
        t();
    }

    public final void k(sns snsVar) {
        Runnable runnable = snsVar != sns.FAILED_TRIPS ? new Runnable(this) { // from class: soe
            private final sos a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j();
            }
        } : sof.a;
        snu snuVar = this.x;
        gga a2 = snuVar.a.a();
        snu.a(a2, 1);
        akfc a3 = snuVar.b.a();
        snu.a(a3, 2);
        gun a4 = snuVar.c.a();
        snu.a(a4, 3);
        snu.a(snsVar, 4);
        snu.a(runnable, 5);
        this.R = new snt(a2, a3, a4, snsVar, runnable);
        t();
    }

    public final void l(dcdc<wdp> dcdcVar) {
        dcdc<spi> z;
        spb spbVar = this.J;
        if (dcdcVar.isEmpty()) {
            z = dcdc.e();
        } else {
            cjst d = cjsu.d();
            d.d(ddda.fK);
            dcdg p = dcdn.p();
            Iterator<wdp> it = dcdcVar.iterator();
            boolean z2 = false;
            int i = 0;
            while (it.hasNext()) {
                dcdc<SavedTrip> b2 = it.next().b();
                int size = b2.size();
                int i2 = 0;
                while (i2 < size) {
                    SavedTrip savedTrip = b2.get(i2);
                    cjry e = cjrz.e();
                    e.b(ddcu.JQ);
                    ddzf bZ = ddzg.t.bZ();
                    ddiq bZ2 = ddir.d.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = z2;
                    }
                    ddir ddirVar = (ddir) bZ2.b;
                    ddirVar.a |= 2;
                    ddirVar.c = i;
                    Iterator<wdp> it2 = it;
                    long d2 = spb.a.a(savedTrip.a(), Charset.forName("UTF-8")).d();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddir ddirVar2 = (ddir) bZ2.b;
                    dcdc<SavedTrip> dcdcVar2 = b2;
                    ddirVar2.a |= 1;
                    ddirVar2.b = d2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddzg ddzgVar = (ddzg) bZ.b;
                    ddir bK = bZ2.bK();
                    bK.getClass();
                    ddzgVar.s = bK;
                    ddzgVar.b |= Integer.MIN_VALUE;
                    ((cjrn) e).a = bZ.bK();
                    d.f(e.a());
                    p.f(savedTrip.a(), Integer.valueOf(i));
                    i++;
                    i2++;
                    it = it2;
                    b2 = dcdcVar2;
                    z2 = false;
                }
            }
            final cjsu e2 = d.e();
            final dcdn b3 = p.b();
            spbVar.b.l(e2);
            z = dcbg.b(dcdcVar).s(new dbrn(e2, b3) { // from class: soz
                private final cjsu a;
                private final dcdn b;

                {
                    this.a = e2;
                    this.b = b3;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    final cjsu cjsuVar = this.a;
                    final dcdn dcdnVar = this.b;
                    wdp wdpVar = (wdp) obj;
                    final dbrn dbrnVar = new dbrn(cjsuVar, dcdnVar) { // from class: spa
                        private final cjsu a;
                        private final dcdn b;

                        {
                            this.a = cjsuVar;
                            this.b = dcdnVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            cjsu cjsuVar2 = this.a;
                            Integer num = (Integer) this.b.get((String) obj2);
                            dbsk.s(num);
                            String str = cjsuVar2.f(num.intValue()).d;
                            dbsk.s(str);
                            return str;
                        }
                    };
                    return spi.c(wdpVar.a(), dcbg.b(wdpVar.b()).s(new dbrn(dbrnVar) { // from class: spg
                        private final dbrn a;

                        {
                            this.a = dbrnVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            SavedTrip savedTrip2 = (SavedTrip) obj2;
                            return new snk(savedTrip2, (String) this.a.a(savedTrip2.a()));
                        }
                    }).z());
                }
            }).z();
        }
        this.O = z;
        x(true);
    }

    public final boolean m(amvh amvhVar) {
        if (amvhVar.k()) {
            return true;
        }
        dbsg<Integer> y = y(amvhVar);
        return y.a() && y.b().intValue() < this.H.getSavedTripsParameters().a;
    }

    public final boolean n(amvh amvhVar) {
        if (this.C.a().e().a() != dqvj.TRANSIT) {
            return m(amvhVar);
        }
        dbsg<Integer> y = y(amvhVar);
        return y.a() && y.b().intValue() < this.H.getSavedTripsParameters().e;
    }

    public final boolean o(amvh amvhVar) {
        dbsg<Integer> y = y(amvhVar);
        return y.a() && y.b().intValue() > this.H.getSavedTripsParameters().d;
    }

    public final void p() {
        sqv d = this.k.d();
        d.c(-1L);
        d.b(dcdc.e());
        this.k = d.a();
    }

    public final void q(dcdc<dpte> dcdcVar) {
        sqv d = this.k.d();
        d.d(dcbg.b(dcdcVar).o(som.a).o(snw.a).z());
        this.k = d.a();
        t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(final amvh amvhVar) {
        dcdc<spi> dcdcVar = this.O;
        if (dcdcVar == null) {
            return false;
        }
        return dcbg.b(dcdcVar).p(new dbsl(amvhVar) { // from class: snz
            private final amvh a;

            {
                this.a = amvhVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                amvh amvhVar2 = this.a;
                long j = sos.a;
                return ((spi) obj).a().e(amvhVar2, 1.0d);
            }
        });
    }

    public final void t() {
        dcdc e;
        dcdc r;
        dptg dptgVar;
        cqtd cqtdVar;
        ArrayList arrayList = new ArrayList();
        int i = 3;
        if (!A()) {
            e = dcdc.e();
        } else if (this.O == null) {
            spt sptVar = this.z;
            cqiv cqivVar = new cqiv();
            cqivVar.e(cqgr.fT(new sjy(), new spu(dcdc.f(cqgr.fT(new sku("placeholder"), sptVar.c.a(0, null, null, sps.TRIP_LOADING, spl.a))))));
            cqivVar.e(cqgr.fT(b, cqkp.T));
            sjy sjyVar = new sjy();
            slt sltVar = new slt();
            sql sqlVar = sptVar.b;
            Activity activity = (Activity) ((dxjd) sqlVar.a).a;
            sql.a(activity, 1);
            dxio a2 = ((dxjh) sqlVar.b).a();
            sql.a(a2, 2);
            dxio a3 = ((dxjh) sqlVar.c).a();
            sql.a(a3, 3);
            Executor a4 = sqlVar.d.a();
            sql.a(a4, 4);
            cqivVar.e(cqgr.fT(sjyVar, new spu(dcdc.f(cqgr.fT(sltVar, new sqk(activity, a2, a3, a4))))));
            e = dcdc.r(cqivVar.a);
        } else {
            dcdc<spi> dcdcVar = this.P;
            dccx dccxVar = new dccx();
            int size = dcdcVar.size();
            spi spiVar = null;
            spi spiVar2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                spi spiVar3 = dcdcVar.get(i2);
                if (spiVar3.a().b != dpjs.ENTITY_TYPE_HOME && spiVar3.a().b != dpjs.ENTITY_TYPE_WORK) {
                    dccxVar.g(spiVar3);
                }
                if (spiVar3.a().b == dpjs.ENTITY_TYPE_HOME) {
                    spiVar = spiVar3;
                }
                if (spiVar3.a().b == dpjs.ENTITY_TYPE_WORK) {
                    spiVar2 = spiVar3;
                }
            }
            dccx dccxVar2 = new dccx();
            if (spiVar != null) {
                dccxVar2.g(spiVar);
            }
            if (spiVar2 != null) {
                dccxVar2.g(spiVar2);
            }
            dccxVar2.i(dccxVar.f());
            dcdc f = dccxVar2.f();
            final spt sptVar2 = this.z;
            final spv spvVar = this.j;
            final acwt acwtVar = this.v;
            acwtVar.getClass();
            final Runnable runnable = new Runnable(acwtVar) { // from class: soc
                private final acwt a;

                {
                    this.a = acwtVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            };
            cqiv cqivVar2 = new cqiv();
            final int[] iArr = {0};
            final dbty dbtyVar = new dbty(iArr) { // from class: spr
                private final int[] a;

                {
                    this.a = iArr;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    int[] iArr2 = this.a;
                    int i3 = iArr2[0];
                    iArr2[0] = i3 + 1;
                    return Integer.valueOf(i3);
                }
            };
            gva.b(cqivVar2, dcbg.b(f).s(new dbrn(sptVar2, dbtyVar, spvVar, runnable) { // from class: spm
                private final spt a;
                private final dbty b;
                private final spv c;
                private final Runnable d;

                {
                    this.a = sptVar2;
                    this.b = dbtyVar;
                    this.c = spvVar;
                    this.d = runnable;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    cqiw sltVar2;
                    dnvk dnvkVar;
                    dnvk dnvkVar2;
                    dnvk dnvkVar3;
                    dnui dnuiVar;
                    dnui dnuiVar2;
                    spt sptVar3 = this.a;
                    dbty dbtyVar2 = this.b;
                    spv spvVar2 = this.c;
                    Runnable runnable2 = this.d;
                    spi spiVar4 = (spi) obj;
                    ArrayList arrayList2 = new ArrayList();
                    dbsg r2 = dcbg.b(spiVar4.b()).r(spn.a);
                    if (r2.a()) {
                        dnuq c2 = spt.c(spvVar2, (sph) r2.b());
                        sps b2 = sptVar3.b(spvVar2, (sph) r2.b(), c2);
                        sku skuVar = new sku(((sph) r2.b()).a().a());
                        sqf sqfVar = sptVar3.c;
                        int intValue = ((Integer) dbtyVar2.a()).intValue();
                        sph sphVar = (sph) r2.b();
                        if (c2 == null) {
                            dnuiVar2 = null;
                        } else {
                            if (c2.a == 2) {
                                dnuiVar = (dnui) c2.b;
                            } else {
                                dnuiVar = dnui.g;
                            }
                            dnuiVar2 = dnuiVar;
                        }
                        arrayList2.add(cqgr.fT(skuVar, sqfVar.a(intValue, sphVar, dnuiVar2, b2, runnable2)));
                    }
                    dcdc z = dcbg.b(spiVar4.b()).o(spo.a).z();
                    int size2 = z.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        sph sphVar2 = (sph) z.get(i3);
                        if (!arrayList2.isEmpty()) {
                            arrayList2.add(spt.a);
                        }
                        dnuq c3 = spt.c(spvVar2, sphVar2);
                        sps b3 = sptVar3.b(spvVar2, sphVar2, c3);
                        if (c3 != null) {
                            vtn vtnVar = sptVar3.d;
                            if (c3.a == 3) {
                                dnvkVar3 = (dnvk) c3.b;
                            } else {
                                dnvkVar3 = dnvk.e;
                            }
                            dnvj dnvjVar = dnvkVar3.d;
                            if (dnvjVar == null) {
                                dnvjVar = dnvj.c;
                            }
                            albv.h(vtnVar, dnvjVar.b);
                        }
                        sps spsVar = sps.TRIP_LOADING;
                        if (!b3.g) {
                            sltVar2 = new sln(sphVar2.a().a());
                        } else {
                            sltVar2 = new slt();
                        }
                        cqiw cqiwVar = sltVar2;
                        sql sqlVar2 = sptVar3.b;
                        int intValue2 = ((Integer) dbtyVar2.a()).intValue();
                        if (c3 == null) {
                            dnvkVar = null;
                        } else if (b3 == sps.DIRECTIONS_ERROR) {
                            dnvkVar = null;
                        } else {
                            if (c3.a == 3) {
                                dnvkVar2 = (dnvk) c3.b;
                            } else {
                                dnvkVar2 = dnvk.e;
                            }
                            dnvkVar = dnvkVar2;
                        }
                        Activity activity2 = (Activity) ((dxjd) sqlVar2.a).a;
                        sql.a(activity2, 1);
                        dxio a5 = ((dxjh) sqlVar2.b).a();
                        sql.a(a5, 2);
                        vxw a6 = sqlVar2.e.a();
                        sql.a(a6, 3);
                        btpc a7 = sqlVar2.f.a();
                        sql.a(a7, 4);
                        zuz a8 = sqlVar2.g.a();
                        sql.a(a8, 5);
                        zrt a9 = sqlVar2.h.a();
                        sql.a(a9, 6);
                        dxio a10 = ((dxjh) sqlVar2.c).a();
                        sql.a(a10, 7);
                        cqhn a11 = sqlVar2.i.a();
                        ArrayList arrayList3 = arrayList2;
                        sql.a(a11, 8);
                        gga a12 = sqlVar2.j.a();
                        sql.a(a12, 9);
                        Executor a13 = sqlVar2.d.a();
                        Runnable runnable3 = runnable2;
                        sql.a(a13, 10);
                        cpv a14 = sqlVar2.k.a();
                        sql.a(a14, 11);
                        bvjj a15 = sqlVar2.l.a();
                        sql.a(a15, 12);
                        sql.a(sphVar2, 14);
                        sql.a(b3, 16);
                        sql.a(runnable3, 17);
                        arrayList3.add(cqgr.fT(cqiwVar, new sqk(activity2, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, intValue2, sphVar2, dnvkVar, b3, runnable3)));
                        i3++;
                        runnable2 = runnable3;
                        arrayList2 = arrayList3;
                        sptVar3 = sptVar3;
                        dbtyVar2 = dbtyVar2;
                        spvVar2 = spvVar2;
                        size2 = size2;
                        z = z;
                        spu spuVar = spuVar;
                    }
                    return new spu(dcdc.r(arrayList2));
                }
            }).z(), new sjy(), b);
            e = dcdc.r(cqivVar2.a);
        }
        snt sntVar = this.R;
        if (sntVar == null || (sntVar.p() != sns.LOCATION_DISABLED && !e.isEmpty())) {
            this.I.a(ckjr.a(1));
        } else {
            arrayList.add(cqgr.fT(new sjl(), this.R));
            ckco ckcoVar = this.I;
            snt sntVar2 = this.R;
            dbsk.s(sntVar2);
            int ordinal = sntVar2.p().ordinal();
            if (ordinal == 0) {
                i = 2;
            } else if (ordinal != 1) {
                i = ordinal != 2 ? ordinal != 3 ? 1 : 5 : 4;
            }
            ckcoVar.a(Integer.valueOf(ckjr.a(i)).intValue());
        }
        if (!e.isEmpty()) {
            z(arrayList);
            arrayList.addAll(e);
        }
        boolean isEmpty = e.isEmpty();
        if (!C()) {
            if (this.k.b() != null) {
                dkvr dkvrVar = this.D.g.getSavedTripsParameters().h;
                if (dkvrVar == null) {
                    dkvrVar = dkvr.c;
                }
                final Collection dsrhVar = dkvrVar.a.size() == 0 ? sqn.a : new dsrh(dkvrVar.a, dkvr.b);
                dcdc<dnui> b2 = this.k.b();
                dbsk.s(b2);
                dcdc z = dcbg.b(b2).o(new dbsl(this, dsrhVar) { // from class: snx
                    private final sos a;
                    private final Collection b;

                    {
                        this.a = this;
                        this.b = dsrhVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        sos sosVar = this.a;
                        Collection collection = this.b;
                        dnui dnuiVar = (dnui) obj;
                        dnue dnueVar = dnuiVar.f;
                        if (dnueVar == null) {
                            dnueVar = dnue.b;
                        }
                        dqek b3 = dqek.b(dnueVar.a);
                        if (b3 == null) {
                            b3 = dqek.UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
                        }
                        return collection.contains(b3) && !sosVar.r(sos.s(dnuiVar)) && !sosVar.n(sos.s(dnuiVar));
                    }
                }).z();
                if (!z.isEmpty()) {
                    siv sivVar = this.m;
                    sivVar.a(sivVar.c);
                }
                dcdc<dpte> a5 = this.k.a();
                dcdc z2 = a5 == null ? null : dcbg.b(a5).o(new dbsl(this) { // from class: soa
                    private final sos a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        sos sosVar = this.a;
                        final amvh b3 = sqn.b((dpte) obj);
                        if (sosVar.n(b3) || sosVar.o(b3) || sosVar.r(b3)) {
                            return false;
                        }
                        if (sosVar.k.b() == null) {
                            return true;
                        }
                        dcdc<dnui> b4 = sosVar.k.b();
                        dbsk.s(b4);
                        if (b4.isEmpty()) {
                            return true;
                        }
                        dcdc<dnui> b5 = sosVar.k.b();
                        dbsk.s(b5);
                        return !dcbg.b(b5).p(new dbsl(b3) { // from class: sob
                            private final amvh a;

                            {
                                this.a = b3;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj2) {
                                return sos.s((dnui) obj2).e(this.a, 1.0d);
                            }
                        });
                    }
                }).z();
                if (z2 != null && !z2.isEmpty()) {
                    siv sivVar2 = this.m;
                    sivVar2.a(sivVar2.e);
                }
                sqn sqnVar = this.D;
                Runnable runnable2 = A() ? new Runnable(this) { // from class: sny
                    private final sos a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j();
                    }
                } : null;
                boolean z3 = !this.W;
                ArrayList arrayList2 = new ArrayList();
                int i3 = sqnVar.g.getSavedTripsParameters().f;
                if (!z.isEmpty()) {
                    arrayList2.add(cqgr.fT(new sms(), sqnVar.f.a(dcbg.b(z).p(sqm.a), z3)));
                }
                if (z.isEmpty() && z2 != null && !z2.isEmpty()) {
                    arrayList2.add(cqgr.fT(new sms(), sqnVar.f.a(false, z3)));
                }
                dcdc z4 = dcbg.b(z).x(i3).z();
                dccx dccxVar3 = new dccx();
                for (int i4 = 0; i4 < z4.size(); i4++) {
                    dnui dnuiVar = (dnui) z4.get(i4);
                    dnue dnueVar = dnuiVar.f;
                    if (dnueVar == null) {
                        dnueVar = dnue.b;
                    }
                    dqek b3 = dqek.b(dnueVar.a);
                    if (b3 == null) {
                        b3 = dqek.UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
                    }
                    cqtd cqtdVar2 = sqn.b.get(b3);
                    if (cqtdVar2 == null) {
                        int i5 = b3.g;
                        cqtd cqtdVar3 = sqn.b.get(dqek.RECENT_HISTORY);
                        dbsk.s(cqtdVar3);
                        cqtdVar = cqtdVar3;
                    } else {
                        cqtdVar = cqtdVar2;
                    }
                    dpjx dpjxVar = dnuiVar.d;
                    if (dpjxVar == null) {
                        dpjxVar = dpjx.n;
                    }
                    amvh M = amvh.M(dpjxVar, sqnVar.d);
                    String s = M.s(sqnVar.d.getResources());
                    String str = M.c;
                    if (str == null || s.equals(str)) {
                        str = "";
                    }
                    dccxVar3.g(sqnVar.e.a(i4, s, str, cqtdVar, ibm.u(), M, runnable2, dnuiVar.b, false));
                }
                if (z2 != null) {
                    dcdc z5 = dcbg.b(z2).x(i3 - z4.size()).z();
                    for (int i6 = 0; i6 < z5.size(); i6++) {
                        dpte dpteVar = (dpte) z5.get(i6);
                        int size2 = i6 + z4.size();
                        int a6 = dptd.a(dpteVar.b);
                        boolean z6 = a6 == 1;
                        if (a6 != 0) {
                            dbsk.a(z6);
                            cqtd cqtdVar4 = sqn.b.get(dqek.RECENT_HISTORY);
                            dbsk.s(cqtdVar4);
                            if (dpteVar.b == 4) {
                                dptgVar = (dptg) dpteVar.c;
                            } else {
                                dptgVar = dptg.q;
                            }
                            dccxVar3.g(sqnVar.e.a(size2, dptgVar.c, dptgVar.d, cqtdVar4, ibm.u(), sqn.b(dpteVar), runnable2, dpteVar.d, true));
                        } else {
                            throw null;
                        }
                    }
                }
                dcdc f2 = dccxVar3.f();
                int size3 = f2.size();
                int i7 = 0;
                boolean z7 = true;
                while (i7 < size3) {
                    sqt sqtVar = (sqt) f2.get(i7);
                    if (!z7) {
                        arrayList2.add(sqnVar.c);
                    }
                    arrayList2.add(cqgr.fT(new smi(), sqtVar));
                    i7++;
                    z7 = false;
                }
                r = dcdc.r(arrayList2);
            } else if (isEmpty) {
                sqn sqnVar2 = this.D;
                dccx F = dcdc.F();
                F.g(sqn.a());
                F.g(sqnVar2.c);
                F.g(sqn.a());
                r = F.f();
            } else {
                r = dcdc.e();
            }
            if (!r.isEmpty()) {
                z(arrayList);
                arrayList.addAll(r);
                if (!this.W) {
                    this.W = true;
                    new Handler().post(new Runnable(this) { // from class: sod
                        private final sos a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            sos sosVar = this.a;
                            sosVar.g.a(sosVar.f);
                        }
                    });
                }
            }
        }
        if (!B() && C()) {
            z(arrayList);
            arrayList.add(cqgr.fT(new bxkl(), this.w.a()));
        }
        if (this.Q || (arrayList.isEmpty() && this.k.b() != null)) {
            arrayList.add(0, cqgr.fT(new sja(), cqkp.T));
            if (arrayList.size() > 1) {
                arrayList.add(1, c);
            }
        }
        this.S = dcdc.r(arrayList);
        cqkx.p(this);
    }

    public void u(azrh azrhVar) {
        if (azrhVar.a() == 2 || azrhVar.a() == 1) {
            j();
        }
    }
}
