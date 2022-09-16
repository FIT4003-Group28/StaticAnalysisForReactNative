package defpackage;
/* compiled from: PG */
/* renamed from: atyy  reason: default package */
/* loaded from: classes2.dex */
public enum atyy implements aopm {
    PLAYBACK_INTERRUPTION_TYPE_UNKNOWN(0),
    PLAYBACK_INTERRUPTION_TYPE_AUDIO_BECOMING_NOISY(1),
    PLAYBACK_INTERRUPTION_TYPE_POOR_NETWORK(2),
    PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION(3),
    PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED(4);
    
    public final int f;

    atyy(int i) {
        this.f = i;
    }

    public static aopo a() {
        return atti.r;
    }

    public static atyy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PLAYBACK_INTERRUPTION_TYPE_AUDIO_BECOMING_NOISY;
            }
            if (i == 2) {
                return PLAYBACK_INTERRUPTION_TYPE_POOR_NETWORK;
            }
            if (i == 3) {
                return PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION;
            }
            if (i == 4) {
                return PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED;
            }
            return null;
        }
        return PLAYBACK_INTERRUPTION_TYPE_UNKNOWN;
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
