package defpackage;
/* compiled from: PG */
/* renamed from: dqpo  reason: default package */
/* loaded from: classes6.dex */
public final class dqpo extends dsqw<dqpo, dqpn> implements dssk {
    public static final dqpo d;
    private static volatile dssr<dqpo> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dqpo dqpoVar = new dqpo();
        d = dqpoVar;
        dsqw.cc(dqpo.class, dqpoVar);
    }

    private dqpo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqpo();
            }
            if (i2 == 4) {
                return new dqpn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqpo.class) {
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
