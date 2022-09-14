package defpackage;
/* compiled from: PG */
/* renamed from: dyeo  reason: default package */
/* loaded from: classes6.dex */
public final class dyeo extends dyep {
    final /* synthetic */ dyem a;

    public dyeo(dyem dyemVar) {
        this.a = dyemVar;
    }

    @Override // defpackage.dyem
    public final void a(dyhw dyhwVar) {
        dyem dyemVar = this.a;
        dysv dysvVar = (dysv) dyemVar;
        dbsk.m(!dysvVar.h, "apply() or fail() already called");
        dbsk.t(dyhwVar, "headers");
        dysvVar.c.k(dyhwVar);
        dyfo b = dysvVar.e.b();
        try {
            dyls d = ((dysv) dyemVar).a.d(((dysv) dyemVar).b, ((dysv) dyemVar).c, ((dysv) dyemVar).d);
            dysvVar.e.c(b);
            dysvVar.c(d);
        } catch (Throwable th) {
            dysvVar.e.c(b);
            throw th;
        }
    }

    @Override // defpackage.dyem
    public final void b(dyjb dyjbVar) {
        this.a.b(dyjbVar);
    }
}
