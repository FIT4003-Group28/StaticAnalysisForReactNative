package defpackage;
/* compiled from: PG */
/* renamed from: dqpy  reason: default package */
/* loaded from: classes6.dex */
public final class dqpy extends dsqw<dqpy, dqpx> implements dssk {
    public static final dqpy b;
    private static volatile dssr<dqpy> d;
    public String a = "";
    private int c;

    static {
        dqpy dqpyVar = new dqpy();
        b = dqpyVar;
        dsqw.cc(dqpy.class, dqpyVar);
    }

    private dqpy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqpy();
            }
            if (i2 == 4) {
                return new dqpx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqpy.class) {
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
