package defpackage;
/* compiled from: PG */
/* renamed from: annq  reason: default package */
/* loaded from: classes.dex */
final class annq extends anmp {
    public annq(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anpx) aopi.parseFrom(anpx.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anpx anpxVar = (anpx) aoquVar;
        aopa createBuilder = anpw.a.createBuilder();
        anpy anpyVar = anpxVar.b;
        if (anpyVar == null) {
            anpyVar = anpy.a;
        }
        createBuilder.copyOnWrite();
        anpyVar.getClass();
        ((anpw) createBuilder.instance).c = anpyVar;
        aoob x = aoob.x(anum.a(anpxVar.c));
        createBuilder.copyOnWrite();
        ((anpw) createBuilder.instance).d = x;
        createBuilder.copyOnWrite();
        ((anpw) createBuilder.instance).b = 0;
        return (anpw) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anpx anpxVar = (anpx) aoquVar;
        anus.a(anpxVar.c);
        anpy anpyVar = anpxVar.b;
        if (anpyVar == null) {
            anpyVar = anpy.a;
        }
        annr.i(anpyVar);
    }
}
