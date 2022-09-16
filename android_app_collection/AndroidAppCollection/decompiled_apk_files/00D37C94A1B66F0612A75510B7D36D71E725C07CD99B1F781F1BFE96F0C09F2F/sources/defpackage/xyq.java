package defpackage;
/* compiled from: PG */
/* renamed from: xyq  reason: default package */
/* loaded from: classes4.dex */
public final class xyq {
    public aoob a;

    public final awhj a() {
        aopa createBuilder = awhj.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhj awhjVar = (awhj) createBuilder.instance;
            awhjVar.b |= 1;
            awhjVar.c = aoobVar;
        }
        return (awhj) createBuilder.mo39build();
    }
}
