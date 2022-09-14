package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.transit.commute.TransitCommuteNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: byxy  reason: default package */
/* loaded from: classes4.dex */
public final class byxy {
    static final String a = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".DEPARTURE_DISMISS");
    static final String b = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".DISRUPTION_DISMISS");
    static final String c = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".ADVANCE_TO_STAGE");
    static final String d = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".SESSION_ID");
    static final String e = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".STAGE_TO_ADVANCE_TO");
    static final String f = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".REFRESH_PERIODIC");
    static final String g = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".REFRESH_ONCE");
    static final String h = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".EXTRA_REFRESH_ONCE_TIMESTAMP");
    static final String i = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".DEBUG_SHOW_POLLING_NOTIFICATION");
    public static final String j = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat(".RECEIVE_PAYLOAD");
    public static final String k = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat("EXTRA_PAYLOAD");
    public static final String l = String.valueOf(TransitCommuteNotificationBroadcastReceiver.class.getCanonicalName()).concat("EXTRA_OBFUSCATED_GAIA_ID");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Context context, String str) {
        return new Intent(context, TransitCommuteNotificationBroadcastReceiver.class).setAction(a).putExtra(d, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingIntent b(Context context, @dzsi String str) {
        Intent action = new Intent(context, TransitCommuteNotificationBroadcastReceiver.class).setAction(f);
        if (str != null) {
            action.putExtra(d, str);
        }
        return PendingIntent.getBroadcast(context, 0, action, 134217728);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingIntent c(Context context, @dzsi String str, long j2) {
        Intent action = new Intent(context, TransitCommuteNotificationBroadcastReceiver.class).setAction(g);
        if (str != null) {
            action.putExtra(d, str);
        }
        action.putExtra(h, j2);
        return PendingIntent.getBroadcast(context, 0, action, 134217728);
    }
}
