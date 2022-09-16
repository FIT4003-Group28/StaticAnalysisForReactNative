package defpackage;
/* compiled from: PG */
/* renamed from: ardw  reason: default package */
/* loaded from: classes2.dex */
public enum ardw implements aopm {
    GMS_DEVICE_CHECK_TYPE_UNKNOWN(0),
    GMS_DEVICE_CHECK_TYPE_SUCCESS(1),
    GMS_DEVICE_CHECK_TYPE_CONTINUE(2),
    GMS_DEVICE_CHECK_TYPE_FAILED(3),
    GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER(4);
    
    public final int f;

    ardw(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aqyp.u;
    }

    public static ardw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GMS_DEVICE_CHECK_TYPE_SUCCESS;
            }
            if (i == 2) {
                return GMS_DEVICE_CHECK_TYPE_CONTINUE;
            }
            if (i == 3) {
                return GMS_DEVICE_CHECK_TYPE_FAILED;
            }
            if (i == 4) {
                return GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER;
            }
            return null;
        }
        return GMS_DEVICE_CHECK_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
