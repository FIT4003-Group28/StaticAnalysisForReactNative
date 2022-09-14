package defpackage;
/* renamed from: uwz  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uwz implements cqlc {
    static final cqlc a = new uwz();

    private uwz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zct zctVar = (zct) cqkpVar;
        cqlc<zct, Boolean> cqlcVar = uxj.a;
        boolean z = true;
        if (zctVar.M() != zfn.INFO_SHEET_HEADER_EXPANDED && zctVar.M() != zfn.INFO_SHEET_HEADER_FULLY_EXPANDED) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
