package defpackage;
/* compiled from: PG */
/* renamed from: dhew  reason: default package */
/* loaded from: classes6.dex */
public enum dhew implements dsrb {
    UNKNOWN_PROFILE_STATE(0),
    ADMIN_BLOCKED(1),
    DELETED(2),
    CORE_ID(3),
    DASHER_ADMIN_DISABLED(4),
    USER_TO_USER_BLOCKED(5),
    UNRECOGNIZED(-1);
    
    public static final dsrc<dhew> h = new dsrc<dhew>() { // from class: dhev
        @Override // defpackage.dsrc
        public final /* bridge */ /* synthetic */ dhew a(int i) {
            return dhew.b(i);
        }
    };
    private final int i;

    dhew(int i) {
        this.i = i;
    }

    public static dhew b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ADMIN_BLOCKED;
            }
            if (i == 2) {
                return DELETED;
            }
            if (i == 3) {
                return CORE_ID;
            }
            if (i == 4) {
                return DASHER_ADMIN_DISABLED;
            }
            if (i == 5) {
                return USER_TO_USER_BLOCKED;
            }
            return null;
        }
        return UNKNOWN_PROFILE_STATE;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
