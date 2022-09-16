package defpackage;
/* compiled from: PG */
/* renamed from: djjn  reason: default package */
/* loaded from: classes6.dex */
public enum djjn implements dsrb {
    UNKNOWN_ATTRACTION_CATEGORY(0),
    ARTS_AND_CULTURE(1),
    HISTORY(2),
    OUTDOORS(3);
    
    private final int e;

    djjn(int i) {
        this.e = i;
    }

    public static djjn b(int i) {
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
        return UNKNOWN_ATTRACTION_CATEGORY;
    }

    public static dsrd c() {
        return djjm.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
