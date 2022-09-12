package defpackage;
/* compiled from: PG */
/* renamed from: drey  reason: default package */
/* loaded from: classes6.dex */
public enum drey implements dsrb {
    UNKNOWN_HIGHLIGHT_TYPE(0),
    USER_QUERY_MATCH(1),
    PLACE_TOPIC_MENTION(2),
    HOTEL_ASPECT_MENTION(3);
    
    public final int e;

    drey(int i) {
        this.e = i;
    }

    public static drey b(int i) {
        if (i != 0) {
            if (i == 1) {
                return USER_QUERY_MATCH;
            }
            if (i == 2) {
                return PLACE_TOPIC_MENTION;
            }
            if (i == 3) {
                return HOTEL_ASPECT_MENTION;
            }
            return null;
        }
        return UNKNOWN_HIGHLIGHT_TYPE;
    }

    public static dsrd c() {
        return drex.a;
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
