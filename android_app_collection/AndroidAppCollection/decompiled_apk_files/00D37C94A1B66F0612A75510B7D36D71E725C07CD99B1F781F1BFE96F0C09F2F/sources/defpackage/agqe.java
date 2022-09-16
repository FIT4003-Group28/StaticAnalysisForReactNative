package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: agqe  reason: default package */
/* loaded from: classes.dex */
public enum agqe {
    DELETED(-1),
    COMPLETE(0),
    ACTIVE(1),
    FAILED_UNKNOWN(2),
    NO_STORAGE_ERROR(3),
    DISK_IO_ERROR(4),
    NETWORK_READ_ERROR(5),
    CANNOT_OFFLINE(6),
    PAUSED(7),
    STREAM_DOWNLOAD_PENDING(8),
    REQUIRES_CONTENT_VERIFICATION(9),
    CONTENT_VERIFICATION_FAILED(10),
    STREAM_CORRUPT(11),
    METADATA_ONLY(12),
    STREAMS_OUT_OF_DATE(13);
    
    static final SparseArray p = new SparseArray();
    public final int q;

    static {
        agqe[] values;
        for (agqe agqeVar : values()) {
            p.put(agqeVar.q, agqeVar);
        }
    }

    agqe(int i) {
        this.q = i;
    }

    public static agqe a(int i) {
        return (agqe) p.get(i);
    }

    public final boolean b() {
        return (this == PAUSED || this == ACTIVE) ? false : true;
    }
}
