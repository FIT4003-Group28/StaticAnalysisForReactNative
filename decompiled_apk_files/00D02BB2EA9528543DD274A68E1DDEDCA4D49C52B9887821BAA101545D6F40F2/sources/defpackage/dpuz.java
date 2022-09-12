package defpackage;
/* compiled from: PG */
/* renamed from: dpuz  reason: default package */
/* loaded from: classes.dex */
public enum dpuz implements dsrb {
    UNKNOWN_TYPE(0),
    FOOD_AND_DRINK(1),
    THINGS_TO_DO(2),
    TRAVEL(3);
    
    public final int e;

    dpuz(int i) {
        this.e = i;
    }

    public static dpuz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FOOD_AND_DRINK;
            }
            if (i == 2) {
                return THINGS_TO_DO;
            }
            if (i == 3) {
                return TRAVEL;
            }
            return null;
        }
        return UNKNOWN_TYPE;
    }

    public static dsrd c() {
        return dpuy.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
