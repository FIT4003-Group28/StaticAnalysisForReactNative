package defpackage;
/* compiled from: PG */
/* renamed from: djcp  reason: default package */
/* loaded from: classes6.dex */
public final class djcp extends dsqw<djcp, djco> implements dssk {
    public static final djcp e;
    private static volatile dssr<djcp> f;
    public int a;
    public String b;
    public dsrj<String> c;
    public String d;

    static {
        djcp djcpVar = new djcp();
        e = djcpVar;
        dsqw.cc(djcp.class, djcpVar);
    }

    private djcp() {
        dssu<Object> dssuVar = dssu.b;
        this.b = "";
        this.c = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001a\u0004ဈ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djcp();
            }
            if (i2 == 4) {
                return new djco();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djcp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djcp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
