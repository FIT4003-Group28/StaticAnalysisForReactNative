package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mmj  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class mmj implements cqlc {
    static final cqlc a = new mmj();

    private mmj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mpc mpcVar = (mpc) cqkpVar;
        int i = mns.a;
        boolean z = false;
        if (mpcVar.t().booleanValue() && !mpcVar.s().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
