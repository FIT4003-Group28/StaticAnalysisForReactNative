package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysi  reason: default package */
/* loaded from: classes2.dex */
public final class aysi extends aynr implements ayns {
    static final aysh[] a = new aysh[0];
    static final aysh[] b = new aysh[0];
    final aynu c;
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();
    Throwable f;

    public aysi(aynu aynuVar) {
        this.c = aynuVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aysh[] ayshVarArr;
        aysh[] ayshVarArr2;
        aysh ayshVar = new aysh(this, aynsVar);
        aynsVar.sj(ayshVar);
        do {
            ayshVarArr = (aysh[]) this.d.get();
            if (ayshVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    aynsVar.b(th);
                    return;
                } else {
                    aynsVar.sm();
                    return;
                }
            }
            int length = ayshVarArr.length;
            ayshVarArr2 = new aysh[length + 1];
            System.arraycopy(ayshVarArr, 0, ayshVarArr2, 0, length);
            ayshVarArr2[length] = ayshVar;
        } while (!this.d.compareAndSet(ayshVarArr, ayshVarArr2));
        if (ayshVar.get()) {
            W(ayshVar);
        }
        if (this.e.compareAndSet(false, true)) {
            this.c.U(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(aysh ayshVar) {
        aysh[] ayshVarArr;
        aysh[] ayshVarArr2;
        do {
            ayshVarArr = (aysh[]) this.d.get();
            int length = ayshVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayshVarArr[i] == ayshVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayshVarArr2 = a;
            } else {
                aysh[] ayshVarArr3 = new aysh[length - 1];
                System.arraycopy(ayshVarArr, 0, ayshVarArr3, 0, i);
                System.arraycopy(ayshVarArr, i + 1, ayshVarArr3, i, (length - i) - 1);
                ayshVarArr2 = ayshVarArr3;
            }
        } while (!this.d.compareAndSet(ayshVarArr, ayshVarArr2));
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aysh[] ayshVarArr;
        this.f = th;
        for (aysh ayshVar : (aysh[]) this.d.getAndSet(b)) {
            if (!ayshVar.get()) {
                ayshVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        aysh[] ayshVarArr;
        for (aysh ayshVar : (aysh[]) this.d.getAndSet(b)) {
            if (!ayshVar.get()) {
                ayshVar.a.sm();
            }
        }
    }
}
