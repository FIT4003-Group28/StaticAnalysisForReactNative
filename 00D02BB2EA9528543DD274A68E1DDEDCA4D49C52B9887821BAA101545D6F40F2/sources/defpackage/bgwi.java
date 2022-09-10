package defpackage;
/* renamed from: bgwi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgwi implements cqlc {
    static final cqlc a = new bgwi();

    private bgwi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgyo bgyoVar = (bgyo) cqkpVar;
        cqjg cqjgVar = bgwr.a;
        if (bgyoVar.f().booleanValue() || (bgyoVar.e().booleanValue() && !bgyoVar.d().booleanValue())) {
            return bgyoVar.c().booleanValue() ? ibm.v() : ibm.u();
        }
        return ibm.a();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
