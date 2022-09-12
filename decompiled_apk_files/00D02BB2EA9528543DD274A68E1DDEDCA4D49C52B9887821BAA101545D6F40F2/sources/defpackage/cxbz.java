package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cxbz  reason: default package */
/* loaded from: classes5.dex */
final class cxbz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageStats a(Context context) {
        UUID b;
        czhz.c();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            return null;
        }
        try {
            StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
            String packageName = context.getPackageName();
            PackageStats packageStats = new PackageStats(packageName);
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if (storageVolume.getState().equals("mounted") && (b = b(storageVolume)) != null) {
                    try {
                        c(packageStats, storageStatsManager.queryStatsForPackage(b, packageName, Process.myUserHandle()), StorageManager.UUID_DEFAULT.equals(b));
                    } catch (PackageManager.NameNotFoundException | IOException | RuntimeException unused) {
                    }
                }
            }
            return packageStats;
        } catch (Error | RuntimeException unused2) {
            return null;
        }
    }

    private static UUID b(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        try {
            return uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static void c(PackageStats packageStats, StorageStats storageStats, boolean z) {
        if (z) {
            packageStats.codeSize += storageStats.getAppBytes();
            packageStats.dataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
            packageStats.cacheSize += storageStats.getCacheBytes();
            return;
        }
        packageStats.externalCodeSize += storageStats.getAppBytes();
        packageStats.externalDataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
        packageStats.externalCacheSize += storageStats.getCacheBytes();
    }
}
