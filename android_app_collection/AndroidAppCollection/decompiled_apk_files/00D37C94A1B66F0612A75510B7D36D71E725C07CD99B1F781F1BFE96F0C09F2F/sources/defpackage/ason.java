package defpackage;
/* compiled from: PG */
/* renamed from: ason  reason: default package */
/* loaded from: classes2.dex */
public enum ason implements aopm {
    UNKNOWN(0),
    FLASHACCESS(1),
    WIDEVINE_CLASSIC(2),
    FAIRPLAY(6),
    CLEARKEY(3),
    WIDEVINE(4),
    PLAYREADY(5);
    
    public final int h;

    ason(int i2) {
        this.h = i2;
    }

    public static aopo a() {
        return asnz.e;
    }

    public static ason b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return FLASHACCESS;
            case 2:
                return WIDEVINE_CLASSIC;
            case 3:
                return CLEARKEY;
            case 4:
                return WIDEVINE;
            case 5:
                return PLAYREADY;
            case 6:
                return FAIRPLAY;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
