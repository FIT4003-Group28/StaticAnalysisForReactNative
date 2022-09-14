package defpackage;
/* compiled from: PG */
/* renamed from: dqlg  reason: default package */
/* loaded from: classes6.dex */
public final class dqlg extends dsqw<dqlg, dqlf> implements dssk {
    public static final dqlg c;
    private static volatile dssr<dqlg> e;
    public int a;
    public dpuc b;
    private int d;

    static {
        dqlg dqlgVar = new dqlg();
        c = dqlgVar;
        dsqw.cc(dqlg.class, dqlgVar);
    }

    private dqlg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002င\u0001\u0005ဉ\u0004", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqlg();
            }
            if (i2 == 4) {
                return new dqlf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqlg.class) {
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
