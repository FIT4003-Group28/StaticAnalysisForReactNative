package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azcw  reason: default package */
/* loaded from: classes2.dex */
public final class azcw extends AtomicInteger implements aypg {
    private static final long serialVersionUID = -5556924161382950569L;
    final ayod a;
    final ayqe b;
    final azcx[] c;
    final Object[] d;

    public azcw(ayod ayodVar, ayqe ayqeVar) {
        super(2);
        this.a = ayodVar;
        this.b = ayqeVar;
        azcx[] azcxVarArr = new azcx[2];
        for (int i = 0; i < 2; i++) {
            azcxVarArr[i] = new azcx(this, i);
        }
        this.c = azcxVarArr;
        this.d = new Object[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        azcx[] azcxVarArr = this.c;
        int length = azcxVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            ayqi.c(azcxVarArr[i2]);
        }
        while (true) {
            i++;
            if (i < 2) {
                ayqi.c(azcxVarArr[i]);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            a(i);
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() <= 0;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (getAndSet(0) > 0) {
            azcx[] azcxVarArr = this.c;
            int length = azcxVarArr.length;
            for (int i = 0; i < 2; i++) {
                ayqi.c(azcxVarArr[i]);
            }
        }
    }
}
