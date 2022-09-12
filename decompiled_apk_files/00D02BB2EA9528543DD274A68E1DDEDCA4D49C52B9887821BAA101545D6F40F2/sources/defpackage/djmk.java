package defpackage;
/* compiled from: PG */
/* renamed from: djmk  reason: default package */
/* loaded from: classes6.dex */
public enum djmk implements dsrb {
    UNKNOWN_VISIBILITY(0),
    ALWAYS_SHOW(1),
    SHOW_ONLY_WHEN_APPLIED(2),
    SHOW_AS_VALUE_SELECTOR(3);
    
    public final int e;

    djmk(int i) {
        this.e = i;
    }

    public static djmk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ALWAYS_SHOW;
            }
            if (i == 2) {
                return SHOW_ONLY_WHEN_APPLIED;
            }
            if (i == 3) {
                return SHOW_AS_VALUE_SELECTOR;
            }
            return null;
        }
        return UNKNOWN_VISIBILITY;
    }

    public static dsrd c() {
        return djmj.a;
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
