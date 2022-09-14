package defpackage;
/* compiled from: PG */
/* renamed from: dprg  reason: default package */
/* loaded from: classes.dex */
public final class dprg extends dsqw<dprg, dprf> implements dssk {
    public static final dprg c;
    private static volatile dssr<dprg> e;
    public long a;
    public String b = "";
    private int d;

    static {
        dprg dprgVar = new dprg();
        c = dprgVar;
        dsqw.cc(dprg.class, dprgVar);
    }

    private dprg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dprg();
            }
            if (i2 == 4) {
                return new dprf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dprg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dprg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
