package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badn  reason: default package */
/* loaded from: classes2.dex */
public final class badn extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;

    public badn(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }

    private final boolean a(Network network, NetworkCapabilities networkCapabilities) {
        if (!b(network)) {
            if (networkCapabilities == null) {
                networkCapabilities = this.b.mConnectivityManagerDelegate.c(network);
            }
            if (networkCapabilities == null) {
                return true;
            }
            if (!networkCapabilities.hasTransport(4)) {
                return false;
            }
            badg unused = this.b.mConnectivityManagerDelegate;
            return !badg.g(network);
        }
        return true;
    }

    private final boolean b(Network network) {
        Network network2 = this.a;
        return network2 != null && !network2.equals(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        NetworkCapabilities c = this.b.mConnectivityManagerDelegate.c(network);
        if (a(network, c)) {
            return;
        }
        boolean z = c.hasTransport(4) && ((network2 = this.a) == null || !network.equals(network2));
        if (z) {
            this.a = network;
        }
        this.b.runOnThread(new badi(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), this.b.mConnectivityManagerDelegate.a(network), z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (a(network, networkCapabilities)) {
            return;
        }
        this.b.runOnThread(new badj(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), this.b.mConnectivityManagerDelegate.a(network)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        if (a(network, null)) {
            return;
        }
        this.b.runOnThread(new badk(this, NetworkChangeNotifierAutoDetect.networkToNetId(network)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (b(network)) {
            return;
        }
        this.b.runOnThread(new badl(this, network));
        if (this.a == null) {
            return;
        }
        this.a = null;
        for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this.b.mConnectivityManagerDelegate, network)) {
            onAvailable(network2);
        }
        this.b.runOnThread(new badm(this, this.b.getCurrentNetworkState().getConnectionType()));
    }
}
