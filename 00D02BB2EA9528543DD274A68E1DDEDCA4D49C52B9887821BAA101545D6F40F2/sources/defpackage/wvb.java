package defpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wvb  reason: default package */
/* loaded from: classes7.dex */
public final class wvb {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    private final PriorityQueue<wva> b = new PriorityQueue<>();
    private final PriorityQueue<wuz> c = new PriorityQueue<>();
    private final cqat d;

    public wvb(cqat cqatVar) {
        this.d = cqatVar;
    }

    @dzsi
    public final synchronized dopk a(qdv qdvVar) {
        long b = this.d.b();
        Iterator<wva> it = this.b.iterator();
        while (it.hasNext()) {
            wva next = it.next();
            if (next.a() < b) {
                it.remove();
            } else if (next.c().equals(qdvVar)) {
                return next.b();
            }
        }
        return null;
    }

    @dzsi
    public final synchronized wuz b(akqi akqiVar) {
        long b = this.d.b();
        Iterator<wuz> it = this.c.iterator();
        while (it.hasNext()) {
            wuz next = it.next();
            if (next.a() < b) {
                it.remove();
            } else if (next.b().equals(akqiVar)) {
                return next;
            }
        }
        return null;
    }

    public final synchronized void c(qdv qdvVar, djza djzaVar) {
        long b = this.d.b();
        akqi a2 = qdvVar.a();
        dopk dopkVar = djzaVar.b;
        if (dopkVar == null) {
            dopkVar = dopk.x;
        }
        this.b.add(new wuy(a + b, dopkVar, qdvVar));
        if (a2 == null || (djzaVar.a & 8) == 0) {
            return;
        }
        Iterator<wuz> it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next().b().equals(a2)) {
                it.remove();
            }
        }
        PriorityQueue<wuz> priorityQueue = this.c;
        eapm eapmVar = new eapm(b);
        eapmVar.f();
        eapmVar.i();
        eapmVar.j();
        eapmVar.e();
        long j = eapmVar.a;
        dvvo dvvoVar = djzaVar.d;
        if (dvvoVar == null) {
            dvvoVar = dvvo.e;
        }
        priorityQueue.add(new wux(j, a2, dvvoVar, dopkVar.h));
    }

    public final synchronized void d() {
        this.b.clear();
        this.c.clear();
    }
}
