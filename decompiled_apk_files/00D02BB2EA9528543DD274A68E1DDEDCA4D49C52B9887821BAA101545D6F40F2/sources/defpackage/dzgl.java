package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzgl  reason: default package */
/* loaded from: classes6.dex */
public final class dzgl extends dyzp implements dyzq {
    static final dzgk[] b = new dzgk[0];
    public static final dzgk[] c = new dzgk[0];
    public Throwable e;
    final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference<dzgk[]> a = new AtomicReference<>(b);

    public static dzgl h() {
        return new dzgl();
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        if (this.a.get() == c) {
            dzakVar.SQ();
        }
    }

    @Override // defpackage.dyzq
    public final void b() {
        if (this.d.compareAndSet(false, true)) {
            for (dzgk dzgkVar : this.a.getAndSet(c)) {
                dzgkVar.a.b();
            }
        }
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        dzbm.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = th;
            for (dzgk dzgkVar : this.a.getAndSet(c)) {
                dzgkVar.a.c(th);
            }
            return;
        }
        dzfy.a(th);
    }

    @Override // defpackage.dyzp
    protected final void g(dyzq dyzqVar) {
        dzgk[] dzgkVarArr;
        dzgk[] dzgkVarArr2;
        dzgk dzgkVar = new dzgk(dyzqVar, this);
        dyzqVar.a(dzgkVar);
        do {
            dzgkVarArr = this.a.get();
            if (dzgkVarArr == c) {
                Throwable th = this.e;
                if (th != null) {
                    dyzqVar.c(th);
                    return;
                } else {
                    dyzqVar.b();
                    return;
                }
            }
            int length = dzgkVarArr.length;
            dzgkVarArr2 = new dzgk[length + 1];
            System.arraycopy(dzgkVarArr, 0, dzgkVarArr2, 0, length);
            dzgkVarArr2[length] = dzgkVar;
        } while (!this.a.compareAndSet(dzgkVarArr, dzgkVarArr2));
        if (dzgkVar.get() == null) {
            i(dzgkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dzgk dzgkVar) {
        dzgk[] dzgkVarArr;
        dzgk[] dzgkVarArr2;
        do {
            dzgkVarArr = this.a.get();
            int length = dzgkVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dzgkVarArr[i] == dzgkVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dzgkVarArr2 = b;
            } else {
                dzgk[] dzgkVarArr3 = new dzgk[length - 1];
                System.arraycopy(dzgkVarArr, 0, dzgkVarArr3, 0, i);
                System.arraycopy(dzgkVarArr, i + 1, dzgkVarArr3, i, (length - i) - 1);
                dzgkVarArr2 = dzgkVarArr3;
            }
        } while (!this.a.compareAndSet(dzgkVarArr, dzgkVarArr2));
    }
}
