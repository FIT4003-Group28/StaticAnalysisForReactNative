package defpackage;
/* compiled from: PG */
/* renamed from: dggc  reason: default package */
/* loaded from: classes.dex */
public enum dggc implements dsrb {
    UNKNOWN(0),
    TOUR(1),
    PANO(2),
    PHOTO(3),
    VIDEO(4);
    
    public final int f;

    dggc(int i) {
        this.f = i;
    }

    public static dggc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TOUR;
            }
            if (i == 2) {
                return PANO;
            }
            if (i == 3) {
                return PHOTO;
            }
            if (i == 4) {
                return VIDEO;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dggb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
