package defpackage;
/* compiled from: PG */
/* renamed from: eoe  reason: default package */
/* loaded from: classes3.dex */
public enum eoe implements aopm {
    BACKGROUND_AUDIO_POLICY_UNSPECIFIED(0),
    BACKGROUND_AUDIO_POLICY_ON(1),
    BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES(2),
    BACKGROUND_AUDIO_POLICY_OFF(3);
    
    public final int e;

    eoe(int i) {
        this.e = i;
    }

    public static eoe a(int i) {
        if (i != 0) {
            if (i == 1) {
                return BACKGROUND_AUDIO_POLICY_ON;
            }
            if (i == 2) {
                return BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES;
            }
            if (i == 3) {
                return BACKGROUND_AUDIO_POLICY_OFF;
            }
            return null;
        }
        return BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
    }

    public static aopo b() {
        return dnn.i;
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
