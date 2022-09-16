package defpackage;
/* compiled from: PG */
/* renamed from: asbk  reason: default package */
/* loaded from: classes2.dex */
public enum asbk implements aopm {
    CODE_DELIVERY_METHOD_UNKNOWN(0),
    CODE_DELIVERY_METHOD_TEXT(1),
    CODE_DELIVERY_METHOD_CALL(2);
    
    public final int d;

    asbk(int i) {
        this.d = i;
    }

    public static aopo a() {
        return arpt.l;
    }

    public static asbk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CODE_DELIVERY_METHOD_TEXT;
            }
            if (i == 2) {
                return CODE_DELIVERY_METHOD_CALL;
            }
            return null;
        }
        return CODE_DELIVERY_METHOD_UNKNOWN;
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
