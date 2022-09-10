package defpackage;
/* renamed from: bmqt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqt implements cqlc {
    static final cqlc a = new bmqt();

    private bmqt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.K().booleanValue() && !bmtvVar.E().booleanValue() && !bmtvVar.F().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
