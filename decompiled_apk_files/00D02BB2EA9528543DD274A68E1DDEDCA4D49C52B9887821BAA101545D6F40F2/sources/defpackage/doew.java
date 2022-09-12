package defpackage;
/* compiled from: PG */
/* renamed from: doew  reason: default package */
/* loaded from: classes6.dex */
public final class doew extends dsqw<doew, doet> implements dssk {
    public static final doew c;
    private static volatile dssr<doew> e;
    public int a;
    public String b = "";
    private int d;

    static {
        doew doewVar = new doew();
        c = doewVar;
        dsqw.cc(doew.class, doewVar);
    }

    private doew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဌ\u0000", new Object[]{"d", "b", "a", doeu.a});
            }
            if (i2 == 3) {
                return new doew();
            }
            if (i2 == 4) {
                return new doet();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doew> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doew.class) {
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
