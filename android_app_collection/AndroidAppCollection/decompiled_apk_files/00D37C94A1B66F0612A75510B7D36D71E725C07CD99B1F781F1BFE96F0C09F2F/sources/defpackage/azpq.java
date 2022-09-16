package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpq  reason: default package */
/* loaded from: classes2.dex */
public final class azpq extends azpx {
    static final azpp[] a = new azpp[0];
    static final azpp[] b = new azpp[0];
    final AtomicReference c = new AtomicReference(b);
    Throwable d;

    public static azpq e() {
        return new azpq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI(azpp azppVar) {
        azpp[] azppVarArr;
        azpp[] azppVarArr2;
        do {
            azppVarArr = (azpp[]) this.c.get();
            if (azppVarArr == a || azppVarArr == b) {
                return;
            }
            int length = azppVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azppVarArr[i] == azppVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azppVarArr2 = b;
            } else {
                azpp[] azppVarArr3 = new azpp[length - 1];
                System.arraycopy(azppVarArr, 0, azppVarArr3, 0, i);
                System.arraycopy(azppVarArr, i + 1, azppVarArr3, i, (length - i) - 1);
                azppVarArr2 = azppVarArr3;
            }
        } while (!this.c.compareAndSet(azppVarArr, azppVarArr2));
    }

    public final boolean aJ() {
        return ((azpp[]) this.c.get()).length != 0;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        azpp[] azppVarArr;
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            azqc.d(th);
            return;
        }
        this.d = th;
        for (azpp azppVar : (azpp[]) this.c.getAndSet(obj2)) {
            if (azppVar.get()) {
                azqc.d(th);
            } else {
                azppVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        azpp[] azppVarArr;
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (azpp azppVar : (azpp[]) this.c.get()) {
            if (!azppVar.get()) {
                azppVar.a.c(obj);
            }
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azpp[] azppVarArr;
        azpp[] azppVarArr2;
        azpp azppVar = new azpp(ayomVar, this);
        ayomVar.sj(azppVar);
        do {
            azppVarArr = (azpp[]) this.c.get();
            if (azppVarArr == a) {
                Throwable th = this.d;
                if (th != null) {
                    ayomVar.b(th);
                    return;
                } else {
                    ayomVar.sm();
                    return;
                }
            }
            int length = azppVarArr.length;
            azppVarArr2 = new azpp[length + 1];
            System.arraycopy(azppVarArr, 0, azppVarArr2, 0, length);
            azppVarArr2[length] = azppVar;
        } while (!this.c.compareAndSet(azppVarArr, azppVarArr2));
        if (azppVar.get()) {
            aI(azppVar);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.c.get() == a) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        azpp[] azppVarArr;
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            return;
        }
        for (azpp azppVar : (azpp[]) this.c.getAndSet(obj2)) {
            if (!azppVar.get()) {
                azppVar.a.sm();
            }
        }
    }
}
