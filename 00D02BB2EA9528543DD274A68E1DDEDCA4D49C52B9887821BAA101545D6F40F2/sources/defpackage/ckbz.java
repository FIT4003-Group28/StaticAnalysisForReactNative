package defpackage;

import android.app.Application;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ckbz  reason: default package */
/* loaded from: classes.dex */
public final class ckbz implements ckcw {
    private final ckbu A;
    private final ddyq B;
    private final List<ckhc> D;
    private final dxio<buhr> E;
    private final cqat F;
    private final dbsg<ckcz> G;
    private final dzsj<dbsg<coxz>> H;
    private final dehq I;
    @dzsi
    private cnkr J;
    private final dxio<btvo> K;
    private final dxio<crzb> L;
    private List<Integer> M;
    @dzsi
    private dehu N;
    public final Application a;
    public final dzsj<duxm> b;
    public final cnjz c;
    public final cnjz d;
    public final dxio<bvjj> e;
    public final dxio<bvtg> f;
    public final String g;
    public final dzsj<dbsg<dhmr>> i;
    public final dxio<gcg> j;
    public final dxio<gce> k;
    public final dxio<bszw> l;
    public final dzsj<dkiy> m;
    public final dzsj<duul> n;
    public final dxio<btto> o;
    public final dxio<bvow> p;
    @dzsi
    public List<Integer> q;
    public List<Integer> r;
    public ddln s;
    @dzsi
    ckbx t;
    private final dzsj<djzi> v;
    private final btyy w;
    private final dxio<btrm> x;
    private final dxio<akfa> y;
    private final String[] z;
    private final ckbw C = new ckbw(this);
    public final AtomicInteger h = new AtomicInteger(0);
    public final dbty<dumx> u = dbud.a(new ckbs(this));

    public ckbz(Application application, dzsj<duxm> dzsjVar, dzsj<djzi> dzsjVar2, btyy btyyVar, dehq dehqVar, dxio<btrm> dxioVar, dxio<bvjj> dxioVar2, dxio<bvtg> dxioVar3, dxio<akfa> dxioVar4, final afec afecVar, String str, dxio<buhr> dxioVar5, cqat cqatVar, dzsj<dbsg<coxz>> dzsjVar3, dbsg<ckcz> dbsgVar, dzsj<dbsg<dhmr>> dzsjVar4, dxio<gcg> dxioVar6, dxio<gce> dxioVar7, dxio<bszw> dxioVar8, dzsj<dkiy> dzsjVar5, dzsj<duul> dzsjVar6, dxio<btto> dxioVar9, dxio<bvow> dxioVar10, cnjz cnjzVar, cnjz cnjzVar2, dxio<btvo> dxioVar11, dxio<crzb> dxioVar12) {
        this.a = application;
        this.c = cnjzVar;
        this.d = cnjzVar2;
        ddyq ddyqVar = ckbh.a;
        this.B = ddyqVar;
        this.A = new ckbu(new dzsj(this, afecVar) { // from class: ckbi
            private final ckbz a;
            private final afec b;

            {
                this.a = this;
                this.b = afecVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                ckbz ckbzVar = this.a;
                return this.b.a() ? ckbzVar.d : ckbzVar.c;
            }
        }, ddyqVar, ddyqVar.bS());
        this.b = dzsjVar;
        this.v = dzsjVar2;
        this.w = btyyVar;
        this.I = dehqVar;
        this.x = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.y = dxioVar4;
        this.g = str;
        this.z = new String[]{"GMM_COUNTERS", "GMM_PRIMES", "LE", "GMM_REALTIME_COUNTERS"};
        this.H = dzsjVar3;
        this.D = dchl.a();
        this.E = dxioVar5;
        this.F = cqatVar;
        this.G = dbsgVar;
        this.i = dzsjVar4;
        this.j = dxioVar6;
        this.k = dxioVar7;
        this.l = dxioVar8;
        this.m = dzsjVar5;
        this.n = dzsjVar6;
        this.o = dxioVar9;
        this.p = dxioVar10;
        this.K = dxioVar11;
        this.L = dxioVar12;
    }

    private static List<Integer> A(@dzsi List<Integer> list, @dzsi List<Integer> list2) {
        ArrayList a = dchl.a();
        if (list != null) {
            a.addAll(list);
        }
        if (list2 != null) {
            a.addAll(list2);
        }
        return a;
    }

    private final dehn<?> B(Executor executor) {
        ckgy[] values;
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (final ckgy ckgyVar : ckgy.values()) {
            cnkr cnkrVar = this.A.a(ckgyVar).a.a;
            dbsk.s(cnkrVar);
            cnoh<Status> b = cnkrVar.b();
            concurrentHashMap.put(ckgyVar, deig.d());
            b.j(new cnon(this, concurrentHashMap, ckgyVar) { // from class: ckbn
                private final ckbz a;
                private final Map b;
                private final ckgy c;

                {
                    this.a = this;
                    this.b = concurrentHashMap;
                    this.c = ckgyVar;
                }

                @Override // defpackage.cnon
                public final void Om(cnom cnomVar) {
                    ckbz ckbzVar = this.a;
                    Map map = this.b;
                    ckgy ckgyVar2 = this.c;
                    Status status = (Status) cnomVar;
                    if (Status.d.equals(status)) {
                        ckbzVar.h.getAndIncrement();
                    }
                    ((deig) map.get(ckgyVar2)).j(status);
                }
            }, 2000L, TimeUnit.MILLISECONDS);
        }
        final cnkr C = C(false);
        if (C != null) {
            concurrentHashMap.put(C, deig.d());
            C.b().j(new cnon(this, concurrentHashMap, C) { // from class: ckbo
                private final ckbz a;
                private final Map b;
                private final cnkr c;

                {
                    this.a = this;
                    this.b = concurrentHashMap;
                    this.c = C;
                }

                @Override // defpackage.cnon
                public final void Om(cnom cnomVar) {
                    ckbz ckbzVar = this.a;
                    Map map = this.b;
                    cnkr cnkrVar2 = this.c;
                    Status status = (Status) cnomVar;
                    if (Status.d.equals(status)) {
                        ckbzVar.h.getAndIncrement();
                    }
                    ((deig) map.get(cnkrVar2)).j(status);
                }
            }, 2000L, TimeUnit.MILLISECONDS);
        }
        dehn<?> c = deha.l(concurrentHashMap.values()).c(ckbp.a, executor);
        c.Pk(new Runnable(this) { // from class: ckbq
            private final ckbz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckbz ckbzVar = this.a;
                if (ckbzVar.h.intValue() > 0) {
                    ckbzVar.e.a().W(bvjk.bv, ckbzVar.h.intValue());
                    ckbzVar.e.a().aq();
                }
            }
        }, executor);
        return c;
    }

    @dzsi
    private final cnkr C(boolean z) {
        cnkr cnkrVar = this.J;
        if (cnkrVar != null || !z) {
            return cnkrVar;
        }
        btlu j = this.y.a().j();
        synchronized (this) {
            if (this.J == null) {
                this.J = new cnkr((j == null || !j.m()) ? this.c : this.d, "GMM_REALTIME_COUNTERS", 10);
            }
        }
        return this.J;
    }

    private final void D(String str, dbty<dbsg<Boolean>> dbtyVar) {
        cnkr C = C(true);
        dbsk.s(C);
        ddyq ddyqVar = this.B;
        dsqp dsqpVar = (dsqp) ddyqVar.cu(5);
        dsqpVar.bC(ddyqVar);
        ddyf ddyfVar = (ddyf) dsqpVar;
        ddln ddlnVar = this.s;
        if (ddlnVar != null) {
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar2 = (ddyq) ddyfVar.b;
            ddyq ddyqVar3 = ddyq.K;
            ddlnVar.getClass();
            ddyqVar2.H = ddlnVar;
            ddyqVar2.b |= 32768;
        }
        dbsg<Boolean> a = dbtyVar.a();
        if (a.a()) {
            boolean booleanValue = a.b().booleanValue();
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar4 = (ddyq) ddyfVar.b;
            ddyq ddyqVar5 = ddyq.K;
            ddyqVar4.b |= 4096;
            ddyqVar4.E = booleanValue;
        }
        C.c(ddyfVar.bK().bS());
        C.e(str).b();
    }

    public static List<Integer> u(duxm duxmVar, djzi djziVar) {
        return A(duxmVar.j, djziVar.a);
    }

    public static final List<duty> y(long j, dbsg<ckcz> dbsgVar) {
        ArrayList a = dchl.a();
        dutx bZ = duty.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duty dutyVar = (duty) bZ.b;
        dutyVar.a |= 1;
        dutyVar.b = "X-Device-Elapsed-Time";
        String valueOf = String.valueOf(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duty dutyVar2 = (duty) bZ.b;
        valueOf.getClass();
        dutyVar2.a |= 2;
        dutyVar2.c = valueOf;
        a.add(bZ.bK());
        dbsg<Integer> a2 = ((ckcz) ((dbsu) dbsgVar).a).a();
        if (a2.a()) {
            dutx bZ2 = duty.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            duty dutyVar3 = (duty) bZ2.b;
            dutyVar3.a |= 1;
            dutyVar3.b = "X-Device-Boot-Count";
            String valueOf2 = String.valueOf(a2.b());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            duty dutyVar4 = (duty) bZ2.b;
            valueOf2.getClass();
            dutyVar4.a |= 2;
            dutyVar4.c = valueOf2;
            a.add(bZ2.bK());
        }
        return a;
    }

    @Override // defpackage.ckcw
    public final <CounterT, MetricT extends ckhb<CounterT>> CounterT a(MetricT metrict) {
        return (CounterT) metrict.a(this.A.a(metrict.c).a);
    }

    @Override // defpackage.ckcw
    public final void b(ckgx ckgxVar, ckcx ckcxVar) {
        dcdc<ckgy> dcdcVar = ckgxVar.z;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.A.a(dcdcVar.get(i)).a(ckcxVar);
        }
    }

    @Override // defpackage.ckcw
    public final ddyq c(ckgy ckgyVar) {
        return this.A.a(ckgyVar).b();
    }

    @Override // defpackage.ckcw
    public final ddyq d() {
        return this.B;
    }

    @Override // defpackage.ckcw
    public final ckcv e() {
        cnkr cnkrVar = this.A.a(ckgy.VECTOR_SERVING).a.a;
        cnko cnkoVar = cnkrVar == null ? null : new cnko(cnkrVar);
        dbsk.s(cnkoVar);
        return new ckby(cnkoVar);
    }

    @Override // defpackage.ckcw
    public final void f(ckhc ckhcVar) {
        boolean isEmpty;
        coxz b;
        synchronized (this) {
            isEmpty = this.D.isEmpty();
            this.D.add(ckhcVar);
            if (isEmpty) {
                ckbw ckbwVar = this.C;
                dceq a = dcet.a();
                a.b(btvs.class, new ckca(btvs.class, ckbwVar));
                this.x.a().g(ckbwVar, a.a());
                long j = this.b.a().G;
                if (j > 0) {
                    this.N = this.I.g(new Runnable(this) { // from class: ckbj
                        private final ckbz a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.x(5);
                        }
                    }, j, j, TimeUnit.SECONDS);
                }
            }
        }
        if (isEmpty) {
            cnjv d = this.c.d(null);
            d.i = "APP_USAGE_1P";
            d.f(this.y.a().o());
            String packageName = this.a.getPackageName();
            dujh dujhVar = d.c;
            if (dujhVar.c) {
                dujhVar.bF();
                dujhVar.c = false;
            }
            duji dujiVar = (duji) dujhVar.b;
            duji dujiVar2 = duji.m;
            packageName.getClass();
            dujiVar.a |= 8;
            dujiVar.d = packageName;
            d.a();
            if (this.H.a() == null || !this.H.a().a() || (b = this.H.a().b()) == null) {
                return;
            }
            final String packageName2 = this.a.getPackageName();
            final int b2 = bvoc.b(this.a);
            final String[] strArr = this.z;
            final int[] l = decl.l(r());
            cntc builder = cntd.builder();
            builder.a = new cnsr(packageName2, b2, strArr, l) { // from class: coxu
                private final String a;
                private final int b;
                private final String[] c;
                private final int[] d;

                {
                    this.a = packageName2;
                    this.b = b2;
                    this.c = strArr;
                    this.d = l;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    String str = this.a;
                    int i = this.b;
                    String[] strArr2 = this.c;
                    int[] iArr = this.d;
                    ((coyi) ((coyj) obj).L()).h(new coxy((cpct) obj2), str, i, strArr2, iArr);
                }
            };
            b.c(builder.a());
        }
    }

    @Override // defpackage.ckcw
    public final void g(ckhc ckhcVar) {
        boolean z;
        synchronized (this) {
            z = this.D.remove(ckhcVar) && this.D.isEmpty();
            if (z) {
                this.x.a().a(this.C);
                dehu dehuVar = this.N;
                if (dehuVar != null) {
                    dehuVar.cancel(false);
                    this.N = null;
                }
            }
        }
        if (z) {
            w();
        }
    }

    @Override // defpackage.ckcw
    public final void h() {
        x(3);
    }

    @Override // defpackage.ckcw
    public final void i() {
        x(6);
    }

    @Override // defpackage.ckcw
    public final dehn<?> j(Executor executor) {
        ((ckco) a(ckgf.a)).a(ckge.a(3));
        return B(executor);
    }

    @Override // defpackage.ckcw
    public final void k(boolean z) {
        v(z, this.K.a().getSystemHealthParameters().a, this.K.a().getSystemHealthParameters().b, this.K.a().getSystemHealthParameters().c);
    }

    @Override // defpackage.ckcw
    public final void l(@dzsi btlu btluVar, cjtk cjtkVar, boolean z) {
        buab<List<ahnc>> b = this.E.a().b();
        List asList = Arrays.asList(new ahnc[0]);
        if (b != null) {
            asList = (List) ((buaa) b).a;
        }
        cnjv cnjvVar = null;
        if (btlu.n(this.y.a().j())) {
            if (btlu.n(btluVar)) {
                cnjvVar = this.d.e(new ckbt(this, cjtkVar, asList, y(this.F.f(), this.G)));
            }
        } else if (!btlu.n(btluVar)) {
            cnjvVar = this.c.e(new ckbt(this, cjtkVar, asList, y(this.F.f(), this.G)));
            cnjvVar.f(btlu.q(btluVar).t());
        }
        if (cnjvVar == null) {
            return;
        }
        cnjvVar.i = "GMM_UE3";
        cnjvVar.k = z ? 4 : 1;
        cnjvVar.a();
    }

    @Override // defpackage.ckcw
    public final void m(byte[] bArr, @dzsi btlu btluVar) {
        boolean n = btlu.n(btluVar);
        cnjv d = (n ? this.d : this.c).d(bArr);
        d.i = "CRONET_GMM";
        if (!n) {
            d.f(btlu.q(btluVar).t());
        }
        d.a();
    }

    @Override // defpackage.ckcw
    public final void n(ckgt ckgtVar, boolean z) {
        ckct.a(this, ckgtVar, z);
    }

    @Override // defpackage.ckcw
    public final void o(ckgu ckguVar, long j) {
        ckct.b(this, ckguVar, j);
    }

    @Override // defpackage.ckcw
    public final void p(dcdc<ckgy> dcdcVar, String str, PrintWriter printWriter) {
        cnkr cnkrVar;
        printWriter.println(str.concat("ClearcutController counterMap: "));
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ckgy ckgyVar = dcdcVar.get(i);
            String name = ckgyVar.name();
            StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(name).length());
            sb.append(str);
            sb.append("  FeatureType: ");
            sb.append(name);
            printWriter.println(sb.toString());
            ckbv ckbvVar = this.A.b().get(ckgyVar);
            if (ckbvVar != null && (cnkrVar = ckbvVar.a.a) != null) {
                String valueOf = String.valueOf(cnkrVar);
                StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(valueOf).length());
                sb2.append(str);
                sb2.append("  ");
                sb2.append(valueOf);
                printWriter.println(sb2.toString());
            }
        }
    }

    @Override // defpackage.ckcw
    public final void q() {
        z();
        D("ApplicationProcessStarted", ckbr.a);
    }

    public final synchronized List<Integer> r() {
        dcdc<Integer> b = this.w.b();
        if (!b.equals(this.M)) {
            this.q = null;
            this.M = b;
        }
        if (this.r == null) {
            this.r = u(this.b.a(), this.v.a());
        }
        if (this.q == null) {
            this.q = A(this.r, this.M);
        }
        return this.q;
    }

    @Override // defpackage.ckcw
    public final void s(ckgz ckgzVar, int i) {
        ckct.c(this, ckgzVar, i);
    }

    @Override // defpackage.ckcw
    public final void t(ckha ckhaVar, long j) {
        ckct.d(this, ckhaVar, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(final boolean z, boolean z2, final boolean z3, boolean z4) {
        boolean c = this.L.a().c();
        if (z2) {
            String str = true != z ? "clearcut_crash" : "clearcut_crash_oom";
            synchronized (this) {
                if (this.t == null) {
                    this.t = new ckbx(this.a);
                }
            }
            try {
                File file = new File(this.t.a(), str);
                file.createNewFile();
                file.exists();
            } catch (IOException unused) {
            }
            ckbx ckbxVar = this.t;
            dbsk.s(ckbxVar);
            if (ckbxVar.c(str) || z3) {
                return false;
            }
        } else if (z4 && c) {
            this.I.execute(new Runnable(this, z, z3) { // from class: ckbk
                private final ckbz a;
                private final boolean b;
                private final boolean c;

                {
                    this.a = this;
                    this.b = z;
                    this.c = z3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.v(this.b, false, this.c, true);
                }
            });
            return true;
        }
        D("ApplicationProcessCrashed", new dbty(this) { // from class: ckbl
            private final ckbz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                try {
                    return dbsg.i(Boolean.valueOf(this.a.p.a().a()));
                } catch (bvov unused2) {
                    return dbpy.a;
                }
            }
        });
        ((ckco) a(ckgf.a)).a(z ? ckge.a(4) : ckge.a(1));
        if (z4) {
            try {
                B(this.I).get();
            } catch (InterruptedException | ExecutionException unused2) {
            }
        } else {
            w();
        }
        return true;
    }

    public final void w() {
        for (ckgy ckgyVar : ckgy.values()) {
            cnkr cnkrVar = this.A.a(ckgyVar).a.a;
            dbsk.s(cnkrVar);
            cnkrVar.b();
        }
        cnkr C = C(false);
        if (C != null) {
            C.b();
        }
    }

    public final void x(int i) {
        ((ckco) a(ckgf.a)).a(ckge.a(i));
        w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        synchronized (this) {
            if (this.t == null) {
                this.t = new ckbx(this.a);
            }
        }
        dbsk.s(this.t);
        boolean c = this.t.c("clearcut_crash");
        boolean c2 = this.t.c("clearcut_crash_oom");
        boolean z = this.K.a().getSystemHealthParameters().c;
        if ((c || c2) && z && this.L.a().c()) {
            this.I.execute(new Runnable(this) { // from class: ckbm
                private final ckbz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.z();
                }
            });
        }
        if (c) {
            ckbx ckbxVar = this.t;
            dbsk.s(ckbxVar);
            ckbxVar.b("clearcut_crash");
            v(false, false, false, !c2 && z);
        }
        if (c2) {
            ckbx ckbxVar2 = this.t;
            dbsk.s(ckbxVar2);
            ckbxVar2.b("clearcut_crash_oom");
            if (v(true, false, false, z)) {
            }
        }
    }
}
