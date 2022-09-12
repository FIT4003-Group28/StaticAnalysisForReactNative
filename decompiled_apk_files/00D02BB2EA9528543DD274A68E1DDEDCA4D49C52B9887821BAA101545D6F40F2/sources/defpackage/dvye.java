package defpackage;
/* compiled from: PG */
/* renamed from: dvye  reason: default package */
/* loaded from: classes6.dex */
public enum dvye implements dsrb {
    UNKNOWN(0),
    PHOTO_TAKEN_NOTIFICATION(1),
    INITIAL_PHOTO_CONTRIBUTION_NOTIFICATION(2),
    REVIEW_AT_A_PLACE_NOTIFICATION(3);
    
    private final int e;

    dvye(int i) {
        this.e = i;
    }

    public static dvye b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PHOTO_TAKEN_NOTIFICATION;
            }
            if (i == 2) {
                return INITIAL_PHOTO_CONTRIBUTION_NOTIFICATION;
            }
            if (i == 3) {
                return REVIEW_AT_A_PLACE_NOTIFICATION;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dvyd.a;
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
