package defpackage;
/* compiled from: PG */
/* renamed from: dkiq  reason: default package */
/* loaded from: classes6.dex */
public enum dkiq implements dsrb {
    UNKNOWN_WORK_MANAGER_TASK_TYPE(0),
    NOTIFICATION_OPT_OUT_CHANGE_LOGGING(1),
    CLOUD_MESSAGE(2),
    GUNS_NOTIFICATION_FETCHER(3),
    GELLER_CLEANUP(4),
    GELLER_SYNC(5),
    TRACKED_TILE_PREFETCHER(6),
    INBOX_NOTIFICATION_STORAGE_EXPIRATION(7),
    OFFLINE_APP_INDEXING(8),
    OFFLINE_AUTO_UPDATE(9),
    OFFLINE_AUTO_UPDATE_MAINTENANCE(10),
    OFFLINE_MANUAL_DOWNLOAD(11),
    OFFLINE_UPDATE_WATCHDOG(12),
    PASSIVE_ASSIST_DATA_STORE_EXPIRATION(13),
    DISMISS_NOTIFICATION(14),
    LOW_PRIORITY_REQUEST_TASK_SERVICE(15),
    AREA_TRAFFIC_NOTIFICATION(16),
    COMMUTE_NOTIFICATION_PROBER(17),
    TRAFFIC_TO_PLACE_SESSION(18),
    PHOTO_METADATA_DATABASE_CLEANER_SERVICE(19),
    GLIDE_DISK_CACHE_EXPIRATION(20);
    
    private final int v;

    dkiq(int i) {
        this.v = i;
    }

    public static dkiq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_WORK_MANAGER_TASK_TYPE;
            case 1:
                return NOTIFICATION_OPT_OUT_CHANGE_LOGGING;
            case 2:
                return CLOUD_MESSAGE;
            case 3:
                return GUNS_NOTIFICATION_FETCHER;
            case 4:
                return GELLER_CLEANUP;
            case 5:
                return GELLER_SYNC;
            case 6:
                return TRACKED_TILE_PREFETCHER;
            case 7:
                return INBOX_NOTIFICATION_STORAGE_EXPIRATION;
            case 8:
                return OFFLINE_APP_INDEXING;
            case 9:
                return OFFLINE_AUTO_UPDATE;
            case 10:
                return OFFLINE_AUTO_UPDATE_MAINTENANCE;
            case 11:
                return OFFLINE_MANUAL_DOWNLOAD;
            case 12:
                return OFFLINE_UPDATE_WATCHDOG;
            case 13:
                return PASSIVE_ASSIST_DATA_STORE_EXPIRATION;
            case 14:
                return DISMISS_NOTIFICATION;
            case 15:
                return LOW_PRIORITY_REQUEST_TASK_SERVICE;
            case 16:
                return AREA_TRAFFIC_NOTIFICATION;
            case 17:
                return COMMUTE_NOTIFICATION_PROBER;
            case 18:
                return TRAFFIC_TO_PLACE_SESSION;
            case 19:
                return PHOTO_METADATA_DATABASE_CLEANER_SERVICE;
            case 20:
                return GLIDE_DISK_CACHE_EXPIRATION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dkip.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
