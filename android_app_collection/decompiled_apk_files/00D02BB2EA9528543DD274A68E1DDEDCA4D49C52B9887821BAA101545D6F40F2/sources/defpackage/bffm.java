package defpackage;
/* renamed from: bffm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bffm implements cqlc {
    static final cqlc a = new bffm();

    private bffm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfgu bfguVar = (bfgu) cqkpVar;
        int i = bffq.a;
        boolean z = false;
        if (bfguVar.F().booleanValue() && bfguVar.D().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
