package defpackage;
/* renamed from: bnzr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bnzr implements cqlc {
    static final cqlc a = new bnzr();

    private bnzr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bopy bopyVar = (bopy) cqkpVar;
        int i = bnzu.a;
        boolean z = true;
        if (!bopyVar.i().s().booleanValue() && bopyVar.i().h().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
