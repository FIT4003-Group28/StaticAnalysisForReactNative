package defpackage;
/* compiled from: PG */
/* renamed from: dqwe  reason: default package */
/* loaded from: classes6.dex */
public final class dqwe extends dsqw<dqwe, dqwb> implements dssk {
    public static final dqwe f;
    private static volatile dssr<dqwe> g;
    public int a;
    public dsrj<dqwd> b = dssu.b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dqwe dqweVar = new dqwe();
        f = dqweVar;
        dsqw.cc(dqwe.class, dqweVar);
    }

    private dqwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u001b\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", dqwd.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqwe();
            }
            if (i2 == 4) {
                return new dqwb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqwe.class) {
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
