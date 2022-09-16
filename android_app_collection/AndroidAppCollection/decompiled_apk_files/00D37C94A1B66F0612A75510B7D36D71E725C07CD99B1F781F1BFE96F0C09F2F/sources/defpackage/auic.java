package defpackage;
/* compiled from: PG */
/* renamed from: auic  reason: default package */
/* loaded from: classes2.dex */
public enum auic implements aopm {
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE(2),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_ACTION_WEBSITE_URL(3),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL(4);
    
    private final int g;

    auic(int i) {
        this.g = i;
    }

    public static aopo a() {
        return auca.u;
    }

    public static auic b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP;
            }
            if (i == 2) {
                return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
            }
            if (i == 3) {
                return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_ACTION_WEBSITE_URL;
            }
            if (i == 4) {
                return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL;
            }
            return null;
        }
        return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
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
