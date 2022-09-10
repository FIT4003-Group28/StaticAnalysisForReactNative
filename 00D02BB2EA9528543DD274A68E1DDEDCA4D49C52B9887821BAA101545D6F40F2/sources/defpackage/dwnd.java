package defpackage;
/* compiled from: PG */
/* renamed from: dwnd  reason: default package */
/* loaded from: classes6.dex */
public final class dwnd extends dsqw<dwnd, dwnc> implements dssk {
    public static final dwnd e;
    private static volatile dssr<dwnd> f;
    public int a;
    public String b = "";
    public dspd c = dspd.b;
    public dnwb d;

    static {
        dwnd dwndVar = new dwnd();
        e = dwndVar;
        dsqw.cc(dwnd.class, dwndVar);
    }

    private dwnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ည\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dwnd();
            }
            if (i2 == 4) {
                return new dwnc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwnd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwnd.class) {
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
