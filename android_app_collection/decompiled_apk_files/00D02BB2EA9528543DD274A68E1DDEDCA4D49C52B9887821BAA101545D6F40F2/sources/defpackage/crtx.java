package defpackage;
/* compiled from: PG */
/* renamed from: crtx  reason: default package */
/* loaded from: classes5.dex */
public enum crtx implements dsrb {
    UNKNOWN(0),
    PENDING(1),
    IN_PROGRESS(2),
    UPLOADED(3),
    IMPORTED(4),
    FAILED(5),
    TRANSIENT_ERROR(6),
    CANCELLED(7),
    DELETED(8),
    PUBLISHED(9),
    PREPROCESSING(10);
    
    public final int l;

    crtx(int i) {
        this.l = i;
    }

    public static crtx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PENDING;
            case 2:
                return IN_PROGRESS;
            case 3:
                return UPLOADED;
            case 4:
                return IMPORTED;
            case 5:
                return FAILED;
            case 6:
                return TRANSIENT_ERROR;
            case 7:
                return CANCELLED;
            case 8:
                return DELETED;
            case 9:
                return PUBLISHED;
            case 10:
                return PREPROCESSING;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return crtw.a;
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
