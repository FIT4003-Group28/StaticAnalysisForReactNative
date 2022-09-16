package defpackage;
/* compiled from: PG */
/* renamed from: azpe  reason: default package */
/* loaded from: classes2.dex */
final class azpe extends azpb {
    final azpb b;
    boolean c;
    azoh d;
    volatile boolean e;

    public azpe(azpb azpbVar) {
        this.b = azpbVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.b.ad(bameVar);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                this.e = true;
                if (this.c) {
                    azoh azohVar = this.d;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.d = azohVar;
                    }
                    azohVar.c(azoq.b(th));
                    return;
                }
                this.c = true;
                z = false;
            }
            if (z) {
                azqc.d(th);
            } else {
                this.b.b(th);
            }
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
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
                azoq azoqVar = azoq.a;
                azohVar.a(obj);
                return;
            }
            this.c = true;
            this.b.c(obj);
            ar();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.c) {
                azoh azohVar = this.d;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.d = azohVar;
                }
                azohVar.a(azoq.a);
                return;
            }
            this.c = true;
            this.b.sm();
        }
    }

    final void ar() {
        azoh azohVar;
        while (true) {
            synchronized (this) {
                azohVar = this.d;
                if (azohVar == null) {
                    this.c = false;
                    return;
                }
                this.d = null;
            }
            azohVar.d(this.b);
        }
    }

    @Override // defpackage.bame
    public final void f(bamf bamfVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        azoh azohVar = this.d;
                        if (azohVar == null) {
                            azohVar = new azoh();
                            this.d = azohVar;
                        }
                        azohVar.a(azoq.c(bamfVar));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if (z) {
            bamfVar.si();
            return;
        }
        this.b.f(bamfVar);
        ar();
    }
}
