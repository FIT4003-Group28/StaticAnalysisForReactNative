package defpackage;
/* renamed from: kbf  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class kbf implements cqlc {
    static final cqlc a = new kbf();

    private kbf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        nkv nkvVar = (nkv) cqkpVar;
        cqtv cqtvVar = kbl.a;
        boolean z = true;
        if (!nkvVar.x().booleanValue() && !nkvVar.y().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
