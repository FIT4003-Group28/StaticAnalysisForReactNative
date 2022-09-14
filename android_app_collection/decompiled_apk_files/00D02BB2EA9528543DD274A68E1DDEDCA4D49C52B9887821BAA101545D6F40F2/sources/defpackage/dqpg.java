package defpackage;
/* compiled from: PG */
/* renamed from: dqpg  reason: default package */
/* loaded from: classes.dex */
public final class dqpg extends dsqw<dqpg, dqpf> implements dssk {
    public static final dqpg e;
    private static volatile dssr<dqpg> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dqpg dqpgVar = new dqpg();
        e = dqpgVar;
        dsqw.cc(dqpg.class, dqpgVar);
    }

    private dqpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0003\u0005ဇ\u0002", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dqpg();
            }
            if (i2 == 4) {
                return new dqpf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqpg.class) {
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
