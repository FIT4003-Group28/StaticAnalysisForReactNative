package defpackage;
/* renamed from: bdsq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdsq implements cqlc {
    static final cqlc a = new bdsq();

    private bdsq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdtp bdtpVar = (bdtp) cqkpVar;
        cqsv cqsvVar = bdsu.a;
        boolean z = true;
        if (!cqjv.v(bdtpVar.o()).booleanValue() && bdtpVar.r().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
