package defpackage;
/* compiled from: PG */
/* renamed from: dqhr  reason: default package */
/* loaded from: classes.dex */
public final class dqhr extends dsqw<dqhr, dqhq> implements dssk {
    public static final dqhr d;
    private static volatile dssr<dqhr> e;
    public int a;
    public String b = "";
    public dqhw c;

    static {
        dqhr dqhrVar = new dqhr();
        d = dqhrVar;
        dsqw.cc(dqhr.class, dqhrVar);
    }

    private dqhr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqhr();
            }
            if (i2 == 4) {
                return new dqhq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqhr.class) {
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