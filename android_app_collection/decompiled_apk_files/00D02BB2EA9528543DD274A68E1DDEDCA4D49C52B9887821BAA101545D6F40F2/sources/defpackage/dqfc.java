package defpackage;
/* compiled from: PG */
/* renamed from: dqfc  reason: default package */
/* loaded from: classes6.dex */
public enum dqfc implements dsrb {
    UNKNOWN_VISIBILITY(0),
    PUBLIC(1),
    PRIVATE(2);
    
    public final int d;

    dqfc(int i) {
        this.d = i;
    }

    public static dqfc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PUBLIC;
            }
            if (i == 2) {
                return PRIVATE;
            }
            return null;
        }
        return UNKNOWN_VISIBILITY;
    }

    public static dsrd c() {
        return dqfb.a;
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
