package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyut  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyut<ReqT> implements dyls {
    private final dyhw a;
    public final dyib<ReqT, ?> h;
    public final Executor i;
    public final ScheduledExecutorService j;
    @dzsi
    public final dyuu k;
    @dzsi
    public final dyoy l;
    public final boolean m;
    public final dyuh o;
    public final long p;
    public final long q;
    @dzsi
    public final dyus r;
    public long v;
    public dylu w;
    public dyui x;
    public dyui y;
    public long z;
    static final dyhs<String> e = dyhs.d("grpc-previous-rpc-attempts", dyhw.b);
    static final dyhs<String> f = dyhs.d("grpc-retry-pushback-ms", dyhw.b);
    public static final dyjb g = dyjb.c.g("Stream thrown away because RetriableStream committed");
    public static final Random A = new Random();
    public final Object n = new Object();
    public final dypf s = new dypf();
    public volatile dyum t = new dyum(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
    public final AtomicBoolean u = new AtomicBoolean();

    public dyut(dyib<ReqT, ?> dyibVar, dyhw dyhwVar, dyuh dyuhVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, @dzsi dyuu dyuuVar, @dzsi dyoy dyoyVar, @dzsi dyus dyusVar) {
        this.h = dyibVar;
        this.o = dyuhVar;
        this.p = j;
        this.q = j2;
        this.i = executor;
        this.j = scheduledExecutorService;
        this.a = dyhwVar;
        this.k = dyuuVar;
        if (dyuuVar != null) {
            this.z = dyuuVar.b;
        }
        this.l = dyoyVar;
        boolean z = false;
        dbsk.b(dyuuVar == null || dyoyVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.m = dyoyVar != null ? true : z;
        this.r = dyusVar;
    }

    @Override // defpackage.dyls
    public final void a(dylu dyluVar) {
        dyui dyuiVar;
        dyus dyusVar;
        this.w = dyluVar;
        dyjb o = o();
        if (o != null) {
            e(o);
            return;
        }
        synchronized (this.n) {
            this.t.b.add(new dyue(this));
        }
        dyur t = t(0);
        if (this.m) {
            synchronized (this.n) {
                this.t = this.t.b(t);
                dyuiVar = null;
                if (w(this.t) && ((dyusVar = this.r) == null || dyusVar.a())) {
                    dyuiVar = new dyui(this.n);
                    this.y = dyuiVar;
                }
            }
            if (dyuiVar != null) {
                dyuiVar.a(this.j.schedule(new dyuk(this, dyuiVar), this.l.b, TimeUnit.NANOSECONDS));
            }
        }
        u(t);
    }

    @Override // defpackage.dyvj
    public final void b(int i) {
        dyum dyumVar = this.t;
        if (dyumVar.a) {
            dyumVar.f.a.b(i);
        } else {
            v(new dyuc(i));
        }
    }

    @Override // defpackage.dyvj
    public final void c(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.dyls
    public final void d() {
        v(new dyty());
    }

    @Override // defpackage.dyls
    public final void e(dyjb dyjbVar) {
        dyur dyurVar = new dyur(0);
        dyurVar.a = new dysw();
        Runnable r = r(dyurVar);
        if (r != null) {
            this.w.d(dyjbVar, new dyhw());
            r.run();
            return;
        }
        this.t.f.a.e(dyjbVar);
        synchronized (this.n) {
            dyum dyumVar = this.t;
            this.t = new dyum(dyumVar.b, dyumVar.c, dyumVar.d, dyumVar.f, true, dyumVar.a, dyumVar.h, dyumVar.e);
        }
    }

    @Override // defpackage.dyls
    public final dyel f() {
        throw null;
    }

    @Override // defpackage.dyvj
    public final void g() {
        dyum dyumVar = this.t;
        if (dyumVar.a) {
            dyumVar.f.a.g();
        } else {
            v(new dytx());
        }
    }

    @Override // defpackage.dyvj
    public final void h(dyfi dyfiVar) {
        v(new dytu(dyfiVar));
    }

    @Override // defpackage.dyls
    public final void i(dyfr dyfrVar) {
        v(new dytv(dyfrVar));
    }

    @Override // defpackage.dyls
    public final void j(int i) {
        v(new dytz(i));
    }

    @Override // defpackage.dyls
    public final void k(int i) {
        v(new dyua(i));
    }

    @Override // defpackage.dyls
    public final void l(dypf dypfVar) {
        dyum dyumVar;
        synchronized (this.n) {
            dypfVar.b("closed", this.s);
            dyumVar = this.t;
        }
        if (dyumVar.f != null) {
            dypf dypfVar2 = new dypf();
            dyumVar.f.a.l(dypfVar2);
            dypfVar.b("committed", dypfVar2);
            return;
        }
        dypf dypfVar3 = new dypf();
        for (dyur dyurVar : dyumVar.c) {
            dypf dypfVar4 = new dypf();
            dyurVar.a.l(dypfVar4);
            dypfVar3.a(dypfVar4);
        }
        dypfVar.b("open", dypfVar3);
    }

    @Override // defpackage.dyls
    public final void m(dyfu dyfuVar) {
        v(new dytw(dyfuVar));
    }

    @Override // defpackage.dyvj
    public final void n() {
        v(new dyub());
    }

    @dzsi
    public abstract dyjb o();

    public abstract void p();

    public abstract dyls q(dyfb dyfbVar, dyhw dyhwVar);

    @dzsi
    public final Runnable r(dyur dyurVar) {
        List<dyuf> list;
        Collection emptyList;
        Future<?> future;
        Future<?> future2;
        synchronized (this.n) {
            if (this.t.f != null) {
                return null;
            }
            Collection<dyur> collection = this.t.c;
            dyum dyumVar = this.t;
            boolean z = true;
            dbsk.m(dyumVar.f == null, "Already committed");
            List<dyuf> list2 = dyumVar.b;
            if (dyumVar.c.contains(dyurVar)) {
                list = null;
                emptyList = Collections.singleton(dyurVar);
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z = false;
            }
            this.t = new dyum(list, emptyList, dyumVar.d, dyurVar, dyumVar.g, z, dyumVar.h, dyumVar.e);
            this.o.a(-this.v);
            dyui dyuiVar = this.x;
            if (dyuiVar != null) {
                Future<?> b = dyuiVar.b();
                this.x = null;
                future = b;
            } else {
                future = null;
            }
            dyui dyuiVar2 = this.y;
            if (dyuiVar2 != null) {
                Future<?> b2 = dyuiVar2.b();
                this.y = null;
                future2 = b2;
            } else {
                future2 = null;
            }
            return new dytt(this, collection, dyurVar, future, future2);
        }
    }

    public final void s(dyur dyurVar) {
        Runnable r = r(dyurVar);
        if (r != null) {
            r.run();
        }
    }

    public final dyur t(int i) {
        dyur dyurVar = new dyur(i);
        dyts dytsVar = new dyts(new dyug(this, dyurVar));
        dyhw dyhwVar = this.a;
        dyhw dyhwVar2 = new dyhw();
        dyhwVar2.k(dyhwVar);
        if (i > 0) {
            dyhwVar2.i(e, String.valueOf(i));
        }
        dyurVar.a = q(dytsVar, dyhwVar2);
        return dyurVar;
    }

    public final void u(dyur dyurVar) {
        Collection unmodifiableCollection;
        List<dyuf> list;
        boolean z = false;
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            synchronized (this.n) {
                dyum dyumVar = this.t;
                dyur dyurVar2 = dyumVar.f;
                if (dyurVar2 == null || dyurVar2 == dyurVar) {
                    if (i == dyumVar.b.size()) {
                        dbsk.m(!dyumVar.a, "Already passThrough");
                        if (dyurVar.b) {
                            unmodifiableCollection = dyumVar.c;
                        } else if (dyumVar.c.isEmpty()) {
                            unmodifiableCollection = Collections.singletonList(dyurVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList(dyumVar.c);
                            arrayList2.add(dyurVar);
                            unmodifiableCollection = Collections.unmodifiableCollection(arrayList2);
                        }
                        Collection collection = unmodifiableCollection;
                        dyur dyurVar3 = dyumVar.f;
                        boolean z2 = dyurVar3 != null;
                        List<dyuf> list2 = dyumVar.b;
                        if (z2) {
                            if (dyurVar3 == dyurVar) {
                                z = true;
                            }
                            dbsk.m(z, "Another RPC attempt has already committed");
                            list = null;
                        } else {
                            list = list2;
                        }
                        this.t = new dyum(list, collection, dyumVar.d, dyumVar.f, dyumVar.g, z2, dyumVar.h, dyumVar.e);
                        return;
                    } else if (dyurVar.b) {
                        return;
                    } else {
                        int min = Math.min(i + 128, dyumVar.b.size());
                        if (arrayList == null) {
                            arrayList = new ArrayList(dyumVar.b.subList(i, min));
                        } else {
                            arrayList.clear();
                            arrayList.addAll(dyumVar.b.subList(i, min));
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dyuf dyufVar = (dyuf) arrayList.get(i2);
                            dyum dyumVar2 = this.t;
                            dyur dyurVar4 = dyumVar2.f;
                            if (dyurVar4 == null || dyurVar4 == dyurVar) {
                                if (!dyumVar2.g) {
                                    dyufVar.a(dyurVar);
                                } else {
                                    if (dyurVar4 == dyurVar) {
                                        z = true;
                                    }
                                    dbsk.m(z, "substream should be CANCELLED_BECAUSE_COMMITTED already");
                                    return;
                                }
                            }
                        }
                        i = min;
                    }
                } else {
                    dyurVar.a.e(g);
                    return;
                }
            }
        }
    }

    public final void v(dyuf dyufVar) {
        Collection<dyur> collection;
        synchronized (this.n) {
            if (!this.t.a) {
                this.t.b.add(dyufVar);
            }
            collection = this.t.c;
        }
        for (dyur dyurVar : collection) {
            dyufVar.a(dyurVar);
        }
    }

    public final boolean w(dyum dyumVar) {
        return dyumVar.f == null && dyumVar.e < this.l.a && !dyumVar.h;
    }

    public final void x() {
        Future<?> future;
        synchronized (this.n) {
            dyui dyuiVar = this.y;
            future = null;
            if (dyuiVar != null) {
                Future<?> b = dyuiVar.b();
                this.y = null;
                future = b;
            }
            this.t = this.t.a();
        }
        if (future != null) {
            future.cancel(false);
        }
    }
}
