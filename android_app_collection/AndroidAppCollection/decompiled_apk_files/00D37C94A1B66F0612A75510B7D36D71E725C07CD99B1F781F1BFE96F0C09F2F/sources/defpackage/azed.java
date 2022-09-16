package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azed  reason: default package */
/* loaded from: classes2.dex */
public final class azed extends AtomicInteger implements ayom, aypg {
    private static final long serialVersionUID = -6951100001833242599L;
    final ayom a;
    final int b;
    final azec d;
    ayrn f;
    aypg g;
    volatile boolean h;
    volatile boolean i;
    volatile boolean j;
    int k;
    final boolean e = false;
    final azoj c = new azoj();

    public azed(ayom ayomVar, int i) {
        this.a = ayomVar;
        this.b = i;
        this.d = new azec(ayomVar, this);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.c, th)) {
            this.i = true;
            f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.k == 0) {
            this.f.k(obj);
        }
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        ayom ayomVar = this.a;
        ayrn ayrnVar = this.f;
        azoj azojVar = this.c;
        while (true) {
            if (!this.h) {
                if (!this.j) {
                    if (((Throwable) azojVar.get()) == null) {
                        boolean z = this.i;
                        try {
                            Object sl = ayrnVar.sl();
                            if (z) {
                                if (sl == null) {
                                    this.j = true;
                                    Throwable d = azom.d(azojVar);
                                    if (d != null) {
                                        ayomVar.b(d);
                                        return;
                                    } else {
                                        ayomVar.sm();
                                        return;
                                    }
                                }
                            } else if (sl == null) {
                            }
                            try {
                                ayok ayokVar = (ayok) sl;
                                if (ayokVar instanceof Callable) {
                                    try {
                                        Object call = ((Callable) ayokVar).call();
                                        if (call != null && !this.j) {
                                            ayomVar.c(call);
                                        }
                                    } catch (Throwable th) {
                                        bapv.j(th);
                                        azom.e(azojVar, th);
                                    }
                                } else {
                                    this.h = true;
                                    ayokVar.az(this.d);
                                }
                            } catch (Throwable th2) {
                                bapv.j(th2);
                                this.j = true;
                                this.g.qr();
                                ayrnVar.d();
                                azom.e(azojVar, th2);
                                ayomVar.b(azom.d(azojVar));
                                return;
                            }
                        } catch (Throwable th3) {
                            bapv.j(th3);
                            this.j = true;
                            this.g.qr();
                            azom.e(azojVar, th3);
                            ayomVar.b(azom.d(azojVar));
                            return;
                        }
                    } else {
                        ayrnVar.d();
                        this.j = true;
                        ayomVar.b(azom.d(azojVar));
                        return;
                    }
                } else {
                    ayrnVar.d();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.j = true;
        this.g.qr();
        ayqi.c(this.d);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.g, aypgVar)) {
            this.g = aypgVar;
            if (aypgVar instanceof ayri) {
                ayri ayriVar = (ayri) aypgVar;
                int sk = ayriVar.sk(3);
                if (sk == 1) {
                    this.k = 1;
                    this.f = ayriVar;
                    this.i = true;
                    this.a.sj(this);
                    f();
                    return;
                } else if (sk == 2) {
                    this.k = 2;
                    this.f = ayriVar;
                    this.a.sj(this);
                    return;
                }
            }
            this.f = new azml(this.b);
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.i = true;
        f();
    }
}
