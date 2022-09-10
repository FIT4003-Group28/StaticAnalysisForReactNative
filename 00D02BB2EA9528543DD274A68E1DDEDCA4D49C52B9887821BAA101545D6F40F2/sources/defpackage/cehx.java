package defpackage;
/* renamed from: cehx  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cehx implements cqlc {
    static final cqlc a = new cehx();

    private cehx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cesu cesuVar = (cesu) cqkpVar;
        cqjg cqjgVar = ceik.a;
        boolean z = true;
        if (!cesuVar.f().booleanValue() && !cesuVar.e().a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
