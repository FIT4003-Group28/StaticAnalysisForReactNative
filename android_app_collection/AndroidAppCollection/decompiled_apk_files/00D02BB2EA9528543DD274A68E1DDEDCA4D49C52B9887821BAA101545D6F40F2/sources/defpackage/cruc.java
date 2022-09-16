package defpackage;
/* compiled from: PG */
/* renamed from: cruc  reason: default package */
/* loaded from: classes5.dex */
public enum cruc implements dsrb {
    PERMANENT_UNKNOWN(0),
    TRANSIENT_CLIENT_GENERIC_ERROR(1),
    TRANSIENT_CONNECTION_FAILURE(2),
    TRANSIENT_INVALID_SERVER_RESPONSE(3),
    TRANSIENT_TEMP_FILE_ACCESS_EXCEPTION(4),
    RECOVERABLE_AUTHENTICATION_FAILURE(5),
    RECOVERABLE_FILE_ACCESS_PERMISSION_EXCEPTION(6),
    PERMANENT_CLIENT_GENERIC_ERROR(7),
    PERMANENT_AUTHENTICATION_FAILURE(8),
    PERMANENT_INVALID_ARGUMENTS(9),
    PERMANENT_FILE_ACCESS_EXCEPTION(10),
    PERMANENT_REQUEST_INITIALIZATION_IO_EXCEPTION(11),
    PERMANENT_REQUEST_EXPIRED(15),
    TRANSIENT_SERVER_GENERIC_ERROR(12),
    PERMANENT_SERVER_GENERIC_ERROR(13),
    PERMANENT_PS_DUPLICATE_PHOTO(14);
    
    public final int q;

    cruc(int i) {
        this.q = i;
    }

    public static cruc b(int i) {
        switch (i) {
            case 0:
                return PERMANENT_UNKNOWN;
            case 1:
                return TRANSIENT_CLIENT_GENERIC_ERROR;
            case 2:
                return TRANSIENT_CONNECTION_FAILURE;
            case 3:
                return TRANSIENT_INVALID_SERVER_RESPONSE;
            case 4:
                return TRANSIENT_TEMP_FILE_ACCESS_EXCEPTION;
            case 5:
                return RECOVERABLE_AUTHENTICATION_FAILURE;
            case 6:
                return RECOVERABLE_FILE_ACCESS_PERMISSION_EXCEPTION;
            case 7:
                return PERMANENT_CLIENT_GENERIC_ERROR;
            case 8:
                return PERMANENT_AUTHENTICATION_FAILURE;
            case 9:
                return PERMANENT_INVALID_ARGUMENTS;
            case 10:
                return PERMANENT_FILE_ACCESS_EXCEPTION;
            case 11:
                return PERMANENT_REQUEST_INITIALIZATION_IO_EXCEPTION;
            case 12:
                return TRANSIENT_SERVER_GENERIC_ERROR;
            case 13:
                return PERMANENT_SERVER_GENERIC_ERROR;
            case 14:
                return PERMANENT_PS_DUPLICATE_PHOTO;
            case 15:
                return PERMANENT_REQUEST_EXPIRED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return crub.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
