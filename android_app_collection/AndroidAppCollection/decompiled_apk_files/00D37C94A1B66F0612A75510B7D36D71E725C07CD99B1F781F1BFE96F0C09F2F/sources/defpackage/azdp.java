package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azdp  reason: default package */
/* loaded from: classes2.dex */
final class azdp implements aypg {
    final ayom a;
    final AtomicInteger c = new AtomicInteger();
    final azdq[] b = new azdq[2];

    public azdp(ayom ayomVar) {
        this.a = ayomVar;
    }

    public final boolean a(int i) {
        int i2 = this.c.get();
        int i3 = 0;
        if (i2 != 0) {
            return i2 == i;
        } else if (!this.c.compareAndSet(0, i)) {
            return false;
        } else {
            azdq[] azdqVarArr = this.b;
            while (i3 < 2) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    ayqi.c(azdqVarArr[i3]);
                }
                i3 = i4;
            }
            return true;
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.get() == -1;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.c.get() != -1) {
            this.c.lazySet(-1);
            azdq[] azdqVarArr = this.b;
            for (int i = 0; i < 2; i++) {
                ayqi.c(azdqVarArr[i]);
            }
        }
    }
}
