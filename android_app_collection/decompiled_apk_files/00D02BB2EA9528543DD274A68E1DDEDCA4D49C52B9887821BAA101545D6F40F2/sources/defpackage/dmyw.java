package defpackage;
/* compiled from: PG */
/* renamed from: dmyw  reason: default package */
/* loaded from: classes.dex */
public final class dmyw extends dsqw<dmyw, dmyv> implements dssk {
    public static final dmyw d;
    private static volatile dssr<dmyw> f;
    public int a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dmyw dmywVar = new dmyw();
        d = dmywVar;
        dsqw.cc(dmyw.class, dmywVar);
    }

    private dmyw() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0002\n9\u0002\u0000\u0000\u0000\nဇ\u001c9ဇ)", new Object[]{"a", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dmyw();
            }
            if (i2 == 4) {
                return new dmyv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmyw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmyw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
