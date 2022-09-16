package defpackage;

import android.util.Log;
import j$.util.Comparator$CC;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aapb  reason: default package */
/* loaded from: classes.dex */
public final class aapb implements abfo, afuz {
    public final aafo a;
    private final Executor c;
    private final Executor d;
    private final long e;
    private int g;
    private final AtomicReference h;
    private final PriorityQueue j;
    private final Object f = new Object();
    private final Map i = new ConcurrentHashMap();

    public aapb(ExecutorService executorService, aafi aafiVar, axxb axxbVar) {
        Long l;
        this.a = aafiVar;
        this.d = executorService;
        this.c = new aaos(executorService);
        aqxe aqxeVar = axxbVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        long j = 0;
        if (aqxeVar.a(45354115L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354115L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354115L);
            l = Long.valueOf(aqxfVar.b == 2 ? ((Long) aqxfVar.c).longValue() : j);
        } else {
            l = 0L;
        }
        this.e = l.longValue();
        this.j = new PriorityQueue(1, Comparator$CC.comparingInt(aaow.a));
        this.h = new AtomicReference(aapa.PAUSED);
    }

    private final void f(aapa aapaVar) {
        if (this.h.compareAndSet(aapaVar, aapa.DRAINING)) {
            this.c.execute(new Runnable() { // from class: aaot
                @Override // java.lang.Runnable
                public final void run() {
                    aapb.this.c();
                }
            });
        }
    }

    @Override // defpackage.afuz
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.abfo
    public final Map b(List list) {
        final ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abfr abfrVar = (abfr) it.next();
            aaoz aaozVar = new aaoz(abfrVar);
            aaoz aaozVar2 = (aaoz) Map.EL.putIfAbsent(this.i, abfrVar.c(), aaozVar);
            if (aaozVar2 == null) {
                hashMap.put(abfrVar.c(), aaozVar.b);
                arrayList.add(aaozVar);
            } else {
                hashMap.put(abfrVar.c(), aaozVar2.b);
            }
        }
        this.c.execute(new Runnable() { // from class: aaov
            @Override // java.lang.Runnable
            public final void run() {
                aapb.this.e(arrayList);
            }
        });
        return hashMap;
    }

    public final synchronized void c() {
        while (this.h.get() != aapa.PAUSED) {
            synchronized (this.f) {
                if (this.g < this.e) {
                    final aaoz aaozVar = (aaoz) this.j.poll();
                    if (aaozVar != null) {
                        synchronized (this.f) {
                            this.g++;
                        }
                        if (aaozVar.b.isCancelled()) {
                            d(aaozVar.a.c(), null);
                        } else {
                            this.d.execute(new Runnable() { // from class: aaou
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aapb aapbVar = aapb.this;
                                    aaoz aaozVar2 = aaozVar;
                                    aafo aafoVar = aapbVar.a;
                                    apzg apzgVar = aaozVar2.a.a.g;
                                    if (apzgVar == null) {
                                        apzgVar = apzg.a;
                                    }
                                    aafn.a(aafoVar, apzgVar);
                                }
                            });
                        }
                    } else {
                        this.h.compareAndSet(aapa.DRAINING, aapa.STOPPED);
                        return;
                    }
                } else {
                    this.h.compareAndSet(aapa.DRAINING, aapa.SLEEPING);
                    return;
                }
            }
        }
    }

    public final void d(String str, Throwable th) {
        aaoz aaozVar = (aaoz) this.i.remove(str);
        if (aaozVar == null) {
            String valueOf = String.valueOf(str);
            Log.e("PrefetchCoordinator", valueOf.length() != 0 ? "onPrefetchCompleted unexpected missing task id=".concat(valueOf) : new String("onPrefetchCompleted unexpected missing task id="));
        } else if (th != null) {
            aaozVar.b.e(th);
        } else {
            aaozVar.b.o(null);
        }
        synchronized (this.f) {
            this.g--;
        }
        f(aapa.SLEEPING);
    }

    public final synchronized void e(List list) {
        this.j.addAll(list);
        f(aapa.STOPPED);
    }
}
