package defpackage;
/* renamed from: igo  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class igo implements cqlc {
    static final cqlc a = new igo();

    private igo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        igq igqVar = (igq) cqkpVar;
        int i = igp.e;
        boolean z = false;
        if (cqjv.v(igqVar.d()).booleanValue() && cqjv.v(igqVar.c()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
