package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnectionFactory;
/* compiled from: PG */
/* renamed from: banx  reason: default package */
/* loaded from: classes2.dex */
public final class banx extends BroadcastReceiver implements bann {
    public final Context a;
    public final ConnectivityManager.NetworkCallback b;
    public final ConnectivityManager.NetworkCallback c;
    public final banr d;
    public banv e;
    public boolean f;
    public final bano g;
    private final IntentFilter h;
    private final banw i;
    private NetworkChangeDetector$ConnectionType j;
    private String k;

    public banx(bano banoVar, Context context) {
        this.g = banoVar;
        this.a = context;
        banr banrVar = new banr(context);
        this.d = banrVar;
        this.i = new banw(context);
        bans b = banrVar.b();
        this.j = b(b);
        this.k = e(b);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.h = intentFilter;
        if (PeerConnectionFactory.a("IncludeWifiDirect").equals("Enabled")) {
            this.e = new banv(banoVar, context);
        }
        if (!this.f) {
            this.f = true;
            context.registerReceiver(this, intentFilter);
        }
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (!banrVar.d()) {
            this.b = null;
            this.c = null;
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
        try {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            banrVar.a.requestNetwork(builder.build(), networkCallback2);
            networkCallback = networkCallback2;
        } catch (SecurityException unused) {
            Logging.d("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
        }
        this.b = networkCallback;
        bant bantVar = new bant(this);
        this.c = bantVar;
        this.d.a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bantVar);
    }

    public static long a(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return Integer.parseInt(network.toString());
    }

    public static NetworkChangeDetector$ConnectionType b(bans bansVar) {
        return c(bansVar.a, bansVar.b, bansVar.c);
    }

    public static NetworkChangeDetector$ConnectionType c(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_4G;
                case 19:
                default:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_5G;
            }
        } else if (i == 1) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_WIFI;
        } else {
            if (i == 6) {
                return NetworkChangeDetector$ConnectionType.CONNECTION_4G;
            }
            if (i == 7) {
                return NetworkChangeDetector$ConnectionType.CONNECTION_BLUETOOTH;
            }
            if (i == 9) {
                return NetworkChangeDetector$ConnectionType.CONNECTION_ETHERNET;
            }
            if (i == 17) {
                return NetworkChangeDetector$ConnectionType.CONNECTION_VPN;
            }
            return NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN;
        }
    }

    private final String e(bans bansVar) {
        Intent registerReceiver;
        WifiInfo wifiInfo;
        String ssid;
        return (b(bansVar) != NetworkChangeDetector$ConnectionType.CONNECTION_WIFI || (registerReceiver = this.i.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"))) == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
    }

    public final bans d() {
        return this.d.b();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bans d = d();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkChangeDetector$ConnectionType b = b(d);
            String e = e(d);
            if (b == this.j && e.equals(this.k)) {
                return;
            }
            this.j = b;
            this.k = e;
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Network connectivity changed, type is: ");
            sb.append(valueOf);
            Logging.a("NetworkMonitorAutoDetect", sb.toString());
            NetworkMonitor networkMonitor = this.g.a;
            networkMonitor.a = b;
            networkMonitor.b();
        }
    }
}
