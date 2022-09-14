package defpackage;
/* compiled from: PG */
/* renamed from: drds  reason: default package */
/* loaded from: classes6.dex */
public enum drds implements dsrb {
    UNKNOWN_CREATOR_CONTRIBUTION_TYPE(0),
    REVIEW(1),
    MEDIA(2),
    PUBLIC_LIST(3),
    FACTUAL_EDIT(4),
    PLACE_QA(5),
    EVENT(6),
    POST(7),
    PHOTO_POST(8);
    
    public final int j;

    drds(int i) {
        this.j = i;
    }

    public static drds b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
            case 1:
                return REVIEW;
            case 2:
                return MEDIA;
            case 3:
                return PUBLIC_LIST;
            case 4:
                return FACTUAL_EDIT;
            case 5:
                return PLACE_QA;
            case 6:
                return EVENT;
            case 7:
                return POST;
            case 8:
                return PHOTO_POST;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return drdr.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
