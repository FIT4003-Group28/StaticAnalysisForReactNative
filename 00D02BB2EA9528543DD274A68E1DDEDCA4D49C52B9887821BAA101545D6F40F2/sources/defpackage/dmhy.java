package defpackage;
/* compiled from: PG */
/* renamed from: dmhy  reason: default package */
/* loaded from: classes6.dex */
public final class dmhy extends dsqw<dmhy, dmhx> implements dssk {
    public static final dmhy c;
    private static volatile dssr<dmhy> e;
    public double a;
    public double b;
    private int d;

    static {
        dmhy dmhyVar = new dmhy();
        c = dmhyVar;
        dsqw.cc(dmhy.class, dmhyVar);
    }

    private dmhy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmhy();
            }
            if (i2 == 4) {
                return new dmhx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmhy.class) {
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
