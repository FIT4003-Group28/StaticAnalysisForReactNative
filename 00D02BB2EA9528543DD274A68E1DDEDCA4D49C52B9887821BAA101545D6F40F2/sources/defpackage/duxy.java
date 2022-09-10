package defpackage;
/* compiled from: PG */
/* renamed from: duxy  reason: default package */
/* loaded from: classes6.dex */
public final class duxy extends dsqw<duxy, duxx> implements dssk {
    public static final duxy f;
    private static volatile dssr<duxy> g;
    public int a;
    public int b = 0;
    public Object c;
    public dngq d;
    public dnwb e;

    static {
        duxy duxyVar = new duxy();
        f = duxyVar;
        dsqw.cc(duxy.class, duxyVar);
    }

    private duxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0003\t\u0004\u0000\u0000\u0000\u0003ြ\u0000\u0005်\u0000\bဉ\u0003\tဉ\u0002", new Object[]{"c", "b", "a", dpop.class, "e", "d"});
            }
            if (i2 == 3) {
                return new duxy();
            }
            if (i2 == 4) {
                return new duxx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duxy.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
