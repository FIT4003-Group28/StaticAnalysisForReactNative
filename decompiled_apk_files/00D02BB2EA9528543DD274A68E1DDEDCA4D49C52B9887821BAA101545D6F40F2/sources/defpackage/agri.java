package defpackage;
/* renamed from: agri  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agri implements cqlc {
    static final cqlc a = new agri();

    private agri() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        agxd agxdVar = (agxd) cqkpVar;
        int i = agrw.a;
        boolean z = true;
        if (!agxdVar.f().booleanValue() && !agxdVar.g().booleanValue() && !agxdVar.h().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
