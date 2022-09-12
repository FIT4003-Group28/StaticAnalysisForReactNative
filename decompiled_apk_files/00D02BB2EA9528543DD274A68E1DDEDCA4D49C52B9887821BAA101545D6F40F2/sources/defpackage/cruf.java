package defpackage;
/* compiled from: PG */
/* renamed from: cruf  reason: default package */
/* loaded from: classes5.dex */
public enum cruf implements dsrb {
    PRECHECK_STATUS_UNKNOWN(0),
    PRECHECK_ACCEPTED(1),
    PRECHECK_REJECTED_FILE_IS_NOT_IMAGE(2),
    PRECHECK_REJECTED_IMAGE_SIZE_TOO_SMALL(3),
    PRECHECK_REJECTED_URI_ERROR(4),
    PRECHECK_REJECTED_DUPLICATE(5),
    PRECHECK_REJECTED_SQLITE_ERROR(6),
    PRECHECK_REJECTED_FILE_TOO_BIG(7),
    PRECHECK_REJECTED_INVALID_ARGUMENT(8),
    PRECHECK_REJECTED_UNICORN_ACCOUNT(9),
    PRECHECK_REJECTED_CLIENTSIDE_METADATA_LIMIT_EXCEEDED(10);
    
    public final int l;

    cruf(int i) {
        this.l = i;
    }

    public static cruf b(int i) {
        switch (i) {
            case 0:
                return PRECHECK_STATUS_UNKNOWN;
            case 1:
                return PRECHECK_ACCEPTED;
            case 2:
                return PRECHECK_REJECTED_FILE_IS_NOT_IMAGE;
            case 3:
                return PRECHECK_REJECTED_IMAGE_SIZE_TOO_SMALL;
            case 4:
                return PRECHECK_REJECTED_URI_ERROR;
            case 5:
                return PRECHECK_REJECTED_DUPLICATE;
            case 6:
                return PRECHECK_REJECTED_SQLITE_ERROR;
            case 7:
                return PRECHECK_REJECTED_FILE_TOO_BIG;
            case 8:
                return PRECHECK_REJECTED_INVALID_ARGUMENT;
            case 9:
                return PRECHECK_REJECTED_UNICORN_ACCOUNT;
            case 10:
                return PRECHECK_REJECTED_CLIENTSIDE_METADATA_LIMIT_EXCEEDED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return crue.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
