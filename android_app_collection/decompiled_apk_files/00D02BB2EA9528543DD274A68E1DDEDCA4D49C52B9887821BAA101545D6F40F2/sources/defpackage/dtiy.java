package defpackage;
/* compiled from: PG */
/* renamed from: dtiy  reason: default package */
/* loaded from: classes6.dex */
public enum dtiy implements dsrb {
    FETCH_ON_DEMAND(0),
    GMM_PREFETCH_ON_STARTUP(1),
    GMM_PREFETCH_ON_RENDER(2),
    SPONTANEOUS_FETCH(3);
    
    public final int e;

    dtiy(int i) {
        this.e = i;
    }

    public static dtiy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GMM_PREFETCH_ON_STARTUP;
            }
            if (i == 2) {
                return GMM_PREFETCH_ON_RENDER;
            }
            if (i == 3) {
                return SPONTANEOUS_FETCH;
            }
            return null;
        }
        return FETCH_ON_DEMAND;
    }

    public static dsrd c() {
        return dtix.a;
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
