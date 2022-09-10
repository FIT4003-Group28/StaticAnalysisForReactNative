package defpackage;
/* renamed from: cdbq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdbq implements cqlc {
    static final cqlc a = new cdbq();

    private cdbq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cdei cdeiVar = (cdei) cqkpVar;
        cqrp cqrpVar = cdeg.a;
        boolean z = true;
        if (!cdeiVar.f().booleanValue() && !cdeiVar.h().a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
