package defpackage;
/* compiled from: PG */
/* renamed from: dvrm  reason: default package */
/* loaded from: classes6.dex */
public enum dvrm implements dsrb {
    UNKNOWN_ELEMENT(0),
    COUNTER(1),
    TIMELINE_LINK(2),
    MORE_QUESTIONS(3),
    DONE_BUTTON(4),
    OOPS_MESSAGE(5),
    THANKS_MESSAGE(6),
    LOCAL_GUIDE_OPT_IN_LINK(7),
    SEARCH_TERMS(8),
    PLACES_COUNTER(9);
    
    public final int k;

    dvrm(int i) {
        this.k = i;
    }

    public static dvrm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ELEMENT;
            case 1:
                return COUNTER;
            case 2:
                return TIMELINE_LINK;
            case 3:
                return MORE_QUESTIONS;
            case 4:
                return DONE_BUTTON;
            case 5:
                return OOPS_MESSAGE;
            case 6:
                return THANKS_MESSAGE;
            case 7:
                return LOCAL_GUIDE_OPT_IN_LINK;
            case 8:
                return SEARCH_TERMS;
            case 9:
                return PLACES_COUNTER;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dvrl.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
