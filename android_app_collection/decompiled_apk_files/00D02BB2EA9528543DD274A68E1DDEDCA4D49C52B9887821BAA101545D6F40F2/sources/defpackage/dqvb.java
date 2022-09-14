package defpackage;
/* compiled from: PG */
/* renamed from: dqvb  reason: default package */
/* loaded from: classes6.dex */
public enum dqvb implements dsrb {
    TRANSIT_BEST(1),
    TRANSIT_FEWER_TRANSFERS(2),
    TRANSIT_LESS_WALKING(3),
    TRANSIT_PREFER_ACCESSIBLE(4),
    TRANSIT_PREFER_CHEAPER(5);
    
    public final int f;

    dqvb(int i) {
        this.f = i;
    }

    public static dqvb b(int i) {
        if (i != 1) {
            if (i == 2) {
                return TRANSIT_FEWER_TRANSFERS;
            }
            if (i == 3) {
                return TRANSIT_LESS_WALKING;
            }
            if (i == 4) {
                return TRANSIT_PREFER_ACCESSIBLE;
            }
            if (i == 5) {
                return TRANSIT_PREFER_CHEAPER;
            }
            return null;
        }
        return TRANSIT_BEST;
    }

    public static dsrd c() {
        return dqva.a;
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
