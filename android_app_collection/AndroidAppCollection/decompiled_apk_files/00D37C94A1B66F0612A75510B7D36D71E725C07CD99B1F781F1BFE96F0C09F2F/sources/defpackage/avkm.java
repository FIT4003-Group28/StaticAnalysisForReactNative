package defpackage;
/* compiled from: PG */
/* renamed from: avkm  reason: default package */
/* loaded from: classes2.dex */
public enum avkm implements aopm {
    TRANSFER_FAILURE_REASON_UNKNOWN(0),
    TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE(1),
    TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE(2),
    TRANSFER_FAILURE_REASON_PLAYABILITY(3),
    TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES(4),
    TRANSFER_FAILURE_REASON_INTERNAL(5),
    TRANSFER_FAILURE_REASON_STREAM_MISSING(6),
    TRANSFER_FAILURE_REASON_SERVER(7),
    TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING(8),
    TRANSFER_FAILURE_REASON_NETWORK(9);
    
    public final int k;

    avkm(int i) {
        this.k = i;
    }

    public static aopo a() {
        return avge.p;
    }

    public static avkm b(int i) {
        switch (i) {
            case 0:
                return TRANSFER_FAILURE_REASON_UNKNOWN;
            case 1:
                return TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE;
            case 2:
                return TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE;
            case 3:
                return TRANSFER_FAILURE_REASON_PLAYABILITY;
            case 4:
                return TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES;
            case 5:
                return TRANSFER_FAILURE_REASON_INTERNAL;
            case 6:
                return TRANSFER_FAILURE_REASON_STREAM_MISSING;
            case 7:
                return TRANSFER_FAILURE_REASON_SERVER;
            case 8:
                return TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING;
            case 9:
                return TRANSFER_FAILURE_REASON_NETWORK;
            default:
                return null;
        }
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
