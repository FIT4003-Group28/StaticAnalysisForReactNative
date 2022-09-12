package defpackage;
/* compiled from: PG */
/* renamed from: dkpl  reason: default package */
/* loaded from: classes.dex */
public final class dkpl extends dsqw<dkpl, dkpk> implements dssk {
    public static final dkpl f;
    private static volatile dssr<dkpl> g;
    public int a;
    public int b;
    public dkpg c;
    public int d = 1;
    public int e = 730;

    static {
        dkpl dkplVar = new dkpl();
        f = dkplVar;
        dsqw.cc(dkpl.class, dkplVar);
    }

    private dkpl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkpl();
            }
            if (i2 == 4) {
                return new dkpk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkpl.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
