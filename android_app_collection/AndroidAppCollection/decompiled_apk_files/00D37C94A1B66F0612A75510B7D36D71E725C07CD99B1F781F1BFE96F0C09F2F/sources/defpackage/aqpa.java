package defpackage;
/* compiled from: PG */
/* renamed from: aqpa  reason: default package */
/* loaded from: classes2.dex */
public enum aqpa implements aopm {
    FILTER_TYPE_UNSPECIFIED(0),
    FILTER_TYPE_NONE(1),
    FILTER_TYPE_PLAYLISTS_ONLY(2),
    FILTER_TYPE_VIDEOS_ONLY(3);
    
    public final int e;

    aqpa(int i) {
        this.e = i;
    }

    public static aopo a() {
        return aqov.d;
    }

    public static aqpa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FILTER_TYPE_NONE;
            }
            if (i == 2) {
                return FILTER_TYPE_PLAYLISTS_ONLY;
            }
            if (i == 3) {
                return FILTER_TYPE_VIDEOS_ONLY;
            }
            return null;
        }
        return FILTER_TYPE_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
