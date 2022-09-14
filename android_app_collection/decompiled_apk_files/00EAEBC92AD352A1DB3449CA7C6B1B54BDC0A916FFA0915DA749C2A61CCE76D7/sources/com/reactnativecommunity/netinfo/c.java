package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;
/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f9773a;

    /* renamed from: b  reason: collision with root package name */
    private final WifiManager f9774b;

    /* renamed from: c  reason: collision with root package name */
    private final TelephonyManager f9775c;

    /* renamed from: d  reason: collision with root package name */
    private final ReactApplicationContext f9776d;

    /* renamed from: e  reason: collision with root package name */
    private com.reactnativecommunity.netinfo.g.b f9777e = com.reactnativecommunity.netinfo.g.b.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    private com.reactnativecommunity.netinfo.g.a f9778f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9779g = false;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f9780h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ReactApplicationContext reactApplicationContext) {
        this.f9776d = reactApplicationContext;
        this.f9773a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f9774b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f9775c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    private WritableMap a(String str) {
        WritableMap createMap = Arguments.createMap();
        if (e.a(b())) {
            createMap.putBoolean("isWifiEnabled", this.f9774b.isWifiEnabled());
        }
        createMap.putString("type", str != null ? str : this.f9777e.f9793b);
        boolean z = true;
        boolean z2 = !this.f9777e.equals(com.reactnativecommunity.netinfo.g.b.NONE) && !this.f9777e.equals(com.reactnativecommunity.netinfo.g.b.UNKNOWN);
        createMap.putBoolean("isConnected", z2);
        if (!this.f9779g || (str != null && !str.equals(this.f9777e.f9793b))) {
            z = false;
        }
        createMap.putBoolean("isInternetReachable", z);
        if (str == null) {
            str = this.f9777e.f9793b;
        }
        WritableMap b2 = b(str);
        if (z2) {
            b2.putBoolean("isConnectionExpensive", a.g.i.a.a(a()));
        }
        createMap.putMap("details", b2);
        return createMap;
    }

    private WritableMap b(String str) {
        char c2;
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        int hashCode = str.hashCode();
        if (hashCode != -916596374) {
            if (hashCode == 3649301 && str.equals("wifi")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("cellular")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            com.reactnativecommunity.netinfo.g.a aVar = this.f9778f;
            if (aVar != null) {
                createMap.putString("cellularGeneration", aVar.f9786b);
            }
            String networkOperatorName = this.f9775c.getNetworkOperatorName();
            if (networkOperatorName != null) {
                createMap.putString("carrier", networkOperatorName);
            }
        } else if (c2 == 1 && e.a(b()) && (connectionInfo = this.f9774b.getConnectionInfo()) != null) {
            try {
                String ssid = connectionInfo.getSSID();
                if (ssid != null && !ssid.contains("<unknown ssid>")) {
                    createMap.putString("ssid", ssid.replace("\"", ""));
                }
            } catch (Exception unused) {
            }
            try {
                String bssid = connectionInfo.getBSSID();
                if (bssid != null) {
                    createMap.putString("bssid", bssid);
                }
            } catch (Exception unused2) {
            }
            try {
                createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
            } catch (Exception unused3) {
            }
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    createMap.putInt("frequency", connectionInfo.getFrequency());
                }
            } catch (Exception unused4) {
            }
            try {
                byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                e.a(byteArray);
                createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
            } catch (Exception unused5) {
            }
            try {
                byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                e.a(byteArray2);
                int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                createMap.putString("subnet", String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
            } catch (Exception unused6) {
            }
        }
        return createMap;
    }

    private void e() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) b().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a((String) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectivityManager a() {
        return this.f9773a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.reactnativecommunity.netinfo.g.b bVar, com.reactnativecommunity.netinfo.g.a aVar, boolean z) {
        Boolean bool = this.f9780h;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = true;
        boolean z3 = bVar != this.f9777e;
        boolean z4 = aVar != this.f9778f;
        if (z == this.f9779g) {
            z2 = false;
        }
        if (z3 || z4 || z2) {
            this.f9777e = bVar;
            this.f9778f = aVar;
            this.f9779g = z;
            e();
        }
    }

    public void a(String str, Promise promise) {
        promise.resolve(a(str));
    }

    public void a(boolean z) {
        this.f9780h = Boolean.valueOf(z);
        a(this.f9777e, this.f9778f, this.f9779g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactApplicationContext b() {
        return this.f9776d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();
}
