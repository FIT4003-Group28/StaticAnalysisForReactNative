package defpackage;
/* compiled from: PG */
/* renamed from: dikg  reason: default package */
/* loaded from: classes.dex */
public final class dikg extends dsqw<dikg, dikf> implements dssk {
    public static final dsrg<Integer, dikd> b = new dike();
    public static final dikg d;
    private static volatile dssr<dikg> f;
    public dsrf a = dsqz.b;
    public int c;
    private int e;

    static {
        dikg dikgVar = new dikg();
        d = dikgVar;
        dsqw.cc(dikg.class, dikgVar);
    }

    private dikg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0001\u0000\u0004\u001e\u0006င\u0000", new Object[]{"e", "a", dikd.c(), "c"});
            }
            if (i2 == 3) {
                return new dikg();
            }
            if (i2 == 4) {
                return new dikf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dikg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dikg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
