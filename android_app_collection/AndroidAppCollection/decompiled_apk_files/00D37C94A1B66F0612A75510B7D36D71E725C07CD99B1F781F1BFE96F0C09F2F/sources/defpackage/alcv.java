package defpackage;
/* compiled from: PG */
/* renamed from: alcv  reason: default package */
/* loaded from: classes.dex */
public enum alcv implements aopm {
    UNKNOWN(0),
    NOT_CREATED(1),
    SUCCESS(2),
    FAILED(3),
    REJECTED(4),
    DELETED(5);
    
    public final int g;

    alcv(int i) {
        this.g = i;
    }

    public static alcv a(int i) {
        if (i != 0) {
            if (i == 1) {
                return NOT_CREATED;
            }
            if (i == 2) {
                return SUCCESS;
            }
            if (i == 3) {
                return FAILED;
            }
            if (i == 4) {
                return REJECTED;
            }
            if (i == 5) {
                return DELETED;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static aopo b() {
        return adzd.h;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
