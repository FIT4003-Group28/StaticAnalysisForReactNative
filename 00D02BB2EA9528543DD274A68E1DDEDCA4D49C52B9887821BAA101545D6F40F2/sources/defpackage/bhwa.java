package defpackage;
/* renamed from: bhwa  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhwa implements cqlc {
    static final cqlc a = new bhwa();

    private bhwa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhwx bhwxVar = (bhwx) cqkpVar;
        int i = bhwc.a;
        boolean z = true;
        if (!bhwxVar.l().booleanValue() && bhwxVar.w().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
