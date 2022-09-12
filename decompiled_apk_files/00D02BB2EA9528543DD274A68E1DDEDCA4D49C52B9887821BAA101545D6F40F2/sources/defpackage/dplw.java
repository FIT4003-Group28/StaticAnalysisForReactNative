package defpackage;
/* compiled from: PG */
/* renamed from: dplw  reason: default package */
/* loaded from: classes.dex */
public final class dplw extends dsqw<dplw, dplv> implements dssk {
    public static final dplw e;
    private static volatile dssr<dplw> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dplw dplwVar = new dplw();
        e = dplwVar;
        dsqw.cc(dplw.class, dplwVar);
    }

    private dplw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ွ\u0000\u0004့\u0000\u0005်\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new dplw();
            }
            if (i2 == 4) {
                return new dplv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dplw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dplw.class) {
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
