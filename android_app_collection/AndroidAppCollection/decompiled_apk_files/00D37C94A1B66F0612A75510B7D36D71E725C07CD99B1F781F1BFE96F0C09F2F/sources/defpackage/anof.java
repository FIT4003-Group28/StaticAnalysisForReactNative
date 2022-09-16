package defpackage;
/* compiled from: PG */
/* renamed from: anof  reason: default package */
/* loaded from: classes.dex */
final class anof extends anmp {
    public anof(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anrj) aopi.parseFrom(anrj.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anrj anrjVar = (anrj) aoquVar;
        aopa createBuilder = anri.a.createBuilder();
        createBuilder.copyOnWrite();
        anrjVar.getClass();
        ((anri) createBuilder.instance).c = anrjVar;
        createBuilder.copyOnWrite();
        ((anri) createBuilder.instance).b = 0;
        return (anri) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anrj anrjVar = (anrj) aoquVar;
    }
}
