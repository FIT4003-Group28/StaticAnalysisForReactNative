package defpackage;
/* compiled from: PG */
/* renamed from: dqfs  reason: default package */
/* loaded from: classes6.dex */
public final class dqfs extends dsqw<dqfs, dqfr> implements dssk {
    public static final dqfs b;
    private static volatile dssr<dqfs> d;
    public int a;
    private int c;

    static {
        dqfs dqfsVar = new dqfs();
        b = dqfsVar;
        dsqw.cc(dqfs.class, dqfsVar);
    }

    private dqfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqfs();
            }
            if (i2 == 4) {
                return new dqfr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqfs.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
