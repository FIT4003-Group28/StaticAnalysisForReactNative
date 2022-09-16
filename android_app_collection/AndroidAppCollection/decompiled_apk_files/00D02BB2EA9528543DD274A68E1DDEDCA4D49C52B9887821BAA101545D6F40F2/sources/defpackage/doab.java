package defpackage;
/* compiled from: PG */
/* renamed from: doab  reason: default package */
/* loaded from: classes6.dex */
public enum doab implements dsrb {
    PRIOR_RESEARCH_UNKNOWN(0),
    PRIOR_RESEARCH_CALLED_PHONE(1),
    PRIOR_RESEARCH_VISITED_WEBSITE(2),
    PRIOR_RESEARCH_DID_SEARCH(3),
    PRIOR_RESEARCH_VISITED_PLACESHEET(4);
    
    public final int f;

    doab(int i) {
        this.f = i;
    }

    public static doab b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRIOR_RESEARCH_CALLED_PHONE;
            }
            if (i == 2) {
                return PRIOR_RESEARCH_VISITED_WEBSITE;
            }
            if (i == 3) {
                return PRIOR_RESEARCH_DID_SEARCH;
            }
            if (i == 4) {
                return PRIOR_RESEARCH_VISITED_PLACESHEET;
            }
            return null;
        }
        return PRIOR_RESEARCH_UNKNOWN;
    }

    public static dsrd c() {
        return doaa.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
