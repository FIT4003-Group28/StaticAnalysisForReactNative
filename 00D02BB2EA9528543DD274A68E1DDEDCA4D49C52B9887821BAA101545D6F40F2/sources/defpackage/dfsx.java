package defpackage;
/* compiled from: PG */
/* renamed from: dfsx  reason: default package */
/* loaded from: classes6.dex */
public final class dfsx extends dsqw<dfsx, dfsw> implements dssk {
    public static final dfsx e;
    private static volatile dssr<dfsx> f;
    public int a;
    public dhkd c;
    public dspd b = dspd.b;
    public int d = 1;

    static {
        dfsx dfsxVar = new dfsx();
        e = dfsxVar;
        dsqw.cc(dfsx.class, dfsxVar);
    }

    private dfsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfsx();
            }
            if (i2 == 4) {
                return new dfsw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfsx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
