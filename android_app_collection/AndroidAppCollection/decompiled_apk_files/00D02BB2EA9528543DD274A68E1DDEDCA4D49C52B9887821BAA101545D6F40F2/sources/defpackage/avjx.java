package defpackage;
/* compiled from: PG */
/* renamed from: avjx  reason: default package */
/* loaded from: classes3.dex */
public enum avjx implements dsrb {
    UNKNOWN_TIME_BUDGET(0),
    NO_TIME_BUDGET(1),
    BATTERY_BUDGET_IF_APPLICABLE(2);
    
    public final int d;

    avjx(int i) {
        this.d = i;
    }

    public static avjx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NO_TIME_BUDGET;
            }
            if (i == 2) {
                return BATTERY_BUDGET_IF_APPLICABLE;
            }
            return null;
        }
        return UNKNOWN_TIME_BUDGET;
    }

    public static dsrd c() {
        return avjw.a;
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
