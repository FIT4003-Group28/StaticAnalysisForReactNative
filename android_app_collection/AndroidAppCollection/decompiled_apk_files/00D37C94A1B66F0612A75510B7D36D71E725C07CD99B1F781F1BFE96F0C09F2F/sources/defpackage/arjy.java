package defpackage;
/* compiled from: PG */
/* renamed from: arjy  reason: default package */
/* loaded from: classes2.dex */
public enum arjy implements aopm {
    INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN(0),
    INLINE_PLAYBACK_TRIGGER_STYLE_USER(1);
    
    private final int d;

    arjy(int i) {
        this.d = i;
    }

    public static aopo a() {
        return arfp.u;
    }

    public static arjy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INLINE_PLAYBACK_TRIGGER_STYLE_USER;
            }
            return null;
        }
        return INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
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
