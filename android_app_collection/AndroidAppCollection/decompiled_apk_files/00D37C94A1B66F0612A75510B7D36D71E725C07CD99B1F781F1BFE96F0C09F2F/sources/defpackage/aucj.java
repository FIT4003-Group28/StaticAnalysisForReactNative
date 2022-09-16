package defpackage;
/* compiled from: PG */
/* renamed from: aucj  reason: default package */
/* loaded from: classes2.dex */
public enum aucj implements aopm {
    PAGE_SOURCE_UNKNOWN(0),
    PAGE_SOURCE_PLAYLIST_SUGGESTIONS(1);
    
    private final int d;

    aucj(int i) {
        this.d = i;
    }

    public static aopo a() {
        return auca.f;
    }

    public static aucj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PAGE_SOURCE_PLAYLIST_SUGGESTIONS;
            }
            return null;
        }
        return PAGE_SOURCE_UNKNOWN;
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
