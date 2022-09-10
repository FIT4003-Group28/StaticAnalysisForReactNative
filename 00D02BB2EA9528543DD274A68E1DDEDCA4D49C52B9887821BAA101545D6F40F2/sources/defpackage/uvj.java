package defpackage;
/* renamed from: uvj  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uvj implements cqlc {
    static final cqlc a = new uvj();

    private uvj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zct zctVar = (zct) cqkpVar;
        cqlc<zct, Boolean> cqlcVar = uxj.a;
        boolean z = true;
        if (!zctVar.r().booleanValue() && !zctVar.I().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
