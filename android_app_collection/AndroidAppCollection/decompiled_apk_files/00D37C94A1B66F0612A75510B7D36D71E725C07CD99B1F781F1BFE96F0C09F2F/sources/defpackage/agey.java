package defpackage;
/* compiled from: PG */
/* renamed from: agey  reason: default package */
/* loaded from: classes.dex */
public enum agey {
    USER_CHANGED("USER_CHANGED"),
    LOCALE_CHANGED("LOCALE_CHANGED"),
    FCM_TOKEN_CHANGED("FCM_TOKEN_CHANGED"),
    EXPIRED("EXPIRED"),
    APP_SETTINGS_CHANGED("APP_SETTINGS_CHANGED"),
    OS_SETTINGS_CHANGED("OS_SETTINGS_CHANGED"),
    CHANNEL_SETTINGS_CHANGED("CHANNEL_SETTINGS_CHANGED"),
    FORCE_REFRESH("FORCE_REFRESH"),
    UNKNOWN("UNKNOWN");
    
    final String j;

    agey(String str) {
        this.j = str;
    }
}
