package defpackage;
/* compiled from: PG */
/* renamed from: dwse  reason: default package */
/* loaded from: classes6.dex */
public final class dwse extends dsqw<dwse, dwsd> implements dssk {
    public static final dwse c;
    private static volatile dssr<dwse> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dwse dwseVar = new dwse();
        c = dwseVar;
        dsqw.cc(dwse.class, dwseVar);
    }

    private dwse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwse();
            }
            if (i2 == 4) {
                return new dwsd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwse> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwse.class) {
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
