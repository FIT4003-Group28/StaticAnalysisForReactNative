package defpackage;
/* renamed from: njy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class njy implements cqlc {
    static final cqlc a = new njy();

    private njy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i;
        nkv nkvVar = (nkv) cqkpVar;
        if (nkvVar.j().booleanValue()) {
            i = nkvVar.k().booleanValue() ? nkf.b : nkf.a;
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
