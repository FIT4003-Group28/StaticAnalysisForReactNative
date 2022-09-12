package defpackage;
/* compiled from: PG */
/* renamed from: dltl  reason: default package */
/* loaded from: classes6.dex */
public enum dltl implements dsrb {
    USER_DEFINED(0),
    MIGRATED_DEPRECATED(1),
    EXPLICIT_HOME_WORK(2),
    INFERRED_HOME_WORK(3),
    CURRENT_LOCATION(4),
    OTHER_IMPLICIT(5),
    TRIP(6),
    DYNAMIC_PADDING(7);
    
    private final int i;

    dltl(int i) {
        this.i = i;
    }

    public static dltl b(int i) {
        switch (i) {
            case 0:
                return USER_DEFINED;
            case 1:
                return MIGRATED_DEPRECATED;
            case 2:
                return EXPLICIT_HOME_WORK;
            case 3:
                return INFERRED_HOME_WORK;
            case 4:
                return CURRENT_LOCATION;
            case 5:
                return OTHER_IMPLICIT;
            case 6:
                return TRIP;
            case 7:
                return DYNAMIC_PADDING;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dltk.a;
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
