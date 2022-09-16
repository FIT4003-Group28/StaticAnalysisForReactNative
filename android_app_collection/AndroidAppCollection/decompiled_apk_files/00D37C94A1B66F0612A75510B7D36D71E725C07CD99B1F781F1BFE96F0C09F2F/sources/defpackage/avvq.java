package defpackage;
/* compiled from: PG */
/* renamed from: avvq  reason: default package */
/* loaded from: classes2.dex */
public enum avvq implements aopm {
    USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN(0),
    USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST(1),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER(2),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER(3),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO(4);
    
    public final int f;

    avvq(int i) {
        this.f = i;
    }

    public static aopo a() {
        return avuh.q;
    }

    public static avvq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST;
            }
            if (i == 2) {
                return USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
            }
            if (i == 3) {
                return USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER;
            }
            if (i == 4) {
                return USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO;
            }
            return null;
        }
        return USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN;
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
