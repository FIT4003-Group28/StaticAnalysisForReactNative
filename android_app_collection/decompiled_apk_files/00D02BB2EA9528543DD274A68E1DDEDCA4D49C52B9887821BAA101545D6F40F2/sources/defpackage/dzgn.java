package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzgn  reason: default package */
/* loaded from: classes6.dex */
public final class dzgn<T> extends dzgr<T> {
    static final dzgm[] a = new dzgm[0];
    static final dzgm[] b = new dzgm[0];
    final AtomicReference<dzgm<T>[]> c = new AtomicReference<>(b);
    Throwable d;

    public static <T> dzgn<T> a() {
        return new dzgn<>();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (this.c.get() == a) {
            dzakVar.SQ();
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        dzgm<T>[] dzgmVarArr;
        dzbm.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (dzgm<T> dzgmVar : this.c.get()) {
            if (!dzgmVar.get()) {
                dzgmVar.a.c(t);
            }
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        dzgm<T>[] andSet;
        dzbm.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        dzgm<T>[] dzgmVarArr = this.c.get();
        dzgm<T>[] dzgmVarArr2 = a;
        if (dzgmVarArr == dzgmVarArr2) {
            dzfy.a(th);
            return;
        }
        this.d = th;
        for (dzgm<T> dzgmVar : this.c.getAndSet(dzgmVarArr2)) {
            if (dzgmVar.get()) {
                dzfy.a(th);
            } else {
                dzgmVar.a.d(th);
            }
        }
    }

    @Override // defpackage.dyzw
    public final void e() {
        dzgm<T>[] andSet;
        dzgm<T>[] dzgmVarArr = this.c.get();
        dzgm<T>[] dzgmVarArr2 = a;
        if (dzgmVarArr == dzgmVarArr2) {
            return;
        }
        for (dzgm<T> dzgmVar : this.c.getAndSet(dzgmVarArr2)) {
            if (!dzgmVar.get()) {
                dzgmVar.a.e();
            }
        }
    }

    @Override // defpackage.dyzu
    public final void g(dyzw<? super T> dyzwVar) {
        dzgm<T>[] dzgmVarArr;
        dzgm<T>[] dzgmVarArr2;
        dzgm<T> dzgmVar = new dzgm<>(dyzwVar, this);
        dyzwVar.b(dzgmVar);
        do {
            dzgmVarArr = this.c.get();
            if (dzgmVarArr == a) {
                Throwable th = this.d;
                if (th != null) {
                    dyzwVar.d(th);
                    return;
                } else {
                    dyzwVar.e();
                    return;
                }
            }
            int length = dzgmVarArr.length;
            dzgmVarArr2 = new dzgm[length + 1];
            System.arraycopy(dzgmVarArr, 0, dzgmVarArr2, 0, length);
            dzgmVarArr2[length] = dzgmVar;
        } while (!this.c.compareAndSet(dzgmVarArr, dzgmVarArr2));
        if (dzgmVar.get()) {
            h(dzgmVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(dzgm<T> dzgmVar) {
        dzgm<T>[] dzgmVarArr;
        dzgm[] dzgmVarArr2;
        do {
            dzgmVarArr = this.c.get();
            if (dzgmVarArr == a || dzgmVarArr == b) {
                return;
            }
            int length = dzgmVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dzgmVarArr[i] == dzgmVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dzgmVarArr2 = b;
            } else {
                dzgm[] dzgmVarArr3 = new dzgm[length - 1];
                System.arraycopy(dzgmVarArr, 0, dzgmVarArr3, 0, i);
                System.arraycopy(dzgmVarArr, i + 1, dzgmVarArr3, i, (length - i) - 1);
                dzgmVarArr2 = dzgmVarArr3;
            }
        } while (!this.c.compareAndSet(dzgmVarArr, dzgmVarArr2));
    }
}
