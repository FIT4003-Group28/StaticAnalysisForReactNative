package defpackage;
/* renamed from: xtl  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xtl implements cqlc {
    static final cqlc a = new xtl();

    private xtl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        xzp xzpVar = (xzp) cqkpVar;
        int i = xtr.a;
        boolean z = true;
        if (xzpVar.l().booleanValue() && !cqjv.v(xzpVar.q()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
