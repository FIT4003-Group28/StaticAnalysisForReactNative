package defpackage;
/* compiled from: PG */
/* renamed from: drkp  reason: default package */
/* loaded from: classes6.dex */
public enum drkp implements dsrb {
    UNKNOWN_STATE(0),
    PENDING_MODERATION(1),
    ACCEPTED(2),
    REJECTED(3),
    ACKNOWLEDGED(4);
    
    private final int f;

    drkp(int i) {
        this.f = i;
    }

    public static drkp b(int i) {
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
            if (i == 4) {
                return ACKNOWLEDGED;
            }
            return null;
        }
        return UNKNOWN_STATE;
    }

    public static dsrd c() {
        return drko.a;
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
