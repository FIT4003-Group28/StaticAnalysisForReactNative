package defpackage;
/* compiled from: PG */
/* renamed from: dwrx  reason: default package */
/* loaded from: classes6.dex */
public enum dwrx implements dsrb {
    UNKNOWN_UGC_TASKS_VIEWPORT_CAMERA_TYPE(0),
    INITIAL(1),
    PLACES_CENTERED(2);
    
    public final int d;

    dwrx(int i) {
        this.d = i;
    }

    public static dwrx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INITIAL;
            }
            if (i == 2) {
                return PLACES_CENTERED;
            }
            return null;
        }
        return UNKNOWN_UGC_TASKS_VIEWPORT_CAMERA_TYPE;
    }

    public static dsrd c() {
        return dwrw.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
