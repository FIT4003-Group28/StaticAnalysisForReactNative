package defpackage;
/* compiled from: PG */
/* renamed from: dpaz  reason: default package */
/* loaded from: classes6.dex */
public enum dpaz implements dsrb {
    SUMMARY(1),
    STEPS(2),
    DRAGGING(3),
    TURN_BY_TURN(4),
    MIXED(5);
    
    public final int f;

    dpaz(int i) {
        this.f = i;
    }

    public static dpaz b(int i) {
        if (i != 1) {
            if (i == 2) {
                return STEPS;
            }
            if (i == 3) {
                return DRAGGING;
            }
            if (i == 4) {
                return TURN_BY_TURN;
            }
            if (i == 5) {
                return MIXED;
            }
            return null;
        }
        return SUMMARY;
    }

    public static dsrd c() {
        return dpay.a;
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
