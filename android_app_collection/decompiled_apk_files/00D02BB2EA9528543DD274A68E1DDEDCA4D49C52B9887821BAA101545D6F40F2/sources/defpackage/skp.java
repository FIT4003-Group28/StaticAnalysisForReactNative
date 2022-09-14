package defpackage;
/* renamed from: skp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class skp implements cqlc {
    static final cqlc a = new skp();

    private skp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        sne sneVar = (sne) cqkpVar;
        int i = sku.a;
        boolean z = true;
        if (!sneVar.g().booleanValue() && !sneVar.q().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
