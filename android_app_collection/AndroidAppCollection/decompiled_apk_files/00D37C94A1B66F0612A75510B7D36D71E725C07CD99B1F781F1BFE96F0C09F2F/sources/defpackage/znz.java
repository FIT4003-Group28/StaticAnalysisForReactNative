package defpackage;
/* compiled from: PG */
/* renamed from: znz  reason: default package */
/* loaded from: classes4.dex */
public final class znz extends ampf {
    @Override // defpackage.ampf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        awzz awzzVar = (awzz) obj;
        avxt avxtVar = avxt.COMMENT_STICKER_SOURCE_UNKNOWN;
        int ordinal = awzzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return avxt.COMMENT_STICKER_SOURCE_STORY_COMMENTS;
            }
            if (ordinal == 2) {
                return avxt.COMMENT_STICKER_SOURCE_VOD_COMMENTS;
            }
            if (ordinal == 3) {
                return avxt.COMMENT_STICKER_SOURCE_STORY_CAMERA;
            }
            String valueOf = String.valueOf(awzzVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return avxt.COMMENT_STICKER_SOURCE_UNKNOWN;
    }

    @Override // defpackage.ampf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        avxt avxtVar = (avxt) obj;
        awzz awzzVar = awzz.COMMENT_STICKER_SOURCE_UNKNOWN;
        int ordinal = avxtVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return awzz.COMMENT_STICKER_SOURCE_STORY_COMMENTS;
            }
            if (ordinal == 2) {
                return awzz.COMMENT_STICKER_SOURCE_VOD_COMMENTS;
            }
            if (ordinal == 3) {
                return awzz.COMMENT_STICKER_SOURCE_STORY_CAMERA;
            }
            String valueOf = String.valueOf(avxtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return awzz.COMMENT_STICKER_SOURCE_UNKNOWN;
    }
}
