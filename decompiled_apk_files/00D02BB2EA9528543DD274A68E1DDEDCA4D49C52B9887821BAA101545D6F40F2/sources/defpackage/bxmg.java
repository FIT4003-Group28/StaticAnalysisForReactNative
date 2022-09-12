package defpackage;
/* compiled from: PG */
/* renamed from: bxmg  reason: default package */
/* loaded from: classes4.dex */
public enum bxmg implements dsrb {
    UNKNOWN(0),
    OFFLINE_CLICKED_ONLINE_HAS_THE_RESULT(1),
    OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT(2),
    OFFLINE_CLICKED_NO_ONLINE_RESPONSE(3),
    ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_IN_TOP_2(4),
    ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_OUTSIDE_TOP_2(5),
    ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_IN_DOWNLOADED_AREAS(6),
    ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_OUTSIDE_DOWNLOADED_AREAS(7),
    ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS(8),
    ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN(9),
    ONLINE_CLICKED_NO_OFFLINE_RESPONSE(10),
    ONLINE_ONLY(11),
    OFFLINE_ONLY(12),
    LOGGING_DISABLED(13),
    ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT(14),
    OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_ROUTE(15),
    OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT(16);
    
    public final int r;

    bxmg(int i) {
        this.r = i;
    }

    public static bxmg b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OFFLINE_CLICKED_ONLINE_HAS_THE_RESULT;
            case 2:
                return OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT;
            case 3:
                return OFFLINE_CLICKED_NO_ONLINE_RESPONSE;
            case 4:
                return ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_IN_TOP_2;
            case 5:
                return ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_OUTSIDE_TOP_2;
            case 6:
                return ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_IN_DOWNLOADED_AREAS;
            case 7:
                return ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_OUTSIDE_DOWNLOADED_AREAS;
            case 8:
                return ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS;
            case 9:
                return ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN;
            case 10:
                return ONLINE_CLICKED_NO_OFFLINE_RESPONSE;
            case 11:
                return ONLINE_ONLY;
            case 12:
                return OFFLINE_ONLY;
            case 13:
                return LOGGING_DISABLED;
            case 14:
                return ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT;
            case 15:
                return OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_ROUTE;
            case 16:
                return OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return bxmf.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
