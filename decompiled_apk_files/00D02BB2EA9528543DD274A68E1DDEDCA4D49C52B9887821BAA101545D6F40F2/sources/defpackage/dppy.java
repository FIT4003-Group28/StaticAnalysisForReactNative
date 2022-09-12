package defpackage;
/* compiled from: PG */
/* renamed from: dppy  reason: default package */
/* loaded from: classes6.dex */
public enum dppy implements dsrb {
    UNKNOWN_ITEM_TYPE(0),
    PLACE_ENTITY_LIST_ITEM(1),
    EXPERIENCE_ENTITY_LIST_ITEM(9),
    DEAL_ENTITY_LIST_ITEM(14);
    
    public final int e;

    dppy(int i) {
        this.e = i;
    }

    public static dppy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PLACE_ENTITY_LIST_ITEM;
            }
            if (i == 9) {
                return EXPERIENCE_ENTITY_LIST_ITEM;
            }
            if (i == 14) {
                return DEAL_ENTITY_LIST_ITEM;
            }
            return null;
        }
        return UNKNOWN_ITEM_TYPE;
    }

    public static dsrd c() {
        return dppx.a;
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
