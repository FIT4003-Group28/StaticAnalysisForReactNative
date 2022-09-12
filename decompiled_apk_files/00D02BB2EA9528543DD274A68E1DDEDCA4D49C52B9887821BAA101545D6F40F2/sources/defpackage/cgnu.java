package defpackage;
/* renamed from: cgnu  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgnu implements cqlc {
    static final cqlc a = new cgnu();

    private cgnu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cgwb cgwbVar = (cgwb) cqkpVar;
        cqrp cqrpVar = cgop.a;
        boolean z = true;
        if (!cqjv.v(cgwbVar.b()).booleanValue() && !cqjv.v(cgwbVar.a()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
