package defpackage;
/* compiled from: PG */
/* renamed from: dqba  reason: default package */
/* loaded from: classes6.dex */
public final class dqba extends dsqw<dqba, dqax> implements dssk {
    public static final dqba f;
    private static volatile dssr<dqba> g;
    public int a;
    public dqdk b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dqba dqbaVar = new dqba();
        f = dqbaVar;
        dsqw.cc(dqba.class, dqbaVar);
    }

    private dqba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဌ\u0004\u0005ဈ\u0002", new Object[]{"a", "b", "c", "e", dqaz.c(), "d"});
            }
            if (i2 == 3) {
                return new dqba();
            }
            if (i2 == 4) {
                return new dqax();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqba> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqba.class) {
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
