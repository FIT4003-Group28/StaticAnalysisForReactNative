package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azak  reason: default package */
/* loaded from: classes2.dex */
public final class azak extends ayoc implements ayod {
    static final azaj[] a = new azaj[0];
    static final azaj[] b = new azaj[0];
    final AtomicReference c;
    final AtomicReference d = new AtomicReference(a);
    Object e;
    Throwable f;

    public azak(ayof ayofVar) {
        this.c = new AtomicReference(ayofVar);
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        azaj[] azajVarArr;
        azaj[] azajVarArr2;
        azaj azajVar = new azaj(ayodVar, this);
        ayodVar.sj(azajVar);
        do {
            azajVarArr = (azaj[]) this.d.get();
            if (azajVarArr != b) {
                int length = azajVarArr.length;
                azajVarArr2 = new azaj[length + 1];
                System.arraycopy(azajVarArr, 0, azajVarArr2, 0, length);
                azajVarArr2[length] = azajVar;
            } else if (azajVar.e()) {
                return;
            } else {
                Throwable th = this.f;
                if (th != null) {
                    ayodVar.b(th);
                    return;
                }
                Object obj = this.e;
                if (obj != null) {
                    ayodVar.sh(obj);
                    return;
                } else {
                    ayodVar.sm();
                    return;
                }
            }
        } while (!this.d.compareAndSet(azajVarArr, azajVarArr2));
        if (azajVar.e()) {
            Z(azajVar);
            return;
        }
        ayof ayofVar = (ayof) this.c.getAndSet(null);
        if (ayofVar == null) {
            return;
        }
        ayofVar.X(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(azaj azajVar) {
        azaj[] azajVarArr;
        azaj[] azajVarArr2;
        do {
            azajVarArr = (azaj[]) this.d.get();
            int length = azajVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azajVarArr[i] == azajVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azajVarArr2 = a;
            } else {
                azaj[] azajVarArr3 = new azaj[length - 1];
                System.arraycopy(azajVarArr, 0, azajVarArr3, 0, i);
                System.arraycopy(azajVarArr, i + 1, azajVarArr3, i, (length - i) - 1);
                azajVarArr2 = azajVarArr3;
            }
        } while (!this.d.compareAndSet(azajVarArr, azajVarArr2));
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        azaj[] azajVarArr;
        this.f = th;
        for (azaj azajVar : (azaj[]) this.d.getAndSet(b)) {
            if (!azajVar.e()) {
                azajVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        azaj[] azajVarArr;
        this.e = obj;
        for (azaj azajVar : (azaj[]) this.d.getAndSet(b)) {
            if (!azajVar.e()) {
                azajVar.a.sh(obj);
            }
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
    }

    @Override // defpackage.ayod
    public final void sm() {
        azaj[] azajVarArr;
        for (azaj azajVar : (azaj[]) this.d.getAndSet(b)) {
            if (!azajVar.e()) {
                azajVar.a.sm();
            }
        }
    }
}
