package defpackage;
/* compiled from: PG */
/* renamed from: arjm  reason: default package */
/* loaded from: classes2.dex */
public enum arjm implements aopm {
    INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN(0),
    INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER(1),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED(2),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_WITH_CAPTION_CONTROL(3),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION(4),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION(5);
    
    private final int h;

    arjm(int i) {
        this.h = i;
    }

    public static aopo a() {
        return arfp.r;
    }

    public static arjm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER;
            }
            if (i == 2) {
                return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED;
            }
            if (i == 3) {
                return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_WITH_CAPTION_CONTROL;
            }
            if (i == 4) {
                return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION;
            }
            if (i == 5) {
                return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION;
            }
            return null;
        }
        return INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
