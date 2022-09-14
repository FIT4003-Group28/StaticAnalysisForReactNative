package defpackage;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avck  reason: default package */
/* loaded from: classes2.dex */
public final class avck implements avca {
    public static final /* synthetic */ int c = 0;
    private static final cljr d;
    private static final dcqe e;
    public final avby a;
    public final Map<String, dehn<cljx>> b = new ConcurrentHashMap();
    private final clks f;
    private final Executor g;
    private final awfh h;
    private final crzm<avzg> i;
    private final File j;
    private final File k;
    private final avze l;
    private final dxio<avrw> m;

    static {
        cljp c2 = cljr.c();
        cljq cljqVar = cljq.WIFI;
        cliq cliqVar = (cliq) c2;
        if (cliqVar.a == null) {
            if (cliqVar.b == null) {
                cliqVar.a = dcep.N();
            } else {
                cliqVar.a = dcep.N();
                cliqVar.a.i(cliqVar.b);
                cliqVar.b = null;
            }
        }
        cliqVar.a.b(cljqVar);
        d = c2.a();
        e = dcqe.c("avck");
    }

    public avck(clks clksVar, dehp dehpVar, avpn avpnVar, awfh awfhVar, crzm<avzg> crzmVar, dxio<avrw> dxioVar, final avby avbyVar, avze avzeVar) {
        Executor b = dehx.b(dehpVar);
        this.f = clksVar;
        this.g = b;
        this.h = awfhVar;
        this.i = crzmVar;
        this.m = dxioVar;
        this.a = avbyVar;
        this.l = avzeVar;
        this.j = avpnVar.h(avzeVar);
        this.k = avpnVar.i(avzeVar);
        dbsz<clkr> dbszVar = new dbsz(avbyVar) { // from class: avcg
            private final avby a;

            {
                this.a = avbyVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                avby avbyVar2 = this.a;
                clkr clkrVar = (clkr) obj;
                int i = avck.c;
                if (clkrVar.c() <= 0 || clkrVar.a() != 0) {
                    return;
                }
                avbyVar2.d();
            }
        };
        synchronized (clksVar.i) {
            clksVar.f.put(dbszVar, dehx.b(b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dlqg c(Throwable th) {
        List<Throwable> f = dbue.f(th);
        if (dcft.j(f, avch.a)) {
            dlpy bZ = dlqg.c.bZ();
            dlqa dlqaVar = dlqa.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlqg dlqgVar = (dlqg) bZ.b;
            dlqaVar.getClass();
            dlqgVar.b = dlqaVar;
            dlqgVar.a = 3;
            return bZ.bK();
        }
        clle clleVar = (clle) dcft.l(f, avci.a, null);
        if (clleVar == null) {
            dlpy bZ2 = dlqg.c.bZ();
            dlqb bZ3 = dlqd.e.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlqd dlqdVar = (dlqd) bZ3.b;
            dlqdVar.b = 0;
            dlqdVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlqg dlqgVar2 = (dlqg) bZ2.b;
            dlqd bK = bZ3.bK();
            bK.getClass();
            dlqgVar2.b = bK;
            dlqgVar2.a = 2;
            return bZ2.bK();
        }
        dlqb bZ4 = dlqd.e.bZ();
        clku clkuVar = clleVar.a;
        if (clkuVar.c() >= 0) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dlqd dlqdVar2 = (dlqd) bZ4.b;
            dlqdVar2.b = 2;
            dlqdVar2.a |= 1;
            int c2 = clkuVar.c();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dlqd dlqdVar3 = (dlqd) bZ4.b;
            dlqdVar3.a |= 2;
            dlqdVar3.c = c2;
        }
        dlpy bZ5 = dlqg.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dlqg dlqgVar3 = (dlqg) bZ5.b;
        dlqd bK2 = bZ4.bK();
        bK2.getClass();
        dlqgVar3.b = bK2;
        dlqgVar3.a = 2;
        return bZ5.bK();
    }

    @Override // defpackage.avca
    public final void a(String str) {
        dbsk.l(!str.isEmpty());
        dehn<cljx> dehnVar = this.b.get(str);
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
    }

    @Override // defpackage.avca
    public final void b(String str, int i) {
        final degp<cljx> f;
        boolean z = true;
        dbsk.l(!str.isEmpty());
        if (this.m.a().a()) {
            bvoo.h("Tried to downloadOneFile while in Incognito mode!", new Object[0]);
        } else if (this.b.get(str) != null) {
        } else {
            if (i != 2 && (i != 1 || !this.h.f())) {
                z = false;
            }
            String i2 = ddae.f.i(dczd.a.c(str.getBytes()).b());
            File file = new File(this.j, i2);
            File file2 = new File(this.k, i2);
            avzg l = this.i.l();
            if (!dbsd.a(this.l, avze.a) && l != null && btlu.q(l.a().a()).o()) {
                this.h.b();
            }
            avai avaiVar = new avai(file, file2);
            URI create = URI.create(str);
            clit clitVar = new clit();
            clitVar.d = avaiVar;
            if (create != null) {
                clitVar.a = create;
                clitVar.a(cljr.b);
                clitVar.a(z ? d : cljr.b);
                if (clitVar.b == null) {
                    clitVar.b = dcax.a;
                }
                String str2 = clitVar.a == null ? " uri" : "";
                if (clitVar.c == null) {
                    str2 = str2.concat(" downloadConstraints");
                }
                if (clitVar.d == null) {
                    str2 = String.valueOf(str2).concat(" destination");
                }
                if (!str2.isEmpty()) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                final cliu cliuVar = new cliu(clitVar.a, clitVar.b, clitVar.c, clitVar.d);
                final clks clksVar = this.f;
                synchronized (clksVar.i) {
                    defw<cljx> c2 = clksVar.c(cliuVar);
                    c2.c().Pk(new Runnable(clksVar, cliuVar) { // from class: cljy
                        private final clks a;
                        private final cljw b;

                        {
                            this.a = clksVar;
                            this.b = cliuVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            clks clksVar2 = this.a;
                            synchronized (clksVar2.i) {
                                dbsk.m(clksVar2.j >= 0, "Encountered < 0 downloads in flight, this shouldn't happen");
                            }
                            clksVar2.a();
                        }
                    }, clksVar.e);
                    f = c2.f();
                    clksVar.h.add(f);
                    f.Pk(new Runnable(clksVar, f) { // from class: clkf
                        private final clks a;
                        private final degp b;

                        {
                            this.a = clksVar;
                            this.b = f;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            clks clksVar2 = this.a;
                            degp degpVar = this.b;
                            synchronized (clksVar2.i) {
                                clksVar2.h.remove(degpVar);
                            }
                        }
                    }, dege.a);
                }
                clkv clkvVar = clksVar.l;
                clksVar.a();
                this.b.put(str, f);
                deha.q(f, new avcj(this, file, file2, str), this.g);
                return;
            }
            throw new NullPointerException("Null uri");
        }
    }
}
