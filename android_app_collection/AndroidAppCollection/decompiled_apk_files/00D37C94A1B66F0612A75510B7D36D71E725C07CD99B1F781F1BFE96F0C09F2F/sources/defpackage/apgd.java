package defpackage;
/* compiled from: PG */
/* renamed from: apgd  reason: default package */
/* loaded from: classes.dex */
public enum apgd implements aopm {
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN(0),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE(1),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY(2),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP(3);
    
    public final int e;

    apgd(int i) {
        this.e = i;
    }

    public static aopo a() {
        return apfa.m;
    }

    public static apgd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE;
            }
            if (i == 2) {
                return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY;
            }
            if (i == 3) {
                return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP;
            }
            return null;
        }
        return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
