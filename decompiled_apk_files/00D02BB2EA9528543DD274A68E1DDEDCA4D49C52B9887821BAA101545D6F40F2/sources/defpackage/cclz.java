package defpackage;
/* compiled from: PG */
/* renamed from: cclz  reason: default package */
/* loaded from: classes4.dex */
public enum cclz implements dsrb {
    UNKNOWN_REPORT_PROBLEM_TYPE(0),
    EDIT_NAME(1),
    WRONG_NAME(2),
    INAPPROPRIATE_NAME(3),
    NOT_SERVED(4);
    
    public final int f;

    cclz(int i) {
        this.f = i;
    }

    public static cclz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EDIT_NAME;
            }
            if (i == 2) {
                return WRONG_NAME;
            }
            if (i == 3) {
                return INAPPROPRIATE_NAME;
            }
            if (i == 4) {
                return NOT_SERVED;
            }
            return null;
        }
        return UNKNOWN_REPORT_PROBLEM_TYPE;
    }

    public static dsrd c() {
        return ccly.a;
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
