package defpackage;
/* compiled from: PG */
/* renamed from: drrx  reason: default package */
/* loaded from: classes6.dex */
public enum drrx implements dsrb {
    UNKNOWN_MODE(0),
    RATING(1),
    REVIEW(2),
    PHOTO(3),
    TAGGING(4),
    LIST(5),
    ANSWER_QUESTION(6),
    MODERATE_EDIT(7);
    
    public final int i;

    drrx(int i) {
        this.i = i;
    }

    public static drrx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MODE;
            case 1:
                return RATING;
            case 2:
                return REVIEW;
            case 3:
                return PHOTO;
            case 4:
                return TAGGING;
            case 5:
                return LIST;
            case 6:
                return ANSWER_QUESTION;
            case 7:
                return MODERATE_EDIT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return drrw.a;
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
