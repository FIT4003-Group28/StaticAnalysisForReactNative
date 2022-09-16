package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: dzcq  reason: default package */
/* loaded from: classes6.dex */
public final class dzcq<T> extends dyzs<T> {
    final Future<? extends T> b;

    public dzcq(Future<? extends T> future) {
        this.b = future;
    }

    @Override // defpackage.dyzs
    public final void b(eavl<? super T> eavlVar) {
        dzfi dzfiVar = new dzfi(eavlVar);
        eavlVar.b(dzfiVar);
        try {
            T t = this.b.get();
            if (t == null) {
                eavlVar.d(new NullPointerException("The future returned null"));
                return;
            }
            int i = dzfiVar.get();
            while (i != 8) {
                if ((i & (-3)) != 0) {
                    return;
                }
                if (i != 2) {
                    dzfiVar.b = t;
                    if (dzfiVar.compareAndSet(0, 1)) {
                        return;
                    }
                    i = dzfiVar.get();
                    if (i == 4) {
                        dzfiVar.b = null;
                        return;
                    }
                } else {
                    dzfiVar.lazySet(3);
                    eavl<? super T> eavlVar2 = dzfiVar.a;
                    eavlVar2.c(t);
                    if (dzfiVar.get() == 4) {
                        return;
                    }
                    eavlVar2.e();
                    return;
                }
            }
            dzfiVar.b = t;
            dzfiVar.lazySet(16);
            eavl<? super T> eavlVar3 = dzfiVar.a;
            eavlVar3.c(t);
            if (dzfiVar.get() == 4) {
                return;
            }
            eavlVar3.e();
        } catch (Throwable th) {
            dzas.a(th);
            if (dzfiVar.get() == 4) {
                return;
            }
            eavlVar.d(th);
        }
    }
}
