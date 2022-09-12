package defpackage;
/* compiled from: PG */
/* renamed from: dgpu  reason: default package */
/* loaded from: classes6.dex */
public enum dgpu implements dsrb {
    LOCAL(0),
    MAPS(1),
    REPORT_A_PROBLEM(2),
    ADD_A_PLACE(3),
    PROFILE(4),
    COVER(5);
    
    public final int g;

    dgpu(int i) {
        this.g = i;
    }

    public static dgpu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAPS;
            }
            if (i == 2) {
                return REPORT_A_PROBLEM;
            }
            if (i == 3) {
                return ADD_A_PLACE;
            }
            if (i == 4) {
                return PROFILE;
            }
            if (i == 5) {
                return COVER;
            }
            return null;
        }
        return LOCAL;
    }

    public static dsrd c() {
        return dgpt.a;
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
