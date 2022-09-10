package defpackage;
/* compiled from: PG */
/* renamed from: dilg  reason: default package */
/* loaded from: classes6.dex */
public final class dilg extends dsqw<dilg, dilf> implements dssk {
    public static final dilg c;
    private static volatile dssr<dilg> e;
    public dsrj<dpot> a = dssu.b;
    public dpql b;
    private int d;

    static {
        dilg dilgVar = new dilg();
        c = dilgVar;
        dsqw.cc(dilg.class, dilgVar);
    }

    private dilg() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0001", new Object[]{"d", "a", dpot.class, "b"});
            }
            if (i2 == 3) {
                return new dilg();
            }
            if (i2 == 4) {
                return new dilf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dilg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dilg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
