package defpackage;
/* compiled from: PG */
/* renamed from: dmsw  reason: default package */
/* loaded from: classes.dex */
public final class dmsw extends dsqw<dmsw, dmsv> implements dssk {
    public static final dmsw c;
    private static volatile dssr<dmsw> e;
    public int a;
    public int b;
    private int d;

    static {
        dmsw dmswVar = new dmsw();
        c = dmswVar;
        dsqw.cc(dmsw.class, dmswVar);
    }

    private dmsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", dmsx.a, "b", dmsz.a});
            }
            if (i2 == 3) {
                return new dmsw();
            }
            if (i2 == 4) {
                return new dmsv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmsw.class) {
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
