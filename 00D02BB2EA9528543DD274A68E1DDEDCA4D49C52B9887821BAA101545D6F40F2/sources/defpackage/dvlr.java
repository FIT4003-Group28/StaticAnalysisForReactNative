package defpackage;
/* compiled from: PG */
/* renamed from: dvlr  reason: default package */
/* loaded from: classes.dex */
public final class dvlr extends dsqw<dvlr, dvlq> implements dssk {
    public static final dvlr f;
    private static volatile dssr<dvlr> h;
    public boolean b;
    public dkvj d;
    private int g;
    public boolean a = true;
    public float c = 0.7f;
    public boolean e = true;

    static {
        dvlr dvlrVar = new dvlr();
        f = dvlrVar;
        dsqw.cc(dvlr.class, dvlrVar);
    }

    private dvlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0006\u0005ခ\u0003\u0006ဉ\u0005\bဇ\u0001", new Object[]{"g", "a", "e", "c", "d", "b"});
            }
            if (i2 == 3) {
                return new dvlr();
            }
            if (i2 == 4) {
                return new dvlq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvlr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvlr.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
