package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzgq  reason: default package */
/* loaded from: classes6.dex */
public final class dzgq<T> extends dzaa<T> implements dzab<T> {
    static final dzgp[] b = new dzgp[0];
    static final dzgp[] c = new dzgp[0];
    T e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicReference<dzgp<T>[]> a = new AtomicReference<>(b);

    public static <T> dzgq<T> i() {
        return new dzgq<>();
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        if (this.a.get() == c) {
            dzakVar.SQ();
        }
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        dzbm.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.f = th;
            for (dzgp<T> dzgpVar : this.a.getAndSet(c)) {
                dzgpVar.a.b(th);
            }
            return;
        }
        dzfy.a(th);
    }

    @Override // defpackage.dzab
    public final void c(T t) {
        dzbm.a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = t;
            for (dzgp<T> dzgpVar : this.a.getAndSet(c)) {
                dzgpVar.a.c(t);
            }
        }
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        dzgp<T>[] dzgpVarArr;
        dzgp<T>[] dzgpVarArr2;
        dzgp<T> dzgpVar = new dzgp<>(dzabVar, this);
        dzabVar.a(dzgpVar);
        do {
            dzgpVarArr = this.a.get();
            if (dzgpVarArr == c) {
                Throwable th = this.f;
                if (th != null) {
                    dzabVar.b(th);
                    return;
                } else {
                    dzabVar.c((T) this.e);
                    return;
                }
            }
            int length = dzgpVarArr.length;
            dzgpVarArr2 = new dzgp[length + 1];
            System.arraycopy(dzgpVarArr, 0, dzgpVarArr2, 0, length);
            dzgpVarArr2[length] = dzgpVar;
        } while (!this.a.compareAndSet(dzgpVarArr, dzgpVarArr2));
        if (dzgpVar.get() == null) {
            j(dzgpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(dzgp<T> dzgpVar) {
        dzgp<T>[] dzgpVarArr;
        dzgp[] dzgpVarArr2;
        do {
            dzgpVarArr = this.a.get();
            int length = dzgpVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dzgpVarArr[i] == dzgpVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dzgpVarArr2 = b;
            } else {
                dzgp[] dzgpVarArr3 = new dzgp[length - 1];
                System.arraycopy(dzgpVarArr, 0, dzgpVarArr3, 0, i);
                System.arraycopy(dzgpVarArr, i + 1, dzgpVarArr3, i, (length - i) - 1);
                dzgpVarArr2 = dzgpVarArr3;
            }
        } while (!this.a.compareAndSet(dzgpVarArr, dzgpVarArr2));
    }
}
