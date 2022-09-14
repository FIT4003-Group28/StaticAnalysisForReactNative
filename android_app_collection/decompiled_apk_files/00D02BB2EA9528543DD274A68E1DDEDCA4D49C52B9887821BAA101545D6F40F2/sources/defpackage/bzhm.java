package defpackage;
/* compiled from: PG */
/* renamed from: bzhm  reason: default package */
/* loaded from: classes4.dex */
public enum bzhm implements dsrb {
    UNKNOWN_PLACE(0),
    HOME(1),
    WORK(2);
    
    public final int d;

    bzhm(int i) {
        this.d = i;
    }

    public static bzhm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HOME;
            }
            if (i == 2) {
                return WORK;
            }
            return null;
        }
        return UNKNOWN_PLACE;
    }

    public static dsrd c() {
        return bzhl.a;
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
