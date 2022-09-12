package defpackage;
/* compiled from: PG */
/* renamed from: dtpy  reason: default package */
/* loaded from: classes6.dex */
public enum dtpy implements dsrb {
    UNKNOWN_FONT_STYLE(0),
    BOLD_FONT_STYLE(1),
    ITALIC_FONT_STYLE(2);
    
    private final int d;

    dtpy(int i) {
        this.d = i;
    }

    public static dtpy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BOLD_FONT_STYLE;
            }
            if (i == 2) {
                return ITALIC_FONT_STYLE;
            }
            return null;
        }
        return UNKNOWN_FONT_STYLE;
    }

    public static dsrd c() {
        return dtpx.a;
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
