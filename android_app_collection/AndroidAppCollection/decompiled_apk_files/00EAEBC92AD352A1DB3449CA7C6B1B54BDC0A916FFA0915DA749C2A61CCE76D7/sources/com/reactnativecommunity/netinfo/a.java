package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private final Context f9762b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9763c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f9765e;

    /* renamed from: a  reason: collision with root package name */
    private final d f9761a = new d();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f9764d = new c();

    /* renamed from: f  reason: collision with root package name */
    private boolean f9766f = false;

    /* loaded from: classes.dex */
    public interface b {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!a.this.f9766f) {
                return;
            }
            a.this.f9762b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
            a.this.f9765e.postDelayed(a.this.f9764d, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        boolean f9768a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f9769b;

        private d() {
            this.f9768a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z = true;
            }
            Boolean bool = this.f9769b;
            if (bool == null || bool.booleanValue() != z) {
                this.f9769b = Boolean.valueOf(z);
                a.this.f9763c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, b bVar) {
        this.f9762b = context;
        this.f9763c = bVar;
    }

    private boolean c() {
        return Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.startsWith("AF") || Build.MODEL.startsWith("KF"));
    }

    private void d() {
        if (this.f9761a.f9768a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        this.f9762b.registerReceiver(this.f9761a, intentFilter);
        this.f9761a.f9768a = true;
    }

    private void e() {
        if (this.f9766f) {
            return;
        }
        this.f9765e = new Handler();
        this.f9766f = true;
        this.f9765e.post(this.f9764d);
    }

    private void f() {
        if (!this.f9766f) {
            return;
        }
        this.f9766f = false;
        this.f9765e.removeCallbacksAndMessages(null);
        this.f9765e = null;
    }

    private void g() {
        d dVar = this.f9761a;
        if (!dVar.f9768a) {
            return;
        }
        this.f9762b.unregisterReceiver(dVar);
        this.f9761a.f9768a = false;
    }

    public void a() {
        if (!c()) {
            return;
        }
        d();
        e();
    }

    public void b() {
        if (!c()) {
            return;
        }
        f();
        g();
    }
}
