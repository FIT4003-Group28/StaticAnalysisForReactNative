package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjwk  reason: default package */
/* loaded from: classes.dex */
public final class cjwk implements cjwl {
    private final dcep<cjwa> a;
    private final dehq b;
    @dzsi
    private ScheduledFuture<?> c;
    @dzsi
    private ScheduledFuture<?> d;
    private final dzsj<duxm> e;
    private final dxio<bvjj> f;
    private final akfa g;

    public cjwk(cjwa cjwaVar, cjwa cjwaVar2, dehq dehqVar, dzsj<duxm> dzsjVar, dxio<bvjj> dxioVar, akfa akfaVar) {
        this.b = dehqVar;
        this.e = dzsjVar;
        this.f = dxioVar;
        this.g = akfaVar;
        this.a = dcep.C(cjwaVar2, cjwaVar);
    }

    @Override // defpackage.cjwl
    public final void a(@dzsi btlu btluVar, cjtk cjtkVar) {
        dbsk.l(!btlu.a.equals(btluVar));
        int a = duxl.a(this.e.a().k);
        if (a != 0) {
            if (a == 3) {
                cjtkVar.r();
            } else if (a == 5 && cjtkVar.f()) {
                cjtkVar.r();
            }
        }
        dcpd<cjwa> it = this.a.iterator();
        while (it.hasNext()) {
            cjwa next = it.next();
            cjwj cjwjVar = cjtkVar.q() ? cjwj.HIGH : cjwj.LOWEST;
            if (next.a(cjtkVar)) {
                next.b(btluVar, cjtkVar, cjwjVar);
            }
        }
    }

    @Override // defpackage.cjwl
    public final void b() {
        if (this.e.a().o) {
            this.c = this.b.f(new Runnable(this) { // from class: cjwf
                private final cjwk a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e(cjwj.HIGH);
                }
            }, 200L, 200L, TimeUnit.MILLISECONDS);
        }
        this.d = this.b.f(new Runnable(this) { // from class: cjwg
            private final cjwk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        }, this.e.a().b, this.e.a().b, TimeUnit.SECONDS);
        this.g.G(deho.c(new Runnable(this) { // from class: cjwh
            private final cjwk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        }));
    }

    @Override // defpackage.cjwl
    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture<?> scheduledFuture2 = this.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.b.execute(new Runnable(this) { // from class: cjwi
            private final cjwk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
    }

    public final void d() {
        e(cjwj.LOWEST);
    }

    public final void e(cjwj cjwjVar) {
        cjwj[] values;
        btlu btluVar;
        if (!this.f.a().i(bvjk.br)) {
            return;
        }
        dcpd<cjwa> it = this.a.iterator();
        loop0: while (it.hasNext()) {
            cjwa next = it.next();
            for (cjwj cjwjVar2 : cjwj.values()) {
                if (cjwjVar2.compareTo(cjwjVar) >= 0) {
                    dcde<String, cjtk> b = next.g(cjwjVar2).b();
                    dcpd<String> it2 = b.J().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        dcdc<cjtk> h = b.h(next2);
                        try {
                            if (next2.equals("")) {
                                btluVar = null;
                            } else {
                                bvrj.UI_THREAD.d();
                                btlu btluVar2 = next.b.get(next2);
                                if (btluVar2 == null) {
                                    btluVar = !btlu.n(next.c.j()) ? next.c.n(next2) : btluVar2;
                                    if (btluVar == null) {
                                        throw new cjvy();
                                        break loop0;
                                    }
                                } else {
                                    btluVar = btluVar2;
                                }
                            }
                            next.c(cjvz.d(btluVar, h, cjwjVar2));
                        } catch (cjvy unused) {
                        }
                    }
                }
            }
        }
    }
}
