package defpackage;
/* compiled from: PG */
/* renamed from: dprc  reason: default package */
/* loaded from: classes6.dex */
public enum dprc implements dsrb {
    UNKNOWN_ENTITY_LIST_TYPE(0),
    CUSTOM_ENTITY_LIST(1),
    FAVORITES_ENTITY_LIST(2),
    WANT_TO_GO_ENTITY_LIST(3),
    STARRED_ENTITY_LIST(4);
    
    public final int f;

    dprc(int i) {
        this.f = i;
    }

    public static dprc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CUSTOM_ENTITY_LIST;
            }
            if (i == 2) {
                return FAVORITES_ENTITY_LIST;
            }
            if (i == 3) {
                return WANT_TO_GO_ENTITY_LIST;
            }
            if (i == 4) {
                return STARRED_ENTITY_LIST;
            }
            return null;
        }
        return UNKNOWN_ENTITY_LIST_TYPE;
    }

    public static dsrd c() {
        return dprb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
