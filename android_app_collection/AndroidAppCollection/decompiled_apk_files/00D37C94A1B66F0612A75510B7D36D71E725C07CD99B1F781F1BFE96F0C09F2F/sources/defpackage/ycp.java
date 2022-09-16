package defpackage;
/* compiled from: PG */
/* renamed from: ycp  reason: default package */
/* loaded from: classes4.dex */
public final class ycp {
    public aoob a;
    public int b;

    public final awhg a() {
        aopa createBuilder = awhg.a.createBuilder();
        aoob aoobVar = this.a;
        createBuilder.copyOnWrite();
        awhg awhgVar = (awhg) createBuilder.instance;
        aoobVar.getClass();
        int i = 1;
        awhgVar.b |= 1;
        awhgVar.c = aoobVar;
        int i2 = this.b;
        if (i2 != 0) {
            i = i2;
        }
        createBuilder.copyOnWrite();
        awhg awhgVar2 = (awhg) createBuilder.instance;
        awhgVar2.d = i - 1;
        awhgVar2.b |= 2;
        return (awhg) createBuilder.mo39build();
    }
}
