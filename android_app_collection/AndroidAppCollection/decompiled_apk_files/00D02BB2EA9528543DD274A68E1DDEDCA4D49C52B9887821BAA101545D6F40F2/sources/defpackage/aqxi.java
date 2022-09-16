package defpackage;
/* compiled from: PG */
/* renamed from: aqxi  reason: default package */
/* loaded from: classes2.dex */
public enum aqxi implements dsrb {
    UNKNOWN_MESSAGING_APP(0),
    GMM(1),
    GMB(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    aqxi(int i) {
        this.e = i;
    }

    public static aqxi b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GMM;
            }
            if (i == 2) {
                return GMB;
            }
            return null;
        }
        return UNKNOWN_MESSAGING_APP;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
