package defpackage;
/* compiled from: PG */
/* renamed from: dfxs  reason: default package */
/* loaded from: classes6.dex */
public final class dfxs extends dsqw<dfxs, dfxr> implements dssk {
    public static final dfxs h;
    private static volatile dssr<dfxs> j;
    public int a;
    public dfwp b;
    public dfxw c;
    public dfwg d;
    public dfvw e;
    public dfwk g;
    private byte i = 2;
    public dsrj<dfxf> f = dssu.b;

    static {
        dfxs dfxsVar = new dfxs();
        h = dfxsVar;
        dsqw.cc(dfxs.class, dfxsVar);
    }

    private dfxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0001\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Л\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", dfxf.class, "g"});
            }
            if (i2 == 3) {
                return new dfxs();
            }
            if (i2 == 4) {
                return new dfxr();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dfxs> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dfxs.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
