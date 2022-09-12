package defpackage;
/* compiled from: PG */
/* renamed from: diik  reason: default package */
/* loaded from: classes.dex */
public final class diik extends dsqw<diik, diij> implements dssk {
    public static final diik c;
    private static volatile dssr<diik> e;
    public String a = "";
    public int b;
    private int d;

    static {
        diik diikVar = new diik();
        c = diikVar;
        dsqw.cc(diik.class, diikVar);
    }

    private diik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001", new Object[]{"d", "a", "b", diii.c()});
            }
            if (i2 == 3) {
                return new diik();
            }
            if (i2 == 4) {
                return new diij();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diik> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diik.class) {
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
