package defpackage;
/* compiled from: PG */
/* renamed from: dohs  reason: default package */
/* loaded from: classes6.dex */
public final class dohs extends dsqw<dohs, dohr> implements dssk {
    public static final dohs c;
    private static volatile dssr<dohs> e;
    public int a;
    public dofy b;
    private int d;

    static {
        dohs dohsVar = new dohs();
        c = dohsVar;
        dsqw.cc(dohs.class, dohsVar);
    }

    private dohs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dohp.a, "b"});
            }
            if (i2 == 3) {
                return new dohs();
            }
            if (i2 == 4) {
                return new dohr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dohs.class) {
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