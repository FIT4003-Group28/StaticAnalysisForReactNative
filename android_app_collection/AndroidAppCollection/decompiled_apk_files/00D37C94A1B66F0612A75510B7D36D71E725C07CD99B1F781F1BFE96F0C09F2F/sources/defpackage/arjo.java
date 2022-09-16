package defpackage;
/* compiled from: PG */
/* renamed from: arjo  reason: default package */
/* loaded from: classes2.dex */
public enum arjo implements aopm {
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN(0),
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT(1),
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_MAXIMIZED_WATCH_ON_EXIT(2);
    
    private final int e;

    arjo(int i) {
        this.e = i;
    }

    public static aopo a() {
        return arfp.t;
    }

    public static arjo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT;
            }
            if (i == 2) {
                return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_MAXIMIZED_WATCH_ON_EXIT;
            }
            return null;
        }
        return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
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
