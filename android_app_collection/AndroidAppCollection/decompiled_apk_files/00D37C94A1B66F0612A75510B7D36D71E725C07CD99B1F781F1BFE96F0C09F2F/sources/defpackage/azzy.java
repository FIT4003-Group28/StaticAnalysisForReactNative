package defpackage;
/* compiled from: PG */
/* renamed from: azzy  reason: default package */
/* loaded from: classes2.dex */
public enum azzy implements aopm {
    REQUEST_STATUS_UNSPECIFIED(0),
    SUCCEEDED(1),
    FAILED(2),
    CANCELED(3);
    
    public final int e;

    azzy(int i) {
        this.e = i;
    }

    public static aopo a() {
        return axce.r;
    }

    public static azzy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUCCEEDED;
            }
            if (i == 2) {
                return FAILED;
            }
            if (i == 3) {
                return CANCELED;
            }
            return null;
        }
        return REQUEST_STATUS_UNSPECIFIED;
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
