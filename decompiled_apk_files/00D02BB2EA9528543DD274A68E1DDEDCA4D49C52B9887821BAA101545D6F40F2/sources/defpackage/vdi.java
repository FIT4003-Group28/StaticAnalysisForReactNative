package defpackage;
/* renamed from: vdi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vdi implements cqlc {
    static final cqlc a = new vdi();

    private vdi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zbv zbvVar = (zbv) cqkpVar;
        int i = vdu.c;
        boolean z = true;
        if (!zbvVar.d().booleanValue() && !zbvVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
