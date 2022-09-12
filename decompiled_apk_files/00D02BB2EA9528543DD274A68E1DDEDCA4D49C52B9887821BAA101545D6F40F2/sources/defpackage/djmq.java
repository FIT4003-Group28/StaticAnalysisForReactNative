package defpackage;
/* compiled from: PG */
/* renamed from: djmq  reason: default package */
/* loaded from: classes6.dex */
public enum djmq implements dsrb {
    UNKNOWN_SEMANTIC_LEVEL(0),
    CHEAP(1),
    UPSCALE(2);
    
    private final int d;

    djmq(int i) {
        this.d = i;
    }

    public static djmq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CHEAP;
            }
            if (i == 2) {
                return UPSCALE;
            }
            return null;
        }
        return UNKNOWN_SEMANTIC_LEVEL;
    }

    public static dsrd c() {
        return djmp.a;
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
