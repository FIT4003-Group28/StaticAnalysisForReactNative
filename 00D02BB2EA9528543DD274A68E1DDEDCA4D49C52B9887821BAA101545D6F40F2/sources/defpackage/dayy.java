package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dayy  reason: default package */
/* loaded from: classes5.dex */
public final class dayy<T> {
    public final dayv<T> a;
    public final deig<T> d;
    public final AtomicLong b = new AtomicLong(d(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference<dayx<T>> c = new AtomicReference<>(null);
    private final AtomicReference<dehn<T>> e = new AtomicReference<>(null);
    private final Executor f = dehx.b(dege.a);

    public dayy(deff<T> deffVar, Executor executor) {
        deig<T> d = deig.d();
        this.d = d;
        dayv<T> dayvVar = new dayv<>(deffVar, executor);
        this.a = dayvVar;
        d.Pk(dayvVar, dege.a);
    }

    public static int c(long j) {
        return (int) (j >>> 32);
    }

    public static long d(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final dehn<T> a() {
        long j;
        final int c;
        dehn h;
        if (!this.d.isDone()) {
            do {
                j = this.b.get();
                c = c(j);
            } while (!this.b.compareAndSet(j, d(c, ((int) j) + 1)));
            final deig d = deig.d();
            dehn<T> andSet = this.e.getAndSet(d);
            if (andSet == null) {
                h = deha.f(dazv.f(new deff(this, c) { // from class: dayt
                    private final dayy a;
                    private final int b;

                    {
                        this.a = this;
                        this.b = c;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        return this.a.b(this.b);
                    }
                }), dege.a);
            } else {
                h = deee.h(andSet, Throwable.class, dazv.h(new defg(this, c) { // from class: dayu
                    private final dayy a;
                    private final int b;

                    {
                        this.a = this;
                        this.b = c;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        Throwable th = (Throwable) obj;
                        return this.a.b(this.b);
                    }
                }), this.f);
            }
            d.p(h);
            final dayw daywVar = new dayw(this, c);
            d.Pk(new Runnable(this, d, daywVar) { // from class: days
                private final dayy a;
                private final deig b;
                private final dayw c;

                {
                    this.a = this;
                    this.b = d;
                    this.c = daywVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dayy dayyVar = this.a;
                    deig deigVar = this.b;
                    dayw daywVar2 = this.c;
                    try {
                        dayyVar.d.j(deha.r(deigVar));
                        daywVar2.p(dayyVar.d);
                    } catch (Throwable unused) {
                        daywVar2.p(deigVar);
                    }
                }
            }, dege.a);
            return daywVar;
        }
        return this.d;
    }

    public final dehn<T> b(int i) {
        dayx<T> dayxVar;
        if (c(this.b.get()) > i) {
            return deha.c();
        }
        dayx<T> dayxVar2 = new dayx<>(i);
        do {
            dayxVar = this.c.get();
            if (dayxVar != null && dayxVar.a > i) {
                return deha.c();
            }
        } while (!this.c.compareAndSet(dayxVar, dayxVar2));
        if (c(this.b.get()) > i) {
            dayxVar2.cancel(true);
            this.c.compareAndSet(dayxVar2, null);
            return dayxVar2;
        }
        dayv<T> dayvVar = this.a;
        deff<T> deffVar = dayvVar.a;
        Executor executor = dayvVar.b;
        if (deffVar == null || executor == null) {
            dayxVar2.p(this.d);
        } else {
            dayxVar2.p(deha.f(dazv.f(deffVar), executor));
        }
        return dayxVar2;
    }
}
