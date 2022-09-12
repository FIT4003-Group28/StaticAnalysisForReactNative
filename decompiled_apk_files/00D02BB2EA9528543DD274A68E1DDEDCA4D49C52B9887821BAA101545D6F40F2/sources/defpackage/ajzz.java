package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.apps.gmm.locationsharing.usr.NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ajzz  reason: default package */
/* loaded from: classes2.dex */
public final class ajzz {
    public final Application b;
    @dzsi
    public final ajzy c;
    private final Executor f;
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public final NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver d = new NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver();
    public final Set<ajzx> e = new HashSet();

    public ajzz(Application application, Executor executor) {
        this.b = application;
        this.f = executor;
        this.c = Build.VERSION.SDK_INT >= 24 ? new ajzy(this) : null;
    }

    public final void a(ajzx ajzxVar) {
        this.a.writeLock().lock();
        try {
        } finally {
            this.a.writeLock().unlock();
        }
        if (this.e.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
                try {
                    ajzy ajzyVar = this.c;
                    dbsk.s(ajzyVar);
                    connectivityManager.registerDefaultNetworkCallback(ajzyVar);
                } catch (RuntimeException e) {
                    bvoo.i(e);
                }
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                try {
                    this.b.registerReceiver(this.d, intentFilter);
                } catch (RuntimeException e2) {
                    bvoo.i(e2);
                }
            }
            this.a.writeLock().unlock();
        }
        this.e.add(ajzxVar);
    }

    public final void b() {
        this.a.readLock().lock();
        try {
            for (final ajzx ajzxVar : this.e) {
                this.f.execute(new Runnable(ajzxVar) { // from class: ajzw
                    private final ajzx a;

                    {
                        this.a = ajzxVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                });
            }
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final boolean c() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }
}
