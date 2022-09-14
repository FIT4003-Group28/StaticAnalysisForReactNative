package defpackage;
/* compiled from: PG */
/* renamed from: dawo  reason: default package */
/* loaded from: classes5.dex */
public enum dawo implements dsrb {
    UNKNOWN(0),
    IOS_NON_RETINA(1),
    IOS_RETINA(2),
    ANDROID_MDPI(3),
    ANDROID_HDPI(4),
    ANDROID_XHDPI(5),
    ANDROID_TVDPI(6),
    DESKTOP_NON_RETINA(7),
    DESKTOP_RETINA(8),
    ANDROID_XXHDPI(9),
    CHROME_1X(10),
    CHROME_2X(11),
    IOS_RETINA_3X(12),
    ANDROID_LDPI(13),
    ANDROID_XXXHDPI(14);
    
    public final int p;

    dawo(int i) {
        this.p = i;
    }

    public static dawo b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return IOS_NON_RETINA;
            case 2:
                return IOS_RETINA;
            case 3:
                return ANDROID_MDPI;
            case 4:
                return ANDROID_HDPI;
            case 5:
                return ANDROID_XHDPI;
            case 6:
                return ANDROID_TVDPI;
            case 7:
                return DESKTOP_NON_RETINA;
            case 8:
                return DESKTOP_RETINA;
            case 9:
                return ANDROID_XXHDPI;
            case 10:
                return CHROME_1X;
            case 11:
                return CHROME_2X;
            case 12:
                return IOS_RETINA_3X;
            case 13:
                return ANDROID_LDPI;
            case 14:
                return ANDROID_XXXHDPI;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dawn.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
