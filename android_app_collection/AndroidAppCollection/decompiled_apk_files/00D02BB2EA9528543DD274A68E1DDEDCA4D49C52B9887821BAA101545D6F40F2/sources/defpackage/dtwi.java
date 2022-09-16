package defpackage;
/* compiled from: PG */
/* renamed from: dtwi  reason: default package */
/* loaded from: classes6.dex */
public enum dtwi implements dsrb {
    UNKNOWN(0),
    BACKEND_TIMEOUT(1),
    FAILED_TO_FETCH_SURVEY(2),
    NO_AVAILABLE_SURVEY(3),
    TRIGGER_ID_NOT_SET(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    dtwi(int i) {
        this.g = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
