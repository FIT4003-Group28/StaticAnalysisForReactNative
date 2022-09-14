package defpackage;
/* compiled from: PG */
/* renamed from: ailx  reason: default package */
/* loaded from: classes2.dex */
public final class ailx extends dsqw<ailx, ailw> implements dssk {
    public static final ailx e;
    private static volatile dssr<ailx> f;
    public int a;
    public long b;
    public String c = "";
    public dspd d = dspd.b;

    static {
        ailx ailxVar = new ailx();
        e = ailxVar;
        dsqw.cc(ailx.class, ailxVar);
    }

    private ailx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ailx();
            }
            if (i2 == 4) {
                return new ailw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ailx.class) {
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
