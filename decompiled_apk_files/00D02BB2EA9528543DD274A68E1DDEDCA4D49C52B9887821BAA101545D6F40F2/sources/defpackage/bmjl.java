package defpackage;
/* renamed from: bmjl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmjl implements cqlc {
    static final cqlc a = new bmjl();

    private bmjl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmkz bmkzVar = (bmkz) cqkpVar;
        int i = bmky.a;
        boolean z = true;
        if (!bmkzVar.k().booleanValue() && !bmkzVar.n().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}