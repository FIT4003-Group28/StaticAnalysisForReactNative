package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: bvrj  reason: default package */
/* loaded from: classes.dex */
public enum bvrj {
    CURRENT("Current", -1),
    DANGEROUS_PUBLISHER_THREAD("Unspecified", -1),
    BACKGROUND_THREADPOOL("Default", 10),
    DOWNLOADER_THREADPOOL("Download", 10),
    LOW_PRIORITY_BACKGROUND_THREADPOOL("LowPri", 15),
    UI_THREAD("UIThread", 0),
    GMM_PICKER("Picker", 0),
    LAYOUT_INFLATER_THREADPOOL("Inflater", 1),
    LABELING_THREAD("Labeling", 1),
    NETWORK_THREAD("NetworkV1", 2),
    NETWORK_THREADPOOL("Network", 2),
    LOCATION_FRESHNESS_WAITING_THREADPOOL("LocFresh", 2),
    TILE_PREP_THREADPOOL("TilePrep", 1),
    OFFLINE_REGION_PROCESSING_THREADPOOL("OfflinePro", 10),
    SUGGEST_CALLBACK_THREAD("SuggestCallback", 4),
    APP_SINGLETONS_FACTORY_THREAD("ClassLoader", 9),
    LOCATION_SENSORS("Sensors", 2),
    LOCATION_DISPATCHER("Location", 4),
    ROAD_GRAPH_TILE_PREP_THREADPOOL("RoadGraph", 10),
    ALERT_CONTROLLER("AlertController", 10),
    GMM_STORAGE("Storage", 10),
    INTERPRETER_THREAD("Interpreter", 10),
    NAVIGATION_INTERNAL("NavInternal", 10),
    NETWORK_TTS_SYNTHESIS("NetworkTTS", 10),
    OFFLINE_REGION_MANAGEMENT("OfflineManage", 10),
    OFFLINE_DYNAMIC_THREAD("OfflineDynamic", 10),
    PREFETCHER("Prefetcher", 10),
    PREWARM_GMM_ACTIVITY("PrewarmActivity", 10),
    THREAD_POOL_MONITOR("TPMonitor", 10),
    WEARABLE_DATA("WearableData", 10),
    NAV_STATE_THREAD("NavState", 10),
    MEMORY_MONITOR_THREAD("MemoryMon", 13),
    NETWORK_MONITOR_THREAD("NetworkMon", 16),
    BATTERY_MONITOR_THREAD("BatteryMon", 16),
    NATIVE_LIBRARY_LOADER("NativeLibLoader", 19);
    
    public final int J;
    public final String K;

    bvrj(String str, int i) {
        this.J = i;
        bvqz.a(str);
        this.K = str;
    }

    @dzsi
    public static bvrj a() {
        Thread currentThread = Thread.currentThread();
        if (currentThread == Looper.getMainLooper().getThread()) {
            return UI_THREAD;
        }
        if (!(currentThread instanceof bvri)) {
            return null;
        }
        return ((bvri) currentThread).b();
    }

    private final void e(boolean z) {
        if (b() != z) {
            String str = true != z ? "Should not" : "Should";
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(a());
            String valueOf3 = String.valueOf(Thread.currentThread());
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append(str);
            sb.append(" be running on ");
            sb.append(valueOf);
            sb.append(", but we're on ");
            sb.append(valueOf2);
            sb.append(" (Java Thread ");
            sb.append(valueOf3);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean b() {
        if (this == CURRENT) {
            return true;
        }
        Thread currentThread = Thread.currentThread();
        return this == UI_THREAD ? currentThread == Looper.getMainLooper().getThread() : (currentThread instanceof bvri) && this == ((bvri) currentThread).b();
    }

    public final void c() {
        e(true);
    }

    public final void d() {
        e(false);
    }
}
