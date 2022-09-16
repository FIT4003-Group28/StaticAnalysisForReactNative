package defpackage;
/* renamed from: chfc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chfc implements cqlc {
    static final cqlc a = new chfc();

    private chfc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        chmz chmzVar = (chmz) cqkpVar;
        int i = chfj.a;
        boolean z = true;
        if (!chmzVar.i().booleanValue() && !chmzVar.p().booleanValue() && !chmzVar.A().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
