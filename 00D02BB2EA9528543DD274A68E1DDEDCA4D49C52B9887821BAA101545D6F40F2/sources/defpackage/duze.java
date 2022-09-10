package defpackage;
/* compiled from: PG */
/* renamed from: duze  reason: default package */
/* loaded from: classes6.dex */
public final class duze extends dsqw<duze, duzd> implements dssk {
    public static final duze d;
    private static volatile dssr<duze> f;
    public int a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        duze duzeVar = new duze();
        d = duzeVar;
        dsqw.cc(duze.class, duzeVar);
    }

    private duze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", dqjl.c(), "b", "c"});
            }
            if (i2 == 3) {
                return new duze();
            }
            if (i2 == 4) {
                return new duzd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duze> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duze.class) {
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
