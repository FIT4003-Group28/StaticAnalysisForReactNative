package defpackage;
/* compiled from: PG */
/* renamed from: dddn  reason: default package */
/* loaded from: classes5.dex */
public enum dddn implements dsrb {
    UNKNOWN(0),
    PICK_INTENT(1),
    IMAGE_CAPTURE_INTENT(2),
    GMM_GALLERY(3),
    GMM_LIVE_CAMERA(4);
    
    public final int f;

    dddn(int i) {
        this.f = i;
    }

    public static dddn b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PICK_INTENT;
            }
            if (i == 2) {
                return IMAGE_CAPTURE_INTENT;
            }
            if (i == 3) {
                return GMM_GALLERY;
            }
            if (i == 4) {
                return GMM_LIVE_CAMERA;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dddm.a;
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
