package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: delk  reason: default package */
/* loaded from: classes6.dex */
public final class delk implements delh {
    private static volatile delh b;
    final corz a;

    public delk(corz corzVar) {
        cnwc.a(corzVar);
        this.a = corzVar;
        new ConcurrentHashMap();
    }

    public static delh getInstance() {
        return getInstance(dela.getInstance());
    }

    @Override // defpackage.delh
    public final void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (delm.isOriginAllowed(str) && delm.isEventAllowedForLogging(str2, bundle) && delm.handleCampaignEventIfNeeded(str, str2, bundle)) {
            delm.updateEventParamsIfNeeded(str, str2, bundle);
            this.a.a.d(str, str2, bundle, true);
        }
    }

    @Override // defpackage.delh
    public final void b(Object obj) {
        if (delm.isOriginAllowed("fcm") && delm.isUserPropertyNameAllowed("fcm", "_ln")) {
            cosu cosuVar = this.a.a;
            cosuVar.a(new cosk(cosuVar, obj));
        }
    }

    public static delh getInstance(dela delaVar) {
        return (delh) delaVar.d(delh.class);
    }

    public static delh getInstance(dela delaVar, Context context, dera deraVar) {
        cnwc.a(delaVar);
        cnwc.a(context);
        cnwc.a(deraVar);
        cnwc.a(context.getApplicationContext());
        if (b == null) {
            synchronized (delk.class) {
                if (b == null) {
                    Bundle bundle = new Bundle(1);
                    if (delaVar.f()) {
                        deraVar.a(dekt.class, deli.a, delj.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", delaVar.e());
                    }
                    b = new delk(cosu.c(context, bundle).b);
                }
            }
        }
        return b;
    }
}
