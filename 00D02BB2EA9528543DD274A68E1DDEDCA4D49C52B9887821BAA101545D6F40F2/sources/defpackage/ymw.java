package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ymw  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ymw implements dbrn {
    static final dbrn a = new ymw();

    private ymw() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        yiq yiqVar = (yiq) obj;
        dcdc<drsm> dcdcVar = ynf.a;
        if (yiqVar.a == 1) {
            dqvh b = dqvh.b(((Integer) yiqVar.b).intValue());
            return b == null ? dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN : b;
        }
        return dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
    }
}
