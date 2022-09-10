package defpackage;
/* renamed from: bmqu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqu implements cqlc {
    static final cqlc a = new bmqu();

    private bmqu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = true;
        if (bmtvVar.C().booleanValue() && !bmtvVar.J().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
