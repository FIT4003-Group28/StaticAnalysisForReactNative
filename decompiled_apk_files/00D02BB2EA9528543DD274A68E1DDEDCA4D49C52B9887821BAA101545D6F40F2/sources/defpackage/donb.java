package defpackage;
/* compiled from: PG */
/* renamed from: donb  reason: default package */
/* loaded from: classes6.dex */
public enum donb implements dsrb {
    UNKNOWN_PROVENANCE(0),
    DEFAULT(1),
    EXPLICIT(2),
    INFERRED(3);
    
    public final int e;

    donb(int i) {
        this.e = i;
    }

    public static donb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return EXPLICIT;
            }
            if (i == 3) {
                return INFERRED;
            }
            return null;
        }
        return UNKNOWN_PROVENANCE;
    }

    public static dsrd c() {
        return dona.a;
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
