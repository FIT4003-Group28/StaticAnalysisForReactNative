package defpackage;
/* compiled from: PG */
/* renamed from: dpic  reason: default package */
/* loaded from: classes6.dex */
public final class dpic extends dsqw<dpic, dpib> implements dssk {
    public static final dpic f;
    private static volatile dssr<dpic> h;
    public int a;
    public Object c;
    public boolean d;
    public int b = 0;
    private byte g = 2;
    public dspd e = dspd.b;

    static {
        dpic dpicVar = new dpic();
        f = dpicVar;
        dsqw.cc(dpic.class, dpicVar);
    }

    private dpic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ဇ\u0003\u0003ည\u0004\u0004ᐼ\u0000\u0005ᐼ\u0000", new Object[]{"c", "b", "a", dpap.class, "d", "e", dpck.class, dpaf.class});
            }
            if (i2 == 3) {
                return new dpic();
            }
            if (i2 == 4) {
                return new dpib();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dpic> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpic.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
