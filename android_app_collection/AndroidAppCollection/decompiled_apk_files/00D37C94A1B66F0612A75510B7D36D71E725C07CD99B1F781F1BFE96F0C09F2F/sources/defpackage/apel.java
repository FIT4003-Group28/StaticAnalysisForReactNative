package defpackage;
/* compiled from: PG */
/* renamed from: apel  reason: default package */
/* loaded from: classes.dex */
public enum apel implements aopm {
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN(0),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE(4),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL(1),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL(2),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK(3);
    
    public final int f;

    apel(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aoxm.u;
    }

    public static apel b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL;
            }
            if (i == 2) {
                return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL;
            }
            if (i == 3) {
                return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK;
            }
            if (i == 4) {
                return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE;
            }
            return null;
        }
        return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
