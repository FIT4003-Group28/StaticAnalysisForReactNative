package defpackage;
/* compiled from: PG */
/* renamed from: dpft  reason: default package */
/* loaded from: classes6.dex */
public enum dpft implements dsrb {
    UNKNOWN_TICK_MARK_TYPE(0),
    LONG(1),
    SHORT(2);
    
    private final int d;

    dpft(int i) {
        this.d = i;
    }

    public static dpft b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LONG;
            }
            if (i == 2) {
                return SHORT;
            }
            return null;
        }
        return UNKNOWN_TICK_MARK_TYPE;
    }

    public static dsrd c() {
        return dpfs.a;
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
