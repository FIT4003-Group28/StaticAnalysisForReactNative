package defpackage;
/* compiled from: PG */
/* renamed from: dgab  reason: default package */
/* loaded from: classes6.dex */
public enum dgab implements dsrb {
    UNKNOWN_CALL_TRACKING_STATUS(0),
    INELIGIBLE(1),
    ELIGIBLE_FOR_ONBOARDING(2),
    TRACKING(3),
    PAUSED(4),
    TRACKING_AND_DISABLE_PAUSE(5),
    TREATMENT_CARD_CLICKED(6),
    ELIGIBLE_FOR_WAITLIST(7),
    WAITLISTED(8);
    
    public final int j;

    dgab(int i) {
        this.j = i;
    }

    public static dgab b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CALL_TRACKING_STATUS;
            case 1:
                return INELIGIBLE;
            case 2:
                return ELIGIBLE_FOR_ONBOARDING;
            case 3:
                return TRACKING;
            case 4:
                return PAUSED;
            case 5:
                return TRACKING_AND_DISABLE_PAUSE;
            case 6:
                return TREATMENT_CARD_CLICKED;
            case 7:
                return ELIGIBLE_FOR_WAITLIST;
            case 8:
                return WAITLISTED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgaa.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
