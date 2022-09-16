package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpu  reason: default package */
/* loaded from: classes2.dex */
public final class azpu extends azpx implements azog {
    final azpx a;
    boolean b;
    azoh c;
    volatile boolean d;

    public azpu(azpx azpxVar) {
        this.a = azpxVar;
    }

    @Override // defpackage.azog, defpackage.ayqf
    public final boolean a(Object obj) {
        return azoq.f(obj, this.a);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.d) {
            azqc.d(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.d) {
                this.d = true;
                if (this.b) {
                    azoh azohVar = this.c;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.c = azohVar;
                    }
                    azohVar.c(azoq.b(th));
                    return;
                }
                this.b = true;
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
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            if (this.b) {
                azoh azohVar = this.c;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.c = azohVar;
                }
                azoq azoqVar = azoq.a;
                azohVar.a(obj);
                return;
            }
            this.b = true;
            this.a.c(obj);
            e();
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.a.az(ayomVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.b) {
                azoh azohVar = this.c;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.c = azohVar;
                }
                azohVar.a(azoq.a);
                return;
            }
            this.b = true;
            this.a.sm();
        }
    }

    final void e() {
        azoh azohVar;
        while (true) {
            synchronized (this) {
                azohVar = this.c;
                if (azohVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            azohVar.b(this);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        azoh azohVar = this.c;
                        if (azohVar == null) {
                            azohVar = new azoh();
                            this.c = azohVar;
                        }
                        azohVar.a(azoq.a(aypgVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            aypgVar.qr();
            return;
        }
        this.a.sj(aypgVar);
        e();
    }
}
