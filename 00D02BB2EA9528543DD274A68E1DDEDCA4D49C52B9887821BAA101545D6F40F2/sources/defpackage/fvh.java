package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.notification.log.NotificationLoggingReceiver;
/* compiled from: PG */
/* renamed from: fvh  reason: default package */
/* loaded from: classes6.dex */
final class fvh implements dxis {
    final /* synthetic */ fyu a;

    public fvh(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ausf ausfVar;
        NotificationLoggingReceiver notificationLoggingReceiver = (NotificationLoggingReceiver) obj;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        notificationLoggingReceiver.a = tn;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        notificationLoggingReceiver.b = rU;
        notificationLoggingReceiver.c = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        notificationLoggingReceiver.d = e;
        fyu fyuVar = this.a;
        Object obj2 = fyuVar.ee;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                ausfVar = fyuVar.ee;
                if (ausfVar instanceof dxjf) {
                    pbj bw = fyuVar.bw();
                    bvrb tn2 = fyuVar.a.tn();
                    dxjg.e(tn2);
                    Application a = fyuVar.a.a();
                    dxjg.e(a);
                    ausf ausfVar2 = new ausf(a, fyuVar.aR(), fyuVar.aO(), fyuVar.aU());
                    ault aM = fyuVar.aM();
                    fyuVar.ay();
                    cqat rR = fyuVar.a.rR();
                    dxjg.e(rR);
                    ausfVar = bw != null ? new aull(tn2, bw.o(), ausfVar2, aM, rR) : ausfVar2;
                    dxjc.d(fyuVar.ee, ausfVar);
                    fyuVar.ee = ausfVar;
                }
            }
            obj2 = ausfVar;
        }
        notificationLoggingReceiver.e = (ausp) obj2;
    }
}
