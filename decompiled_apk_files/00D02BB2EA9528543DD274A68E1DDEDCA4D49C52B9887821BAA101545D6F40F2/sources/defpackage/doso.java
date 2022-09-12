package defpackage;
/* compiled from: PG */
/* renamed from: doso  reason: default package */
/* loaded from: classes6.dex */
public enum doso implements dsrb {
    VOTE_REASON_UNKNOWN(0),
    VOTE_REASON_SPAM(1),
    VOTE_REASON_OFFENSIVE(2),
    VOTE_REASON_OTHER(3),
    VOTE_REASON_QUESTION_DISMISSED(4),
    VOTE_REASON_NOT_SUSPICIOUS(5),
    VOTE_REASON_BAD_FORMATTING(6),
    VOTE_REASON_UNHELPFUL(7);
    
    public final int i;

    doso(int i) {
        this.i = i;
    }

    public static doso b(int i) {
        switch (i) {
            case 0:
                return VOTE_REASON_UNKNOWN;
            case 1:
                return VOTE_REASON_SPAM;
            case 2:
                return VOTE_REASON_OFFENSIVE;
            case 3:
                return VOTE_REASON_OTHER;
            case 4:
                return VOTE_REASON_QUESTION_DISMISSED;
            case 5:
                return VOTE_REASON_NOT_SUSPICIOUS;
            case 6:
                return VOTE_REASON_BAD_FORMATTING;
            case 7:
                return VOTE_REASON_UNHELPFUL;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dosn.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
