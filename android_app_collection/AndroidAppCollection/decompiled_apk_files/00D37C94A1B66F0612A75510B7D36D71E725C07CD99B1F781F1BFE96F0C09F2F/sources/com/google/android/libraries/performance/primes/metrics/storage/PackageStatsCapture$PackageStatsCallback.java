package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    public final Semaphore a = new Semaphore(1);
    public volatile PackageStats b;

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            ((amzw) ((amzw) uzd.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 48, "PackageStatsCapture.java")).s("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            ((amzw) ((amzw) uzd.a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 51, "PackageStatsCapture.java")).q("Failure getting PackageStats");
        }
        this.a.release();
    }
}
