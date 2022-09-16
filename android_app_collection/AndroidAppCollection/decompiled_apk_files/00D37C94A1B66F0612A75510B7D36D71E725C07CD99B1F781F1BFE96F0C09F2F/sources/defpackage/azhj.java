package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhj  reason: default package */
/* loaded from: classes2.dex */
final class azhj extends AtomicReference implements ayom, aypg {
    static final azhi[] a = new azhi[0];
    static final azhi[] b = new azhi[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference d;
    Throwable f;
    final AtomicBoolean c = new AtomicBoolean();
    final AtomicReference e = new AtomicReference();

    public azhj(AtomicReference atomicReference) {
        this.d = atomicReference;
        lazySet(a);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.f = th;
        this.e.lazySet(ayqi.a);
        for (azhi azhiVar : (azhi[]) getAndSet(b)) {
            azhiVar.a.b(th);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        for (azhi azhiVar : (azhi[]) get()) {
            azhiVar.a.c(obj);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == b;
    }

    public final void f(azhi azhiVar) {
        azhi[] azhiVarArr;
        azhi[] azhiVarArr2;
        do {
            azhiVarArr = (azhi[]) get();
            int length = azhiVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azhiVarArr[i] == azhiVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            azhiVarArr2 = a;
            if (length != 1) {
                azhiVarArr2 = new azhi[length - 1];
                System.arraycopy(azhiVarArr, 0, azhiVarArr2, 0, i);
                System.arraycopy(azhiVarArr, i + 1, azhiVarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(azhiVarArr, azhiVarArr2));
    }

    @Override // defpackage.aypg
    public final void qr() {
        getAndSet(b);
        this.d.compareAndSet(this, null);
        ayqi.c(this.e);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.e, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.e.lazySet(ayqi.a);
        for (azhi azhiVar : (azhi[]) getAndSet(b)) {
            azhiVar.a.sm();
        }
    }
}
