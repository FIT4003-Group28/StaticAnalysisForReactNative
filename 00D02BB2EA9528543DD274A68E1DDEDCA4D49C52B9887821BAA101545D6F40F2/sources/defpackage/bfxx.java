package defpackage;
/* renamed from: bfxx  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfxx implements cqlc {
    static final cqlc a = new bfxx();

    private bfxx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnia bniaVar = (bnia) cqkpVar;
        int i = bfyi.a;
        boolean z = false;
        if (bniaVar.e().booleanValue() && bniaVar.m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
