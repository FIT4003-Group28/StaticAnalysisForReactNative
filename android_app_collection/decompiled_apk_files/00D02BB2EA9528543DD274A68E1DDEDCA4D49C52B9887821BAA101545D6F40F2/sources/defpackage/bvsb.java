package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvsb  reason: default package */
/* loaded from: classes.dex */
public final class bvsb {
    public static final /* synthetic */ int e = 0;
    private static final long f = TimeUnit.MINUTES.toMillis(1);
    private static final dcqe g = dcqe.c("bvsb");
    public final csso a;
    public boolean b;
    public boolean c;
    public final cssn d;
    private final Runtime h;
    private final Random i;
    private final dxio<ckcw> j;
    private final dxio<bvkx> k;
    private final dxio<bvrb> l;
    private final dxio<ckmm> m;
    private final dxio<btmg> n;
    private final dzsj<duxm> o;
    private final dzsj<dkwa> p;
    private boolean q;
    @dzsi
    private Boolean r;
    private bvpk s;

    public bvsb(csso cssoVar, dxio<ckcw> dxioVar, dxio<bvkx> dxioVar2, dxio<bvrb> dxioVar3, dxio<ckmm> dxioVar4, dxio<btmg> dxioVar5, dzsj<duxm> dzsjVar, dzsj<dkwa> dzsjVar2) {
        Runtime runtime = Runtime.getRuntime();
        Random random = new Random();
        this.q = true;
        this.b = false;
        this.r = null;
        this.s = bvpk.a(bvrw.a);
        this.d = new bvsa(this);
        this.a = cssoVar;
        this.h = runtime;
        this.i = random;
        this.j = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.m = dxioVar4;
        this.n = dxioVar5;
        this.o = dzsjVar;
        this.p = dzsjVar2;
    }

    public final void a() {
        if (this.r == null) {
            this.r = Boolean.valueOf(this.i.nextFloat() < this.o.a().i);
        }
        if (!this.r.booleanValue()) {
            return;
        }
        this.l.a().a(new Runnable(this) { // from class: bvrx
            private final bvsb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, bvrj.BACKGROUND_THREADPOOL, f);
        if (!this.c) {
            return;
        }
        dcdn<ddho, Long> b = this.p.a().d ? this.n.a().b() : null;
        if (b != null) {
            ckmm a = this.m.a();
            cwsv cwsvVar = ckoh.m;
            eaci bZ = eacm.h.bZ();
            ArrayList arrayList = new ArrayList();
            dcpd<Map.Entry<ddho, Long>> it = b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ddho, Long> next = it.next();
                if (next.getValue().longValue() > 2147483647L) {
                    bvoo.h("bitmap memory size of Visual %d exceeds java int max value.", Integer.valueOf(next.getKey().b()));
                }
                eacg bZ2 = each.d.bZ();
                int b2 = next.getKey().b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                each eachVar = (each) bZ2.b;
                eachVar.a |= 1;
                eachVar.b = b2;
                int intValue = next.getValue().intValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                each eachVar2 = (each) bZ2.b;
                eachVar2.a |= 2;
                eachVar2.c = intValue;
                arrayList.add(bZ2.bK());
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacm eacmVar = (eacm) bZ.b;
            dsrj<each> dsrjVar = eacmVar.g;
            if (!dsrjVar.a()) {
                eacmVar.g = dsqw.cl(dsrjVar);
            }
            dsod.bv(arrayList, eacmVar.g);
            a.h(cwsvVar, bZ.bK());
            return;
        }
        this.m.a().g(ckoh.m);
    }

    public final synchronized void b() {
        this.q = false;
        this.s = bvpk.a(new bvrz(this));
        this.k.a().j(this.s, bvrj.BACKGROUND_THREADPOOL, bvkw.ON_STARTUP_FULLY_COMPLETE);
        this.k.a().j(new Runnable(this) { // from class: bvry
            private final bvsb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, bvrj.BACKGROUND_THREADPOOL, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    public final synchronized void c() {
        this.s.b();
        this.q = true;
        this.b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        float freeMemory = (float) (this.h.totalMemory() - this.h.freeMemory());
        int round = Math.round((freeMemory / ((float) this.h.maxMemory())) * 100.0f);
        int round2 = Math.round(freeMemory / 1048576.0f);
        if (this.q) {
            ((ckcp) this.j.a().a(ckip.K)).a(round);
            ((ckcp) this.j.a().a(ckip.L)).a(round2);
        } else if (!this.b) {
        } else {
            ((ckcp) this.j.a().a(ckip.I)).a(round);
            ((ckcp) this.j.a().a(ckip.J)).a(round2);
        }
    }
}
