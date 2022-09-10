package defpackage;
/* renamed from: vfh  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vfh implements cqlc {
    static final cqlc a = new vfh();

    private vfh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zby zbyVar = (zby) cqkpVar;
        int i = vfj.a;
        boolean z = false;
        if (!zbyVar.r().booleanValue() && !zbyVar.i().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
