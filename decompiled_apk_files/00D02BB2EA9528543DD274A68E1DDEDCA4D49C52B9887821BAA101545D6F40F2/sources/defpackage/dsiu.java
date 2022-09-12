package defpackage;
/* compiled from: PG */
/* renamed from: dsiu  reason: default package */
/* loaded from: classes6.dex */
public enum dsiu implements dsrb {
    INTERNAL_EXTERNAL_STATE_UNSPECIFIED(0),
    INTERNAL(1),
    EXTERNAL(2);
    
    public final int d;

    dsiu(int i) {
        this.d = i;
    }

    public static dsiu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INTERNAL;
            }
            if (i == 2) {
                return EXTERNAL;
            }
            return null;
        }
        return INTERNAL_EXTERNAL_STATE_UNSPECIFIED;
    }

    public static dsrd c() {
        return dsit.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
