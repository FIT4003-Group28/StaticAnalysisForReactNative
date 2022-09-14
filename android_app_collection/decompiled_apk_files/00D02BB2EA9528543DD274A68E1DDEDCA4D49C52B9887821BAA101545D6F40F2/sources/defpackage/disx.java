package defpackage;
/* compiled from: PG */
/* renamed from: disx  reason: default package */
/* loaded from: classes6.dex */
public enum disx implements dsrb {
    UNKNOWN_STATUS(0),
    SUCCESS(1),
    LONGER_SHARE_ALREADY_PRESENT(2),
    FAILURE(3),
    CANNOT_SHARE_WITH_SELF(4),
    BLOCKED(5);
    
    private final int g;

    disx(int i) {
        this.g = i;
    }

    public static disx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return LONGER_SHARE_ALREADY_PRESENT;
            }
            if (i == 3) {
                return FAILURE;
            }
            if (i == 4) {
                return CANNOT_SHARE_WITH_SELF;
            }
            if (i == 5) {
                return BLOCKED;
            }
            return null;
        }
        return UNKNOWN_STATUS;
    }

    public static dsrd c() {
        return disw.a;
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
