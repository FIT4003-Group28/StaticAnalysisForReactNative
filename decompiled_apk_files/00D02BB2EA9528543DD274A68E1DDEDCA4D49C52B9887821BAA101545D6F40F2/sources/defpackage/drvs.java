package defpackage;
/* compiled from: PG */
/* renamed from: drvs  reason: default package */
/* loaded from: classes6.dex */
public enum drvs implements dsrb {
    DEVICE_STATE_UNKNOWN(0),
    TRUE(1),
    FALSE(2);
    
    public final int d;

    drvs(int i) {
        this.d = i;
    }

    public static drvs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRUE;
            }
            if (i == 2) {
                return FALSE;
            }
            return null;
        }
        return DEVICE_STATE_UNKNOWN;
    }

    public static dsrd c() {
        return drvr.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
