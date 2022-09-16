package defpackage;
/* compiled from: PG */
/* renamed from: yde  reason: default package */
/* loaded from: classes4.dex */
final class yde {
    public aoob a;
    public int b;

    public final arrh a() {
        arrf a = arrh.a();
        aopa createBuilder = awhm.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhm awhmVar = (awhm) createBuilder.instance;
            awhmVar.b |= 1;
            awhmVar.c = aoobVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awhm awhmVar2 = (awhm) createBuilder.instance;
            awhmVar2.d = i - 1;
            awhmVar2.b |= 4;
        }
        a.copyOnWrite();
        ((arrh) a.instance).ex((awhm) createBuilder.mo39build());
        return (arrh) a.mo39build();
    }
}
