package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.f0;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b0 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f9440g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f9441h;
    private static Boolean i;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9442b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f9443c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager.WakeLock f9444d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f9445e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9446f;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private b0 f9447a;

        public a(b0 b0Var) {
            this.f9447a = b0Var;
        }

        public void a() {
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            b0.this.f9442b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (this.f9447a == null) {
                return;
            }
            if (!this.f9447a.b()) {
                return;
            }
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f9447a.f9445e.a(this.f9447a, 0L);
            context.unregisterReceiver(this);
            this.f9447a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(a0 a0Var, Context context, f0 f0Var, long j) {
        this.f9445e = a0Var;
        this.f9442b = context;
        this.f9446f = j;
        this.f9443c = f0Var;
        this.f9444d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    private static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f9440g) {
            Boolean valueOf = Boolean.valueOf(i == null ? a(context, "android.permission.ACCESS_NETWORK_STATE", i) : i.booleanValue());
            i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean a(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", a(str));
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9442b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private static boolean b(Context context) {
        boolean booleanValue;
        synchronized (f9440g) {
            Boolean valueOf = Boolean.valueOf(f9441h == null ? a(context, "android.permission.WAKE_LOCK", f9441h) : f9441h.booleanValue());
            f9441h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (b(this.f9442b)) {
            this.f9444d.acquire(b.f9439a);
        }
        try {
            try {
                this.f9445e.a(true);
                if (!this.f9443c.e()) {
                    this.f9445e.a(false);
                    if (!b(this.f9442b)) {
                        return;
                    }
                    try {
                        this.f9444d.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                } else if (a(this.f9442b) && !b()) {
                    new a(this).a();
                    if (!b(this.f9442b)) {
                        return;
                    }
                    try {
                        this.f9444d.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                } else {
                    if (this.f9445e.d()) {
                        this.f9445e.a(false);
                    } else {
                        this.f9445e.a(this.f9446f);
                    }
                    if (!b(this.f9442b)) {
                        return;
                    }
                    try {
                        this.f9444d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f9445e.a(false);
                if (!b(this.f9442b)) {
                    return;
                }
                try {
                    this.f9444d.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (b(this.f9442b)) {
                try {
                    this.f9444d.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
