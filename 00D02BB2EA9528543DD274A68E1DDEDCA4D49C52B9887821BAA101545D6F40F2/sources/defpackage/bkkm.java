package defpackage;
/* renamed from: bkkm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkkm implements cqlc {
    static final cqlc a = new bkkm();

    private bkkm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bklf bklfVar = (bklf) cqkpVar;
        int i = bkla.a;
        boolean z = false;
        if (bklfVar.e().booleanValue() && !bklfVar.k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
