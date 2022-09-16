package defpackage;
/* renamed from: aduv  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aduv implements cqlc {
    static final cqlc a = new aduv();

    private aduv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        advi adviVar = (advi) cqkpVar;
        int i = adux.a;
        boolean z = true;
        if (!cqjv.v(adviVar.f()).booleanValue() && !cqjv.v(adviVar.d()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
