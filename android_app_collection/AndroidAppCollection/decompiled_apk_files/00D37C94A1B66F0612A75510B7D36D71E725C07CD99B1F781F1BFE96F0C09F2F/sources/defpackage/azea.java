package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azea  reason: default package */
/* loaded from: classes2.dex */
final class azea extends AtomicInteger implements aypg {
    private static final long serialVersionUID = 8567835998786448817L;
    final ayom a;
    final ayqe b;
    final azdz[] c;
    Object[] d;
    final azml e;
    volatile boolean f;
    volatile boolean g;
    final azoj h = new azoj();
    int i;
    int j;

    public azea(ayom ayomVar, ayqe ayqeVar, int i, int i2) {
        this.a = ayomVar;
        this.b = ayqeVar;
        this.d = new Object[i];
        azdz[] azdzVarArr = new azdz[i];
        for (int i3 = 0; i3 < i; i3++) {
            azdzVarArr[i3] = new azdz(this, i3);
        }
        this.c = azdzVarArr;
        this.e = new azml(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        for (azdz azdzVar : this.c) {
            ayqi.c(azdzVar);
        }
    }

    final void c(azml azmlVar) {
        synchronized (this) {
            this.d = null;
        }
        azmlVar.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        azml azmlVar = this.e;
        ayom ayomVar = this.a;
        int i = 1;
        while (!this.f) {
            if (this.h.get() == null) {
                boolean z = this.g;
                Object[] objArr = (Object[]) azmlVar.sl();
                try {
                    if (z) {
                        if (objArr == null) {
                            c(azmlVar);
                            Throwable d = azom.d(this.h);
                            if (d == null) {
                                ayomVar.sm();
                                return;
                            } else {
                                ayomVar.b(d);
                                return;
                            }
                        }
                    } else if (objArr == null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    Object a = this.b.a(objArr);
                    ayrd.b(a, "The combiner returned a null value");
                    ayomVar.c(a);
                } catch (Throwable th) {
                    bapv.j(th);
                    azom.e(this.h, th);
                    a();
                    c(azmlVar);
                    ayomVar.b(azom.d(this.h));
                    return;
                }
            } else {
                a();
                c(azmlVar);
                ayomVar.b(azom.d(this.h));
                return;
            }
        }
        c(azmlVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, Object obj) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.d;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = this.i;
            if (obj2 == null) {
                i2++;
                this.i = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                this.e.k((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            d();
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.f) {
            this.f = true;
            a();
            if (getAndIncrement() != 0) {
                return;
            }
            c(this.e);
        }
    }
}
