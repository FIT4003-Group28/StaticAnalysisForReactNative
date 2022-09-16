package defpackage;
/* compiled from: PG */
/* renamed from: dqfj  reason: default package */
/* loaded from: classes6.dex */
public final class dqfj extends dsqw<dqfj, dqfi> implements dssk {
    public static final dqfj d;
    private static volatile dssr<dqfj> f;
    public String a = "";
    public int b;
    public int c;
    private int e;

    static {
        dqfj dqfjVar = new dqfj();
        d = dqfjVar;
        dsqw.cc(dqfj.class, dqfjVar);
    }

    private dqfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqfj();
            }
            if (i2 == 4) {
                return new dqfi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqfj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
