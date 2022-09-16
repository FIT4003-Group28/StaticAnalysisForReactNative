package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
/* compiled from: PG */
/* renamed from: crt  reason: default package */
/* loaded from: classes3.dex */
public final class crt implements crr {
    boolean a;
    final cgf b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new crs(this);

    public crt(Context context, cgf cgfVar) {
        this.c = context.getApplicationContext();
        this.b = cgfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        hy.N(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // defpackage.cse
    public final void k() {
    }

    @Override // defpackage.cse
    public final void l() {
        if (this.d) {
            return;
        }
        this.a = a(this.c);
        try {
            this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        } catch (SecurityException e) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return;
            }
            Log.w("ConnectivityMonitor", "Failed to register", e);
        }
    }

    @Override // defpackage.cse
    public final void m() {
        if (!this.d) {
            return;
        }
        this.c.unregisterReceiver(this.e);
        this.d = false;
    }
}
