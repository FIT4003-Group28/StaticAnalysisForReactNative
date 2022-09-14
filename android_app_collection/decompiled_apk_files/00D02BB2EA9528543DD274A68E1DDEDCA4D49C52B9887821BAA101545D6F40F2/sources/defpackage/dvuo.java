package defpackage;
/* compiled from: PG */
/* renamed from: dvuo  reason: default package */
/* loaded from: classes.dex */
public final class dvuo extends dsqw<dvuo, dvuj> implements dssk {
    public static final dvuo c;
    private static volatile dssr<dvuo> e;
    public dsrj<dvun> a = dssu.b;
    public int b = 4000;
    private int d;

    static {
        dvuo dvuoVar = new dvuo();
        c = dvuoVar;
        dsqw.cc(dvuo.class, dvuoVar);
    }

    private dvuo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003င\u0001", new Object[]{"d", "a", dvun.class, "b"});
            }
            if (i2 == 3) {
                return new dvuo();
            }
            if (i2 == 4) {
                return new dvuj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvuo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvuo.class) {
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
