package defpackage;
/* renamed from: bkkn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkkn implements cqlc {
    static final cqlc a = new bkkn();

    private bkkn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bklf bklfVar = (bklf) cqkpVar;
        int i = bkla.a;
        boolean z = true;
        if (!cqjv.v(bklfVar.h()).booleanValue() && !bklfVar.k().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
