package defpackage;
/* compiled from: PG */
/* renamed from: cuhn  reason: default package */
/* loaded from: classes5.dex */
public enum cuhn {
    UNKNOWN(0),
    INDENTATION(1),
    BULLET(2);
    
    public final int d;

    cuhn(int i) {
        this.d = i;
    }

    public static cuhn a(final int i) {
        return (cuhn) dcbg.c(values()).r(new dbsl(i) { // from class: cuhm
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cuhn cuhnVar = cuhn.UNKNOWN;
                return ((cuhn) obj).d == i2;
            }
        }).c(UNKNOWN);
    }
}
