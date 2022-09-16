package defpackage;
/* compiled from: PG */
/* renamed from: avuf  reason: default package */
/* loaded from: classes2.dex */
public enum avuf implements aopm {
    UPLOAD_CONTENT_SOURCE_UNKNOWN(0),
    UPLOAD_CONTENT_SOURCE_LOCAL(1),
    UPLOAD_CONTENT_SOURCE_NONLOCAL(2);
    
    public final int d;

    avuf(int i) {
        this.d = i;
    }

    public static aopo a() {
        return avge.u;
    }

    public static avuf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UPLOAD_CONTENT_SOURCE_LOCAL;
            }
            if (i == 2) {
                return UPLOAD_CONTENT_SOURCE_NONLOCAL;
            }
            return null;
        }
        return UPLOAD_CONTENT_SOURCE_UNKNOWN;
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
