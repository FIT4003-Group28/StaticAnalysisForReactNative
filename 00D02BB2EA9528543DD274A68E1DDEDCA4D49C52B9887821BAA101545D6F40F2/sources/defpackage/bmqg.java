package defpackage;
/* renamed from: bmqg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqg implements cqlc {
    static final cqlc a = new bmqg();

    private bmqg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.M().booleanValue() && bmtvVar.K().booleanValue() && bmtvVar.E().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
