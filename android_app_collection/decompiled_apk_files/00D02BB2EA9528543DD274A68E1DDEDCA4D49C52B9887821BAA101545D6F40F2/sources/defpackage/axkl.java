package defpackage;
/* renamed from: axkl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axkl implements cqlc {
    static final cqlc a = new axkl();

    private axkl() {
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
