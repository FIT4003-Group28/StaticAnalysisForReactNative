package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azkl  reason: default package */
/* loaded from: classes2.dex */
public final class azkl extends ayos implements ayot {
    static final azkk[] a = new azkk[0];
    static final azkk[] b = new azkk[0];
    final ayov c;
    final AtomicInteger d = new AtomicInteger();
    final AtomicReference e = new AtomicReference(a);
    Object f;
    Throwable g;

    public azkl(ayov ayovVar) {
        this.c = ayovVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        azkk[] azkkVarArr;
        azkk[] azkkVarArr2;
        azkk azkkVar = new azkk(ayotVar, this);
        ayotVar.sj(azkkVar);
        do {
            azkkVarArr = (azkk[]) this.e.get();
            if (azkkVarArr == b) {
                Throwable th = this.g;
                if (th != null) {
                    ayotVar.b(th);
                    return;
                } else {
                    ayotVar.sh(this.f);
                    return;
                }
            }
            int length = azkkVarArr.length;
            azkkVarArr2 = new azkk[length + 1];
            System.arraycopy(azkkVarArr, 0, azkkVarArr2, 0, length);
            azkkVarArr2[length] = azkkVar;
        } while (!this.e.compareAndSet(azkkVarArr, azkkVarArr2));
        if (azkkVar.get()) {
            Y(azkkVar);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.W(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(azkk azkkVar) {
        azkk[] azkkVarArr;
        azkk[] azkkVarArr2;
        do {
            azkkVarArr = (azkk[]) this.e.get();
            int length = azkkVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azkkVarArr[i] == azkkVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azkkVarArr2 = a;
            } else {
                azkk[] azkkVarArr3 = new azkk[length - 1];
                System.arraycopy(azkkVarArr, 0, azkkVarArr3, 0, i);
                System.arraycopy(azkkVarArr, i + 1, azkkVarArr3, i, (length - i) - 1);
                azkkVarArr2 = azkkVarArr3;
            }
        } while (!this.e.compareAndSet(azkkVarArr, azkkVarArr2));
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azkk[] azkkVarArr;
        this.g = th;
        for (azkk azkkVar : (azkk[]) this.e.getAndSet(b)) {
            if (!azkkVar.get()) {
                azkkVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        azkk[] azkkVarArr;
        this.f = obj;
        for (azkk azkkVar : (azkk[]) this.e.getAndSet(b)) {
            if (!azkkVar.get()) {
                azkkVar.a.sh(obj);
            }
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
    }
}
