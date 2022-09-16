package defpackage;
/* compiled from: PG */
/* renamed from: dqdg  reason: default package */
/* loaded from: classes6.dex */
public final class dqdg extends dsqw<dqdg, dqdf> implements dssk {
    public static final dqdg c;
    private static volatile dssr<dqdg> d;
    public int a;
    public int b;

    static {
        dqdg dqdgVar = new dqdg();
        c = dqdgVar;
        dsqw.cc(dqdg.class, dqdgVar);
    }

    private dqdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqdg();
            }
            if (i2 == 4) {
                return new dqdf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqdg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
