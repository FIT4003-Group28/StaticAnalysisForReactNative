package defpackage;
/* compiled from: PG */
/* renamed from: cyei  reason: default package */
/* loaded from: classes5.dex */
public enum cyei {
    EMPTY(3),
    PARTIAL(2),
    FULL(1);
    
    public final int d;

    cyei(int i) {
        this.d = i;
    }

    public final int a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal != 2) {
                throw new AssertionError(this);
            }
            return 4;
        }
        return 2;
    }
}
