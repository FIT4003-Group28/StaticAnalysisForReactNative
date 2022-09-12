package defpackage;
/* compiled from: PG */
/* renamed from: dmti  reason: default package */
/* loaded from: classes.dex */
public enum dmti implements dsrb {
    WORLD_ENCODING_UNKNOWN(0),
    WORLD_ENCODING_LAT_LNG_E7(3),
    WORLD_ENCODING_LAT_LNG_DOUBLE(4),
    SCREEN_SPACE_FLOAT(5),
    WORLD_ENCODING_MAX_PRECISION_DELTA_VARINT(6);
    
    public final int f;

    dmti(int i) {
        this.f = i;
    }

    public static dmti b(int i) {
        if (i != 0) {
            if (i == 3) {
                return WORLD_ENCODING_LAT_LNG_E7;
            }
            if (i == 4) {
                return WORLD_ENCODING_LAT_LNG_DOUBLE;
            }
            if (i == 5) {
                return SCREEN_SPACE_FLOAT;
            }
            if (i == 6) {
                return WORLD_ENCODING_MAX_PRECISION_DELTA_VARINT;
            }
            return null;
        }
        return WORLD_ENCODING_UNKNOWN;
    }

    public static dsrd c() {
        return dmth.a;
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
