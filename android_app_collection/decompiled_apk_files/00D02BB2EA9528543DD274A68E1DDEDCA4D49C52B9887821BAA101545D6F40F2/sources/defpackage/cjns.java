package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.reporting.UploadRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjns  reason: default package */
/* loaded from: classes.dex */
public final class cjns implements cjnx {
    public static final dcqe a = dcqe.c("cjns");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public static final long c = TimeUnit.MINUTES.toMillis(1);
    public final bvrb d;
    public final dxio<akfa> e;
    public final btrm f;
    public final Map<btlu, deig<cora>> g;
    public btlu h;
    public final corc i;
    private final Object j;
    private int k;
    @dzsi
    private final GoogleApiClient l;
    private final dxio<ckcw> m;
    private final BroadcastReceiver n;

    public cjns(Application application, bvrb bvrbVar, dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, btrm btrmVar) {
        GoogleApiClient googleApiClient;
        btsm b2 = btsm.b(application);
        if (b2 != null) {
            b2.g(coqk.a);
            b2.h(btsm.b);
            b2.i(btsm.c);
            googleApiClient = b2.e();
        } else {
            googleApiClient = null;
        }
        corc corcVar = coqk.b;
        this.j = new Object();
        this.g = new ConcurrentHashMap();
        this.h = btlu.a;
        cjnr cjnrVar = new cjnr(this);
        this.n = cjnrVar;
        this.l = googleApiClient;
        this.d = bvrbVar;
        this.e = dxioVar;
        this.m = dxioVar2;
        this.f = btrmVar;
        this.i = corcVar;
        application.registerReceiver(cjnrVar, new IntentFilter("com.google.android.gms.location.reporting.SETTINGS_CHANGED"));
        dceq a2 = dcet.a();
        a2.b(gds.class, new cjnt(gds.class, this));
        btrmVar.g(this, a2.a());
    }

    public static boolean r(@dzsi cora coraVar) {
        if (coraVar == null) {
            return false;
        }
        if (coraVar.g()) {
            return true;
        }
        coraVar.b();
        coraVar.d();
        coraVar.h();
        return false;
    }

    public static boolean s(@dzsi cora coraVar) {
        if (coraVar == null) {
            return false;
        }
        return coraVar.e();
    }

    private final dehn<cora> v(btlu btluVar) {
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return deha.a(null);
        }
        deig<cora> deigVar = this.g.get(btluVar);
        return deigVar != null ? deigVar : c(btluVar);
    }

    @dzsi
    public final GoogleApiClient a() {
        bvrj.UI_THREAD.d();
        if (this.l == null) {
            return null;
        }
        synchronized (this.j) {
            if (this.k == 0 && !this.l.blockingConnect().c()) {
                return null;
            }
            if (!this.l.isConnected()) {
                if (!this.l.blockingConnect().c()) {
                    return null;
                }
                if (!this.l.isConnected()) {
                    bvoo.h("Attempt to re-connect reporting client failed.", new Object[0]);
                    return null;
                }
            }
            this.k++;
            GoogleApiClient googleApiClient = this.l;
            dbsk.s(googleApiClient);
            return googleApiClient;
        }
    }

    public final void b() {
        bvrj.UI_THREAD.d();
        dbsk.s(this.l);
        synchronized (this.j) {
            int i = this.k - 1;
            this.k = i;
            if (i == 0) {
                try {
                    GoogleApiClient googleApiClient = this.l;
                    dbsk.s(googleApiClient);
                    googleApiClient.disconnect();
                } catch (RuntimeException e) {
                    bvoo.h("RuntimeException while talking to Google Api Client: %s", e);
                }
            }
        }
    }

    public final dehn<cora> c(final btlu btluVar) {
        final deig<cora> d = deig.d();
        this.g.put(btluVar, d);
        this.d.b(new Runnable(this, d, btluVar) { // from class: cjnh
            private final cjns a;
            private final deig b;
            private final btlu c;

            {
                this.a = this;
                this.b = d;
                this.c = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cjns cjnsVar = this.a;
                final deig deigVar = this.b;
                btlu btluVar2 = this.c;
                GoogleApiClient a2 = cjnsVar.a();
                if (a2 != null) {
                    try {
                        corc.c(a2, btluVar2.s()).j(new cnon(cjnsVar, deigVar) { // from class: cjni
                            private final cjns a;
                            private final deig b;

                            {
                                this.a = cjnsVar;
                                this.b = deigVar;
                            }

                            @Override // defpackage.cnon
                            public final void Om(cnom cnomVar) {
                                final cjns cjnsVar2 = this.a;
                                deig deigVar2 = this.b;
                                cora coraVar = (cora) cnomVar;
                                if (coraVar == null || !coraVar.a.d()) {
                                    deigVar2.j(null);
                                } else {
                                    deigVar2.j(coraVar);
                                }
                                cjnsVar2.f.b(new cjnw());
                                cjnsVar2.d.b(new Runnable(cjnsVar2) { // from class: cjnj
                                    private final cjns a;

                                    {
                                        this.a = cjnsVar2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.b();
                                    }
                                }, bvrj.BACKGROUND_THREADPOOL);
                            }
                        }, cjns.c, TimeUnit.MILLISECONDS);
                        return;
                    } catch (RuntimeException e) {
                        bvoo.i(e);
                        deigVar.j(null);
                        cjnsVar.f.b(new cjnw());
                        cjnsVar.b();
                        return;
                    }
                }
                deigVar.j(null);
                cjnsVar.f.b(new cjnw());
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final dehn<Boolean> d() {
        btlu btluVar = this.h;
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return deha.a(false);
        }
        return e(btluVar);
    }

    @Override // defpackage.cjnx
    public final dehn<Boolean> e(btlu btluVar) {
        return deha.o(deew.h(v(btluVar), cjnk.a, dege.a));
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final boolean f() {
        btlu btluVar = this.h;
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return false;
        }
        return g(btluVar);
    }

    @Override // defpackage.cjnx
    public final boolean g(btlu btluVar) {
        dehn<cora> v = v(btluVar);
        if (v.isDone()) {
            return r((cora) deha.s(v));
        }
        return false;
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final dehn<cora> h() {
        btlu btluVar = this.h;
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return deha.a(null);
        }
        return i(btluVar);
    }

    @Override // defpackage.cjnx
    public final dehn<cora> i(btlu btluVar) {
        return deha.o(v(btluVar));
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final dbsg<cora> j() {
        btlu btluVar = this.h;
        if (btluVar == null) {
            return dbpy.a;
        }
        dehn<cora> v = v(btluVar);
        return v.isDone() ? dbsg.j((cora) deha.s(v)) : dbpy.a;
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final dehn<Boolean> k() {
        btlu btluVar = this.h;
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return deha.a(false);
        }
        return l(btluVar);
    }

    @Override // defpackage.cjnx
    public final dehn<Boolean> l(btlu btluVar) {
        return deha.o(deew.h(v(btluVar), cjnl.a, dege.a));
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final boolean m() {
        btlu btluVar = this.h;
        if (btluVar != null && btlu.i(btluVar) == btlt.GOOGLE) {
            dehn<cora> v = v(btluVar);
            if (v.isDone()) {
                return s((cora) deha.s(v));
            }
        }
        return false;
    }

    @Override // defpackage.cjnx
    @Deprecated
    public final dehn<Boolean> n(String str) {
        btlu btluVar = this.h;
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return deha.a(false);
        }
        return o(btluVar, str);
    }

    @Override // defpackage.cjnx
    public final dehn<Boolean> o(btlu btluVar, String str) {
        return deew.h(p(btluVar, str, 0L, 0L), cjnm.a, dege.a);
    }

    @Override // defpackage.cjnx
    public final dehn<Long> p(final btlu btluVar, final String str, final long j, final long j2) {
        final deig d = deig.d();
        final dehn<Boolean> e = e(btluVar);
        Runnable runnable = new Runnable(this, e, d, btluVar, str, j, j2) { // from class: cjnn
            private final cjns a;
            private final dehn b;
            private final deig c;
            private final btlu d;
            private final String e;
            private final long f;
            private final long g;

            {
                this.a = this;
                this.b = e;
                this.c = d;
                this.d = btluVar;
                this.e = str;
                this.f = j;
                this.g = j2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cjns cjnsVar = this.a;
                dehn dehnVar = this.b;
                final deig deigVar = this.c;
                btlu btluVar2 = this.d;
                String str2 = this.e;
                long j3 = this.f;
                long j4 = this.g;
                if (!((Boolean) deha.s(dehnVar)).booleanValue()) {
                    deigVar.j(null);
                    return;
                }
                GoogleApiClient a2 = cjnsVar.a();
                if (a2 == null) {
                    deigVar.j(null);
                    return;
                }
                coqo a3 = UploadRequest.a(btluVar2.s(), str2, j3);
                a3.b(j4);
                try {
                    corc.d(a2, a3.a()).j(new cnon(cjnsVar, deigVar) { // from class: cjnp
                        private final cjns a;
                        private final deig b;

                        {
                            this.a = cjnsVar;
                            this.b = deigVar;
                        }

                        @Override // defpackage.cnon
                        public final void Om(cnom cnomVar) {
                            final cjns cjnsVar2 = this.a;
                            deig deigVar2 = this.b;
                            corb corbVar = (corb) cnomVar;
                            if (corbVar == null || !corbVar.a.d()) {
                                String valueOf = String.valueOf(corbVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                                sb.append("ULR upload request error: ");
                                sb.append(valueOf);
                                bvoo.j(new RuntimeException(sb.toString()));
                                deigVar2.j(null);
                            } else {
                                deigVar2.j(Long.valueOf(corbVar.b));
                            }
                            cjnsVar2.d.b(new Runnable(cjnsVar2) { // from class: cjnq
                                private final cjns a;

                                {
                                    this.a = cjnsVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b();
                                }
                            }, bvrj.BACKGROUND_THREADPOOL);
                        }
                    }, cjns.b, TimeUnit.MILLISECONDS);
                } catch (RuntimeException e2) {
                    bvoo.i(e2);
                    deigVar.j(null);
                    cjnsVar.b();
                }
            }
        };
        Executor g = this.d.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g);
        e.Pk(runnable, g);
        return d;
    }

    @Override // defpackage.cjnx
    public final void q(final long j) {
        this.d.b(new Runnable(this, j) { // from class: cjno
            private final cjns a;
            private final long b;

            {
                this.a = this;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cjns cjnsVar = this.a;
                long j2 = this.b;
                bvrj.UI_THREAD.d();
                GoogleApiClient a2 = cjnsVar.a();
                if (a2 != null) {
                    try {
                        a2.execute(new coqx(a2, j2)).f();
                    } catch (RuntimeException e) {
                        bvoo.i(e);
                    } finally {
                        cjnsVar.b();
                    }
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    @Override // defpackage.cjnx
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.dhjf r8, defpackage.akqi r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjns.t(dhjf, akqi):void");
    }

    @Override // defpackage.cjnx
    public final dhix u(@dzsi dhiz dhizVar, @dzsi int i, @dzsi ddho ddhoVar) {
        dhix bZ = dhjf.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjf dhjfVar = (dhjf) bZ.b;
        dhjfVar.b = i - 1;
        dhjfVar.a |= 1;
        if (dhizVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjf dhjfVar2 = (dhjf) bZ.b;
            dhjfVar2.d = dhizVar.j;
            dhjfVar2.a |= 4;
        }
        if (ddhoVar != null) {
            int b2 = ddhoVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjf dhjfVar3 = (dhjf) bZ.b;
            dhjfVar3.a |= 2;
            dhjfVar3.c = b2;
        }
        return bZ;
    }
}
