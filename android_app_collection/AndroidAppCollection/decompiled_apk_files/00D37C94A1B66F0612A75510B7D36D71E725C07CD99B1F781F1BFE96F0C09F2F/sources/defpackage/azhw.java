package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azhw  reason: default package */
/* loaded from: classes2.dex */
public final class azhw extends AtomicReference implements ayom, aypg {
    static final azht[] a = new azht[0];
    static final azht[] b = new azht[0];
    private static final long serialVersionUID = -533785617179540163L;
    final azhv c;
    boolean d;
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public azhw(azhv azhvVar) {
        this.c = azhvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (!this.d) {
            this.d = true;
            this.c.c(th);
            h();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (!this.d) {
            this.c.d(obj);
            g();
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.get() == b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(azht azhtVar) {
        azht[] azhtVarArr;
        azht[] azhtVarArr2;
        do {
            azhtVarArr = (azht[]) this.e.get();
            int length = azhtVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azhtVarArr[i].equals(azhtVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azhtVarArr2 = a;
            } else {
                azht[] azhtVarArr3 = new azht[length - 1];
                System.arraycopy(azhtVarArr, 0, azhtVarArr3, 0, i);
                System.arraycopy(azhtVarArr, i + 1, azhtVarArr3, i, (length - i) - 1);
                azhtVarArr2 = azhtVarArr3;
            }
        } while (!this.e.compareAndSet(azhtVarArr, azhtVarArr2));
    }

    final void g() {
        for (azht azhtVar : (azht[]) this.e.get()) {
            this.c.e(azhtVar);
        }
    }

    final void h() {
        for (azht azhtVar : (azht[]) this.e.getAndSet(b)) {
            this.c.e(azhtVar);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.e.set(b);
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            g();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.d) {
            this.d = true;
            this.c.b();
            h();
        }
    }
}
