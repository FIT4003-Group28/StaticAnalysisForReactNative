package defpackage;
/* compiled from: PG */
/* renamed from: dvmh  reason: default package */
/* loaded from: classes.dex */
public enum dvmh implements dsrb {
    UNKNOWN_BUTTON_ORDER(0),
    BUTTON_COUNTERFACTUAL(1),
    BUTTON_BEFORE_CALL(2),
    BUTTON_AFTER_CALL(3),
    BUTTON_LAST(4);
    
    private final int f;

    dvmh(int i) {
        this.f = i;
    }

    public static dvmh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BUTTON_COUNTERFACTUAL;
            }
            if (i == 2) {
                return BUTTON_BEFORE_CALL;
            }
            if (i == 3) {
                return BUTTON_AFTER_CALL;
            }
            if (i == 4) {
                return BUTTON_LAST;
            }
            return null;
        }
        return UNKNOWN_BUTTON_ORDER;
    }

    public static dsrd c() {
        return dvmg.a;
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
