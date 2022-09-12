package defpackage;
/* compiled from: PG */
/* renamed from: cuhu  reason: default package */
/* loaded from: classes5.dex */
public enum cuhu {
    UNKNOWN(0),
    PLATFORM_DEFAULT_LIGHT(1),
    PLATFORM_DEFAULT_REGULAR(2),
    PLATFORM_DEFAULT_MEDIUM(3),
    PLATFORM_DEFAULT_BOLD(4),
    GOOGLE_SANS_REGULAR(5),
    GOOGLE_SANS_MEDIUM(6),
    GOOGLE_SANS_BOLD(7),
    ROBOTO_REGULAR(8);
    
    public final int j;

    cuhu(int i) {
        this.j = i;
    }

    public static cuhu a(final int i) {
        return (cuhu) dcbg.c(values()).r(new dbsl(i) { // from class: cuht
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cuhu cuhuVar = cuhu.UNKNOWN;
                return ((cuhu) obj).j == i2;
            }
        }).c(UNKNOWN);
    }
}
