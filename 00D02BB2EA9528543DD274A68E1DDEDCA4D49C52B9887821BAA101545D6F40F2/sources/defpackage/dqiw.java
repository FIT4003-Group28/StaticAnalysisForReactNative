package defpackage;
/* compiled from: PG */
/* renamed from: dqiw  reason: default package */
/* loaded from: classes6.dex */
public final class dqiw extends dsqw<dqiw, dqit> implements dssk {
    public static final dqiw d;
    private static volatile dssr<dqiw> f;
    public int a;
    public String b = "";
    public boolean c;
    private int e;

    static {
        dqiw dqiwVar = new dqiw();
        d = dqiwVar;
        dsqw.cc(dqiw.class, dqiwVar);
    }

    private dqiw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", dqiv.c(), "b", "c"});
            }
            if (i2 == 3) {
                return new dqiw();
            }
            if (i2 == 4) {
                return new dqit();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqiw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqiw.class) {
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
