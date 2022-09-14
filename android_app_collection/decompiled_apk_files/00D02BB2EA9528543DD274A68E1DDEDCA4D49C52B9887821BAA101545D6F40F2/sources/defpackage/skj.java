package defpackage;
/* renamed from: skj  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class skj implements cqlc {
    static final cqlc a = new skj();

    private skj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        sne sneVar = (sne) cqkpVar;
        int i = sku.a;
        boolean z = true;
        if (sneVar.e().booleanValue() && !cqjv.v(sneVar.h()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
