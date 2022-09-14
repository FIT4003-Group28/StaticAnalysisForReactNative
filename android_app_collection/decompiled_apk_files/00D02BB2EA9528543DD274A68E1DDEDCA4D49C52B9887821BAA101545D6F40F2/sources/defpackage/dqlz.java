package defpackage;
/* compiled from: PG */
/* renamed from: dqlz  reason: default package */
/* loaded from: classes.dex */
public final class dqlz extends dsqw<dqlz, dqly> implements dssk {
    public static final dqlz c;
    private static volatile dssr<dqlz> d;
    public int a;
    public int b;

    static {
        dqlz dqlzVar = new dqlz();
        c = dqlzVar;
        dsqw.cc(dqlz.class, dqlzVar);
    }

    private dqlz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqlz();
            }
            if (i2 == 4) {
                return new dqly();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqlz.class) {
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
