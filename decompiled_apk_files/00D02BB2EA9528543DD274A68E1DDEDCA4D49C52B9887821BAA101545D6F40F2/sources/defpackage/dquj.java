package defpackage;
/* compiled from: PG */
/* renamed from: dquj  reason: default package */
/* loaded from: classes6.dex */
public final class dquj extends dsqw<dquj, dqui> implements dssk {
    public static final dquj f;
    private static volatile dssr<dquj> g;
    public int a;
    public double b;
    public double c;
    public String d = "";
    public String e = "";

    static {
        dquj dqujVar = new dquj();
        f = dqujVar;
        dsqw.cc(dquj.class, dqujVar);
    }

    private dquj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dquj();
            }
            if (i2 == 4) {
                return new dqui();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dquj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dquj.class) {
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
