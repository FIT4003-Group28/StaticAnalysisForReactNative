package defpackage;
/* compiled from: PG */
/* renamed from: dvyy  reason: default package */
/* loaded from: classes.dex */
public final class dvyy extends dsqw<dvyy, dvyx> implements dssk {
    public static final dvyy e;
    private static volatile dssr<dvyy> f;
    public int a;
    public float b;
    public String c = "";
    public int d;

    static {
        dvyy dvyyVar = new dvyy();
        e = dvyyVar;
        dsqw.cc(dvyy.class, dvyyVar);
    }

    private dvyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0000\u0003ဈ\u0001\bခ\u0000\tင\u0004", new Object[]{"a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dvyy();
            }
            if (i2 == 4) {
                return new dvyx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvyy.class) {
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
