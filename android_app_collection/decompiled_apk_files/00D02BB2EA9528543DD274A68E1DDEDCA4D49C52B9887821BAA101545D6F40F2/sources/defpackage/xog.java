package defpackage;
/* renamed from: xog  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xog implements cqlc {
    static final cqlc a = new xog();

    private xog() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        xza xzaVar = (xza) cqkpVar;
        int i = xpk.a;
        boolean z = true;
        if (!xzaVar.g().booleanValue() && !xzaVar.l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
