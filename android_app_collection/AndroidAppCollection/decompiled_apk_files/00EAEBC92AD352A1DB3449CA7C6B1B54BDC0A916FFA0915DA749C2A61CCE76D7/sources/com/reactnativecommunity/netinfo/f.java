package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(24)
/* loaded from: classes.dex */
public class f extends c {
    private final b i;
    Network j;
    NetworkCapabilities k;

    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        private b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = fVar.a().getNetworkCapabilities(network);
            f.this.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = networkCapabilities;
            fVar.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            f fVar = f.this;
            if (fVar.j != null) {
                fVar.j = network;
                fVar.k = fVar.a().getNetworkCapabilities(network);
            }
            f.this.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = fVar.a().getNetworkCapabilities(network);
            f.this.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f fVar = f.this;
            fVar.j = null;
            fVar.k = null;
            fVar.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            f fVar = f.this;
            fVar.j = null;
            fVar.k = null;
            fVar.e();
        }
    }

    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.j = null;
        this.k = null;
        this.i = new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.c
    @SuppressLint({"MissingPermission"})
    public void c() {
        try {
            a().registerDefaultNetworkCallback(this.i);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.c
    public void d() {
        try {
            a().unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    void e() {
        com.reactnativecommunity.netinfo.g.b bVar = com.reactnativecommunity.netinfo.g.b.UNKNOWN;
        NetworkCapabilities networkCapabilities = this.k;
        com.reactnativecommunity.netinfo.g.a aVar = null;
        boolean z = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = com.reactnativecommunity.netinfo.g.b.BLUETOOTH;
            } else if (this.k.hasTransport(0)) {
                bVar = com.reactnativecommunity.netinfo.g.b.CELLULAR;
            } else if (this.k.hasTransport(3)) {
                bVar = com.reactnativecommunity.netinfo.g.b.ETHERNET;
            } else if (this.k.hasTransport(1)) {
                bVar = com.reactnativecommunity.netinfo.g.b.WIFI;
            } else if (this.k.hasTransport(4)) {
                bVar = com.reactnativecommunity.netinfo.g.b.VPN;
            }
            NetworkInfo networkInfo = this.j != null ? a().getNetworkInfo(this.j) : null;
            boolean z2 = Build.VERSION.SDK_INT >= 28 ? !this.k.hasCapability(21) : (this.j == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            if (this.k.hasCapability(12) && this.k.hasCapability(16) && !z2) {
                z = true;
            }
            if (this.j != null && bVar == com.reactnativecommunity.netinfo.g.b.CELLULAR && z) {
                aVar = com.reactnativecommunity.netinfo.g.a.a(networkInfo);
            }
        } else {
            bVar = com.reactnativecommunity.netinfo.g.b.NONE;
        }
        a(bVar, aVar, z);
    }
}
