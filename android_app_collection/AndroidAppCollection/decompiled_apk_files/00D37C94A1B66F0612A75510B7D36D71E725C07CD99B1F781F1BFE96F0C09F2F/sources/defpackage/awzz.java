package defpackage;
/* compiled from: PG */
/* renamed from: awzz  reason: default package */
/* loaded from: classes2.dex */
public enum awzz implements aopm {
    COMMENT_STICKER_SOURCE_UNKNOWN(0),
    COMMENT_STICKER_SOURCE_STORY_COMMENTS(1),
    COMMENT_STICKER_SOURCE_VOD_COMMENTS(2),
    COMMENT_STICKER_SOURCE_STORY_CAMERA(3);
    
    public final int e;

    awzz(int i) {
        this.e = i;
    }

    public static aopo a() {
        return awsi.m;
    }

    public static awzz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return COMMENT_STICKER_SOURCE_STORY_COMMENTS;
            }
            if (i == 2) {
                return COMMENT_STICKER_SOURCE_VOD_COMMENTS;
            }
            if (i == 3) {
                return COMMENT_STICKER_SOURCE_STORY_CAMERA;
            }
            return null;
        }
        return COMMENT_STICKER_SOURCE_UNKNOWN;
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
