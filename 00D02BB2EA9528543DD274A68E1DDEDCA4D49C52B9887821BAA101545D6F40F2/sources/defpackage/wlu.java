package defpackage;
/* renamed from: wlu  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wlu implements cqlc {
    static final cqlc a = new wlu();

    private wlu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        int i = 1;
        if (!wplVar.Z(donz.CHANGED).booleanValue() && !wplVar.Z(donz.ON_TIME).booleanValue()) {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
