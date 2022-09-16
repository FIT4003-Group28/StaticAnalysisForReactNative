package defpackage;
/* compiled from: PG */
/* renamed from: aouu  reason: default package */
/* loaded from: classes.dex */
public enum aouu implements aopm {
    UNKNOWN_CODEC(0),
    AAC(1),
    VORBIS(2),
    OPUS(3),
    DTSHD(4),
    EAC3(5),
    PCM(6),
    AC3(7),
    SPEEX(8),
    MP3(9),
    MP2(10),
    AMR(11);
    
    public final int m;

    aouu(int i) {
        this.m = i;
    }

    public static aopo a() {
        return aotr.i;
    }

    public static aouu b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CODEC;
            case 1:
                return AAC;
            case 2:
                return VORBIS;
            case 3:
                return OPUS;
            case 4:
                return DTSHD;
            case 5:
                return EAC3;
            case 6:
                return PCM;
            case 7:
                return AC3;
            case 8:
                return SPEEX;
            case 9:
                return MP3;
            case 10:
                return MP2;
            case 11:
                return AMR;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
