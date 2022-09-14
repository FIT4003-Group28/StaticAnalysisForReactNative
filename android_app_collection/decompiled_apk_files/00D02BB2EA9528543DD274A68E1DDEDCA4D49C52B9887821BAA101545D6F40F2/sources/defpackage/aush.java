package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import com.google.android.apps.gmm.notification.log.NotificationLoggingActivity;
import com.google.android.apps.gmm.notification.log.NotificationLoggingReceiver;
import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
/* compiled from: PG */
/* renamed from: aush  reason: default package */
/* loaded from: classes2.dex */
public final class aush {
    public static PendingIntent a(Context context, NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent, NotificationLogger$IntentMetadata notificationLogger$IntentMetadata, @dzsi cjsh cjshVar, @dzsi cjtd cjtdVar, @dzsi ausn ausnVar, @dzsi pau pauVar, @dzsi ausg ausgVar, int i, int i2, @dzsi String str, boolean z) {
        Intent b = b(context, notificationIntentConverter$NotificationIntent, notificationLogger$IntentMetadata, cjshVar, cjtdVar, ausnVar, pauVar, ausgVar, i, i2, str, z);
        if (notificationIntentConverter$NotificationIntent.b() == auhw.ACTIVITY || notificationIntentConverter$NotificationIntent.b() == auhw.ACTIVITY_WITHOUT_TASK_AFFINITY) {
            b.setClass(context, notificationIntentConverter$NotificationIntent.b() == auhw.ACTIVITY ? NotificationLoggingActivity.class : NotificationLoggingActivity.NoTaskAffinityNotificationLoggingActivity.class);
            b.addFlags(268435456);
            return PendingIntent.getActivity(context, System.identityHashCode(notificationIntentConverter$NotificationIntent), b, 268435456);
        }
        return PendingIntent.getBroadcast(context, System.identityHashCode(notificationIntentConverter$NotificationIntent), b, 268435456);
    }

    public static Intent b(Context context, @dzsi NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent, NotificationLogger$IntentMetadata notificationLogger$IntentMetadata, @dzsi cjsh cjshVar, @dzsi cjtd cjtdVar, @dzsi ausn ausnVar, @dzsi pau pauVar, @dzsi ausg ausgVar, int i, int i2, @dzsi String str, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("notification.log", "", notificationIntentConverter$NotificationIntent != null ? Integer.toString(notificationIntentConverter$NotificationIntent.hashCode()) : ""));
        intent.setClass(context, NotificationLoggingReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_metadata", notificationLogger$IntentMetadata);
        if (notificationIntentConverter$NotificationIntent != null) {
            bundle.putParcelable("notification_intent", notificationIntentConverter$NotificationIntent);
        }
        intent.putExtra("extras_bundle", bundle);
        intent.putExtra("logging_id", i);
        if (cjtdVar != null) {
            intent.putExtra("logging", cjtdVar);
        }
        if (cjshVar != null) {
            intent.putExtra("logged_impression", cjshVar);
        }
        if (ausnVar != null) {
            intent.putExtra("backoff", ausnVar);
        }
        if (pauVar != null) {
            intent.putExtra("gcm_push_oid", pauVar.b);
            intent.putExtra("gcm_push_version", pauVar.c);
            intent.putExtra("server_notification_id", pauVar.d);
            int a = pam.a(pauVar.e);
            if (a == 0) {
                a = 1;
            }
            intent.putExtra("server_notification_delivery_source", a - 1);
        }
        if (ausgVar != null) {
            intent.putExtra("chime_thread_id", ausgVar.a);
            intent.putExtra("chime_account", ausgVar.b);
        }
        if (str != null) {
            intent.putExtra("logging_notification_tag", str);
        }
        intent.putExtra("logging_notification_id", i2);
        intent.putExtra("logging_dismiss_notification", z);
        return intent;
    }

    public static boolean c(Intent intent) {
        return "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && "notification.log".equals(intent.getData().getScheme());
    }

    @dzsi
    public static NotificationLogger$IntentMetadata d(Intent intent) {
        Bundle bundle;
        if (c(intent) && (bundle = (Bundle) intent.getParcelableExtra("extras_bundle")) != null) {
            return (NotificationLogger$IntentMetadata) bundle.getParcelable("intent_metadata");
        }
        return null;
    }
}
