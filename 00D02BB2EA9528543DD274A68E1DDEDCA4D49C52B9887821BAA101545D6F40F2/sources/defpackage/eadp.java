package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eadp  reason: default package */
/* loaded from: classes6.dex */
public final class eadp {
    @dzsi
    private ExecutorService b;
    public final Deque<eaej> a = new ArrayDeque();
    private final Deque<eaej> c = new ArrayDeque();
    private final Deque<eaek> d = new ArrayDeque();

    public eadp() {
    }

    private final <T> void g(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final synchronized ExecutorService a() {
        if (this.b == null) {
            this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), eafa.h("OkHttp Dispatcher", false));
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(eaek eaekVar) {
        this.d.add(eaekVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(eaej eaejVar) {
        g(this.c, eaejVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(eaek eaekVar) {
        g(this.d, eaekVar);
    }

    public final void e() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<eaej> it = this.a.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                eaej next = it.next();
                if (this.c.size() >= 64) {
                    break;
                }
                for (eaej eaejVar : this.c) {
                    eaek eaekVar = eaejVar.a;
                    if (eaejVar.a().equals(next.a())) {
                        i++;
                    }
                }
                if (i < 5) {
                    it.remove();
                    arrayList.add(next);
                    this.c.add(next);
                }
            }
            f();
        }
        int size = arrayList.size();
        while (i < size) {
            ((eaej) arrayList.get(i)).b(a());
            i++;
        }
    }

    public final synchronized void f() {
        this.c.size();
        this.d.size();
    }

    public eadp(ExecutorService executorService) {
        this.b = executorService;
    }
}
