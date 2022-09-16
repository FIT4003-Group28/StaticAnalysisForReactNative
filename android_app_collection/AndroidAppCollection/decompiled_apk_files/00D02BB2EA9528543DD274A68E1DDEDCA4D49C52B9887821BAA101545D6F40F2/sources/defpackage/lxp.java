package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lxp  reason: default package */
/* loaded from: classes.dex */
public final class lxp implements lyz, btph {
    public final lzf a;
    public final Context b;
    public final Executor c;
    public final cqat d;
    public final btrm e;
    public final bvjj f;
    @dzsi
    public final dxio<jzv> g;
    public final dxio<btvo> h;
    public final dxio<aukk> i;
    public final ksz j;
    public final ksr k;
    public boolean l;
    public boolean m;
    public boolean n;
    @dzsi
    public int p;
    private final Executor q;
    private final dxio<cjqy> r;
    private final ckco s;
    private final ckco t;
    private boolean u;
    private boolean v;
    private final vyy w = new lxk(this);
    public final Runnable o = new lxn(this);

    public lxp(lzf lzfVar, Context context, Executor executor, Executor executor2, cqat cqatVar, btrm btrmVar, bvjj bvjjVar, @dzsi dxio<jzv> dxioVar, dxio<cjqy> dxioVar2, dxio<btvo> dxioVar3, ckcw ckcwVar, ksr ksrVar, dxio<aukk> dxioVar4) {
        dbsk.s(lzfVar);
        this.a = lzfVar;
        dbsk.s(context);
        this.b = context;
        dbsk.s(executor);
        this.c = executor;
        dbsk.s(executor2);
        this.q = executor2;
        dbsk.s(cqatVar);
        this.d = cqatVar;
        dbsk.s(btrmVar);
        this.e = btrmVar;
        dbsk.s(bvjjVar);
        this.f = bvjjVar;
        this.g = dxioVar;
        dbsk.s(dxioVar2);
        this.r = dxioVar2;
        dbsk.s(dxioVar3);
        this.h = dxioVar3;
        this.j = new ksz(btrmVar);
        this.k = ksrVar;
        this.i = dxioVar4;
        this.s = (ckco) ckcwVar.a(ckee.ap);
        this.t = (ckco) ckcwVar.a(ckee.aq);
        this.n = true;
    }

    public static void e(bvjj bvjjVar) {
        bvjjVar.Z(bvjk.ec, 0L);
    }

    public static void i(String str) {
        dcqe.b.v(dcqz.FULL);
    }

    public static String k(long j) {
        return j == 0 ? "none" : new eapd(j).c().toString();
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.lyz
    public final void a() {
        this.u = true;
    }

    public final boolean b() {
        return this.u;
    }

    public final void d() {
        dbsk.l(this.a.f());
        m(2);
        if (b()) {
            l(1);
        } else if (this.a.e()) {
            l(2);
        } else {
            bvjj bvjjVar = this.f;
            if (bvjjVar.w(bvjk.ea, 0L) <= bvjjVar.w(bvjk.ec, 0L)) {
                l(3);
                return;
            }
            this.f.Z(bvjk.ef, this.d.b());
            if (this.v) {
                i("Location Helper already started");
            } else {
                ksz kszVar = this.j;
                if (kszVar.d == 0) {
                    btrm btrmVar = kszVar.b;
                    ksy ksyVar = kszVar.e;
                    dceq a = dcet.a();
                    a.b(amqo.class, new kta(amqo.class, ksyVar, bvrj.UI_THREAD));
                    btrmVar.g(ksyVar, a.a());
                }
                kszVar.d++;
                this.v = true;
            }
            m(3);
            vyz.c(this.b, this.c, this.q, this.w);
        }
    }

    public final void f(ddda dddaVar) {
        cjsx i = cjsy.i();
        i.b(dddaVar);
        this.r.a().k(i.a());
    }

    public final void g() {
        if (!this.v) {
            i("Location Helper already stopped");
            return;
        }
        ksz kszVar = this.j;
        int i = kszVar.d - 1;
        kszVar.d = i;
        if (i == 0) {
            kszVar.b.a(kszVar.e);
        }
        this.v = false;
    }

    public final void h() {
        if (!this.m) {
            i("Directions Helper already stopped");
            return;
        }
        this.k.b();
        this.m = false;
    }

    public final void j() {
        ((NotificationManager) this.b.getSystemService("notification")).cancel(dpyv.NAV_RESTORE.dm);
    }

    public final void l(int i) {
        this.p = i;
        this.s.a(lxo.a(i));
    }

    public final void m(int i) {
        this.t.a(i - 1);
    }
}
