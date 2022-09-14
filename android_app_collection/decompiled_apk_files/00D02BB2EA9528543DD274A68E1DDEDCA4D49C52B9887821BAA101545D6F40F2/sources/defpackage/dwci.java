package defpackage;
/* compiled from: PG */
/* renamed from: dwci  reason: default package */
/* loaded from: classes6.dex */
public enum dwci implements dsrb {
    UNKNOWN_RELATION_CATEGORY(0),
    INDEPENDENT_ESTABLISHMENT_IN(1),
    INDEPENDENT_ESTABLISHMENTS(2),
    DEPARTMENT_OF(3),
    DEPARTMENTS(4),
    REFUEL_FACILITY_HOSTED_BY(5),
    VOTING_FACILITY_IN(6),
    VOTING_FACILITIES(7);
    
    private final int i;

    dwci(int i) {
        this.i = i;
    }

    public static dwci b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RELATION_CATEGORY;
            case 1:
                return INDEPENDENT_ESTABLISHMENT_IN;
            case 2:
                return INDEPENDENT_ESTABLISHMENTS;
            case 3:
                return DEPARTMENT_OF;
            case 4:
                return DEPARTMENTS;
            case 5:
                return REFUEL_FACILITY_HOSTED_BY;
            case 6:
                return VOTING_FACILITY_IN;
            case 7:
                return VOTING_FACILITIES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwch.a;
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
