package defpackage;
/* compiled from: PG */
/* renamed from: dnbh  reason: default package */
/* loaded from: classes.dex */
public enum dnbh implements dsrb {
    CLIENT_MOBILE_PHONE(0),
    CLIENT_MOBILE_TABLET(6),
    CLIENT_MOBILE_WEB(9),
    CLIENT_MOBILE_GSA(13),
    CLIENT_DESKTOP(1),
    CLIENT_DESKTOP_LITE(10),
    CLIENT_IFRAME_API(11),
    CLIENT_JS_API(12),
    CLIENT_LU_RICHLIST_MAP(2),
    CLIENT_LU_RICHLISTDESKTOP_FULLLIST_MAP(3),
    CLIENT_LU_MAPS_LITE(7),
    CLIENT_MOBILE_LU_MAPS_LITE(15),
    CLIENT_MOBILE_IMMERSIVE_LU_MAPS_LITE(17),
    CLIENT_TABLET_LU_MAPS_LITE(16),
    CLIENT_IOS_GSA_LU(4),
    CLIENT_IOS_GSA_IMMERSIVE(5),
    CLIENT_LU(8),
    CLIENT_EARTH(14),
    CLIENT_ASSISTANT_TRAVEL(18);
    
    public final int t;

    dnbh(int i) {
        this.t = i;
    }

    public static dnbh b(int i) {
        switch (i) {
            case 0:
                return CLIENT_MOBILE_PHONE;
            case 1:
                return CLIENT_DESKTOP;
            case 2:
                return CLIENT_LU_RICHLIST_MAP;
            case 3:
                return CLIENT_LU_RICHLISTDESKTOP_FULLLIST_MAP;
            case 4:
                return CLIENT_IOS_GSA_LU;
            case 5:
                return CLIENT_IOS_GSA_IMMERSIVE;
            case 6:
                return CLIENT_MOBILE_TABLET;
            case 7:
                return CLIENT_LU_MAPS_LITE;
            case 8:
                return CLIENT_LU;
            case 9:
                return CLIENT_MOBILE_WEB;
            case 10:
                return CLIENT_DESKTOP_LITE;
            case 11:
                return CLIENT_IFRAME_API;
            case 12:
                return CLIENT_JS_API;
            case 13:
                return CLIENT_MOBILE_GSA;
            case 14:
                return CLIENT_EARTH;
            case 15:
                return CLIENT_MOBILE_LU_MAPS_LITE;
            case 16:
                return CLIENT_TABLET_LU_MAPS_LITE;
            case 17:
                return CLIENT_MOBILE_IMMERSIVE_LU_MAPS_LITE;
            case 18:
                return CLIENT_ASSISTANT_TRAVEL;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dnbg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
