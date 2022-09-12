package defpackage;
/* compiled from: PG */
/* renamed from: ditv  reason: default package */
/* loaded from: classes6.dex */
public enum ditv implements dsrb {
    DEFAULT_ICON(0),
    GOOGLE(1);
    
    private final int c;

    ditv(int i) {
        this.c = i;
    }

    public static ditv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GOOGLE;
            }
            return null;
        }
        return DEFAULT_ICON;
    }

    public static dsrd c() {
        return ditu.a;
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
