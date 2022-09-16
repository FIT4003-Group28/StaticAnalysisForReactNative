package defpackage;
/* compiled from: PG */
/* renamed from: avxu  reason: default package */
/* loaded from: classes2.dex */
public enum avxu implements aopm {
    EFFECT_SUBPACKAGE_ID_UNSPECIFIED(0),
    EFFECT_SUBPACKAGE_ID_EXPRESSIVE(1),
    EFFECT_SUBPACKAGE_ID_PRESET(2);
    
    public final int d;

    avxu(int i) {
        this.d = i;
    }

    public static aopo a() {
        return avxs.c;
    }

    public static avxu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
            }
            if (i == 2) {
                return EFFECT_SUBPACKAGE_ID_PRESET;
            }
            return null;
        }
        return EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
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
