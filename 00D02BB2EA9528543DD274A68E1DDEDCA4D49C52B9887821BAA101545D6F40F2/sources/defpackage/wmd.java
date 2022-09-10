package defpackage;
/* renamed from: wmd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wmd implements cqlc {
    static final cqlc a = new wmd();

    private wmd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        boolean z = true;
        if (!wplVar.z().booleanValue() && !wplVar.Z(donz.CANCELED).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
