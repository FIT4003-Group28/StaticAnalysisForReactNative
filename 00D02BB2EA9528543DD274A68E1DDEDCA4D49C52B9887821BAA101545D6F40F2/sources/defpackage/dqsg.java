package defpackage;
/* compiled from: PG */
/* renamed from: dqsg  reason: default package */
/* loaded from: classes6.dex */
public final class dqsg extends dsqw<dqsg, dqsf> implements dssk {
    public static final dqsg d;
    private static volatile dssr<dqsg> e;
    public int a;
    public dgbo b;
    public String c = "";

    static {
        dqsg dqsgVar = new dqsg();
        d = dqsgVar;
        dsqw.cc(dqsg.class, dqsgVar);
    }

    private dqsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqsg();
            }
            if (i2 == 4) {
                return new dqsf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqsg.class) {
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