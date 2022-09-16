package defpackage;
/* compiled from: PG */
/* renamed from: avuk  reason: default package */
/* loaded from: classes2.dex */
public enum avuk implements aopm {
    UPLOAD_FLOW_SOURCE_UNKNOWN(0),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY(1),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA(2),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA(3),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL(4),
    UPLOAD_FLOW_SOURCE_EXTERNAL(5),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY_REMOTE(6),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY(7),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_CAMERA(8),
    UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO(64);
    
    public final int k;

    avuk(int i) {
        this.k = i;
    }

    public static aopo a() {
        return avuh.e;
    }

    public static avuk b(int i) {
        if (i != 64) {
            switch (i) {
                case 0:
                    return UPLOAD_FLOW_SOURCE_UNKNOWN;
                case 1:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
                case 2:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA;
                case 3:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
                case 4:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
                case 5:
                    return UPLOAD_FLOW_SOURCE_EXTERNAL;
                case 6:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY_REMOTE;
                case 7:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY;
                case 8:
                    return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_CAMERA;
                default:
                    return null;
            }
        }
        return UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
