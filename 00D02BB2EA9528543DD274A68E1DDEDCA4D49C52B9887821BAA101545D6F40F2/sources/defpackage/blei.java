package defpackage;
/* renamed from: blei  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blei implements cqlc {
    static final cqlc a = new blei();

    private blei() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cebx cebxVar = (cebx) cqkpVar;
        boolean z = false;
        if (blfj.f(cebxVar) && !cebxVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
