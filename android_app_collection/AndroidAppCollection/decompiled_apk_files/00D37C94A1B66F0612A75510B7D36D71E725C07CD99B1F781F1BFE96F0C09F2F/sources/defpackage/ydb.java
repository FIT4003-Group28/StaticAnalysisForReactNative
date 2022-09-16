package defpackage;
/* compiled from: PG */
/* renamed from: ydb  reason: default package */
/* loaded from: classes4.dex */
public final class ydb {
    public aoob a;
    public int b;

    public final awhk a() {
        aopa createBuilder = awhk.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhk awhkVar = (awhk) createBuilder.instance;
            awhkVar.b |= 1;
            awhkVar.c = aoobVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awhk awhkVar2 = (awhk) createBuilder.instance;
            awhkVar2.d = i - 1;
            awhkVar2.b |= 2;
        }
        return (awhk) createBuilder.mo39build();
    }
}
