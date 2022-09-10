package defpackage;
/* renamed from: bfju  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfju implements cqlc {
    static final cqlc a = new bfju();

    private bfju() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfkm bfkmVar = (bfkm) cqkpVar;
        cqjg cqjgVar = bfka.a;
        boolean z = true;
        if (!bfkmVar.i().booleanValue() || bfkmVar.A().size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
