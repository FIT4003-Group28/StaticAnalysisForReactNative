package defpackage;
/* renamed from: vcv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vcv implements cqlc {
    static final cqlc a = new vcv();

    private vcv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zbu zbuVar = (zbu) cqkpVar;
        int i = vdd.b;
        boolean z = true;
        if (zbuVar.g().booleanValue() && !zbuVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
