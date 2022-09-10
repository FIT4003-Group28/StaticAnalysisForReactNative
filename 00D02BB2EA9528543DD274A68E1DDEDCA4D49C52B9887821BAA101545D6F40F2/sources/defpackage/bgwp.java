package defpackage;
/* renamed from: bgwp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgwp implements cqlc {
    static final cqlc a = new bgwp();

    private bgwp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgyo bgyoVar = (bgyo) cqkpVar;
        cqjg cqjgVar = bgwr.a;
        if (bgyoVar.a().booleanValue()) {
            return ibm.j();
        }
        if (bgyoVar.d().booleanValue() || bgyoVar.e().booleanValue()) {
            return ibm.b();
        }
        return ibm.t();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
