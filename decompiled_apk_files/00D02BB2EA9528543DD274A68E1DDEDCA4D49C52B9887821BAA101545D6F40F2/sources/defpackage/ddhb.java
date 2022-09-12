package defpackage;
/* compiled from: PG */
/* renamed from: ddhb  reason: default package */
/* loaded from: classes5.dex */
public enum ddhb implements dsrb {
    UNKNOWN(0),
    HOTEL(1),
    DINING(2),
    PARKING(3);
    
    public final int e;

    ddhb(int i) {
        this.e = i;
    }

    public static ddhb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HOTEL;
            }
            if (i == 2) {
                return DINING;
            }
            if (i == 3) {
                return PARKING;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return ddha.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
