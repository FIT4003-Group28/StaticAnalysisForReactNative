package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
/* loaded from: classes.dex */
public class b extends c {
    private final C0195b i;

    /* renamed from: com.reactnativecommunity.netinfo.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0195b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9771a;

        private C0195b() {
            this.f9771a = false;
        }

        public void a(boolean z) {
            this.f9771a = z;
        }

        public boolean a() {
            return this.f9771a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            b.this.e();
        }
    }

    public b(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.i = new C0195b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void e() {
        NetworkInfo activeNetworkInfo;
        com.reactnativecommunity.netinfo.g.b bVar = com.reactnativecommunity.netinfo.g.b.UNKNOWN;
        com.reactnativecommunity.netinfo.g.a aVar = null;
        boolean z = false;
        try {
            activeNetworkInfo = a().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            bVar = com.reactnativecommunity.netinfo.g.b.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    bVar = com.reactnativecommunity.netinfo.g.b.WIFI;
                } else if (type != 4) {
                    if (type == 9) {
                        bVar = com.reactnativecommunity.netinfo.g.b.ETHERNET;
                    } else if (type == 17) {
                        bVar = com.reactnativecommunity.netinfo.g.b.VPN;
                    } else if (type == 6) {
                        bVar = com.reactnativecommunity.netinfo.g.b.WIMAX;
                    } else if (type == 7) {
                        bVar = com.reactnativecommunity.netinfo.g.b.BLUETOOTH;
                    }
                }
                a(bVar, aVar, z);
            }
            bVar = com.reactnativecommunity.netinfo.g.b.CELLULAR;
            aVar = com.reactnativecommunity.netinfo.g.a.a(activeNetworkInfo);
            a(bVar, aVar, z);
        }
        bVar = com.reactnativecommunity.netinfo.g.b.NONE;
        a(bVar, aVar, z);
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b().registerReceiver(this.i, intentFilter);
        this.i.a(true);
        e();
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void d() {
        if (this.i.a()) {
            b().unregisterReceiver(this.i);
            this.i.a(false);
        }
    }
}
