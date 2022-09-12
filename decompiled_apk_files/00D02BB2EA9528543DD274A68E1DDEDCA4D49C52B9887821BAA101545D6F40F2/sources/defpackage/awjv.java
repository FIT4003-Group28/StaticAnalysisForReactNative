package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awjv  reason: default package */
/* loaded from: classes3.dex */
public final class awjv {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    public static final /* synthetic */ int p = 0;
    public final cqat b;
    public final dehq c;
    public final Executor d;
    public final bvjj e;
    public final ckcw f;
    public final btvo g;
    public final btpc h;
    public final avto i;
    public final avki j;
    public final awar k;
    public final crzm<avkc> l;
    public final awic m;
    public final awlm n;
    public final crzm<avzg> o;
    private final btrm q;
    private final ahjq s;
    private final avfp w;
    @dzsi
    private awju u = null;
    @dzsi
    private awju v = null;
    private final awjq r = new awjq(this);
    private final crzp<avzg> t = new awjo(this);

    public awjv(cqat cqatVar, dehq dehqVar, Executor executor, btrm btrmVar, bvjj bvjjVar, ckcw ckcwVar, btvo btvoVar, btpc btpcVar, avto avtoVar, awic awicVar, avki avkiVar, awar awarVar, crzm crzmVar, avfp avfpVar, ahjq ahjqVar, awlm awlmVar, crzm crzmVar2) {
        this.b = cqatVar;
        this.c = dehqVar;
        this.d = executor;
        this.q = btrmVar;
        this.e = bvjjVar;
        this.f = ckcwVar;
        this.g = btvoVar;
        this.h = btpcVar;
        this.i = avtoVar;
        this.m = awicVar;
        this.j = avkiVar;
        this.k = awarVar;
        this.l = crzmVar;
        this.w = avfpVar;
        this.s = ahjqVar;
        this.n = awlmVar;
        this.o = crzmVar2;
    }

    private final boolean e() {
        avzg l = this.o.l();
        return l != null && !l.b().equals(avze.a);
    }

    @dzsi
    public final synchronized dehn<avjg> a(avjy avjyVar) {
        if (this.v != null) {
            return null;
        }
        final awju awjuVar = new awju(this, avjyVar);
        this.v = awjuVar;
        btrm btrmVar = this.q;
        awjq awjqVar = this.r;
        dceq a2 = dcet.a();
        a2.b(ahmo.class, new awjw(ahmo.class, awjqVar));
        btrmVar.g(awjqVar, a2.a());
        this.w.a();
        this.o.d(this.t, this.c);
        avjy avjyVar2 = awjuVar.a;
        avih avihVar = avih.UNKNOWN;
        avjg avjgVar = avjg.OK;
        avjv avjvVar = avjv.UNKNOWN_SCREEN_CHECK;
        avjx avjxVar = avjx.UNKNOWN_TIME_BUDGET;
        avjx b = avjx.b(avjyVar2.j);
        if (b == null) {
            b = avjx.NO_TIME_BUDGET;
        }
        if (b.ordinal() == 2 && !this.h.a()) {
            dkro dkroVar = this.g.getOfflineMapsParameters().x;
            if (dkroVar == null) {
                dkroVar = dkro.h;
            }
            if (!this.n.e().q(eaow.d(dkroVar.c))) {
                b(avjg.BATTERY_BUDGET_EXCEEDED);
                return awjuVar.b;
            }
            this.n.b();
            awjuVar.b.Pk(new Runnable(this) { // from class: awjj
                private final awjv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n.c();
                }
            }, dege.a);
        }
        final GmmLocation a3 = this.s.a();
        boolean z = false;
        if (avjyVar.b && a3 == null) {
            z = true;
        }
        if (e() && !z) {
            this.d.execute(new Runnable(awjuVar, a3) { // from class: awjg
                private final awju a;
                private final DeviceLocation b;

                {
                    this.a = awjuVar;
                    this.b = a3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awju awjuVar2 = this.a;
                    DeviceLocation deviceLocation = this.b;
                    int i = awjv.p;
                    awjuVar2.a(deviceLocation);
                }
            });
            return awjuVar.b;
        }
        this.u = awjuVar;
        bvqd.a(this.c.d(new Runnable(this, awjuVar) { // from class: awjf
            private final awjv a;
            private final awju b;

            {
                this.a = this;
                this.b = awjuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b);
            }
        }, a, TimeUnit.MILLISECONDS), this.c);
        return awjuVar.b;
    }

    public final void b(avjg avjgVar) {
        awju awjuVar;
        avjgVar.ordinal();
        synchronized (this) {
            awjuVar = this.v;
            this.v = null;
            if (awjuVar != null) {
                this.q.a(this.r);
                this.o.c(this.t);
            }
        }
        if (awjuVar != null) {
            awjuVar.b.j(avjgVar);
            if (avjgVar == avjg.OK) {
                return;
            }
            ckco ckcoVar = (ckco) this.f.a(ckia.o);
            avih avihVar = avih.UNKNOWN;
            avjv avjvVar = avjv.UNKNOWN_SCREEN_CHECK;
            avjx avjxVar = avjx.UNKNOWN_TIME_BUDGET;
            int i = 1;
            switch (avjgVar.ordinal()) {
                case 5:
                    i = 9;
                    break;
                case 6:
                    i = 2;
                    break;
                case 7:
                    i = 3;
                    break;
                case 8:
                    i = 4;
                    break;
                case 9:
                    i = 10;
                    break;
                case 10:
                    i = 11;
                    break;
            }
            ckcoVar.a(ckhx.a(i));
        }
    }

    public final synchronized void c(final awju awjuVar) {
        final GmmLocation a2 = this.s.a();
        if (this.u == awjuVar) {
            this.u = null;
            this.d.execute(new Runnable(awjuVar, a2) { // from class: awjh
                private final awju a;
                private final DeviceLocation b;

                {
                    this.a = awjuVar;
                    this.b = a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awju awjuVar2 = this.a;
                    DeviceLocation deviceLocation = this.b;
                    int i = awjv.p;
                    awjuVar2.a(deviceLocation);
                }
            });
        }
    }

    public final synchronized void d() {
        final awju awjuVar = this.u;
        final GmmLocation a2 = this.s.a();
        if (!e() || awjuVar == null || (awjuVar.a.b && a2 == null)) {
            return;
        }
        this.u = null;
        this.d.execute(new Runnable(awjuVar, a2) { // from class: awji
            private final awju a;
            private final DeviceLocation b;

            {
                this.a = awjuVar;
                this.b = a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awju awjuVar2 = this.a;
                DeviceLocation deviceLocation = this.b;
                int i = awjv.p;
                awjuVar2.a(deviceLocation);
            }
        });
    }
}
