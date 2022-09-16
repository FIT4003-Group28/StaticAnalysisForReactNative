package defpackage;
/* compiled from: PG */
/* renamed from: dqjh  reason: default package */
/* loaded from: classes6.dex */
public enum dqjh implements dsrb {
    UNKNOWN_VOTE_TYPE(0),
    THUMBS_UP(1),
    THUMBS_DOWN(2),
    THUMBS_VOTE_NONE(3);
    
    public final int e;

    dqjh(int i) {
        this.e = i;
    }

    public static dqjh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return THUMBS_UP;
            }
            if (i == 2) {
                return THUMBS_DOWN;
            }
            if (i == 3) {
                return THUMBS_VOTE_NONE;
            }
            return null;
        }
        return UNKNOWN_VOTE_TYPE;
    }

    public static dsrd c() {
        return dqjg.a;
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
