package defpackage;
/* compiled from: PG */
/* renamed from: dfqe  reason: default package */
/* loaded from: classes6.dex */
public enum dfqe implements dsrb {
    UNDEFINED_STATE(0),
    NOT_FOLLOWING(1),
    REQUESTED(2),
    FOLLOWING_PRIVATELY(3),
    FOLLOWING_PUBLICLY(4);
    
    public final int f;

    dfqe(int i) {
        this.f = i;
    }

    public static dfqe b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NOT_FOLLOWING;
            }
            if (i == 2) {
                return REQUESTED;
            }
            if (i == 3) {
                return FOLLOWING_PRIVATELY;
            }
            if (i == 4) {
                return FOLLOWING_PUBLICLY;
            }
            return null;
        }
        return UNDEFINED_STATE;
    }

    public static dsrd c() {
        return dfqd.a;
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
