package defpackage;
/* compiled from: PG */
/* renamed from: duly  reason: default package */
/* loaded from: classes6.dex */
public enum duly implements dsrb {
    DEFAULT_COLUMN(0),
    COLUMN_INDEX(1),
    SAME_COLUMN_AS_PREVIOUS(2),
    SPAN_COLUMNS(3);
    
    public final int e;

    duly(int i) {
        this.e = i;
    }

    public static duly b(int i) {
        if (i != 0) {
            if (i == 1) {
                return COLUMN_INDEX;
            }
            if (i == 2) {
                return SAME_COLUMN_AS_PREVIOUS;
            }
            if (i == 3) {
                return SPAN_COLUMNS;
            }
            return null;
        }
        return DEFAULT_COLUMN;
    }

    public static dsrd c() {
        return dulx.a;
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
