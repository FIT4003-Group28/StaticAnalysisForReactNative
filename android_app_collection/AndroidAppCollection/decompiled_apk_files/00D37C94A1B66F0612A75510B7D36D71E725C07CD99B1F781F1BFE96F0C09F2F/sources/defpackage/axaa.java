package defpackage;
/* compiled from: PG */
/* renamed from: axaa  reason: default package */
/* loaded from: classes2.dex */
public enum axaa implements aopm {
    COMMENT_STYLE_UNSPECIFIED(0),
    COMMENT_NORMAL(1),
    COMMENT_LIGHT(2);
    
    public final int d;

    axaa(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.n;
    }

    public static axaa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return COMMENT_NORMAL;
            }
            if (i == 2) {
                return COMMENT_LIGHT;
            }
            return null;
        }
        return COMMENT_STYLE_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
