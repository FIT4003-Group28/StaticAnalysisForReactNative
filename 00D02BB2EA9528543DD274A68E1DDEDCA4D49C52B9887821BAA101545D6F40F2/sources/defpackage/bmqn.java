package defpackage;
/* renamed from: bmqn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqn implements cqlc {
    static final cqlc a = new bmqn();

    private bmqn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.K().booleanValue() && bmtvVar.F().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
