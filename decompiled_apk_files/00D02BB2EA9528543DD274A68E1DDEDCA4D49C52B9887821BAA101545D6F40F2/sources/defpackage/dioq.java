package defpackage;
/* compiled from: PG */
/* renamed from: dioq  reason: default package */
/* loaded from: classes6.dex */
public enum dioq implements dsrb {
    UNKNOWN_TYPE(0),
    BOOK(1),
    ORDER(2),
    SHOP(3),
    CONTACT(4),
    LEARN_MORE(5),
    SIGN_UP(6),
    VIDEO(7),
    RESERVE(8),
    GET_OFFER(9),
    VIEW_OFFER(10),
    CALL(11);
    
    private final int m;

    dioq(int i) {
        this.m = i;
    }

    public static dioq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return BOOK;
            case 2:
                return ORDER;
            case 3:
                return SHOP;
            case 4:
                return CONTACT;
            case 5:
                return LEARN_MORE;
            case 6:
                return SIGN_UP;
            case 7:
                return VIDEO;
            case 8:
                return RESERVE;
            case 9:
                return GET_OFFER;
            case 10:
                return VIEW_OFFER;
            case 11:
                return CALL;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return diop.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
