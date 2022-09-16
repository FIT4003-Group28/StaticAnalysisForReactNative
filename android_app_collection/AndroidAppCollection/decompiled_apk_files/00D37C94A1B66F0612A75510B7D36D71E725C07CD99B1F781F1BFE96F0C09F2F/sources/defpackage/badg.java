package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.net.Socket;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: badg  reason: default package */
/* loaded from: classes2.dex */
public final class badg {
    public final ConnectivityManager a;

    badg() {
        this.a = null;
    }

    public static final boolean g(Network network) {
        Socket socket = new Socket();
        try {
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                bach bachVar = new bach(null, vmPolicy);
                try {
                    network.bindSocket(socket);
                    bachVar.close();
                    try {
                        socket.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        bachVar.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                return false;
            }
        } catch (IOException unused4) {
            socket.close();
            return false;
        } catch (Throwable th2) {
            try {
                socket.close();
            } catch (IOException unused5) {
            }
            throw th2;
        }
    }

    public final int a(Network network) {
        NetworkInfo d = d(network);
        if (d == null || !d.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(d.getType(), d.getSubtype());
    }

    public final Network b() {
        Network network;
        Network[] allNetworksFiltered;
        if (Build.VERSION.SDK_INT >= 23) {
            network = this.a.getActiveNetwork();
            if (network != null) {
                return network;
            }
        } else {
            network = null;
        }
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
            NetworkInfo e = e(network2);
            if (e != null && (e.getType() == activeNetworkInfo.getType() || e.getType() == 17)) {
                network = network2;
            }
        }
        return network;
    }

    public final NetworkCapabilities c(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return this.a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public final NetworkInfo d(Network network) {
        NetworkInfo e = e(network);
        return (e == null || e.getType() != 17) ? e : this.a.getActiveNetworkInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final NetworkInfo e(Network network) {
        try {
            try {
                return this.a.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return null;
            }
        } catch (NullPointerException unused2) {
            return this.a.getNetworkInfo(network);
        }
    }

    public final void f(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    public badg(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
