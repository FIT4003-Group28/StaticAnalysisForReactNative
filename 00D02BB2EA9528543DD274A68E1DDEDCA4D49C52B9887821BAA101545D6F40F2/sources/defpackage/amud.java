package defpackage;
/* renamed from: amud  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class amud implements dbrn {
    static final dbrn a = new amud();

    private amud() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpce dpceVar = (dpce) obj;
        String k = alcf.k(dpceVar);
        if (k == null && (dpceVar.a & 2) != 0) {
            doul doulVar = dpceVar.c;
            if (doulVar == null) {
                doulVar = doul.f;
            }
            k = doulVar.b;
        }
        return dbsj.e(k);
    }
}
