package org.webrtc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkMonitor {
    private bann e;
    private final Object d = new Object();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private int f = 0;
    public volatile NetworkChangeDetector$ConnectionType a = NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN;

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static NetworkMonitor getInstance() {
        return banp.a;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector$NetworkInformation[] networkChangeDetector$NetworkInformationArr);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector$ConnectionType networkChangeDetector$ConnectionType, int i);

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.d) {
            bann bannVar = this.e;
            z = false;
            if (bannVar != null && ((banx) bannVar).d.d()) {
                z = true;
            }
        }
        return z;
    }

    private void startMonitoring(Context context, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List emptyList;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Start monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        synchronized (this.d) {
            this.f++;
            if (this.e == null) {
                this.e = new banx(new bano(this), context);
            }
            this.a = banx.b(((banx) this.e).d());
        }
        synchronized (this.b) {
            this.b.add(Long.valueOf(j));
        }
        synchronized (this.d) {
            bann bannVar = this.e;
            arrayList = null;
            if (bannVar != null) {
                banr banrVar = ((banx) bannVar).d;
                if (!banrVar.d()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    ConnectivityManager connectivityManager = banrVar.a;
                    for (Network network : connectivityManager == null ? new Network[0] : connectivityManager.getAllNetworks()) {
                        NetworkChangeDetector$NetworkInformation a = banrVar.a(network);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                }
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                    banv banvVar = ((banx) bannVar).e;
                    if (banvVar != null) {
                        NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation = banvVar.b;
                        if (networkChangeDetector$NetworkInformation != null) {
                            emptyList = Collections.singletonList(networkChangeDetector$NetworkInformation);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        arrayList.addAll(emptyList);
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() != 0) {
            nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector$NetworkInformation[]) arrayList.toArray(new NetworkChangeDetector$NetworkInformation[arrayList.size()]));
        }
        b();
    }

    private void stopMonitoring(long j) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("Stop monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        synchronized (this.d) {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                bann bannVar = this.e;
                ConnectivityManager.NetworkCallback networkCallback = ((banx) bannVar).c;
                if (networkCallback != null) {
                    ((banx) bannVar).d.c(networkCallback);
                }
                ConnectivityManager.NetworkCallback networkCallback2 = ((banx) bannVar).b;
                if (networkCallback2 != null) {
                    ((banx) bannVar).d.c(networkCallback2);
                }
                banv banvVar = ((banx) bannVar).e;
                if (banvVar != null) {
                    banvVar.a.unregisterReceiver(banvVar);
                }
                if (((banx) bannVar).f) {
                    ((banx) bannVar).f = false;
                    ((banx) bannVar).a.unregisterReceiver((BroadcastReceiver) bannVar);
                }
                this.e = null;
            }
        }
        synchronized (this.b) {
            this.b.remove(Long.valueOf(j));
        }
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public final void b() {
        ArrayList arrayList;
        for (Long l : a()) {
            nativeNotifyConnectionTypeChanged(l.longValue());
        }
        synchronized (this.c) {
            arrayList = new ArrayList(this.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((banq) arrayList.get(i)).a();
        }
    }

    public native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation);

    public native void nativeNotifyOfNetworkDisconnect(long j, long j2);
}
