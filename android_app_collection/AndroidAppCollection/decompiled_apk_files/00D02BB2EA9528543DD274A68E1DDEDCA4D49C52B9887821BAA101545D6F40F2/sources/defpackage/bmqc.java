package defpackage;
/* renamed from: bmqc  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqc implements cqlc {
    static final cqlc a = new bmqc();

    private bmqc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = true;
        if (!bmtvVar.D().booleanValue() && !bmtvVar.C().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
