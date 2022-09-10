package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: criw  reason: default package */
/* loaded from: classes5.dex */
public final class criw {
    public final cqat b;
    public final bvrb c;
    public final crjk d;
    public final crlb e;
    public final crjn f;
    public final bvny g;
    @dzsi
    public List<dozz> h;
    @dzsi
    public dqvj i;
    public boolean j;
    @dzsi
    public GmmLocation m;
    public boolean n;
    private final btrm o;
    private final arpm p;
    private vul q;
    @dzsi
    private List<dpjx> r;
    private final crlp s;
    public int a = 60000;
    public long k = 0;
    public boolean l = false;

    public criw(cqat cqatVar, btrm btrmVar, bvrb bvrbVar, crjk crjkVar, crlb crlbVar, arpm arpmVar, crjn crjnVar, crlp crlpVar, cjqy cjqyVar) {
        dbsk.t(cqatVar, "clock");
        this.b = cqatVar;
        dbsk.t(btrmVar, "eventBus");
        this.o = btrmVar;
        dbsk.t(bvrbVar, "threadPoolService");
        this.c = bvrbVar;
        dbsk.t(crjkVar, "guiders");
        this.d = crjkVar;
        dbsk.t(crlbVar, "promptScheduler");
        this.e = crlbVar;
        dbsk.t(arpmVar, "connection");
        this.p = arpmVar;
        dbsk.t(crjnVar, "responseConverter");
        this.f = crjnVar;
        this.g = new bvny(1000L);
        dbsk.t(crlpVar, "trafficReportScheduler");
        this.s = crlpVar;
        dbsk.t(cjqyVar, "userEvent3Reporter");
    }

    public final void a(vul vulVar) {
        this.q = vulVar;
        this.p.c(new criv(this), bvrj.NAVIGATION_INTERNAL);
        this.n = false;
        btrm btrmVar = this.o;
        dceq a = dcet.a();
        a.b(crhu.class, new crix(crhu.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
        this.j = true;
    }

    public final void b() {
        this.j = false;
        this.o.a(this);
        this.p.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        dbsk.l(this.j);
        if (this.l) {
            int i2 = this.a;
            long j = this.k;
            if (i > i2) {
                this.k = j + (i - i2);
            } else {
                this.k = j - (i2 - i);
                f(this.m);
            }
        }
        this.a = i;
    }

    public final void d(@dzsi List<dpjx> list) {
        bvrj.NAVIGATION_INTERNAL.c();
        dbsk.l(this.j);
        this.r = list;
        this.p.e();
        e();
    }

    public final void e() {
        this.k = 0L;
        this.g.b();
        GmmLocation gmmLocation = this.m;
        if (gmmLocation != null) {
            f(gmmLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(@dzsi GmmLocation gmmLocation) {
        bvrj.NAVIGATION_INTERNAL.c();
        dbsk.l(this.j);
        if (gmmLocation == null) {
            return;
        }
        this.m = gmmLocation;
        if (this.b.b() < this.k) {
            return;
        }
        arpm arpmVar = this.p;
        vul vulVar = this.q;
        dbsk.s(vulVar);
        dqvj dqvjVar = this.i;
        dbsk.s(dqvjVar);
        arpmVar.g(vulVar, dqvjVar, this.s.c(), this.r);
    }
}
