package defpackage;
/* compiled from: PG */
/* renamed from: dozr  reason: default package */
/* loaded from: classes6.dex */
public final class dozr extends dsqw<dozr, dozo> implements dssk {
    public static final dozr e;
    private static volatile dssr<dozr> f;
    public int a;
    public int b = 0;
    public Object c;
    public dozq d;

    static {
        dozr dozrVar = new dozr();
        e = dozrVar;
        dsqw.cc(dozr.class, dozrVar);
    }

    private dozr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0003ဉ\u0002\u0004ြ\u0000", new Object[]{"c", "b", "a", doud.class, "d", dozl.class});
            }
            if (i2 == 3) {
                return new dozr();
            }
            if (i2 == 4) {
                return new dozo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dozr.class) {
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
