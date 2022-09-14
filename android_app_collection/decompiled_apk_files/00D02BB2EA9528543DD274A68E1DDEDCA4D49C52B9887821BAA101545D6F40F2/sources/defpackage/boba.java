package defpackage;
/* renamed from: boba  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class boba implements cqlc {
    static final cqlc a = new boba();

    private boba() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqh boqhVar = (boqh) cqkpVar;
        int i = bobo.a;
        boolean z = false;
        if (boqhVar.f().booleanValue() && !boqhVar.g().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
