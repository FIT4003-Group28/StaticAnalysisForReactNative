package defpackage;
/* compiled from: PG */
/* renamed from: dqfu  reason: default package */
/* loaded from: classes6.dex */
public final class dqfu extends dsqw<dqfu, dqft> implements dssk {
    public static final dqfu d;
    private static volatile dssr<dqfu> e;
    public int a;
    public long b;
    public String c = "";

    static {
        dqfu dqfuVar = new dqfu();
        d = dqfuVar;
        dsqw.cc(dqfu.class, dqfuVar);
    }

    private dqfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqfu();
            }
            if (i2 == 4) {
                return new dqft();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqfu.class) {
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
