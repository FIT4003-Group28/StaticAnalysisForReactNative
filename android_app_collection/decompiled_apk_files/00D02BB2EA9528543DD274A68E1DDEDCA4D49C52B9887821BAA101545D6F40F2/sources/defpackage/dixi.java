package defpackage;
/* compiled from: PG */
/* renamed from: dixi  reason: default package */
/* loaded from: classes6.dex */
public final class dixi extends dsqw<dixi, dixh> implements dssk {
    public static final dixi c;
    private static volatile dssr<dixi> e;
    public String a = "";
    public dgde b;
    private int d;

    static {
        dixi dixiVar = new dixi();
        c = dixiVar;
        dsqw.cc(dixi.class, dixiVar);
    }

    private dixi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dixi();
            }
            if (i2 == 4) {
                return new dixh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dixi.class) {
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
