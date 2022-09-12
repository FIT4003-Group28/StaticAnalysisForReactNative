package defpackage;
/* compiled from: PG */
/* renamed from: doxu  reason: default package */
/* loaded from: classes6.dex */
public enum doxu implements dsrb {
    PREPARE(0),
    ACT(1),
    SUCCESS(2),
    NOTE(3);
    
    private final int e;

    doxu(int i) {
        this.e = i;
    }

    public static doxu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ACT;
            }
            if (i == 2) {
                return SUCCESS;
            }
            if (i == 3) {
                return NOTE;
            }
            return null;
        }
        return PREPARE;
    }

    public static dsrd c() {
        return doxt.a;
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
