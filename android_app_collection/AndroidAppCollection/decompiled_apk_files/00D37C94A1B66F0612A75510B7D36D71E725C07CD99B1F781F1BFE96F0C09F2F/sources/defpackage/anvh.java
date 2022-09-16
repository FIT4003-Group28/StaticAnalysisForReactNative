package defpackage;
/* compiled from: PG */
/* renamed from: anvh  reason: default package */
/* loaded from: classes.dex */
public enum anvh implements aopm {
    NOT_ASKED(0),
    PREVIOUSLY_DENIED(1),
    PREVIOUSLY_GRANTED(2),
    GRANTED(3),
    DENIED(4);
    
    public final int f;

    anvh(int i) {
        this.f = i;
    }

    public static anvh a(int i) {
        if (i != 0) {
            if (i == 1) {
                return PREVIOUSLY_DENIED;
            }
            if (i == 2) {
                return PREVIOUSLY_GRANTED;
            }
            if (i == 3) {
                return GRANTED;
            }
            if (i == 4) {
                return DENIED;
            }
            return null;
        }
        return NOT_ASKED;
    }

    public static aopo b() {
        return anfo.k;
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
