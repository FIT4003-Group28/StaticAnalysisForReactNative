package defpackage;
/* compiled from: PG */
/* renamed from: dfgu  reason: default package */
/* loaded from: classes6.dex */
public enum dfgu implements dsrb {
    NONE(0),
    STOPPED(1),
    RECALIBRATION(2),
    FULL_CALIBRATION(3),
    LOCALIZED(4),
    FAILED(5);
    
    public final int g;

    dfgu(int i) {
        this.g = i;
    }

    public static dfgu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STOPPED;
            }
            if (i == 2) {
                return RECALIBRATION;
            }
            if (i == 3) {
                return FULL_CALIBRATION;
            }
            if (i == 4) {
                return LOCALIZED;
            }
            if (i == 5) {
                return FAILED;
            }
            return null;
        }
        return NONE;
    }

    public static dsrd c() {
        return dfgt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
