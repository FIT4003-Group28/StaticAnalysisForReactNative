package defpackage;
/* compiled from: PG */
/* renamed from: dpht  reason: default package */
/* loaded from: classes6.dex */
public enum dpht implements dsrb {
    AVAILABLE(0),
    CANCELLED(1),
    LIKELY_MISS_TRANSFER(2);
    
    private final int d;

    dpht(int i) {
        this.d = i;
    }

    public static dpht b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CANCELLED;
            }
            if (i == 2) {
                return LIKELY_MISS_TRANSFER;
            }
            return null;
        }
        return AVAILABLE;
    }

    public static dsrd c() {
        return dphs.a;
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
