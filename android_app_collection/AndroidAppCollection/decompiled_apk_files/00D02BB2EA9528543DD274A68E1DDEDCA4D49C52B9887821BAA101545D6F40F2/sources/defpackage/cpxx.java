package defpackage;
/* compiled from: PG */
/* renamed from: cpxx  reason: default package */
/* loaded from: classes5.dex */
public enum cpxx implements dsrb {
    UNKNOWN(0),
    ELIGIBLE(1),
    NOT_ELIGIBLE(2),
    ELIGIBLE_SHOW_DIALOG(3);
    
    private final int e;

    cpxx(int i) {
        this.e = i;
    }

    public static cpxx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ELIGIBLE;
            }
            if (i == 2) {
                return NOT_ELIGIBLE;
            }
            if (i == 3) {
                return ELIGIBLE_SHOW_DIALOG;
            }
            return null;
        }
        return UNKNOWN;
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
