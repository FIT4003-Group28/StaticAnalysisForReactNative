package defpackage;
/* compiled from: PG */
/* renamed from: dpej  reason: default package */
/* loaded from: classes6.dex */
public enum dpej implements dsrb {
    DELAY_NODATA(0),
    DELAY_HEAVY(1),
    DELAY_MEDIUM(2),
    DELAY_LIGHT(3);
    
    public final int e;

    dpej(int i) {
        this.e = i;
    }

    public static dpej b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DELAY_HEAVY;
            }
            if (i == 2) {
                return DELAY_MEDIUM;
            }
            if (i == 3) {
                return DELAY_LIGHT;
            }
            return null;
        }
        return DELAY_NODATA;
    }

    public static dsrd c() {
        return dpei.a;
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
