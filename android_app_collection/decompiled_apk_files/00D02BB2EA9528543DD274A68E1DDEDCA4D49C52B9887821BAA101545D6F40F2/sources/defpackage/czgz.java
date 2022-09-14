package defpackage;
/* compiled from: PG */
/* renamed from: czgz  reason: default package */
/* loaded from: classes5.dex */
public enum czgz implements dsrb {
    UNKNOWN_TYPE(0),
    EMAIL(1),
    IN_APP_GAIA(2),
    IN_APP_PHONE(3),
    SMS(4),
    IN_APP_EMAIL(5),
    GROUP(6);
    
    public final int h;

    czgz(int i2) {
        this.h = i2;
    }

    public static czgz b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return EMAIL;
            case 2:
                return IN_APP_GAIA;
            case 3:
                return IN_APP_PHONE;
            case 4:
                return SMS;
            case 5:
                return IN_APP_EMAIL;
            case 6:
                return GROUP;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return czgy.a;
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
