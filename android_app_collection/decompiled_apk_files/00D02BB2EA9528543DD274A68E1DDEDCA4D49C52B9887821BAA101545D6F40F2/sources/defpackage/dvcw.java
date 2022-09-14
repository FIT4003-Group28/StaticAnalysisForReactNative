package defpackage;
/* compiled from: PG */
/* renamed from: dvcw  reason: default package */
/* loaded from: classes6.dex */
public enum dvcw implements dsrb {
    UNKNOWN(0),
    SUCCESS(1),
    NOT_AUTHORIZED(2),
    NOT_FOUND(3),
    UNSUPPORTED(4),
    BAD_REQUEST(5),
    FAILURE(100);
    
    private final int h;

    dvcw(int i2) {
        this.h = i2;
    }

    public static dvcw b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return SUCCESS;
            }
            if (i2 == 2) {
                return NOT_AUTHORIZED;
            }
            if (i2 == 3) {
                return NOT_FOUND;
            }
            if (i2 == 4) {
                return UNSUPPORTED;
            }
            if (i2 == 5) {
                return BAD_REQUEST;
            }
            if (i2 == 100) {
                return FAILURE;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dvcv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
