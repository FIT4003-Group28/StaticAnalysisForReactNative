package defpackage;
/* renamed from: apmc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class apmc {
    private final apmg a;

    public apmc(apmg apmgVar) {
        this.a = apmgVar;
    }

    public final void a(int i) {
        drtc drtcVar;
        apmg apmgVar = this.a;
        bvrj.UI_THREAD.c();
        if (i >= 200 && i < 300) {
            drtcVar = drtc.OK;
        } else if (i == 401) {
            drtcVar = drtc.UNAUTHENTICATED;
        } else if (i == 403) {
            drtcVar = drtc.PERMISSION_DENIED;
        } else if (i == 404) {
            drtcVar = drtc.NOT_FOUND;
        } else if (i == 429) {
            drtcVar = drtc.RESOURCE_EXHAUSTED;
        } else if (i >= 400 && i < 500) {
            drtcVar = drtc.INTERNAL;
        } else if (i < 500 || i >= 600) {
            drtcVar = drtc.UNKNOWN;
        } else {
            drtcVar = drtc.UNAVAILABLE;
        }
        if (apmgVar.ag.getEnableFeatureParameters().br && drtcVar == drtc.PERMISSION_DENIED && !apmgVar.aq) {
            dehn<?> dehnVar = apmgVar.as;
            dbsk.s(dehnVar);
            if (dehnVar.cancel(false)) {
                apmgVar.aq = true;
                apmgVar.i();
                return;
            }
        }
        ddyf bZ = ddyq.K.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyq ddyqVar = (ddyq) bZ.b;
        ddyqVar.A = drtcVar.s;
        int i2 = ddyqVar.b | 8;
        ddyqVar.b = i2;
        ddyqVar.b = i2 | 64;
        ddyqVar.D = i;
        apmgVar.aJ(bZ.bK());
    }
}
