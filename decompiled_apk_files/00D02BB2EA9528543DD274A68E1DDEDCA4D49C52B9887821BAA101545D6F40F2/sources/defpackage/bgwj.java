package defpackage;
/* renamed from: bgwj  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgwj implements cqlc {
    static final cqlc a = new bgwj();

    private bgwj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgyo bgyoVar = (bgyo) cqkpVar;
        cqjg cqjgVar = bgwr.a;
        if (bgyoVar.f().booleanValue() || (bgyoVar.c().booleanValue() && bgyoVar.d().booleanValue() && !bgyoVar.e().booleanValue())) {
            return bgyoVar.c().booleanValue() ? ibm.v() : ibm.u();
        }
        return ibm.a();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
