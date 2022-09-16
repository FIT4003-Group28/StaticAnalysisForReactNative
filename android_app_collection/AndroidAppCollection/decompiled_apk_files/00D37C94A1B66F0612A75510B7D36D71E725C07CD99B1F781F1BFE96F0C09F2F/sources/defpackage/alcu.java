package defpackage;
/* compiled from: PG */
/* renamed from: alcu  reason: default package */
/* loaded from: classes.dex */
public enum alcu implements aopm {
    UNKNOWN_UPLOAD(0),
    NORMAL_UPLOAD(1),
    FEEDBACK_ONLY_UPLOAD(3),
    REELS_UPLOAD(4),
    LIVE_HIGHLIGHT_UPLOAD(6),
    SHORTS_UPLOAD(7);
    
    public final int g;

    alcu(int i) {
        this.g = i;
    }

    public static alcu a(int i) {
        if (i != 0) {
            if (i == 1) {
                return NORMAL_UPLOAD;
            }
            if (i == 3) {
                return FEEDBACK_ONLY_UPLOAD;
            }
            if (i == 4) {
                return REELS_UPLOAD;
            }
            if (i == 6) {
                return LIVE_HIGHLIGHT_UPLOAD;
            }
            if (i == 7) {
                return SHORTS_UPLOAD;
            }
            return null;
        }
        return UNKNOWN_UPLOAD;
    }

    public static aopo b() {
        return adzd.g;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
