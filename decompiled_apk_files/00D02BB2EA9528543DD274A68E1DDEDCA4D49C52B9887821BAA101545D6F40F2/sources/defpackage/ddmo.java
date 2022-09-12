package defpackage;
/* compiled from: PG */
/* renamed from: ddmo  reason: default package */
/* loaded from: classes6.dex */
public enum ddmo implements dsrb {
    UNKNOWN_EXPANSION(0),
    HIDDEN(1),
    COLLAPSED(2),
    PARTIAL_EXPANSION(3),
    FULL_EXPANSION(4);
    
    public final int f;

    ddmo(int i) {
        this.f = i;
    }

    public static ddmo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HIDDEN;
            }
            if (i == 2) {
                return COLLAPSED;
            }
            if (i == 3) {
                return PARTIAL_EXPANSION;
            }
            if (i == 4) {
                return FULL_EXPANSION;
            }
            return null;
        }
        return UNKNOWN_EXPANSION;
    }

    public static dsrd c() {
        return ddmn.a;
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
