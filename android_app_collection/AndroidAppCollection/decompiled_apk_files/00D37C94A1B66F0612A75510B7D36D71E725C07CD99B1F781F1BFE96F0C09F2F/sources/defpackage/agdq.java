package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: agdq  reason: default package */
/* loaded from: classes.dex */
public final class agdq implements ageb {
    private final Context a;

    public agdq(Context context) {
        this.a = context;
    }

    private static void b(fi fiVar) {
        fiVar.G = 1;
    }

    @Override // defpackage.ageb
    public final void a(apgq apgqVar, acti actiVar, aged agedVar, fi fiVar) {
        if (Build.VERSION.SDK_INT >= 26 && apgqVar != null) {
            apgm apgmVar = apgqVar.e;
            if (apgmVar == null) {
                apgmVar = apgm.a;
            }
            int az = akel.az(apgmVar.s);
            if (az == 0) {
                az = 1;
            }
            if (az != 1) {
                String num = Integer.toString(az - 1);
                if (((NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(num) != null) {
                    fiVar.E = num;
                    if (!apgmVar.q) {
                        return;
                    }
                    b(fiVar);
                    return;
                }
            }
            yhr.g(fiVar);
            if (apgmVar.n) {
                return;
            }
            b(fiVar);
        }
    }
}
