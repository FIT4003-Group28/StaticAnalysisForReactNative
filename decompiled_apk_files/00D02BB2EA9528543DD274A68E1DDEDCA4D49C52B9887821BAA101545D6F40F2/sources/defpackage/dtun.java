package defpackage;
/* compiled from: PG */
/* renamed from: dtun  reason: default package */
/* loaded from: classes6.dex */
public enum dtun implements dsrb {
    UNKNOWN(0),
    CLIENT_ACTIVITY_WAS_DESTROYED(1),
    CLIENT_ACTIVITY_WAS_FINISHING(2),
    CLIENT_ACTIVITY_WAS_NULL(3),
    INVALID_AUTH_PARAMS(10),
    INVALID_COMPLETION_STYLE(8),
    INVALID_PROMPT_STYLE(9),
    INVALID_SURVEY_DATA_TYPE(4),
    INVALID_SURVEY_PAYLOAD(5),
    SURVEY_ALREADY_RUNNING(6),
    SURVEY_EXPIRED(7),
    SURVEY_NOT_IN_KEY_WINDOW(11),
    VIEW_CONTROLLER_NOT_FULL_SIZE(12),
    UNRECOGNIZED(-1);
    
    private final int o;

    dtun(int i) {
        this.o = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
