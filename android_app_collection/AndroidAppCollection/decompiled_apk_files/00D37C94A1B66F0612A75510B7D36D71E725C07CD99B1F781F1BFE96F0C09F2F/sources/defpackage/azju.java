package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azju  reason: default package */
/* loaded from: classes2.dex */
public final class azju extends AtomicInteger implements aypg {
    private static final long serialVersionUID = 2983708048395377667L;
    final ayom a;
    final ayqe b;
    final azjv[] c = new azjv[2];
    final Object[] d = new Object[2];
    volatile boolean e;

    public azju(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.b = ayqeVar;
    }

    final void a() {
        d();
        c();
    }

    final void c() {
        azjv[] azjvVarArr = this.c;
        int length = azjvVarArr.length;
        for (int i = 0; i < 2; i++) {
            ayqi.c(azjvVarArr[i].e);
        }
    }

    final void d() {
        azjv[] azjvVarArr = this.c;
        int length = azjvVarArr.length;
        for (int i = 0; i < 2; i++) {
            azjvVarArr[i].b.d();
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e;
    }

    public final void f() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        azjv[] azjvVarArr = this.c;
        ayom ayomVar = this.a;
        Object[] objArr = this.d;
        int i = 1;
        while (true) {
            int length = azjvVarArr.length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                azjv azjvVar = azjvVarArr[i4];
                if (objArr[i3] == null) {
                    boolean z = azjvVar.c;
                    Object sl = azjvVar.b.sl();
                    if (this.e) {
                        a();
                        return;
                    }
                    if (z) {
                        Throwable th2 = azjvVar.d;
                        if (th2 != null) {
                            this.e = true;
                            a();
                            ayomVar.b(th2);
                            return;
                        } else if (sl == null) {
                            this.e = true;
                            a();
                            ayomVar.sm();
                            return;
                        }
                    }
                    if (sl != null) {
                        objArr[i3] = sl;
                    } else {
                        i2++;
                    }
                } else if (azjvVar.c && (th = azjvVar.d) != null) {
                    this.e = true;
                    a();
                    ayomVar.b(th);
                    return;
                }
                i3++;
            }
            if (i2 != 0) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    Object a = this.b.a(objArr.clone());
                    ayrd.b(a, "The zipper returned a null value");
                    ayomVar.c(a);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    bapv.j(th3);
                    a();
                    ayomVar.b(th3);
                    return;
                }
            }
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.e) {
            this.e = true;
            c();
            if (getAndIncrement() != 0) {
                return;
            }
            d();
        }
    }
}
