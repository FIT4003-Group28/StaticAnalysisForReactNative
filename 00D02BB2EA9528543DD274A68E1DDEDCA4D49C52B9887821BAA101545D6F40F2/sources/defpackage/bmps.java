package defpackage;
/* renamed from: bmps  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmps implements cqlc {
    static final cqlc a = new bmps();

    private bmps() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.B().booleanValue() && !bmtvVar.G().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
