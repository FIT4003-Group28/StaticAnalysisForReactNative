package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: e  reason: collision with root package name */
    private static q0 f9272e;

    /* renamed from: a  reason: collision with root package name */
    private String f9273a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f9274b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f9275c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f9276d = new ArrayDeque();

    private q0() {
    }

    private static Intent a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static Intent a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            return (Intent) parcelableExtra;
        }
        return null;
    }

    private int b(Context context, Intent intent) {
        ComponentName startService;
        String c2 = c(context, intent);
        if (c2 != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(c2);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), c2);
        }
        try {
            if (b(context)) {
                startService = t0.a(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        } catch (SecurityException e3) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e3);
            return 401;
        }
    }

    public static synchronized q0 b() {
        q0 q0Var;
        synchronized (q0.class) {
            if (f9272e == null) {
                f9272e = new q0();
            }
            q0Var = f9272e;
        }
        return q0Var;
    }

    private synchronized String c(Context context, Intent intent) {
        String str;
        if (this.f9273a != null) {
            return this.f9273a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    str = serviceInfo.name;
                }
                this.f9273a = str;
                return this.f9273a;
            }
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            Log.e("FirebaseInstanceId", sb.toString());
            return null;
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public static void d(Context context, Intent intent) {
        context.sendBroadcast(a(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    public int a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f9276d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return b(context, intent2);
    }

    public Intent a() {
        return this.f9276d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Context context) {
        if (this.f9275c == null) {
            this.f9275c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f9274b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9275c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Context context) {
        if (this.f9274b == null) {
            this.f9274b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f9274b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9274b.booleanValue();
    }
}
