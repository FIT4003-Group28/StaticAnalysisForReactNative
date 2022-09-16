package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpw  reason: default package */
/* loaded from: classes2.dex */
public final class azpw extends ayos implements ayot {
    static final azpv[] a = new azpv[0];
    static final azpv[] b = new azpv[0];
    Object e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicReference c = new AtomicReference(a);

    public static azpw Y() {
        return new azpw();
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        azpv[] azpvVarArr;
        azpv[] azpvVarArr2;
        azpv azpvVar = new azpv(ayotVar, this);
        ayotVar.sj(azpvVar);
        do {
            azpvVarArr = (azpv[]) this.c.get();
            if (azpvVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    ayotVar.b(th);
                    return;
                } else {
                    ayotVar.sh(this.e);
                    return;
                }
            }
            int length = azpvVarArr.length;
            azpvVarArr2 = new azpv[length + 1];
            System.arraycopy(azpvVarArr, 0, azpvVarArr2, 0, length);
            azpvVarArr2[length] = azpvVar;
        } while (!this.c.compareAndSet(azpvVarArr, azpvVarArr2));
        if (azpvVar.e()) {
            aa(azpvVar);
        }
    }

    public final Object Z() {
        if (this.c.get() == b) {
            return this.e;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aa(azpv azpvVar) {
        azpv[] azpvVarArr;
        azpv[] azpvVarArr2;
        do {
            azpvVarArr = (azpv[]) this.c.get();
            int length = azpvVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azpvVarArr[i] == azpvVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azpvVarArr2 = a;
            } else {
                azpv[] azpvVarArr3 = new azpv[length - 1];
                System.arraycopy(azpvVarArr, 0, azpvVarArr3, 0, i);
                System.arraycopy(azpvVarArr, i + 1, azpvVarArr3, i, (length - i) - 1);
                azpvVarArr2 = azpvVarArr3;
            }
        } while (!this.c.compareAndSet(azpvVarArr, azpvVarArr2));
    }

    public final boolean ab() {
        return this.c.get() == b && this.f != null;
    }

    public final boolean ac() {
        return this.c.get() == b && this.e != null;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.f = th;
            for (azpv azpvVar : (azpv[]) this.c.getAndSet(b)) {
                azpvVar.a.b(th);
            }
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        ayrd.b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = obj;
            for (azpv azpvVar : (azpv[]) this.c.getAndSet(b)) {
                azpvVar.a.sh(obj);
            }
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (this.c.get() == b) {
            aypgVar.qr();
        }
    }
}
