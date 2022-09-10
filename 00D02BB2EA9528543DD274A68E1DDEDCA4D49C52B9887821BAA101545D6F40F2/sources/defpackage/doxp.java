package defpackage;
/* compiled from: PG */
/* renamed from: doxp  reason: default package */
/* loaded from: classes6.dex */
public final class doxp extends dsqw<doxp, doxo> implements dssk {
    public static final doxp e;
    private static volatile dssr<doxp> g;
    public String a = "";
    public dquh b;
    public int c;
    public dquj d;
    private int f;

    static {
        doxp doxpVar = new doxp();
        e = doxpVar;
        dsqw.cc(doxp.class, doxpVar);
    }

    private doxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"f", "a", "b", "c", dqtz.c(), "d"});
            }
            if (i2 == 3) {
                return new doxp();
            }
            if (i2 == 4) {
                return new doxo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doxp.class) {
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
