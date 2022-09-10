package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mmh  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class mmh implements cqlc {
    static final cqlc a = new mmh();

    private mmh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mpc mpcVar = (mpc) cqkpVar;
        int i = mns.a;
        boolean z = true;
        if (!mpcVar.t().booleanValue() && !mpcVar.s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
