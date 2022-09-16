package defpackage;
/* compiled from: PG */
/* renamed from: dqcj  reason: default package */
/* loaded from: classes6.dex */
public enum dqcj implements dsrb {
    UNKNOWN_PLACE_QA_ENTRY_POINT(0),
    AGMM_TODOLIST(1),
    AGMM_PLACE_SHEET(2),
    AGMM_NOTIFICATION(3);
    
    public final int e;

    dqcj(int i) {
        this.e = i;
    }

    public static dqcj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return AGMM_TODOLIST;
            }
            if (i == 2) {
                return AGMM_PLACE_SHEET;
            }
            if (i == 3) {
                return AGMM_NOTIFICATION;
            }
            return null;
        }
        return UNKNOWN_PLACE_QA_ENTRY_POINT;
    }

    public static dsrd c() {
        return dqci.a;
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
