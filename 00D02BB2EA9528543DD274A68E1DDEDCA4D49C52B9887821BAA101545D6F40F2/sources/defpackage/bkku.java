package defpackage;
/* renamed from: bkku  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkku implements cqlc {
    static final cqlc a = new bkku();

    private bkku() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bklf bklfVar = (bklf) cqkpVar;
        int i = bkla.a;
        boolean z = true;
        if ((bklfVar.g().intValue() > 0 || bklfVar.f().intValue() > 0) && !bklfVar.k().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
