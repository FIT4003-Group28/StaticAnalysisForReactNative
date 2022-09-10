package defpackage;

import com.google.android.apps.gmm.cloudmessage.chime.GmmChimeTaskService;
/* compiled from: PG */
/* renamed from: ftv  reason: default package */
/* loaded from: classes6.dex */
final class ftv implements dxis {
    final /* synthetic */ fyu a;

    public ftv(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        GmmChimeTaskService gmmChimeTaskService = (GmmChimeTaskService) obj;
        fyu fyuVar = this.a;
        Object obj3 = fyuVar.eD;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fyuVar.eD;
                if (obj2 instanceof dxjf) {
                    pbj bw = fyuVar.bw();
                    obj2 = bw != null ? bw.t() : null;
                    dxjc.d(fyuVar.eD, obj2);
                    fyuVar.eD = obj2;
                }
            }
            obj3 = obj2;
        }
        gmmChimeTaskService.d = (pbp) obj3;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        gmmChimeTaskService.a = rU;
        gmmChimeTaskService.b = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        gmmChimeTaskService.c = e;
    }
}
