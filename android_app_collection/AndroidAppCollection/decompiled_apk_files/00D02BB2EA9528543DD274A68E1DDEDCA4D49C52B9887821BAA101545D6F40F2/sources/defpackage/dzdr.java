package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdr  reason: default package */
/* loaded from: classes6.dex */
public final class dzdr<T> extends dzaa<T> implements dzab<T> {
    static final dzdq[] a = new dzdq[0];
    static final dzdq[] b = new dzdq[0];
    final dzac<? extends T> c;
    final AtomicInteger d = new AtomicInteger();
    final AtomicReference<dzdq<T>[]> e = new AtomicReference<>(a);
    T f;
    Throwable g;

    public dzdr(dzac<? extends T> dzacVar) {
        this.c = dzacVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        dzdq<T>[] andSet;
        this.g = th;
        for (dzdq<T> dzdqVar : this.e.getAndSet(b)) {
            if (!dzdqVar.get()) {
                dzdqVar.a.b(th);
            }
        }
    }

    @Override // defpackage.dzab
    public final void c(T t) {
        dzdq<T>[] andSet;
        this.f = t;
        for (dzdq<T> dzdqVar : this.e.getAndSet(b)) {
            if (!dzdqVar.get()) {
                dzdqVar.a.c(t);
            }
        }
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        dzdq<T>[] dzdqVarArr;
        dzdq<T>[] dzdqVarArr2;
        dzdq<T> dzdqVar = new dzdq<>(dzabVar, this);
        dzabVar.a(dzdqVar);
        do {
            dzdqVarArr = this.e.get();
            if (dzdqVarArr == b) {
                Throwable th = this.g;
                if (th != null) {
                    dzabVar.b(th);
                    return;
                } else {
                    dzabVar.c((T) this.f);
                    return;
                }
            }
            int length = dzdqVarArr.length;
            dzdqVarArr2 = new dzdq[length + 1];
            System.arraycopy(dzdqVarArr, 0, dzdqVarArr2, 0, length);
            dzdqVarArr2[length] = dzdqVar;
        } while (!this.e.compareAndSet(dzdqVarArr, dzdqVarArr2));
        if (dzdqVar.get()) {
            i(dzdqVar);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(dzdq<T> dzdqVar) {
        dzdq<T>[] dzdqVarArr;
        dzdq[] dzdqVarArr2;
        do {
            dzdqVarArr = this.e.get();
            int length = dzdqVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dzdqVarArr[i] == dzdqVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dzdqVarArr2 = a;
            } else {
                dzdq[] dzdqVarArr3 = new dzdq[length - 1];
                System.arraycopy(dzdqVarArr, 0, dzdqVarArr3, 0, i);
                System.arraycopy(dzdqVarArr, i + 1, dzdqVarArr3, i, (length - i) - 1);
                dzdqVarArr2 = dzdqVarArr3;
            }
        } while (!this.e.compareAndSet(dzdqVarArr, dzdqVarArr2));
    }
}
