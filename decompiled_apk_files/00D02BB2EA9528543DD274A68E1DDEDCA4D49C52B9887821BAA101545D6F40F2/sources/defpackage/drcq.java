package defpackage;
/* compiled from: PG */
/* renamed from: drcq  reason: default package */
/* loaded from: classes.dex */
public enum drcq implements dsrb {
    UNKNOWN_PLACE_LIST_TYPE(0),
    FAVORITES(1),
    WANT_TO_GO(2),
    CUSTOM(3),
    STARRED(4),
    UNIVERSAL_SAVES_LIST(5);
    
    public final int g;

    drcq(int i) {
        this.g = i;
    }

    public static drcq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FAVORITES;
            }
            if (i == 2) {
                return WANT_TO_GO;
            }
            if (i == 3) {
                return CUSTOM;
            }
            if (i == 4) {
                return STARRED;
            }
            if (i == 5) {
                return UNIVERSAL_SAVES_LIST;
            }
            return null;
        }
        return UNKNOWN_PLACE_LIST_TYPE;
    }

    public static dsrd c() {
        return drcp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
