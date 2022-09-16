package defpackage;
/* compiled from: PG */
/* renamed from: awal  reason: default package */
/* loaded from: classes2.dex */
public enum awal implements aopm {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2);
    
    private final int e;

    awal(int i) {
        this.e = i;
    }

    public static aopo a() {
        return avxs.m;
    }

    public static awal b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WIFI;
            }
            if (i == 2) {
                return CELLULAR;
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
