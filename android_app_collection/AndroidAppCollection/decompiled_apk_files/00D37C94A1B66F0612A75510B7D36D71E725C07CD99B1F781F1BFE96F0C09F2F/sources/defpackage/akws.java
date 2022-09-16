package defpackage;
/* compiled from: PG */
/* renamed from: akws  reason: default package */
/* loaded from: classes.dex */
public final class akws {
    public akyu a;
    public akye b;
    private volatile boolean c = false;

    public final void a() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    akyu akyuVar = this.a;
                    if (!akyuVar.k) {
                        synchronized (akyuVar.h) {
                            if (!akyuVar.k) {
                                akyuVar.k = true;
                                avve avveVar = akyuVar.l.b().s;
                                if (avveVar == null) {
                                    avveVar = avve.a;
                                }
                                if (avveVar.f) {
                                    akyuVar.b.g(akyuVar);
                                    akyuVar.e.p(akyuVar);
                                    akyuVar.f.a(akyuVar);
                                    akyuVar.i = akyuVar.c.c().d();
                                }
                            }
                        }
                    }
                    this.b.a();
                    this.c = true;
                }
            }
        }
    }
}
