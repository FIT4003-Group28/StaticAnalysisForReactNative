package defpackage;
/* compiled from: PG */
/* renamed from: dkoa  reason: default package */
/* loaded from: classes.dex */
public final class dkoa extends dsqw<dkoa, dknz> implements dssk {
    public static final dkoa c;
    private static volatile dssr<dkoa> e;
    public int a = 15;
    public int b = 60;
    private int d;

    static {
        dkoa dkoaVar = new dkoa();
        c = dkoaVar;
        dsqw.cc(dkoa.class, dkoaVar);
    }

    private dkoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkoa();
            }
            if (i2 == 4) {
                return new dknz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkoa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkoa.class) {
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
