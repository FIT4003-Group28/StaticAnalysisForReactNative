package defpackage;
/* compiled from: PG */
/* renamed from: dhyq  reason: default package */
/* loaded from: classes6.dex */
public enum dhyq implements dsrb {
    UNKNOWN_FACTUAL_EDIT_STATE(0),
    PENDING_MODERATION(1),
    ACCEPTED(2),
    REJECTED(3);
    
    private final int e;

    dhyq(int i) {
        this.e = i;
    }

    public static dhyq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PENDING_MODERATION;
            }
            if (i == 2) {
                return ACCEPTED;
            }
            if (i == 3) {
                return REJECTED;
            }
            return null;
        }
        return UNKNOWN_FACTUAL_EDIT_STATE;
    }

    public static dsrd c() {
        return dhyp.a;
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
