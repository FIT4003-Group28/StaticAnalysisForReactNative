package defpackage;
/* compiled from: PG */
/* renamed from: acjq  reason: default package */
/* loaded from: classes2.dex */
public enum acjq implements dsrb {
    UNKNOWN(0),
    ENTER(1),
    EXIT(2),
    DWELL(3);
    
    public final int e;

    acjq(int i) {
        this.e = i;
    }

    public static acjq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENTER;
            }
            if (i == 2) {
                return EXIT;
            }
            if (i == 3) {
                return DWELL;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return acjp.a;
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
