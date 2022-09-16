package defpackage;
/* compiled from: PG */
/* renamed from: arot  reason: default package */
/* loaded from: classes2.dex */
public enum arot implements aopm {
    CAMERA_UNKNOWN(0),
    CAMERA_NONE(1),
    CAMERA_BACK(2),
    CAMERA_FRONT(3),
    CAMERA_FRONT_AND_BACK(4);
    
    public final int f;

    arot(int i) {
        this.f = i;
    }

    public static aopo a() {
        return arka.p;
    }

    public static arot b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CAMERA_NONE;
            }
            if (i == 2) {
                return CAMERA_BACK;
            }
            if (i == 3) {
                return CAMERA_FRONT;
            }
            if (i == 4) {
                return CAMERA_FRONT_AND_BACK;
            }
            return null;
        }
        return CAMERA_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
