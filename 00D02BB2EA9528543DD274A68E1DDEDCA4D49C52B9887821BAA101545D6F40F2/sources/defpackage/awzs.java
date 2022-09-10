package defpackage;
/* compiled from: PG */
/* renamed from: awzs  reason: default package */
/* loaded from: classes3.dex */
final class awzs implements awze<dvhi> {
    static final awzs a = new awzs();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvhi a(dvhi dvhiVar, awyw awywVar, dmlb dmlbVar) {
        dvhi dvhiVar2 = dvhiVar;
        dqpe dqpeVar = dvhiVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        return dvhiVar2;
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvhi dvhiVar, awza awzaVar, dmlb dmlbVar) {
        dqpe dqpeVar = dvhiVar.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        return awzaVar.a(dqpeVar, dmlbVar);
    }
}
