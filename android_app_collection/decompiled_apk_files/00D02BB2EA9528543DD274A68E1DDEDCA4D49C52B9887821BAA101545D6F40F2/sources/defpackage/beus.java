package defpackage;
/* renamed from: beus  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class beus implements cqlc {
    static final cqlc a = new beus();

    private beus() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bevj bevjVar = (bevj) cqkpVar;
        cqtv cqtvVar = bevi.a;
        boolean z = true;
        if (!bevjVar.c().booleanValue() && !bevjVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
