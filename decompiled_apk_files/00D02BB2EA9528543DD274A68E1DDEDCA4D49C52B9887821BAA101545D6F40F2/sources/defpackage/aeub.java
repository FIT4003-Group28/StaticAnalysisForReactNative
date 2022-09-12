package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeub  reason: default package */
/* loaded from: classes2.dex */
public final class aeub {
    public static final /* synthetic */ int k = 0;
    public final dxio<araj> b;
    public final dxio<aesb> c;
    public final dxio<btrm> d;
    public final dxio<bvrb> e;
    public final boolean h;
    private final gga m;
    private final dxio<aetv> n;
    private final dxio<ahjq> o;
    private final cjqq p;
    private final int t;
    static final long a = TimeUnit.SECONDS.toMillis(5);
    private static final cjtd l = cjtd.a(dtxk.z);
    public final aety f = new aety(this);
    public final aeua g = new aeua(this);
    @dzsi
    private bvpk u = null;
    @dzsi
    public akra i = null;
    public boolean j = true;
    private int v = 1;
    private final boolean q = true;
    private final boolean r = true;
    private final int s = 2;

    public aeub(gga ggaVar, dxio<aetv> dxioVar, dxio<araj> dxioVar2, dxio<aesb> dxioVar3, dxio<ahjq> dxioVar4, dxio<btrm> dxioVar5, dxio<bvrb> dxioVar6, cjqq cjqqVar, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.m = ggaVar;
        this.n = dxioVar;
        this.c = dxioVar3;
        this.o = dxioVar4;
        this.p = cjqqVar;
        this.b = dxioVar2;
        this.d = dxioVar5;
        this.e = dxioVar6;
        this.h = z;
        this.t = true != z4 ? 28 : 38;
    }

    private final void d() {
        bvpk bvpkVar = this.u;
        if (bvpkVar != null) {
            dbsk.s(bvpkVar);
            bvpkVar.b();
            this.u = null;
        }
    }

    public final void a() {
        if (!this.h || this.v >= this.s || this.o.a().h().b() || (this.m.K() instanceof andm)) {
            return;
        }
        bvrj.UI_THREAD.c();
        this.j = true;
        this.v++;
        d();
        c(this.r);
    }

    public final void b() {
        if (!this.h) {
            return;
        }
        bvrj.UI_THREAD.c();
        this.j = false;
        c(false);
    }

    public final void c(boolean z) {
        if (this.i == null || !this.j) {
            d();
            this.n.a().c();
            return;
        }
        if (!this.n.a().b()) {
            aetv a2 = this.n.a();
            aett s = aetu.s(this.m.getString(R.string.BLUE_DOT_HERE_CALLOUT_LABEL));
            s.g();
            s.b();
            s.i();
            s.d(12);
            s.j();
            s.h();
            s.c(this.t);
            s.f("http://www.gstatic.com/maps/promotions/india/right_caret.png");
            aetr aetrVar = (aetr) s;
            aetrVar.b = dbsg.i("http://www.gstatic.com/maps/promotions/india/left_caret.png");
            aetrVar.i = 2;
            s.e(2);
            if (this.q) {
                aetrVar.h = new aetx(this);
            }
            aetu a3 = s.a();
            akra akraVar = this.i;
            dbsk.s(akraVar);
            a2.a(a3, akraVar);
            this.p.g().d(l);
        }
        akra akraVar2 = this.i;
        dbsk.s(akraVar2);
        this.n.a().d(akraVar2);
        if (!z) {
            return;
        }
        d();
        bvpk a4 = bvpk.a(new Runnable(this) { // from class: aetw
            private final aeub a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
        this.u = a4;
        this.e.a().a(a4, bvrj.UI_THREAD, a);
    }
}
