package defpackage;
/* compiled from: PG */
/* renamed from: asyf  reason: default package */
/* loaded from: classes2.dex */
public enum asyf implements aopm {
    GENERATION_STATUS_UNKNOWN(0),
    GENERATION_STATUS_DONE(1);
    
    public final int c;

    asyf(int i) {
        this.c = i;
    }

    public static aopo a() {
        return asut.t;
    }

    public static asyf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GENERATION_STATUS_DONE;
            }
            return null;
        }
        return GENERATION_STATUS_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
