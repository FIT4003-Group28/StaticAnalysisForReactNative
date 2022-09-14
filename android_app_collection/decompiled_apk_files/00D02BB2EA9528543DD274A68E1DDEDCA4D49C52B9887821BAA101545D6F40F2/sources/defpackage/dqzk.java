package defpackage;
/* compiled from: PG */
/* renamed from: dqzk  reason: default package */
/* loaded from: classes.dex */
public final class dqzk extends dsqw<dqzk, dqzj> implements dssk {
    public static final dqzk e;
    private static volatile dssr<dqzk> f;
    public int a;
    public int b = 0;
    public Object c;
    public dqzi d;

    static {
        dqzk dqzkVar = new dqzk();
        e = dqzkVar;
        dsqw.cc(dqzk.class, dqzkVar);
    }

    private dqzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002့\u0000\u0003့\u0000\u0004်\u0000\u0005့\u0000\u0006့\u0000\u0007်\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new dqzk();
            }
            if (i2 == 4) {
                return new dqzj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqzk.class) {
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
