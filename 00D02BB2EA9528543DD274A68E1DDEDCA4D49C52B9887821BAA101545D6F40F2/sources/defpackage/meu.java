package defpackage;
/* renamed from: meu  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class meu implements cqlc {
    static final cqlc a = new meu();

    private meu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mfe mfeVar = (mfe) cqkpVar;
        int i = mew.a;
        boolean z = true;
        if (!mfeVar.b().booleanValue() && !mfeVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
