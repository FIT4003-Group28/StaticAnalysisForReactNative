package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    public final Semaphore a = new Semaphore(1);
    public volatile PackageStats b;

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            int i = cxby.b;
            this.b = packageStats;
        } else {
            int i2 = cxby.b;
        }
        this.a.release();
    }
}
