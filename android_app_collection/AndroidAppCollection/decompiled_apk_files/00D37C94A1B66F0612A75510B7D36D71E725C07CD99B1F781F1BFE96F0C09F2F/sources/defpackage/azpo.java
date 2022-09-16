package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpo  reason: default package */
/* loaded from: classes2.dex */
public final class azpo extends aynr implements ayns {
    static final azpn[] a = new azpn[0];
    public static final azpn[] b = new azpn[0];
    public Throwable e;
    final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(a);

    public static azpo W() {
        return new azpo();
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        azpn[] azpnVarArr;
        azpn[] azpnVarArr2;
        azpn azpnVar = new azpn(aynsVar, this);
        aynsVar.sj(azpnVar);
        do {
            azpnVarArr = (azpn[]) this.c.get();
            if (azpnVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    aynsVar.b(th);
                    return;
                } else {
                    aynsVar.sm();
                    return;
                }
            }
            int length = azpnVarArr.length;
            azpnVarArr2 = new azpn[length + 1];
            System.arraycopy(azpnVarArr, 0, azpnVarArr2, 0, length);
            azpnVarArr2[length] = azpnVar;
        } while (!this.c.compareAndSet(azpnVarArr, azpnVarArr2));
        if (azpnVar.e()) {
            X(azpnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(azpn azpnVar) {
        azpn[] azpnVarArr;
        azpn[] azpnVarArr2;
        do {
            azpnVarArr = (azpn[]) this.c.get();
            int length = azpnVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azpnVarArr[i] == azpnVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azpnVarArr2 = a;
            } else {
                azpn[] azpnVarArr3 = new azpn[length - 1];
                System.arraycopy(azpnVarArr, 0, azpnVarArr3, 0, i);
                System.arraycopy(azpnVarArr, i + 1, azpnVarArr3, i, (length - i) - 1);
                azpnVarArr2 = azpnVarArr3;
            }
        } while (!this.c.compareAndSet(azpnVarArr, azpnVarArr2));
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = th;
            for (azpn azpnVar : (azpn[]) this.c.getAndSet(b)) {
                azpnVar.a.b(th);
            }
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (this.c.get() == b) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        if (this.d.compareAndSet(false, true)) {
            for (azpn azpnVar : (azpn[]) this.c.getAndSet(b)) {
                azpnVar.a.sm();
            }
        }
    }
}
