package defpackage;
/* compiled from: PG */
/* renamed from: ddhe  reason: default package */
/* loaded from: classes5.dex */
public final class ddhe extends dsqs<ddhe, ddhd> implements dsqt {
    public static final ddhe j;
    private static volatile dssr<ddhe> l;
    public int a;
    public ddxx b;
    public int d;
    public int e;
    public int f;
    public ddbw i;
    private byte k = 2;
    public int c = -1;
    public int g = -1;
    public dsrj<ddhk> h = dssu.b;

    static {
        ddhe ddheVar = new ddhe();
        j = ddheVar;
        dsqw.cc(ddhe.class, ddheVar);
    }

    private ddhe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "h", ddhk.class, "i", "b"});
            }
            if (i2 == 3) {
                return new ddhe();
            }
            if (i2 == 4) {
                return new ddhd();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<ddhe> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ddhe.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
