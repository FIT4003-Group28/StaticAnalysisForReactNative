package defpackage;
/* compiled from: PG */
/* renamed from: dvvl  reason: default package */
/* loaded from: classes6.dex */
public enum dvvl implements dsrb {
    UNKNOWN(0),
    SUCCESS(1),
    LOCATION_NOT_FOUND(2),
    SERVER_ERROR(3),
    REQUEST_ERROR(4),
    INVALID_USER_ERROR(5),
    XSRF_VALIDATION_ERROR(6);
    
    public final int h;

    dvvl(int i2) {
        this.h = i2;
    }

    public static dvvl b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return SUCCESS;
            case 2:
                return LOCATION_NOT_FOUND;
            case 3:
                return SERVER_ERROR;
            case 4:
                return REQUEST_ERROR;
            case 5:
                return INVALID_USER_ERROR;
            case 6:
                return XSRF_VALIDATION_ERROR;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dvvk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
