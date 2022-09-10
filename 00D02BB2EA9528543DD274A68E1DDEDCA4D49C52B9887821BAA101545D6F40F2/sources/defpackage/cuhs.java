package defpackage;
/* compiled from: PG */
/* renamed from: cuhs  reason: default package */
/* loaded from: classes5.dex */
public enum cuhs {
    UNKNOWN(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(3),
    STRIKETHROUGH(4),
    SUPERSCRIPT(5),
    SUBSCRIPT(6),
    COLOR(7),
    BACKGROUND_COLOR(8),
    SIZE(9),
    TYPEFACE_LIST(10),
    HORIZONTAL_ALIGNMENT(11),
    HYPER_LINK(12);
    
    public final int n;

    cuhs(int i) {
        this.n = i;
    }

    public static cuhs a(final int i) {
        return (cuhs) dcbg.c(values()).r(new dbsl(i) { // from class: cuhr
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cuhs cuhsVar = cuhs.UNKNOWN;
                return ((cuhs) obj).n == i2;
            }
        }).c(UNKNOWN);
    }
}
