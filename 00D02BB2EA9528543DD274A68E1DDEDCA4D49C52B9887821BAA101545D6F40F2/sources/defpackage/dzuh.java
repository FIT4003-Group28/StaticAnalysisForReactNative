package defpackage;
/* compiled from: PG */
/* renamed from: dzuh  reason: default package */
/* loaded from: classes6.dex */
final class dzuh extends dzvy implements dzvi<dztc, dzum, dztc> {
    final /* synthetic */ dzup[] a;
    final /* synthetic */ dzwd b;

    public dzuh(dzup[] dzupVarArr, dzwd dzwdVar) {
        this.a = dzupVarArr;
        this.b = dzwdVar;
    }

    @Override // defpackage.dzvi
    public final /* bridge */ /* synthetic */ dztc a(dztc dztcVar, dzum dzumVar) {
        dzum dzumVar2 = dzumVar;
        dzvx.c(dztcVar, "<anonymous parameter 0>");
        dzvx.c(dzumVar2, "element");
        dzup[] dzupVarArr = this.a;
        dzwd dzwdVar = this.b;
        int i = dzwdVar.a;
        dzwdVar.a = i + 1;
        dzupVarArr[i] = dzumVar2;
        return dztc.a;
    }
}
