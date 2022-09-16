package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: akai  reason: default package */
/* loaded from: classes2.dex */
public class akai {
    public static final akah a = akah.j(false, dcmr.a, dbpy.a, dbpy.a);
    public static final akah b;
    public final btrm d;
    public final ailb<aile> e;
    public final ajzn f;
    private final Executor k;
    private final btvo l;
    private final ajzq m;
    private final ajzg n;
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public final akae g = new akae(this);
    public final akac j = new akac(this);
    public final aila h = new akad(this);
    public final Set<akag> i = new HashSet();

    static {
        akah.j(false, dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE), dbpy.a, dbpy.a);
        b = new ajzf(false, dcmr.a, dbpy.a, dbpy.a, true);
    }

    public akai(Executor executor, btvo btvoVar, btrm btrmVar, ailb<aile> ailbVar, ajzq ajzqVar, ajzn ajznVar, ajzg ajzgVar) {
        this.k = executor;
        this.l = btvoVar;
        this.d = btrmVar;
        this.e = ailbVar;
        this.f = ajznVar;
        this.m = ajzqVar;
        this.n = ajzgVar;
    }

    public final akah a(btlu btluVar) {
        dcep<akaf> b2;
        dcen N = dcep.N();
        ajzp a2 = this.m.a();
        if (!a2.d()) {
            N.b(akaf.LOCATION_PERMISSION_NOT_GRANTED);
        }
        if (!a2.c()) {
            N.b(akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED);
        }
        if (!a2.e()) {
            N.b(akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED);
        }
        if (!this.f.b()) {
            N.b(akaf.DEVICE_LOCATION_DISABLED);
        }
        if (this.n.a() && this.n.b()) {
            N.b(akaf.BATTERY_SAVER_ENABLED);
        }
        dbsg<aile> b3 = this.e.b(dbsg.i(btluVar));
        if (this.l.getLocationSharingParameters().e && b3.a()) {
            aile b4 = b3.b();
            if (b4.d() || !this.l.getLocationSharingParameters().e) {
                b2 = b(b4.j());
            } else if (b4.h().a()) {
                aild aildVar = aild.UNABLE_TO_DETERMINE_ELIGIBILITY;
                int c = b4.h().b().c();
                int i = c - 1;
                if (c == 0) {
                    throw null;
                }
                if (i == 2) {
                    b2 = dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING);
                } else if (i == 3) {
                    b2 = dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING);
                } else if (i == 4) {
                    b2 = dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_INVALID_ACCOUNT_TYPE);
                } else {
                    b2 = dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE);
                }
            } else {
                b2 = dcep.B(akaf.NOT_PRIMARY_REPORTING_DEVICE);
            }
            N.i(b2);
        }
        boolean z = false;
        if (b3.a() && b3.b().e()) {
            z = true;
        }
        if (z) {
            N.b(akaf.NOT_PRIMARY_REPORTING_DEVICE);
        }
        dcep f = N.f();
        dbsg<String> dbsgVar = dbpy.a;
        dbsg<String> dbsgVar2 = dbpy.a;
        if (f.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING)) {
            dbsgVar = b3.b().h().b().a();
        }
        if (f.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING)) {
            dbsgVar2 = b3.b().h().b().b();
        }
        return akah.j(z, f, dbsgVar, dbsgVar2);
    }

    public final dcep<akaf> b(dcep<aild> dcepVar) {
        dcen N = dcep.N();
        dcpd<aild> it = dcepVar.iterator();
        while (it.hasNext()) {
            aild aildVar = aild.UNABLE_TO_DETERMINE_ELIGIBILITY;
            int ordinal = it.next().ordinal();
            if (ordinal == 0 || ordinal == 1) {
                N.b(akaf.PRIMARY_BUT_NOT_REPORTING);
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        dbsk.m(true, "Appropriate flags not enabled");
                        N.b(akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT);
                    } else if (ordinal == 5) {
                        N.b(akaf.NOT_PRIMARY_REPORTING_DEVICE);
                    }
                } else if (this.l.getLocationSharingParameters().g) {
                    N.b(akaf.ULR_NOT_ENABLED);
                }
            } else if (this.l.getLocationSharingParameters().g) {
                N.b(akaf.ULR_NOT_ALLOWED);
            }
        }
        return N.f();
    }

    public final void c(akag akagVar) {
        this.c.writeLock().lock();
        try {
            if (this.i.isEmpty()) {
                btrm btrmVar = this.d;
                akae akaeVar = this.g;
                dceq a2 = dcet.a();
                a2.b(btvr.class, new akaj(btvr.class, akaeVar, bvrj.UI_THREAD));
                btrmVar.g(akaeVar, a2.a());
                this.f.d(this.j);
                this.e.c(this.h);
            }
            this.i.add(akagVar);
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final void d(final btlu btluVar) {
        this.c.readLock().lock();
        try {
            for (final akag akagVar : this.i) {
                this.k.execute(new Runnable(akagVar, btluVar) { // from class: akaa
                    private final akag a;
                    private final btlu b;

                    {
                        this.a = akagVar;
                        this.b = btluVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        akag akagVar2 = this.a;
                        btlu btluVar2 = this.b;
                        akah akahVar = akai.a;
                        akagVar2.a(btluVar2);
                    }
                });
            }
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final void e() {
        this.c.readLock().lock();
        try {
            for (final akag akagVar : this.i) {
                this.k.execute(new Runnable(akagVar) { // from class: akab
                    private final akag a;

                    {
                        this.a = akagVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        akag akagVar2 = this.a;
                        akah akahVar = akai.a;
                        akagVar2.b();
                    }
                });
            }
        } finally {
            this.c.readLock().unlock();
        }
    }
}
