package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayun  reason: default package */
/* loaded from: classes2.dex */
final class ayun extends azoe implements ayoa {
    private static final long serialVersionUID = -8158322871608889516L;
    final bame a;
    final bamd[] b;
    final AtomicInteger c = new AtomicInteger();
    int d;
    long e;

    public ayun(bamd[] bamdVarArr, bame bameVar) {
        this.a = bameVar;
        this.b = bamdVarArr;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.e++;
        this.a.c(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (this.k) {
            bamfVar.si();
            return;
        }
        ayrd.b(bamfVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            bamf bamfVar2 = (bamf) this.h.getAndSet(bamfVar);
            d();
            return;
        }
        this.f = bamfVar;
        long j = this.g;
        if (decrementAndGet() != 0) {
            g();
        }
        if (j == 0) {
            return;
        }
        bamfVar.sp(j);
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.c.getAndIncrement() == 0) {
            bamd[] bamdVarArr = this.b;
            int length = bamdVarArr.length;
            int i = this.d;
            while (i != 2) {
                bamd bamdVar = bamdVarArr[i];
                if (bamdVar != null) {
                    long j = this.e;
                    long j2 = 0;
                    if (j != 0) {
                        this.e = 0L;
                        if (!this.l) {
                            if (get() != 0 || !compareAndSet(0, 1)) {
                                ayno.a(this.j, j);
                                d();
                            } else {
                                long j3 = this.g;
                                if (j3 != Long.MAX_VALUE) {
                                    long j4 = j3 - j;
                                    if (j4 < 0) {
                                        azof.b(j4);
                                    } else {
                                        j2 = j4;
                                    }
                                    this.g = j2;
                                }
                                if (decrementAndGet() != 0) {
                                    g();
                                }
                            }
                        }
                    }
                    bamdVar.ad(this);
                    i++;
                    this.d = i;
                    if (this.c.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    this.a.b(new NullPointerException("A Publisher entry is null"));
                    return;
                }
            }
            this.a.sm();
        }
    }
}
