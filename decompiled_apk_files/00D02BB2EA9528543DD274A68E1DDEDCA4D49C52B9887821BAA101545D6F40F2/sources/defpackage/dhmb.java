package defpackage;
/* compiled from: PG */
/* renamed from: dhmb  reason: default package */
/* loaded from: classes6.dex */
public enum dhmb implements dsrb {
    UNKNOWN_ACTIVITY_TYPE(0),
    MAIN_ACTIVITY(1),
    LIMITED_ACTIVITY(2);
    
    public final int d;

    dhmb(int i) {
        this.d = i;
    }

    public static dhmb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAIN_ACTIVITY;
            }
            if (i == 2) {
                return LIMITED_ACTIVITY;
            }
            return null;
        }
        return UNKNOWN_ACTIVITY_TYPE;
    }

    public static dsrd c() {
        return dhma.a;
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
