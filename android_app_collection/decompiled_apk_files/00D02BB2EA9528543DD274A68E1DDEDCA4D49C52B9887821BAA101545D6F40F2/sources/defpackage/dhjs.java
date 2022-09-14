package defpackage;
/* compiled from: PG */
/* renamed from: dhjs  reason: default package */
/* loaded from: classes6.dex */
public enum dhjs implements dsrb {
    DEFAULT_MAP_ONLY(0),
    MAP_AND_NAVIGATION_STATE(1),
    UNRECOGNIZED(-1);
    
    private final int d;

    dhjs(int i) {
        this.d = i;
    }

    public static dhjs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAP_AND_NAVIGATION_STATE;
            }
            return null;
        }
        return DEFAULT_MAP_ONLY;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
