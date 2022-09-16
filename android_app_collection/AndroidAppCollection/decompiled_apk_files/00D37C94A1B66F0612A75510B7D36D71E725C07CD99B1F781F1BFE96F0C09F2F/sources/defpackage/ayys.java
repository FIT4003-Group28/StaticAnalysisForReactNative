package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayys  reason: default package */
/* loaded from: classes2.dex */
public final class ayys extends AtomicReference implements ayoa, aypg {
    static final ayyo[] a = new ayyo[0];
    static final ayyo[] b = new ayyo[0];
    private static final long serialVersionUID = 7224554242710036740L;
    boolean c;
    long g;
    long h;
    final ayyn i;
    final AtomicInteger f = new AtomicInteger();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public ayys(ayyn ayynVar) {
        this.i = ayynVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (!this.c) {
            this.c = true;
            ayyn ayynVar = this.i;
            Object b2 = azoq.b(th);
            long j = ayynVar.c + 1;
            ayynVar.c = j;
            ayynVar.a(new ayyp(b2, j));
            ayynVar.c();
            for (ayyo ayyoVar : (ayyo[]) this.d.getAndSet(b)) {
                this.i.b(ayyoVar);
            }
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!this.c) {
            ayyn ayynVar = this.i;
            azoq azoqVar = azoq.a;
            long j = ayynVar.c + 1;
            ayynVar.c = j;
            ayynVar.a(new ayyp(obj, j));
            ayynVar.d();
            for (ayyo ayyoVar : (ayyo[]) this.d.get()) {
                this.i.b(ayyoVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.f.getAndIncrement() == 0) {
            int i = 1;
            while (!e()) {
                ayyo[] ayyoVarArr = (ayyo[]) this.d.get();
                long j = this.g;
                long j2 = j;
                for (ayyo ayyoVar : ayyoVarArr) {
                    j2 = Math.max(j2, ayyoVar.d.get());
                }
                long j3 = this.h;
                bamf bamfVar = (bamf) get();
                long j4 = j2 - j;
                if (j4 != 0) {
                    this.g = j2;
                    if (bamfVar == null) {
                        long j5 = j3 + j4;
                        if (j5 < 0) {
                            j5 = Long.MAX_VALUE;
                        }
                        this.h = j5;
                    } else if (j3 != 0) {
                        this.h = 0L;
                        bamfVar.sp(j3 + j4);
                    } else {
                        bamfVar.sp(j4);
                    }
                } else if (j3 != 0 && bamfVar != null) {
                    this.h = 0L;
                    bamfVar.sp(j3);
                }
                i = this.f.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.get() == b;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this, bamfVar)) {
            d();
            for (ayyo ayyoVar : (ayyo[]) this.d.get()) {
                this.i.b(ayyoVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ayyo ayyoVar) {
        ayyo[] ayyoVarArr;
        ayyo[] ayyoVarArr2;
        do {
            ayyoVarArr = (ayyo[]) this.d.get();
            int length = ayyoVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayyoVarArr[i].equals(ayyoVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayyoVarArr2 = a;
            } else {
                ayyo[] ayyoVarArr3 = new ayyo[length - 1];
                System.arraycopy(ayyoVarArr, 0, ayyoVarArr3, 0, i);
                System.arraycopy(ayyoVarArr, i + 1, ayyoVarArr3, i, (length - i) - 1);
                ayyoVarArr2 = ayyoVarArr3;
            }
        } while (!this.d.compareAndSet(ayyoVarArr, ayyoVarArr2));
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d.set(b);
        azof.f(this);
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.c) {
            this.c = true;
            ayyn ayynVar = this.i;
            azoq azoqVar = azoq.a;
            long j = ayynVar.c + 1;
            ayynVar.c = j;
            ayynVar.a(new ayyp(azoqVar, j));
            ayynVar.c();
            for (ayyo ayyoVar : (ayyo[]) this.d.getAndSet(b)) {
                this.i.b(ayyoVar);
            }
        }
    }
}
