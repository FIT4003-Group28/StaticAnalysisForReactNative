package defpackage;
/* compiled from: PG */
/* renamed from: dugu  reason: default package */
/* loaded from: classes6.dex */
public enum dugu implements dsrb {
    UNKNOWN_CATEGORY(0),
    ARTS_AND_CULTURE(1),
    HISTORY(2),
    OUTDOORS(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    dugu(int i) {
        this.f = i;
    }

    public static dugu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ARTS_AND_CULTURE;
            }
            if (i == 2) {
                return HISTORY;
            }
            if (i == 3) {
                return OUTDOORS;
            }
            return null;
        }
        return UNKNOWN_CATEGORY;
    }

    public static dsrd c() {
        return dugt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
