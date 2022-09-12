package defpackage;
/* compiled from: PG */
/* renamed from: ddit  reason: default package */
/* loaded from: classes5.dex */
public enum ddit implements dsrb {
    ALL_CLEAR(0),
    AGMM_ON_MAP_INTERACTION_NO_LOGGED_LABEL(1),
    AGMM_ON_MAP_INTERACTION_LABEL_GONE_FROM_SNAPSHOT(2),
    AGMM_ON_MAP_INTERACTION_LABEL_HAD_DIFFERENT_ID_IN_SNAPSHOT(3);
    
    public final int e;

    ddit(int i) {
        this.e = i;
    }

    public static ddit b(int i) {
        if (i != 0) {
            if (i == 1) {
                return AGMM_ON_MAP_INTERACTION_NO_LOGGED_LABEL;
            }
            if (i == 2) {
                return AGMM_ON_MAP_INTERACTION_LABEL_GONE_FROM_SNAPSHOT;
            }
            if (i == 3) {
                return AGMM_ON_MAP_INTERACTION_LABEL_HAD_DIFFERENT_ID_IN_SNAPSHOT;
            }
            return null;
        }
        return ALL_CLEAR;
    }

    public static dsrd c() {
        return ddis.a;
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
