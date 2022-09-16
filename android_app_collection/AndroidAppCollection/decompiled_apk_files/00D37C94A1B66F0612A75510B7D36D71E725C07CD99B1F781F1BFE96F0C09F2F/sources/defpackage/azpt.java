package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpt  reason: default package */
/* loaded from: classes2.dex */
public final class azpt extends azpx {
    static final azpr[] a = new azpr[0];
    static final azpr[] b = new azpr[0];
    final AtomicReference c = new AtomicReference(a);
    boolean d;
    final azps e;

    public azpt(azps azpsVar) {
        this.e = azpsVar;
    }

    public static azpt e() {
        return new azpt(new azps());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI(azpr azprVar) {
        azpr[] azprVarArr;
        azpr[] azprVarArr2;
        do {
            azprVarArr = (azpr[]) this.c.get();
            if (azprVarArr == b || azprVarArr == a) {
                return;
            }
            int length = azprVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azprVarArr[i] == azprVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azprVarArr2 = a;
            } else {
                azpr[] azprVarArr3 = new azpr[length - 1];
                System.arraycopy(azprVarArr, 0, azprVarArr3, 0, i);
                System.arraycopy(azprVarArr, i + 1, azprVarArr3, i, (length - i) - 1);
                azprVarArr2 = azprVarArr3;
            }
        } while (!this.c.compareAndSet(azprVarArr, azprVarArr2));
    }

    final azpr[] aJ(Object obj) {
        return this.e.compareAndSet(null, obj) ? (azpr[]) this.c.getAndSet(b) : b;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d) {
            azqc.d(th);
            return;
        }
        this.d = true;
        Object b2 = azoq.b(th);
        azps azpsVar = this.e;
        azpsVar.a(b2);
        for (azpr azprVar : aJ(b2)) {
            azpsVar.b(azprVar);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d) {
            return;
        }
        azps azpsVar = this.e;
        azpsVar.a.add(obj);
        azpsVar.c++;
        for (azpr azprVar : (azpr[]) this.c.get()) {
            azpsVar.b(azprVar);
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azpr azprVar = new azpr(ayomVar, this);
        ayomVar.sj(azprVar);
        if (!azprVar.d) {
            while (true) {
                azpr[] azprVarArr = (azpr[]) this.c.get();
                if (azprVarArr == b) {
                    break;
                }
                int length = azprVarArr.length;
                azpr[] azprVarArr2 = new azpr[length + 1];
                System.arraycopy(azprVarArr, 0, azprVarArr2, 0, length);
                azprVarArr2[length] = azprVar;
                if (this.c.compareAndSet(azprVarArr, azprVarArr2)) {
                    if (azprVar.d) {
                        aI(azprVar);
                        return;
                    }
                }
            }
            this.e.b(azprVar);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.d) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d) {
            return;
        }
        this.d = true;
        azoq azoqVar = azoq.a;
        azps azpsVar = this.e;
        azpsVar.a(azoqVar);
        for (azpr azprVar : aJ(azoqVar)) {
            azpsVar.b(azprVar);
        }
    }
}
