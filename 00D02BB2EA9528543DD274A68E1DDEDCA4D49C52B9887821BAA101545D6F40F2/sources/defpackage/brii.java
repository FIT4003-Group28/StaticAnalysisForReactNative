package defpackage;
/* renamed from: brii  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brii implements cqlc {
    static final cqlc a = new brii();

    private brii() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bssp bsspVar = (bssp) cqkpVar;
        int i = brjc.b;
        boolean z = true;
        if (!bsspVar.k().booleanValue() && !bsspVar.l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
