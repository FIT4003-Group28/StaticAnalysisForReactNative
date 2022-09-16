package defpackage;
/* compiled from: PG */
/* renamed from: dqlb  reason: default package */
/* loaded from: classes6.dex */
public final class dqlb extends dsqw<dqlb, dqkz> implements dssk {
    public static final dqlb e;
    private static volatile dssr<dqlb> f;
    public int a;
    public int b;
    public float c;
    public String d = "";

    static {
        dqlb dqlbVar = new dqlb();
        e = dqlbVar;
        dsqw.cc(dqlb.class, dqlbVar);
    }

    private dqlb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dqla.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dqlb();
            }
            if (i2 == 4) {
                return new dqkz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqlb.class) {
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
