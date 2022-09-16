package defpackage;
/* compiled from: PG */
/* renamed from: jdd  reason: default package */
/* loaded from: classes3.dex */
public final class jdd extends jap {
    @Override // defpackage.jap
    protected final amvn a(agvx agvxVar) {
        String n = emn.n(awjw.b, "downloads_library");
        n.getClass();
        aqxo.z(!n.isEmpty(), "key cannot be empty");
        aopa createBuilder = awjw.a.createBuilder();
        createBuilder.copyOnWrite();
        awjw awjwVar = (awjw) createBuilder.instance;
        awjwVar.c |= 1;
        awjwVar.d = n;
        awjt awjtVar = new awjt(createBuilder);
        String i = emn.i();
        aopa aopaVar = awjtVar.a;
        aopaVar.copyOnWrite();
        awjw awjwVar2 = (awjw) aopaVar.instance;
        i.getClass();
        awjwVar2.c |= 4;
        awjwVar2.e = i;
        return amvn.r(awjtVar);
    }
}
