package defpackage;
/* compiled from: PG */
/* renamed from: aikm  reason: default package */
/* loaded from: classes.dex */
public final class aikm implements aaqw {
    aoob a;
    String b;

    public aikm(aynx aynxVar, aynx aynxVar2) {
        aypf aypfVar = new aypf();
        aypfVar.d(aiwv.j(aynxVar, aihl.c).aa(new aikl(this, 1), aiax.p));
        aypfVar.d(aynxVar2.aa(new aikl(this), aiax.p));
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        aoob aoobVar = this.a;
        if (aoobVar == null || aoobVar.H()) {
            return;
        }
        aopa createBuilder = aroq.a.createBuilder();
        createBuilder.copyOnWrite();
        aroq aroqVar = (aroq) createBuilder.instance;
        aroqVar.b |= 1;
        aroqVar.c = aoobVar;
        aroq aroqVar2 = (aroq) createBuilder.mo39build();
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        aroy aroyVar2 = aroy.a;
        aroqVar2.getClass();
        aopu aopuVar = aroyVar.k;
        if (!aopuVar.c()) {
            aroyVar.k = aopi.mutableCopy(aopuVar);
        }
        aroyVar.k.add(aroqVar2);
    }
}
