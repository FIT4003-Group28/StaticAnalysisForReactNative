package defpackage;

import com.google.android.apps.gmm.ugc.clientnotification.phototaken.NotificationIntentProxyReceiver;
/* compiled from: PG */
/* renamed from: fvf  reason: default package */
/* loaded from: classes6.dex */
final class fvf implements dxis {
    final /* synthetic */ fyu a;

    public fvf(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        NotificationIntentProxyReceiver notificationIntentProxyReceiver = (NotificationIntentProxyReceiver) obj;
        fyu fyuVar = this.a;
        Object obj3 = fyuVar.ev;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fyuVar.ev;
                if (obj2 instanceof dxjf) {
                    bzwg aL = fyuVar.aL();
                    fyuVar.aH();
                    dxjg.e(fyuVar.a.rU());
                    dxjg.e(fyuVar.a.a());
                    obj2 = new bztc(aL);
                    dxjc.d(fyuVar.ev, obj2);
                    fyuVar.ev = obj2;
                }
            }
            obj3 = obj2;
        }
        notificationIntentProxyReceiver.b = (bztc) obj3;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        notificationIntentProxyReceiver.c = tn;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        notificationIntentProxyReceiver.d = rU;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        notificationIntentProxyReceiver.e = e;
    }
}
