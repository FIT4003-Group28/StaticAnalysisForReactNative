package defpackage;
/* compiled from: PG */
/* renamed from: dqor  reason: default package */
/* loaded from: classes.dex */
public final class dqor extends dsqw<dqor, dqoq> implements dssk {
    public static final dqor d;
    private static volatile dssr<dqor> f;
    public boolean a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dqor dqorVar = new dqor();
        d = dqorVar;
        dsqw.cc(dqor.class, dqorVar);
    }

    private dqor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqor();
            }
            if (i2 == 4) {
                return new dqoq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqor> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqor.class) {
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
