package defpackage;
/* renamed from: bgry  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgry implements cqlc {
    static final cqlc a = new bgry();

    private bgry() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgsl bgslVar = (bgsl) cqkpVar;
        int i = bgsd.a;
        boolean z = false;
        if (bgslVar.e().booleanValue() && bgslVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
