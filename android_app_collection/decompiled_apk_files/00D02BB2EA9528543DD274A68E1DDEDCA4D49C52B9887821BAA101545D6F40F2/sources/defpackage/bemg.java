package defpackage;
/* renamed from: bemg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bemg implements cqlc {
    static final cqlc a = new bemg();

    private bemg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        benu benuVar = (benu) cqkpVar;
        cqjg cqjgVar = bemt.a;
        boolean z = true;
        if (!benuVar.n().booleanValue() && !benuVar.m().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
