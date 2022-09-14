package defpackage;
/* renamed from: tov  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tov implements dbrn {
    static final dbrn a = new tov();

    private tov() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        tnx tnxVar = (tnx) obj;
        if (tnxVar.a == 2) {
            drsm b = drsm.b(((Integer) tnxVar.b).intValue());
            return b == null ? drsm.UNSPECIFIED_NON_TRANSIT_MODE : b;
        }
        return drsm.UNSPECIFIED_NON_TRANSIT_MODE;
    }
}
