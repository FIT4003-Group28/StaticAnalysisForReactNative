package defpackage;
/* compiled from: PG */
/* renamed from: dhhn  reason: default package */
/* loaded from: classes6.dex */
public final class dhhn extends dsqw<dhhn, dhhm> implements dssk {
    public static final dhhn e;
    private static volatile dssr<dhhn> g;
    public int a;
    public dgrh b;
    public duhe c;
    private byte f = 2;
    public String d = "";

    static {
        dhhn dhhnVar = new dhhn();
        e = dhhnVar;
        dsqw.cc(dhhn.class, dhhnVar);
    }

    private dhhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhhn();
            }
            if (i2 == 4) {
                return new dhhm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhhn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhhn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
