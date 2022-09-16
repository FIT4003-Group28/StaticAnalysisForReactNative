package defpackage;
/* compiled from: PG */
/* renamed from: awkl  reason: default package */
/* loaded from: classes2.dex */
public enum awkl implements aopm {
    PLAYLIST_VISIBILITY_UNKNOWN(0),
    PLAYLIST_VISIBILITY_PUBLIC(1),
    PLAYLIST_VISIBILITY_PRIVATE(2),
    PLAYLIST_VISIBILITY_UNLISTED(3);
    
    private final int f;

    awkl(int i) {
        this.f = i;
    }

    public static aopo a() {
        return awkk.a;
    }

    public static awkl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PLAYLIST_VISIBILITY_PUBLIC;
            }
            if (i == 2) {
                return PLAYLIST_VISIBILITY_PRIVATE;
            }
            if (i == 3) {
                return PLAYLIST_VISIBILITY_UNLISTED;
            }
            return null;
        }
        return PLAYLIST_VISIBILITY_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
