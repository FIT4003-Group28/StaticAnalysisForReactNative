package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avpe  reason: default package */
/* loaded from: classes3.dex */
public final class avpe {
    public final cqat a;
    public final dehq b;
    public final cokf c;
    public final crzm<avzg> d;
    public final avki e;
    public final ckcw f;
    @dzsi
    public avpd h;
    public long i;
    private final Context j;
    private final axru k;
    private final bvrb l;
    @dzsi
    private cola n;
    @dzsi
    private bvqm o;
    private long p;
    private long q;
    @dzsi
    private crzp<btvo> r;
    private final btxc s;
    public final crzd<avoy> g = new crzd<>();
    private boolean m = false;

    public avpe(Context context, btxc btxcVar, dehq dehqVar, cokf cokfVar, avki avkiVar, crzm crzmVar, axru axruVar, bvrb bvrbVar, cqat cqatVar, ckcw ckcwVar) {
        this.j = context;
        this.s = btxcVar;
        this.b = dehqVar;
        this.c = cokfVar;
        this.d = crzmVar;
        this.k = axruVar;
        this.e = avkiVar;
        this.l = bvrbVar;
        this.a = cqatVar;
        this.f = ckcwVar;
    }

    private final void f() {
        cokf cokfVar = this.c;
        cola colaVar = this.n;
        dbsk.s(colaVar);
        cokfVar.l(colaVar);
        this.n = null;
    }

    public final synchronized void a() {
        if (!this.k.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return;
        }
        if (this.m) {
            return;
        }
        this.m = true;
        this.o = bvqm.a(this.j, bvrj.OFFLINE_DYNAMIC_THREAD, this.l);
        this.r = new crzp(this) { // from class: avor
            private final avpe a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.b(crzmVar);
            }
        };
        crzm<btvo> a = this.s.a();
        crzp<btvo> crzpVar = this.r;
        dbsk.s(crzpVar);
        a.d(crzpVar, this.b);
    }

    public final synchronized void b(crzm<btvo> crzmVar) {
        btvo l = crzmVar.l();
        if (this.m && l != null) {
            dksh offlineMapsParameters = l.getOfflineMapsParameters();
            long j = offlineMapsParameters.J;
            long j2 = offlineMapsParameters.I;
            if (this.n != null) {
                if (j == this.p && j2 == this.q) {
                    return;
                }
                f();
            }
            dbsk.l(this.n == null);
            this.p = j;
            this.q = j2;
            LocationRequest create = LocationRequest.create();
            create.setPriority(102);
            create.setInterval(j);
            create.setFastestInterval(j2);
            avpc avpcVar = new avpc(this);
            this.n = avpcVar;
            cokf cokfVar = this.c;
            bvqm bvqmVar = this.o;
            dbsk.s(bvqmVar);
            cpcq<Void> b = cokfVar.b(create, avpcVar, bvqmVar.getLooper());
            b.s(new cpcl(this) { // from class: avos
                private final avpe a;

                {
                    this.a = this;
                }

                @Override // defpackage.cpcl
                public final void c(Object obj) {
                    final avpe avpeVar = this.a;
                    Void r3 = (Void) obj;
                    cpcq<LocationAvailability> a = avpeVar.c.a();
                    a.s(new cpcl(avpeVar) { // from class: avow
                        private final avpe a;

                        {
                            this.a = avpeVar;
                        }

                        @Override // defpackage.cpcl
                        public final void c(Object obj2) {
                            LocationAvailability locationAvailability = (LocationAvailability) obj2;
                            ((ckcn) this.a.f.a(ckia.L)).a();
                        }
                    });
                    a.r(new cpci(avpeVar) { // from class: avox
                        private final avpe a;

                        {
                            this.a = avpeVar;
                        }

                        @Override // defpackage.cpci
                        public final void d(Exception exc) {
                            ((ckcn) this.a.f.a(ckia.K)).a();
                        }
                    });
                }
            });
            b.r(new cpci(this) { // from class: avot
                private final avpe a;

                {
                    this.a = this;
                }

                @Override // defpackage.cpci
                public final void d(Exception exc) {
                    ((ckcn) this.a.f.a(ckia.K)).a();
                }
            });
        }
    }

    public final synchronized void c() {
        if (!this.m) {
            return;
        }
        this.m = false;
        if (this.n != null) {
            f();
        }
        crzm<btvo> a = this.s.a();
        crzp<btvo> crzpVar = this.r;
        dbsk.s(crzpVar);
        a.c(crzpVar);
        bvqm bvqmVar = this.o;
        if (bvqmVar == null) {
            return;
        }
        bvqmVar.quit();
    }

    public final synchronized void d(final avoy avoyVar, Executor executor) {
        this.g.a(avoyVar, executor);
        if (this.h != null && this.a.b() - this.i <= this.p) {
            final avpd avpdVar = this.h;
            executor.execute(new Runnable(avoyVar, avpdVar) { // from class: avou
                private final avoy a;
                private final avpd b;

                {
                    this.a = avoyVar;
                    this.b = avpdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    avoy avoyVar2 = this.a;
                    avpd avpdVar2 = this.b;
                    dbsk.s(avpdVar2);
                    avoyVar2.a(avpdVar2);
                }
            });
        }
    }

    public final void e(avoy avoyVar) {
        this.g.c(avoyVar);
    }
}
