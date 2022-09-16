package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azmf  reason: default package */
/* loaded from: classes2.dex */
public final class azmf extends AtomicInteger implements aypg {
    private static final long serialVersionUID = -5556924161382950569L;
    final ayot a;
    final ayqe b;
    final azmg[] c;
    final Object[] d;

    public azmf(ayot ayotVar, ayqe ayqeVar) {
        super(2);
        this.a = ayotVar;
        this.b = ayqeVar;
        azmg[] azmgVarArr = new azmg[2];
        for (int i = 0; i < 2; i++) {
            azmgVarArr[i] = new azmg(this, i);
        }
        this.c = azmgVarArr;
        this.d = new Object[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            azmg[] azmgVarArr = this.c;
            int length = azmgVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ayqi.c(azmgVarArr[i2]);
            }
            while (true) {
                i++;
                if (i < 2) {
                    ayqi.c(azmgVarArr[i]);
                } else {
                    this.a.b(th);
                    return;
                }
            }
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() <= 0;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (getAndSet(0) > 0) {
            azmg[] azmgVarArr = this.c;
            int length = azmgVarArr.length;
            for (int i = 0; i < 2; i++) {
                ayqi.c(azmgVarArr[i]);
            }
        }
    }
}
