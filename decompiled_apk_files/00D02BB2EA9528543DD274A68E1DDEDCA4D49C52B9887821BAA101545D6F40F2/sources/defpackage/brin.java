package defpackage;
/* renamed from: brin  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brin implements cqlc {
    static final cqlc a = new brin();

    private brin() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bssp bsspVar = (bssp) cqkpVar;
        int i = brjc.b;
        boolean z = true;
        if (!cqjv.v(bsspVar.r()).booleanValue() && !bsspVar.j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
