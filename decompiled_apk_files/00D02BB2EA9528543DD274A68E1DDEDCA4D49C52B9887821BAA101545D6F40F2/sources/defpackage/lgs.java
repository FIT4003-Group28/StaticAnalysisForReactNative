package defpackage;
/* renamed from: lgs  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lgs implements cqlc {
    static final cqlc a = new lgs();

    private lgs() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lig ligVar = (lig) cqkpVar;
        boolean z = true;
        if (!npv.a().booleanValue() && ligVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
