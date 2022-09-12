package defpackage;
/* compiled from: PG */
/* renamed from: dgyb  reason: default package */
/* loaded from: classes6.dex */
public final class dgyb extends dsqw<dgyb, dgya> implements dssk {
    public static final dgyb e;
    private static volatile dssr<dgyb> g;
    public int a = 0;
    public Object b;
    public dgyx c;
    public dgzl d;
    private int f;

    static {
        dgyb dgybVar = new dgyb();
        e = dgybVar;
        dsqw.cc(dgyb.class, dgybVar);
    }

    private dgyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "a", "f", dgyj.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dgyb();
            }
            if (i2 == 4) {
                return new dgya();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgyb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
