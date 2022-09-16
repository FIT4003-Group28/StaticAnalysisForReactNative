package defpackage;
/* renamed from: nks  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nks implements cqlc {
    static final cqlc a = new nks();

    private nks() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i;
        nkv nkvVar = (nkv) cqkpVar;
        if (nkvVar.j().booleanValue()) {
            i = nkvVar.k().booleanValue() ? nku.b : nku.a;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
