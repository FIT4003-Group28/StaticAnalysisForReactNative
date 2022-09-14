package defpackage;
/* compiled from: PG */
/* renamed from: dgpm  reason: default package */
/* loaded from: classes6.dex */
public enum dgpm implements dsrb {
    UNKNOWN_EXCEPTION(0),
    AUTHENTICATION_FAILURE(1),
    INVALID_ARGUMENTS(2),
    ARGUMENT_PARSE_FAILURE(3),
    CONNECTION_FAILURE(4),
    UPLOAD_IO_EXCEPTION(6),
    NULL_STATUS_FAILURE(7),
    IMPORT_INVALID_RESPONSE_FAILURE(8),
    IMPORT_IO_EXCEPTION(9),
    DELETE_IO_EXCEPTION(10),
    AUTHENTICATION_IO_EXCEPTION(11),
    AUTHENTICATION_USER_RECOVERABLE_NOTIFIED_EXCEPTION(12),
    AUTHENTICATION_GOOGLE_AUTH_EXCEPTION(14),
    UPLOAD_FILENAME_IO_EXCEPTION(15),
    UPLOAD_REQUEST_INITIALIZATION_IO_EXCEPTION(16),
    UPLOAD_FILE_ACCESS_SECURITY_EXCEPTION(17),
    TEMP_URI_ACCESS_EXCEPTION(19),
    REQUEST_EXPIRED(20),
    GENERIC_FAILURE(5),
    AUTHENTICATION_UNKNOWN_EXCEPTION(13),
    INVALID_OFFERING_ATTACHMENT_EXCEPTION(18);
    
    public final int v;

    dgpm(int i) {
        this.v = i;
    }

    public static dgpm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EXCEPTION;
            case 1:
                return AUTHENTICATION_FAILURE;
            case 2:
                return INVALID_ARGUMENTS;
            case 3:
                return ARGUMENT_PARSE_FAILURE;
            case 4:
                return CONNECTION_FAILURE;
            case 5:
                return GENERIC_FAILURE;
            case 6:
                return UPLOAD_IO_EXCEPTION;
            case 7:
                return NULL_STATUS_FAILURE;
            case 8:
                return IMPORT_INVALID_RESPONSE_FAILURE;
            case 9:
                return IMPORT_IO_EXCEPTION;
            case 10:
                return DELETE_IO_EXCEPTION;
            case 11:
                return AUTHENTICATION_IO_EXCEPTION;
            case 12:
                return AUTHENTICATION_USER_RECOVERABLE_NOTIFIED_EXCEPTION;
            case 13:
                return AUTHENTICATION_UNKNOWN_EXCEPTION;
            case 14:
                return AUTHENTICATION_GOOGLE_AUTH_EXCEPTION;
            case 15:
                return UPLOAD_FILENAME_IO_EXCEPTION;
            case 16:
                return UPLOAD_REQUEST_INITIALIZATION_IO_EXCEPTION;
            case 17:
                return UPLOAD_FILE_ACCESS_SECURITY_EXCEPTION;
            case 18:
                return INVALID_OFFERING_ATTACHMENT_EXCEPTION;
            case 19:
                return TEMP_URI_ACCESS_EXCEPTION;
            case 20:
                return REQUEST_EXPIRED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgpl.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
