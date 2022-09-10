package defpackage;
/* renamed from: fzy  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class fzy implements cqlc {
    static final cqlc a = new fzy();

    private fzy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        gbe gbeVar = (gbe) cqkpVar;
        int i = gbb.a;
        boolean z = true;
        if (!cqjv.v(gbeVar.e()).booleanValue() && !cqjv.v(gbeVar.f()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
