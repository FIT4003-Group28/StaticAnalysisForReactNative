package defpackage;
/* compiled from: PG */
/* renamed from: aowo  reason: default package */
/* loaded from: classes.dex */
public enum aowo implements aopm {
    ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_TYPE_AUTO(1);
    
    public final int c;

    aowo(int i) {
        this.c = i;
    }

    public static aopo a() {
        return aotr.q;
    }

    public static aowo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ACCOUNT_SELECTOR_EVENT_TYPE_AUTO;
            }
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
