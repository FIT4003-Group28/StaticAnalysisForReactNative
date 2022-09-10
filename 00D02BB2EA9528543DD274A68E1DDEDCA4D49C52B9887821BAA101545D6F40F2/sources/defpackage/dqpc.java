package defpackage;
/* compiled from: PG */
/* renamed from: dqpc  reason: default package */
/* loaded from: classes.dex */
public final class dqpc extends dsqw<dqpc, dqom> implements dssk {
    public static final dqpc f;
    private static volatile dssr<dqpc> g;
    public Object b;
    public int a = 0;
    public dsrj<dqpc> c = dssu.b;
    public dsrj<dqpc> d = dssu.b;
    public dsrj<dqpc> e = dssu.b;

    static {
        dqpc dqpcVar = new dqpc();
        f = dqpcVar;
        dsqw.cc(dqpc.class, dqpcVar);
    }

    private dqpc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\t\u0001\u0000\u0001\n\t\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\nြ\u0000", new Object[]{"b", "a", "c", dqpc.class, "d", dqpc.class, "e", dqpc.class, dqol.class, dqoz.class, dqov.class, dqot.class, dqor.class, dqpb.class});
            }
            if (i2 == 3) {
                return new dqpc();
            }
            if (i2 == 4) {
                return new dqom();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqpc.class) {
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
