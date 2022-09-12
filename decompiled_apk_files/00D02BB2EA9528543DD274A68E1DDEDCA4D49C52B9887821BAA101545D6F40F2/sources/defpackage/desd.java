package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: desd  reason: default package */
/* loaded from: classes6.dex */
public final class desd {
    private static desd d;
    private String e = null;
    public Boolean a = null;
    public Boolean b = null;
    public final Queue<Intent> c = new ArrayDeque();

    private desd() {
    }

    private static Intent c(Context context, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static PendingIntent createMessagingPendingIntent(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, c(context, intent), i2);
    }

    public static synchronized desd getInstance() {
        desd desdVar;
        synchronized (desd.class) {
            if (d == null) {
                d = new desd();
            }
            desdVar = d;
        }
        return desdVar;
    }

    public static void setForTesting(desd desdVar) {
        d = desdVar;
    }

    public static void startMessagingServiceViaReceiver(Context context, Intent intent) {
        context.sendBroadcast(c(context, intent));
    }

    public static Intent unwrapServiceIntent(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            return (Intent) parcelableExtra;
        }
        return null;
    }

    public final synchronized String a(Context context, Intent intent) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.e = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.e = serviceInfo.name;
                }
                return this.e;
            }
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            sb.toString();
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}
