package defpackage;
/* compiled from: PG */
/* renamed from: awuy  reason: default package */
/* loaded from: classes2.dex */
public enum awuy implements aopm {
    UNKNOWN(0),
    UNMETERED_WIFI(1),
    UNMETERED_WIFI_OR_UNMETERED_MOBILE(2),
    ANY(3);
    
    public final int e;

    awuy(int i) {
        this.e = i;
    }

    public static aopo a() {
        return awsi.h;
    }

    public static awuy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UNMETERED_WIFI;
            }
            if (i == 2) {
                return UNMETERED_WIFI_OR_UNMETERED_MOBILE;
            }
            if (i == 3) {
                return ANY;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
