package defpackage;
/* compiled from: PG */
/* renamed from: dplf  reason: default package */
/* loaded from: classes6.dex */
public enum dplf implements dsrb {
    MAP(0),
    PANO(1),
    PHOTO(2),
    SATELLITE(3),
    TOUR(4),
    VIDEO(5);
    
    public final int g;

    dplf(int i) {
        this.g = i;
    }

    public static dplf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PANO;
            }
            if (i == 2) {
                return PHOTO;
            }
            if (i == 3) {
                return SATELLITE;
            }
            if (i == 4) {
                return TOUR;
            }
            if (i == 5) {
                return VIDEO;
            }
            return null;
        }
        return MAP;
    }

    public static dsrd c() {
        return dple.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
