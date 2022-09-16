package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: agee  reason: default package */
/* loaded from: classes.dex */
public final class agee {
    public static aged a(Intent intent) {
        return b(intent.getExtras());
    }

    public static aged b(Bundle bundle) {
        if (bundle == null) {
            return aged.a("", -666);
        }
        return aged.b(zgh.h(bundle.getString("notification_tag")), bundle.getInt("notification_id", -666), zgh.h(bundle.getString("client_id")));
    }

    public static ampq c(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        Notification notification = statusBarNotification.getNotification();
        if (notification != null && (bundle = notification.extras) != null) {
            return ampq.i(bundle.getString("client_id"));
        }
        return amon.a;
    }

    public static void d(fi fiVar, aged agedVar) {
        String str = agedVar.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("client_id", str);
        Bundle bundle2 = fiVar.y;
        if (bundle2 == null) {
            fiVar.y = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    public static void e(Intent intent, aged agedVar) {
        intent.putExtra("notification_tag", agedVar.a);
        intent.putExtra("notification_id", agedVar.b);
        intent.putExtra("client_id", agedVar.c);
    }

    public static void f(Intent intent, apzg apzgVar) {
        if (apzgVar == null) {
            return;
        }
        intent.putExtra("service_endpoint", apzgVar.toByteArray());
    }

    public static String g(Intent intent) {
        if (intent.getExtras() == null || !intent.hasExtra("push_notification_clientstreamz_logging")) {
            return null;
        }
        return intent.getStringExtra("push_notification_clientstreamz_logging");
    }
}
