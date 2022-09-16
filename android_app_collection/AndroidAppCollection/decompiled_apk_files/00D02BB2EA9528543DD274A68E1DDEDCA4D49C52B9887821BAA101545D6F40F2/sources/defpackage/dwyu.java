package defpackage;
/* compiled from: PG */
/* renamed from: dwyu  reason: default package */
/* loaded from: classes6.dex */
public enum dwyu implements dsrb {
    MY_LOCATION(0),
    OFFLINE_MAP(1),
    SEARCH_RESULT(2),
    DIRECTIONS_ENDPOINT(3),
    PREFETCH_INTENT(4);
    
    public final int f;

    dwyu(int i) {
        this.f = i;
    }

    public static dwyu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFLINE_MAP;
            }
            if (i == 2) {
                return SEARCH_RESULT;
            }
            if (i == 3) {
                return DIRECTIONS_ENDPOINT;
            }
            if (i == 4) {
                return PREFETCH_INTENT;
            }
            return null;
        }
        return MY_LOCATION;
    }

    public static dsrd c() {
        return dwyt.a;
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
