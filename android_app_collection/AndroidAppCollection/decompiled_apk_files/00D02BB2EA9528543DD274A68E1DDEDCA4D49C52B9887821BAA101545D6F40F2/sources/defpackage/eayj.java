package defpackage;
/* compiled from: PG */
/* renamed from: eayj  reason: default package */
/* loaded from: classes6.dex */
public enum eayj implements dsrb {
    UNKNOWN_PROVENANCE(0),
    DEVICE(1),
    CLOUD(2),
    USER_ENTERED(3),
    PAPI_AUTOCOMPLETE(4),
    PAPI_TOPN(5),
    PAPI_LIST_PEOPLE_BY_KNOWN_ID(6),
    MENAGERIE(7),
    DIRECTORY(8),
    DAS_TOP_AFFINITIES(9);
    
    public final int k;

    eayj(int i) {
        this.k = i;
    }

    public static eayj b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROVENANCE;
            case 1:
                return DEVICE;
            case 2:
                return CLOUD;
            case 3:
                return USER_ENTERED;
            case 4:
                return PAPI_AUTOCOMPLETE;
            case 5:
                return PAPI_TOPN;
            case 6:
                return PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 7:
                return MENAGERIE;
            case 8:
                return DIRECTORY;
            case 9:
                return DAS_TOP_AFFINITIES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return eayi.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
