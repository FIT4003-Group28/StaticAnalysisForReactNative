package defpackage;
/* compiled from: PG */
/* renamed from: cykg  reason: default package */
/* loaded from: classes5.dex */
public enum cykg implements dsrb {
    UNKNOWN(0),
    YOUTUBE(1),
    PHOTOS(2),
    KABOO(3),
    SPACES(4),
    MAPS(5),
    NEWS_360(7),
    UNRECOGNIZED(-1);
    
    private final int i;

    cykg(int i) {
        this.i = i;
    }

    public static cykg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return YOUTUBE;
            }
            if (i == 2) {
                return PHOTOS;
            }
            if (i == 3) {
                return KABOO;
            }
            if (i == 4) {
                return SPACES;
            }
            if (i == 5) {
                return MAPS;
            }
            if (i == 7) {
                return NEWS_360;
            }
            return null;
        }
        return UNKNOWN;
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
