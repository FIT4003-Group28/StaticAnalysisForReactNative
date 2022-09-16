package defpackage;
/* compiled from: PG */
/* renamed from: aqos  reason: default package */
/* loaded from: classes2.dex */
public enum aqos implements aopm {
    REQUEST_TYPE_UNSPECIFIED(0),
    REQUEST_TYPE_FILTER_CHANGE(1),
    REQUEST_TYPE_EXPANSION(2);
    
    public final int d;

    aqos(int i) {
        this.d = i;
    }

    public static aopo a() {
        return aqov.b;
    }

    public static aqos b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REQUEST_TYPE_FILTER_CHANGE;
            }
            if (i == 2) {
                return REQUEST_TYPE_EXPANSION;
            }
            return null;
        }
        return REQUEST_TYPE_UNSPECIFIED;
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
