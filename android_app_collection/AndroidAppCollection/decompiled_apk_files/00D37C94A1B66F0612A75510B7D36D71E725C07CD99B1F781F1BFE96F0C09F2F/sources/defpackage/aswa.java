package defpackage;
/* compiled from: PG */
/* renamed from: aswa  reason: default package */
/* loaded from: classes2.dex */
public enum aswa implements aopm {
    LOGGING_QUEUE_TYPE_UNKNOWN(0),
    LOGGING_QUEUE_TYPE_PIXIE_DUST(1),
    LOGGING_QUEUE_TYPE_CACHE_METADATA(2);
    
    public final int d;

    aswa(int i) {
        this.d = i;
    }

    public static aopo a() {
        return asut.h;
    }

    public static aswa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LOGGING_QUEUE_TYPE_PIXIE_DUST;
            }
            if (i == 2) {
                return LOGGING_QUEUE_TYPE_CACHE_METADATA;
            }
            return null;
        }
        return LOGGING_QUEUE_TYPE_UNKNOWN;
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
