package defpackage;
/* renamed from: wmg  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wmg implements cqlc {
    static final cqlc a = new wmg();

    private wmg() {
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
