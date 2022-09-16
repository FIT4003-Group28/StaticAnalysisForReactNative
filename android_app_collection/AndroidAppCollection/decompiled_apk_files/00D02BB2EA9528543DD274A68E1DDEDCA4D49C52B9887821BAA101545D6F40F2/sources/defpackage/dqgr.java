package defpackage;
/* compiled from: PG */
/* renamed from: dqgr  reason: default package */
/* loaded from: classes6.dex */
public enum dqgr implements dsrb {
    UNKNOWN_REVIEW_STATE(0),
    PUBLISHED(1),
    DRAFT(2);
    
    public final int d;

    dqgr(int i) {
        this.d = i;
    }

    public static dqgr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PUBLISHED;
            }
            if (i == 2) {
                return DRAFT;
            }
            return null;
        }
        return UNKNOWN_REVIEW_STATE;
    }

    public static dsrd c() {
        return dqgq.a;
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
