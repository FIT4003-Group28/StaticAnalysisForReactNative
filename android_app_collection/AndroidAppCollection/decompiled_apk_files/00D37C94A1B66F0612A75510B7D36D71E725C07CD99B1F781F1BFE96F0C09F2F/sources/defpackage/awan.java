package defpackage;
/* compiled from: PG */
/* renamed from: awan  reason: default package */
/* loaded from: classes2.dex */
public enum awan implements aopm {
    VIDEO_QUALITY_SETTING_UNKNOWN(0),
    VIDEO_QUALITY_SETTING_HIGHER_QUALITY(1),
    VIDEO_QUALITY_SETTING_DATA_SAVER(2),
    VIDEO_QUALITY_SETTING_ADVANCED_MENU(3);
    
    public final int e;

    awan(int i) {
        this.e = i;
    }

    public static aopo a() {
        return avxs.n;
    }

    public static awan b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VIDEO_QUALITY_SETTING_HIGHER_QUALITY;
            }
            if (i == 2) {
                return VIDEO_QUALITY_SETTING_DATA_SAVER;
            }
            if (i == 3) {
                return VIDEO_QUALITY_SETTING_ADVANCED_MENU;
            }
            return null;
        }
        return VIDEO_QUALITY_SETTING_UNKNOWN;
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
