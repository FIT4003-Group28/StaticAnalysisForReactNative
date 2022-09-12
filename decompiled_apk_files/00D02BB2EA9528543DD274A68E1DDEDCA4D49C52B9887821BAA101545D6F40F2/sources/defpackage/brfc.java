package defpackage;
/* renamed from: brfc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brfc implements cqlc {
    static final cqlc a = new brfc();

    private brfc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        brgu brguVar = (brgu) cqkpVar;
        cqjg cqjgVar = brfp.a;
        boolean z = false;
        if (!brguVar.b().booleanValue() && cqjv.v(brguVar.c()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
