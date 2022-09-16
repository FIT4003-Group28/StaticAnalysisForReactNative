package defpackage;
/* compiled from: PG */
/* renamed from: dhps  reason: default package */
/* loaded from: classes6.dex */
public enum dhps implements dsrb {
    UNKNOWN_TASK(0),
    RATING_TASK(1),
    REVIEW_TASK(2);
    
    private final int d;

    dhps(int i) {
        this.d = i;
    }

    public static dhps b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RATING_TASK;
            }
            if (i == 2) {
                return REVIEW_TASK;
            }
            return null;
        }
        return UNKNOWN_TASK;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
