package defpackage;
/* compiled from: PG */
/* renamed from: eaao  reason: default package */
/* loaded from: classes.dex */
public final class eaao extends dsqw<eaao, eaan> implements dssk {
    public static final eaao f;
    private static volatile dssr<eaao> g;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public long e;

    static {
        eaao eaaoVar = new eaao();
        f = eaaoVar;
        dsqw.cc(eaao.class, eaaoVar);
    }

    private eaao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new eaao();
            }
            if (i2 == 4) {
                return new eaan();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaao> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eaao.class) {
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
