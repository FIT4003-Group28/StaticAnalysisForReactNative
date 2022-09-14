package defpackage;
/* compiled from: PG */
/* renamed from: dwub  reason: default package */
/* loaded from: classes6.dex */
public enum dwub implements dsrb {
    UNKNOWN_ACTION(0),
    SEE_REVIEWS(1),
    SEE_PHOTOS(2),
    SEE_EDITS(3);
    
    private final int e;

    dwub(int i) {
        this.e = i;
    }

    public static dwub b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SEE_REVIEWS;
            }
            if (i == 2) {
                return SEE_PHOTOS;
            }
            if (i == 3) {
                return SEE_EDITS;
            }
            return null;
        }
        return UNKNOWN_ACTION;
    }

    public static dsrd c() {
        return dwua.a;
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
