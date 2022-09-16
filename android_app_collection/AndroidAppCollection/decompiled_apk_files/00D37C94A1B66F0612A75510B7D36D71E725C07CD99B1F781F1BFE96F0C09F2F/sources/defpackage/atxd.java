package defpackage;
/* compiled from: PG */
/* renamed from: atxd  reason: default package */
/* loaded from: classes2.dex */
public enum atxd implements aopm {
    PHOTO_UPLOAD_STATUS_UNSPECIFIED(0),
    PHOTO_UPLOAD_STATUS_UPLOADING(1),
    PHOTO_UPLOAD_STATUS_FAILED(2);
    
    public final int d;

    atxd(int i) {
        this.d = i;
    }

    public static aopo a() {
        return atti.i;
    }

    public static atxd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PHOTO_UPLOAD_STATUS_UPLOADING;
            }
            if (i == 2) {
                return PHOTO_UPLOAD_STATUS_FAILED;
            }
            return null;
        }
        return PHOTO_UPLOAD_STATUS_UNSPECIFIED;
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
