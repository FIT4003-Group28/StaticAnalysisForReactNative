package defpackage;
/* compiled from: PG */
/* renamed from: drci  reason: default package */
/* loaded from: classes6.dex */
public enum drci implements dsrb {
    UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE(0),
    USER_QUOTE_JUSTIFICATION_TYPE(1),
    MENU_ITEM_JUSTIFICATION_TYPE(2);
    
    private final int d;

    drci(int i) {
        this.d = i;
    }

    public static drci b(int i) {
        if (i != 0) {
            if (i == 1) {
                return USER_QUOTE_JUSTIFICATION_TYPE;
            }
            if (i == 2) {
                return MENU_ITEM_JUSTIFICATION_TYPE;
            }
            return null;
        }
        return UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE;
    }

    public static dsrd c() {
        return drch.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
