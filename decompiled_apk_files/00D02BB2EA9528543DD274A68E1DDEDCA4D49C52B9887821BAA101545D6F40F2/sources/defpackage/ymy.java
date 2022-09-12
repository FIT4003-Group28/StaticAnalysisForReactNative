package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ymy  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ymy implements dbrn {
    static final dbrn a = new ymy();

    private ymy() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        yiq yiqVar = (yiq) obj;
        dcdc<drsm> dcdcVar = ynf.a;
        if (yiqVar.a == 2) {
            drsm b = drsm.b(((Integer) yiqVar.b).intValue());
            return b == null ? drsm.UNSPECIFIED_NON_TRANSIT_MODE : b;
        }
        return drsm.UNSPECIFIED_NON_TRANSIT_MODE;
    }
}
