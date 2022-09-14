package defpackage;
/* compiled from: PG */
/* renamed from: dqim  reason: default package */
/* loaded from: classes6.dex */
public final class dqim extends dsqw<dqim, dqij> implements dssk {
    public static final dqim g;
    private static volatile dssr<dqim> h;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public dgbo f;

    static {
        dqim dqimVar = new dqim();
        g = dqimVar;
        dsqw.cc(dqim.class, dqimVar);
    }

    private dqim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဉ\u0006\u0005ဌ\u0002", new Object[]{"a", "c", "d", "e", "f", "b", dqik.a});
            }
            if (i2 == 3) {
                return new dqim();
            }
            if (i2 == 4) {
                return new dqij();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqim> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqim.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
