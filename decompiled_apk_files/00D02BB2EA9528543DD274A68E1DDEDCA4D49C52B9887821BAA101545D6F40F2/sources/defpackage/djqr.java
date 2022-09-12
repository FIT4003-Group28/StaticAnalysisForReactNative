package defpackage;
/* compiled from: PG */
/* renamed from: djqr  reason: default package */
/* loaded from: classes6.dex */
public enum djqr implements dsrb {
    DEFAULT_RANKING_STRATEGY(0),
    CLOSEST(1);
    
    public final int c;

    djqr(int i) {
        this.c = i;
    }

    public static djqr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CLOSEST;
            }
            return null;
        }
        return DEFAULT_RANKING_STRATEGY;
    }

    public static dsrd c() {
        return djqq.a;
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
