package defpackage;
/* compiled from: PG */
/* renamed from: djlz  reason: default package */
/* loaded from: classes6.dex */
public enum djlz implements dsrb {
    UNKNOWN_SEMANTIC_TIME(0),
    ANY_TIME(1);
    
    public final int c;

    djlz(int i) {
        this.c = i;
    }

    public static djlz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANY_TIME;
            }
            return null;
        }
        return UNKNOWN_SEMANTIC_TIME;
    }

    public static dsrd c() {
        return djly.a;
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
