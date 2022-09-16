package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayxt  reason: default package */
/* loaded from: classes2.dex */
final class ayxt extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = 3240706908776709697L;
    final bame a;
    final aynp b;
    final long c = 1;
    final AtomicLong d = new AtomicLong();
    final Deque e = new ArrayDeque();
    bamf f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;

    public ayxt(bame bameVar, aynp aynpVar) {
        this.a = bameVar;
        this.b = aynpVar;
    }

    static final void g(Deque deque) {
        synchronized (deque) {
            deque.clear();
        }
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.i = th;
        this.h = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        boolean z;
        boolean z2;
        if (this.h) {
            return;
        }
        Deque deque = this.e;
        synchronized (deque) {
            z = true;
            z2 = false;
            if (deque.size() == this.c) {
                aynp aynpVar = aynp.ERROR;
                int ordinal = this.b.ordinal();
                if (ordinal == 1) {
                    deque.poll();
                    deque.offer(obj);
                } else if (ordinal != 2) {
                    z = false;
                    z2 = true;
                } else {
                    deque.pollLast();
                    deque.offer(obj);
                }
            } else {
                deque.offer(obj);
                z = false;
            }
        }
        if (z) {
            return;
        }
        if (z2) {
            this.f.si();
            b(new aypp());
            return;
        }
        d();
    }

    final void d() {
        boolean isEmpty;
        Object poll;
        if (getAndIncrement() != 0) {
            return;
        }
        Deque deque = this.e;
        bame bameVar = this.a;
        int i = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            while (j2 != j) {
                if (!this.g) {
                    boolean z = this.h;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    if (z) {
                        Throwable th = this.i;
                        if (th != null) {
                            g(deque);
                            bameVar.b(th);
                            return;
                        } else if (poll == null) {
                            bameVar.sm();
                            return;
                        }
                    } else if (poll == null) {
                        break;
                    }
                    bameVar.c(poll);
                    j2++;
                } else {
                    g(deque);
                    return;
                }
            }
            if (j2 == j) {
                if (!this.g) {
                    boolean z2 = this.h;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z2) {
                        Throwable th2 = this.i;
                        if (th2 != null) {
                            g(deque);
                            bameVar.b(th2);
                            return;
                        } else if (isEmpty) {
                            bameVar.sm();
                            return;
                        }
                    }
                } else {
                    g(deque);
                    return;
                }
            }
            if (j2 != 0) {
                ayno.e(this.d, j2);
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.g = true;
        this.f.si();
        if (getAndIncrement() == 0) {
            g(this.e);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        this.h = true;
        d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.d, j);
            d();
        }
    }
}
