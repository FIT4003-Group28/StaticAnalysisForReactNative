package defpackage;

import org.webrtc.NetworkChangeDetector$NetworkInformation;
import org.webrtc.NetworkMonitor;
/* compiled from: PG */
/* renamed from: bano  reason: default package */
/* loaded from: classes2.dex */
public final class bano {
    final /* synthetic */ NetworkMonitor a;

    public bano(NetworkMonitor networkMonitor) {
        this.a = networkMonitor;
    }

    public final void a(NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation) {
        NetworkMonitor networkMonitor = this.a;
        for (Long l : networkMonitor.a()) {
            networkMonitor.nativeNotifyOfNetworkConnect(l.longValue(), networkChangeDetector$NetworkInformation);
        }
    }

    public final void b(long j) {
        NetworkMonitor networkMonitor = this.a;
        for (Long l : networkMonitor.a()) {
            networkMonitor.nativeNotifyOfNetworkDisconnect(l.longValue(), j);
        }
    }
}
