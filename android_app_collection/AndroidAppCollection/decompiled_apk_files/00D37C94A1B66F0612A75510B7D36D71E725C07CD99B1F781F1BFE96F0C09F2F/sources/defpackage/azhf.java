package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhf  reason: default package */
/* loaded from: classes2.dex */
final class azhf implements ayom, aypg {
    static final azhe[] a = new azhe[0];
    static final azhe[] b = new azhe[0];
    final AtomicReference c;
    final AtomicReference f = new AtomicReference();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public azhf(AtomicReference atomicReference) {
        this.c = atomicReference;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.c.compareAndSet(this, null);
        azhe[] azheVarArr = (azhe[]) this.d.getAndSet(b);
        if (azheVarArr.length == 0) {
            azqc.d(th);
            return;
        }
        for (azhe azheVar : azheVarArr) {
            azheVar.a.b(th);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        for (azhe azheVar : (azhe[]) this.d.get()) {
            azheVar.a.c(obj);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.get() == b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(azhe azheVar) {
        azhe[] azheVarArr;
        azhe[] azheVarArr2;
        do {
            azheVarArr = (azhe[]) this.d.get();
            int length = azheVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azheVarArr[i].equals(azheVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azheVarArr2 = a;
            } else {
                azhe[] azheVarArr3 = new azhe[length - 1];
                System.arraycopy(azheVarArr, 0, azheVarArr3, 0, i);
                System.arraycopy(azheVarArr, i + 1, azheVarArr3, i, (length - i) - 1);
                azheVarArr2 = azheVarArr3;
            }
        } while (!this.d.compareAndSet(azheVarArr, azheVarArr2));
    }

    @Override // defpackage.aypg
    public final void qr() {
        AtomicReference atomicReference = this.d;
        azhe[] azheVarArr = b;
        if (((azhe[]) atomicReference.getAndSet(azheVarArr)) != azheVarArr) {
            this.c.compareAndSet(this, null);
            ayqi.c(this.f);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.f, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.c.compareAndSet(this, null);
        for (azhe azheVar : (azhe[]) this.d.getAndSet(b)) {
            azheVar.a.sm();
        }
    }
}
