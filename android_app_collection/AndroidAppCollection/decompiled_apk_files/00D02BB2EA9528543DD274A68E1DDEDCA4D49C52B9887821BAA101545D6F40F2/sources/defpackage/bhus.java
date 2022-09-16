package defpackage;
/* renamed from: bhus  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhus implements cqlc {
    static final cqlc a = new bhus();

    private bhus() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhwx bhwxVar = (bhwx) cqkpVar;
        cqjg cqjgVar = bhwd.a;
        boolean z = false;
        if (bhwxVar.o().booleanValue() && bhwxVar.v().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
