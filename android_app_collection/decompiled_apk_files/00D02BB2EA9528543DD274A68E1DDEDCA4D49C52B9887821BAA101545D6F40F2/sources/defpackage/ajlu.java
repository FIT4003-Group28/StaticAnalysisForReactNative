package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ajlu  reason: default package */
/* loaded from: classes2.dex */
public final class ajlu {
    static final eaow a = eaow.d(30);
    public static final /* synthetic */ int i = 0;
    public final ailf d;
    public final bwrg<ajnx> e;
    public final ckcw f;
    @dzsi
    public Runnable h;
    private final Executor j;
    private final btvo k;
    private final cqat l;
    private final btpc m;
    private final bvrb n;
    private final bvde o;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final Object c = new Object();
    public final Set<ditl> g = new HashSet();

    public ajlu(Application application, Executor executor, btvo btvoVar, cqat cqatVar, ailf ailfVar, btpc btpcVar, bvrb bvrbVar, bvde bvdeVar, ckcw ckcwVar) {
        this.j = executor;
        this.k = btvoVar;
        this.l = cqatVar;
        this.d = ailfVar;
        this.m = btpcVar;
        this.e = new bwrg<>((dssr) ajnx.b.cu(7), application, bwre.PERSISTENT_FILE, "ls_reporting_cache.pb", executor);
        this.n = bvrbVar;
        this.o = bvdeVar;
        this.f = ckcwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:3:0x0009, B:5:0x001a, B:6:0x001f, B:8:0x003b, B:9:0x0040, B:11:0x0053, B:12:0x0058, B:14:0x006a, B:16:0x0072, B:17:0x0077, B:18:0x0083, B:20:0x0087, B:21:0x008c, B:23:0x00a7, B:25:0x00b0, B:26:0x00b5, B:27:0x00c1, B:35:0x00d3, B:37:0x00e5, B:38:0x00ea, B:40:0x0105, B:41:0x010a, B:43:0x0123, B:44:0x0128, B:46:0x0134, B:47:0x013a), top: B:53:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:3:0x0009, B:5:0x001a, B:6:0x001f, B:8:0x003b, B:9:0x0040, B:11:0x0053, B:12:0x0058, B:14:0x006a, B:16:0x0072, B:17:0x0077, B:18:0x0083, B:20:0x0087, B:21:0x008c, B:23:0x00a7, B:25:0x00b0, B:26:0x00b5, B:27:0x00c1, B:35:0x00d3, B:37:0x00e5, B:38:0x00ea, B:40:0x0105, B:41:0x010a, B:43:0x0123, B:44:0x0128, B:46:0x0134, B:47:0x013a), top: B:53:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:3:0x0009, B:5:0x001a, B:6:0x001f, B:8:0x003b, B:9:0x0040, B:11:0x0053, B:12:0x0058, B:14:0x006a, B:16:0x0072, B:17:0x0077, B:18:0x0083, B:20:0x0087, B:21:0x008c, B:23:0x00a7, B:25:0x00b0, B:26:0x00b5, B:27:0x00c1, B:35:0x00d3, B:37:0x00e5, B:38:0x00ea, B:40:0x0105, B:41:0x010a, B:43:0x0123, B:44:0x0128, B:46:0x0134, B:47:0x013a), top: B:53:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:3:0x0009, B:5:0x001a, B:6:0x001f, B:8:0x003b, B:9:0x0040, B:11:0x0053, B:12:0x0058, B:14:0x006a, B:16:0x0072, B:17:0x0077, B:18:0x0083, B:20:0x0087, B:21:0x008c, B:23:0x00a7, B:25:0x00b0, B:26:0x00b5, B:27:0x00c1, B:35:0x00d3, B:37:0x00e5, B:38:0x00ea, B:40:0x0105, B:41:0x010a, B:43:0x0123, B:44:0x0128, B:46:0x0134, B:47:0x013a), top: B:53:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.location.Location r9, defpackage.dcep<defpackage.dqym> r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlu.a(android.location.Location, dcep):void");
    }

    public final dehn<Boolean> b(dcep<btlu> dcepVar) {
        return d(dcepVar, dbpy.a, false);
    }

    public final dehn<Boolean> c(dcep<btlu> dcepVar, dqxx dqxxVar) {
        return d(dcepVar, dbsg.i(dqxxVar), false);
    }

    public final dehn<Boolean> d(dcep<btlu> dcepVar, dbsg<dqxx> dbsgVar, boolean z) {
        final dehn<Boolean> h;
        f();
        this.b.readLock().lock();
        try {
            final dcdc w = dcdc.w(ajlp.a, this.g);
            this.b.readLock().unlock();
            if (!w.isEmpty() || dbsgVar.a()) {
                ((ckco) this.f.a(ckgd.Q)).a(w.size());
                ditj bZ = ditm.f.bZ();
                long b = this.l.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ditm ditmVar = (ditm) bZ.b;
                int i2 = ditmVar.a | 4;
                ditmVar.a = i2;
                ditmVar.c = b;
                ditmVar.a = i2 | 8;
                ditmVar.d = z;
                ditm ditmVar2 = (ditm) bZ.b;
                dsrj<ditl> dsrjVar = ditmVar2.b;
                if (!dsrjVar.a()) {
                    ditmVar2.b = dsqw.cl(dsrjVar);
                }
                dsod.bv(w, ditmVar2.b);
                if (dbsgVar.a()) {
                    dqxx b2 = dbsgVar.b();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ditm ditmVar3 = (ditm) bZ.b;
                    b2.getClass();
                    ditmVar3.e = b2;
                    ditmVar3.a |= 16;
                }
                ditm bK = bZ.bK();
                dccx F = dcdc.F();
                dcpd<btlu> it = dcepVar.iterator();
                while (it.hasNext()) {
                    btlu next = it.next();
                    deig d = deig.d();
                    F.g(d);
                    buac buacVar = ((bvdf) this.o).c;
                    btyq btyqVar = buacVar.a().a;
                    dsqp dsqpVar = (dsqp) btyqVar.cu(5);
                    dsqpVar.bC(btyqVar);
                    btyp btypVar = (btyp) dsqpVar;
                    if (btypVar.c) {
                        btypVar.bF();
                        btypVar.c = false;
                    }
                    btyq btyqVar2 = (btyq) btypVar.b;
                    btyqVar2.a |= 1;
                    btyqVar2.b = true;
                    buacVar.a = btypVar.bK();
                    buacVar.e = next;
                    ((bvdf) this.o).b().a(bK, new ajlt(this, z, next, d), bvrj.BACKGROUND_THREADPOOL);
                }
                h = deew.h(deha.j(F.f()), ajlr.a, this.j);
            } else {
                h = deha.a(false);
            }
            h.Pk(new Runnable(this, h, w) { // from class: ajlq
                private final ajlu a;
                private final dehn b;
                private final dcdc c;

                {
                    this.a = this;
                    this.b = h;
                    this.c = w;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajlu ajluVar = this.a;
                    dehn dehnVar = this.b;
                    dcdc dcdcVar = this.c;
                    if (((Boolean) deha.s(dehnVar)).booleanValue()) {
                        ajluVar.b.writeLock().lock();
                        try {
                            int size = ajluVar.g.size();
                            ajluVar.g.removeAll(dcdcVar);
                            ((ckcn) ajluVar.f.a(ckgd.R)).b(size - ajluVar.g.size());
                            ajluVar.b.writeLock().unlock();
                            ajluVar.e();
                            return;
                        } catch (Throwable th) {
                            ajluVar.b.writeLock().unlock();
                            throw th;
                        }
                    }
                    ((ckco) ajluVar.f.a(ckgd.S)).a(dcdcVar.size());
                }
            }, this.j);
            return h;
        } catch (Throwable th) {
            this.b.readLock().unlock();
            throw th;
        }
    }

    public final void e() {
        synchronized (this.c) {
            if (this.h == null) {
                Runnable runnable = new Runnable(this) { // from class: ajls
                    private final ajlu a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajlu ajluVar = this.a;
                        synchronized (ajluVar.c) {
                            ajluVar.h = null;
                            ajnw bZ = ajnx.b.bZ();
                            ajluVar.f();
                            ajluVar.b.readLock().lock();
                            Set<ditl> set = ajluVar.g;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ajnx ajnxVar = (ajnx) bZ.b;
                            dsrj<ditl> dsrjVar = ajnxVar.a;
                            if (!dsrjVar.a()) {
                                ajnxVar.a = dsqw.cl(dsrjVar);
                            }
                            dsod.bv(set, ajnxVar.a);
                            ajluVar.b.readLock().unlock();
                            ajluVar.e.e(bZ.bK());
                        }
                    }
                };
                this.h = runnable;
                this.n.a(runnable, bvrj.BACKGROUND_THREADPOOL, a.b);
            }
        }
    }

    public final void f() {
        this.b.writeLock().lock();
        try {
            eapd eapdVar = new eapd(this.l.b());
            Iterator<ditl> it = this.g.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                ditl next = it.next();
                dqzg dqzgVar = this.k.getLocationSharingParameters().N;
                if (dqzgVar == null) {
                    dqzgVar = dqzg.c;
                }
                if (!new eaow(new eapd(next.b), eapdVar).q(eaow.e(dqzgVar.b))) {
                    it.remove();
                    i2++;
                }
            }
            ((ckcn) this.f.a(ckgd.T)).b(i2);
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
