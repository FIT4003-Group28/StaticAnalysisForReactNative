package defpackage;
/* compiled from: PG */
/* renamed from: ckdv  reason: default package */
/* loaded from: classes4.dex */
public enum ckdv {
    SETTING_DISABLED(0),
    TERMS_NOT_ACCEPTED(1),
    APP_NOT_RECENTLY_USED(2),
    OFFLINE(3),
    EXCEEDED_QUOTA(4),
    USER_LOCATION_REPORTING_DISABLED(5),
    PERMISSION_NOT_GRANTED(6),
    ALL_GMM_NOTIFICATIONS_DISABLED(7),
    OFFLINE_BUT_STARTED(8),
    IN_BACKOFF(9),
    SERVER_FLAGS_DISABLED(10),
    NOT_SIGNED_IN(11),
    NO_ACTIVE_PHOTO_TAKEN_SUBSCRIBERS(12),
    IN_INCOGNITO_MODE(13);
    
    public final int o;

    ckdv(int i) {
        this.o = i;
    }
}
