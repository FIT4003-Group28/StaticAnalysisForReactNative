package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cdw  reason: default package */
/* loaded from: classes2.dex */
public final class cdw implements ServiceConnection {
    public final Object a = new Object();
    public boolean b = false;
    public cdx c;
    final /* synthetic */ cdp d;

    public cdw(cdp cdpVar, cdx cdxVar) {
        this.d = cdpVar;
        this.c = cdxVar;
    }

    public final void a(ced cedVar) {
        synchronized (this.a) {
            cdx cdxVar = this.c;
            if (cdxVar != null) {
                cdxVar.a(cedVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cep cepVar;
        ced cedVar;
        int i = ceh.a;
        cdp cdpVar = this.d;
        if (iBinder == null) {
            cepVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof cep) {
                cepVar = (cep) queryLocalInterface;
            } else {
                cepVar = new cep(iBinder);
            }
        }
        cdpVar.p = cepVar;
        if (this.d.b(new Callable() { // from class: cdv
            /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cdv.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: cdu
            @Override // java.lang.Runnable
            public final void run() {
                cdw cdwVar = cdw.this;
                cdwVar.d.a = 0;
                cdwVar.d.p = null;
                cdwVar.a(cee.i);
            }
        }, Looper.myLooper() == null ? this.d.c : new Handler(Looper.myLooper())) == null) {
            cdp cdpVar2 = this.d;
            if (cdpVar2.a == 0 || cdpVar2.a == 3) {
                cedVar = cee.h;
            } else {
                cedVar = cee.f;
            }
            a(cedVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ceh.e("BillingClient", "Billing service disconnected.");
        this.d.p = null;
        this.d.a = 0;
        synchronized (this.a) {
            cdx cdxVar = this.c;
            if (cdxVar != null) {
                zep.h(ybq.a, "Play billing client disconnected");
                ((ybq) cdxVar).h();
            }
        }
    }
}
