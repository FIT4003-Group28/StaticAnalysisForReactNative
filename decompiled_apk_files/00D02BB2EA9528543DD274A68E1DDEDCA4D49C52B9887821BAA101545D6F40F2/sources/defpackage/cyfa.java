package defpackage;
/* compiled from: PG */
/* renamed from: cyfa  reason: default package */
/* loaded from: classes5.dex */
public final class cyfa {
    public static cygl a(cyer cyerVar) {
        cyes cyesVar = cyes.NONE;
        switch (cyerVar.ordinal()) {
            case 0:
                return cygl.PAPI_TOPN;
            case 1:
                return cygl.PAPI_AUTOCOMPLETE;
            case 2:
            default:
                return cygl.UNKNOWN_PROVENANCE;
            case 3:
                return cygl.DEVICE;
            case 4:
                return cygl.DIRECTORY;
            case 5:
                return cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 6:
                return cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 7:
                return cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 8:
                return cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 9:
                return cygl.PAPI_TOPN;
            case 10:
                return cygl.PAPI_AUTOCOMPLETE;
        }
    }

    public static int b(cyes cyesVar) {
        cyer cyerVar = cyer.PEOPLE_API_TOP_N;
        int ordinal = cyesVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 3;
            }
            if (ordinal == 3) {
                return 6;
            }
            if (ordinal == 5) {
                return 9;
            }
            if (ordinal == 6) {
                return 7;
            }
            if (ordinal == 7) {
                return 10;
            }
            if (ordinal == 8) {
                return 11;
            }
            if (ordinal == 18) {
                return 12;
            }
            if (ordinal == 19) {
                return 13;
            }
            switch (ordinal) {
                case 11:
                    return 8;
                case 12:
                    return 4;
                case 13:
                    return 5;
                default:
                    return 1;
            }
        }
        return 2;
    }

    public static int c(cyer cyerVar) {
        cyes cyesVar = cyes.NONE;
        switch (cyerVar.ordinal()) {
            case 0:
                return 3;
            case 1:
                return 5;
            case 2:
            default:
                return 1;
            case 3:
                return 2;
            case 4:
                return 15;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case 8:
                return 12;
            case 9:
                return 13;
            case 10:
                return 14;
        }
    }
}
