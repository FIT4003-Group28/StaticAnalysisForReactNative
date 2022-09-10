package defpackage;
/* renamed from: njq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class njq implements cqlc {
    static final cqlc a = new njq();

    private njq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        nkv nkvVar = (nkv) cqkpVar;
        int i = nkf.a;
        boolean z = true;
        if (!cqjv.v(nkvVar.l()).booleanValue() && !cqjv.v(nkvVar.o()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
