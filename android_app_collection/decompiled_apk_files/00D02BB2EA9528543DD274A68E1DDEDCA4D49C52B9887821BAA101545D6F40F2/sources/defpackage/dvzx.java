package defpackage;
/* compiled from: PG */
/* renamed from: dvzx  reason: default package */
/* loaded from: classes6.dex */
public enum dvzx implements dsrb {
    UNKNOWN_TRANSIT_PATTERN(0),
    BEST_TRANSIT_PATTERN(1);
    
    public final int c;

    dvzx(int i) {
        this.c = i;
    }

    public static dvzx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BEST_TRANSIT_PATTERN;
            }
            return null;
        }
        return UNKNOWN_TRANSIT_PATTERN;
    }

    public static dsrd c() {
        return dvzw.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
