package defpackage;
/* compiled from: PG */
/* renamed from: dgaj  reason: default package */
/* loaded from: classes6.dex */
public enum dgaj implements dsrb {
    STATE_UNSPECIFIED(0),
    UNREGISTERED(1),
    ENABLED(2),
    DISABLED(3),
    UNSUPPORTED(4),
    TEMPORARILY_UNAVAILABLE(5);
    
    public final int g;

    dgaj(int i) {
        this.g = i;
    }

    public static dgaj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UNREGISTERED;
            }
            if (i == 2) {
                return ENABLED;
            }
            if (i == 3) {
                return DISABLED;
            }
            if (i == 4) {
                return UNSUPPORTED;
            }
            if (i == 5) {
                return TEMPORARILY_UNAVAILABLE;
            }
            return null;
        }
        return STATE_UNSPECIFIED;
    }

    public static dsrd c() {
        return dgai.a;
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
