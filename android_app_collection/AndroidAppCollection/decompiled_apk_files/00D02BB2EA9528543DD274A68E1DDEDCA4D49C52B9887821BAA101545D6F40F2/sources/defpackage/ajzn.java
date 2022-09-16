package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.apps.gmm.locationsharing.usr.LocationAvailabilityChecker$LocationProvidersChangedBroadcastReceiver;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ajzn  reason: default package */
/* loaded from: classes2.dex */
public final class ajzn {
    public final ajzq a;
    private final Application c;
    private final Executor d;
    private final ajzg g;
    private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private final LocationAvailabilityChecker$LocationProvidersChangedBroadcastReceiver e = new LocationAvailabilityChecker$LocationProvidersChangedBroadcastReceiver();
    private final ajzm f = new ajzm();
    private boolean i = false;
    private final Set<akac> h = new HashSet();

    public ajzn(Application application, Executor executor, ajzq ajzqVar, ajzg ajzgVar) {
        this.c = application;
        this.d = executor;
        this.a = ajzqVar;
        this.g = ajzgVar;
    }

    public final void a() {
        this.b.readLock().lock();
        try {
            for (final akac akacVar : this.h) {
                this.d.execute(new Runnable(akacVar) { // from class: ajzl
                    private final akac a;

                    {
                        this.a = akacVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.e();
                    }
                });
            }
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return Settings.Secure.getInt(this.c.getContentResolver(), "location_mode") != 0;
            } catch (Settings.SettingNotFoundException unused) {
                return false;
            }
        }
        LocationManager locationManager = (LocationManager) this.c.getSystemService("location");
        dbsk.s(locationManager);
        return locationManager.isLocationEnabled();
    }

    public final boolean c() {
        return this.a.a().d();
    }

    public final synchronized void d(akac akacVar) {
        this.b.writeLock().lock();
        if (this.h.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.PROVIDERS_CHANGED");
            intentFilter.addAction("android.location.MODE_CHANGED");
            this.c.registerReceiver(this.e, intentFilter);
            if (this.g.a()) {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                this.c.registerReceiver(this.f, intentFilter2);
                this.i = true;
            }
        }
        this.h.add(akacVar);
        this.b.writeLock().unlock();
    }

    public final synchronized void e(akac akacVar) {
        this.b.writeLock().lock();
        boolean isEmpty = this.h.isEmpty();
        this.h.remove(akacVar);
        if (!isEmpty && this.h.isEmpty()) {
            this.c.unregisterReceiver(this.e);
            if (this.i) {
                this.c.unregisterReceiver(this.f);
                this.i = false;
            }
        }
        this.b.writeLock().unlock();
    }
}
