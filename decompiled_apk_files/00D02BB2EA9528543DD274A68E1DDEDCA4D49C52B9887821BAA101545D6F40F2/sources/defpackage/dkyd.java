package defpackage;
/* compiled from: PG */
/* renamed from: dkyd  reason: default package */
/* loaded from: classes6.dex */
public enum dkyd implements dsrb {
    UNKNOWN_REVIEW_VOTE_MODE(0),
    THUMBS_UP_HELPFUL(1),
    YES_OR_NO_PROMPT(2),
    THUMBS_UP_HELPFUL_COUNT_INSIDE_BUTTON(3),
    YES_OR_NO_COUNT_INSIDE_BUTTON(4),
    YES_OR_NO_PROMPT_ONE_LINE(5);
    
    private final int g;

    dkyd(int i) {
        this.g = i;
    }

    public static dkyd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return THUMBS_UP_HELPFUL;
            }
            if (i == 2) {
                return YES_OR_NO_PROMPT;
            }
            if (i == 3) {
                return THUMBS_UP_HELPFUL_COUNT_INSIDE_BUTTON;
            }
            if (i == 4) {
                return YES_OR_NO_COUNT_INSIDE_BUTTON;
            }
            if (i == 5) {
                return YES_OR_NO_PROMPT_ONE_LINE;
            }
            return null;
        }
        return UNKNOWN_REVIEW_VOTE_MODE;
    }

    public static dsrd c() {
        return dkyc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
