package defpackage;
/* compiled from: PG */
/* renamed from: dosq  reason: default package */
/* loaded from: classes6.dex */
public enum dosq implements dsrb {
    VOTE_UNKNOWN(0),
    VOTE_INCORRECT(1),
    VOTE_CORRECT(2),
    VOTE_ABSTAIN(3);
    
    public final int e;

    dosq(int i) {
        this.e = i;
    }

    public static dosq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VOTE_INCORRECT;
            }
            if (i == 2) {
                return VOTE_CORRECT;
            }
            if (i == 3) {
                return VOTE_ABSTAIN;
            }
            return null;
        }
        return VOTE_UNKNOWN;
    }

    public static dsrd c() {
        return dosp.a;
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
