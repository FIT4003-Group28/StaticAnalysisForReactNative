package defpackage;
/* renamed from: bstd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bstd implements cqlc {
    static final cqlc a = new bstd();

    private bstd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bstg bstgVar = (bstg) cqkpVar;
        int i = bstf.a;
        boolean z = true;
        if (!cqjv.v(bstgVar.c()).booleanValue() && !bstgVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
