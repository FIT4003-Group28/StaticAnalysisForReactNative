package defpackage;
/* compiled from: PG */
/* renamed from: dqhy  reason: default package */
/* loaded from: classes6.dex */
public enum dqhy implements dsrb {
    UNKNOWN_STATUS_CODE(0),
    OK(1),
    INVALID_ARGUMENT(2),
    DEADLINE_EXCEEDED(3),
    NOT_FOUND(4),
    PERMISSION_DENIED(5),
    UNAVAILABLE(6),
    UNAUTHENTICATED(7);
    
    public final int i;

    dqhy(int i) {
        this.i = i;
    }

    public static dqhy b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS_CODE;
            case 1:
                return OK;
            case 2:
                return INVALID_ARGUMENT;
            case 3:
                return DEADLINE_EXCEEDED;
            case 4:
                return NOT_FOUND;
            case 5:
                return PERMISSION_DENIED;
            case 6:
                return UNAVAILABLE;
            case 7:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqhx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
