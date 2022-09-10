package defpackage;
/* compiled from: PG */
/* renamed from: dogl  reason: default package */
/* loaded from: classes6.dex */
public final class dogl extends dsqw<dogl, dogj> implements dssk {
    public static final dogl d;
    private static volatile dssr<dogl> e;
    public int a;
    public int b;
    public dogc c;

    static {
        dogl doglVar = new dogl();
        d = doglVar;
        dsqw.cc(dogl.class, doglVar);
    }

    private dogl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", dogk.a, "c"});
            }
            if (i2 == 3) {
                return new dogl();
            }
            if (i2 == 4) {
                return new dogj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dogl.class) {
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
