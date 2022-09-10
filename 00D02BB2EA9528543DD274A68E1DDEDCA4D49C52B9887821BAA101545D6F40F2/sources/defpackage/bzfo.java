package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzfo  reason: default package */
/* loaded from: classes4.dex */
public final class bzfo {
    public final amub a;
    public final bzgn b;
    public final cjqy c;
    public final bzfn d;
    public final btvo e;
    public final byzk f;
    @dzsi
    public srv g;
    @dzsi
    public bzex h;
    @dzsi
    public bzey i;
    private final long j;
    private long k = -1;
    private final dzsj<srv> l;
    private final btrm m;
    private final bvjj n;
    private final cqat o;
    private boolean p;
    private boolean q;
    private boolean r;

    public bzfo(dzsj<srv> dzsjVar, bvjj bvjjVar, btrm btrmVar, amub amubVar, bzgn bzgnVar, cqat cqatVar, cjqy cjqyVar, bzfn bzfnVar, btvo btvoVar, byzk byzkVar) {
        this.l = dzsjVar;
        this.n = bvjjVar;
        this.m = btrmVar;
        this.a = amubVar;
        this.b = bzgnVar;
        this.o = cqatVar;
        this.c = cjqyVar;
        this.d = bzfnVar;
        this.e = btvoVar;
        this.j = TimeUnit.SECONDS.toMillis(btvoVar.getTransitTrackingParameters().e);
        this.f = byzkVar;
    }

    public final void a(GmmLocation gmmLocation, boolean z) {
        if (f() || !this.d.d()) {
            return;
        }
        if (!gmmLocation.i()) {
            gmmLocation.getAccuracy();
            return;
        }
        synchronized (this) {
            if (this.g != null) {
                return;
            }
            long e = this.o.e();
            long j = this.k;
            long j2 = e - j;
            if (j >= 0 && j2 < this.j) {
                return;
            }
            this.k = this.o.e();
            srv a = this.l.a();
            d(a);
            b(z);
            g();
            ArrayList arrayList = new ArrayList();
            arrayList.add(amvh.h("", gmmLocation.B()));
            arrayList.add(this.a.k());
            dspd dspdVar = this.a.d.a.g;
            vum vumVar = new vum();
            vumVar.e = dhjx.f;
            vumVar.c(arrayList);
            vumVar.a = this.a.J;
            vumVar.f = gmmLocation.a();
            vumVar.g = bvsl.a(this.n);
            vumVar.i = dspdVar;
            vumVar.k = dquz.STRICT_MATCHING;
            vumVar.o = dnqh.p;
            vumVar.p = false;
            vun a2 = vumVar.a();
            this.f.i++;
            a.j(a2, null);
        }
    }

    public final synchronized void b(boolean z) {
        this.r = z;
    }

    public final synchronized boolean c() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(@dzsi srv srvVar) {
        this.g = srvVar;
    }

    public final synchronized void e() {
        this.p = true;
        if (this.q) {
            h();
        }
    }

    public final synchronized boolean f() {
        return this.p;
    }

    public final synchronized void g() {
        btrm btrmVar = this.m;
        dceq a = dcet.a();
        a.b(srf.class, new bzfp(srf.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
        this.q = true;
    }

    public final synchronized void h() {
        this.m.a(this);
        this.q = false;
    }
}
