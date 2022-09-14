package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bfe  reason: default package */
/* loaded from: classes3.dex */
public final class bfe extends bfb<bek> {
    public static final /* synthetic */ int f = 0;
    private final ConnectivityManager g;
    private bfd h;
    private bfc i;

    static {
        bbz.f("NetworkStateTracker");
    }

    public bfe(Context context, bif bifVar) {
        super(context, bifVar);
        this.g = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (c()) {
            this.h = new bfd(this);
        } else {
            this.i = new bfc(this);
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bfb
    /* renamed from: a */
    public final bek b() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            } catch (SecurityException e) {
                bbz.e().b(e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z = true;
                    boolean isActiveNetworkMetered = this.g.isActiveNetworkMetered();
                    if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                        z2 = false;
                    }
                    return new bek(z3, z, isActiveNetworkMetered, z2);
                }
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.g.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z2 = false;
        return new bek(z3, z, isActiveNetworkMetered2, z2);
    }

    @Override // defpackage.bfb
    public final void d() {
        if (c()) {
            try {
                bbz.e().a(new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bbz.e().b(e);
                return;
            }
        }
        bbz.e().a(new Throwable[0]);
        this.a.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.bfb
    public final void e() {
        if (c()) {
            try {
                bbz.e().a(new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bbz.e().b(e);
                return;
            }
        }
        bbz.e().a(new Throwable[0]);
        this.a.unregisterReceiver(this.i);
    }
}
