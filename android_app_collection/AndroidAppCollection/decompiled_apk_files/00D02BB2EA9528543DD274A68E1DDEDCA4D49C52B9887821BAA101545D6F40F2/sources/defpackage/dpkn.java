package defpackage;
/* compiled from: PG */
/* renamed from: dpkn  reason: default package */
/* loaded from: classes6.dex */
public enum dpkn implements dsrb {
    UNKNOWN_LABEL_CONTENT_LOCATION(0),
    PRIMARY(1),
    SECONDARY(2);
    
    public final int d;

    dpkn(int i) {
        this.d = i;
    }

    public static dpkn b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRIMARY;
            }
            if (i == 2) {
                return SECONDARY;
            }
            return null;
        }
        return UNKNOWN_LABEL_CONTENT_LOCATION;
    }

    public static dsrd c() {
        return dpkm.a;
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
