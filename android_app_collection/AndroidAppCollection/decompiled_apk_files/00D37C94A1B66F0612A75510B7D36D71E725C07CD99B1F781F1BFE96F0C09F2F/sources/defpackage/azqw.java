package defpackage;
/* compiled from: PG */
/* renamed from: azqw  reason: default package */
/* loaded from: classes2.dex */
final class azqw extends azsu implements azsg {
    final /* synthetic */ azrd[] a;
    final /* synthetic */ azsv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azqw(azrd[] azrdVarArr, azsv azsvVar) {
        super(2);
        this.a = azrdVarArr;
        this.b = azsvVar;
    }

    @Override // defpackage.azsg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((azqm) obj).getClass();
        azrd[] azrdVarArr = this.a;
        azsv azsvVar = this.b;
        int i = azsvVar.a;
        azsvVar.a = i + 1;
        azrdVarArr[i] = (azra) obj2;
        return azqm.a;
    }
}
