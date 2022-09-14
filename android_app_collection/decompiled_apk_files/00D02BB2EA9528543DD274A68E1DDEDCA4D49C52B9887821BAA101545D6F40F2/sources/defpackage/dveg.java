package defpackage;
/* compiled from: PG */
/* renamed from: dveg  reason: default package */
/* loaded from: classes.dex */
public final class dveg extends dsqw<dveg, dvef> implements dssk {
    public static final dveg c;
    private static volatile dssr<dveg> e;
    public int a = 1;
    public int b = 15;
    private int d;

    static {
        dveg dvegVar = new dveg();
        c = dvegVar;
        dsqw.cc(dveg.class, dvegVar);
    }

    private dveg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"d", "a", doyd.c(), "b"});
            }
            if (i2 == 3) {
                return new dveg();
            }
            if (i2 == 4) {
                return new dvef();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dveg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dveg.class) {
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
