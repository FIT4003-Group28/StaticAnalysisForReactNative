package defpackage;
/* compiled from: PG */
/* renamed from: avyq  reason: default package */
/* loaded from: classes2.dex */
public enum avyq implements aopm {
    DOWNLOAD_STATE_UNKNOWN(0),
    DOWNLOAD_STATE_NOT_DOWNLOADED(1),
    DOWNLOAD_STATE_PENDING_DOWNLOAD(2),
    DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS(3),
    DOWNLOAD_STATE_COMPLETE(4),
    DOWNLOAD_STATE_FAILED(5),
    DOWNLOAD_STATE_PAUSED(6),
    DOWNLOAD_STATE_RETRYABLE_FAILURE(7);
    
    public final int i;

    avyq(int i) {
        this.i = i;
    }

    public static aopo a() {
        return avxs.j;
    }

    public static avyq b(int i) {
        switch (i) {
            case 0:
                return DOWNLOAD_STATE_UNKNOWN;
            case 1:
                return DOWNLOAD_STATE_NOT_DOWNLOADED;
            case 2:
                return DOWNLOAD_STATE_PENDING_DOWNLOAD;
            case 3:
                return DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
            case 4:
                return DOWNLOAD_STATE_COMPLETE;
            case 5:
                return DOWNLOAD_STATE_FAILED;
            case 6:
                return DOWNLOAD_STATE_PAUSED;
            case 7:
                return DOWNLOAD_STATE_RETRYABLE_FAILURE;
            default:
                return null;
        }
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
