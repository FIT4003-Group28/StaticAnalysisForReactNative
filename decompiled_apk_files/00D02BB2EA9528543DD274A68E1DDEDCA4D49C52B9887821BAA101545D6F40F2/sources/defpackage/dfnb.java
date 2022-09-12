package defpackage;
/* compiled from: PG */
/* renamed from: dfnb  reason: default package */
/* loaded from: classes6.dex */
public final class dfnb extends dsqw<dfnb, dfna> implements dssk {
    public static final dfnb d;
    private static volatile dssr<dfnb> g;
    public dfmx a;
    public dgrh b;
    private int e;
    private byte f = 2;
    public dsrj<dfmi> c = dssu.b;

    static {
        dfnb dfnbVar = new dfnb();
        d = dfnbVar;
        dsqw.cc(dfnb.class, dfnbVar);
    }

    private dfnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ဉ\u0000\u0003ᐉ\u0001\u0004Л", new Object[]{"e", "a", "b", "c", dfmi.class});
            }
            if (i2 == 3) {
                return new dfnb();
            }
            if (i2 == 4) {
                return new dfna();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dfnb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfnb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
