package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rcu  reason: default package */
/* loaded from: classes7.dex */
public final class rcu {
    public static final long a = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    private static final long p = TimeUnit.SECONDS.toMillis(2);
    private final bvrb A;
    private long B;
    public final Activity b;
    public final cqat c;
    public final btrm d;
    public final btvo e;
    public final ckcw f;
    @dzsi
    public rcq g;
    @dzsi
    public GmmLocation j;
    @dzsi
    public dwao k;
    @dzsi
    public amte l;
    private final dzsj<srv> q;
    private final ahjq r;
    private final akpm s;
    private final bvjj t;
    @dzsi
    private final wbw u;
    @dzsi
    private final amvh v;
    private final dcdc<amvh> w;
    private final rcr x;
    private final dbsg<dnqh> y;
    @dzsi
    private srv z;
    public long m = -1;
    public final rct o = new rct(this);
    @dzsi
    public amte h = null;
    public long i = -1;
    public final rcs n = new rcs(this);

    public rcu(Activity activity, cqat cqatVar, btrm btrmVar, dzsj<srv> dzsjVar, ahjq ahjqVar, akpm akpmVar, bvjj bvjjVar, bvrb bvrbVar, btvo btvoVar, ckcw ckcwVar, @dzsi wbw wbwVar, @dzsi amvh amvhVar, dcdc<amvh> dcdcVar, @dzsi amte amteVar, rcr rcrVar, dbsg<dnqh> dbsgVar) {
        this.b = activity;
        this.c = cqatVar;
        this.d = btrmVar;
        this.q = dzsjVar;
        this.r = ahjqVar;
        this.s = akpmVar;
        this.t = bvjjVar;
        this.e = btvoVar;
        this.f = ckcwVar;
        this.u = wbwVar;
        this.v = amvhVar;
        this.w = dcdcVar;
        this.x = rcrVar;
        this.l = amteVar;
        this.A = bvrbVar;
        this.y = dbsgVar;
    }

    public final synchronized void a(dwao dwaoVar) {
        b(dwaoVar, false);
    }

    public final synchronized void b(dwao dwaoVar, boolean z) {
        if (!dwaoVar.equals(this.k)) {
            this.h = null;
            this.i = 0L;
        }
        this.k = dwaoVar;
        vum vumVar = new vum();
        vumVar.a = dwaoVar;
        vumVar.g = bvsl.a(this.t);
        vumVar.e = this.s.aa();
        if (this.y.a()) {
            vumVar.o = this.y.b();
        }
        GmmLocation gmmLocation = this.j;
        if (gmmLocation == null) {
            gmmLocation = this.r.a();
        }
        if (this.r.s() && !this.r.h().b() && gmmLocation != null) {
            vumVar.f = gmmLocation.a();
            vumVar.b(amvh.g(this.b, gmmLocation.B()));
        } else {
            amvh amvhVar = this.v;
            if (amvhVar == null || amvhVar.b == dpjs.ENTITY_TYPE_MY_LOCATION) {
                this.g = rcq.ERROR_LOCATION_DISABLED;
                d();
                return;
            }
            vumVar.b(this.v);
        }
        dcdc<amvh> dcdcVar = this.w;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            vumVar.b(dcdcVar.get(i));
        }
        wbw wbwVar = this.u;
        if (wbwVar != null) {
            wbwVar.a(vumVar);
        }
        srv a2 = this.q.a();
        this.z = a2;
        this.g = rcq.LOADING;
        d();
        vun a3 = vumVar.a();
        long j = p;
        a2.m(a3, z, Long.valueOf(j), dcdc.e());
        this.B = this.c.e() + j;
    }

    public final void c(final qbn qbnVar, qbm qbmVar, boolean z) {
        synchronized (this) {
            if (qbnVar != this.z) {
                return;
            }
            amte n = qbmVar.n();
            if (qbmVar.b() && qbmVar.c() && z && n != null && n.a.d()) {
                long max = Math.max(this.B - this.c.e(), 0L);
                this.A.a(new Runnable(this, qbnVar) { // from class: rcp
                    private final rcu a;
                    private final qbn b;

                    {
                        this.a = this;
                        this.b = qbnVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        rcu rcuVar = this.a;
                        qbn qbnVar2 = this.b;
                        rcuVar.c(qbnVar2, qbnVar2.a(), false);
                    }
                }, bvrj.UI_THREAD, max);
                return;
            }
            if (qbmVar.d()) {
                this.g = rcq.ERROR_NETWORK;
            } else if (!qbmVar.o()) {
                this.g = rcq.ERROR_GENERIC;
            } else if (n != null) {
                if (n.a.n() == 0) {
                    this.g = rcq.ERROR_TRIPS_EMPTY;
                } else {
                    amte amteVar = this.h;
                    if (amteVar != null && !amteVar.a.d() && n.a.d()) {
                        this.g = rcq.SUCCESS;
                        return;
                    }
                    if (n.a.d()) {
                        qbnVar.d();
                    }
                    if (n == this.h && this.c.b() - this.i < p) {
                        return;
                    }
                    this.i = this.c.b();
                    this.h = n;
                    this.g = rcq.SUCCESS;
                }
            } else {
                this.g = rcq.ERROR_GENERIC;
            }
            d();
        }
    }

    public final void d() {
        amsy amsyVar;
        dbsk.s(this.g);
        rcr rcrVar = this.x;
        rcq rcqVar = this.g;
        amte amteVar = this.h;
        rch rchVar = (rch) rcrVar;
        rchVar.a.ay.u(rcqVar, amteVar, Long.valueOf(this.i), this.m != -1);
        if (rcqVar == rcq.SUCCESS) {
            if (amteVar != null && (amsyVar = amteVar.a) != null) {
                rchVar.a.ak.b(amsyVar);
            }
            dbsk.s(amteVar);
            for (amub amubVar : amteVar.a(rchVar.a.J())) {
                rci rciVar = rchVar.a;
                rciVar.aC = Math.max(rciVar.aC, TimeUnit.MILLISECONDS.convert(amubVar.z(), TimeUnit.SECONDS));
            }
        }
    }
}
