package defpackage;
/* compiled from: PG */
/* renamed from: dpoa  reason: default package */
/* loaded from: classes.dex */
public final class dpoa extends dsqw<dpoa, dpnx> implements dssk {
    public static final dpoa e;
    private static volatile dssr<dpoa> f;
    public int a;
    public dsrj<dpnw> b = dssu.b;
    public String c = "";
    public dpnz d;

    static {
        dpoa dpoaVar = new dpoa();
        e = dpoaVar;
        dsqw.cc(dpoa.class, dpoaVar);
    }

    private dpoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", dpnw.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dpoa();
            }
            if (i2 == 4) {
                return new dpnx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpoa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpoa.class) {
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
