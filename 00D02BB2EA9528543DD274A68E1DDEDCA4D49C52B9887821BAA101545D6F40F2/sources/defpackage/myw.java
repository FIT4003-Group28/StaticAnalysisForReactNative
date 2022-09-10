package defpackage;
/* renamed from: myw  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class myw implements cqlc {
    static final cqlc a = new myw();

    private myw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mze mzeVar = (mze) cqkpVar;
        int i = mza.a;
        boolean z = true;
        if (!cqjv.v(mzeVar.a()).booleanValue() && !cqjv.v(mzeVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
