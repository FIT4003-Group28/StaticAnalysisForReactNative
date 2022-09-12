package defpackage;
/* compiled from: PG */
/* renamed from: dqhj  reason: default package */
/* loaded from: classes6.dex */
public final class dqhj extends dsqw<dqhj, dqgz> implements dssk {
    public static final dqhj h;
    private static volatile dssr<dqhj> i;
    public int a;
    public int b;
    public dqhb d;
    public dqhd g;
    public String c = "";
    public dsrj<dqhg> e = dssu.b;
    public String f = "";

    static {
        dqhj dqhjVar = new dqhj();
        h = dqhjVar;
        dsqw.cc(dqhj.class, dqhjVar);
    }

    private dqhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0003\u0002ဈ\u0001\u0003ဉ\u0004\u0004\u001b\u0005ဌ\u0000\u0006ဉ\u0002", new Object[]{"a", "f", "c", "g", "e", dqhg.class, "b", dqhh.a, "d"});
            }
            if (i3 == 3) {
                return new dqhj();
            }
            if (i3 == 4) {
                return new dqgz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqhj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqhj.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
