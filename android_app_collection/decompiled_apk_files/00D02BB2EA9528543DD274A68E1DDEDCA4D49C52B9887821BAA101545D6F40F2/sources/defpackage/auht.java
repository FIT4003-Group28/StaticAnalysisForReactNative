package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.notification.api.intent.AutoValue_NotificationIntentConverter_NotificationIntent;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
/* compiled from: PG */
/* renamed from: auht  reason: default package */
/* loaded from: classes2.dex */
public final class auht extends auhy {
    public dbsg<Integer> a;
    public dbsg<String> b;
    public dbsg<String> c;
    public dbsg<String> d;
    private auhw e;
    private Intent f;

    public auht() {
        this.a = dbpy.a;
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
    }

    public auht(NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent) {
        this.a = dbpy.a;
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.a = notificationIntentConverter$NotificationIntent.a();
        this.e = notificationIntentConverter$NotificationIntent.b();
        this.f = notificationIntentConverter$NotificationIntent.c();
        this.b = notificationIntentConverter$NotificationIntent.d();
        this.c = notificationIntentConverter$NotificationIntent.e();
        this.d = notificationIntentConverter$NotificationIntent.f();
    }

    @Override // defpackage.auhy
    public final void b(Intent intent) {
        if (intent != null) {
            this.f = intent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    @Override // defpackage.auhy
    public final void c(auhw auhwVar) {
        if (auhwVar != null) {
            this.e = auhwVar;
            return;
        }
        throw new NullPointerException("Null intentType");
    }

    @Override // defpackage.auhy
    public final NotificationIntentConverter$NotificationIntent a() {
        String str = this.e == null ? " intentType" : "";
        if (this.f == null) {
            str = str.concat(" intent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_NotificationIntentConverter_NotificationIntent(this.a, this.e, this.f, this.b, this.c, this.d);
    }
}
