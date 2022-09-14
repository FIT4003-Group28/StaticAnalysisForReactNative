package defpackage;
/* compiled from: PG */
/* renamed from: dvdm  reason: default package */
/* loaded from: classes.dex */
public enum dvdm implements dsrb {
    UNKNOWN_CAMERA_TYPE(0),
    CAMERA_3D(1),
    CAMERA_2D_NORTH_UP(2),
    CAMERA_2D_HEADING_UP(3);
    
    public final int e;

    dvdm(int i) {
        this.e = i;
    }

    public static dvdm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CAMERA_3D;
            }
            if (i == 2) {
                return CAMERA_2D_NORTH_UP;
            }
            if (i == 3) {
                return CAMERA_2D_HEADING_UP;
            }
            return null;
        }
        return UNKNOWN_CAMERA_TYPE;
    }

    public static dsrd c() {
        return dvdl.a;
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
