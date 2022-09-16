package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$NetworkInformation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bant  reason: default package */
/* loaded from: classes2.dex */
public final class bant extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ banx a;

    public bant(banx banxVar) {
        this.a = banxVar;
    }

    private final void a(Network network) {
        NetworkChangeDetector$NetworkInformation a = this.a.d.a(network);
        if (a != null) {
            this.a.g.a(a);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        String valueOf = String.valueOf(network.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "Network becomes available: ".concat(valueOf) : new String("Network becomes available: "));
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String valueOf = String.valueOf(networkCapabilities.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "capabilities changed: ".concat(valueOf) : new String("capabilities changed: "));
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        Logging.a("NetworkMonitorAutoDetect", "link properties changed");
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 42);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is about to lose in ");
        sb.append(i);
        sb.append("ms");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is disconnected");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
        this.a.g.b(banx.a(network));
    }
}
