package defpackage;
/* compiled from: PG */
/* renamed from: dros  reason: default package */
/* loaded from: classes6.dex */
public enum dros implements dsrb {
    UNKNOWN_TAB(0),
    REVIEWS(1),
    PHOTOS(2),
    CONTRIBUTE(3),
    FACTUAL_EDITS(4),
    TODO_LIST(5),
    BULK_PHOTO_UPLOAD(6),
    EVENTS(7);
    
    private final int i;

    dros(int i) {
        this.i = i;
    }

    public static dros b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TAB;
            case 1:
                return REVIEWS;
            case 2:
                return PHOTOS;
            case 3:
                return CONTRIBUTE;
            case 4:
                return FACTUAL_EDITS;
            case 5:
                return TODO_LIST;
            case 6:
                return BULK_PHOTO_UPLOAD;
            case 7:
                return EVENTS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dror.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
