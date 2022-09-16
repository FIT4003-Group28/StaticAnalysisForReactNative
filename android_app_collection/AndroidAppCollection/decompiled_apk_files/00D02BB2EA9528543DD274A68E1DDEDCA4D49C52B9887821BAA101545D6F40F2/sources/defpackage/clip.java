package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: clip  reason: default package */
/* loaded from: classes5.dex */
public final class clip implements clja {
    public final Context a;
    public final ScheduledExecutorService b;
    public final long c;
    private final ConnectivityManager d;

    public clip(Context context, ScheduledExecutorService scheduledExecutorService, long j) {
        if (akm.d(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            this.a = context;
            this.b = scheduledExecutorService;
            ConnectivityManager connectivityManager = (ConnectivityManager) akm.g(context, ConnectivityManager.class);
            dbsk.s(connectivityManager);
            this.d = connectivityManager;
            this.c = 10000L;
            return;
        }
        throw new IllegalStateException("AndroidConnectivityHandler requires the ACCESS_NETWORK_STATE permission.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cf, code lost:
        if (r0 == 6) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.cljr r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clip.a(cljr):boolean");
    }
}
