package defpackage;
/* compiled from: PG */
/* renamed from: tmt  reason: default package */
/* loaded from: classes7.dex */
public final class tmt extends dsqw<tmt, tms> implements dssk {
    public static final tmt e;
    private static volatile dssr<tmt> f;
    public int a;
    public long b;
    public String c = "";
    public dspd d = dspd.b;

    static {
        tmt tmtVar = new tmt();
        e = tmtVar;
        dsqw.cc(tmt.class, tmtVar);
    }

    private tmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new tmt();
            }
            if (i2 == 4) {
                return new tms();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tmt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (tmt.class) {
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
