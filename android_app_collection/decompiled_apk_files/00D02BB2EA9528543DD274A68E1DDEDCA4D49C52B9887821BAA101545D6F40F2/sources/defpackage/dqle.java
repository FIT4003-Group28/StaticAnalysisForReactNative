package defpackage;
/* compiled from: PG */
/* renamed from: dqle  reason: default package */
/* loaded from: classes6.dex */
public final class dqle extends dsqw<dqle, dqld> implements dssk {
    public static final dqle d;
    private static volatile dssr<dqle> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dqle dqleVar = new dqle();
        d = dqleVar;
        dsqw.cc(dqle.class, dqleVar);
    }

    private dqle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqle();
            }
            if (i2 == 4) {
                return new dqld();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqle> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqle.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
