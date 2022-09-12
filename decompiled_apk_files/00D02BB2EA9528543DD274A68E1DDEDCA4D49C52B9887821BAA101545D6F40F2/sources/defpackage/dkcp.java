package defpackage;
/* compiled from: PG */
/* renamed from: dkcp  reason: default package */
/* loaded from: classes6.dex */
public enum dkcp implements dsrb {
    UNKNOWN_TAB_TYPE(0),
    CONTRIBUTE(1),
    REVIEW(2),
    PHOTO(3),
    EDIT(4),
    PUBLIC_LIST(5),
    EVENTS(6),
    QA(7);
    
    public final int i;

    dkcp(int i) {
        this.i = i;
    }

    public static dkcp b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TAB_TYPE;
            case 1:
                return CONTRIBUTE;
            case 2:
                return REVIEW;
            case 3:
                return PHOTO;
            case 4:
                return EDIT;
            case 5:
                return PUBLIC_LIST;
            case 6:
                return EVENTS;
            case 7:
                return QA;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dkco.a;
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
