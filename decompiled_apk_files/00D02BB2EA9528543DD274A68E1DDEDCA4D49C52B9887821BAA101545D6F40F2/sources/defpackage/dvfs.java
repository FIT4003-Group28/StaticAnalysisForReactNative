package defpackage;
/* compiled from: PG */
/* renamed from: dvfs  reason: default package */
/* loaded from: classes6.dex */
public final class dvfs extends dsqw<dvfs, dvfr> implements dssk {
    public static final dvfs c;
    private static volatile dssr<dvfs> d;
    public int a;
    public int b;

    static {
        dvfs dvfsVar = new dvfs();
        c = dvfsVar;
        dsqw.cc(dvfs.class, dvfsVar);
    }

    private dvfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvfs();
            }
            if (i2 == 4) {
                return new dvfr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvfs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvfs.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
