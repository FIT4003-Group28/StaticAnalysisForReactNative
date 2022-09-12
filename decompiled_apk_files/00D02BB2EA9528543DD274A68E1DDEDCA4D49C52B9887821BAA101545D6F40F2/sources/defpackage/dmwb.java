package defpackage;
/* compiled from: PG */
/* renamed from: dmwb  reason: default package */
/* loaded from: classes.dex */
public enum dmwb implements dsrb {
    MULTIZOOM_STYLE_TABLE(0),
    COMPACT_MULTIZOOM_STYLE_TABLE(1),
    COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING(2);
    
    public final int d;

    dmwb(int i) {
        this.d = i;
    }

    public static dmwb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return COMPACT_MULTIZOOM_STYLE_TABLE;
            }
            if (i == 2) {
                return COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING;
            }
            return null;
        }
        return MULTIZOOM_STYLE_TABLE;
    }

    public static dsrd c() {
        return dmwa.a;
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
