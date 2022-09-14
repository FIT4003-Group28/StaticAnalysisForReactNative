package defpackage;
/* renamed from: bfjj  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfjj implements cqlc {
    static final cqlc a = new bfjj();

    private bfjj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfkm bfkmVar = (bfkm) cqkpVar;
        cqjg cqjgVar = bfka.a;
        boolean z = false;
        if (bfkmVar.b().booleanValue() && bfkmVar.A().size() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
