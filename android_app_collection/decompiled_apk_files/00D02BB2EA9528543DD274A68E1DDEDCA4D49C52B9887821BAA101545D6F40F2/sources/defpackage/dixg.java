package defpackage;
/* compiled from: PG */
/* renamed from: dixg  reason: default package */
/* loaded from: classes6.dex */
public final class dixg extends dsqw<dixg, dixf> implements dssk {
    public static final dixg d;
    private static volatile dssr<dixg> f;
    public dwfl a;
    public drkr b;
    public String c = "";
    private int e;

    static {
        dixg dixgVar = new dixg();
        d = dixgVar;
        dsqw.cc(dixg.class, dixgVar);
    }

    private dixg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dixg();
            }
            if (i2 == 4) {
                return new dixf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dixg.class) {
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
