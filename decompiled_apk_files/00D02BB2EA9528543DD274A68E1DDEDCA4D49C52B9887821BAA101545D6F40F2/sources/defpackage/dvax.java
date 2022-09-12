package defpackage;
/* compiled from: PG */
/* renamed from: dvax  reason: default package */
/* loaded from: classes6.dex */
public enum dvax implements dsrb {
    UNKNOWN(0),
    NO_DATA(1),
    STOP(2),
    ACTIVITY(3),
    TRAVEL(4);
    
    public final int f;

    dvax(int i) {
        this.f = i;
    }

    public static dvax b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NO_DATA;
            }
            if (i == 2) {
                return STOP;
            }
            if (i == 3) {
                return ACTIVITY;
            }
            if (i == 4) {
                return TRAVEL;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dvaw.a;
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
