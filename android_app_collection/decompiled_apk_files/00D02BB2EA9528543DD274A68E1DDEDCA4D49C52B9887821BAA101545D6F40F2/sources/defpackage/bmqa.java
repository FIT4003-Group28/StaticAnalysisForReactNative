package defpackage;
/* renamed from: bmqa  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqa implements cqlc {
    static final cqlc a = new bmqa();

    private bmqa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = true;
        if (!bmtvVar.G().booleanValue() && !bmtvVar.z().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
