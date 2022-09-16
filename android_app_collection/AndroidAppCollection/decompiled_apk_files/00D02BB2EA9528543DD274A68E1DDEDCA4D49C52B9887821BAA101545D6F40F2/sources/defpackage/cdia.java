package defpackage;
/* renamed from: cdia  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdia implements cqlc {
    static final cqlc a = new cdia();

    private cdia() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cdin cdinVar = (cdin) cqkpVar;
        int i = cdij.a;
        boolean z = false;
        if (cdinVar.d().booleanValue() && cdinVar.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
