package defpackage;
/* renamed from: bmqq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqq implements cqlc {
    static final cqlc a = new bmqq();

    private bmqq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.K().booleanValue() && bmtvVar.E().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
