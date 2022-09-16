package defpackage;
/* compiled from: PG */
/* renamed from: aqow  reason: default package */
/* loaded from: classes2.dex */
public enum aqow implements aopm {
    REQUEST_TYPE_UNSPECIFIED(0),
    REQUEST_TYPE_LOADING(1);
    
    public final int c;

    aqow(int i) {
        this.c = i;
    }

    public static aopo a() {
        return aqov.a;
    }

    public static aqow b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REQUEST_TYPE_LOADING;
            }
            return null;
        }
        return REQUEST_TYPE_UNSPECIFIED;
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
