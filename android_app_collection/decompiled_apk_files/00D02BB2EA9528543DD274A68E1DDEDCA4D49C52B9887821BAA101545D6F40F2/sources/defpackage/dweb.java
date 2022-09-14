package defpackage;
/* compiled from: PG */
/* renamed from: dweb  reason: default package */
/* loaded from: classes.dex */
public enum dweb implements dsrb {
    UNKNOWN_CATEGORY(0),
    FOOD_AND_DRINK(1),
    MENU(2),
    ROOM(3),
    VIBE(4),
    AMENITY(5),
    IN_STORE(6),
    STOREFRONT(7);
    
    public final int i;

    dweb(int i) {
        this.i = i;
    }

    public static dweb b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CATEGORY;
            case 1:
                return FOOD_AND_DRINK;
            case 2:
                return MENU;
            case 3:
                return ROOM;
            case 4:
                return VIBE;
            case 5:
                return AMENITY;
            case 6:
                return IN_STORE;
            case 7:
                return STOREFRONT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwea.a;
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
