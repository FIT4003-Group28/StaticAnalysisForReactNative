package defpackage;
/* compiled from: PG */
/* renamed from: awzp  reason: default package */
/* loaded from: classes3.dex */
final class awzp implements awze<dvgu> {
    static final awzp a = new awzp();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvgu a(dvgu dvguVar, awyw awywVar, dmlb dmlbVar) {
        dvgu dvguVar2 = dvguVar;
        dqpe dqpeVar = dvguVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        return dvguVar2;
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvgu dvguVar, awza awzaVar, dmlb dmlbVar) {
        dqpe dqpeVar = dvguVar.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        return awzaVar.a(dqpeVar, dmlbVar);
    }
}
