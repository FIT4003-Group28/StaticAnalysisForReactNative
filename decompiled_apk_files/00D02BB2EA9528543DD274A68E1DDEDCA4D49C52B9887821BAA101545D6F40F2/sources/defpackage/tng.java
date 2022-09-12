package defpackage;
/* renamed from: tng  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tng implements dbrn {
    static final dbrn a = new tng();

    private tng() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        yiq yiqVar = (yiq) obj;
        if (yiqVar.a == 2) {
            drsm b = drsm.b(((Integer) yiqVar.b).intValue());
            return b == null ? drsm.UNSPECIFIED_NON_TRANSIT_MODE : b;
        }
        return drsm.UNSPECIFIED_NON_TRANSIT_MODE;
    }
}
