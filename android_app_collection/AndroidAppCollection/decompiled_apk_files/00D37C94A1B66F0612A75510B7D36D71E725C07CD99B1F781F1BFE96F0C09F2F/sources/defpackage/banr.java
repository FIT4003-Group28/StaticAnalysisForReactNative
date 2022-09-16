package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import org.webrtc.NetworkChangeDetector$IPAddress;
import org.webrtc.NetworkChangeDetector$NetworkInformation;
/* compiled from: PG */
/* renamed from: banr  reason: default package */
/* loaded from: classes2.dex */
public final class banr {
    public final ConnectivityManager a;

    banr() {
        this.a = null;
    }

    private static final bans e(NetworkInfo networkInfo) {
        return (networkInfo == null || !networkInfo.isConnected()) ? new bans(false, -1, -1, -1, -1) : new bans(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
    }

    public final NetworkChangeDetector$NetworkInformation a(Network network) {
        ConnectivityManager connectivityManager;
        bans e;
        bans bansVar;
        NetworkInfo activeNetworkInfo;
        NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation = null;
        if (network != null && (connectivityManager = this.a) != null) {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                String valueOf = String.valueOf(network.toString());
                Logging.d("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "Detected unknown network: ".concat(valueOf) : new String("Detected unknown network: "));
                return null;
            } else if (linkProperties.getInterfaceName() != null) {
                ConnectivityManager connectivityManager2 = this.a;
                if (connectivityManager2 == null) {
                    e = new bans(false, -1, -1, -1, -1);
                } else {
                    NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network);
                    if (networkInfo == null) {
                        String valueOf2 = String.valueOf(network.toString());
                        Logging.d("NetworkMonitorAutoDetect", valueOf2.length() != 0 ? "Couldn't retrieve information from network ".concat(valueOf2) : new String("Couldn't retrieve information from network "));
                        e = new bans(false, -1, -1, -1, -1);
                    } else if (networkInfo.getType() != 17) {
                        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
                        if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                            e = e(networkInfo);
                        } else {
                            bansVar = new bans(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                            e = bansVar;
                        }
                    } else if (networkInfo.getType() == 17) {
                        if (Build.VERSION.SDK_INT < 23 || !network.equals(this.a.getActiveNetwork()) || (activeNetworkInfo = this.a.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                            bansVar = new bans(networkInfo.isConnected(), 17, -1, -1, -1);
                            e = bansVar;
                        } else {
                            e = new bans(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                        }
                    } else {
                        e = e(networkInfo);
                    }
                }
                NetworkChangeDetector$ConnectionType b = banx.b(e);
                if (b == NetworkChangeDetector$ConnectionType.CONNECTION_NONE) {
                    String network2 = network.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
                    sb.append("Network ");
                    sb.append(network2);
                    sb.append(" is disconnected");
                    Logging.a("NetworkMonitorAutoDetect", sb.toString());
                    return null;
                }
                if (b == NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN || b == NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    String network3 = network.toString();
                    String valueOf3 = String.valueOf(b);
                    int i = e.b;
                    int i2 = e.c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(network3).length() + 84 + String.valueOf(valueOf3).length());
                    sb2.append("Network ");
                    sb2.append(network3);
                    sb2.append(" connection type is ");
                    sb2.append(valueOf3);
                    sb2.append(" because it has type ");
                    sb2.append(i);
                    sb2.append(" and subtype ");
                    sb2.append(i2);
                    Logging.a("NetworkMonitorAutoDetect", sb2.toString());
                }
                NetworkChangeDetector$ConnectionType c = e.b != 17 ? NetworkChangeDetector$ConnectionType.CONNECTION_NONE : banx.c(e.a, e.d, e.e);
                String interfaceName = linkProperties.getInterfaceName();
                long a = banx.a(network);
                NetworkChangeDetector$IPAddress[] networkChangeDetector$IPAddressArr = new NetworkChangeDetector$IPAddress[linkProperties.getLinkAddresses().size()];
                int i3 = 0;
                for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                    networkChangeDetector$IPAddressArr[i3] = new NetworkChangeDetector$IPAddress(linkAddress.getAddress().getAddress());
                    i3++;
                }
                networkChangeDetector$NetworkInformation = new NetworkChangeDetector$NetworkInformation(interfaceName, b, c, a, networkChangeDetector$IPAddressArr);
            } else {
                String valueOf4 = String.valueOf(network.toString());
                Logging.d("NetworkMonitorAutoDetect", valueOf4.length() != 0 ? "Null interface name for network ".concat(valueOf4) : new String("Null interface name for network "));
                return null;
            }
        }
        return networkChangeDetector$NetworkInformation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bans b() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return new bans(false, -1, -1, -1, -1);
        }
        return e(connectivityManager.getActiveNetworkInfo());
    }

    public final void c(ConnectivityManager.NetworkCallback networkCallback) {
        if (d()) {
            Logging.a("NetworkMonitorAutoDetect", "Unregister network callback");
            this.a.unregisterNetworkCallback(networkCallback);
        }
    }

    public final boolean d() {
        return this.a != null;
    }

    public banr(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
