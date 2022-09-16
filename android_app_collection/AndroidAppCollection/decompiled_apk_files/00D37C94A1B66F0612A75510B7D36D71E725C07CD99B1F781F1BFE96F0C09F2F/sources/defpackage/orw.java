package defpackage;
/* compiled from: PG */
/* renamed from: orw  reason: default package */
/* loaded from: classes4.dex */
public enum orw implements aopm {
    AUDIO_ROUTE_UNSPECIFIED(0),
    AUDIO_ROUTE_MUSIC(1),
    AUDIO_ROUTE_ALARM(2);
    
    public final int d;

    orw(int i) {
        this.d = i;
    }

    public static orw a(int i) {
        if (i != 0) {
            if (i == 1) {
                return AUDIO_ROUTE_MUSIC;
            }
            if (i == 2) {
                return AUDIO_ROUTE_ALARM;
            }
            return null;
        }
        return AUDIO_ROUTE_UNSPECIFIED;
    }

    public static aopo b() {
        return dnn.m;
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
