package defpackage;
/* renamed from: cbkx  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cbkx implements cqlc {
    static final cqlc a = new cbkx();

    private cbkx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cbrd cbrdVar = (cbrd) cqkpVar;
        cqjg cqjgVar = cbkz.a;
        boolean z = true;
        if (!cqjv.v(cbrdVar.b()).booleanValue() && cbrdVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
