package defpackage;
/* compiled from: PG */
/* renamed from: atpx  reason: default package */
/* loaded from: classes2.dex */
public enum atpx implements aopm {
    DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN(0),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE(1),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE(2),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE(3),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED(4);
    
    public final int f;

    atpx(int i) {
        this.f = i;
    }

    public static aopo a() {
        return atov.e;
    }

    public static atpx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE;
            }
            if (i == 2) {
                return DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE;
            }
            if (i == 3) {
                return DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE;
            }
            if (i == 4) {
                return DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED;
            }
            return null;
        }
        return DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
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
