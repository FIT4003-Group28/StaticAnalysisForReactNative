package defpackage;
/* compiled from: PG */
/* renamed from: aimf  reason: default package */
/* loaded from: classes2.dex */
public final class aimf extends dsqw<aimf, aime> implements dssk {
    public static final aimf e;
    private static volatile dssr<aimf> f;
    public int a;
    public int b = 0;
    public Object c;
    public long d;

    static {
        aimf aimfVar = new aimf();
        e = aimfVar;
        dsqw.cc(aimf.class, aimfVar);
    }

    private aimf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", aimd.class, aimh.class, aimb.class});
            }
            if (i2 == 3) {
                return new aimf();
            }
            if (i2 == 4) {
                return new aime();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (aimf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
