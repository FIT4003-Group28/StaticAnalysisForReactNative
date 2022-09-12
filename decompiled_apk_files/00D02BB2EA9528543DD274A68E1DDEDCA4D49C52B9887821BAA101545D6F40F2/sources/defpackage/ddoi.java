package defpackage;
/* compiled from: PG */
/* renamed from: ddoi  reason: default package */
/* loaded from: classes6.dex */
public enum ddoi implements dsrb {
    UNKNOWN_SYNTHESIS_TYPE(0),
    LOCAL(1),
    NETWORK(2);
    
    public final int d;

    ddoi(int i) {
        this.d = i;
    }

    public static ddoi b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LOCAL;
            }
            if (i == 2) {
                return NETWORK;
            }
            return null;
        }
        return UNKNOWN_SYNTHESIS_TYPE;
    }

    public static dsrd c() {
        return ddoh.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
