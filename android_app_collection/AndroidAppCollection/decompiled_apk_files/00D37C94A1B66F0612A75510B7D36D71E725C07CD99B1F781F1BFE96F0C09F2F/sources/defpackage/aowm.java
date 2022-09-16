package defpackage;
/* compiled from: PG */
/* renamed from: aowm  reason: default package */
/* loaded from: classes.dex */
public enum aowm implements aopm {
    ACCOUNT_SELECTOR_EVENT_API_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION(1),
    ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION(2);
    
    public final int d;

    aowm(int i) {
        this.d = i;
    }

    public static aopo a() {
        return aotr.o;
    }

    public static aowm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION;
            }
            if (i == 2) {
                return ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION;
            }
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_API_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
