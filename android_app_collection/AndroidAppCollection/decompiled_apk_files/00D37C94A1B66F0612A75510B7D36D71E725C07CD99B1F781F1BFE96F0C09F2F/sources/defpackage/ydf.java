package defpackage;
/* compiled from: PG */
/* renamed from: ydf  reason: default package */
/* loaded from: classes4.dex */
public final class ydf {
    public aoob a;
    public int b;

    public final awhn a() {
        aopa createBuilder = awhn.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhn awhnVar = (awhn) createBuilder.instance;
            awhnVar.b |= 1;
            awhnVar.c = aoobVar;
        }
        int i = this.b;
        if (i != 0) {
            createBuilder.copyOnWrite();
            awhn awhnVar2 = (awhn) createBuilder.instance;
            awhnVar2.d = i - 1;
            awhnVar2.b |= 2;
        }
        return (awhn) createBuilder.mo39build();
    }
}
