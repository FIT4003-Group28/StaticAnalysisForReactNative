package defpackage;
/* compiled from: PG */
/* renamed from: dfzg  reason: default package */
/* loaded from: classes6.dex */
public enum dfzg implements dsrb {
    UNKNOWN_ALERT_DISMISS_OPTION(0),
    BY_CLOSE_BUTTON(1),
    BY_OTHER_INTERACTIONS(2),
    NON_DISMISSABLE(3);
    
    private final int e;

    dfzg(int i) {
        this.e = i;
    }

    public static dfzg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BY_CLOSE_BUTTON;
            }
            if (i == 2) {
                return BY_OTHER_INTERACTIONS;
            }
            if (i == 3) {
                return NON_DISMISSABLE;
            }
            return null;
        }
        return UNKNOWN_ALERT_DISMISS_OPTION;
    }

    public static dsrd c() {
        return dfzf.a;
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
