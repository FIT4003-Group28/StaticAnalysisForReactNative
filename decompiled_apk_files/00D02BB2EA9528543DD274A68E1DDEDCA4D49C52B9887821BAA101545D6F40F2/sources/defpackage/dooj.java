package defpackage;
/* compiled from: PG */
/* renamed from: dooj  reason: default package */
/* loaded from: classes.dex */
public enum dooj implements dsrb {
    UNKNOWN(0),
    TIMETABLE(1),
    METRO(2),
    LOCAL(3),
    MERGED_ALL(4);
    
    public final int f;

    dooj(int i) {
        this.f = i;
    }

    public static dooj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TIMETABLE;
            }
            if (i == 2) {
                return METRO;
            }
            if (i == 3) {
                return LOCAL;
            }
            if (i == 4) {
                return MERGED_ALL;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dooi.a;
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
