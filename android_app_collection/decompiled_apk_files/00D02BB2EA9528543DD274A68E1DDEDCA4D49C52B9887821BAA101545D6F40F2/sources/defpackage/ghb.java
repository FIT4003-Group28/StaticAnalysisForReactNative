package defpackage;
/* renamed from: ghb  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class ghb implements cqlc {
    static final cqlc a = new ghb();

    private ghb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ghq ghqVar = (ghq) cqkpVar;
        cqjg cqjgVar = ghj.a;
        boolean z = false;
        if (ghqVar.g().booleanValue() && !ghqVar.h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
