package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bth  reason: default package */
/* loaded from: classes2.dex */
public final class bth extends bte {
    static final String f = bqf.b("NetworkStateTracker");
    public static final /* synthetic */ int g = 0;
    private final ConnectivityManager h;
    private btg i;
    private btf j;

    public bth(Context context, bwn bwnVar) {
        super(context, bwnVar);
        this.h = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (c()) {
            this.i = new btg(this);
        } else {
            this.j = new btf(this);
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bte
    /* renamed from: a */
    public final bsn b() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            } catch (SecurityException e) {
                bqf.a();
                bqf.e(f, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z = true;
                    boolean isActiveNetworkMetered = this.h.isActiveNetworkMetered();
                    if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                        z2 = false;
                    }
                    return new bsn(z3, z, isActiveNetworkMetered, z2);
                }
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.h.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z2 = false;
        return new bsn(z3, z, isActiveNetworkMetered2, z2);
    }

    @Override // defpackage.bte
    public final void d() {
        if (c()) {
            try {
                bqf.a().d(new Throwable[0]);
                this.h.registerDefaultNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bqf.a();
                bqf.e(f, "Received exception while registering network callback", e);
                return;
            }
        }
        bqf.a().d(new Throwable[0]);
        this.a.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.bte
    public final void e() {
        if (c()) {
            try {
                bqf.a().d(new Throwable[0]);
                this.h.unregisterNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bqf.a();
                bqf.e(f, "Received exception while unregistering network callback", e);
                return;
            }
        }
        bqf.a().d(new Throwable[0]);
        this.a.unregisterReceiver(this.j);
    }
}
