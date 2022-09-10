package defpackage;

import android.app.Application;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajmq  reason: default package */
/* loaded from: classes2.dex */
public class ajmq {
    public static final dcqe a = dcqe.c("ajmq");
    public final Executor b;
    public final ckcw c;
    public final btvo d;
    public final cqat e;
    @dzsi
    public final ahwo f;
    public final ajkh g;
    public final ajlu h;
    public final ajlw i;
    public final ajnv j;
    public final ailf k;
    public dcdc<ajnu> l = dcdc.e();
    private final Application m;
    private final ajzn n;
    private final ajzz o;
    private final ajnd p;
    private final PowerManager q;
    private final ajmx r;
    private final ailb<aile> s;

    public ajmq(Application application, Executor executor, ckcw ckcwVar, btvo btvoVar, cqat cqatVar, @dzsi ahwo ahwoVar, ajzn ajznVar, ajkh ajkhVar, ajzz ajzzVar, ajlu ajluVar, ajlw ajlwVar, ajnd ajndVar, ajnv ajnvVar, ajmx ajmxVar, ailf ailfVar, ailb<aile> ailbVar) {
        this.m = application;
        this.b = executor;
        this.c = ckcwVar;
        this.d = btvoVar;
        this.e = cqatVar;
        this.f = ahwoVar;
        this.n = ajznVar;
        this.g = ajkhVar;
        this.o = ajzzVar;
        this.h = ajluVar;
        this.i = ajlwVar;
        this.p = ajndVar;
        this.j = ajnvVar;
        this.q = (PowerManager) application.getSystemService("power");
        this.r = ajmxVar;
        this.k = ailfVar;
        this.s = ailbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dqxx i(cqat cqatVar, dqxv dqxvVar, int i) {
        if (dqxvVar.c) {
            dqxvVar.bF();
            dqxvVar.c = false;
        }
        dqxx dqxxVar = (dqxx) dqxvVar.b;
        dqxx dqxxVar2 = dqxx.h;
        dqxxVar.c = i - 1;
        dqxxVar.a |= 2;
        long b = cqatVar.b();
        if (dqxvVar.c) {
            dqxvVar.bF();
            dqxvVar.c = false;
        }
        dqxx dqxxVar3 = (dqxx) dqxvVar.b;
        int i2 = dqxxVar3.a | 8;
        dqxxVar3.a = i2;
        dqxxVar3.e = b;
        int i3 = dqxxVar3.d;
        dqxxVar3.a = i2 | 4;
        dqxxVar3.d = i3 + 1;
        return dqxvVar.bK();
    }

    private final dehn<ajne> j(final dqyy dqyyVar, final dqza dqzaVar, final dqzg dqzgVar, final dcep<btlu> dcepVar, final dcep<dqym> dcepVar2, final dbsg<dqxv> dbsgVar, final dehn<ajnc> dehnVar, final boolean z) {
        final deig d = deig.d();
        dehnVar.Pk(new Runnable(this, dehnVar, dcepVar, z, d, dqyyVar, dqzaVar, dqzgVar, dcepVar2, dbsgVar) { // from class: ajmi
            private final ajmq a;
            private final dehn b;
            private final dcep c;
            private final boolean d;
            private final deig e;
            private final dqyy f;
            private final dqza g;
            private final dqzg h;
            private final dcep i;
            private final dbsg j;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = dcepVar;
                this.d = z;
                this.e = d;
                this.f = dqyyVar;
                this.g = dqzaVar;
                this.h = dqzgVar;
                this.i = dcepVar2;
                this.j = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajmq ajmqVar = this.a;
                dehn dehnVar2 = this.b;
                dcep<btlu> dcepVar3 = this.c;
                boolean z2 = this.d;
                deig deigVar = this.e;
                dqyy dqyyVar2 = this.f;
                dqza dqzaVar2 = this.g;
                dqzg dqzgVar2 = this.h;
                dcep<dqym> dcepVar4 = this.i;
                dbsg<dqxv> dbsgVar2 = this.j;
                ajnc ajncVar = (ajnc) deha.s(dehnVar2);
                dbsk.p(ajncVar.a().containsAll(dcepVar3), "EligibilityStatus was not computed for %s", dcnm.p(ajncVar.a(), dcepVar3));
                if (!z2 || !ajncVar.b()) {
                    if (ajncVar.d()) {
                        deigVar.p(ajmqVar.e(dqyyVar2, dqzaVar2, dqzgVar2, dcepVar3, dcepVar4, dbsgVar2, false));
                        return;
                    }
                    int i = 3;
                    int i2 = 10;
                    if (ajncVar.c().contains(aild.NOT_ELIGIBLE_TO_REPORT_LSV_DISABLED_REPORTING)) {
                        if (dbsgVar2.a() && (((dqxx) dbsgVar2.b().b).a & 1) != 0) {
                            i2 = 8;
                        }
                        if (z2) {
                            i = 1;
                        }
                    } else if (ajncVar.c().contains(aild.NOT_ELIGIBLE_TO_REPORT_LOCATION_HISTORY_DISABLED)) {
                        if (dbsgVar2.a() && (((dqxx) dbsgVar2.b().b).a & 1) != 0) {
                            i2 = 9;
                        }
                        if (z2) {
                            i = 2;
                        }
                    }
                    if (dbsgVar2.a() && (((dqxx) dbsgVar2.b().b).a & 1) != 0) {
                        ajmqVar.i.c(((dqxx) dbsgVar2.b().b).b, i2);
                    }
                    ajmqVar.g(z2, i);
                    deigVar.j(ajne.GENERAL_FAILURE);
                    return;
                }
                deigVar.p(ajmqVar.e(dqyyVar2, dqzaVar2, dqzgVar2, dcepVar3, dcepVar4, dbsgVar2, true));
            }
        }, this.b);
        return d;
    }

    public final void a(dqyy dqyyVar, dqza dqzaVar, dqzg dqzgVar, dcep<btlu> dcepVar, dcep<dqym> dcepVar2, dbsg<dqxv> dbsgVar) {
        int i;
        ajmx ajmxVar = this.r;
        Application application = this.m;
        boolean a2 = dbsgVar.a();
        boolean z = false;
        try {
            dkof dkofVar = ajmxVar.a.getLocationSharingParameters().q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            i = 1;
            boolean z2 = !dkofVar.o;
            dkof dkofVar2 = ajmxVar.a.getLocationSharingParameters().q;
            if (dkofVar2 == null) {
                dkofVar2 = dkof.s;
            }
            boolean z3 = !dkofVar2.k;
            if ((a2 && z2) || (!a2 && z3)) {
                akm.f(application, ajmx.a(application, dqyyVar, dqzaVar, dqzgVar, dcepVar, dcepVar2, true, dbsgVar));
                z = true;
            } else if (Build.VERSION.SDK_INT < 26) {
                application.startService(ajmx.a(application, dqyyVar, dqzaVar, dqzgVar, dcepVar, dcepVar2, false, dbsgVar));
                z = true;
                i = 2;
            } else {
                i = 3;
            }
            e = null;
        } catch (IllegalStateException e) {
            e = e;
            i = 5;
        } catch (SecurityException e2) {
            e = e2;
            i = 4;
        } catch (RuntimeException e3) {
            e = e3;
            i = 6;
        }
        if (e != null) {
            bvoo.i(e);
        }
        if (a2) {
            ((ckco) ajmxVar.b.a(ckgd.v)).a(i - 1);
        }
        if (!z) {
            bvqd.a(c(dqyyVar, dqzaVar, dqzgVar, dcepVar, dcepVar2, dbsgVar), this.b);
        }
    }

    public final dehn<ajne> b(final btlu btluVar, dcep<dqym> dcepVar) {
        dqza dqzaVar;
        dbsg<aile> b = this.s.b(dbsg.i(btluVar));
        if (!b.a() || !b.b().e()) {
            if (!this.d.getLocationSharingParameters().L) {
                dqzaVar = this.d.getLocationSharingParameters().J;
                if (dqzaVar == null) {
                    dqzaVar = dqza.c;
                }
            } else {
                dqzaVar = this.d.getLocationSharingParameters().K;
                if (dqzaVar == null) {
                    dqzaVar = dqza.c;
                }
            }
            dqza dqzaVar2 = dqzaVar;
            dqyy dqyyVar = this.d.getLocationSharingParameters().M;
            if (dqyyVar == null) {
                dqyyVar = dqyy.c;
            }
            dqyy dqyyVar2 = dqyyVar;
            dqzg dqzgVar = this.d.getLocationSharingParameters().N;
            if (dqzgVar == null) {
                dqzgVar = dqzg.c;
            }
            final dehn<ajne> j = j(dqyyVar2, dqzaVar2, dqzgVar, dcep.B(btluVar), dcepVar, dbpy.a, this.p.a(dcep.B(btluVar)), true);
            this.k.g(btluVar, dbsg.i(j));
            j.Pk(new Runnable(this, btluVar, j) { // from class: ajlz
                private final ajmq a;
                private final btlu b;
                private final dehn c;

                {
                    this.a = this;
                    this.b = btluVar;
                    this.c = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajmq ajmqVar = this.a;
                    btlu btluVar2 = this.b;
                    dehn dehnVar = this.c;
                    ajmqVar.k.g(btluVar2, dbpy.a);
                    if (deha.s(dehnVar) != ajne.SUCCESS) {
                        akat.a();
                    }
                }
            }, this.b);
            return j;
        }
        dbsk.l(b.b().f().a());
        return b.b().f().b();
    }

    public final dehn<ajne> c(dqyy dqyyVar, dqza dqzaVar, dqzg dqzgVar, dcep<btlu> dcepVar, dcep<dqym> dcepVar2, dbsg<dqxv> dbsgVar) {
        dehn<ajne> j = j(dqyyVar, dqzaVar, dqzgVar, dcepVar, dcepVar2, dbsgVar, this.p.a(dcepVar), false);
        deha.q(j, bvqj.b(new bvqg() { // from class: ajmf
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                if (((ajne) obj) != ajne.SUCCESS) {
                    akat.a();
                }
            }
        }), this.b);
        return j;
    }

    public final dehn<Boolean> d(final dcep<btlu> dcepVar, final dcep<dqym> dcepVar2, final dcdc<Location> dcdcVar) {
        final deig d = deig.d();
        final dehn<ajnc> a2 = this.p.a(dcepVar);
        a2.Pk(new Runnable(this, a2, d, dcdcVar, dcepVar2, dcepVar) { // from class: ajmg
            private final ajmq a;
            private final dehn b;
            private final deig c;
            private final dcdc d;
            private final dcep e;
            private final dcep f;

            {
                this.a = this;
                this.b = a2;
                this.c = d;
                this.d = dcdcVar;
                this.e = dcepVar2;
                this.f = dcepVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajmq ajmqVar = this.a;
                dehn dehnVar = this.b;
                deig deigVar = this.c;
                dcdc dcdcVar2 = this.d;
                dcep<dqym> dcepVar3 = this.e;
                dcep<btlu> dcepVar4 = this.f;
                if (!((ajnc) deha.s(dehnVar)).d()) {
                    deigVar.j(false);
                } else if (ajmqVar.f()) {
                    ahwo ahwoVar = ajmqVar.f;
                    if (ahwoVar != null) {
                        ahwoVar.b();
                    }
                    int size = dcdcVar2.size();
                    for (int i = 0; i < size; i++) {
                        ajmqVar.h.a((Location) dcdcVar2.get(i), dcepVar3);
                    }
                    dehn<Boolean> b = ajmqVar.h.b(dcepVar4);
                    deigVar.p(b);
                    b.Pk(new Runnable(ajmqVar, b) { // from class: ajme
                        private final ajmq a;
                        private final dehn b;

                        {
                            this.a = ajmqVar;
                            this.b = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ajmq ajmqVar2 = this.a;
                            dehn dehnVar2 = this.b;
                            ahwo ahwoVar2 = ajmqVar2.f;
                            if (ahwoVar2 != null) {
                                ((Boolean) deha.s(dehnVar2)).booleanValue();
                                ahwoVar2.b();
                            }
                        }
                    }, ajmqVar.b);
                }
            }
        }, this.b);
        deha.q(d, bvqj.b(new bvqg() { // from class: ajmh
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    akat.a();
                }
            }
        }), this.b);
        return d;
    }

    public final dehn<ajne> e(final dqyy dqyyVar, final dqza dqzaVar, final dqzg dqzgVar, final dcep<btlu> dcepVar, final dcep<dqym> dcepVar2, final dbsg<dqxv> dbsgVar, final boolean z) {
        if (dcepVar.isEmpty()) {
            bvoo.h("Must have an account to report for.", new Object[0]);
            return deha.a(ajne.GENERAL_FAILURE);
        } else if (dcepVar2.isEmpty()) {
            bvoo.h("Must have a justification for reporting.", new Object[0]);
            return deha.a(ajne.GENERAL_FAILURE);
        } else if (!this.o.c()) {
            ahwo ahwoVar = this.f;
            if (ahwoVar != null) {
                ahwoVar.b();
            }
            if (dbsgVar.a()) {
                bvqd.a(h(dcepVar, dbsgVar.b(), 11), this.b);
                ((ckco) this.c.a(ckgd.l)).a(ckfx.CONNECTIVITY_DISABLED.l);
                if ((((dqxx) dbsgVar.b().b).a & 1) != 0) {
                    this.i.c(((dqxx) dbsgVar.b().b).b, 13);
                }
            }
            g(z, 4);
            return deha.a(ajne.GENERAL_FAILURE);
        } else if (!this.n.b()) {
            ahwo ahwoVar2 = this.f;
            if (ahwoVar2 != null) {
                ahwoVar2.b();
            }
            if (dbsgVar.a()) {
                if ((((dqxx) dbsgVar.b().b).a & 1) != 0) {
                    this.i.c(((dqxx) dbsgVar.b().b).b, 5);
                }
                bvqd.a(h(dcepVar, dbsgVar.b(), 8), this.b);
                ((ckco) this.c.a(ckgd.l)).a(ckfx.SYSTEM_LOCATION_DISABLED.l);
            }
            g(z, 5);
            return deha.a(ajne.GENERAL_FAILURE);
        } else if (!this.n.c()) {
            ahwo ahwoVar3 = this.f;
            if (ahwoVar3 != null) {
                ahwoVar3.b();
            }
            if (dbsgVar.a()) {
                if ((((dqxx) dbsgVar.b().b).a & 1) != 0) {
                    this.i.c(((dqxx) dbsgVar.b().b).b, 4);
                }
                bvqd.a(h(dcepVar, dbsgVar.b(), 7), this.b);
                ((ckco) this.c.a(ckgd.l)).a(ckfx.LOCATION_PERMISSION_REFUSED.l);
            }
            g(z, 6);
            return deha.a(ajne.GENERAL_FAILURE);
        } else {
            PowerManager powerManager = this.q;
            String canonicalName = ajkh.class.getCanonicalName();
            dbsk.s(canonicalName);
            final PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, canonicalName);
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(dqyyVar.b);
            ahwo ahwoVar4 = this.f;
            if (ahwoVar4 != null) {
                ahwoVar4.b();
            }
            if (dbsgVar.a()) {
                bvqd.a(h(dcepVar, dbsgVar.b(), 3), this.b);
            }
            final deig d = deig.d();
            final dbrn dbrnVar = new dbrn(this, dbsgVar, d, newWakeLock) { // from class: ajmj
                private final ajmq a;
                private final dbsg b;
                private final deig c;
                private final PowerManager.WakeLock d;

                {
                    this.a = this;
                    this.b = dbsgVar;
                    this.c = d;
                    this.d = newWakeLock;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    ajmq ajmqVar = this.a;
                    dbsg dbsgVar2 = this.b;
                    deig deigVar = this.c;
                    PowerManager.WakeLock wakeLock = this.d;
                    ckfx ckfxVar = (ckfx) obj;
                    if (dbsgVar2.a()) {
                        ((ckco) ajmqVar.c.a(ckgd.l)).a(ckfxVar.l);
                    }
                    ajne ajneVar = ajne.GENERAL_FAILURE;
                    if (ckfxVar == ckfx.SUCCESS) {
                        ajneVar = ajne.SUCCESS;
                    } else if (ckfxVar == ckfx.NO_LOCATION || ckfxVar == ckfx.POOR_QUALITY_LOCATION) {
                        ajneVar = ajne.LOCATION_COLLECTION_FAILURE;
                    }
                    deigVar.j(ajneVar);
                    try {
                        wakeLock.release();
                        return null;
                    } catch (RuntimeException unused) {
                        return null;
                    }
                }
            };
            this.b.execute(new Runnable(this, dqyyVar, dqzaVar, dqzgVar, dcepVar, dcepVar2, dbsgVar, z, dbrnVar) { // from class: ajmk
                private final ajmq a;
                private final dqyy b;
                private final dqza c;
                private final dqzg d;
                private final dcep e;
                private final dcep f;
                private final dbsg g;
                private final boolean h;
                private final dbrn i;

                {
                    this.a = this;
                    this.b = dqyyVar;
                    this.c = dqzaVar;
                    this.d = dqzgVar;
                    this.e = dcepVar;
                    this.f = dcepVar2;
                    this.g = dbsgVar;
                    this.h = z;
                    this.i = dbrnVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dqyy dqyyVar2;
                    dbrn dbrnVar2;
                    ajmp ajmpVar;
                    dbrn dbrnVar3;
                    final ajmq ajmqVar = this.a;
                    dqyy dqyyVar3 = this.b;
                    dqza dqzaVar2 = this.c;
                    final dqzg dqzgVar2 = this.d;
                    final dcep dcepVar3 = this.e;
                    final dcep<dqym> dcepVar4 = this.f;
                    final dbsg dbsgVar2 = this.g;
                    final boolean z2 = this.h;
                    dbrn dbrnVar4 = this.i;
                    synchronized (ajmqVar) {
                        if (!ajmqVar.l.isEmpty()) {
                            dcdc<ajnu> dcdcVar = ajmqVar.l;
                            int size = dcdcVar.size();
                            for (int i = 0; i < size; i++) {
                                dcdcVar.get(i).a();
                            }
                        }
                        dqze dqzeVar = dqzgVar2.a;
                        if (dqzeVar == null) {
                            dqzeVar = dqze.e;
                        }
                        if (dqzeVar.c && ajmqVar.d.getLocationSharingParameters().d) {
                            if (dbsgVar2.a()) {
                                dbrnVar2 = dbrnVar4;
                                dqyyVar2 = dqyyVar3;
                                ((ckco) ajmqVar.c.a(ckgd.o)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar2.b()).b).f), new eapd(ajmqVar.e.b())).b);
                            } else {
                                dqyyVar2 = dqyyVar3;
                                dbrnVar2 = dbrnVar4;
                            }
                            dccx F = dcdc.F();
                            dcpd it = dcepVar3.iterator();
                            while (it.hasNext()) {
                                btlu btluVar = (btlu) it.next();
                                ajnv ajnvVar = ajmqVar.j;
                                dqzd dqzdVar = dqzeVar.d;
                                if (dqzdVar == null) {
                                    dqzdVar = dqzd.c;
                                }
                                long j = dqzdVar.a;
                                dqzd dqzdVar2 = dqzeVar.d;
                                if (dqzdVar2 == null) {
                                    dqzdVar2 = dqzd.c;
                                }
                                dcpd dcpdVar = it;
                                long j2 = dqzdVar2.b;
                                dbsg<String> h = dbsgVar2.h(ajmn.a);
                                ajnvVar.b(btluVar, z2, dcepVar4, h);
                                F.g(new ajnu(ajnvVar, btluVar, j, j2, z2, ajnv.a(dcepVar4), h));
                                dqzeVar = dqzeVar;
                                it = dcpdVar;
                            }
                            ajmqVar.l = F.f();
                            deha.n(dcft.o(ajmqVar.l, ajma.a)).b(new Callable(ajmqVar, dbsgVar2) { // from class: ajmb
                                private final ajmq a;
                                private final dbsg b;

                                {
                                    this.a = ajmqVar;
                                    this.b = dbsgVar2;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ajmq ajmqVar2 = this.a;
                                    dbsg dbsgVar3 = this.b;
                                    if (dbsgVar3.a()) {
                                        ((ckco) ajmqVar2.c.a(ckgd.p)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar3.b()).b).f), new eapd(ajmqVar2.e.b())).b);
                                    }
                                    return new Object();
                                }
                            }, ajmqVar.b);
                        }
                        dqyyVar2 = dqyyVar3;
                        dbrnVar2 = dbrnVar4;
                    }
                    dbrn dbrnVar5 = dbrnVar2;
                    ajmp ajmpVar2 = new ajmp(ajmqVar, dqzgVar2, dcepVar3, z2, dcepVar4, dbsgVar2);
                    if (dbsgVar2.a() && (((dqxx) ((dqxv) dbsgVar2.b()).b).a & 1) != 0) {
                        ajlw ajlwVar = ajmqVar.i;
                        String str = ((dqxx) ((dqxv) dbsgVar2.b()).b).b;
                        if (ajlwVar.b()) {
                            cjqy cjqyVar = ajlwVar.a;
                            cjtk[] cjtkVarArr = new cjtk[1];
                            cqat cqatVar = ajlwVar.b;
                            ddpn a2 = ajlw.a(str);
                            ddpr ddprVar = ddpr.a;
                            if (a2.c) {
                                a2.bF();
                                a2.c = false;
                            }
                            ddpz ddpzVar = (ddpz) a2.b;
                            ddpz ddpzVar2 = ddpz.f;
                            ddprVar.getClass();
                            ddpzVar.c = ddprVar;
                            ddpzVar.b = 5;
                            cjtkVarArr[0] = new ajlv(cqatVar, a2, ajlwVar.a.G());
                            cjqyVar.u(cjtkVarArr);
                        }
                    }
                    ajkh ajkhVar = ajmqVar.g;
                    final deig d2 = deig.d();
                    if (!ajkhVar.c.b()) {
                        d2.j(dbpy.a);
                    } else if (!ajkhVar.c.c()) {
                        d2.j(dbpy.a);
                    } else {
                        LocationRequest create = LocationRequest.create();
                        dqyy dqyyVar4 = dqyyVar2;
                        create.setInterval(dqyyVar4.a);
                        create.setFastestInterval(dqyyVar4.a);
                        create.setPriority(100);
                        create.setExpirationDuration(dqyyVar4.b);
                        ajmpVar = ajmpVar2;
                        dbrnVar3 = dbrnVar5;
                        ajkg ajkgVar = new ajkg(ajkhVar, dqzaVar2, ajmpVar2, d2, ajkhVar.e);
                        ajkhVar.b.b(create, ajkgVar, Looper.getMainLooper());
                        ajkhVar.d.a(new Runnable(ajkhVar, d2, ajkgVar) { // from class: ajkf
                            private final ajkh a;
                            private final deig b;
                            private final ajkg c;

                            {
                                this.a = ajkhVar;
                                this.b = d2;
                                this.c = ajkgVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ajkh ajkhVar2 = this.a;
                                deig deigVar = this.b;
                                ajkg ajkgVar2 = this.c;
                                if (!deigVar.isDone()) {
                                    ((ckco) ajkhVar2.e.a(ckgd.M)).a(ajkgVar2.a);
                                    ajkhVar2.b.l(ajkgVar2);
                                    deigVar.j(dbpy.a);
                                }
                            }
                        }, bvrj.BACKGROUND_THREADPOOL, dqyyVar4.b);
                        final dbrn dbrnVar6 = dbrnVar3;
                        final ajmp ajmpVar3 = ajmpVar;
                        d2.Pk(new Runnable(ajmqVar, d2, dqzgVar2, dcepVar3, dcepVar4, dbsgVar2, z2, dbrnVar6, ajmpVar3) { // from class: ajml
                            private final ajmq a;
                            private final dehn b;
                            private final dqzg c;
                            private final dcep d;
                            private final dcep e;
                            private final dbsg f;
                            private final boolean g;
                            private final dbrn h;
                            private final ajmp i;

                            {
                                this.a = ajmqVar;
                                this.b = d2;
                                this.c = dqzgVar2;
                                this.d = dcepVar3;
                                this.e = dcepVar4;
                                this.f = dbsgVar2;
                                this.g = z2;
                                this.h = dbrnVar6;
                                this.i = ajmpVar3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                deig a3;
                                char c;
                                dehn<Boolean> b;
                                final dehn<Boolean> dehnVar;
                                int i2;
                                dehn<Boolean> h2;
                                dcpd<btlu> dcpdVar2;
                                ckfx ckfxVar;
                                final ajmq ajmqVar2 = this.a;
                                dehn dehnVar2 = this.b;
                                dqzg dqzgVar3 = this.c;
                                dcep<btlu> dcepVar5 = this.d;
                                dcep<dqym> dcepVar6 = this.e;
                                dbsg dbsgVar3 = this.f;
                                final boolean z3 = this.g;
                                final dbrn dbrnVar7 = this.h;
                                ajmp ajmpVar4 = this.i;
                                dbsg dbsgVar4 = (dbsg) deha.s(dehnVar2);
                                if (dbsgVar3.a() && ajmpVar4.b.a()) {
                                    ((ckco) ajmqVar2.c.a(ckgd.r)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar3.b()).b).f), ajmpVar4.b.b()).b);
                                }
                                if (!dbsgVar4.a()) {
                                    ahwo ahwoVar5 = ajmqVar2.f;
                                    if (ahwoVar5 != null) {
                                        ajmpVar4.b.a();
                                        ahwoVar5.b();
                                    }
                                    if (dbsgVar3.a()) {
                                        if ((((dqxx) ((dqxv) dbsgVar3.b()).b).a & 1) != 0) {
                                            ajmqVar2.i.c(((dqxx) ((dqxv) dbsgVar3.b()).b).b, 3);
                                        }
                                        bvqd.a(ajmqVar2.h(dcepVar5, (dqxv) dbsgVar3.b(), 6), ajmqVar2.b);
                                    }
                                    ajmqVar2.g(z3, ajmpVar4.a == 0 ? 7 : 8);
                                    if (ajmpVar4.a == 0) {
                                        ckfxVar = ckfx.NO_LOCATION;
                                    } else {
                                        ckfxVar = ckfx.POOR_QUALITY_LOCATION;
                                    }
                                    dbrnVar7.a(ckfxVar);
                                    return;
                                }
                                if (dbsgVar3.a() && (((dqxx) ((dqxv) dbsgVar3.b()).b).a & 1) != 0) {
                                    ajmqVar2.i.c(((dqxx) ((dqxv) dbsgVar3.b()).b).b, 2);
                                }
                                dqze dqzeVar2 = dqzgVar3.a;
                                if (dqzeVar2 == null) {
                                    dqzeVar2 = dqze.e;
                                }
                                if (!dqzeVar2.b || !ajmqVar2.d.getLocationSharingParameters().d) {
                                    a3 = deha.a(true);
                                } else {
                                    dccx F2 = dcdc.F();
                                    dcpd<btlu> it2 = dcepVar5.iterator();
                                    boolean z4 = false;
                                    while (it2.hasNext()) {
                                        btlu next = it2.next();
                                        if (!dbsgVar3.a() || z4) {
                                            dcpdVar2 = it2;
                                        } else {
                                            dcpdVar2 = it2;
                                            ((ckco) ajmqVar2.c.a(ckgd.s)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar3.b()).b).f), new eapd(ajmqVar2.e.b())).b);
                                        }
                                        F2.g(ajmqVar2.j.b(next, z3, dcepVar6, dbsgVar3.h(ajmc.a)));
                                        it2 = dcpdVar2;
                                        z4 = true;
                                    }
                                    deig d3 = deig.d();
                                    deha.n(F2.f()).b(new Callable(ajmqVar2, dbsgVar3, F2, d3) { // from class: ajmd
                                        private final ajmq a;
                                        private final dbsg b;
                                        private final dccx c;
                                        private final deig d;

                                        {
                                            this.a = ajmqVar2;
                                            this.b = dbsgVar3;
                                            this.c = F2;
                                            this.d = d3;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ajmq ajmqVar3 = this.a;
                                            dbsg dbsgVar5 = this.b;
                                            dccx dccxVar = this.c;
                                            deig deigVar = this.d;
                                            if (dbsgVar5.a()) {
                                                ((ckco) ajmqVar3.c.a(ckgd.t)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar5.b()).b).f), new eapd(ajmqVar3.e.b())).b);
                                            }
                                            dcdc f = dccxVar.f();
                                            int size2 = f.size();
                                            int i3 = 0;
                                            while (i3 < size2) {
                                                int i4 = i3 + 1;
                                                if (!((Boolean) deha.s((dehn) f.get(i3))).booleanValue()) {
                                                    deigVar.j(false);
                                                    return false;
                                                }
                                                i3 = i4;
                                            }
                                            deigVar.j(true);
                                            return true;
                                        }
                                    }, ajmqVar2.b);
                                    a3 = d3;
                                }
                                if (z3 && dbsgVar3.a()) {
                                    bvoo.h("Cannot become primary reporter from an ovenfresh.", new Object[0]);
                                }
                                ahwo ahwoVar6 = ajmqVar2.f;
                                if (ahwoVar6 != null) {
                                    ahwoVar6.b();
                                }
                                if (!ajmqVar2.f()) {
                                    h2 = deha.a(true);
                                } else if (dbsgVar3.a()) {
                                    ajmqVar2.h.a((Location) dbsgVar4.b(), dcepVar6);
                                    h2 = ajmqVar2.h(dcepVar5, (dqxv) dbsgVar3.b(), 5);
                                } else {
                                    if (z3) {
                                        ajlu ajluVar = ajmqVar2.h;
                                        ajluVar.a((Location) dbsgVar4.b(), dcepVar6);
                                        c = 1;
                                        b = ajluVar.d(dcepVar5, dbpy.a, true);
                                    } else {
                                        c = 1;
                                        ajmqVar2.h.a((Location) dbsgVar4.b(), dcepVar6);
                                        b = ajmqVar2.h.b(dcepVar5);
                                    }
                                    dehnVar = b;
                                    i2 = 2;
                                    dehn[] dehnVarArr = new dehn[i2];
                                    dehnVarArr[0] = dehnVar;
                                    dehnVarArr[c] = a3;
                                    final dehn dehnVar3 = a3;
                                    deha.k(dehnVarArr).b(new Callable(ajmqVar2, dehnVar3, dehnVar, z3, dbrnVar7) { // from class: ajmm
                                        private final ajmq a;
                                        private final dehn b;
                                        private final dehn c;
                                        private final boolean d;
                                        private final dbrn e;

                                        {
                                            this.a = ajmqVar2;
                                            this.b = dehnVar3;
                                            this.c = dehnVar;
                                            this.d = z3;
                                            this.e = dbrnVar7;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ckfx ckfxVar2;
                                            ajmq ajmqVar3 = this.a;
                                            dehn dehnVar4 = this.b;
                                            dehn dehnVar5 = this.c;
                                            boolean z5 = this.d;
                                            dbrn dbrnVar8 = this.e;
                                            boolean z6 = ajmqVar3.d.getLocationSharingParameters().d;
                                            boolean f = ajmqVar3.f();
                                            boolean booleanValue = ((Boolean) deha.s(dehnVar4)).booleanValue();
                                            boolean booleanValue2 = ((Boolean) deha.s(dehnVar5)).booleanValue();
                                            if (f) {
                                                ajmqVar3.g(z5, booleanValue2 ? 9 : 10);
                                            } else {
                                                ajmqVar3.g(z5, 11);
                                            }
                                            ahwo ahwoVar7 = ajmqVar3.f;
                                            if (ahwoVar7 != null) {
                                                if (z6 && booleanValue && f && booleanValue2) {
                                                    ahwoVar7.b();
                                                } else if (z6 && booleanValue && f) {
                                                    ahwoVar7.b();
                                                } else if (z6 && booleanValue) {
                                                    ahwoVar7.b();
                                                } else if (f && booleanValue2 && z6) {
                                                    ahwoVar7.b();
                                                } else if (f && booleanValue2) {
                                                    ahwoVar7.b();
                                                } else if (f || z6) {
                                                    ahwoVar7.b();
                                                } else {
                                                    ahwoVar7.b();
                                                }
                                            }
                                            if (!booleanValue || !booleanValue2) {
                                                ckfxVar2 = ckfx.UPLOAD_FAILED;
                                            } else {
                                                ckfxVar2 = ckfx.SUCCESS;
                                            }
                                            dbrnVar8.a(ckfxVar2);
                                            return new Object();
                                        }
                                    }, ajmqVar2.b);
                                }
                                dehnVar = h2;
                                i2 = 2;
                                c = 1;
                                dehn[] dehnVarArr2 = new dehn[i2];
                                dehnVarArr2[0] = dehnVar;
                                dehnVarArr2[c] = a3;
                                final dehn dehnVar32 = a3;
                                deha.k(dehnVarArr2).b(new Callable(ajmqVar2, dehnVar32, dehnVar, z3, dbrnVar7) { // from class: ajmm
                                    private final ajmq a;
                                    private final dehn b;
                                    private final dehn c;
                                    private final boolean d;
                                    private final dbrn e;

                                    {
                                        this.a = ajmqVar2;
                                        this.b = dehnVar32;
                                        this.c = dehnVar;
                                        this.d = z3;
                                        this.e = dbrnVar7;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ckfx ckfxVar2;
                                        ajmq ajmqVar3 = this.a;
                                        dehn dehnVar4 = this.b;
                                        dehn dehnVar5 = this.c;
                                        boolean z5 = this.d;
                                        dbrn dbrnVar8 = this.e;
                                        boolean z6 = ajmqVar3.d.getLocationSharingParameters().d;
                                        boolean f = ajmqVar3.f();
                                        boolean booleanValue = ((Boolean) deha.s(dehnVar4)).booleanValue();
                                        boolean booleanValue2 = ((Boolean) deha.s(dehnVar5)).booleanValue();
                                        if (f) {
                                            ajmqVar3.g(z5, booleanValue2 ? 9 : 10);
                                        } else {
                                            ajmqVar3.g(z5, 11);
                                        }
                                        ahwo ahwoVar7 = ajmqVar3.f;
                                        if (ahwoVar7 != null) {
                                            if (z6 && booleanValue && f && booleanValue2) {
                                                ahwoVar7.b();
                                            } else if (z6 && booleanValue && f) {
                                                ahwoVar7.b();
                                            } else if (z6 && booleanValue) {
                                                ahwoVar7.b();
                                            } else if (f && booleanValue2 && z6) {
                                                ahwoVar7.b();
                                            } else if (f && booleanValue2) {
                                                ahwoVar7.b();
                                            } else if (f || z6) {
                                                ahwoVar7.b();
                                            } else {
                                                ahwoVar7.b();
                                            }
                                        }
                                        if (!booleanValue || !booleanValue2) {
                                            ckfxVar2 = ckfx.UPLOAD_FAILED;
                                        } else {
                                            ckfxVar2 = ckfx.SUCCESS;
                                        }
                                        dbrnVar8.a(ckfxVar2);
                                        return new Object();
                                    }
                                }, ajmqVar2.b);
                            }
                        }, ajmqVar.b);
                    }
                    ajmpVar = ajmpVar2;
                    dbrnVar3 = dbrnVar5;
                    final dbrn dbrnVar62 = dbrnVar3;
                    final ajmp ajmpVar32 = ajmpVar;
                    d2.Pk(new Runnable(ajmqVar, d2, dqzgVar2, dcepVar3, dcepVar4, dbsgVar2, z2, dbrnVar62, ajmpVar32) { // from class: ajml
                        private final ajmq a;
                        private final dehn b;
                        private final dqzg c;
                        private final dcep d;
                        private final dcep e;
                        private final dbsg f;
                        private final boolean g;
                        private final dbrn h;
                        private final ajmp i;

                        {
                            this.a = ajmqVar;
                            this.b = d2;
                            this.c = dqzgVar2;
                            this.d = dcepVar3;
                            this.e = dcepVar4;
                            this.f = dbsgVar2;
                            this.g = z2;
                            this.h = dbrnVar62;
                            this.i = ajmpVar32;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            deig a3;
                            char c;
                            dehn<Boolean> b;
                            final dehn dehnVar;
                            int i2;
                            dehn<Boolean> h2;
                            dcpd<btlu> dcpdVar2;
                            ckfx ckfxVar;
                            final ajmq ajmqVar2 = this.a;
                            dehn dehnVar2 = this.b;
                            dqzg dqzgVar3 = this.c;
                            dcep<btlu> dcepVar5 = this.d;
                            dcep<dqym> dcepVar6 = this.e;
                            dbsg dbsgVar3 = this.f;
                            final boolean z3 = this.g;
                            final dbrn dbrnVar7 = this.h;
                            ajmp ajmpVar4 = this.i;
                            dbsg dbsgVar4 = (dbsg) deha.s(dehnVar2);
                            if (dbsgVar3.a() && ajmpVar4.b.a()) {
                                ((ckco) ajmqVar2.c.a(ckgd.r)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar3.b()).b).f), ajmpVar4.b.b()).b);
                            }
                            if (!dbsgVar4.a()) {
                                ahwo ahwoVar5 = ajmqVar2.f;
                                if (ahwoVar5 != null) {
                                    ajmpVar4.b.a();
                                    ahwoVar5.b();
                                }
                                if (dbsgVar3.a()) {
                                    if ((((dqxx) ((dqxv) dbsgVar3.b()).b).a & 1) != 0) {
                                        ajmqVar2.i.c(((dqxx) ((dqxv) dbsgVar3.b()).b).b, 3);
                                    }
                                    bvqd.a(ajmqVar2.h(dcepVar5, (dqxv) dbsgVar3.b(), 6), ajmqVar2.b);
                                }
                                ajmqVar2.g(z3, ajmpVar4.a == 0 ? 7 : 8);
                                if (ajmpVar4.a == 0) {
                                    ckfxVar = ckfx.NO_LOCATION;
                                } else {
                                    ckfxVar = ckfx.POOR_QUALITY_LOCATION;
                                }
                                dbrnVar7.a(ckfxVar);
                                return;
                            }
                            if (dbsgVar3.a() && (((dqxx) ((dqxv) dbsgVar3.b()).b).a & 1) != 0) {
                                ajmqVar2.i.c(((dqxx) ((dqxv) dbsgVar3.b()).b).b, 2);
                            }
                            dqze dqzeVar2 = dqzgVar3.a;
                            if (dqzeVar2 == null) {
                                dqzeVar2 = dqze.e;
                            }
                            if (!dqzeVar2.b || !ajmqVar2.d.getLocationSharingParameters().d) {
                                a3 = deha.a(true);
                            } else {
                                dccx F2 = dcdc.F();
                                dcpd<btlu> it2 = dcepVar5.iterator();
                                boolean z4 = false;
                                while (it2.hasNext()) {
                                    btlu next = it2.next();
                                    if (!dbsgVar3.a() || z4) {
                                        dcpdVar2 = it2;
                                    } else {
                                        dcpdVar2 = it2;
                                        ((ckco) ajmqVar2.c.a(ckgd.s)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar3.b()).b).f), new eapd(ajmqVar2.e.b())).b);
                                    }
                                    F2.g(ajmqVar2.j.b(next, z3, dcepVar6, dbsgVar3.h(ajmc.a)));
                                    it2 = dcpdVar2;
                                    z4 = true;
                                }
                                deig d3 = deig.d();
                                deha.n(F2.f()).b(new Callable(ajmqVar2, dbsgVar3, F2, d3) { // from class: ajmd
                                    private final ajmq a;
                                    private final dbsg b;
                                    private final dccx c;
                                    private final deig d;

                                    {
                                        this.a = ajmqVar2;
                                        this.b = dbsgVar3;
                                        this.c = F2;
                                        this.d = d3;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ajmq ajmqVar3 = this.a;
                                        dbsg dbsgVar5 = this.b;
                                        dccx dccxVar = this.c;
                                        deig deigVar = this.d;
                                        if (dbsgVar5.a()) {
                                            ((ckco) ajmqVar3.c.a(ckgd.t)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar5.b()).b).f), new eapd(ajmqVar3.e.b())).b);
                                        }
                                        dcdc f = dccxVar.f();
                                        int size2 = f.size();
                                        int i3 = 0;
                                        while (i3 < size2) {
                                            int i4 = i3 + 1;
                                            if (!((Boolean) deha.s((dehn) f.get(i3))).booleanValue()) {
                                                deigVar.j(false);
                                                return false;
                                            }
                                            i3 = i4;
                                        }
                                        deigVar.j(true);
                                        return true;
                                    }
                                }, ajmqVar2.b);
                                a3 = d3;
                            }
                            if (z3 && dbsgVar3.a()) {
                                bvoo.h("Cannot become primary reporter from an ovenfresh.", new Object[0]);
                            }
                            ahwo ahwoVar6 = ajmqVar2.f;
                            if (ahwoVar6 != null) {
                                ahwoVar6.b();
                            }
                            if (!ajmqVar2.f()) {
                                h2 = deha.a(true);
                            } else if (dbsgVar3.a()) {
                                ajmqVar2.h.a((Location) dbsgVar4.b(), dcepVar6);
                                h2 = ajmqVar2.h(dcepVar5, (dqxv) dbsgVar3.b(), 5);
                            } else {
                                if (z3) {
                                    ajlu ajluVar = ajmqVar2.h;
                                    ajluVar.a((Location) dbsgVar4.b(), dcepVar6);
                                    c = 1;
                                    b = ajluVar.d(dcepVar5, dbpy.a, true);
                                } else {
                                    c = 1;
                                    ajmqVar2.h.a((Location) dbsgVar4.b(), dcepVar6);
                                    b = ajmqVar2.h.b(dcepVar5);
                                }
                                dehnVar = b;
                                i2 = 2;
                                dehn[] dehnVarArr2 = new dehn[i2];
                                dehnVarArr2[0] = dehnVar;
                                dehnVarArr2[c] = a3;
                                final dehn dehnVar32 = a3;
                                deha.k(dehnVarArr2).b(new Callable(ajmqVar2, dehnVar32, dehnVar, z3, dbrnVar7) { // from class: ajmm
                                    private final ajmq a;
                                    private final dehn b;
                                    private final dehn c;
                                    private final boolean d;
                                    private final dbrn e;

                                    {
                                        this.a = ajmqVar2;
                                        this.b = dehnVar32;
                                        this.c = dehnVar;
                                        this.d = z3;
                                        this.e = dbrnVar7;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ckfx ckfxVar2;
                                        ajmq ajmqVar3 = this.a;
                                        dehn dehnVar4 = this.b;
                                        dehn dehnVar5 = this.c;
                                        boolean z5 = this.d;
                                        dbrn dbrnVar8 = this.e;
                                        boolean z6 = ajmqVar3.d.getLocationSharingParameters().d;
                                        boolean f = ajmqVar3.f();
                                        boolean booleanValue = ((Boolean) deha.s(dehnVar4)).booleanValue();
                                        boolean booleanValue2 = ((Boolean) deha.s(dehnVar5)).booleanValue();
                                        if (f) {
                                            ajmqVar3.g(z5, booleanValue2 ? 9 : 10);
                                        } else {
                                            ajmqVar3.g(z5, 11);
                                        }
                                        ahwo ahwoVar7 = ajmqVar3.f;
                                        if (ahwoVar7 != null) {
                                            if (z6 && booleanValue && f && booleanValue2) {
                                                ahwoVar7.b();
                                            } else if (z6 && booleanValue && f) {
                                                ahwoVar7.b();
                                            } else if (z6 && booleanValue) {
                                                ahwoVar7.b();
                                            } else if (f && booleanValue2 && z6) {
                                                ahwoVar7.b();
                                            } else if (f && booleanValue2) {
                                                ahwoVar7.b();
                                            } else if (f || z6) {
                                                ahwoVar7.b();
                                            } else {
                                                ahwoVar7.b();
                                            }
                                        }
                                        if (!booleanValue || !booleanValue2) {
                                            ckfxVar2 = ckfx.UPLOAD_FAILED;
                                        } else {
                                            ckfxVar2 = ckfx.SUCCESS;
                                        }
                                        dbrnVar8.a(ckfxVar2);
                                        return new Object();
                                    }
                                }, ajmqVar2.b);
                            }
                            dehnVar = h2;
                            i2 = 2;
                            c = 1;
                            dehn[] dehnVarArr22 = new dehn[i2];
                            dehnVarArr22[0] = dehnVar;
                            dehnVarArr22[c] = a3;
                            final dehn dehnVar322 = a3;
                            deha.k(dehnVarArr22).b(new Callable(ajmqVar2, dehnVar322, dehnVar, z3, dbrnVar7) { // from class: ajmm
                                private final ajmq a;
                                private final dehn b;
                                private final dehn c;
                                private final boolean d;
                                private final dbrn e;

                                {
                                    this.a = ajmqVar2;
                                    this.b = dehnVar322;
                                    this.c = dehnVar;
                                    this.d = z3;
                                    this.e = dbrnVar7;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ckfx ckfxVar2;
                                    ajmq ajmqVar3 = this.a;
                                    dehn dehnVar4 = this.b;
                                    dehn dehnVar5 = this.c;
                                    boolean z5 = this.d;
                                    dbrn dbrnVar8 = this.e;
                                    boolean z6 = ajmqVar3.d.getLocationSharingParameters().d;
                                    boolean f = ajmqVar3.f();
                                    boolean booleanValue = ((Boolean) deha.s(dehnVar4)).booleanValue();
                                    boolean booleanValue2 = ((Boolean) deha.s(dehnVar5)).booleanValue();
                                    if (f) {
                                        ajmqVar3.g(z5, booleanValue2 ? 9 : 10);
                                    } else {
                                        ajmqVar3.g(z5, 11);
                                    }
                                    ahwo ahwoVar7 = ajmqVar3.f;
                                    if (ahwoVar7 != null) {
                                        if (z6 && booleanValue && f && booleanValue2) {
                                            ahwoVar7.b();
                                        } else if (z6 && booleanValue && f) {
                                            ahwoVar7.b();
                                        } else if (z6 && booleanValue) {
                                            ahwoVar7.b();
                                        } else if (f && booleanValue2 && z6) {
                                            ahwoVar7.b();
                                        } else if (f && booleanValue2) {
                                            ahwoVar7.b();
                                        } else if (f || z6) {
                                            ahwoVar7.b();
                                        } else {
                                            ahwoVar7.b();
                                        }
                                    }
                                    if (!booleanValue || !booleanValue2) {
                                        ckfxVar2 = ckfx.UPLOAD_FAILED;
                                    } else {
                                        ckfxVar2 = ckfx.SUCCESS;
                                    }
                                    dbrnVar8.a(ckfxVar2);
                                    return new Object();
                                }
                            }, ajmqVar2.b);
                        }
                    }, ajmqVar.b);
                }
            });
            return d;
        }
    }

    public final boolean f() {
        dkof dkofVar = this.d.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        return !dkofVar.j;
    }

    public final void g(boolean z, int i) {
        if (z) {
            ((ckco) this.c.a(ckgd.w)).a(i - 1);
        }
    }

    public final dehn<Boolean> h(dcep<btlu> dcepVar, dqxv dqxvVar, int i) {
        if (f()) {
            return this.h.c(dcepVar, i(this.e, dqxvVar, i));
        }
        return deha.a(true);
    }
}
