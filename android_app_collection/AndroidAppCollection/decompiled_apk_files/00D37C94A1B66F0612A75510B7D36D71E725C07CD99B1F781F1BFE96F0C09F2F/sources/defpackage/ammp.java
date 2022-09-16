package defpackage;
/* compiled from: PG */
/* renamed from: ammp  reason: default package */
/* loaded from: classes.dex */
public enum ammp implements aopm {
    UNKNOWN(0),
    REALTIME(1),
    UPTIME(2);
    
    public final int d;

    ammp(int i) {
        this.d = i;
    }

    public static ammp a(int i) {
        if (i != 0) {
            if (i == 1) {
                return REALTIME;
            }
            if (i == 2) {
                return UPTIME;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static aopo b() {
        return adzd.m;
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
