package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.r0;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final long f9291b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f9292c = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f9293d;

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private s0 f9294a;

        public a(s0 s0Var) {
            this.f9294a = s0Var;
        }

        public void a() {
            if (FirebaseInstanceId.p()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f9294a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s0 s0Var = this.f9294a;
            if (s0Var != null && s0Var.b()) {
                if (FirebaseInstanceId.p()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f9294a.f9293d.a(this.f9294a, 0L);
                this.f9294a.a().unregisterReceiver(this);
                this.f9294a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f9293d = firebaseInstanceId;
        this.f9291b = j;
        this.f9292c.setReferenceCounted(false);
    }

    private void a(String str) {
        if ("[DEFAULT]".equals(this.f9293d.d().c())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(this.f9293d.d().c());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            q0.d(a(), intent);
        }
    }

    Context a() {
        return this.f9293d.d().b();
    }

    boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean c() {
        String str;
        r0.a h2 = this.f9293d.h();
        if (!this.f9293d.a(h2)) {
            return true;
        }
        try {
            String a2 = this.f9293d.a();
            if (a2 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (h2 == null || (h2 != null && !a2.equals(h2.f9282a))) {
                a(a2);
            }
            return true;
        } catch (IOException e2) {
            if (s.a(e2.getMessage())) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
            } else if (e2.getMessage() != null) {
                throw e2;
            } else {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (q0.b().b(a())) {
            this.f9292c.acquire();
        }
        try {
            try {
                this.f9293d.b(true);
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f9293d.b(false);
                if (!q0.b().b(a())) {
                    return;
                }
            }
            if (!this.f9293d.j()) {
                this.f9293d.b(false);
                if (!q0.b().b(a())) {
                    return;
                }
                this.f9292c.release();
            } else if (q0.b().a(a()) && !b()) {
                new a(this).a();
                if (!q0.b().b(a())) {
                    return;
                }
                this.f9292c.release();
            } else {
                if (c()) {
                    this.f9293d.b(false);
                } else {
                    this.f9293d.a(this.f9291b);
                }
                if (!q0.b().b(a())) {
                    return;
                }
                this.f9292c.release();
            }
        } catch (Throwable th) {
            if (q0.b().b(a())) {
                this.f9292c.release();
            }
            throw th;
        }
    }
}
