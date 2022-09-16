package defpackage;
/* compiled from: PG */
/* renamed from: hht  reason: default package */
/* loaded from: classes3.dex */
final class hht extends hhi {
    private static double a(double d) {
        return d / 255.0d;
    }

    @Override // defpackage.hhi, defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        aotk aotkVar = (aotk) obj;
        if (aotkVar == null) {
            return aqsn.a;
        }
        aopa createBuilder = aqsn.a.createBuilder();
        double d = aotkVar.c;
        createBuilder.copyOnWrite();
        aqsn aqsnVar = (aqsn) createBuilder.instance;
        aqsnVar.b |= 1;
        aqsnVar.c = a(d);
        double d2 = aotkVar.d;
        createBuilder.copyOnWrite();
        aqsn aqsnVar2 = (aqsn) createBuilder.instance;
        aqsnVar2.b |= 2;
        aqsnVar2.d = a(d2);
        double d3 = aotkVar.e;
        createBuilder.copyOnWrite();
        aqsn aqsnVar3 = (aqsn) createBuilder.instance;
        aqsnVar3.b |= 4;
        aqsnVar3.e = a(d3);
        double d4 = aotkVar.f;
        createBuilder.copyOnWrite();
        aqsn aqsnVar4 = (aqsn) createBuilder.instance;
        aqsnVar4.b |= 8;
        aqsnVar4.f = a(d4);
        return (aqsn) createBuilder.mo39build();
    }
}
