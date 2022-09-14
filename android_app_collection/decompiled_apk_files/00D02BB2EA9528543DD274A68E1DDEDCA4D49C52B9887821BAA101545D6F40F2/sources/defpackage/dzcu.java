package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzcu  reason: default package */
/* loaded from: classes6.dex */
final class dzcu<T> extends AtomicReference<Thread> implements Runnable, dyzt, eavm {
    private static final long serialVersionUID = 8094547886072529208L;
    final eavl<? super T> a;
    final dyzy b;
    final AtomicReference<eavm> c = new AtomicReference<>();
    final AtomicLong d = new AtomicLong();
    final boolean e = false;
    eavk<T> f;

    public dzcu(eavl<? super T> eavlVar, dyzy dyzyVar, eavk<T> eavkVar) {
        this.a = eavlVar;
        this.b = dyzyVar;
        this.f = eavkVar;
    }

    @Override // defpackage.eavm
    public final void SS() {
        dzfj.f(this.c);
        this.b.SQ();
    }

    @Override // defpackage.eavm
    public final void a(long j) {
        long j2;
        long j3;
        if (dzfj.d(j)) {
            eavm eavmVar = this.c.get();
            if (eavmVar != null) {
                f(j, eavmVar);
                return;
            }
            AtomicLong atomicLong = this.d;
            do {
                j2 = atomicLong.get();
                j3 = Long.MAX_VALUE;
                if (j2 == Long.MAX_VALUE) {
                    break;
                }
                long j4 = j2 + j;
                if (j4 >= 0) {
                    j3 = j4;
                }
            } while (!atomicLong.compareAndSet(j2, j3));
            eavm eavmVar2 = this.c.get();
            if (eavmVar2 == null) {
                return;
            }
            long andSet = this.d.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            f(andSet, eavmVar2);
        }
    }

    @Override // defpackage.eavl
    public final void b(eavm eavmVar) {
        if (dzfj.e(this.c, eavmVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            f(andSet, eavmVar);
        }
    }

    @Override // defpackage.eavl
    public final void c(T t) {
        this.a.c(t);
    }

    @Override // defpackage.eavl
    public final void d(Throwable th) {
        this.a.d(th);
        this.b.SQ();
    }

    @Override // defpackage.eavl
    public final void e() {
        this.a.e();
        this.b.SQ();
    }

    final void f(long j, eavm eavmVar) {
        if (Thread.currentThread() == get()) {
            eavmVar.a(j);
        } else {
            this.b.b(new dzct(eavmVar, j));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        eavk<T> eavkVar = this.f;
        this.f = null;
        ((dyzs) eavkVar).a(this);
    }
}
