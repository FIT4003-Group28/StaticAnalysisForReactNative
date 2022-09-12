package defpackage;
/* compiled from: PG */
/* renamed from: ddvn  reason: default package */
/* loaded from: classes6.dex */
public enum ddvn implements dsrb {
    UNKNOWN(0),
    RAW(1),
    RAW_ONLY(2),
    CLIENT_SNAPPED(3),
    SERVER_SNAPPED(4),
    SERVER_UNSNAPPABLE(5),
    CLIENT_SNAPPED_ONLY(6);
    
    public final int h;

    ddvn(int i2) {
        this.h = i2;
    }

    public static ddvn b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return RAW;
            case 2:
                return RAW_ONLY;
            case 3:
                return CLIENT_SNAPPED;
            case 4:
                return SERVER_SNAPPED;
            case 5:
                return SERVER_UNSNAPPABLE;
            case 6:
                return CLIENT_SNAPPED_ONLY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return ddvm.a;
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
