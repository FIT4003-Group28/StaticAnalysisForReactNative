package defpackage;
/* compiled from: PG */
/* renamed from: dikm  reason: default package */
/* loaded from: classes6.dex */
public final class dikm extends dsqw<dikm, dikl> implements dssk {
    public static final dikm e;
    private static volatile dssr<dikm> g;
    public int a;
    public dnqh d;
    private byte f = 2;
    public String b = "";
    public dsrj<dqof> c = dssu.b;

    static {
        dikm dikmVar = new dikm();
        e = dikmVar;
        dsqw.cc(dikm.class, dikmVar);
    }

    private dikm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001b\u0003ᐉ\u0001", new Object[]{"a", "b", "c", dqof.class, "d"});
            }
            if (i2 == 3) {
                return new dikm();
            }
            if (i2 == 4) {
                return new dikl();
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
            dssr<dikm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dikm.class) {
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
