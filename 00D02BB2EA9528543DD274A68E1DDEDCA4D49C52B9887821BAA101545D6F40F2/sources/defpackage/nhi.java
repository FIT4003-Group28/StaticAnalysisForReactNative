package defpackage;
/* renamed from: nhi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nhi implements cqlc {
    static final cqlc a = new nhi();

    private nhi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        nkv nkvVar = (nkv) cqkpVar;
        int i = njn.a;
        boolean z = true;
        if (!nkvVar.y().booleanValue() && !nkvVar.x().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
