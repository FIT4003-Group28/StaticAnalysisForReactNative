package defpackage;
/* compiled from: PG */
/* renamed from: dnll  reason: default package */
/* loaded from: classes6.dex */
public final class dnll extends dsqw<dnll, dnlk> implements dssk {
    public static final dnll c;
    private static volatile dssr<dnll> d;
    public int a;
    public String b = "";

    static {
        dnll dnllVar = new dnll();
        c = dnllVar;
        dsqw.cc(dnll.class, dnllVar);
    }

    private dnll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnll();
            }
            if (i2 == 4) {
                return new dnlk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnll> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnll.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
