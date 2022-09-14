package defpackage;
/* compiled from: PG */
/* renamed from: diiu  reason: default package */
/* loaded from: classes.dex */
public enum diiu implements dsrb {
    UNKNOWN_CONTENT_TAG(0),
    COVER(5),
    INTERIOR(1),
    EXTERIOR(2),
    PRODUCT(3),
    LOGO(4),
    MENU(6),
    PEOPLE(7),
    FOOD_AND_DRINK(8),
    STORE_INTERIOR(9),
    MAYBE_RECEIPT(10),
    RECEIPT(11);
    
    public final int m;

    diiu(int i) {
        this.m = i;
    }

    public static diiu b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTENT_TAG;
            case 1:
                return INTERIOR;
            case 2:
                return EXTERIOR;
            case 3:
                return PRODUCT;
            case 4:
                return LOGO;
            case 5:
                return COVER;
            case 6:
                return MENU;
            case 7:
                return PEOPLE;
            case 8:
                return FOOD_AND_DRINK;
            case 9:
                return STORE_INTERIOR;
            case 10:
                return MAYBE_RECEIPT;
            case 11:
                return RECEIPT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return diit.a;
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
