package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;
/* compiled from: PG */
/* renamed from: bade  reason: default package */
/* loaded from: classes2.dex */
public final class bade implements Runnable {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public bade(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        z = this.a.mRegistered;
        if (!z) {
            return;
        }
        z2 = this.a.mIgnoreNextBroadcast;
        if (z2) {
            this.a.mIgnoreNextBroadcast = false;
        } else {
            this.a.connectionTypeChanged();
        }
    }
}
