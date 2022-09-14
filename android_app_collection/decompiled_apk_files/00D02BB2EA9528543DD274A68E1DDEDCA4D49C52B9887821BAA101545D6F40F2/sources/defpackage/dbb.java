package defpackage;
/* compiled from: PG */
/* renamed from: dbb  reason: default package */
/* loaded from: classes5.dex */
final class dbb implements dfeq<dfgm> {
    final /* synthetic */ dbc a;
    private long b;
    private final dfep c;

    public dbb(dbc dbcVar, dfep dfepVar) {
        this.a = dbcVar;
        this.c = dfepVar;
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfgm dfgmVar) {
        dfgm dfgmVar2 = dfgmVar;
        dbc dbcVar = this.a;
        dgb dgbVar = dbcVar.f;
        if (dgbVar == null || dbcVar.c || dfgmVar2 == null || this.c != dbcVar.e) {
            return;
        }
        dgbVar.b(true);
        dbc dbcVar2 = this.a;
        dgb dgbVar2 = dbcVar2.f;
        long g = dbcVar2.g.g();
        long j = this.b;
        float f = 0.0f;
        if (((float) j) > 0.0f) {
            f = ((float) (g - j)) / 1000.0f;
        }
        this.b = g;
        dgbVar2.f(f, dfz.a(dfgmVar2), dfgmVar2.b * this.a.h.getWidth(), dfgmVar2.c * this.a.h.getHeight());
    }
}
