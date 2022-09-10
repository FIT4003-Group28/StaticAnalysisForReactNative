package defpackage;
/* compiled from: PG */
/* renamed from: dnvi  reason: default package */
/* loaded from: classes6.dex */
public final class dnvi extends dsqw<dnvi, dnvd> implements dssk {
    public static final dnvi i;
    private static volatile dssr<dnvi> k;
    public int a;
    public dpci b;
    public drbv d;
    public dpgw e;
    public dozz h;
    private byte j = 2;
    public dsrj<dpce> c = dssu.b;
    public dsrj<dpgl> f = dssu.b;
    public dsrj<dnvh> g = dssu.b;

    static {
        dnvi dnviVar = new dnvi();
        i = dnviVar;
        dsqw.cc(dnvi.class, dnviVar);
    }

    private dnvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0002\u0014\u0007\u0000\u0003\u0004\u0002ဉ\u0001\u000eᐉ\u0006\u000fЛ\u0010ᐉ\u0003\u0011\u001b\u0013Л\u0014ဉ\u0002", new Object[]{"a", "b", "h", "c", dpce.class, "e", "g", dnvh.class, "f", dpgl.class, "d"});
            }
            if (i3 == 3) {
                return new dnvi();
            }
            if (i3 == 4) {
                return new dnvd();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dnvi> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnvi.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
