package defpackage;
/* compiled from: PG */
/* renamed from: azox  reason: default package */
/* loaded from: classes2.dex */
public final class azox implements ayom, aypg {
    final ayom a;
    aypg b;
    boolean c;
    azoh d;
    volatile boolean e;

    public azox(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                if (this.c) {
                    this.e = true;
                    azoh azohVar = this.d;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.d = azohVar;
                    }
                    azohVar.c(azoq.b(th));
                    return;
                }
                this.e = true;
                this.c = true;
                z = false;
            }
            if (z) {
                azqc.d(th);
            } else {
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.qr();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azoh azohVar = this.d;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.d = azohVar;
                }
                azoq azoqVar = azoq.a;
                azohVar.a(obj);
                return;
            }
            this.c = true;
            this.a.c(obj);
            while (true) {
                synchronized (this) {
                    azoh azohVar2 = this.d;
                    if (azohVar2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    ayom ayomVar = this.a;
                    for (Object[] objArr2 = azohVar2.a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (azoq.f(objArr, ayomVar)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azoh azohVar = this.d;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.d = azohVar;
                }
                azohVar.a(azoq.a);
                return;
            }
            this.e = true;
            this.c = true;
            this.a.sm();
        }
    }
}
