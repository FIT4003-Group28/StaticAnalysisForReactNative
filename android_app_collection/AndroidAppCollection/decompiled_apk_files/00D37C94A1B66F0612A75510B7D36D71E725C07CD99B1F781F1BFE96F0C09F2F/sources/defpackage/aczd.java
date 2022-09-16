package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: aczd  reason: default package */
/* loaded from: classes.dex */
public final class aczd {
    public static final String a = zep.a("MDX.CastSdkVersionHelper");
    public final Context b;
    public final qrq c;

    public aczd(Context context, qrq qrqVar) {
        this.b = context;
        this.c = qrqVar;
    }

    public final void a(Activity activity) {
        rve rveVar;
        qrq qrqVar = this.c;
        qnm.g("makeGooglePlayServicesAvailable must be called from the main thread");
        int h = qrqVar.h(activity, 202100000);
        if (h == 0) {
            rveVar = rwd.c(null);
        } else {
            qux m = qve.m(activity);
            qve qveVar = (qve) m.b("GmsAvailabilityHelper", qve.class);
            if (qveVar != null) {
                if (qveVar.d.a.j()) {
                    qveVar.d = new rvh();
                }
            } else {
                qveVar = new qve(m);
            }
            qveVar.o(new ConnectionResult(h, null));
            rveVar = qveVar.d.a;
        }
        rveVar.n(aczc.a);
    }

    public final boolean b() {
        return this.c.h(this.b, 202100000) == 0;
    }
}
