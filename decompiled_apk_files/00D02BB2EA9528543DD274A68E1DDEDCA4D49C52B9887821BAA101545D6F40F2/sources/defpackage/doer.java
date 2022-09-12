package defpackage;
/* compiled from: PG */
/* renamed from: doer  reason: default package */
/* loaded from: classes6.dex */
public enum doer implements dsrb {
    NO_CONFIDENCE(0),
    LOW_CONFIDENCE(1),
    HIGH_CONFIDENCE(2);
    
    private final int d;

    doer(int i) {
        this.d = i;
    }

    public static doer b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LOW_CONFIDENCE;
            }
            if (i == 2) {
                return HIGH_CONFIDENCE;
            }
            return null;
        }
        return NO_CONFIDENCE;
    }

    public static dsrd c() {
        return doeq.a;
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
