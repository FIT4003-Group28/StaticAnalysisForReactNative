package defpackage;
/* compiled from: PG */
/* renamed from: orl  reason: default package */
/* loaded from: classes4.dex */
public enum orl implements aopm {
    TRACK_TYPE_AUDIO(1),
    TRACK_TYPE_VIDEO(2),
    TRACK_TYPE_TEXT(4);
    
    public final int d;

    orl(int i) {
        this.d = i;
    }

    public static orl a(int i) {
        if (i != 1) {
            if (i == 2) {
                return TRACK_TYPE_VIDEO;
            }
            if (i == 4) {
                return TRACK_TYPE_TEXT;
            }
            return null;
        }
        return TRACK_TYPE_AUDIO;
    }

    public static aopo b() {
        return dnn.l;
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
