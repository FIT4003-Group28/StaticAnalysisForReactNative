package defpackage;
/* compiled from: PG */
/* renamed from: byxb  reason: default package */
/* loaded from: classes4.dex */
public final class byxb {
    public static final dcco<dlkb, bzhm> a = dcco.a(dlkb.HOME, bzhm.HOME, dlkb.WORK, bzhm.WORK);
    public static final dcdn<dlju, bzjc> b;
    public static final dcdn<dlkp, bzjt> c;
    public final btvo d;

    static {
        dcdn.m(doza.INFORMATION, dlju.SEVERITY_INFORMATION, doza.WARNING, dlju.SEVERITY_WARNING, doza.ALERT, dlju.SEVERITY_CRITICAL);
        b = dcdn.n(dlju.SEVERITY_UNKNOWN, bzjc.UNKNOWN, dlju.SEVERITY_INFORMATION, bzjc.INFORMATION, dlju.SEVERITY_WARNING, bzjc.WARNING, dlju.SEVERITY_CRITICAL, bzjc.ALERT);
        c = dcdn.n(dlkp.BUS, bzjt.BUS, dlkp.TRAIN, bzjt.TRAIN, dlkp.SUBWAY, bzjt.SUBWAY, dlkp.FERRY, bzjt.FERRY);
    }

    public byxb(btvo btvoVar) {
        this.d = btvoVar;
    }

    public static dpce a(doul doulVar) {
        dpcb bZ = dpce.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar = (dpce) bZ.b;
        dpceVar.b = 5;
        int i = dpceVar.a | 1;
        dpceVar.a = i;
        doulVar.getClass();
        dpceVar.c = doulVar;
        dpceVar.a = i | 2;
        return bZ.bK();
    }

    public static dpce b(douj doujVar) {
        dpcb bZ = dpce.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar = (dpce) bZ.b;
        dpceVar.b = 5;
        int i = dpceVar.a | 1;
        dpceVar.a = i;
        doujVar.getClass();
        dpceVar.d = doujVar;
        dpceVar.a = i | 4;
        return bZ.bK();
    }
}
