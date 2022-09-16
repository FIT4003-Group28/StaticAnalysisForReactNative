package defpackage;
/* compiled from: PG */
/* renamed from: avuj  reason: default package */
/* loaded from: classes2.dex */
public enum avuj implements aopm {
    UPLOAD_FEATURE_UNKNOWN(0),
    UPLOAD_FEATURE_STREAMING(2),
    UPLOAD_FEATURE_PHOTO(3),
    UPLOAD_FEATURE_LOCAL_TRANSCODE_REQUIRED(4),
    UPLOAD_FEATURE_NO_STORAGE_PERMISSION(5),
    UPLOAD_FEATURE_COPY_FILE(6),
    UPLOAD_FEATURE_FETCH_REMOTE_FILE(7),
    UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO(8);
    
    public final int i;

    avuj(int i) {
        this.i = i;
    }

    public static aopo a() {
        return avuh.c;
    }

    public static avuj b(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return UPLOAD_FEATURE_STREAMING;
                case 3:
                    return UPLOAD_FEATURE_PHOTO;
                case 4:
                    return UPLOAD_FEATURE_LOCAL_TRANSCODE_REQUIRED;
                case 5:
                    return UPLOAD_FEATURE_NO_STORAGE_PERMISSION;
                case 6:
                    return UPLOAD_FEATURE_COPY_FILE;
                case 7:
                    return UPLOAD_FEATURE_FETCH_REMOTE_FILE;
                case 8:
                    return UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO;
                default:
                    return null;
            }
        }
        return UPLOAD_FEATURE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
