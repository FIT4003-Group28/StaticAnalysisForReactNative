package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dnt  reason: default package */
/* loaded from: classes6.dex */
public final class dnt {
    static {
        TimeUnit.SECONDS.toMillis(5L);
    }

    public dnt(final Application application) {
        dzgj.a(dns.UNKNOWN);
        dbud.a(new dbty(application) { // from class: dnr
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return PendingIntent.getBroadcast(this.a, 0, new Intent("vehicle_activity_recognition"), 134217728);
            }
        });
    }
}
