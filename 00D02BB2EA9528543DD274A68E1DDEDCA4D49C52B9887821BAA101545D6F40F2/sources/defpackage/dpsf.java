package defpackage;
/* compiled from: PG */
/* renamed from: dpsf  reason: default package */
/* loaded from: classes.dex */
public final class dpsf extends dsqw<dpsf, dpse> implements dssk {
    public static final dpsf d;
    private static volatile dssr<dpsf> e;
    public int a;
    public dqfq b;
    public dqfo c;

    static {
        dpsf dpsfVar = new dpsf();
        d = dpsfVar;
        dsqw.cc(dpsf.class, dpsfVar);
    }

    private dpsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpsf();
            }
            if (i2 == 4) {
                return new dpse();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpsf.class) {
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
