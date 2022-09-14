package defpackage;
/* compiled from: PG */
/* renamed from: cbtg  reason: default package */
/* loaded from: classes4.dex */
public final class cbtg extends dsqw<cbtg, cbtf> implements dssk {
    public static final cbtg c;
    private static volatile dssr<cbtg> d;
    public int a;
    public cbte b;

    static {
        cbtg cbtgVar = new cbtg();
        c = cbtgVar;
        dsqw.cc(cbtg.class, cbtgVar);
    }

    private cbtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cbtg();
            }
            if (i2 == 4) {
                return new cbtf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cbtg.class) {
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
