package defpackage;
/* compiled from: PG */
/* renamed from: dsld  reason: default package */
/* loaded from: classes6.dex */
public enum dsld implements dsrb {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);
    
    public final int e;

    dsld(int i) {
        this.e = i;
    }

    public static dsld b(int i) {
        if (i != 0) {
            if (i == 1) {
                return IN_MEMORY_CACHE;
            }
            if (i == 2) {
                return PERSISTENT_CACHE;
            }
            if (i == 3) {
                return CACHE_MISS;
            }
            return null;
        }
        return VALUE_ORIGIN_UNKNOWN;
    }

    public static dsrd c() {
        return dslc.a;
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
