package defpackage;
/* compiled from: PG */
/* renamed from: dqrk  reason: default package */
/* loaded from: classes6.dex */
public final class dqrk extends dsqw<dqrk, dqrj> implements dssk {
    public static final dqrk c;
    private static volatile dssr<dqrk> e;
    public int a;
    public String b = "";
    private int d;

    static {
        dqrk dqrkVar = new dqrk();
        c = dqrkVar;
        dsqw.cc(dqrk.class, dqrkVar);
    }

    private dqrk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", dqrc.a, "b"});
            }
            if (i2 == 3) {
                return new dqrk();
            }
            if (i2 == 4) {
                return new dqrj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqrk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
