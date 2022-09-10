package defpackage;
/* compiled from: PG */
/* renamed from: dzyg  reason: default package */
/* loaded from: classes6.dex */
public final class dzyg extends dsqw<dzyg, dzyf> implements dssk {
    public static final dzyg d;
    private static volatile dssr<dzyg> e;
    public int a;
    public int b;
    public dzyi c;

    static {
        dzyg dzygVar = new dzyg();
        d = dzygVar;
        dsqw.cc(dzyg.class, dzygVar);
    }

    private dzyg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dzyg();
            }
            if (i2 == 4) {
                return new dzyf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzyg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dzyg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
