package defpackage;
/* compiled from: PG */
/* renamed from: djjd  reason: default package */
/* loaded from: classes6.dex */
public enum djjd implements dsrb {
    UNKNOWN_PROPERTY_TYPE(0),
    NAME(1),
    START_DATETIME(2),
    END_DATETIME(3),
    EVENT_CATEGORY(4),
    EXPERIENCE_CATEGORY(9),
    LOCATION(5),
    WEBSITE(6),
    DESCRIPTION(7),
    OCCURRENCE_PATTERN(8);
    
    public final int k;

    djjd(int i) {
        this.k = i;
    }

    public static djjd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROPERTY_TYPE;
            case 1:
                return NAME;
            case 2:
                return START_DATETIME;
            case 3:
                return END_DATETIME;
            case 4:
                return EVENT_CATEGORY;
            case 5:
                return LOCATION;
            case 6:
                return WEBSITE;
            case 7:
                return DESCRIPTION;
            case 8:
                return OCCURRENCE_PATTERN;
            case 9:
                return EXPERIENCE_CATEGORY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return djjc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
