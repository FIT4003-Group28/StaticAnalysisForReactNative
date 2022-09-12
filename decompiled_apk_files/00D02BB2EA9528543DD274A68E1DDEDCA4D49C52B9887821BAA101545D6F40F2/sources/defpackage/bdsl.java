package defpackage;
/* renamed from: bdsl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdsl implements cqlc {
    static final cqlc a = new bdsl();

    private bdsl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdtp bdtpVar = (bdtp) cqkpVar;
        cqsv cqsvVar = bdsu.a;
        boolean z = true;
        if (!cqjv.v(bdtpVar.o()).booleanValue() && !bdtpVar.r().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
