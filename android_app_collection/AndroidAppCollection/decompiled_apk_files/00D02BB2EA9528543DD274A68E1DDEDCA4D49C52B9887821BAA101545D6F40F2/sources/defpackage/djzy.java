package defpackage;
/* compiled from: PG */
/* renamed from: djzy  reason: default package */
/* loaded from: classes6.dex */
public final class djzy extends dsqw<djzy, djzx> implements dssk {
    public static final djzy b;
    private static volatile dssr<djzy> d;
    public dnwb a;
    private int c;

    static {
        djzy djzyVar = new djzy();
        b = djzyVar;
        dsqw.cc(djzy.class, djzyVar);
    }

    private djzy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djzy();
            }
            if (i2 == 4) {
                return new djzx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djzy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djzy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
