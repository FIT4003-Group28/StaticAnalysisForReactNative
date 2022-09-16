package defpackage;
/* compiled from: PG */
/* renamed from: aown  reason: default package */
/* loaded from: classes.dex */
public enum aown implements aopm {
    ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS(1),
    ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED(2);
    
    public final int d;

    aown(int i) {
        this.d = i;
    }

    public static aopo a() {
        return aotr.p;
    }

    public static aown b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS;
            }
            if (i == 2) {
                return ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED;
            }
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN;
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
