package defpackage;
/* compiled from: PG */
/* renamed from: dqem  reason: default package */
/* loaded from: classes6.dex */
public final class dqem extends dsqw<dqem, dqel> implements dssk {
    public static final dqem e;
    private static volatile dssr<dqem> f;
    public int a;
    public Object c;
    public int b = 0;
    public dspd d = dspd.b;

    static {
        dqem dqemVar = new dqem();
        e = dqemVar;
        dsqw.cc(dqem.class, dqemVar);
    }

    private dqem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ွ\u0000\u0003်\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new dqem();
            }
            if (i2 == 4) {
                return new dqel();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqem> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqem.class) {
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
