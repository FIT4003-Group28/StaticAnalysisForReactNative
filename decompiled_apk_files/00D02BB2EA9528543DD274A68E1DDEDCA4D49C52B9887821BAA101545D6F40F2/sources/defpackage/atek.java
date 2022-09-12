package defpackage;
/* renamed from: atek  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atek implements cqlc {
    static final cqlc a = new atek();

    private atek() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atnf atnfVar = (atnf) cqkpVar;
        atob atobVar = ateu.a;
        boolean z = true;
        if (atnfVar.L().booleanValue() || (!atnfVar.o().booleanValue() && !atnfVar.m().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
