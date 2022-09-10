package defpackage;
/* renamed from: met  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class met implements cqlc {
    static final cqlc a = new met();

    private met() {
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
