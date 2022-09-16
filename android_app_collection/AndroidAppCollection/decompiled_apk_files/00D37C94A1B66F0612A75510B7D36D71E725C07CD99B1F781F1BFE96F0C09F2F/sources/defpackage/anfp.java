package defpackage;
/* compiled from: PG */
/* renamed from: anfp  reason: default package */
/* loaded from: classes.dex */
public enum anfp implements aopm {
    UNKNOWN_ALIGNMENT(0),
    DISABLED(1),
    ENABLED_NO_FILTERING(2),
    ENABLED_WITH_MEDIAN_FILTER(3);
    
    public static final int DISABLED_VALUE = 1;
    public static final int ENABLED_NO_FILTERING_VALUE = 2;
    public static final int ENABLED_WITH_MEDIAN_FILTER_VALUE = 3;
    public static final int UNKNOWN_ALIGNMENT_VALUE = 0;
    private static final aopn internalValueMap = new anfn();
    public final int value;

    anfp(int i) {
        this.value = i;
    }

    public static anfp a(int i) {
        if (i != 0) {
            if (i == 1) {
                return DISABLED;
            }
            if (i == 2) {
                return ENABLED_NO_FILTERING;
            }
            if (i == 3) {
                return ENABLED_WITH_MEDIAN_FILTER;
            }
            return null;
        }
        return UNKNOWN_ALIGNMENT;
    }

    public static aopo b() {
        return anfo.INSTANCE;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
