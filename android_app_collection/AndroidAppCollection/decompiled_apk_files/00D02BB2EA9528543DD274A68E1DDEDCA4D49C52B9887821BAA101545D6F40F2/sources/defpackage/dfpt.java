package defpackage;
/* compiled from: PG */
/* renamed from: dfpt  reason: default package */
/* loaded from: classes6.dex */
public enum dfpt implements dsrb {
    UNKNOWN_SEMANTIC_RATING(0),
    TOP_RATED(1);
    
    public final int c;

    dfpt(int i) {
        this.c = i;
    }

    public static dfpt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TOP_RATED;
            }
            return null;
        }
        return UNKNOWN_SEMANTIC_RATING;
    }

    public static dsrd c() {
        return dfps.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
