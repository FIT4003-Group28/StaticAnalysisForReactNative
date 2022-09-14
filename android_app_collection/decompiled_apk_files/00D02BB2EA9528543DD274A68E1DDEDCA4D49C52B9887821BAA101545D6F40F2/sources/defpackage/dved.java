package defpackage;
/* compiled from: PG */
/* renamed from: dved  reason: default package */
/* loaded from: classes6.dex */
public enum dved implements dsrb {
    UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM(0),
    UE3_ONLY(1),
    CLEARCUT_ONLY(2),
    UE3_AND_CLEARCUT(3);
    
    private final int e;

    dved(int i) {
        this.e = i;
    }

    public static dved b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UE3_ONLY;
            }
            if (i == 2) {
                return CLEARCUT_ONLY;
            }
            if (i == 3) {
                return UE3_AND_CLEARCUT;
            }
            return null;
        }
        return UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM;
    }

    public static dsrd c() {
        return dvec.a;
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
