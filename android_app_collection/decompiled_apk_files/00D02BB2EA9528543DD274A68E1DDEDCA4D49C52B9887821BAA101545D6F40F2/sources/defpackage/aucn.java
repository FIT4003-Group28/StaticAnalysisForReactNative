package defpackage;
/* renamed from: aucn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aucn implements cqlc {
    static final cqlc a = new aucn();

    private aucn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        audp audpVar = (audp) cqkpVar;
        cqrp cqrpVar = aucv.a;
        if (audpVar.r().booleanValue()) {
            return iva.b(cqta.e(audpVar.g().intValue()), cqta.e(audpVar.h().intValue()));
        }
        return iva.b(cqta.e(audpVar.c().intValue()), cqta.e(audpVar.d().intValue()));
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
