package defpackage;
/* renamed from: axkm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axkm implements cqlc {
    static final cqlc a = new axkm();

    private axkm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        axom axomVar = (axom) cqkpVar;
        int i = axku.a;
        boolean z = true;
        if (!axomVar.f().booleanValue() && !axomVar.g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
