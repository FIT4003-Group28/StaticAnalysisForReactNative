package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bufm  reason: default package */
/* loaded from: classes4.dex */
public final class bufm implements bugq {
    public final ConnectivityManager a;
    public long c;
    public final cqat d;
    private final bugi f;
    public ConnectivityManager.NetworkCallback b = null;
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();

    public bufm(ConnectivityManager connectivityManager, bugi bugiVar, cqat cqatVar) {
        this.a = connectivityManager;
        this.f = bugiVar;
        this.d = cqatVar;
    }

    @Override // defpackage.bugq
    public final boolean a() {
        return !btpc.n() && this.f.a.e();
    }

    public final void b() {
        this.e.schedule(new Runnable(this) { // from class: bufl
            private final bufm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bufm bufmVar = this.a;
                if (bufmVar.c - bufmVar.d.e() > 0) {
                    bufmVar.b();
                    return;
                }
                bufmVar.d.e();
                try {
                    ConnectivityManager.NetworkCallback networkCallback = bufmVar.b;
                    if (networkCallback != null) {
                        bufmVar.a.unregisterNetworkCallback(networkCallback);
                    }
                    bufmVar.b = null;
                } catch (RuntimeException e) {
                    e.getMessage();
                }
            }
        }, this.c - this.d.e(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.bugq
    public final void c() {
        this.e.execute(new Runnable(this) { // from class: bufk
            private final bufm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Network[] allNetworks;
                NetworkCapabilities networkCapabilities;
                bufm bufmVar = this.a;
                bufmVar.c = bufmVar.d.e() + 30000;
                if (bufmVar.b != null) {
                    return;
                }
                bufmVar.d.e();
                ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback();
                bufmVar.b = networkCallback;
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = bufmVar.a.getActiveNetwork();
                    if (activeNetwork != null && ((networkCapabilities = bufmVar.a.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(0))) {
                        bufmVar.a.reportNetworkConnectivity(activeNetwork, false);
                    }
                } else {
                    NetworkInfo activeNetworkInfo = bufmVar.a.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.getType() != 0) {
                        for (Network network : bufmVar.a.getAllNetworks()) {
                            if (activeNetworkInfo.equals(bufmVar.a.getNetworkInfo(network))) {
                                bufmVar.a.reportBadNetwork(network);
                                break;
                            }
                        }
                    }
                }
                try {
                    bufmVar.a.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), networkCallback);
                } catch (RuntimeException unused) {
                }
                bufmVar.b();
            }
        });
    }
}
