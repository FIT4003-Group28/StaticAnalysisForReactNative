package defpackage;
/* compiled from: PG */
/* renamed from: crjf  reason: default package */
/* loaded from: classes5.dex */
public final class crjf<T> extends btrh<T> {
    public crjf(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final crjc crjcVar = (crjc) this.a;
        srf srfVar = (srf) obj;
        if (srfVar.a != crjcVar.a.e) {
            return;
        }
        final qbm qbmVar = srfVar.b;
        if (!qbmVar.b() || !qbmVar.c()) {
            crjd crjdVar = crjcVar.a;
            crjdVar.h.a(crjdVar.f);
            if (qbmVar.d()) {
                crjcVar.a.f();
            } else if (!qbmVar.o()) {
                crjcVar.a.f();
            } else {
                crjcVar.a.d(qbmVar, false);
            }
        } else if (!qbmVar.o()) {
        } else {
            crjcVar.a.d.a(new Runnable(crjcVar, qbmVar) { // from class: crjb
                private final crjc a;
                private final qbm b;

                {
                    this.a = crjcVar;
                    this.b = qbmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    crjc crjcVar2 = this.a;
                    qbm qbmVar2 = this.b;
                    int i = crjd.g;
                    crjcVar2.a.d(qbmVar2, true);
                }
            }, bvrj.BACKGROUND_THREADPOOL, 1500L);
        }
    }
}
