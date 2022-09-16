package defpackage;
/* compiled from: PG */
/* renamed from: apfi  reason: default package */
/* loaded from: classes.dex */
public enum apfi implements aopm {
    ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN(0),
    ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED(1);
    
    public final int c;

    apfi(int i) {
        this.c = i;
    }

    public static aopo a() {
        return apfa.d;
    }

    public static apfi b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED;
            }
            return null;
        }
        return ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
